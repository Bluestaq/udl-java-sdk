// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.elsets

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.current.CurrentListPage
import com.unifieddatalibrary.api.models.elsets.current.CurrentListPageAsync
import com.unifieddatalibrary.api.models.elsets.current.CurrentListParams
import com.unifieddatalibrary.api.models.elsets.current.CurrentTupleParams
import com.unifieddatalibrary.api.services.async.elsets.CurrentServiceAsync
import com.unifieddatalibrary.api.services.async.elsets.CurrentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CurrentServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CurrentServiceAsync {

    private val withRawResponse: CurrentServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CurrentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync = CurrentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: CurrentListParams, requestOptions: RequestOptions): CompletableFuture<CurrentListPageAsync> =
        // get /udl/elset/current
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: CurrentTupleParams, requestOptions: RequestOptions): CompletableFuture<List<Elset>> =
        // get /udl/elset/current/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CurrentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync.WithRawResponse = CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<ElsetAbridged>> = jsonHandler<List<ElsetAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CurrentListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CurrentListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "elset", "current")
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
                  CurrentListPageAsync.builder()
                      .service(CurrentServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val tupleHandler: Handler<List<Elset>> = jsonHandler<List<Elset>>(clientOptions.jsonMapper)

        override fun tuple(params: CurrentTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<Elset>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "elset", "current", "tuple")
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
