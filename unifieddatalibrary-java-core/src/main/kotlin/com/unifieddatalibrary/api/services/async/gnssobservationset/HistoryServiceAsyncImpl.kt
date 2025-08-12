// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.gnssobservationset

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.gnssobservationset.history.GnssObservationSetFull
import com.unifieddatalibrary.api.models.gnssobservationset.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.gnssobservationset.history.HistoryListPage
import com.unifieddatalibrary.api.models.gnssobservationset.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.gnssobservationset.history.HistoryListParams
import com.unifieddatalibrary.api.services.async.gnssobservationset.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.gnssobservationset.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HistoryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync = HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): CompletableFuture<HistoryListPageAsync> =
        // get /udl/gnssobservationset/history
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // get /udl/gnssobservationset/history/aodr
        withRawResponse().aodr(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync.WithRawResponse = HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<GnssObservationSetFull>> = jsonHandler<List<GnssObservationSetFull>>(clientOptions.jsonMapper)

        override fun list(params: HistoryListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "history")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  HistoryListPageAsync.builder()
                      .service(HistoryServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "history", "aodr")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  aodrHandler.handle(it)
              }
          } }
        }
    }
}
