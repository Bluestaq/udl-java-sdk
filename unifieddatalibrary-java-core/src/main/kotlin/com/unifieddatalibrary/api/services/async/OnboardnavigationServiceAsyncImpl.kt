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
import com.unifieddatalibrary.api.models.OnboardnavigationFull
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCreateBulkParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListPage
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListPageAsync
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationTupleParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.onboardnavigation.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.onboardnavigation.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OnboardnavigationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnboardnavigationServiceAsync {

    private val withRawResponse: OnboardnavigationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OnboardnavigationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardnavigationServiceAsync = OnboardnavigationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: OnboardnavigationListParams, requestOptions: RequestOptions): CompletableFuture<OnboardnavigationListPageAsync> =
        // get /udl/onboardnavigation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: OnboardnavigationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/onboardnavigation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: OnboardnavigationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onboardnavigation/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: OnboardnavigationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OnboardnavigationQueryhelpResponse> =
        // get /udl/onboardnavigation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OnboardnavigationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OnboardnavigationFull>> =
        // get /udl/onboardnavigation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: OnboardnavigationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-onboardnavigation
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnboardnavigationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardnavigationServiceAsync.WithRawResponse = OnboardnavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<OnboardnavigationListResponse>> = jsonHandler<List<OnboardnavigationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnboardnavigationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnboardnavigationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onboardnavigation")
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
                  OnboardnavigationListPageAsync.builder()
                      .service(OnboardnavigationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OnboardnavigationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onboardnavigation", "count")
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

        override fun createBulk(params: OnboardnavigationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onboardnavigation", "createBulk")
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

        private val queryhelpHandler: Handler<OnboardnavigationQueryhelpResponse> = jsonHandler<OnboardnavigationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnboardnavigationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnboardnavigationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onboardnavigation", "queryhelp")
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

        private val tupleHandler: Handler<List<OnboardnavigationFull>> = jsonHandler<List<OnboardnavigationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OnboardnavigationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OnboardnavigationFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onboardnavigation", "tuple")
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

        override fun unvalidatedPublish(params: OnboardnavigationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-onboardnavigation")
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
