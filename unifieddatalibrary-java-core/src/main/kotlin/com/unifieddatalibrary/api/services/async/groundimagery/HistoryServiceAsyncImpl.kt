// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.groundimagery

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryCountParams
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryQueryResponse
import com.unifieddatalibrary.api.services.async.groundimagery.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.groundimagery.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HistoryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync = HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/groundimagery/history/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): CompletableFuture<List<HistoryQueryResponse>> =
        // get /udl/groundimagery/history
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync.WithRawResponse = HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: HistoryCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "groundimagery", "history", "count")
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

        private val queryHandler: Handler<List<HistoryQueryResponse>> = jsonHandler<List<HistoryQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<HistoryQueryResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "groundimagery", "history")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }
    }
}
