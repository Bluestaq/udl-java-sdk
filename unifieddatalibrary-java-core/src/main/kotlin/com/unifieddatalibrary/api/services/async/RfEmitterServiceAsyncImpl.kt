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
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCountParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCreateParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListPage
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListPageAsync
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterUpdateParams
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfEmitterServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RfEmitterServiceAsync {

    private val withRawResponse: RfEmitterServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RfEmitterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterServiceAsync = RfEmitterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RfEmitterCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/rfemitter
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: RfEmitterUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/rfemitter/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: RfEmitterListParams, requestOptions: RequestOptions): CompletableFuture<RfEmitterListPageAsync> =
        // get /udl/rfemitter
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: RfEmitterDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/rfemitter/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: RfEmitterCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/rfemitter/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: RfEmitterGetParams, requestOptions: RequestOptions): CompletableFuture<RfEmitterGetResponse> =
        // get /udl/rfemitter/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: RfEmitterQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<RfEmitterQueryhelpResponse> =
        // get /udl/rfemitter/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: RfEmitterTupleParams, requestOptions: RequestOptions): CompletableFuture<List<RfEmitterTupleResponse>> =
        // get /udl/rfemitter/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RfEmitterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterServiceAsync.WithRawResponse = RfEmitterServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: RfEmitterCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter")
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

        override fun update(params: RfEmitterUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        private val listHandler: Handler<List<RfEmitterListResponse>> = jsonHandler<List<RfEmitterListResponse>>(clientOptions.jsonMapper)

        override fun list(params: RfEmitterListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfEmitterListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter")
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
                  RfEmitterListPageAsync.builder()
                      .service(RfEmitterServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: RfEmitterDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        override fun count(params: RfEmitterCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "count")
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

        private val getHandler: Handler<RfEmitterGetResponse> = jsonHandler<RfEmitterGetResponse>(clientOptions.jsonMapper)

        override fun get(params: RfEmitterGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfEmitterGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        private val queryhelpHandler: Handler<RfEmitterQueryhelpResponse> = jsonHandler<RfEmitterQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: RfEmitterQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfEmitterQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "queryhelp")
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

        private val tupleHandler: Handler<List<RfEmitterTupleResponse>> = jsonHandler<List<RfEmitterTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: RfEmitterTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<RfEmitterTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "tuple")
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
