// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.starcatalog

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.starcatalog.history.HistoryAodrParams
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryService
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryServiceImpl
import java.util.function.Consumer

class HistoryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService = HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions) {
      // get /udl/starcatalog/history/aodr
      withRawResponse().aodr(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse = HistoryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "starcatalog", "history", "aodr")
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
