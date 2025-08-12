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
import com.unifieddatalibrary.api.models.OperatingUnitRemarkFull
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListPage
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListPageAsync
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OperatingunitremarkServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OperatingunitremarkServiceAsync {

    private val withRawResponse: OperatingunitremarkServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OperatingunitremarkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkServiceAsync = OperatingunitremarkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/operatingunitremark
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: OperatingunitremarkListParams, requestOptions: RequestOptions): CompletableFuture<OperatingunitremarkListPageAsync> =
        // get /udl/operatingunitremark
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: OperatingunitremarkCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/operatingunitremark/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/operatingunitremark/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions): CompletableFuture<OperatingUnitRemarkFull> =
        // get /udl/operatingunitremark/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OperatingunitremarkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OperatingunitremarkQueryhelpResponse> =
        // get /udl/operatingunitremark/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OperatingUnitRemarkFull>> =
        // get /udl/operatingunitremark/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OperatingunitremarkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkServiceAsync.WithRawResponse = OperatingunitremarkServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark")
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

        private val listHandler: Handler<List<OperatingunitremarkListResponse>> = jsonHandler<List<OperatingunitremarkListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OperatingunitremarkListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingunitremarkListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark")
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
                  OperatingunitremarkListPageAsync.builder()
                      .service(OperatingunitremarkServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OperatingunitremarkCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "count")
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

        override fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "createBulk")
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

        private val getHandler: Handler<OperatingUnitRemarkFull> = jsonHandler<OperatingUnitRemarkFull>(clientOptions.jsonMapper)

        override fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingUnitRemarkFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OperatingunitremarkQueryhelpResponse> = jsonHandler<OperatingunitremarkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OperatingunitremarkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OperatingunitremarkQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "queryhelp")
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

        private val tupleHandler: Handler<List<OperatingUnitRemarkFull>> = jsonHandler<List<OperatingUnitRemarkFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OperatingUnitRemarkFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "tuple")
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
