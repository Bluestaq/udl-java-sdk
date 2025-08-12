// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.featureassessment

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
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryCountParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryWriteAodrParams
import com.unifieddatalibrary.api.services.async.featureassessment.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.featureassessment.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HistoryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync = HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/featureassessment/history/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun query(params: HistoryQueryParams, requestOptions: RequestOptions): CompletableFuture<List<HistoryQueryResponse>> =
        // get /udl/featureassessment/history
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // get /udl/featureassessment/history/aodr
        withRawResponse().writeAodr(params, requestOptions).thenAccept {}

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
            .addPathSegments("udl", "featureassessment", "history", "count")
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
            .addPathSegments("udl", "featureassessment", "history")
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

        private val writeAodrHandler: Handler<Void?> = emptyHandler()

        override fun writeAodr(params: HistoryWriteAodrParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "history", "aodr")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  writeAodrHandler.handle(it)
              }
          } }
        }
    }
}
