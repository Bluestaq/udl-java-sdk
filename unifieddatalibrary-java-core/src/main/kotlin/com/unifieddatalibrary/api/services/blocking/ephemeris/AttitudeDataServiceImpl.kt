// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ephemeris

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataAbridged
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListPage
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListParams
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.ephemeris.attitudedata.HistoryService
import com.unifieddatalibrary.api.services.blocking.ephemeris.attitudedata.HistoryServiceImpl
import java.util.function.Consumer

class AttitudeDataServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AttitudeDataService {

    private val withRawResponse: AttitudeDataService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AttitudeDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataService = AttitudeDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: AttitudeDataListParams, requestOptions: RequestOptions): AttitudeDataListPage =
        // get /udl/attitudedata
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions): String =
        // get /udl/attitudedata/count
        withRawResponse().count(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AttitudeDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataService.WithRawResponse = AttitudeDataServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<AttitudeDataAbridged>> = jsonHandler<List<AttitudeDataAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AttitudeDataListParams, requestOptions: RequestOptions): HttpResponseFor<AttitudeDataListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudedata")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  AttitudeDataListPage.builder()
                      .service(AttitudeDataServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudedata", "count")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          }
        }
    }
}
