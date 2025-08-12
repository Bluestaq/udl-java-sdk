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
import com.unifieddatalibrary.api.models.AircraftstatusFull
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCountParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCreateParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListPage
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListPageAsync
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusListParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusTupleParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusUpdateParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftstatusAbridged
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.aircraftstatuses.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.aircraftstatuses.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AircraftStatusServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AircraftStatusServiceAsync {

    private val withRawResponse: AircraftStatusServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AircraftStatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusServiceAsync = AircraftStatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/aircraftstatus
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AircraftstatusFull> =
        // get /udl/aircraftstatus/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/aircraftstatus/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: AircraftStatusListParams, requestOptions: RequestOptions): CompletableFuture<AircraftStatusListPageAsync> =
        // get /udl/aircraftstatus
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/aircraftstatus/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: AircraftStatusCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/aircraftstatus/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: AircraftStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<AircraftStatusQueryhelpResponse> =
        // get /udl/aircraftstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AircraftstatusFull>> =
        // get /udl/aircraftstatus/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AircraftStatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusServiceAsync.WithRawResponse = AircraftStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AircraftStatusCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus")
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

        private val retrieveHandler: Handler<AircraftstatusFull> = jsonHandler<AircraftstatusFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AircraftStatusRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftstatusFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: AircraftStatusUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", params._pathParam(0))
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

        private val listHandler: Handler<List<AircraftstatusAbridged>> = jsonHandler<List<AircraftstatusAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AircraftStatusListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus")
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
                  AircraftStatusListPageAsync.builder()
                      .service(AircraftStatusServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AircraftStatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", params._pathParam(0))
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

        override fun count(params: AircraftStatusCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", "count")
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

        private val queryhelpHandler: Handler<AircraftStatusQueryhelpResponse> = jsonHandler<AircraftStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AircraftStatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AircraftStatusQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<AircraftstatusFull>> = jsonHandler<List<AircraftstatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AircraftStatusTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AircraftstatusFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatus", "tuple")
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
