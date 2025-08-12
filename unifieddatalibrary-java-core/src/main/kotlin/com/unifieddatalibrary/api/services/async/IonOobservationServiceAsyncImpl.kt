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
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCountParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListPage
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListPageAsync
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ionoobservations.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ionoobservations.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class IonoObservationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : IonoObservationServiceAsync {

    private val withRawResponse: IonoObservationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IonoObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationServiceAsync = IonoObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: IonoObservationListParams, requestOptions: RequestOptions): CompletableFuture<IonoObservationListPageAsync> =
        // get /udl/ionoobservation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: IonoObservationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/ionoobservation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: IonoObservationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/ionoobservation/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: IonoObservationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<IonoObservationQueryhelpResponse> =
        // get /udl/ionoobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: IonoObservationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<IonoObservationTupleResponse>> =
        // get /udl/ionoobservation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-ionoobs
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : IonoObservationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationServiceAsync.WithRawResponse = IonoObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<IonoObservationListResponse>> = jsonHandler<List<IonoObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: IonoObservationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IonoObservationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation")
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
                  IonoObservationListPageAsync.builder()
                      .service(IonoObservationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: IonoObservationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "count")
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

        override fun createBulk(params: IonoObservationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "createBulk")
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

        private val queryhelpHandler: Handler<IonoObservationQueryhelpResponse> = jsonHandler<IonoObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: IonoObservationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IonoObservationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<IonoObservationTupleResponse>> = jsonHandler<List<IonoObservationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: IonoObservationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<IonoObservationTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "tuple")
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

        override fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-ionoobs")
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
