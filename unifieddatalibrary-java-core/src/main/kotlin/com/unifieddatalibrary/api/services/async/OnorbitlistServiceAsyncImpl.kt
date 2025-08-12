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
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCountParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCreateParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistDeleteParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListPage
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListPageAsync
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitlistServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitlistServiceAsync {

    private val withRawResponse: OnorbitlistServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitlistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistServiceAsync = OnorbitlistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbitlist
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/onorbitlist/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: OnorbitlistListParams, requestOptions: RequestOptions): CompletableFuture<OnorbitlistListPageAsync> =
        // get /udl/onorbitlist
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/onorbitlist/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: OnorbitlistCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/onorbitlist/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions): CompletableFuture<OnorbitlistGetResponse> =
        // get /udl/onorbitlist/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OnorbitlistQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OnorbitlistQueryhelpResponse> =
        // get /udl/onorbitlist/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OnorbitlistTupleResponse>> =
        // get /udl/onorbitlist/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitlistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistServiceAsync.WithRawResponse = OnorbitlistServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist")
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

        override fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitlistListResponse>> = jsonHandler<List<OnorbitlistListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitlistListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist")
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
                  OnorbitlistListPageAsync.builder()
                      .service(OnorbitlistServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        override fun count(params: OnorbitlistCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "count")
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

        private val getHandler: Handler<OnorbitlistGetResponse> = jsonHandler<OnorbitlistGetResponse>(clientOptions.jsonMapper)

        override fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OnorbitlistQueryhelpResponse> = jsonHandler<OnorbitlistQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnorbitlistQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitlistQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitlistTupleResponse>> = jsonHandler<List<OnorbitlistTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OnorbitlistTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "tuple")
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
