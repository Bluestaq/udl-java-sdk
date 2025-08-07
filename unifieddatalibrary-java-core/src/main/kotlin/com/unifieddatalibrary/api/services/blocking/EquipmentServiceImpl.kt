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
import com.unifieddatalibrary.api.models.equipment.EquipmentAbridged
import com.unifieddatalibrary.api.models.equipment.EquipmentCountParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateBulkParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateParams
import com.unifieddatalibrary.api.models.equipment.EquipmentDeleteParams
import com.unifieddatalibrary.api.models.equipment.EquipmentFull
import com.unifieddatalibrary.api.models.equipment.EquipmentListPage
import com.unifieddatalibrary.api.models.equipment.EquipmentListParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpResponse
import com.unifieddatalibrary.api.models.equipment.EquipmentRetrieveParams
import com.unifieddatalibrary.api.models.equipment.EquipmentTupleParams
import com.unifieddatalibrary.api.models.equipment.EquipmentUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EquipmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EquipmentService {

    private val withRawResponse: EquipmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EquipmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentService =
        EquipmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EquipmentCreateParams, requestOptions: RequestOptions) {
        // post /udl/equipment
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: EquipmentRetrieveParams,
        requestOptions: RequestOptions,
    ): EquipmentFull =
        // get /udl/equipment/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: EquipmentUpdateParams, requestOptions: RequestOptions) {
        // put /udl/equipment/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: EquipmentListParams,
        requestOptions: RequestOptions,
    ): EquipmentListPage =
        // get /udl/equipment
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EquipmentDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/equipment/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: EquipmentCountParams, requestOptions: RequestOptions): String =
        // get /udl/equipment/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EquipmentCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/equipment/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: EquipmentQueryHelpParams,
        requestOptions: RequestOptions,
    ): EquipmentQueryHelpResponse =
        // get /udl/equipment/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: EquipmentTupleParams,
        requestOptions: RequestOptions,
    ): List<EquipmentFull> =
        // get /udl/equipment/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EquipmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EquipmentService.WithRawResponse =
            EquipmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EquipmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<EquipmentFull> =
            jsonHandler<EquipmentFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EquipmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EquipmentFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", params._pathParam(0))
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
            params: EquipmentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<EquipmentAbridged>> =
            jsonHandler<List<EquipmentAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EquipmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EquipmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment")
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
                        EquipmentListPage.builder()
                            .service(EquipmentServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EquipmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", params._pathParam(0))
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
            params: EquipmentCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", "count")
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
            params: EquipmentCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<EquipmentQueryHelpResponse> =
            jsonHandler<EquipmentQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: EquipmentQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EquipmentQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<EquipmentFull>> =
            jsonHandler<List<EquipmentFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EquipmentTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<EquipmentFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "equipment", "tuple")
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
