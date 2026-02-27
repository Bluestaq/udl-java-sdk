// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.weatherreport

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryCountParams
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryListPage
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryListParams
import com.unifieddatalibrary.api.models.weatherreport.history.WeatherReportFull
import java.util.function.Consumer

/**
 * These services provide for posting and querying terrestrial weather conditions over a target area
 * or region and raw sensor data used to produce condition reports. Weather Reports describe current
 * weather conditions over a target point or region to include general temperatures, pressures, and
 * moisture accumulation, as well as navigational considerations such as altimeter settings,
 * visibility, wind speeds, and cloud heights etc. Weather Data contains algorithmic parameters and
 * dynamic, raw measurements collected by individual sensors such as signal power, noise level,
 * etc., which are generally processed across multiple sensors to produce weather reports.
 */
class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): HistoryListPage =
        // get /udl/weatherreport/history
        withRawResponse().list(params, requestOptions).parse()

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions) {
        // get /udl/weatherreport/history/aodr
        withRawResponse().aodr(params, requestOptions)
    }

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/weatherreport/history/count
        withRawResponse().count(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<WeatherReportFull>> =
            jsonHandler<List<WeatherReportFull>>(clientOptions.jsonMapper)

        override fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HistoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "history")
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
                        HistoryListPage.builder()
                            .service(HistoryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { aodrHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "weatherreport", "history", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }
    }
}
