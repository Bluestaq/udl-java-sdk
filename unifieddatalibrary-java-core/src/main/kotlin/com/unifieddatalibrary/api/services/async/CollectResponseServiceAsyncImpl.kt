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
import com.unifieddatalibrary.api.models.CollectResponseFull
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseAbridged
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCountParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListPage
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListPageAsync
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseRetrieveParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.collectresponses.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.collectresponses.HistoryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.collectresponses.TupleServiceAsync
import com.unifieddatalibrary.api.services.async.collectresponses.TupleServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CollectResponseServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CollectResponseServiceAsync {

    private val withRawResponse: CollectResponseServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    private val tuple: TupleServiceAsync by lazy { TupleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CollectResponseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseServiceAsync = CollectResponseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun tuple(): TupleServiceAsync = tuple

    override fun create(params: CollectResponseCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/collectresponse
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: CollectResponseRetrieveParams, requestOptions: RequestOptions): CompletableFuture<CollectResponseFull> =
        // get /udl/collectresponse/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: CollectResponseListParams, requestOptions: RequestOptions): CompletableFuture<CollectResponseListPageAsync> =
        // get /udl/collectresponse
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: CollectResponseCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/collectresponse/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: CollectResponseCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/collectresponse/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: CollectResponseQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<CollectResponseQueryHelpResponse> =
        // get /udl/collectresponse/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-collectresponse
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CollectResponseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val tuple: TupleServiceAsync.WithRawResponse by lazy { TupleServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseServiceAsync.WithRawResponse = CollectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        override fun tuple(): TupleServiceAsync.WithRawResponse = tuple

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CollectResponseCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse")
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

        private val retrieveHandler: Handler<CollectResponseFull> = jsonHandler<CollectResponseFull>(clientOptions.jsonMapper)

        override fun retrieve(params: CollectResponseRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectResponseFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse", params._pathParam(0))
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

        private val listHandler: Handler<List<CollectResponseAbridged>> = jsonHandler<List<CollectResponseAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CollectResponseListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectResponseListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse")
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
                  CollectResponseListPageAsync.builder()
                      .service(CollectResponseServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: CollectResponseCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse", "count")
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

        override fun createBulk(params: CollectResponseCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse", "createBulk")
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

        private val queryHelpHandler: Handler<CollectResponseQueryHelpResponse> = jsonHandler<CollectResponseQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: CollectResponseQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectResponseQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectresponse", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-collectresponse")
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
