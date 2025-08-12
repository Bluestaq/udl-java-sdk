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
import com.unifieddatalibrary.api.models.EngineDetailsFull
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailCreateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailDeleteParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListPage
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListPageAsync
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailRetrieveParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailUpdateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailsAbridged
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EngineDetailServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EngineDetailServiceAsync {

    private val withRawResponse: EngineDetailServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EngineDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineDetailServiceAsync = EngineDetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EngineDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/enginedetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EngineDetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EngineDetailsFull> =
        // get /udl/enginedetails/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: EngineDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/enginedetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: EngineDetailListParams, requestOptions: RequestOptions): CompletableFuture<EngineDetailListPageAsync> =
        // get /udl/enginedetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: EngineDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/enginedetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EngineDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineDetailServiceAsync.WithRawResponse = EngineDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EngineDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "enginedetails")
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

        private val retrieveHandler: Handler<EngineDetailsFull> = jsonHandler<EngineDetailsFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EngineDetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EngineDetailsFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "enginedetails", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: EngineDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "enginedetails", params._pathParam(0))
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

        private val listHandler: Handler<List<EngineDetailsAbridged>> = jsonHandler<List<EngineDetailsAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EngineDetailListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EngineDetailListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "enginedetails")
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
                  EngineDetailListPageAsync.builder()
                      .service(EngineDetailServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EngineDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "enginedetails", params._pathParam(0))
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
    }
}
