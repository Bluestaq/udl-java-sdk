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
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCountParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateBulkParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusGetParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListPage
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusTupleParams
import com.unifieddatalibrary.api.models.geostatus.history.GeoStatusFull
import com.unifieddatalibrary.api.services.blocking.GeoStatusService
import com.unifieddatalibrary.api.services.blocking.GeoStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.geostatus.HistoryService
import com.unifieddatalibrary.api.services.blocking.geostatus.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GeoStatusServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GeoStatusService {

    private val withRawResponse: GeoStatusService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GeoStatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusService = GeoStatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: GeoStatusCreateParams, requestOptions: RequestOptions) {
      // post /udl/geostatus
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: GeoStatusListParams, requestOptions: RequestOptions): GeoStatusListPage =
        // get /udl/geostatus
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: GeoStatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/geostatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: GeoStatusCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/geostatus/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: GeoStatusGetParams, requestOptions: RequestOptions): GeoStatusFull =
        // get /udl/geostatus/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: GeoStatusQueryhelpParams, requestOptions: RequestOptions): GeoStatusQueryhelpResponse =
        // get /udl/geostatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: GeoStatusTupleParams, requestOptions: RequestOptions): List<GeoStatusFull> =
        // get /udl/geostatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GeoStatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusService.WithRawResponse = GeoStatusServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: GeoStatusCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus")
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

        private val listHandler: Handler<List<GeoStatusListResponse>> = jsonHandler<List<GeoStatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: GeoStatusListParams, requestOptions: RequestOptions): HttpResponseFor<GeoStatusListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus")
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
                  GeoStatusListPage.builder()
                      .service(GeoStatusServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: GeoStatusCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "count")
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

        override fun createBulk(params: GeoStatusCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "createBulk")
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

        private val getHandler: Handler<GeoStatusFull> = jsonHandler<GeoStatusFull>(clientOptions.jsonMapper)

        override fun get(params: GeoStatusGetParams, requestOptions: RequestOptions): HttpResponseFor<GeoStatusFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<GeoStatusQueryhelpResponse> = jsonHandler<GeoStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: GeoStatusQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<GeoStatusQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "queryhelp")
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

        private val tupleHandler: Handler<List<GeoStatusFull>> = jsonHandler<List<GeoStatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: GeoStatusTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<GeoStatusFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "geostatus", "tuple")
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
