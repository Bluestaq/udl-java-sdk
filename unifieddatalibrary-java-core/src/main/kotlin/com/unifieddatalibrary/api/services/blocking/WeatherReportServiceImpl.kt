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
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCountParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCreateParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportGetParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListPage
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportTupleParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherreport.history.WeatherReportFull
import com.unifieddatalibrary.api.services.blocking.weatherreport.HistoryService
import com.unifieddatalibrary.api.services.blocking.weatherreport.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WeatherReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WeatherReportService {

    private val withRawResponse: WeatherReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): WeatherReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportService =
        WeatherReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: WeatherReportCreateParams, requestOptions: RequestOptions) {
        // post /udl/weatherreport
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: WeatherReportListParams,
        requestOptions: RequestOptions,
    ): WeatherReportListPage =
        // get /udl/weatherreport
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: WeatherReportCountParams, requestOptions: RequestOptions): String =
        // get /udl/weatherreport/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: WeatherReportGetParams,
        requestOptions: RequestOptions,
    ): WeatherReportFull =
        // get /udl/weatherreport/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: WeatherReportQueryhelpParams,
        requestOptions: RequestOptions,
    ): WeatherReportQueryhelpResponse =
        // get /udl/weatherreport/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: WeatherReportTupleParams,
        requestOptions: RequestOptions,
    ): List<WeatherReportFull> =
        // get /udl/weatherreport/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: WeatherReportUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-weatherreport
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WeatherReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WeatherReportService.WithRawResponse =
            WeatherReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: WeatherReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<WeatherReportListResponse>> =
            jsonHandler<List<WeatherReportListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: WeatherReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WeatherReportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport")
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
                        WeatherReportListPage.builder()
                            .service(WeatherReportServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: WeatherReportCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<WeatherReportFull> =
            jsonHandler<WeatherReportFull>(clientOptions.jsonMapper)

        override fun get(
            params: WeatherReportGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WeatherReportFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", params._pathParam(0))
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

        private val queryhelpHandler: Handler<WeatherReportQueryhelpResponse> =
            jsonHandler<WeatherReportQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: WeatherReportQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WeatherReportQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "queryhelp")
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

        private val tupleHandler: Handler<List<WeatherReportFull>> =
            jsonHandler<List<WeatherReportFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: WeatherReportTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<WeatherReportFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "tuple")
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
            params: WeatherReportUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-weatherreport")
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
