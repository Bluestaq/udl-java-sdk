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
import com.unifieddatalibrary.api.models.EventEvolutionFull
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCountParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateBulkParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListPage
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListPageAsync
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListResponse
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpResponse
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionRetrieveParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionTupleParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.eventevolution.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.eventevolution.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventEvolutionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EventEvolutionServiceAsync {

    private val withRawResponse: EventEvolutionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EventEvolutionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventEvolutionServiceAsync = EventEvolutionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: EventEvolutionCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/eventevolution
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EventEvolutionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EventEvolutionFull> =
        // get /udl/eventevolution/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: EventEvolutionListParams, requestOptions: RequestOptions): CompletableFuture<EventEvolutionListPageAsync> =
        // get /udl/eventevolution
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: EventEvolutionCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/eventevolution/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: EventEvolutionCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/eventevolution/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: EventEvolutionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<EventEvolutionQueryhelpResponse> =
        // get /udl/eventevolution/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EventEvolutionTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EventEvolutionFull>> =
        // get /udl/eventevolution/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-eventevolution
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EventEvolutionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventEvolutionServiceAsync.WithRawResponse = EventEvolutionServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EventEvolutionCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution")
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

        private val retrieveHandler: Handler<EventEvolutionFull> = jsonHandler<EventEvolutionFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EventEvolutionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EventEvolutionFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution", params._pathParam(0))
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

        private val listHandler: Handler<List<EventEvolutionListResponse>> = jsonHandler<List<EventEvolutionListResponse>>(clientOptions.jsonMapper)

        override fun list(params: EventEvolutionListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EventEvolutionListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution")
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
                  EventEvolutionListPageAsync.builder()
                      .service(EventEvolutionServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: EventEvolutionCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution", "count")
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

        override fun createBulk(params: EventEvolutionCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution", "createBulk")
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

        private val queryhelpHandler: Handler<EventEvolutionQueryhelpResponse> = jsonHandler<EventEvolutionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: EventEvolutionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EventEvolutionQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution", "queryhelp")
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

        private val tupleHandler: Handler<List<EventEvolutionFull>> = jsonHandler<List<EventEvolutionFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EventEvolutionTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EventEvolutionFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eventevolution", "tuple")
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

        override fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-eventevolution")
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
