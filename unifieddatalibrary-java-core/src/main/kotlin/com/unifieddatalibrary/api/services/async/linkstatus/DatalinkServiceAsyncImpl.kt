// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.linkstatus

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
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCountParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCreateParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListPage
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListPageAsync
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsync
import com.unifieddatalibrary.api.services.async.linkstatus.DatalinkServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DatalinkServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DatalinkServiceAsync {

    private val withRawResponse: DatalinkServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DatalinkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkServiceAsync = DatalinkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DatalinkCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/datalink
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: DatalinkListParams, requestOptions: RequestOptions): CompletableFuture<DatalinkListPageAsync> =
        // get /udl/datalink
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: DatalinkCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/datalink/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: DatalinkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<DatalinkQueryhelpResponse> =
        // get /udl/datalink/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions): CompletableFuture<List<DatalinkTupleResponse>> =
        // get /udl/datalink/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-datalink
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DatalinkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkServiceAsync.WithRawResponse = DatalinkServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: DatalinkCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink")
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

        private val listHandler: Handler<List<DatalinkListResponse>> = jsonHandler<List<DatalinkListResponse>>(clientOptions.jsonMapper)

        override fun list(params: DatalinkListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DatalinkListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink")
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
                  DatalinkListPageAsync.builder()
                      .service(DatalinkServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: DatalinkCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "count")
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

        private val queryhelpHandler: Handler<DatalinkQueryhelpResponse> = jsonHandler<DatalinkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: DatalinkQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DatalinkQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "queryhelp")
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

        private val tupleHandler: Handler<List<DatalinkTupleResponse>> = jsonHandler<List<DatalinkTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<DatalinkTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "tuple")
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

        override fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-datalink")
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
