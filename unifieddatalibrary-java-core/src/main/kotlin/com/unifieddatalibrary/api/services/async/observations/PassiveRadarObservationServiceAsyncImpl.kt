// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

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
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCountParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCreateParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationFileCreateParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationGetParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationGetResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListPageAsync
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleResponse
import com.unifieddatalibrary.api.services.async.observations.passiveradarobservation.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.observations.passiveradarobservation.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PassiveRadarObservationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PassiveRadarObservationServiceAsync {

    private val withRawResponse: PassiveRadarObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PassiveRadarObservationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PassiveRadarObservationServiceAsync =
        PassiveRadarObservationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: PassiveRadarObservationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/passiveradarobservation
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: PassiveRadarObservationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassiveRadarObservationListPageAsync> =
        // get /udl/passiveradarobservation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: PassiveRadarObservationCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/passiveradarobservation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: PassiveRadarObservationCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/passiveradarobservation/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun fileCreate(
        params: PassiveRadarObservationFileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-passiveradar
        withRawResponse().fileCreate(params, requestOptions).thenAccept {}

    override fun get(
        params: PassiveRadarObservationGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassiveRadarObservationGetResponse> =
        // get /udl/passiveradarobservation/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: PassiveRadarObservationQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassiveRadarObservationQueryhelpResponse> =
        // get /udl/passiveradarobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: PassiveRadarObservationTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PassiveRadarObservationTupleResponse>> =
        // get /udl/passiveradarobservation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PassiveRadarObservationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PassiveRadarObservationServiceAsync.WithRawResponse =
            PassiveRadarObservationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: PassiveRadarObservationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation")
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

        private val listHandler: Handler<List<PassiveRadarObservationListResponse>> =
            jsonHandler<List<PassiveRadarObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: PassiveRadarObservationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation")
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
                                PassiveRadarObservationListPageAsync.builder()
                                    .service(PassiveRadarObservationServiceAsyncImpl(clientOptions))
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
            params: PassiveRadarObservationCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation", "count")
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
            params: PassiveRadarObservationCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation", "createBulk")
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

        private val fileCreateHandler: Handler<Void?> = emptyHandler()

        override fun fileCreate(
            params: PassiveRadarObservationFileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-passiveradar")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { fileCreateHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PassiveRadarObservationGetResponse> =
            jsonHandler<PassiveRadarObservationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PassiveRadarObservationGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation", params._pathParam(0))
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

        private val queryhelpHandler: Handler<PassiveRadarObservationQueryhelpResponse> =
            jsonHandler<PassiveRadarObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: PassiveRadarObservationQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<PassiveRadarObservationTupleResponse>> =
            jsonHandler<List<PassiveRadarObservationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: PassiveRadarObservationTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PassiveRadarObservationTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "passiveradarobservation", "tuple")
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
