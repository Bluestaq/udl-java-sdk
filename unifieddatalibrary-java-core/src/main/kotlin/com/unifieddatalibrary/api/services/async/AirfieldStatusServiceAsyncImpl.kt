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
import com.unifieddatalibrary.api.models.AirfieldstatusFull
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCountParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusDeleteParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListPageAsync
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusRetrieveParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusTupleParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusUpdateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldstatusAbridged
import com.unifieddatalibrary.api.services.async.airfieldstatus.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.airfieldstatus.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirfieldStatusServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AirfieldStatusServiceAsync {

    private val withRawResponse: AirfieldStatusServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AirfieldStatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AirfieldStatusServiceAsync =
        AirfieldStatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: AirfieldStatusCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/airfieldstatus
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: AirfieldStatusRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirfieldstatusFull> =
        // get /udl/airfieldstatus/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AirfieldStatusUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/airfieldstatus/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: AirfieldStatusListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirfieldStatusListPageAsync> =
        // get /udl/airfieldstatus
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AirfieldStatusDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/airfieldstatus/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: AirfieldStatusCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/airfieldstatus/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: AirfieldStatusQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirfieldStatusQueryhelpResponse> =
        // get /udl/airfieldstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: AirfieldStatusTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AirfieldstatusFull>> =
        // get /udl/airfieldstatus/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirfieldStatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirfieldStatusServiceAsync.WithRawResponse =
            AirfieldStatusServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirfieldStatusCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus")
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

        private val retrieveHandler: Handler<AirfieldstatusFull> =
            jsonHandler<AirfieldstatusFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirfieldStatusRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirfieldstatusFull>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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
            params: AirfieldStatusUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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

        private val listHandler: Handler<List<AirfieldstatusAbridged>> =
            jsonHandler<List<AirfieldstatusAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirfieldStatusListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirfieldStatusListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus")
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
                                AirfieldStatusListPageAsync.builder()
                                    .service(AirfieldStatusServiceAsyncImpl(clientOptions))
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
            params: AirfieldStatusDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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
            params: AirfieldStatusCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", "count")
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

        private val queryhelpHandler: Handler<AirfieldStatusQueryhelpResponse> =
            jsonHandler<AirfieldStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AirfieldStatusQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirfieldStatusQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<AirfieldstatusFull>> =
            jsonHandler<List<AirfieldstatusFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirfieldStatusTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AirfieldstatusFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldstatus", "tuple")
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
