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
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCountParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCreateBulkParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListPage
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListResponse
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetTupleParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.gnssobservationset.history.GnssObservationSetFull
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetServiceImpl
import com.unifieddatalibrary.api.services.blocking.gnssobservationset.HistoryService
import com.unifieddatalibrary.api.services.blocking.gnssobservationset.HistoryServiceImpl
import java.util.function.Consumer

class GnssObservationsetServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GnssObservationsetService {

    private val withRawResponse: GnssObservationsetService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GnssObservationsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationsetService = GnssObservationsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: GnssObservationsetListParams, requestOptions: RequestOptions): GnssObservationsetListPage =
        // get /udl/gnssobservationset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: GnssObservationsetCountParams, requestOptions: RequestOptions): String =
        // get /udl/gnssobservationset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: GnssObservationsetCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/gnssobservationset/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: GnssObservationsetQueryhelpParams, requestOptions: RequestOptions): GnssObservationsetQueryhelpResponse =
        // get /udl/gnssobservationset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: GnssObservationsetTupleParams, requestOptions: RequestOptions): List<GnssObservationSetFull> =
        // get /udl/gnssobservationset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-gnssobset
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GnssObservationsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationsetService.WithRawResponse = GnssObservationsetServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<GnssObservationsetListResponse>> = jsonHandler<List<GnssObservationsetListResponse>>(clientOptions.jsonMapper)

        override fun list(params: GnssObservationsetListParams, requestOptions: RequestOptions): HttpResponseFor<GnssObservationsetListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset")
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
                  GnssObservationsetListPage.builder()
                      .service(GnssObservationsetServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: GnssObservationsetCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "count")
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

        override fun createBulk(params: GnssObservationsetCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "createBulk")
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

        private val queryhelpHandler: Handler<GnssObservationsetQueryhelpResponse> = jsonHandler<GnssObservationsetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: GnssObservationsetQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<GnssObservationsetQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "queryhelp")
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

        private val tupleHandler: Handler<List<GnssObservationSetFull>> = jsonHandler<List<GnssObservationSetFull>>(clientOptions.jsonMapper)

        override fun tuple(params: GnssObservationsetTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<GnssObservationSetFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssobservationset", "tuple")
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

        override fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-gnssobset")
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
