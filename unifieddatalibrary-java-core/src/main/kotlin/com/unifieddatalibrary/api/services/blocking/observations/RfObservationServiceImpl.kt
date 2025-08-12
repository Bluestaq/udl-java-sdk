// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

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
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCountParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationCreateParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationGetResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListPage
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationListResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleParams
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationTupleResponse
import com.unifieddatalibrary.api.models.observations.rfobservation.RfObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationService
import com.unifieddatalibrary.api.services.blocking.observations.RfObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.rfobservation.HistoryService
import com.unifieddatalibrary.api.services.blocking.observations.rfobservation.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfObservationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RfObservationService {

    private val withRawResponse: RfObservationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): RfObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfObservationService = RfObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: RfObservationCreateParams, requestOptions: RequestOptions) {
      // post /udl/rfobservation
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: RfObservationListParams, requestOptions: RequestOptions): RfObservationListPage =
        // get /udl/rfobservation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: RfObservationCountParams, requestOptions: RequestOptions): String =
        // get /udl/rfobservation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: RfObservationCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/rfobservation/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: RfObservationGetParams, requestOptions: RequestOptions): RfObservationGetResponse =
        // get /udl/rfobservation/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: RfObservationQueryhelpParams, requestOptions: RequestOptions): RfObservationQueryhelpResponse =
        // get /udl/rfobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: RfObservationTupleParams, requestOptions: RequestOptions): List<RfObservationTupleResponse> =
        // get /udl/rfobservation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-rf
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RfObservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfObservationService.WithRawResponse = RfObservationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: RfObservationCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation")
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

        private val listHandler: Handler<List<RfObservationListResponse>> = jsonHandler<List<RfObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: RfObservationListParams, requestOptions: RequestOptions): HttpResponseFor<RfObservationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation")
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
                  RfObservationListPage.builder()
                      .service(RfObservationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: RfObservationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: RfObservationCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation", "createBulk")
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
                  createBulkHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<RfObservationGetResponse> = jsonHandler<RfObservationGetResponse>(clientOptions.jsonMapper)

        override fun get(params: RfObservationGetParams, requestOptions: RequestOptions): HttpResponseFor<RfObservationGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation", params._pathParam(0))
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

        private val queryhelpHandler: Handler<RfObservationQueryhelpResponse> = jsonHandler<RfObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: RfObservationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<RfObservationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<RfObservationTupleResponse>> = jsonHandler<List<RfObservationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: RfObservationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<RfObservationTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfobservation", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: RfObservationUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-rf")
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
                  unvalidatedPublishHandler.handle(it)
              }
          }
        }
    }
}
