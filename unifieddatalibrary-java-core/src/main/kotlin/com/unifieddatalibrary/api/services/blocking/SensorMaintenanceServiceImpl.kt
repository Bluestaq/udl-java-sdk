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
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateBulkParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceDeleteParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListPage
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryhelpParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryhelpResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleResponse
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceUpdateParams
import com.unifieddatalibrary.api.services.blocking.sensormaintenance.HistoryService
import com.unifieddatalibrary.api.services.blocking.sensormaintenance.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorMaintenanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorMaintenanceService {

    private val withRawResponse: SensorMaintenanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SensorMaintenanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorMaintenanceService =
        SensorMaintenanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SensorMaintenanceCreateParams, requestOptions: RequestOptions) {
        // post /udl/sensormaintenance
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SensorMaintenanceUpdateParams, requestOptions: RequestOptions) {
        // put /udl/sensormaintenance/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SensorMaintenanceListParams,
        requestOptions: RequestOptions,
    ): SensorMaintenanceListPage =
        // get /udl/sensormaintenance
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SensorMaintenanceDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/sensormaintenance/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(
        params: SensorMaintenanceCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/sensormaintenance/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: SensorMaintenanceCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/sensormaintenance/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun current(
        params: SensorMaintenanceCurrentParams,
        requestOptions: RequestOptions,
    ): List<SensorMaintenanceCurrentResponse> =
        // get /udl/sensormaintenance/current
        withRawResponse().current(params, requestOptions).parse()

    override fun get(
        params: SensorMaintenanceGetParams,
        requestOptions: RequestOptions,
    ): SensorMaintenanceGetResponse =
        // get /udl/sensormaintenance/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SensorMaintenanceQueryhelpParams,
        requestOptions: RequestOptions,
    ): SensorMaintenanceQueryhelpResponse =
        // get /udl/sensormaintenance/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SensorMaintenanceTupleParams,
        requestOptions: RequestOptions,
    ): List<SensorMaintenanceTupleResponse> =
        // get /udl/sensormaintenance/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorMaintenanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorMaintenanceService.WithRawResponse =
            SensorMaintenanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SensorMaintenanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: SensorMaintenanceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SensorMaintenanceListResponse>> =
            jsonHandler<List<SensorMaintenanceListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorMaintenanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorMaintenanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance")
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
                        SensorMaintenanceListPage.builder()
                            .service(SensorMaintenanceServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SensorMaintenanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", params._pathParam(0))
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
            params: SensorMaintenanceCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", "count")
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
            params: SensorMaintenanceCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val currentHandler: Handler<List<SensorMaintenanceCurrentResponse>> =
            jsonHandler<List<SensorMaintenanceCurrentResponse>>(clientOptions.jsonMapper)

        override fun current(
            params: SensorMaintenanceCurrentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SensorMaintenanceCurrentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", "current")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { currentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val getHandler: Handler<SensorMaintenanceGetResponse> =
            jsonHandler<SensorMaintenanceGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorMaintenanceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorMaintenanceGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorMaintenanceQueryhelpResponse> =
            jsonHandler<SensorMaintenanceQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorMaintenanceQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorMaintenanceQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", "queryhelp")
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

        private val tupleHandler: Handler<List<SensorMaintenanceTupleResponse>> =
            jsonHandler<List<SensorMaintenanceTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SensorMaintenanceTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SensorMaintenanceTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensormaintenance", "tuple")
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
