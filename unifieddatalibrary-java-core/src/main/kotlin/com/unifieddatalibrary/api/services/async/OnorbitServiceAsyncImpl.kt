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
import com.unifieddatalibrary.api.models.OnorbitFull
import com.unifieddatalibrary.api.models.onorbit.OnorbitCountParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitCreateParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitDeleteParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitListPage
import com.unifieddatalibrary.api.models.onorbit.OnorbitListPageAsync
import com.unifieddatalibrary.api.models.onorbit.OnorbitListParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitListResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitTupleParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitUpdateParams
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsync
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitServiceAsync {

    private val withRawResponse: OnorbitServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val antennaDetails: AntennaDetailServiceAsync by lazy { AntennaDetailServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OnorbitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitServiceAsync = OnorbitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun antennaDetails(): AntennaDetailServiceAsync = antennaDetails

    override fun create(params: OnorbitCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/onorbit
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: OnorbitUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/onorbit/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: OnorbitListParams, requestOptions: RequestOptions): CompletableFuture<OnorbitListPageAsync> =
        // get /udl/onorbit
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OnorbitDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/onorbit/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: OnorbitCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/onorbit/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: OnorbitGetParams, requestOptions: RequestOptions): CompletableFuture<OnorbitFull> =
        // get /udl/onorbit/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getSignature(params: OnorbitGetSignatureParams, requestOptions: RequestOptions): CompletableFuture<OnorbitGetSignatureResponse> =
        // get /udl/onorbit/getSignature
        withRawResponse().getSignature(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OnorbitQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OnorbitQueryhelpResponse> =
        // get /udl/onorbit/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OnorbitTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OnorbitFull>> =
        // get /udl/onorbit/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val antennaDetails: AntennaDetailServiceAsync.WithRawResponse by lazy { AntennaDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitServiceAsync.WithRawResponse = OnorbitServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun antennaDetails(): AntennaDetailServiceAsync.WithRawResponse = antennaDetails

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit")
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

        override fun update(params: OnorbitUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitListResponse>> = jsonHandler<List<OnorbitListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit")
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
                  OnorbitListPageAsync.builder()
                      .service(OnorbitServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", params._pathParam(0))
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

        override fun count(params: OnorbitCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", "count")
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

        private val getHandler: Handler<OnorbitFull> = jsonHandler<OnorbitFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", params._pathParam(0))
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

        private val getSignatureHandler: Handler<OnorbitGetSignatureResponse> = jsonHandler<OnorbitGetSignatureResponse>(clientOptions.jsonMapper)

        override fun getSignature(params: OnorbitGetSignatureParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitGetSignatureResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", "getSignature")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getSignatureHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<OnorbitQueryhelpResponse> = jsonHandler<OnorbitQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnorbitQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OnorbitQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitFull>> = jsonHandler<List<OnorbitFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OnorbitTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OnorbitFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbit", "tuple")
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
