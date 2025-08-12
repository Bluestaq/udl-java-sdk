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
import com.unifieddatalibrary.api.models.AircraftstatusremarkFull
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCountParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCreateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkDeleteParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListPage
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkListParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkTupleParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkUpdateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftstatusremarkAbridged
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AircraftStatusRemarkServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AircraftStatusRemarkService {

    private val withRawResponse: AircraftStatusRemarkService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AircraftStatusRemarkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusRemarkService = AircraftStatusRemarkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AircraftStatusRemarkCreateParams, requestOptions: RequestOptions) {
      // post /udl/aircraftstatusremark
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AircraftStatusRemarkRetrieveParams, requestOptions: RequestOptions): AircraftstatusremarkFull =
        // get /udl/aircraftstatusremark/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions) {
      // put /udl/aircraftstatusremark/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AircraftStatusRemarkListParams, requestOptions: RequestOptions): AircraftStatusRemarkListPage =
        // get /udl/aircraftstatusremark
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AircraftStatusRemarkDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/aircraftstatusremark/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AircraftStatusRemarkCountParams, requestOptions: RequestOptions): String =
        // get /udl/aircraftstatusremark/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: AircraftStatusRemarkQueryhelpParams, requestOptions: RequestOptions): AircraftStatusRemarkQueryhelpResponse =
        // get /udl/aircraftstatusremark/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AircraftStatusRemarkTupleParams, requestOptions: RequestOptions): List<AircraftstatusremarkFull> =
        // get /udl/aircraftstatusremark/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AircraftStatusRemarkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftStatusRemarkService.WithRawResponse = AircraftStatusRemarkServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AircraftStatusRemarkCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark")
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

        private val retrieveHandler: Handler<AircraftstatusremarkFull> = jsonHandler<AircraftstatusremarkFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AircraftStatusRemarkRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AircraftstatusremarkFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", params._pathParam(0))
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

        override fun update(params: AircraftStatusRemarkUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", params._pathParam(0))
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

        private val listHandler: Handler<List<AircraftstatusremarkAbridged>> = jsonHandler<List<AircraftstatusremarkAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AircraftStatusRemarkListParams, requestOptions: RequestOptions): HttpResponseFor<AircraftStatusRemarkListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark")
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
                  AircraftStatusRemarkListPage.builder()
                      .service(AircraftStatusRemarkServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AircraftStatusRemarkDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", params._pathParam(0))
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

        override fun count(params: AircraftStatusRemarkCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", "count")
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

        private val queryhelpHandler: Handler<AircraftStatusRemarkQueryhelpResponse> = jsonHandler<AircraftStatusRemarkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AircraftStatusRemarkQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<AircraftStatusRemarkQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", "queryhelp")
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

        private val tupleHandler: Handler<List<AircraftstatusremarkFull>> = jsonHandler<List<AircraftstatusremarkFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AircraftStatusRemarkTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AircraftstatusremarkFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aircraftstatusremark", "tuple")
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
