// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.taiutc

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.taiutc.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.taiutc.history.HistoryCountParams
import com.unifieddatalibrary.api.models.taiutc.history.HistoryListPage
import com.unifieddatalibrary.api.models.taiutc.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.taiutc.history.HistoryListParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import com.unifieddatalibrary.api.services.async.taiutc.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.taiutc.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HistoryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync = HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): CompletableFuture<HistoryListPageAsync> =
        // get /udl/taiutc/history
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // get /udl/taiutc/history/aodr
        withRawResponse().aodr(params, requestOptions).thenAccept {}

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/taiutc/history/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync.WithRawResponse = HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<TaiutcFull>> = jsonHandler<List<TaiutcFull>>(clientOptions.jsonMapper)

        override fun list(params: HistoryListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", "history")
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
            .addPathSegments("udl", "taiutc", "history", "aodr")
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: HistoryCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", "history", "count")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          } }
        }
    }
}
