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
import com.unifieddatalibrary.api.models.AirfieldslotconsumptionFull
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCountParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCreateParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionDeleteParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListPage
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionTupleParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionUpdateParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldslotconsumptionAbridged
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirfieldSlotConsumptionServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirfieldSlotConsumptionService {

    private val withRawResponse: AirfieldSlotConsumptionService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AirfieldSlotConsumptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotConsumptionService = AirfieldSlotConsumptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirfieldSlotConsumptionCreateParams, requestOptions: RequestOptions) {
      // post /udl/airfieldslotconsumption
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AirfieldSlotConsumptionRetrieveParams, requestOptions: RequestOptions): AirfieldslotconsumptionFull =
        // get /udl/airfieldslotconsumption/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions) {
      // put /udl/airfieldslotconsumption/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AirfieldSlotConsumptionListParams, requestOptions: RequestOptions): AirfieldSlotConsumptionListPage =
        // get /udl/airfieldslotconsumption
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AirfieldSlotConsumptionDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/airfieldslotconsumption/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AirfieldSlotConsumptionCountParams, requestOptions: RequestOptions): String =
        // get /udl/airfieldslotconsumption/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams, requestOptions: RequestOptions): AirfieldSlotConsumptionQueryhelpResponse =
        // get /udl/airfieldslotconsumption/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AirfieldSlotConsumptionTupleParams, requestOptions: RequestOptions): List<AirfieldslotconsumptionFull> =
        // get /udl/airfieldslotconsumption/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirfieldSlotConsumptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotConsumptionService.WithRawResponse = AirfieldSlotConsumptionServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirfieldSlotConsumptionCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption")
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

        private val retrieveHandler: Handler<AirfieldslotconsumptionFull> = jsonHandler<AirfieldslotconsumptionFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirfieldSlotConsumptionRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldslotconsumptionFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: AirfieldSlotConsumptionUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", params._pathParam(0))
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

        private val listHandler: Handler<List<AirfieldslotconsumptionAbridged>> = jsonHandler<List<AirfieldslotconsumptionAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirfieldSlotConsumptionListParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldSlotConsumptionListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption")
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
                  AirfieldSlotConsumptionListPage.builder()
                      .service(AirfieldSlotConsumptionServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AirfieldSlotConsumptionDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", params._pathParam(0))
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

        override fun count(params: AirfieldSlotConsumptionCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", "count")
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

        private val queryhelpHandler: Handler<AirfieldSlotConsumptionQueryhelpResponse> = jsonHandler<AirfieldSlotConsumptionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AirfieldSlotConsumptionQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", "queryhelp")
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

        private val tupleHandler: Handler<List<AirfieldslotconsumptionFull>> = jsonHandler<List<AirfieldslotconsumptionFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirfieldSlotConsumptionTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AirfieldslotconsumptionFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldslotconsumption", "tuple")
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
