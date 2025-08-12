// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCountParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCreateBulkParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListPage
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListPageAsync
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.orbittrack.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.orbittrack.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OrbittrackServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OrbittrackServiceAsync {

    private val withRawResponse: OrbittrackServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrbittrackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackServiceAsync = OrbittrackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: OrbittrackListParams, requestOptions: RequestOptions): CompletableFuture<OrbittrackListPageAsync> =
        // get /udl/orbittrack
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: OrbittrackCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/orbittrack/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/orbittrack/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: OrbittrackQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OrbittrackQueryhelpResponse> =
        // get /udl/orbittrack/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OrbittrackTupleResponse>> =
        // get /udl/orbittrack/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-orbittrack
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OrbittrackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackServiceAsync.WithRawResponse = OrbittrackServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<OrbittrackListResponse>> = jsonHandler<List<OrbittrackListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OrbittrackListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbittrackListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbittrack")
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
                  OrbittrackListPageAsync.builder()
                      .service(OrbittrackServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OrbittrackCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbittrack", "count")
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

        override fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbittrack", "createBulk")
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

        private val queryhelpHandler: Handler<OrbittrackQueryhelpResponse> = jsonHandler<OrbittrackQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OrbittrackQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbittrackQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbittrack", "queryhelp")
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

        private val tupleHandler: Handler<List<OrbittrackTupleResponse>> = jsonHandler<List<OrbittrackTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OrbittrackTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbittrack", "tuple")
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

        override fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-orbittrack")
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
