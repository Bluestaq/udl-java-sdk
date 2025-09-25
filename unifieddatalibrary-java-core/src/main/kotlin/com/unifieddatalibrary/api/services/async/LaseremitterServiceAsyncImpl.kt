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
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCountParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCreateParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterDeleteParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListPageAsync
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterUpdateParams
import com.unifieddatalibrary.api.services.async.laseremitter.StagingServiceAsync
import com.unifieddatalibrary.api.services.async.laseremitter.StagingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaseremitterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LaseremitterServiceAsync {

    private val withRawResponse: LaseremitterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val staging: StagingServiceAsync by lazy { StagingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LaseremitterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaseremitterServiceAsync =
        LaseremitterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun staging(): StagingServiceAsync = staging

    override fun create(
        params: LaseremitterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/laseremitter
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: LaseremitterUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/laseremitter/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: LaseremitterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaseremitterListPageAsync> =
        // get /udl/laseremitter
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LaseremitterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/laseremitter/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: LaseremitterCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/laseremitter/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LaseremitterGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaseremitterGetResponse> =
        // get /udl/laseremitter/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: LaseremitterQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaseremitterQueryhelpResponse> =
        // get /udl/laseremitter/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: LaseremitterTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<LaseremitterTupleResponse>> =
        // get /udl/laseremitter/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaseremitterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val staging: StagingServiceAsync.WithRawResponse by lazy {
            StagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaseremitterServiceAsync.WithRawResponse =
            LaseremitterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun staging(): StagingServiceAsync.WithRawResponse = staging

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaseremitterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter")
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
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
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

        private val listHandler: Handler<List<LaseremitterListResponse>> =
            jsonHandler<List<LaseremitterListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaseremitterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaseremitterListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter")
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
                                LaseremitterListPageAsync.builder()
                                    .service(LaseremitterServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LaseremitterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: LaseremitterCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "count")
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

        private val getHandler: Handler<LaseremitterGetResponse> =
            jsonHandler<LaseremitterGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaseremitterGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaseremitterGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaseremitterQueryhelpResponse> =
            jsonHandler<LaseremitterQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaseremitterQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaseremitterQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "queryhelp")
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

        private val tupleHandler: Handler<List<LaseremitterTupleResponse>> =
            jsonHandler<List<LaseremitterTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaseremitterTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<LaseremitterTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "tuple")
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
