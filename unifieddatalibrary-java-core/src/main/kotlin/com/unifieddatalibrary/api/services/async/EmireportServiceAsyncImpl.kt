// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
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
import com.unifieddatalibrary.api.models.emireport.EmireportCountParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateBulkParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateParams
import com.unifieddatalibrary.api.models.emireport.EmireportGetParams
import com.unifieddatalibrary.api.models.emireport.EmireportGetResponse
import com.unifieddatalibrary.api.models.emireport.EmireportListPageAsync
import com.unifieddatalibrary.api.models.emireport.EmireportListParams
import com.unifieddatalibrary.api.models.emireport.EmireportListResponse
import com.unifieddatalibrary.api.models.emireport.EmireportQueryhelpParams
import com.unifieddatalibrary.api.models.emireport.EmireportQueryhelpResponse
import com.unifieddatalibrary.api.models.emireport.EmireportTupleParams
import com.unifieddatalibrary.api.models.emireport.EmireportTupleResponse
import com.unifieddatalibrary.api.models.emireport.EmireportUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.emireport.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.emireport.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmireportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmireportServiceAsync {

    private val withRawResponse: EmireportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmireportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmireportServiceAsync =
        EmireportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: EmireportCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/emireport
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: EmireportListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmireportListPageAsync> =
        // get /udl/emireport
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: EmireportCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/emireport/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: EmireportCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/emireport/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(
        params: EmireportGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmireportGetResponse> =
        // get /udl/emireport/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: EmireportQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmireportQueryhelpResponse> =
        // get /udl/emireport/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: EmireportTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<EmireportTupleResponse>> =
        // get /udl/emireport/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(
        params: EmireportUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-emireport
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmireportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmireportServiceAsync.WithRawResponse =
            EmireportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EmireportCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<List<EmireportListResponse>> =
            jsonHandler<List<EmireportListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: EmireportListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmireportListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport")
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
                                EmireportListPageAsync.builder()
                                    .service(EmireportServiceAsyncImpl(clientOptions))
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
            params: EmireportCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport", "count")
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
            params: EmireportCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport", "createBulk")
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

        private val getHandler: Handler<EmireportGetResponse> =
            jsonHandler<EmireportGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EmireportGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmireportGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryhelpHandler: Handler<EmireportQueryhelpResponse> =
            jsonHandler<EmireportQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EmireportQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmireportQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport", "queryhelp")
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

        private val tupleHandler: Handler<List<EmireportTupleResponse>> =
            jsonHandler<List<EmireportTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EmireportTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<EmireportTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "emireport", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: EmireportUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-emireport")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unvalidatedPublishHandler.handle(it) }
                    }
                }
        }
    }
}
