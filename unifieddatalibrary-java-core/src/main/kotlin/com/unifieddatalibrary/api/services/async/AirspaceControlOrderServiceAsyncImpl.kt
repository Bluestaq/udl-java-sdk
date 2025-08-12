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
import com.unifieddatalibrary.api.models.AirspacecontrolorderFull
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCountParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateBulkParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListPage
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListPageAsync
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderRetrieveParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderTupleParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspacecontrolorderAbridged
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirspaceControlOrderServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirspaceControlOrderServiceAsync {

    private val withRawResponse: AirspaceControlOrderServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AirspaceControlOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderServiceAsync = AirspaceControlOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirspaceControlOrderCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/airspacecontrolorder
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AirspaceControlOrderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AirspacecontrolorderFull> =
        // get /udl/airspacecontrolorder/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: AirspaceControlOrderListParams, requestOptions: RequestOptions): CompletableFuture<AirspaceControlOrderListPageAsync> =
        // get /udl/airspacecontrolorder
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: AirspaceControlOrderCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/airspacecontrolorder/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: AirspaceControlOrderCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/airspacecontrolorder/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: AirspaceControlOrderQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<AirspaceControlOrderQueryHelpResponse> =
        // get /udl/airspacecontrolorder/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AirspaceControlOrderTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AirspacecontrolorderFull>> =
        // get /udl/airspacecontrolorder/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirspaceControlOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderServiceAsync.WithRawResponse = AirspaceControlOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirspaceControlOrderCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder")
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

        private val retrieveHandler: Handler<AirspacecontrolorderFull> = jsonHandler<AirspacecontrolorderFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirspaceControlOrderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder", params._pathParam(0))
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

        private val listHandler: Handler<List<AirspacecontrolorderAbridged>> = jsonHandler<List<AirspacecontrolorderAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirspaceControlOrderListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirspaceControlOrderListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder")
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
                  AirspaceControlOrderListPageAsync.builder()
                      .service(AirspaceControlOrderServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AirspaceControlOrderCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder", "count")
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

        override fun createBulk(params: AirspaceControlOrderCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder", "createBulk")
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

        private val queryHelpHandler: Handler<AirspaceControlOrderQueryHelpResponse> = jsonHandler<AirspaceControlOrderQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: AirspaceControlOrderQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirspaceControlOrderQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder", "queryhelp")
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

        private val tupleHandler: Handler<List<AirspacecontrolorderFull>> = jsonHandler<List<AirspacecontrolorderFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirspaceControlOrderTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AirspacecontrolorderFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airspacecontrolorder", "tuple")
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
