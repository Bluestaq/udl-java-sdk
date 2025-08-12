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
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCountParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateBulkParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationDeleteParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryHelpParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryHelpResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationRetrieveParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationRetrieveResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationTupleParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationTupleResponse
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsync
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmitterGeolocationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EmitterGeolocationServiceAsync {

    private val withRawResponse: EmitterGeolocationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EmitterGeolocationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmitterGeolocationServiceAsync = EmitterGeolocationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EmitterGeolocationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/emittergeolocation
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EmitterGeolocationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EmitterGeolocationRetrieveResponse> =
        // get /udl/emittergeolocation/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: EmitterGeolocationDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/emittergeolocation/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: EmitterGeolocationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/emittergeolocation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: EmitterGeolocationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/emittergeolocation/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun query(params: EmitterGeolocationQueryParams, requestOptions: RequestOptions): CompletableFuture<List<EmitterGeolocationQueryResponse>> =
        // get /udl/emittergeolocation
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: EmitterGeolocationQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<EmitterGeolocationQueryHelpResponse> =
        // get /udl/emittergeolocation/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EmitterGeolocationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EmitterGeolocationTupleResponse>> =
        // get /udl/emittergeolocation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: EmitterGeolocationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-emittergeolocation
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EmitterGeolocationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmitterGeolocationServiceAsync.WithRawResponse = EmitterGeolocationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EmitterGeolocationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation")
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

        private val retrieveHandler: Handler<EmitterGeolocationRetrieveResponse> = jsonHandler<EmitterGeolocationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: EmitterGeolocationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EmitterGeolocationRetrieveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EmitterGeolocationDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", params._pathParam(0))
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

        override fun count(params: EmitterGeolocationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", "count")
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

        override fun createBulk(params: EmitterGeolocationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", "createBulk")
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

        private val queryHandler: Handler<List<EmitterGeolocationQueryResponse>> = jsonHandler<List<EmitterGeolocationQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: EmitterGeolocationQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EmitterGeolocationQueryResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val queryHelpHandler: Handler<EmitterGeolocationQueryHelpResponse> = jsonHandler<EmitterGeolocationQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EmitterGeolocationQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EmitterGeolocationQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", "queryhelp")
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

        private val tupleHandler: Handler<List<EmitterGeolocationTupleResponse>> = jsonHandler<List<EmitterGeolocationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: EmitterGeolocationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EmitterGeolocationTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "emittergeolocation", "tuple")
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

        override fun unvalidatedPublish(params: EmitterGeolocationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-emittergeolocation")
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
