// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.BatterydetailsFull
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailCreateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailDeleteParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListPage
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListPageAsync
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailRetrieveParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailUpdateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailsAbridged
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatterydetailServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : BatterydetailServiceAsync {

    private val withRawResponse: BatterydetailServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): BatterydetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatterydetailServiceAsync = BatterydetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BatterydetailCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/batterydetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: BatterydetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<BatterydetailsFull> =
        // get /udl/batterydetails/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: BatterydetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/batterydetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: BatterydetailListParams, requestOptions: RequestOptions): CompletableFuture<BatterydetailListPageAsync> =
        // get /udl/batterydetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: BatterydetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/batterydetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : BatterydetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatterydetailServiceAsync.WithRawResponse = BatterydetailServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: BatterydetailCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "batterydetails")
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

        private val retrieveHandler: Handler<BatterydetailsFull> = jsonHandler<BatterydetailsFull>(clientOptions.jsonMapper)

        override fun retrieve(params: BatterydetailRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BatterydetailsFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "batterydetails", params._pathParam(0))
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

        override fun update(params: BatterydetailUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "batterydetails", params._pathParam(0))
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

        private val listHandler: Handler<List<BatterydetailsAbridged>> = jsonHandler<List<BatterydetailsAbridged>>(clientOptions.jsonMapper)

        override fun list(params: BatterydetailListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BatterydetailListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "batterydetails")
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
                  BatterydetailListPageAsync.builder()
                      .service(BatterydetailServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: BatterydetailDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "batterydetails", params._pathParam(0))
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
    }
}
