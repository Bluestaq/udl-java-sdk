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
import com.unifieddatalibrary.api.models.OnorbitthrusterstatusFull
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusDeleteParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusGetParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListPage
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListPageAsync
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusTupleParams
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.onorbitthrusterstatus.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.onorbitthrusterstatus.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitthrusterstatusServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitthrusterstatusServiceAsync {

    private val withRawResponse: OnorbitthrusterstatusServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OnorbitthrusterstatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusServiceAsync = OnorbitthrusterstatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbitthrusterstatus
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: OnorbitthrusterstatusListParams, requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusListPageAsync> =
        // get /udl/onorbitthrusterstatus
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/onorbitthrusterstatus/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: OnorbitthrusterstatusCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/onorbitthrusterstatus/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbitthrusterstatus/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusFull> =
        // get /udl/onorbitthrusterstatus/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterstatusQueryhelpResponse> =
        // get /udl/onorbitthrusterstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OnorbitthrusterstatusFull>> =
        // get /udl/onorbitthrusterstatus/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitthrusterstatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusServiceAsync.WithRawResponse = OnorbitthrusterstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus")
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

        private val listHandler: Handler<List<OnorbitthrusterstatusListResponse>> = jsonHandler<List<OnorbitthrusterstatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitthrusterstatusListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus")
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
                  OnorbitthrusterstatusListPageAsync.builder()
                      .service(OnorbitthrusterstatusServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OnorbitthrusterstatusCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "count")
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

        override fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "createBulk")
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

        private val getHandler: Handler<OnorbitthrusterstatusFull> = jsonHandler<OnorbitthrusterstatusFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OnorbitthrusterstatusQueryhelpResponse> = jsonHandler<OnorbitthrusterstatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitthrusterstatusFull>> = jsonHandler<List<OnorbitthrusterstatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OnorbitthrusterstatusFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "tuple")
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
