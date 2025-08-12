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
import com.unifieddatalibrary.api.models.OnorbitSolarArrayFull
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayCreateParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayDeleteParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayGetParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListPage
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListPageAsync
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayListResponse
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitsolararrayServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitsolararrayServiceAsync {

    private val withRawResponse: OnorbitsolararrayServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitsolararrayServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayServiceAsync = OnorbitsolararrayServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbitsolararray
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/onorbitsolararray/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: OnorbitsolararrayListParams, requestOptions: RequestOptions): CompletableFuture<OnorbitsolararrayListPageAsync> =
        // get /udl/onorbitsolararray
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/onorbitsolararray/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions): CompletableFuture<OnorbitSolarArrayFull> =
        // get /udl/onorbitsolararray/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitsolararrayServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitsolararrayServiceAsync.WithRawResponse = OnorbitsolararrayServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitsolararrayCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitsolararray")
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

        override fun update(params: OnorbitsolararrayUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitsolararray", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitsolararrayListResponse>> = jsonHandler<List<OnorbitsolararrayListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitsolararrayListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitsolararrayListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitsolararray")
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
                  OnorbitsolararrayListPageAsync.builder()
                      .service(OnorbitsolararrayServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitsolararrayDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitsolararray", params._pathParam(0))
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

        private val getHandler: Handler<OnorbitSolarArrayFull> = jsonHandler<OnorbitSolarArrayFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitsolararrayGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitSolarArrayFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitsolararray", params._pathParam(0))
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
