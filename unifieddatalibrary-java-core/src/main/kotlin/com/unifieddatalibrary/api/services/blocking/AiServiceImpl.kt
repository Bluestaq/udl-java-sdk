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
import com.unifieddatalibrary.api.models.AisFull
import com.unifieddatalibrary.api.models.ais.AiCountParams
import com.unifieddatalibrary.api.models.ais.AiCreateBulkParams
import com.unifieddatalibrary.api.models.ais.AiHistoryCountParams
import com.unifieddatalibrary.api.models.ais.AiListPage
import com.unifieddatalibrary.api.models.ais.AiListParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpResponse
import com.unifieddatalibrary.api.models.ais.AiTupleParams
import com.unifieddatalibrary.api.models.ais.AisAbridged
import com.unifieddatalibrary.api.services.blocking.ais.HistoryService
import com.unifieddatalibrary.api.services.blocking.ais.HistoryServiceImpl
import java.util.function.Consumer

class AiServiceImpl internal constructor(private val clientOptions: ClientOptions) : AiService {

    private val withRawResponse: AiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService =
        AiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: AiListParams, requestOptions: RequestOptions): AiListPage =
        // get /udl/ais
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AiCountParams, requestOptions: RequestOptions): String =
        // get /udl/ais/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: AiCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/ais/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun historyCount(
        params: AiHistoryCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/ais/history/count
        withRawResponse().historyCount(params, requestOptions).parse()

    override fun queryhelp(
        params: AiQueryhelpParams,
        requestOptions: RequestOptions,
    ): AiQueryhelpResponse =
        // get /udl/ais/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AiTupleParams, requestOptions: RequestOptions): List<AisFull> =
        // get /udl/ais/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiService.WithRawResponse =
            AiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<AisAbridged>> =
            jsonHandler<List<AisAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AiListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais")
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
                        AiListPage.builder()
                            .service(AiServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AiCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "count")
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
            params: AiCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val historyCountHandler: Handler<String> = stringHandler()

        override fun historyCount(
            params: AiHistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "history", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { historyCountHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AiQueryhelpResponse> =
            jsonHandler<AiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AiQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "queryhelp")
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

        private val tupleHandler: Handler<List<AisFull>> =
            jsonHandler<List<AisFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AiTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AisFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "tuple")
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
