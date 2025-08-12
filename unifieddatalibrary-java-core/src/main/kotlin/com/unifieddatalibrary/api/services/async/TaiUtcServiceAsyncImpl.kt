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
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCountParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcDeleteParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcGetParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListPage
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListPageAsync
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcTupleParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcUpdateParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.taiutc.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.taiutc.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaiUtcServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TaiUtcServiceAsync {

    private val withRawResponse: TaiUtcServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TaiUtcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcServiceAsync = TaiUtcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: TaiUtcCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/taiutc
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: TaiUtcUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/taiutc/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: TaiUtcListParams, requestOptions: RequestOptions): CompletableFuture<TaiUtcListPageAsync> =
        // get /udl/taiutc
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: TaiUtcDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/taiutc/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: TaiUtcCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/taiutc/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: TaiUtcGetParams, requestOptions: RequestOptions): CompletableFuture<TaiutcFull> =
        // get /udl/taiutc/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: TaiUtcQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<TaiUtcQueryhelpResponse> =
        // get /udl/taiutc/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: TaiUtcTupleParams, requestOptions: RequestOptions): CompletableFuture<List<TaiutcFull>> =
        // get /udl/taiutc/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TaiUtcServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcServiceAsync.WithRawResponse = TaiUtcServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: TaiUtcCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc")
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

        override fun update(params: TaiUtcUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", params._pathParam(0))
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

        private val listHandler: Handler<List<TaiUtcListResponse>> = jsonHandler<List<TaiUtcListResponse>>(clientOptions.jsonMapper)

        override fun list(params: TaiUtcListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TaiUtcListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc")
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
                  TaiUtcListPageAsync.builder()
                      .service(TaiUtcServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: TaiUtcDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", params._pathParam(0))
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

        override fun count(params: TaiUtcCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", "count")
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

        private val getHandler: Handler<TaiutcFull> = jsonHandler<TaiutcFull>(clientOptions.jsonMapper)

        override fun get(params: TaiUtcGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TaiutcFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", params._pathParam(0))
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

        private val queryhelpHandler: Handler<TaiUtcQueryhelpResponse> = jsonHandler<TaiUtcQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: TaiUtcQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TaiUtcQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", "queryhelp")
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

        private val tupleHandler: Handler<List<TaiutcFull>> = jsonHandler<List<TaiutcFull>>(clientOptions.jsonMapper)

        override fun tuple(params: TaiUtcTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<TaiutcFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "taiutc", "tuple")
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
