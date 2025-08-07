// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

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
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCountParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationGetParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationGetResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListPage
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationTupleParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationTupleResponse
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.radarobservation.HistoryService
import com.unifieddatalibrary.api.services.blocking.observations.radarobservation.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RadarobservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RadarobservationService {

    private val withRawResponse: RadarobservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): RadarobservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RadarobservationService =
        RadarobservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: RadarobservationCreateParams, requestOptions: RequestOptions) {
        // post /udl/radarobservation
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: RadarobservationListParams,
        requestOptions: RequestOptions,
    ): RadarobservationListPage =
        // get /udl/radarobservation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: RadarobservationCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/radarobservation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: RadarobservationCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/radarobservation/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: RadarobservationGetParams,
        requestOptions: RequestOptions,
    ): RadarobservationGetResponse =
        // get /udl/radarobservation/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: RadarobservationQueryhelpParams,
        requestOptions: RequestOptions,
    ): RadarobservationQueryhelpResponse =
        // get /udl/radarobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: RadarobservationTupleParams,
        requestOptions: RequestOptions,
    ): List<RadarobservationTupleResponse> =
        // get /udl/radarobservation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: RadarobservationUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-radar
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RadarobservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RadarobservationService.WithRawResponse =
            RadarobservationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: RadarobservationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<RadarobservationListResponse>> =
            jsonHandler<List<RadarobservationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: RadarobservationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RadarobservationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation")
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
                        RadarobservationListPage.builder()
                            .service(RadarobservationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: RadarobservationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation", "count")
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
            params: RadarobservationCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<RadarobservationGetResponse> =
            jsonHandler<RadarobservationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: RadarobservationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RadarobservationGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryhelpHandler: Handler<RadarobservationQueryhelpResponse> =
            jsonHandler<RadarobservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: RadarobservationQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RadarobservationQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<RadarobservationTupleResponse>> =
            jsonHandler<List<RadarobservationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: RadarobservationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RadarobservationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "radarobservation", "tuple")
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
            params: RadarobservationUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-radar")
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
