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
import com.unifieddatalibrary.api.models.AirfieldslotFull
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCountParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCreateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotDeleteParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListPage
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotTupleParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotUpdateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldslotAbridged
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirfieldSlotServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AirfieldSlotService {

    private val withRawResponse: AirfieldSlotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AirfieldSlotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotService =
        AirfieldSlotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirfieldSlotCreateParams, requestOptions: RequestOptions) {
        // post /udl/airfieldslot
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AirfieldSlotRetrieveParams,
        requestOptions: RequestOptions,
    ): AirfieldslotFull =
        // get /udl/airfieldslot/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirfieldSlotUpdateParams, requestOptions: RequestOptions) {
        // put /udl/airfieldslot/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: AirfieldSlotListParams,
        requestOptions: RequestOptions,
    ): AirfieldSlotListPage =
        // get /udl/airfieldslot
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AirfieldSlotDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/airfieldslot/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AirfieldSlotCountParams, requestOptions: RequestOptions): String =
        // get /udl/airfieldslot/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: AirfieldSlotQueryhelpParams,
        requestOptions: RequestOptions,
    ): AirfieldSlotQueryhelpResponse =
        // get /udl/airfieldslot/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: AirfieldSlotTupleParams,
        requestOptions: RequestOptions,
    ): List<AirfieldslotFull> =
        // get /udl/airfieldslot/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirfieldSlotService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirfieldSlotService.WithRawResponse =
            AirfieldSlotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirfieldSlotCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AirfieldslotFull> =
            jsonHandler<AirfieldslotFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirfieldSlotRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirfieldslotFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", params._pathParam(0))
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
            params: AirfieldSlotUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AirfieldslotAbridged>> =
            jsonHandler<List<AirfieldslotAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirfieldSlotListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirfieldSlotListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot")
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
                        AirfieldSlotListPage.builder()
                            .service(AirfieldSlotServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AirfieldSlotDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", params._pathParam(0))
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
            params: AirfieldSlotCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AirfieldSlotQueryhelpResponse> =
            jsonHandler<AirfieldSlotQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AirfieldSlotQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirfieldSlotQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", "queryhelp")
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

        private val tupleHandler: Handler<List<AirfieldslotFull>> =
            jsonHandler<List<AirfieldslotFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirfieldSlotTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AirfieldslotFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airfieldslot", "tuple")
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
