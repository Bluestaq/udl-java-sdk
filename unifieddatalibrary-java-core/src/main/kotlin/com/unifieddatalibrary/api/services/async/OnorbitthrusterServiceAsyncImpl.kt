// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.OnorbitThrusterFull
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterCreateParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterDeleteParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterGetParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListPage
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListPageAsync
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListResponse
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitthrusterServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitthrusterServiceAsync {

    private val withRawResponse: OnorbitthrusterServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitthrusterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterServiceAsync = OnorbitthrusterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitthrusterCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbitthruster
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/onorbitthruster/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: OnorbitthrusterListParams, requestOptions: RequestOptions): CompletableFuture<OnorbitthrusterListPageAsync> =
        // get /udl/onorbitthruster
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OnorbitthrusterDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/onorbitthruster/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(params: OnorbitthrusterGetParams, requestOptions: RequestOptions): CompletableFuture<OnorbitThrusterFull> =
        // get /udl/onorbitthruster/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitthrusterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterServiceAsync.WithRawResponse = OnorbitthrusterServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitthrusterCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthruster")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: OnorbitthrusterUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthruster", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<List<OnorbitthrusterListResponse>> = jsonHandler<List<OnorbitthrusterListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitthrusterListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitthrusterListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthruster")
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
                  OnorbitthrusterListPageAsync.builder()
                      .service(OnorbitthrusterServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitthrusterDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthruster", params._pathParam(0))
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

        private val getHandler: Handler<OnorbitThrusterFull> = jsonHandler<OnorbitThrusterFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitthrusterGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitThrusterFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthruster", params._pathParam(0))
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
    }
}
