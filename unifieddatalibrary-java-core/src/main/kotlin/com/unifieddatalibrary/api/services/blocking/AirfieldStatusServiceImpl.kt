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
import com.unifieddatalibrary.api.models.AirfieldstatusFull
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCountParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusDeleteParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListPage
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusListParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusRetrieveParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusTupleParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusUpdateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldstatusAbridged
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.airfieldstatus.HistoryService
import com.unifieddatalibrary.api.services.blocking.airfieldstatus.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirfieldStatusServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirfieldStatusService {

    private val withRawResponse: AirfieldStatusService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AirfieldStatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusService = AirfieldStatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions) {
      // post /udl/airfieldstatus
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions): AirfieldstatusFull =
        // get /udl/airfieldstatus/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions) {
      // put /udl/airfieldstatus/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AirfieldStatusListParams, requestOptions: RequestOptions): AirfieldStatusListPage =
        // get /udl/airfieldstatus
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/airfieldstatus/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AirfieldStatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/airfieldstatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: AirfieldStatusQueryhelpParams, requestOptions: RequestOptions): AirfieldStatusQueryhelpResponse =
        // get /udl/airfieldstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions): List<AirfieldstatusFull> =
        // get /udl/airfieldstatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirfieldStatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldStatusService.WithRawResponse = AirfieldStatusServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirfieldStatusCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus")
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

        private val retrieveHandler: Handler<AirfieldstatusFull> = jsonHandler<AirfieldstatusFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirfieldStatusRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldstatusFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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

        override fun update(params: AirfieldStatusUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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

        private val listHandler: Handler<List<AirfieldstatusAbridged>> = jsonHandler<List<AirfieldstatusAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirfieldStatusListParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldStatusListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus")
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
                  AirfieldStatusListPage.builder()
                      .service(AirfieldStatusServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AirfieldStatusDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", params._pathParam(0))
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

        override fun count(params: AirfieldStatusCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", "count")
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

        private val queryhelpHandler: Handler<AirfieldStatusQueryhelpResponse> = jsonHandler<AirfieldStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AirfieldStatusQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldStatusQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<AirfieldstatusFull>> = jsonHandler<List<AirfieldstatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirfieldStatusTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AirfieldstatusFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfieldstatus", "tuple")
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
