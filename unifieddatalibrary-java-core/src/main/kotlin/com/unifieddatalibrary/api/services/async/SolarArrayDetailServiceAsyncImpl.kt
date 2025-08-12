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
import com.unifieddatalibrary.api.models.SolarArrayDetailsFull
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailCreateParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailDeleteParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailGetParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListPage
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListPageAsync
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailListResponse
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailUpdateParams
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SolarArrayDetailServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SolarArrayDetailServiceAsync {

    private val withRawResponse: SolarArrayDetailServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SolarArrayDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailServiceAsync = SolarArrayDetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/solararraydetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/solararraydetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SolarArrayDetailListParams, requestOptions: RequestOptions): CompletableFuture<SolarArrayDetailListPageAsync> =
        // get /udl/solararraydetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/solararraydetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions): CompletableFuture<SolarArrayDetailsFull> =
        // get /udl/solararraydetails/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SolarArrayDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayDetailServiceAsync.WithRawResponse = SolarArrayDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SolarArrayDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararraydetails")
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

        override fun update(params: SolarArrayDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararraydetails", params._pathParam(0))
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

        private val listHandler: Handler<List<SolarArrayDetailListResponse>> = jsonHandler<List<SolarArrayDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SolarArrayDetailListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayDetailListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararraydetails")
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
                  SolarArrayDetailListPageAsync.builder()
                      .service(SolarArrayDetailServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SolarArrayDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararraydetails", params._pathParam(0))
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

        private val getHandler: Handler<SolarArrayDetailsFull> = jsonHandler<SolarArrayDetailsFull>(clientOptions.jsonMapper)

        override fun get(params: SolarArrayDetailGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SolarArrayDetailsFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararraydetails", params._pathParam(0))
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
