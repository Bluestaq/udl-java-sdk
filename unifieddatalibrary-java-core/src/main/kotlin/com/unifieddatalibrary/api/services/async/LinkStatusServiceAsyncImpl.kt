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
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCountParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCreateParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListPage
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListPageAsync
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleResponse
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsync
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.linkstatus.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.linkstatus.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LinkStatusServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LinkStatusServiceAsync {

    private val withRawResponse: LinkStatusServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val datalink: DatalinkServiceAsync by lazy { DatalinkServiceAsyncImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LinkStatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusServiceAsync = LinkStatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datalink(): DatalinkServiceAsync = datalink

    override fun history(): HistoryServiceAsync = history

    override fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/linkstatus
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: LinkStatusListParams, requestOptions: RequestOptions): CompletableFuture<LinkStatusListPageAsync> =
        // get /udl/linkstatus
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: LinkStatusCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/linkstatus/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: LinkStatusGetParams, requestOptions: RequestOptions): CompletableFuture<LinkStatusGetResponse> =
        // get /udl/linkstatus/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: LinkStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<LinkStatusQueryhelpResponse> =
        // get /udl/linkstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<List<LinkStatusTupleResponse>> =
        // get /udl/linkstatus/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LinkStatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val datalink: DatalinkServiceAsync.WithRawResponse by lazy { DatalinkServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusServiceAsync.WithRawResponse = LinkStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun datalink(): DatalinkServiceAsync.WithRawResponse = datalink

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus")
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

        private val listHandler: Handler<List<LinkStatusListResponse>> = jsonHandler<List<LinkStatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: LinkStatusListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus")
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
                  LinkStatusListPageAsync.builder()
                      .service(LinkStatusServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: LinkStatusCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus", "count")
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

        private val getHandler: Handler<LinkStatusGetResponse> = jsonHandler<LinkStatusGetResponse>(clientOptions.jsonMapper)

        override fun get(params: LinkStatusGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LinkStatusQueryhelpResponse> = jsonHandler<LinkStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: LinkStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LinkStatusQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<LinkStatusTupleResponse>> = jsonHandler<List<LinkStatusTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: LinkStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<LinkStatusTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "linkstatus", "tuple")
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
