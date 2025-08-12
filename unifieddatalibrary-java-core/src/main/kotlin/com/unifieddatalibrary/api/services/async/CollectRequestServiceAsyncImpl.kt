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
import com.unifieddatalibrary.api.models.CollectRequestFull
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestAbridged
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCountParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListPage
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListPageAsync
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpResponse
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestRetrieveParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestTupleParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.collectrequests.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.collectrequests.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CollectRequestServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CollectRequestServiceAsync {

    private val withRawResponse: CollectRequestServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CollectRequestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectRequestServiceAsync = CollectRequestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: CollectRequestCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/collectrequest
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: CollectRequestRetrieveParams, requestOptions: RequestOptions): CompletableFuture<CollectRequestFull> =
        // get /udl/collectrequest/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: CollectRequestListParams, requestOptions: RequestOptions): CompletableFuture<CollectRequestListPageAsync> =
        // get /udl/collectrequest
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: CollectRequestCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/collectrequest/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: CollectRequestCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/collectrequest/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: CollectRequestQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<CollectRequestQueryHelpResponse> =
        // get /udl/collectrequest/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: CollectRequestTupleParams, requestOptions: RequestOptions): CompletableFuture<List<CollectRequestFull>> =
        // get /udl/collectrequest/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-collectrequest
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CollectRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectRequestServiceAsync.WithRawResponse = CollectRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CollectRequestCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest")
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

        private val retrieveHandler: Handler<CollectRequestFull> = jsonHandler<CollectRequestFull>(clientOptions.jsonMapper)

        override fun retrieve(params: CollectRequestRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectRequestFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest", params._pathParam(0))
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

        private val listHandler: Handler<List<CollectRequestAbridged>> = jsonHandler<List<CollectRequestAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CollectRequestListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectRequestListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest")
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
                  CollectRequestListPageAsync.builder()
                      .service(CollectRequestServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: CollectRequestCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest", "count")
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

        override fun createBulk(params: CollectRequestCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest", "createBulk")
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

        private val queryHelpHandler: Handler<CollectRequestQueryHelpResponse> = jsonHandler<CollectRequestQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: CollectRequestQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CollectRequestQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest", "queryhelp")
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

        private val tupleHandler: Handler<List<CollectRequestFull>> = jsonHandler<List<CollectRequestFull>>(clientOptions.jsonMapper)

        override fun tuple(params: CollectRequestTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<CollectRequestFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "collectrequest", "tuple")
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

        override fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-collectrequest")
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
