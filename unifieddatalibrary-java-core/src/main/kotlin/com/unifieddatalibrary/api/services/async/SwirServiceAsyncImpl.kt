// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
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
import com.unifieddatalibrary.api.models.swir.SwirCountParams
import com.unifieddatalibrary.api.models.swir.SwirCreateBulkParams
import com.unifieddatalibrary.api.models.swir.SwirCreateParams
import com.unifieddatalibrary.api.models.swir.SwirGetParams
import com.unifieddatalibrary.api.models.swir.SwirListPage
import com.unifieddatalibrary.api.models.swir.SwirListPageAsync
import com.unifieddatalibrary.api.models.swir.SwirListParams
import com.unifieddatalibrary.api.models.swir.SwirListResponse
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpResponse
import com.unifieddatalibrary.api.models.swir.SwirTupleParams
import com.unifieddatalibrary.api.models.swir.history.SwirFull
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.SwirServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.swir.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.swir.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SwirServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SwirServiceAsync {

    private val withRawResponse: SwirServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SwirServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync = SwirServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: SwirCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/swir
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: SwirListParams, requestOptions: RequestOptions): CompletableFuture<SwirListPageAsync> =
        // get /udl/swir
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: SwirCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/swir/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/swir/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: SwirGetParams, requestOptions: RequestOptions): CompletableFuture<SwirFull> =
        // get /udl/swir/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SwirQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SwirQueryhelpResponse> =
        // get /udl/swir/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SwirTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SwirFull>> =
        // get /udl/swir/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SwirServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirServiceAsync.WithRawResponse = SwirServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SwirCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<List<SwirListResponse>> = jsonHandler<List<SwirListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SwirListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SwirListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir")
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
                  SwirListPageAsync.builder()
                      .service(SwirServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SwirCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "count")
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

        override fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "createBulk")
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

        private val getHandler: Handler<SwirFull> = jsonHandler<SwirFull>(clientOptions.jsonMapper)

        override fun get(params: SwirGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SwirFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<SwirQueryhelpResponse> = jsonHandler<SwirQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SwirQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SwirQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "queryhelp")
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

        private val tupleHandler: Handler<List<SwirFull>> = jsonHandler<List<SwirFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SwirTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SwirFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "tuple")
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
