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
import com.unifieddatalibrary.api.models.EoObservationFull
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationAbridged
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCountParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListPage
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationRetrieveParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationTupleParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.eoobservations.HistoryService
import com.unifieddatalibrary.api.services.blocking.observations.eoobservations.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EoObservationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EoObservationService {

    private val withRawResponse: EoObservationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EoObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationService = EoObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: EoObservationCreateParams, requestOptions: RequestOptions) {
      // post /udl/eoobservation
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions): EoObservationFull =
        // get /udl/eoobservation/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EoObservationListParams, requestOptions: RequestOptions): EoObservationListPage =
        // get /udl/eoobservation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EoObservationCountParams, requestOptions: RequestOptions): String =
        // get /udl/eoobservation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/eoobservation/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: EoObservationQueryhelpParams, requestOptions: RequestOptions): EoObservationQueryhelpResponse =
        // get /udl/eoobservation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions): List<EoObservationFull> =
        // get /udl/eoobservation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-eo
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EoObservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationService.WithRawResponse = EoObservationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EoObservationCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation")
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

        private val retrieveHandler: Handler<EoObservationFull> = jsonHandler<EoObservationFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<EoObservationFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation", params._pathParam(0))
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

        private val listHandler: Handler<List<EoObservationAbridged>> = jsonHandler<List<EoObservationAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EoObservationListParams, requestOptions: RequestOptions): HttpResponseFor<EoObservationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation")
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
                  EoObservationListPage.builder()
                      .service(EoObservationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: EoObservationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation", "count")
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

        override fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation", "createBulk")
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

        private val queryhelpHandler: Handler<EoObservationQueryhelpResponse> = jsonHandler<EoObservationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: EoObservationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<EoObservationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation", "queryhelp")
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

        private val tupleHandler: Handler<List<EoObservationFull>> = jsonHandler<List<EoObservationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<EoObservationFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eoobservation", "tuple")
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

        override fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-eo")
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
