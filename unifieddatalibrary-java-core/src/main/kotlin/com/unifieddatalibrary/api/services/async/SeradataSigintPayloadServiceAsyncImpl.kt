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
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListPageAsync
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataSigintPayloadServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SeradataSigintPayloadServiceAsync {

    private val withRawResponse: SeradataSigintPayloadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SeradataSigintPayloadServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SeradataSigintPayloadServiceAsync =
        SeradataSigintPayloadServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SeradataSigintPayloadCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/seradatasigintpayload
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: SeradataSigintPayloadUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/seradatasigintpayload/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: SeradataSigintPayloadListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataSigintPayloadListPageAsync> =
        // get /udl/seradatasigintpayload
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SeradataSigintPayloadDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/seradatasigintpayload/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: SeradataSigintPayloadCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/seradatasigintpayload/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SeradataSigintPayloadGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataSigintPayloadGetResponse> =
        // get /udl/seradatasigintpayload/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: SeradataSigintPayloadQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeradataSigintPayloadQueryhelpResponse> =
        // get /udl/seradatasigintpayload/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: SeradataSigintPayloadTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SeradataSigintPayloadTupleResponse>> =
        // get /udl/seradatasigintpayload/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SeradataSigintPayloadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeradataSigintPayloadServiceAsync.WithRawResponse =
            SeradataSigintPayloadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SeradataSigintPayloadCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload")
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
            params: SeradataSigintPayloadUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
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

        private val listHandler: Handler<List<SeradataSigintPayloadListResponse>> =
            jsonHandler<List<SeradataSigintPayloadListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SeradataSigintPayloadListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataSigintPayloadListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload")
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
                                SeradataSigintPayloadListPageAsync.builder()
                                    .service(SeradataSigintPayloadServiceAsyncImpl(clientOptions))
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
            params: SeradataSigintPayloadDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
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
            params: SeradataSigintPayloadCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "count")
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

        private val getHandler: Handler<SeradataSigintPayloadGetResponse> =
            jsonHandler<SeradataSigintPayloadGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SeradataSigintPayloadGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataSigintPayloadGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeradataSigintPayloadQueryhelpResponse> =
            jsonHandler<SeradataSigintPayloadQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SeradataSigintPayloadQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeradataSigintPayloadQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "queryhelp")
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

        private val tupleHandler: Handler<List<SeradataSigintPayloadTupleResponse>> =
            jsonHandler<List<SeradataSigintPayloadTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SeradataSigintPayloadTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SeradataSigintPayloadTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "tuple")
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
