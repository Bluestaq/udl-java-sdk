// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyRetrieveParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyTupleParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AircraftSortyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AircraftSortyService {

    private val withRawResponse: AircraftSortyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AircraftSortyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyService =
        AircraftSortyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AircraftSortyRetrieveParams,
        requestOptions: RequestOptions,
    ): AircraftsortieFull =
        // get /udl/aircraftsortie/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AircraftSortyUpdateParams, requestOptions: RequestOptions) {
        // put /udl/aircraftsortie/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun queryhelp(
        params: AircraftSortyQueryhelpParams,
        requestOptions: RequestOptions,
    ): AircraftSortyQueryhelpResponse =
        // get /udl/aircraftsortie/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: AircraftSortyTupleParams,
        requestOptions: RequestOptions,
    ): List<AircraftsortieFull> =
        // get /udl/aircraftsortie/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AircraftSortyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftSortyService.WithRawResponse =
            AircraftSortyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AircraftsortieFull> =
            jsonHandler<AircraftsortieFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AircraftSortyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftsortieFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: AircraftSortyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AircraftSortyQueryhelpResponse> =
            jsonHandler<AircraftSortyQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AircraftSortyQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftSortyQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryhelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<AircraftsortieFull>> =
            jsonHandler<List<AircraftsortieFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AircraftSortyTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AircraftsortieFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraftsortie", "tuple")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
