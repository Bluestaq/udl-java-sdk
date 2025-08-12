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
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListPage
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListPageAsync
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleResponse
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteRemarkServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SiteRemarkServiceAsync {

    private val withRawResponse: SiteRemarkServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SiteRemarkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteRemarkServiceAsync = SiteRemarkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SiteRemarkCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/siteremark
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: SiteRemarkListParams, requestOptions: RequestOptions): CompletableFuture<SiteRemarkListPageAsync> =
        // get /udl/siteremark
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: SiteRemarkCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/siteremark/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: SiteRemarkGetParams, requestOptions: RequestOptions): CompletableFuture<SiteRemarkGetResponse> =
        // get /udl/siteremark/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SiteRemarkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SiteRemarkQueryhelpResponse> =
        // get /udl/siteremark/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SiteRemarkTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SiteRemarkTupleResponse>> =
        // get /udl/siteremark/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SiteRemarkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteRemarkServiceAsync.WithRawResponse = SiteRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SiteRemarkCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark")
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

        private val listHandler: Handler<List<SiteRemarkListResponse>> = jsonHandler<List<SiteRemarkListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SiteRemarkListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteRemarkListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark")
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
                  SiteRemarkListPageAsync.builder()
                      .service(SiteRemarkServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SiteRemarkCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark", "count")
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

        private val getHandler: Handler<SiteRemarkGetResponse> = jsonHandler<SiteRemarkGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SiteRemarkGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SiteRemarkQueryhelpResponse> = jsonHandler<SiteRemarkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SiteRemarkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SiteRemarkQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark", "queryhelp")
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

        private val tupleHandler: Handler<List<SiteRemarkTupleResponse>> = jsonHandler<List<SiteRemarkTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SiteRemarkTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SiteRemarkTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteremark", "tuple")
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
