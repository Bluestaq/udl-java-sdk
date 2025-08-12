// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListPage
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpResponse
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeService
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorObservationTypeServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SensorObservationTypeService {

    private val withRawResponse: SensorObservationTypeService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SensorObservationTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorObservationTypeService = SensorObservationTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: SensorObservationTypeListParams, requestOptions: RequestOptions): SensorObservationTypeListPage =
        // get /udl/sensorobservationtype
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: SensorObservationTypeGetParams, requestOptions: RequestOptions): SensorObservationTypeGetResponse =
        // get /udl/sensorobservationtype/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SensorObservationTypeQueryhelpParams, requestOptions: RequestOptions): SensorObservationTypeQueryhelpResponse =
        // get /udl/sensorobservationtype/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SensorObservationTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorObservationTypeService.WithRawResponse = SensorObservationTypeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<SensorObservationTypeListResponse>> = jsonHandler<List<SensorObservationTypeListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SensorObservationTypeListParams, requestOptions: RequestOptions): HttpResponseFor<SensorObservationTypeListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorobservationtype")
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
                  SensorObservationTypeListPage.builder()
                      .service(SensorObservationTypeServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val getHandler: Handler<SensorObservationTypeGetResponse> = jsonHandler<SensorObservationTypeGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SensorObservationTypeGetParams, requestOptions: RequestOptions): HttpResponseFor<SensorObservationTypeGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorobservationtype", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorObservationTypeQueryhelpResponse> = jsonHandler<SensorObservationTypeQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SensorObservationTypeQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SensorObservationTypeQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sensorobservationtype", "queryhelp")
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
    }
}
