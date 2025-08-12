// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

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
import com.unifieddatalibrary.api.models.AirTaskingOrderFull
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCountParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCreateParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListPage
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListPageAsync
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderRetrieveParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderTupleParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirtaskingorderAbridged
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsync
import com.unifieddatalibrary.api.services.async.airoperations.AirTaskingOrderServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirTaskingOrderServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirTaskingOrderServiceAsync {

    private val withRawResponse: AirTaskingOrderServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AirTaskingOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderServiceAsync = AirTaskingOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirTaskingOrderCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/airtaskingorder
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AirTaskingOrderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AirTaskingOrderFull> =
        // get /udl/airtaskingorder/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: AirTaskingOrderListParams, requestOptions: RequestOptions): CompletableFuture<AirTaskingOrderListPageAsync> =
        // get /udl/airtaskingorder
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: AirTaskingOrderCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/airtaskingorder/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: AirTaskingOrderQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<AirTaskingOrderQueryHelpResponse> =
        // get /udl/airtaskingorder/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AirTaskingOrderTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AirTaskingOrderFull>> =
        // get /udl/airtaskingorder/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-airtaskingorder
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirTaskingOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderServiceAsync.WithRawResponse = AirTaskingOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirTaskingOrderCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder")
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

        private val retrieveHandler: Handler<AirTaskingOrderFull> = jsonHandler<AirTaskingOrderFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirTaskingOrderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTaskingOrderFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder", params._pathParam(0))
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

        private val listHandler: Handler<List<AirtaskingorderAbridged>> = jsonHandler<List<AirtaskingorderAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirTaskingOrderListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTaskingOrderListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder")
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
                  AirTaskingOrderListPageAsync.builder()
                      .service(AirTaskingOrderServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AirTaskingOrderCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder", "count")
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

        private val queryHelpHandler: Handler<AirTaskingOrderQueryHelpResponse> = jsonHandler<AirTaskingOrderQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: AirTaskingOrderQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTaskingOrderQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder", "queryhelp")
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

        private val tupleHandler: Handler<List<AirTaskingOrderFull>> = jsonHandler<List<AirTaskingOrderFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirTaskingOrderTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AirTaskingOrderFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtaskingorder", "tuple")
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

        override fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-airtaskingorder")
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
