// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListPageAsync
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftsortieAbridged
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AircraftSortieServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AircraftSortieServiceAsync {

    private val withRawResponse: AircraftSortieServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AircraftSortieServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AircraftSortieServiceAsync =
        AircraftSortieServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AircraftSortieCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/aircraftsortie
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: AircraftSortieListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AircraftSortieListPageAsync> =
        // get /udl/aircraftsortie
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: AircraftSortieCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/aircraftsortie/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: AircraftSortieCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/aircraftsortie/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun historyAodr(
        params: AircraftSortieHistoryAodrParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /udl/aircraftsortie/history/aodr
        withRawResponse().historyAodr(params, requestOptions).thenAccept {}

    override fun historyCount(
        params: AircraftSortieHistoryCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/aircraftsortie/history/count
        withRawResponse().historyCount(params, requestOptions).thenApply { it.parse() }

    override fun historyQuery(
        params: AircraftSortieHistoryQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AircraftsortieFull>> =
        // get /udl/aircraftsortie/history
        withRawResponse().historyQuery(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AircraftSortieServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortieServiceAsync.WithRawResponse =
            AircraftSortieServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AircraftSortieCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
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

        private val listHandler: Handler<List<AircraftsortieAbridged>> =
            jsonHandler<List<AircraftsortieAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AircraftSortieListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AircraftSortieListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
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
                                AircraftSortieListPageAsync.builder()
                                    .service(AircraftSortieServiceAsyncImpl(clientOptions))
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
            params: AircraftSortieCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "count")
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
            params: AircraftSortieCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "createBulk")
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

        private val historyAodrHandler: Handler<Void?> = emptyHandler()

        override fun historyAodr(
            params: AircraftSortieHistoryAodrParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history", "aodr")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { historyAodrHandler.handle(it) }
                    }
                }
        }

        private val historyCountHandler: Handler<String> = stringHandler()

        override fun historyCount(
            params: AircraftSortieHistoryCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history", "count")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { historyCountHandler.handle(it) }
                    }
                }
        }

        private val historyQueryHandler: Handler<List<AircraftsortieFull>> =
            jsonHandler<List<AircraftsortieFull>>(clientOptions.jsonMapper)

        override fun historyQuery(
            params: AircraftSortieHistoryQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { historyQueryHandler.handle(it) }
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
