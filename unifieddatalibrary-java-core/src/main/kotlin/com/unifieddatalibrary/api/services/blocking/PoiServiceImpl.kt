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
import com.unifieddatalibrary.api.models.poi.PoiCountParams
import com.unifieddatalibrary.api.models.poi.PoiCreateBulkParams
import com.unifieddatalibrary.api.models.poi.PoiCreateParams
import com.unifieddatalibrary.api.models.poi.PoiGetParams
import com.unifieddatalibrary.api.models.poi.PoiGetResponse
import com.unifieddatalibrary.api.models.poi.PoiListPage
import com.unifieddatalibrary.api.models.poi.PoiListParams
import com.unifieddatalibrary.api.models.poi.PoiListResponse
import com.unifieddatalibrary.api.models.poi.PoiQueryhelpParams
import com.unifieddatalibrary.api.models.poi.PoiQueryhelpResponse
import com.unifieddatalibrary.api.models.poi.PoiTupleParams
import com.unifieddatalibrary.api.models.poi.PoiTupleResponse
import com.unifieddatalibrary.api.models.poi.PoiUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.PoiService
import com.unifieddatalibrary.api.services.blocking.PoiServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PoiServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PoiService {

    private val withRawResponse: PoiService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): PoiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService = PoiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: PoiCreateParams, requestOptions: RequestOptions) {
      // post /udl/poi
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: PoiListParams, requestOptions: RequestOptions): PoiListPage =
        // get /udl/poi
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: PoiCountParams, requestOptions: RequestOptions): String =
        // get /udl/poi/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: PoiCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/poi/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: PoiGetParams, requestOptions: RequestOptions): PoiGetResponse =
        // get /udl/poi/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: PoiQueryhelpParams, requestOptions: RequestOptions): PoiQueryhelpResponse =
        // get /udl/poi/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: PoiTupleParams, requestOptions: RequestOptions): List<PoiTupleResponse> =
        // get /udl/poi/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: PoiUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-poi
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PoiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService.WithRawResponse = PoiServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: PoiCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi")
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

        private val listHandler: Handler<List<PoiListResponse>> = jsonHandler<List<PoiListResponse>>(clientOptions.jsonMapper)

        override fun list(params: PoiListParams, requestOptions: RequestOptions): HttpResponseFor<PoiListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi")
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
                  PoiListPage.builder()
                      .service(PoiServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: PoiCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi", "count")
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

        override fun createBulk(params: PoiCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi", "createBulk")
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

        private val getHandler: Handler<PoiGetResponse> = jsonHandler<PoiGetResponse>(clientOptions.jsonMapper)

        override fun get(params: PoiGetParams, requestOptions: RequestOptions): HttpResponseFor<PoiGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi", params._pathParam(0))
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

        private val queryhelpHandler: Handler<PoiQueryhelpResponse> = jsonHandler<PoiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: PoiQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<PoiQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi", "queryhelp")
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

        private val tupleHandler: Handler<List<PoiTupleResponse>> = jsonHandler<List<PoiTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: PoiTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<PoiTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "poi", "tuple")
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

        override fun unvalidatedPublish(params: PoiUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-poi")
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
