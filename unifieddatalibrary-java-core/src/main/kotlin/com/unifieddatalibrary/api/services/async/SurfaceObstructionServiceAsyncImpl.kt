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
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCountParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCreateParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionDeleteParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListPage
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListPageAsync
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUpdateParams
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SurfaceObstructionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SurfaceObstructionServiceAsync {

    private val withRawResponse: SurfaceObstructionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SurfaceObstructionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceObstructionServiceAsync = SurfaceObstructionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SurfaceObstructionCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/surfaceobstruction
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/surfaceobstruction/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SurfaceObstructionListParams, requestOptions: RequestOptions): CompletableFuture<SurfaceObstructionListPageAsync> =
        // get /udl/surfaceobstruction
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SurfaceObstructionDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/surfaceobstruction/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: SurfaceObstructionCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/surfaceobstruction/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: SurfaceObstructionGetParams, requestOptions: RequestOptions): CompletableFuture<SurfaceObstructionGetResponse> =
        // get /udl/surfaceobstruction/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SurfaceObstructionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SurfaceObstructionQueryhelpResponse> =
        // get /udl/surfaceobstruction/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SurfaceObstructionTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SurfaceObstructionTupleResponse>> =
        // get /udl/surfaceobstruction/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-surfaceobstruction
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SurfaceObstructionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceObstructionServiceAsync.WithRawResponse = SurfaceObstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SurfaceObstructionCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction")
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

        override fun update(params: SurfaceObstructionUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", params._pathParam(0))
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

        private val listHandler: Handler<List<SurfaceObstructionListResponse>> = jsonHandler<List<SurfaceObstructionListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SurfaceObstructionListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SurfaceObstructionListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction")
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
                  SurfaceObstructionListPageAsync.builder()
                      .service(SurfaceObstructionServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SurfaceObstructionDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", params._pathParam(0))
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

        override fun count(params: SurfaceObstructionCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", "count")
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

        private val getHandler: Handler<SurfaceObstructionGetResponse> = jsonHandler<SurfaceObstructionGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SurfaceObstructionGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SurfaceObstructionQueryhelpResponse> = jsonHandler<SurfaceObstructionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SurfaceObstructionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SurfaceObstructionQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", "queryhelp")
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

        private val tupleHandler: Handler<List<SurfaceObstructionTupleResponse>> = jsonHandler<List<SurfaceObstructionTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SurfaceObstructionTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SurfaceObstructionTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "surfaceobstruction", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: SurfaceObstructionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-surfaceobstruction")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  unvalidatedPublishHandler.handle(it)
              }
          } }
        }
    }
}
