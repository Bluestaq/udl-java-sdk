// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.onorbit

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
import com.unifieddatalibrary.api.models.AntennaDetailsFull
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailDeleteParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListPage
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListPageAsync
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailsAbridged
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsync
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AntennaDetailServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AntennaDetailServiceAsync {

    private val withRawResponse: AntennaDetailServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AntennaDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailServiceAsync = AntennaDetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/antennadetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AntennaDetailsFull> =
        // get /udl/antennadetails/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/antennadetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: AntennaDetailListParams, requestOptions: RequestOptions): CompletableFuture<AntennaDetailListPageAsync> =
        // get /udl/antennadetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/antennadetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AntennaDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailServiceAsync.WithRawResponse = AntennaDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails")
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

        private val retrieveHandler: Handler<AntennaDetailsFull> = jsonHandler<AntennaDetailsFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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

        override fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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

        private val listHandler: Handler<List<AntennaDetailsAbridged>> = jsonHandler<List<AntennaDetailsAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AntennaDetailListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AntennaDetailListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails")
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
                  AntennaDetailListPageAsync.builder()
                      .service(AntennaDetailServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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
