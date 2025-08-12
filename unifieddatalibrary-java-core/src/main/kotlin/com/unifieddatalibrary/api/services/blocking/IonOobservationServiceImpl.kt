// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCountParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListPage
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.IonoObservationService
import com.unifieddatalibrary.api.services.blocking.IonoObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.ionoobservations.HistoryService
import com.unifieddatalibrary.api.services.blocking.ionoobservations.HistoryServiceImpl
import java.util.function.Consumer

class IonoObservationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : IonoObservationService {

    private val withRawResponse: IonoObservationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): IonoObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationService = IonoObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: IonoObservationListParams, requestOptions: RequestOptions): IonoObservationListPage =
        // get /udl/ionoobservation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: IonoObservationCountParams, requestOptions: RequestOptions): String =
        // get /udl/ionoobservation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: IonoObservationCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/ionoobservation/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: IonoObservationQueryhelpParams, requestOptions: RequestOptions): IonoObservationQueryhelpResponse =
        // get /udl/ionoobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: IonoObservationTupleParams, requestOptions: RequestOptions): List<IonoObservationTupleResponse> =
        // get /udl/ionoobservation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-ionoobs
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : IonoObservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationService.WithRawResponse = IonoObservationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<IonoObservationListResponse>> = jsonHandler<List<IonoObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: IonoObservationListParams, requestOptions: RequestOptions): HttpResponseFor<IonoObservationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation")
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
                  IonoObservationListPage.builder()
                      .service(IonoObservationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: IonoObservationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "count")
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

        override fun createBulk(params: IonoObservationCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "createBulk")
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

        private val queryhelpHandler: Handler<IonoObservationQueryhelpResponse> = jsonHandler<IonoObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: IonoObservationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<IonoObservationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<IonoObservationTupleResponse>> = jsonHandler<List<IonoObservationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: IonoObservationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<IonoObservationTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ionoobservation", "tuple")
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

        override fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-ionoobs")
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
