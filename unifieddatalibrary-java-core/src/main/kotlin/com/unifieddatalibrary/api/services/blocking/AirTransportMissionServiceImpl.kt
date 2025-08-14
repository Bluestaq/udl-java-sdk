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
import com.unifieddatalibrary.api.models.AirTransportMissionFull
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionAbridged
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCountParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCreateParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListPage
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpResponse
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionRetrieveParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionTupleParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionUpdateParams
import com.unifieddatalibrary.api.services.blocking.airtransportmissions.HistoryService
import com.unifieddatalibrary.api.services.blocking.airtransportmissions.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirTransportMissionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AirTransportMissionService {

    private val withRawResponse: AirTransportMissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AirTransportMissionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AirTransportMissionService =
        AirTransportMissionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: AirTransportMissionCreateParams, requestOptions: RequestOptions) {
        // post /udl/airtransportmission
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AirTransportMissionRetrieveParams,
        requestOptions: RequestOptions,
    ): AirTransportMissionFull =
        // get /udl/airtransportmission/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirTransportMissionUpdateParams, requestOptions: RequestOptions) {
        // put /udl/airtransportmission/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: AirTransportMissionListParams,
        requestOptions: RequestOptions,
    ): AirTransportMissionListPage =
        // get /udl/airtransportmission
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: AirTransportMissionCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/airtransportmission/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: AirTransportMissionQueryhelpParams,
        requestOptions: RequestOptions,
    ): AirTransportMissionQueryhelpResponse =
        // get /udl/airtransportmission/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: AirTransportMissionTupleParams,
        requestOptions: RequestOptions,
    ): List<AirTransportMissionFull> =
        // get /udl/airtransportmission/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirTransportMissionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirTransportMissionService.WithRawResponse =
            AirTransportMissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirTransportMissionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AirTransportMissionFull> =
            jsonHandler<AirTransportMissionFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirTransportMissionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTransportMissionFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission", params._pathParam(0))
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
            params: AirTransportMissionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AirTransportMissionAbridged>> =
            jsonHandler<List<AirTransportMissionAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirTransportMissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTransportMissionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission")
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
                        AirTransportMissionListPage.builder()
                            .service(AirTransportMissionServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AirTransportMissionCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AirTransportMissionQueryhelpResponse> =
            jsonHandler<AirTransportMissionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AirTransportMissionQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTransportMissionQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission", "queryhelp")
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

        private val tupleHandler: Handler<List<AirTransportMissionFull>> =
            jsonHandler<List<AirTransportMissionFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirTransportMissionTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AirTransportMissionFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtransportmission", "tuple")
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
