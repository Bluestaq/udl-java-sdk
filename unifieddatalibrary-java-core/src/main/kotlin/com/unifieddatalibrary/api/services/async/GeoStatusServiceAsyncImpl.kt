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
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCountParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateBulkParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusGetParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListPage
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListPageAsync
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusTupleParams
import com.unifieddatalibrary.api.models.geostatus.history.GeoStatusFull
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.geostatus.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.geostatus.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GeoStatusServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GeoStatusServiceAsync {

    private val withRawResponse: GeoStatusServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GeoStatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusServiceAsync = GeoStatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: GeoStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/geostatus
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: GeoStatusListParams, requestOptions: RequestOptions): CompletableFuture<GeoStatusListPageAsync> =
        // get /udl/geostatus
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: GeoStatusCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/geostatus/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: GeoStatusCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/geostatus/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: GeoStatusGetParams, requestOptions: RequestOptions): CompletableFuture<GeoStatusFull> =
        // get /udl/geostatus/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: GeoStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<GeoStatusQueryhelpResponse> =
        // get /udl/geostatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: GeoStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<List<GeoStatusFull>> =
        // get /udl/geostatus/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GeoStatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusServiceAsync.WithRawResponse = GeoStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: GeoStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus")
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

        private val listHandler: Handler<List<GeoStatusListResponse>> = jsonHandler<List<GeoStatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: GeoStatusListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GeoStatusListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus")
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
                  GeoStatusListPageAsync.builder()
                      .service(GeoStatusServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: GeoStatusCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "count")
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

        override fun createBulk(params: GeoStatusCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "createBulk")
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

        private val getHandler: Handler<GeoStatusFull> = jsonHandler<GeoStatusFull>(clientOptions.jsonMapper)

        override fun get(params: GeoStatusGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GeoStatusFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<GeoStatusQueryhelpResponse> = jsonHandler<GeoStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: GeoStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GeoStatusQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "queryhelp")
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

        private val tupleHandler: Handler<List<GeoStatusFull>> = jsonHandler<List<GeoStatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: GeoStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<GeoStatusFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "tuple")
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
