// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

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
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPage
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListPageAsync
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyListParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftSortyUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsorties.AircraftsortieAbridged
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AircraftSortyServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AircraftSortyServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AircraftSortyServiceAsync {

    private val withRawResponse: AircraftSortyServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AircraftSortyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyServiceAsync = AircraftSortyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AircraftSortyCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/aircraftsortie
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: AircraftSortyListParams, requestOptions: RequestOptions): CompletableFuture<AircraftSortyListPageAsync> =
        // get /udl/aircraftsortie
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: AircraftSortyCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/aircraftsortie/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: AircraftSortyCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/aircraftsortie/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun historyAodr(params: AircraftSortyHistoryAodrParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // get /udl/aircraftsortie/history/aodr
        withRawResponse().historyAodr(params, requestOptions).thenAccept {}

    override fun historyCount(params: AircraftSortyHistoryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/aircraftsortie/history/count
        withRawResponse().historyCount(params, requestOptions).thenApply { it.parse() }

    override fun historyQuery(params: AircraftSortyHistoryQueryParams, requestOptions: RequestOptions): CompletableFuture<List<AircraftsortieFull>> =
        // get /udl/aircraftsortie/history
        withRawResponse().historyQuery(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-aircraftsortie
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AircraftSortyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyServiceAsync.WithRawResponse = AircraftSortyServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AircraftSortyCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie")
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

        private val listHandler: Handler<List<AircraftsortieAbridged>> = jsonHandler<List<AircraftsortieAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AircraftSortyListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftSortyListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie")
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
                  AircraftSortyListPageAsync.builder()
                      .service(AircraftSortyServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AircraftSortyCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie", "count")
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

        override fun createBulk(params: AircraftSortyCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie", "createBulk")
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

        private val historyAodrHandler: Handler<Void?> = emptyHandler()

        override fun historyAodr(params: AircraftSortyHistoryAodrParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie", "history", "aodr")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  historyAodrHandler.handle(it)
              }
          } }
        }

        private val historyCountHandler: Handler<String> = stringHandler()

        override fun historyCount(params: AircraftSortyHistoryCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie", "history", "count")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  historyCountHandler.handle(it)
              }
          } }
        }

        private val historyQueryHandler: Handler<List<AircraftsortieFull>> = jsonHandler<List<AircraftsortieFull>>(clientOptions.jsonMapper)

        override fun historyQuery(params: AircraftSortyHistoryQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftsortie", "history")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  historyQueryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: AircraftSortyUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-aircraftsortie")
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
