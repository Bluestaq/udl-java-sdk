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
import com.unifieddatalibrary.api.models.h3geo.H3GeoCountParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoCreateParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoGetParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoGetResponse
import com.unifieddatalibrary.api.models.h3geo.H3GeoListPage
import com.unifieddatalibrary.api.models.h3geo.H3GeoListParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoListResponse
import com.unifieddatalibrary.api.models.h3geo.H3GeoQueryhelpParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geo.H3GeoTupleParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoTupleResponse
import com.unifieddatalibrary.api.services.blocking.H3GeoService
import com.unifieddatalibrary.api.services.blocking.H3GeoServiceImpl
import com.unifieddatalibrary.api.services.blocking.h3geo.HistoryService
import com.unifieddatalibrary.api.services.blocking.h3geo.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class H3GeoServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : H3GeoService {

    private val withRawResponse: H3GeoService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): H3GeoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoService = H3GeoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: H3GeoCreateParams, requestOptions: RequestOptions) {
      // post /udl/h3geo
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: H3GeoListParams, requestOptions: RequestOptions): H3GeoListPage =
        // get /udl/h3geo
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: H3GeoCountParams, requestOptions: RequestOptions): String =
        // get /udl/h3geo/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: H3GeoGetParams, requestOptions: RequestOptions): H3GeoGetResponse =
        // get /udl/h3geo/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: H3GeoQueryhelpParams, requestOptions: RequestOptions): H3GeoQueryhelpResponse =
        // get /udl/h3geo/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: H3GeoTupleParams, requestOptions: RequestOptions): List<H3GeoTupleResponse> =
        // get /udl/h3geo/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : H3GeoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoService.WithRawResponse = H3GeoServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: H3GeoCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo")
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

        private val listHandler: Handler<List<H3GeoListResponse>> = jsonHandler<List<H3GeoListResponse>>(clientOptions.jsonMapper)

        override fun list(params: H3GeoListParams, requestOptions: RequestOptions): HttpResponseFor<H3GeoListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo")
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
                  H3GeoListPage.builder()
                      .service(H3GeoServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: H3GeoCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "count")
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

        private val getHandler: Handler<H3GeoGetResponse> = jsonHandler<H3GeoGetResponse>(clientOptions.jsonMapper)

        override fun get(params: H3GeoGetParams, requestOptions: RequestOptions): HttpResponseFor<H3GeoGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", params._pathParam(0))
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

        private val queryhelpHandler: Handler<H3GeoQueryhelpResponse> = jsonHandler<H3GeoQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: H3GeoQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<H3GeoQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "queryhelp")
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

        private val tupleHandler: Handler<List<H3GeoTupleResponse>> = jsonHandler<List<H3GeoTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: H3GeoTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<H3GeoTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geo", "tuple")
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
