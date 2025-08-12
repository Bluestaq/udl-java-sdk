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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.sigact.SigactCountParams
import com.unifieddatalibrary.api.models.sigact.SigactCreateBulkParams
import com.unifieddatalibrary.api.models.sigact.SigactListPage
import com.unifieddatalibrary.api.models.sigact.SigactListPageAsync
import com.unifieddatalibrary.api.models.sigact.SigactListParams
import com.unifieddatalibrary.api.models.sigact.SigactListResponse
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpParams
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpResponse
import com.unifieddatalibrary.api.models.sigact.SigactTupleParams
import com.unifieddatalibrary.api.models.sigact.SigactTupleResponse
import com.unifieddatalibrary.api.models.sigact.SigactUploadZipParams
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import com.unifieddatalibrary.api.services.async.SigactServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.sigact.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.sigact.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SigactServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SigactServiceAsync {

    private val withRawResponse: SigactServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SigactServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SigactServiceAsync = SigactServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: SigactListParams, requestOptions: RequestOptions): CompletableFuture<SigactListPageAsync> =
        // get /udl/sigact
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: SigactCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/sigact/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: SigactCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sigact/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: SigactQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SigactQueryhelpResponse> =
        // get /udl/sigact/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SigactTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SigactTupleResponse>> =
        // get /udl/sigact/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun uploadZip(params: SigactUploadZipParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-sigact-text
        withRawResponse().uploadZip(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SigactServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SigactServiceAsync.WithRawResponse = SigactServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<SigactListResponse>> = jsonHandler<List<SigactListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SigactListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SigactListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sigact")
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
                  SigactListPageAsync.builder()
                      .service(SigactServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SigactCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sigact", "count")
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

        override fun createBulk(params: SigactCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sigact", "createBulk")
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

        private val queryhelpHandler: Handler<SigactQueryhelpResponse> = jsonHandler<SigactQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SigactQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SigactQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sigact", "queryhelp")
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

        private val tupleHandler: Handler<List<SigactTupleResponse>> = jsonHandler<List<SigactTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SigactTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SigactTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sigact", "tuple")
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

        override fun uploadZip(params: SigactUploadZipParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-sigact-text")
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
