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
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCountParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateBulkParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListPage
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListPageAsync
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.maneuvers.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.maneuvers.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManeuverServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ManeuverServiceAsync {

    private val withRawResponse: ManeuverServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ManeuverServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverServiceAsync = ManeuverServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: ManeuverCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/maneuver
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: ManeuverListParams, requestOptions: RequestOptions): CompletableFuture<ManeuverListPageAsync> =
        // get /udl/maneuver
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: ManeuverCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/maneuver/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: ManeuverCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/maneuver/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: ManeuverGetParams, requestOptions: RequestOptions): CompletableFuture<ManeuverGetResponse> =
        // get /udl/maneuver/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: ManeuverQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<ManeuverQueryhelpResponse> =
        // get /udl/maneuver/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: ManeuverTupleParams, requestOptions: RequestOptions): CompletableFuture<List<ManeuverTupleResponse>> =
        // get /udl/maneuver/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-maneuver
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ManeuverServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverServiceAsync.WithRawResponse = ManeuverServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: ManeuverCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver")
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

        private val listHandler: Handler<List<ManeuverListResponse>> = jsonHandler<List<ManeuverListResponse>>(clientOptions.jsonMapper)

        override fun list(params: ManeuverListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManeuverListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver")
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
                  ManeuverListPageAsync.builder()
                      .service(ManeuverServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: ManeuverCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver", "count")
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

        override fun createBulk(params: ManeuverCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver", "createBulk")
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

        private val getHandler: Handler<ManeuverGetResponse> = jsonHandler<ManeuverGetResponse>(clientOptions.jsonMapper)

        override fun get(params: ManeuverGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManeuverGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ManeuverQueryhelpResponse> = jsonHandler<ManeuverQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: ManeuverQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ManeuverQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver", "queryhelp")
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

        private val tupleHandler: Handler<List<ManeuverTupleResponse>> = jsonHandler<List<ManeuverTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: ManeuverTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<ManeuverTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "maneuver", "tuple")
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

        override fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-maneuver")
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
