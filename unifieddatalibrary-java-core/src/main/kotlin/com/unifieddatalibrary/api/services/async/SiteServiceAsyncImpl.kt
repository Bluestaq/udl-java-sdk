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
import com.unifieddatalibrary.api.models.site.SiteCountParams
import com.unifieddatalibrary.api.models.site.SiteCreateParams
import com.unifieddatalibrary.api.models.site.SiteGetParams
import com.unifieddatalibrary.api.models.site.SiteGetResponse
import com.unifieddatalibrary.api.models.site.SiteListPageAsync
import com.unifieddatalibrary.api.models.site.SiteListParams
import com.unifieddatalibrary.api.models.site.SiteListResponse
import com.unifieddatalibrary.api.models.site.SiteQueryhelpParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpResponse
import com.unifieddatalibrary.api.models.site.SiteTupleParams
import com.unifieddatalibrary.api.models.site.SiteTupleResponse
import com.unifieddatalibrary.api.models.site.SiteUpdateParams
import com.unifieddatalibrary.api.services.async.site.OperationServiceAsync
import com.unifieddatalibrary.api.services.async.site.OperationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SiteServiceAsync {

    private val withRawResponse: SiteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val operations: OperationServiceAsync by lazy {
        OperationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SiteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteServiceAsync =
        SiteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun operations(): OperationServiceAsync = operations

    override fun create(
        params: SiteCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/site
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: SiteUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/site/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: SiteListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiteListPageAsync> =
        // get /udl/site
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: SiteCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/site/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SiteGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiteGetResponse> =
        // get /udl/site/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: SiteQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiteQueryhelpResponse> =
        // get /udl/site/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: SiteTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SiteTupleResponse>> =
        // get /udl/site/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val operations: OperationServiceAsync.WithRawResponse by lazy {
            OperationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteServiceAsync.WithRawResponse =
            SiteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun operations(): OperationServiceAsync.WithRawResponse = operations

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SiteCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: SiteUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<List<SiteListResponse>> =
            jsonHandler<List<SiteListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SiteListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiteListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site")
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
                                SiteListPageAsync.builder()
                                    .service(SiteServiceAsyncImpl(clientOptions))
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
            params: SiteCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site", "count")
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

        private val getHandler: Handler<SiteGetResponse> =
            jsonHandler<SiteGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SiteGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiteGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SiteQueryhelpResponse> =
            jsonHandler<SiteQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SiteQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiteQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site", "queryhelp")
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

        private val tupleHandler: Handler<List<SiteTupleResponse>> =
            jsonHandler<List<SiteTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SiteTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SiteTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "site", "tuple")
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
