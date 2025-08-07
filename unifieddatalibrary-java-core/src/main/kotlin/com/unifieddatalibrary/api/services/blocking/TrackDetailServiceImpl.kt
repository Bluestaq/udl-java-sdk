// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCountParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCreateBulkParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListPage
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailTupleParams
import com.unifieddatalibrary.api.models.trackdetails.history.TrackDetailsFull
import com.unifieddatalibrary.api.services.blocking.trackdetails.HistoryService
import com.unifieddatalibrary.api.services.blocking.trackdetails.HistoryServiceImpl
import java.util.function.Consumer

class TrackDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TrackDetailService {

    private val withRawResponse: TrackDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): TrackDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailService =
        TrackDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(
        params: TrackDetailListParams,
        requestOptions: RequestOptions,
    ): TrackDetailListPage =
        // get /udl/trackdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: TrackDetailCountParams, requestOptions: RequestOptions): String =
        // get /udl/trackdetails/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: TrackDetailCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/trackdetails/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: TrackDetailQueryhelpParams,
        requestOptions: RequestOptions,
    ): TrackDetailQueryhelpResponse =
        // get /udl/trackdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: TrackDetailTupleParams,
        requestOptions: RequestOptions,
    ): List<TrackDetailsFull> =
        // get /udl/trackdetails/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TrackDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TrackDetailService.WithRawResponse =
            TrackDetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<TrackDetailListResponse>> =
            jsonHandler<List<TrackDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TrackDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackDetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "trackdetails")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        TrackDetailListPage.builder()
                            .service(TrackDetailServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: TrackDetailCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "trackdetails", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: TrackDetailCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "trackdetails", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<TrackDetailQueryhelpResponse> =
            jsonHandler<TrackDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: TrackDetailQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackDetailQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "trackdetails", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryhelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<TrackDetailsFull>> =
            jsonHandler<List<TrackDetailsFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: TrackDetailTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TrackDetailsFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "trackdetails", "tuple")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { tupleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
