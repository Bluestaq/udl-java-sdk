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
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCountParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCreateBulkParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListPage
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListPageAsync
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationTupleParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.spaceenvobservation.history.SpaceEnvObservationFull
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.spaceenvobservation.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.spaceenvobservation.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SpaceEnvObservationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SpaceEnvObservationServiceAsync {

    private val withRawResponse: SpaceEnvObservationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SpaceEnvObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationServiceAsync = SpaceEnvObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions): CompletableFuture<SpaceEnvObservationListPageAsync> =
        // get /udl/spaceenvobservation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/spaceenvobservation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/spaceenvobservation/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: SpaceEnvObservationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SpaceEnvObservationQueryhelpResponse> =
        // get /udl/spaceenvobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SpaceEnvObservationFull>> =
        // get /udl/spaceenvobservation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-spaceenvobs
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SpaceEnvObservationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationServiceAsync.WithRawResponse = SpaceEnvObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<SpaceEnvObservationListResponse>> = jsonHandler<List<SpaceEnvObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SpaceEnvObservationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation")
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
                  SpaceEnvObservationListPageAsync.builder()
                      .service(SpaceEnvObservationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "count")
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

        override fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "createBulk")
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

        private val queryhelpHandler: Handler<SpaceEnvObservationQueryhelpResponse> = jsonHandler<SpaceEnvObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SpaceEnvObservationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SpaceEnvObservationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<SpaceEnvObservationFull>> = jsonHandler<List<SpaceEnvObservationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SpaceEnvObservationFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "tuple")
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

        override fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-spaceenvobs")
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
