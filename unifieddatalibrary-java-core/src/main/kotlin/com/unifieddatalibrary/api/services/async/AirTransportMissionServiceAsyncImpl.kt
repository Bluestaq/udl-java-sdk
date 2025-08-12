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
import com.unifieddatalibrary.api.models.AirTransportMissionFull
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionAbridged
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCountParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCreateParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListPage
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListPageAsync
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpResponse
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionRetrieveParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionTupleParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionUpdateParams
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.airtransportmissions.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.airtransportmissions.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirTransportMissionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirTransportMissionServiceAsync {

    private val withRawResponse: AirTransportMissionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AirTransportMissionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTransportMissionServiceAsync = AirTransportMissionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: AirTransportMissionCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/airtransportmission
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AirTransportMissionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AirTransportMissionFull> =
        // get /udl/airtransportmission/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: AirTransportMissionUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/airtransportmission/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: AirTransportMissionListParams, requestOptions: RequestOptions): CompletableFuture<AirTransportMissionListPageAsync> =
        // get /udl/airtransportmission
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: AirTransportMissionCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/airtransportmission/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: AirTransportMissionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<AirTransportMissionQueryhelpResponse> =
        // get /udl/airtransportmission/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AirTransportMissionTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AirTransportMissionFull>> =
        // get /udl/airtransportmission/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirTransportMissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTransportMissionServiceAsync.WithRawResponse = AirTransportMissionServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirTransportMissionCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission")
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

        private val retrieveHandler: Handler<AirTransportMissionFull> = jsonHandler<AirTransportMissionFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirTransportMissionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission", params._pathParam(0))
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

        override fun update(params: AirTransportMissionUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission", params._pathParam(0))
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

        private val listHandler: Handler<List<AirTransportMissionAbridged>> = jsonHandler<List<AirTransportMissionAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirTransportMissionListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTransportMissionListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission")
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
                  AirTransportMissionListPageAsync.builder()
                      .service(AirTransportMissionServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AirTransportMissionCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission", "count")
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

        private val queryhelpHandler: Handler<AirTransportMissionQueryhelpResponse> = jsonHandler<AirTransportMissionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AirTransportMissionQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AirTransportMissionQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission", "queryhelp")
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

        private val tupleHandler: Handler<List<AirTransportMissionFull>> = jsonHandler<List<AirTransportMissionFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirTransportMissionTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AirTransportMissionFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airtransportmission", "tuple")
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
