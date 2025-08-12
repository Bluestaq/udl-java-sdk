// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.sensor

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
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCountParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateBulkParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryHelpResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleResponse
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsync
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.sensor.calibration.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.sensor.calibration.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CalibrationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CalibrationServiceAsync {

    private val withRawResponse: CalibrationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CalibrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationServiceAsync = CalibrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: CalibrationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sensorcalibration
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: CalibrationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<CalibrationRetrieveResponse> =
        // get /udl/sensorcalibration/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun count(params: CalibrationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/sensorcalibration/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: CalibrationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sensorcalibration/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun query(params: CalibrationQueryParams, requestOptions: RequestOptions): CompletableFuture<List<CalibrationQueryResponse>> =
        // get /udl/sensorcalibration
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: CalibrationQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<CalibrationQueryHelpResponse> =
        // get /udl/sensorcalibration/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: CalibrationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<CalibrationTupleResponse>> =
        // get /udl/sensorcalibration/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-sensorcalibration
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CalibrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalibrationServiceAsync.WithRawResponse = CalibrationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CalibrationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration")
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

        private val retrieveHandler: Handler<CalibrationRetrieveResponse> = jsonHandler<CalibrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: CalibrationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CalibrationRetrieveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration", params._pathParam(0))
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: CalibrationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration", "count")
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

        override fun createBulk(params: CalibrationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration", "createBulk")
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

        private val queryHandler: Handler<List<CalibrationQueryResponse>> = jsonHandler<List<CalibrationQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: CalibrationQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<CalibrationQueryResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val queryHelpHandler: Handler<CalibrationQueryHelpResponse> = jsonHandler<CalibrationQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: CalibrationQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CalibrationQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration", "queryhelp")
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

        private val tupleHandler: Handler<List<CalibrationTupleResponse>> = jsonHandler<List<CalibrationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: CalibrationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<CalibrationTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorcalibration", "tuple")
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

        override fun unvalidatedPublish(params: CalibrationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-sensorcalibration")
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
