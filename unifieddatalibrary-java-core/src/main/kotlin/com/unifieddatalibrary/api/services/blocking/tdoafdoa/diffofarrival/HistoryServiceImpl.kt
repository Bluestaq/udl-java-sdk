// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.tdoafdoa.diffofarrival

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalFull
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryListPage
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.history.HistoryListParams
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.diffofarrival.HistoryService
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.diffofarrival.HistoryServiceImpl
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService = HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): HistoryListPage =
        // get /udl/diffofarrival/history
        withRawResponse().list(params, requestOptions).parse()

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions) {
      // get /udl/diffofarrival/history/aodr
      withRawResponse().aodr(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse = HistoryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<DiffofarrivalFull>> = jsonHandler<List<DiffofarrivalFull>>(clientOptions.jsonMapper)

        override fun list(params: HistoryListParams, requestOptions: RequestOptions): HttpResponseFor<HistoryListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diffofarrival", "history")
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
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diffofarrival", "history", "aodr")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  aodrHandler.handle(it)
              }
          }
        }
    }
}
