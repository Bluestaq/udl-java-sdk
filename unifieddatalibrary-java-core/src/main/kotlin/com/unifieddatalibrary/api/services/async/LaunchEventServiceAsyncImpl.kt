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
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCountParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateBulkParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListPageAsync
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.launchevent.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.launchevent.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LaunchEventServiceAsync {

    private val withRawResponse: LaunchEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LaunchEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchEventServiceAsync =
        LaunchEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: LaunchEventCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/launchevent
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: LaunchEventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchEventListPageAsync> =
        // get /udl/launchevent
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: LaunchEventCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/launchevent/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: LaunchEventCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/launchevent/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(
        params: LaunchEventGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchEventGetResponse> =
        // get /udl/launchevent/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: LaunchEventQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchEventQueryhelpResponse> =
        // get /udl/launchevent/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: LaunchEventTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<LaunchEventTupleResponse>> =
        // get /udl/launchevent/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(
        params: LaunchEventUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-launchevent
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaunchEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchEventServiceAsync.WithRawResponse =
            LaunchEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaunchEventCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent")
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

        private val listHandler: Handler<List<LaunchEventListResponse>> =
            jsonHandler<List<LaunchEventListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaunchEventListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchEventListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent")
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
                                LaunchEventListPageAsync.builder()
                                    .service(LaunchEventServiceAsyncImpl(clientOptions))
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
            params: LaunchEventCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent", "count")
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
            params: LaunchEventCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent", "createBulk")
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

        private val getHandler: Handler<LaunchEventGetResponse> =
            jsonHandler<LaunchEventGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaunchEventGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchEventGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchEventQueryhelpResponse> =
            jsonHandler<LaunchEventQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaunchEventQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchEventQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchEventTupleResponse>> =
            jsonHandler<List<LaunchEventTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaunchEventTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<LaunchEventTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchevent", "tuple")
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
            params: LaunchEventUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-launchevent")
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
