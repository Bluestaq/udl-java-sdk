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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryCountParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryFileGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListPage
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListPageAsync
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryUploadZipParams
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.skyimagery.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.skyimagery.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SkyImageryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SkyImageryServiceAsync {

    private val withRawResponse: SkyImageryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SkyImageryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryServiceAsync = SkyImageryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: SkyImageryListParams, requestOptions: RequestOptions): CompletableFuture<SkyImageryListPageAsync> =
        // get /udl/skyimagery
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: SkyImageryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/skyimagery/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        // get /udl/skyimagery/getFile/{id}
        withRawResponse().fileGet(params, requestOptions)

    override fun get(params: SkyImageryGetParams, requestOptions: RequestOptions): CompletableFuture<SkyImageryGetResponse> =
        // get /udl/skyimagery/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SkyImageryQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SkyImageryQueryhelpResponse> =
        // get /udl/skyimagery/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SkyImageryTupleResponse>> =
        // get /udl/skyimagery/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-skyimagery
        withRawResponse().uploadZip(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SkyImageryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryServiceAsync.WithRawResponse = SkyImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<SkyImageryListResponse>> = jsonHandler<List<SkyImageryListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SkyImageryListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SkyImageryListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery")
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
                  SkyImageryListPageAsync.builder()
                      .service(SkyImageryServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SkyImageryCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "count")
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

        override fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "getFile", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response) }
        }

        private val getHandler: Handler<SkyImageryGetResponse> = jsonHandler<SkyImageryGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SkyImageryGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SkyImageryGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SkyImageryQueryhelpResponse> = jsonHandler<SkyImageryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SkyImageryQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SkyImageryQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "queryhelp")
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

        private val tupleHandler: Handler<List<SkyImageryTupleResponse>> = jsonHandler<List<SkyImageryTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SkyImageryTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "tuple")
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

        private val uploadZipHandler: Handler<Void?> = emptyHandler()

        override fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl() else "https://imagery.unifieddatalibrary.com")
            .addPathSegments("filedrop", "udl-skyimagery")
            .body(multipartFormData(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  uploadZipHandler.handle(it)
              }
          } }
        }
    }
}
