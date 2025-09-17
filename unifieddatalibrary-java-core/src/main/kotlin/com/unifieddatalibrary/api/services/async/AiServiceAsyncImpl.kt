// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.AisFull
import com.unifieddatalibrary.api.models.ais.AiCountParams
import com.unifieddatalibrary.api.models.ais.AiCreateBulkParams
import com.unifieddatalibrary.api.models.ais.AiListPageAsync
import com.unifieddatalibrary.api.models.ais.AiListParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpParams
import com.unifieddatalibrary.api.models.ais.AiQueryhelpResponse
import com.unifieddatalibrary.api.models.ais.AiTupleParams
import com.unifieddatalibrary.api.models.ais.AisAbridged
import com.unifieddatalibrary.api.services.async.ais.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ais.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AiServiceAsync {

    private val withRawResponse: AiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync =
        AiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(
        params: AiListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiListPageAsync> =
        // get /udl/ais
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: AiCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/ais/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: AiCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/ais/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(
        params: AiQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiQueryhelpResponse> =
        // get /udl/ais/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: AiTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AisFull>> =
        // get /udl/ais/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiServiceAsync.WithRawResponse =
            AiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<AisAbridged>> =
            jsonHandler<List<AisAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AiListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                AiListPageAsync.builder()
                                    .service(AiServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AiCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "count")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { countHandler.handle(it) }
                    }
                }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: AiCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createBulkHandler.handle(it) }
                    }
                }
        }

        private val queryhelpHandler: Handler<AiQueryhelpResponse> =
            jsonHandler<AiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AiQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryhelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tupleHandler: Handler<List<AisFull>> =
            jsonHandler<List<AisFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AiTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AisFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "tuple")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
