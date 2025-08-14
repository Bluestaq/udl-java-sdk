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
import com.unifieddatalibrary.api.models.AirloadplanFull
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCountParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanCreateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanDeleteParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListPage
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanListParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanRetrieveParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanTupleParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadPlanUpdateParams
import com.unifieddatalibrary.api.models.airloadplans.AirloadplanAbridged
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirloadPlanServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AirloadPlanService {

    private val withRawResponse: AirloadPlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AirloadPlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirloadPlanService =
        AirloadPlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirloadPlanCreateParams, requestOptions: RequestOptions) {
        // post /udl/airloadplan
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AirloadPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): AirloadplanFull =
        // get /udl/airloadplan/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirloadPlanUpdateParams, requestOptions: RequestOptions) {
        // put /udl/airloadplan/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: AirloadPlanListParams,
        requestOptions: RequestOptions,
    ): AirloadPlanListPage =
        // get /udl/airloadplan
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AirloadPlanDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/airloadplan/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AirloadPlanCountParams, requestOptions: RequestOptions): String =
        // get /udl/airloadplan/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: AirloadPlanQueryhelpParams,
        requestOptions: RequestOptions,
    ): AirloadPlanQueryhelpResponse =
        // get /udl/airloadplan/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: AirloadPlanTupleParams,
        requestOptions: RequestOptions,
    ): List<AirloadplanFull> =
        // get /udl/airloadplan/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirloadPlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirloadPlanService.WithRawResponse =
            AirloadPlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirloadPlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AirloadplanFull> =
            jsonHandler<AirloadplanFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirloadPlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirloadplanFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", params._pathParam(0))
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
            params: AirloadPlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AirloadplanAbridged>> =
            jsonHandler<List<AirloadplanAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirloadPlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirloadPlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan")
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
                        AirloadPlanListPage.builder()
                            .service(AirloadPlanServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AirloadPlanDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AirloadPlanCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AirloadPlanQueryhelpResponse> =
            jsonHandler<AirloadPlanQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AirloadPlanQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirloadPlanQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "queryhelp")
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

        private val tupleHandler: Handler<List<AirloadplanFull>> =
            jsonHandler<List<AirloadplanFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirloadPlanTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AirloadplanFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airloadplan", "tuple")
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
