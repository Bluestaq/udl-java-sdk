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
import com.unifieddatalibrary.api.models.AirloadplanFull
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCountParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCreateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanDeleteParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListPageAsync
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanRetrieveParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanTupleParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanUpdateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadplanAbridged
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirloadPlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AirloadPlanServiceAsync {

    private val withRawResponse: AirloadPlanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AirloadPlanServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanServiceAsync =
        AirloadPlanServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AirloadPlanCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/airloadplan
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: AirloadPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirloadplanFull> =
        // get /udl/airloadplan/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AirloadPlanUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/airloadplan/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: AirloadPlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirloadPlanListPageAsync> =
        // get /udl/airloadplan
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AirloadPlanDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/airloadplan/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: AirloadPlanCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/airloadplan/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: AirloadPlanQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirloadPlanQueryhelpResponse> =
        // get /udl/airloadplan/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: AirloadPlanTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AirloadplanFull>> =
        // get /udl/airloadplan/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirloadPlanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirloadPlanServiceAsync.WithRawResponse =
            AirloadPlanServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirloadPlanCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan")
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

        private val retrieveHandler: Handler<AirloadplanFull> =
            jsonHandler<AirloadplanFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirloadPlanRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirloadplanFull>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: AirloadPlanUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", params._pathParam(0))
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

        private val listHandler: Handler<List<AirloadplanAbridged>> =
            jsonHandler<List<AirloadplanAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirloadPlanListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirloadPlanListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan")
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
                                AirloadPlanListPageAsync.builder()
                                    .service(AirloadPlanServiceAsyncImpl(clientOptions))
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
            params: AirloadPlanDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", params._pathParam(0))
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
            params: AirloadPlanCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "count")
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

        private val queryhelpHandler: Handler<AirloadPlanQueryhelpResponse> =
            jsonHandler<AirloadPlanQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AirloadPlanQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirloadPlanQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "queryhelp")
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

        private val tupleHandler: Handler<List<AirloadplanFull>> =
            jsonHandler<List<AirloadplanFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirloadPlanTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AirloadplanFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "tuple")
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
