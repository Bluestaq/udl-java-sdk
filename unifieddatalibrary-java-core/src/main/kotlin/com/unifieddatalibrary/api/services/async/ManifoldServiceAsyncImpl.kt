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
import com.unifieddatalibrary.api.models.manifold.ManifoldCountParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateBulkParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateParams
import com.unifieddatalibrary.api.models.manifold.ManifoldDeleteParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldListPage
import com.unifieddatalibrary.api.models.manifold.ManifoldListPageAsync
import com.unifieddatalibrary.api.models.manifold.ManifoldListParams
import com.unifieddatalibrary.api.models.manifold.ManifoldListResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleParams
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldUpdateParams
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManifoldServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ManifoldServiceAsync {

    private val withRawResponse: ManifoldServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ManifoldServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldServiceAsync = ManifoldServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ManifoldCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/manifold
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/manifold/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: ManifoldListParams, requestOptions: RequestOptions): CompletableFuture<ManifoldListPageAsync> =
        // get /udl/manifold
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/manifold/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: ManifoldCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/manifold/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/manifold/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: ManifoldGetParams, requestOptions: RequestOptions): CompletableFuture<ManifoldGetResponse> =
        // get /udl/manifold/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: ManifoldQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<ManifoldQueryhelpResponse> =
        // get /udl/manifold/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions): CompletableFuture<List<ManifoldTupleResponse>> =
        // get /udl/manifold/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ManifoldServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldServiceAsync.WithRawResponse = ManifoldServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: ManifoldCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold")
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

        override fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        private val listHandler: Handler<List<ManifoldListResponse>> = jsonHandler<List<ManifoldListResponse>>(clientOptions.jsonMapper)

        override fun list(params: ManifoldListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold")
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
                  ManifoldListPageAsync.builder()
                      .service(ManifoldServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        override fun count(params: ManifoldCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "count")
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

        override fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "createBulk")
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

        private val getHandler: Handler<ManifoldGetResponse> = jsonHandler<ManifoldGetResponse>(clientOptions.jsonMapper)

        override fun get(params: ManifoldGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ManifoldQueryhelpResponse> = jsonHandler<ManifoldQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: ManifoldQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManifoldQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "queryhelp")
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

        private val tupleHandler: Handler<List<ManifoldTupleResponse>> = jsonHandler<List<ManifoldTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<ManifoldTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "tuple")
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
