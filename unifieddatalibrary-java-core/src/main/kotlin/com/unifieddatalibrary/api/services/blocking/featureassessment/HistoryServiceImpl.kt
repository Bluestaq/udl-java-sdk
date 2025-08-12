// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.featureassessment

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
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryCountParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryWriteAodrParams
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryService
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryServiceImpl
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService = HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/featureassessment/history/count
        withRawResponse().count(params, requestOptions).parse()

    override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): List<HistoryQueryResponse> =
        // get /udl/featureassessment/history
        withRawResponse().query(params, requestOptions).parse()

    override fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions) {
      // get /udl/featureassessment/history/aodr
      withRawResponse().writeAodr(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse = HistoryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: HistoryCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "history", "count")
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
            .addPathSegments("udl", "featureassessment", "history")
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

        private val writeAodrHandler: Handler<Void?> = emptyHandler()

        override fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "history", "aodr")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  writeAodrHandler.handle(it)
              }
          }
        }
    }
}
