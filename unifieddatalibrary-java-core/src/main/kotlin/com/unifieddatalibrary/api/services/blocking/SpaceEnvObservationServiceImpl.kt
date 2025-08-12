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
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCountParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCreateBulkParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListPage
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationTupleParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.spaceenvobservation.history.SpaceEnvObservationFull
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationService
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.spaceenvobservation.HistoryService
import com.unifieddatalibrary.api.services.blocking.spaceenvobservation.HistoryServiceImpl
import java.util.function.Consumer

class SpaceEnvObservationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SpaceEnvObservationService {

    private val withRawResponse: SpaceEnvObservationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SpaceEnvObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationService = SpaceEnvObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions): SpaceEnvObservationListPage =
        // get /udl/spaceenvobservation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions): String =
        // get /udl/spaceenvobservation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/spaceenvobservation/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: SpaceEnvObservationQueryhelpParams, requestOptions: RequestOptions): SpaceEnvObservationQueryhelpResponse =
        // get /udl/spaceenvobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions): List<SpaceEnvObservationFull> =
        // get /udl/spaceenvobservation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-spaceenvobs
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SpaceEnvObservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationService.WithRawResponse = SpaceEnvObservationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<SpaceEnvObservationListResponse>> = jsonHandler<List<SpaceEnvObservationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SpaceEnvObservationListParams, requestOptions: RequestOptions): HttpResponseFor<SpaceEnvObservationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation")
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
                  SpaceEnvObservationListPage.builder()
                      .service(SpaceEnvObservationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SpaceEnvObservationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "count")
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

        override fun createBulk(params: SpaceEnvObservationCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "createBulk")
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

        private val queryhelpHandler: Handler<SpaceEnvObservationQueryhelpResponse> = jsonHandler<SpaceEnvObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SpaceEnvObservationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SpaceEnvObservationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<SpaceEnvObservationFull>> = jsonHandler<List<SpaceEnvObservationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SpaceEnvObservationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SpaceEnvObservationFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "spaceenvobservation", "tuple")
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

        override fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-spaceenvobs")
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
