// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.globalatmosphericmodel

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.globalatmosphericmodel.history.HistoryCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.history.HistoryQueryResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.history.HistoryWriteAodrParams
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/globalatmosphericmodel/history/count
        withRawResponse().count(params, requestOptions).parse()

    override fun query(
        params: HistoryQueryParams,
        requestOptions: RequestOptions,
    ): List<HistoryQueryResponse> =
        // get /udl/globalatmosphericmodel/history
        withRawResponse().query(params, requestOptions).parse()

    override fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions) {
        // get /udl/globalatmosphericmodel/history/aodr
        withRawResponse().writeAodr(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "history", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryHandler: Handler<List<HistoryQueryResponse>> =
            jsonHandler<List<HistoryQueryResponse>>(clientOptions.jsonMapper)

        override fun query(
            params: HistoryQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<HistoryQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "history")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val writeAodrHandler: Handler<Void?> = emptyHandler()

        override fun writeAodr(
            params: HistoryWriteAodrParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { writeAodrHandler.handle(it) }
            }
        }
    }
}
