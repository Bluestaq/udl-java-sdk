// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.h3geo

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
import com.unifieddatalibrary.api.models.h3geo.history.HistoryAdorParams
import com.unifieddatalibrary.api.models.h3geo.history.HistoryCountParams
import com.unifieddatalibrary.api.models.h3geo.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.h3geo.history.HistoryQueryResponse
import com.unifieddatalibrary.api.services.blocking.h3geo.HistoryService
import com.unifieddatalibrary.api.services.blocking.h3geo.HistoryServiceImpl
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService = HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ador(params: HistoryAdorParams, requestOptions: RequestOptions) {
      // get /udl/h3geo/history/aodr
      withRawResponse().ador(params, requestOptions)
    }

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/h3geo/history/count
        withRawResponse().count(params, requestOptions).parse()

    override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): List<HistoryQueryResponse> =
        // get /udl/h3geo/history
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse = HistoryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val adorHandler: Handler<Void?> = emptyHandler()

        override fun ador(params: HistoryAdorParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "history", "aodr")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  adorHandler.handle(it)
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: HistoryCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "history", "count")
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

        private val queryHandler: Handler<List<HistoryQueryResponse>> = jsonHandler<List<HistoryQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): HttpResponseFor<List<HistoryQueryResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "history")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }
    }
}
