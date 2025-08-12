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
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCountParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListPage
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListPageAsync
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.effectresponses.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.effectresponses.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EffectResponseServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EffectResponseServiceAsync {

    private val withRawResponse: EffectResponseServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EffectResponseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseServiceAsync = EffectResponseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: EffectResponseCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/effectresponse
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EffectResponseRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EffectResponseRetrieveResponse> =
        // get /udl/effectresponse/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: EffectResponseListParams, requestOptions: RequestOptions): CompletableFuture<EffectResponseListPageAsync> =
        // get /udl/effectresponse
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: EffectResponseCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/effectresponse/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: EffectResponseCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/effectresponse/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: EffectResponseQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<EffectResponseQueryHelpResponse> =
        // get /udl/effectresponse/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EffectResponseTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EffectResponseTupleResponse>> =
        // get /udl/effectresponse/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-effectresponse
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EffectResponseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseServiceAsync.WithRawResponse = EffectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EffectResponseCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse")
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

        private val retrieveHandler: Handler<EffectResponseRetrieveResponse> = jsonHandler<EffectResponseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: EffectResponseRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EffectResponseRetrieveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse", params._pathParam(0))
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

        private val listHandler: Handler<List<EffectResponseListResponse>> = jsonHandler<List<EffectResponseListResponse>>(clientOptions.jsonMapper)

        override fun list(params: EffectResponseListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EffectResponseListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse")
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
                  EffectResponseListPageAsync.builder()
                      .service(EffectResponseServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: EffectResponseCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse", "count")
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

        override fun createBulk(params: EffectResponseCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse", "createBulk")
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

        private val queryHelpHandler: Handler<EffectResponseQueryHelpResponse> = jsonHandler<EffectResponseQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EffectResponseQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EffectResponseQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse", "queryhelp")
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

        private val tupleHandler: Handler<List<EffectResponseTupleResponse>> = jsonHandler<List<EffectResponseTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: EffectResponseTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EffectResponseTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "effectresponse", "tuple")
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

        override fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-effectresponse")
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
