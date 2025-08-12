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
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCountParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCreateBulkParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListPage
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListPageAsync
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.isrcollections.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.isrcollections.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class IsrCollectionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : IsrCollectionServiceAsync {

    private val withRawResponse: IsrCollectionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IsrCollectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsrCollectionServiceAsync = IsrCollectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: IsrCollectionListParams, requestOptions: RequestOptions): CompletableFuture<IsrCollectionListPageAsync> =
        // get /udl/isrcollection
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: IsrCollectionCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/isrcollection/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: IsrCollectionCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/isrcollection/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: IsrCollectionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<IsrCollectionQueryhelpResponse> =
        // get /udl/isrcollection/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: IsrCollectionTupleParams, requestOptions: RequestOptions): CompletableFuture<List<IsrCollectionTupleResponse>> =
        // get /udl/isrcollection/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: IsrCollectionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-isrcollection
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : IsrCollectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsrCollectionServiceAsync.WithRawResponse = IsrCollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<IsrCollectionListResponse>> = jsonHandler<List<IsrCollectionListResponse>>(clientOptions.jsonMapper)

        override fun list(params: IsrCollectionListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IsrCollectionListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "isrcollection")
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
                  IsrCollectionListPageAsync.builder()
                      .service(IsrCollectionServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: IsrCollectionCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "isrcollection", "count")
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

        override fun createBulk(params: IsrCollectionCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "isrcollection", "createBulk")
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

        private val queryhelpHandler: Handler<IsrCollectionQueryhelpResponse> = jsonHandler<IsrCollectionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: IsrCollectionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IsrCollectionQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "isrcollection", "queryhelp")
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

        private val tupleHandler: Handler<List<IsrCollectionTupleResponse>> = jsonHandler<List<IsrCollectionTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: IsrCollectionTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<IsrCollectionTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "isrcollection", "tuple")
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

        override fun unvalidatedPublish(params: IsrCollectionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-isrcollection")
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
