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
import com.unifieddatalibrary.api.models.DiplomaticclearanceFull
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticclearanceAbridged
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListPage
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListPageAsync
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceUpdateParams
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.diplomaticclearance.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.diplomaticclearance.CountryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.diplomaticclearance.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.diplomaticclearance.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DiplomaticClearanceServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DiplomaticClearanceServiceAsync {

    private val withRawResponse: DiplomaticClearanceServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    private val country: CountryServiceAsync by lazy { CountryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DiplomaticClearanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceServiceAsync = DiplomaticClearanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun country(): CountryServiceAsync = country

    override fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/diplomaticclearance
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions): CompletableFuture<DiplomaticclearanceFull> =
        // get /udl/diplomaticclearance/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/diplomaticclearance/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions): CompletableFuture<DiplomaticClearanceListPageAsync> =
        // get /udl/diplomaticclearance
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/diplomaticclearance/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/diplomaticclearance/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/diplomaticclearance/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: DiplomaticClearanceQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<DiplomaticClearanceQueryhelpResponse> =
        // get /udl/diplomaticclearance/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions): CompletableFuture<List<DiplomaticclearanceFull>> =
        // get /udl/diplomaticclearance/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DiplomaticClearanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val country: CountryServiceAsync.WithRawResponse by lazy { CountryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceServiceAsync.WithRawResponse = DiplomaticClearanceServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        override fun country(): CountryServiceAsync.WithRawResponse = country

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance")
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

        private val retrieveHandler: Handler<DiplomaticclearanceFull> = jsonHandler<DiplomaticclearanceFull>(clientOptions.jsonMapper)

        override fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        override fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        private val listHandler: Handler<List<DiplomaticclearanceAbridged>> = jsonHandler<List<DiplomaticclearanceAbridged>>(clientOptions.jsonMapper)

        override fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DiplomaticClearanceListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance")
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
                  DiplomaticClearanceListPageAsync.builder()
                      .service(DiplomaticClearanceServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        override fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "count")
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

        override fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "createBulk")
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

        private val queryhelpHandler: Handler<DiplomaticClearanceQueryhelpResponse> = jsonHandler<DiplomaticClearanceQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: DiplomaticClearanceQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DiplomaticClearanceQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "queryhelp")
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

        private val tupleHandler: Handler<List<DiplomaticclearanceFull>> = jsonHandler<List<DiplomaticclearanceFull>>(clientOptions.jsonMapper)

        override fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<DiplomaticclearanceFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "tuple")
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
