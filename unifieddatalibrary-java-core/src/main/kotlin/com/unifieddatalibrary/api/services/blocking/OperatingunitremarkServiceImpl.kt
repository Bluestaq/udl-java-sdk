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
import com.unifieddatalibrary.api.models.OperatingUnitRemarkFull
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListPage
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OperatingunitremarkServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OperatingunitremarkService {

    private val withRawResponse: OperatingunitremarkService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OperatingunitremarkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkService = OperatingunitremarkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions) {
      // post /udl/operatingunitremark
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: OperatingunitremarkListParams, requestOptions: RequestOptions): OperatingunitremarkListPage =
        // get /udl/operatingunitremark
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: OperatingunitremarkCountParams, requestOptions: RequestOptions): String =
        // get /udl/operatingunitremark/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/operatingunitremark/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions): OperatingUnitRemarkFull =
        // get /udl/operatingunitremark/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: OperatingunitremarkQueryhelpParams, requestOptions: RequestOptions): OperatingunitremarkQueryhelpResponse =
        // get /udl/operatingunitremark/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions): List<OperatingUnitRemarkFull> =
        // get /udl/operatingunitremark/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OperatingunitremarkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkService.WithRawResponse = OperatingunitremarkServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark")
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

        private val listHandler: Handler<List<OperatingunitremarkListResponse>> = jsonHandler<List<OperatingunitremarkListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OperatingunitremarkListParams, requestOptions: RequestOptions): HttpResponseFor<OperatingunitremarkListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark")
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
                  OperatingunitremarkListPage.builder()
                      .service(OperatingunitremarkServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OperatingunitremarkCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "count")
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

        override fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "createBulk")
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

        private val getHandler: Handler<OperatingUnitRemarkFull> = jsonHandler<OperatingUnitRemarkFull>(clientOptions.jsonMapper)

        override fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions): HttpResponseFor<OperatingUnitRemarkFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OperatingunitremarkQueryhelpResponse> = jsonHandler<OperatingunitremarkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OperatingunitremarkQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<OperatingunitremarkQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "queryhelp")
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

        private val tupleHandler: Handler<List<OperatingUnitRemarkFull>> = jsonHandler<List<OperatingUnitRemarkFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<OperatingUnitRemarkFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "operatingunitremark", "tuple")
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
