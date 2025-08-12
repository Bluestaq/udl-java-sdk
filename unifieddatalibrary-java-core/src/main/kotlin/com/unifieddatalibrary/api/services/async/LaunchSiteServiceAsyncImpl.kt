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
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteDeleteParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListPage
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListPageAsync
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchSiteServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LaunchSiteServiceAsync {

    private val withRawResponse: LaunchSiteServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): LaunchSiteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteServiceAsync = LaunchSiteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaunchSiteCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/launchsite
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: LaunchSiteUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/launchsite/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: LaunchSiteListParams, requestOptions: RequestOptions): CompletableFuture<LaunchSiteListPageAsync> =
        // get /udl/launchsite
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: LaunchSiteDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/launchsite/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: LaunchSiteCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/launchsite/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: LaunchSiteGetParams, requestOptions: RequestOptions): CompletableFuture<LaunchSiteGetResponse> =
        // get /udl/launchsite/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: LaunchSiteQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<LaunchSiteQueryhelpResponse> =
        // get /udl/launchsite/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: LaunchSiteTupleParams, requestOptions: RequestOptions): CompletableFuture<List<LaunchSiteTupleResponse>> =
        // get /udl/launchsite/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LaunchSiteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteServiceAsync.WithRawResponse = LaunchSiteServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: LaunchSiteCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite")
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

        override fun update(params: LaunchSiteUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", params._pathParam(0))
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

        private val listHandler: Handler<List<LaunchSiteListResponse>> = jsonHandler<List<LaunchSiteListResponse>>(clientOptions.jsonMapper)

        override fun list(params: LaunchSiteListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LaunchSiteListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite")
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
                  LaunchSiteListPageAsync.builder()
                      .service(LaunchSiteServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: LaunchSiteDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", params._pathParam(0))
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

        override fun count(params: LaunchSiteCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", "count")
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

        private val getHandler: Handler<LaunchSiteGetResponse> = jsonHandler<LaunchSiteGetResponse>(clientOptions.jsonMapper)

        override fun get(params: LaunchSiteGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchSiteQueryhelpResponse> = jsonHandler<LaunchSiteQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: LaunchSiteQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LaunchSiteQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchSiteTupleResponse>> = jsonHandler<List<LaunchSiteTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: LaunchSiteTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<LaunchSiteTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchsite", "tuple")
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
