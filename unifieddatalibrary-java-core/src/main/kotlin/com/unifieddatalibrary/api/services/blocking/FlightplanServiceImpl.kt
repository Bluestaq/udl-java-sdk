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
import com.unifieddatalibrary.api.models.FlightPlanFull
import com.unifieddatalibrary.api.models.flightplan.FlightPlanAbridged
import com.unifieddatalibrary.api.models.flightplan.FlightplanCountParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanCreateParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanDeleteParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanListPage
import com.unifieddatalibrary.api.models.flightplan.FlightplanListParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpResponse
import com.unifieddatalibrary.api.models.flightplan.FlightplanRetrieveParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanTupleParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FlightplanServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FlightplanService {

    private val withRawResponse: FlightplanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FlightplanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlightplanService =
        FlightplanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: FlightplanCreateParams, requestOptions: RequestOptions) {
        // post /udl/flightplan
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: FlightplanRetrieveParams,
        requestOptions: RequestOptions,
    ): FlightPlanFull =
        // get /udl/flightplan/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: FlightplanUpdateParams, requestOptions: RequestOptions) {
        // put /udl/flightplan/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: FlightplanListParams,
        requestOptions: RequestOptions,
    ): FlightplanListPage =
        // get /udl/flightplan
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FlightplanDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/flightplan/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: FlightplanCountParams, requestOptions: RequestOptions): String =
        // get /udl/flightplan/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: FlightplanQueryhelpParams,
        requestOptions: RequestOptions,
    ): FlightplanQueryhelpResponse =
        // get /udl/flightplan/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: FlightplanTupleParams,
        requestOptions: RequestOptions,
    ): List<FlightPlanFull> =
        // get /udl/flightplan/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: FlightplanUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-flightplan
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FlightplanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FlightplanService.WithRawResponse =
            FlightplanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: FlightplanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<FlightPlanFull> =
            jsonHandler<FlightPlanFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FlightplanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlightPlanFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", params._pathParam(0))
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
            params: FlightplanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<FlightPlanAbridged>> =
            jsonHandler<List<FlightPlanAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: FlightplanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlightplanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan")
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
                        FlightplanListPage.builder()
                            .service(FlightplanServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FlightplanDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: FlightplanCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<FlightplanQueryhelpResponse> =
            jsonHandler<FlightplanQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: FlightplanQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlightplanQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", "queryhelp")
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

        private val tupleHandler: Handler<List<FlightPlanFull>> =
            jsonHandler<List<FlightPlanFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: FlightplanTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FlightPlanFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "flightplan", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: FlightplanUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-flightplan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
