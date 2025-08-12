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
import com.unifieddatalibrary.api.models.sensor.SensorCountParams
import com.unifieddatalibrary.api.models.sensor.SensorCreateParams
import com.unifieddatalibrary.api.models.sensor.SensorDeleteParams
import com.unifieddatalibrary.api.models.sensor.SensorGetParams
import com.unifieddatalibrary.api.models.sensor.SensorGetResponse
import com.unifieddatalibrary.api.models.sensor.SensorListPage
import com.unifieddatalibrary.api.models.sensor.SensorListPageAsync
import com.unifieddatalibrary.api.models.sensor.SensorListParams
import com.unifieddatalibrary.api.models.sensor.SensorListResponse
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpResponse
import com.unifieddatalibrary.api.models.sensor.SensorTupleParams
import com.unifieddatalibrary.api.models.sensor.SensorTupleResponse
import com.unifieddatalibrary.api.models.sensor.SensorUpdateParams
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.SensorServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsync
import com.unifieddatalibrary.api.services.async.sensor.CalibrationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SensorServiceAsync {

    private val withRawResponse: SensorServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val calibration: CalibrationServiceAsync by lazy { CalibrationServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SensorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync = SensorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calibration(): CalibrationServiceAsync = calibration

    override fun create(params: SensorCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sensor
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SensorUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/sensor/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SensorListParams, requestOptions: RequestOptions): CompletableFuture<SensorListPageAsync> =
        // get /udl/sensor
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SensorDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/sensor/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: SensorCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/sensor/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: SensorGetParams, requestOptions: RequestOptions): CompletableFuture<SensorGetResponse> =
        // get /udl/sensor/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SensorQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SensorQueryhelpResponse> =
        // get /udl/sensor/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SensorTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SensorTupleResponse>> =
        // get /udl/sensor/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SensorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calibration: CalibrationServiceAsync.WithRawResponse by lazy { CalibrationServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync.WithRawResponse = SensorServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun calibration(): CalibrationServiceAsync.WithRawResponse = calibration

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SensorCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: SensorUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
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

        private val listHandler: Handler<List<SensorListResponse>> = jsonHandler<List<SensorListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SensorListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor")
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
                  SensorListPageAsync.builder()
                      .service(SensorServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SensorDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
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

        override fun count(params: SensorCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "count")
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

        private val getHandler: Handler<SensorGetResponse> = jsonHandler<SensorGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SensorGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<SensorQueryhelpResponse> = jsonHandler<SensorQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SensorQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SensorQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "queryhelp")
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

        private val tupleHandler: Handler<List<SensorTupleResponse>> = jsonHandler<List<SensorTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SensorTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SensorTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "tuple")
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
