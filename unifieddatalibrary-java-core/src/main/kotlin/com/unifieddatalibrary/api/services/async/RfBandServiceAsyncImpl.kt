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
import com.unifieddatalibrary.api.models.RfBandFull
import com.unifieddatalibrary.api.models.rfband.RfBandCountParams
import com.unifieddatalibrary.api.models.rfband.RfBandCreateParams
import com.unifieddatalibrary.api.models.rfband.RfBandDeleteParams
import com.unifieddatalibrary.api.models.rfband.RfBandGetParams
import com.unifieddatalibrary.api.models.rfband.RfBandListPage
import com.unifieddatalibrary.api.models.rfband.RfBandListPageAsync
import com.unifieddatalibrary.api.models.rfband.RfBandListParams
import com.unifieddatalibrary.api.models.rfband.RfBandListResponse
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpParams
import com.unifieddatalibrary.api.models.rfband.RfBandQueryhelpResponse
import com.unifieddatalibrary.api.models.rfband.RfBandTupleParams
import com.unifieddatalibrary.api.models.rfband.RfBandUpdateParams
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfBandServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RfBandServiceAsync {

    private val withRawResponse: RfBandServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RfBandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandServiceAsync = RfBandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RfBandCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/rfband
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: RfBandUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/rfband/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: RfBandListParams, requestOptions: RequestOptions): CompletableFuture<RfBandListPageAsync> =
        // get /udl/rfband
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/rfband/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: RfBandCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/rfband/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: RfBandGetParams, requestOptions: RequestOptions): CompletableFuture<RfBandFull> =
        // get /udl/rfband/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: RfBandQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<RfBandQueryhelpResponse> =
        // get /udl/rfband/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions): CompletableFuture<List<RfBandFull>> =
        // get /udl/rfband/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RfBandServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandServiceAsync.WithRawResponse = RfBandServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: RfBandCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband")
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

        override fun update(params: RfBandUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", params._pathParam(0))
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

        private val listHandler: Handler<List<RfBandListResponse>> = jsonHandler<List<RfBandListResponse>>(clientOptions.jsonMapper)

        override fun list(params: RfBandListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband")
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
                  RfBandListPageAsync.builder()
                      .service(RfBandServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: RfBandDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", params._pathParam(0))
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

        override fun count(params: RfBandCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", "count")
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

        private val getHandler: Handler<RfBandFull> = jsonHandler<RfBandFull>(clientOptions.jsonMapper)

        override fun get(params: RfBandGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", params._pathParam(0))
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

        private val queryhelpHandler: Handler<RfBandQueryhelpResponse> = jsonHandler<RfBandQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: RfBandQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RfBandQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", "queryhelp")
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

        private val tupleHandler: Handler<List<RfBandFull>> = jsonHandler<List<RfBandFull>>(clientOptions.jsonMapper)

        override fun tuple(params: RfBandTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<RfBandFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfband", "tuple")
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
