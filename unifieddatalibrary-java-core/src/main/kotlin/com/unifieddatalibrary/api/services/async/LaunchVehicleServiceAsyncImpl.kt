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
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCountParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCreateParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleDeleteParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListPageAsync
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchVehicleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LaunchVehicleServiceAsync {

    private val withRawResponse: LaunchVehicleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LaunchVehicleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleServiceAsync =
        LaunchVehicleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LaunchVehicleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/launchvehicle
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: LaunchVehicleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/launchvehicle/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: LaunchVehicleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchVehicleListPageAsync> =
        // get /udl/launchvehicle
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LaunchVehicleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/launchvehicle/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: LaunchVehicleCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/launchvehicle/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LaunchVehicleGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchVehicleGetResponse> =
        // get /udl/launchvehicle/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: LaunchVehicleQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchVehicleQueryhelpResponse> =
        // get /udl/launchvehicle/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: LaunchVehicleTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<LaunchVehicleTupleResponse>> =
        // get /udl/launchvehicle/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaunchVehicleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchVehicleServiceAsync.WithRawResponse =
            LaunchVehicleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaunchVehicleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle")
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
            params: LaunchVehicleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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

        private val listHandler: Handler<List<LaunchVehicleListResponse>> =
            jsonHandler<List<LaunchVehicleListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaunchVehicleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchVehicleListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle")
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
                                LaunchVehicleListPageAsync.builder()
                                    .service(LaunchVehicleServiceAsyncImpl(clientOptions))
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
            params: LaunchVehicleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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
            params: LaunchVehicleCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", "count")
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

        private val getHandler: Handler<LaunchVehicleGetResponse> =
            jsonHandler<LaunchVehicleGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaunchVehicleGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchVehicleQueryhelpResponse> =
            jsonHandler<LaunchVehicleQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaunchVehicleQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchVehicleQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchVehicleTupleResponse>> =
            jsonHandler<List<LaunchVehicleTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaunchVehicleTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<LaunchVehicleTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchvehicle", "tuple")
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
