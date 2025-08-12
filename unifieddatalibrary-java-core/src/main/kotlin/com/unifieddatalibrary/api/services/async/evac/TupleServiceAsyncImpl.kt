// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.evac

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
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.models.evac.tuple.TupleListPage
import com.unifieddatalibrary.api.models.evac.tuple.TupleListPageAsync
import com.unifieddatalibrary.api.models.evac.tuple.TupleListParams
import com.unifieddatalibrary.api.services.async.evac.TupleServiceAsync
import com.unifieddatalibrary.api.services.async.evac.TupleServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TupleServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TupleServiceAsync {

    private val withRawResponse: TupleServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): TupleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleServiceAsync = TupleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: TupleListParams, requestOptions: RequestOptions): CompletableFuture<TupleListPageAsync> =
        // get /udl/evac/tuple
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TupleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleServiceAsync.WithRawResponse = TupleServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<EvacFull>> = jsonHandler<List<EvacFull>>(clientOptions.jsonMapper)

        override fun list(params: TupleListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TupleListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "evac", "tuple")
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
                  TupleListPageAsync.builder()
                      .service(TupleServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }
    }
}
