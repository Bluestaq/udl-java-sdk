// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.sensor

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
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCountParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateBulkParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationListPage
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationListParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationListResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.sensor.calibration.HistoryService
import com.unifieddatalibrary.api.services.blocking.sensor.calibration.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CalibrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalibrationService {

    private val withRawResponse: CalibrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): CalibrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationService =
        CalibrationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: CalibrationCreateParams, requestOptions: RequestOptions) {
        // post /udl/sensorcalibration
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: CalibrationRetrieveParams,
        requestOptions: RequestOptions,
    ): CalibrationRetrieveResponse =
        // get /udl/sensorcalibration/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CalibrationListParams,
        requestOptions: RequestOptions,
    ): CalibrationListPage =
        // get /udl/sensorcalibration
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: CalibrationCountParams, requestOptions: RequestOptions): String =
        // get /udl/sensorcalibration/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: CalibrationCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/sensorcalibration/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: CalibrationQueryHelpParams,
        requestOptions: RequestOptions,
    ): CalibrationQueryHelpResponse =
        // get /udl/sensorcalibration/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: CalibrationTupleParams,
        requestOptions: RequestOptions,
    ): List<CalibrationTupleResponse> =
        // get /udl/sensorcalibration/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: CalibrationUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-sensorcalibration
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalibrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalibrationService.WithRawResponse =
            CalibrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: CalibrationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<CalibrationRetrieveResponse> =
            jsonHandler<CalibrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CalibrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalibrationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration", params._pathParam(0))
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

        private val listHandler: Handler<List<CalibrationListResponse>> =
            jsonHandler<List<CalibrationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: CalibrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalibrationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration")
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
                        CalibrationListPage.builder()
                            .service(CalibrationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: CalibrationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration", "count")
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
            params: CalibrationCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<CalibrationQueryHelpResponse> =
            jsonHandler<CalibrationQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: CalibrationQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalibrationQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration", "queryhelp")
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

        private val tupleHandler: Handler<List<CalibrationTupleResponse>> =
            jsonHandler<List<CalibrationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: CalibrationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CalibrationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorcalibration", "tuple")
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
            params: CalibrationUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-sensorcalibration")
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
