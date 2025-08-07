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
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCountParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanCreateParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanGetResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListPage
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanTupleResponse
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanUpdateParams
import com.unifieddatalibrary.api.services.blocking.sensorplan.HistoryService
import com.unifieddatalibrary.api.services.blocking.sensorplan.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorPlanServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorPlanService {

    private val withRawResponse: SensorPlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SensorPlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorPlanService =
        SensorPlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SensorPlanCreateParams, requestOptions: RequestOptions) {
        // post /udl/sensorplan
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SensorPlanUpdateParams, requestOptions: RequestOptions) {
        // put /udl/sensorplan/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SensorPlanListParams,
        requestOptions: RequestOptions,
    ): SensorPlanListPage =
        // get /udl/sensorplan
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SensorPlanCountParams, requestOptions: RequestOptions): String =
        // get /udl/sensorplan/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SensorPlanGetParams,
        requestOptions: RequestOptions,
    ): SensorPlanGetResponse =
        // get /udl/sensorplan/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SensorPlanQueryhelpParams,
        requestOptions: RequestOptions,
    ): SensorPlanQueryhelpResponse =
        // get /udl/sensorplan/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SensorPlanTupleParams,
        requestOptions: RequestOptions,
    ): List<SensorPlanTupleResponse> =
        // get /udl/sensorplan/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: SensorPlanUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-sensorplan
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorPlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorPlanService.WithRawResponse =
            SensorPlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SensorPlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan")
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
            params: SensorPlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SensorPlanListResponse>> =
            jsonHandler<List<SensorPlanListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorPlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorPlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan")
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
                        SensorPlanListPage.builder()
                            .service(SensorPlanServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SensorPlanCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SensorPlanGetResponse> =
            jsonHandler<SensorPlanGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorPlanGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorPlanGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorPlanQueryhelpResponse> =
            jsonHandler<SensorPlanQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorPlanQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorPlanQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan", "queryhelp")
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

        private val tupleHandler: Handler<List<SensorPlanTupleResponse>> =
            jsonHandler<List<SensorPlanTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SensorPlanTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SensorPlanTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorplan", "tuple")
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
            params: SensorPlanUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-sensorplan")
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
