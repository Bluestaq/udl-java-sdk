// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.sensor.SensorCountParams
import com.unifieddatalibrary.api.models.sensor.SensorCreateParams
import com.unifieddatalibrary.api.models.sensor.SensorDeleteParams
import com.unifieddatalibrary.api.models.sensor.SensorGetParams
import com.unifieddatalibrary.api.models.sensor.SensorGetResponse
import com.unifieddatalibrary.api.models.sensor.SensorListPage
import com.unifieddatalibrary.api.models.sensor.SensorListParams
import com.unifieddatalibrary.api.models.sensor.SensorListResponse
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpParams
import com.unifieddatalibrary.api.models.sensor.SensorQueryhelpResponse
import com.unifieddatalibrary.api.models.sensor.SensorTupleParams
import com.unifieddatalibrary.api.models.sensor.SensorTupleResponse
import com.unifieddatalibrary.api.models.sensor.SensorUpdateParams
import com.unifieddatalibrary.api.services.blocking.SensorService
import com.unifieddatalibrary.api.services.blocking.SensorServiceImpl
import com.unifieddatalibrary.api.services.blocking.sensor.CalibrationService
import com.unifieddatalibrary.api.services.blocking.sensor.CalibrationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SensorService {

    private val withRawResponse: SensorService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val calibration: CalibrationService by lazy { CalibrationServiceImpl(clientOptions) }

    override fun withRawResponse(): SensorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService = SensorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calibration(): CalibrationService = calibration

    override fun create(params: SensorCreateParams, requestOptions: RequestOptions) {
      // post /udl/sensor
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SensorUpdateParams, requestOptions: RequestOptions) {
      // put /udl/sensor/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SensorListParams, requestOptions: RequestOptions): SensorListPage =
        // get /udl/sensor
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SensorDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/sensor/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SensorCountParams, requestOptions: RequestOptions): String =
        // get /udl/sensor/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SensorGetParams, requestOptions: RequestOptions): SensorGetResponse =
        // get /udl/sensor/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SensorQueryhelpParams, requestOptions: RequestOptions): SensorQueryhelpResponse =
        // get /udl/sensor/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SensorTupleParams, requestOptions: RequestOptions): List<SensorTupleResponse> =
        // get /udl/sensor/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SensorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calibration: CalibrationService.WithRawResponse by lazy { CalibrationServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService.WithRawResponse = SensorServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun calibration(): CalibrationService.WithRawResponse = calibration

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SensorCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: SensorUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          }
        }

        private val listHandler: Handler<List<SensorListResponse>> = jsonHandler<List<SensorListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SensorListParams, requestOptions: RequestOptions): HttpResponseFor<SensorListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  SensorListPage.builder()
                      .service(SensorServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SensorDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SensorCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "count")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<SensorGetResponse> = jsonHandler<SensorGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SensorGetParams, requestOptions: RequestOptions): HttpResponseFor<SensorGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val queryhelpHandler: Handler<SensorQueryhelpResponse> = jsonHandler<SensorQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SensorQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SensorQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "queryhelp")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val tupleHandler: Handler<List<SensorTupleResponse>> = jsonHandler<List<SensorTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SensorTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SensorTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensor", "tuple")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }
    }
}
