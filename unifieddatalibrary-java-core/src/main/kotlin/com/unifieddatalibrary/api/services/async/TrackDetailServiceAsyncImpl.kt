// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCountParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCreateBulkParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListPage
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListPageAsync
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailTupleParams
import com.unifieddatalibrary.api.models.trackdetails.history.TrackDetailsFull
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.trackdetails.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.trackdetails.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TrackDetailServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TrackDetailServiceAsync {

    private val withRawResponse: TrackDetailServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TrackDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailServiceAsync = TrackDetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: TrackDetailListParams, requestOptions: RequestOptions): CompletableFuture<TrackDetailListPageAsync> =
        // get /udl/trackdetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: TrackDetailCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/trackdetails/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: TrackDetailCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/trackdetails/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: TrackDetailQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<TrackDetailQueryhelpResponse> =
        // get /udl/trackdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: TrackDetailTupleParams, requestOptions: RequestOptions): CompletableFuture<List<TrackDetailsFull>> =
        // get /udl/trackdetails/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TrackDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailServiceAsync.WithRawResponse = TrackDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<TrackDetailListResponse>> = jsonHandler<List<TrackDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(params: TrackDetailListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TrackDetailListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackdetails")
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
                  TrackDetailListPageAsync.builder()
                      .service(TrackDetailServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: TrackDetailCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackdetails", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: TrackDetailCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackdetails", "createBulk")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createBulkHandler.handle(it)
              }
          } }
        }

        private val queryhelpHandler: Handler<TrackDetailQueryhelpResponse> = jsonHandler<TrackDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: TrackDetailQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TrackDetailQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackdetails", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<TrackDetailsFull>> = jsonHandler<List<TrackDetailsFull>>(clientOptions.jsonMapper)

        override fun tuple(params: TrackDetailTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<TrackDetailsFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackdetails", "tuple")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
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
