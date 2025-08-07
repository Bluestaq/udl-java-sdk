// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftsortieAbridged
import java.util.function.Consumer

class AircraftSortieServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AircraftSortieService {

    private val withRawResponse: AircraftSortieService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AircraftSortieService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortieService =
        AircraftSortieServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AircraftSortieCreateParams, requestOptions: RequestOptions) {
        // post /udl/aircraftsortie
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: AircraftSortieListParams,
        requestOptions: RequestOptions,
    ): AircraftSortieListPage =
        // get /udl/aircraftsortie
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AircraftSortieCountParams, requestOptions: RequestOptions): String =
        // get /udl/aircraftsortie/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: AircraftSortieCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/aircraftsortie/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun historyAodr(
        params: AircraftSortieHistoryAodrParams,
        requestOptions: RequestOptions,
    ) {
        // get /udl/aircraftsortie/history/aodr
        withRawResponse().historyAodr(params, requestOptions)
    }

    override fun historyCount(
        params: AircraftSortieHistoryCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/aircraftsortie/history/count
        withRawResponse().historyCount(params, requestOptions).parse()

    override fun historyQuery(
        params: AircraftSortieHistoryQueryParams,
        requestOptions: RequestOptions,
    ): List<AircraftsortieFull> =
        // get /udl/aircraftsortie/history
        withRawResponse().historyQuery(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AircraftSortieService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortieService.WithRawResponse =
            AircraftSortieServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AircraftSortieCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AircraftsortieAbridged>> =
            jsonHandler<List<AircraftsortieAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AircraftSortieListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftSortieListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        AircraftSortieListPage.builder()
                            .service(AircraftSortieServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AircraftSortieCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: AircraftSortieCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val historyAodrHandler: Handler<Void?> = emptyHandler()

        override fun historyAodr(
            params: AircraftSortieHistoryAodrParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { historyAodrHandler.handle(it) }
            }
        }

        private val historyCountHandler: Handler<String> = stringHandler()

        override fun historyCount(
            params: AircraftSortieHistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { historyCountHandler.handle(it) }
            }
        }

        private val historyQueryHandler: Handler<List<AircraftsortieFull>> =
            jsonHandler<List<AircraftsortieFull>>(clientOptions.jsonMapper)

        override fun historyQuery(
            params: AircraftSortieHistoryQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AircraftsortieFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "history")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
