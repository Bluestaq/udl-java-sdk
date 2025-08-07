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
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCountParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateBulkParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionGetParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionGetResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionListPageAsync
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionListParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionListResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionQueryhelpParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionQueryhelpResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionTupleParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionTupleResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NavigationalObstructionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    NavigationalObstructionServiceAsync {

    private val withRawResponse: NavigationalObstructionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NavigationalObstructionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NavigationalObstructionServiceAsync =
        NavigationalObstructionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: NavigationalObstructionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/navigationalobstruction
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: NavigationalObstructionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/navigationalobstruction/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: NavigationalObstructionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NavigationalObstructionListPageAsync> =
        // get /udl/navigationalobstruction
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: NavigationalObstructionCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/navigationalobstruction/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: NavigationalObstructionCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/navigationalobstruction/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(
        params: NavigationalObstructionGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NavigationalObstructionGetResponse> =
        // get /udl/navigationalobstruction/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: NavigationalObstructionQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NavigationalObstructionQueryhelpResponse> =
        // get /udl/navigationalobstruction/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: NavigationalObstructionTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<NavigationalObstructionTupleResponse>> =
        // get /udl/navigationalobstruction/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NavigationalObstructionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationalObstructionServiceAsync.WithRawResponse =
            NavigationalObstructionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: NavigationalObstructionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction")
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
            params: NavigationalObstructionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", params._pathParam(0))
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

        private val listHandler: Handler<List<NavigationalObstructionListResponse>> =
            jsonHandler<List<NavigationalObstructionListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: NavigationalObstructionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NavigationalObstructionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction")
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
                                NavigationalObstructionListPageAsync.builder()
                                    .service(NavigationalObstructionServiceAsyncImpl(clientOptions))
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
            params: NavigationalObstructionCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", "count")
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
            params: NavigationalObstructionCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", "createBulk")
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

        private val getHandler: Handler<NavigationalObstructionGetResponse> =
            jsonHandler<NavigationalObstructionGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: NavigationalObstructionGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NavigationalObstructionGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", params._pathParam(0))
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

        private val queryhelpHandler: Handler<NavigationalObstructionQueryhelpResponse> =
            jsonHandler<NavigationalObstructionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: NavigationalObstructionQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NavigationalObstructionQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", "queryhelp")
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

        private val tupleHandler: Handler<List<NavigationalObstructionTupleResponse>> =
            jsonHandler<List<NavigationalObstructionTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: NavigationalObstructionTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<NavigationalObstructionTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigationalobstruction", "tuple")
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
