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
import com.unifieddatalibrary.api.models.hazard.HazardCountParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateBulkParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateParams
import com.unifieddatalibrary.api.models.hazard.HazardGetParams
import com.unifieddatalibrary.api.models.hazard.HazardGetResponse
import com.unifieddatalibrary.api.models.hazard.HazardListPage
import com.unifieddatalibrary.api.models.hazard.HazardListPageAsync
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardListResponse
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpResponse
import com.unifieddatalibrary.api.models.hazard.HazardTupleParams
import com.unifieddatalibrary.api.models.hazard.HazardTupleResponse
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.HazardServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.hazard.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.hazard.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HazardServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : HazardServiceAsync {

    private val withRawResponse: HazardServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): HazardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardServiceAsync = HazardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: HazardCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/hazard
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: HazardListParams, requestOptions: RequestOptions): CompletableFuture<HazardListPageAsync> =
        // get /udl/hazard
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: HazardCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/hazard/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/hazard/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: HazardGetParams, requestOptions: RequestOptions): CompletableFuture<HazardGetResponse> =
        // get /udl/hazard/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: HazardQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HazardQueryhelpResponse> =
        // get /udl/hazard/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: HazardTupleParams, requestOptions: RequestOptions): CompletableFuture<List<HazardTupleResponse>> =
        // get /udl/hazard/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : HazardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardServiceAsync.WithRawResponse = HazardServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: HazardCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard")
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

        private val listHandler: Handler<List<HazardListResponse>> = jsonHandler<List<HazardListResponse>>(clientOptions.jsonMapper)

        override fun list(params: HazardListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HazardListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard")
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
                  HazardListPageAsync.builder()
                      .service(HazardServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: HazardCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard", "count")
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

        override fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard", "createBulk")
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

        private val getHandler: Handler<HazardGetResponse> = jsonHandler<HazardGetResponse>(clientOptions.jsonMapper)

        override fun get(params: HazardGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HazardGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard", params._pathParam(0))
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

        private val queryhelpHandler: Handler<HazardQueryhelpResponse> = jsonHandler<HazardQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: HazardQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HazardQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard", "queryhelp")
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

        private val tupleHandler: Handler<List<HazardTupleResponse>> = jsonHandler<List<HazardTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: HazardTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<HazardTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "hazard", "tuple")
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
