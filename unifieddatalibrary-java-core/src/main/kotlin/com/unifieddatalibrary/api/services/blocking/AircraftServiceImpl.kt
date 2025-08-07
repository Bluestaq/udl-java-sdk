// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.AircraftFull
import com.unifieddatalibrary.api.models.aircraft.AircraftAbridged
import com.unifieddatalibrary.api.models.aircraft.AircraftCountParams
import com.unifieddatalibrary.api.models.aircraft.AircraftCreateParams
import com.unifieddatalibrary.api.models.aircraft.AircraftListPage
import com.unifieddatalibrary.api.models.aircraft.AircraftListParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpParams
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraft.AircraftRetrieveParams
import com.unifieddatalibrary.api.models.aircraft.AircraftTupleQueryParams
import com.unifieddatalibrary.api.models.aircraft.AircraftUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AircraftServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AircraftService {

    private val withRawResponse: AircraftService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AircraftService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftService =
        AircraftServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AircraftCreateParams, requestOptions: RequestOptions) {
        // post /udl/aircraft
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AircraftRetrieveParams,
        requestOptions: RequestOptions,
    ): AircraftFull =
        // get /udl/aircraft/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AircraftUpdateParams, requestOptions: RequestOptions) {
        // put /udl/aircraft/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: AircraftListParams,
        requestOptions: RequestOptions,
    ): AircraftListPage =
        // get /udl/aircraft
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AircraftCountParams, requestOptions: RequestOptions): String =
        // get /udl/aircraft/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: AircraftQueryhelpParams,
        requestOptions: RequestOptions,
    ): AircraftQueryhelpResponse =
        // get /udl/aircraft/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tupleQuery(
        params: AircraftTupleQueryParams,
        requestOptions: RequestOptions,
    ): List<AircraftFull> =
        // get /udl/aircraft/tuple
        withRawResponse().tupleQuery(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AircraftService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AircraftService.WithRawResponse =
            AircraftServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AircraftCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AircraftFull> =
            jsonHandler<AircraftFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AircraftRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft", params._pathParam(0))
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
            params: AircraftUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AircraftAbridged>> =
            jsonHandler<List<AircraftAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AircraftListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft")
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
                        AircraftListPage.builder()
                            .service(AircraftServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AircraftCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AircraftQueryhelpResponse> =
            jsonHandler<AircraftQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AircraftQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AircraftQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft", "queryhelp")
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

        private val tupleQueryHandler: Handler<List<AircraftFull>> =
            jsonHandler<List<AircraftFull>>(clientOptions.jsonMapper)

        override fun tupleQuery(
            params: AircraftTupleQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AircraftFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "aircraft", "tuple")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { tupleQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
