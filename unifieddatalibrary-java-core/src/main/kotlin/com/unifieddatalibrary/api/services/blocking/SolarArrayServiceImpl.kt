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
import com.unifieddatalibrary.api.models.SolarArrayFull
import com.unifieddatalibrary.api.models.solararray.SolarArrayCountParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayCreateParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayDeleteParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayGetParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayListPage
import com.unifieddatalibrary.api.models.solararray.SolarArrayListParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayListResponse
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayQueryhelpResponse
import com.unifieddatalibrary.api.models.solararray.SolarArrayTupleParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayUpdateParams
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import com.unifieddatalibrary.api.services.blocking.SolarArrayServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SolarArrayServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SolarArrayService {

    private val withRawResponse: SolarArrayService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SolarArrayService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayService = SolarArrayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions) {
      // post /udl/solararray
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions) {
      // put /udl/solararray/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SolarArrayListParams, requestOptions: RequestOptions): SolarArrayListPage =
        // get /udl/solararray
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/solararray/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SolarArrayCountParams, requestOptions: RequestOptions): String =
        // get /udl/solararray/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SolarArrayGetParams, requestOptions: RequestOptions): SolarArrayFull =
        // get /udl/solararray/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SolarArrayQueryhelpParams, requestOptions: RequestOptions): SolarArrayQueryhelpResponse =
        // get /udl/solararray/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions): List<SolarArrayFull> =
        // get /udl/solararray/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SolarArrayService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SolarArrayService.WithRawResponse = SolarArrayServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SolarArrayCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: SolarArrayUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", params._pathParam(0))
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

        private val listHandler: Handler<List<SolarArrayListResponse>> = jsonHandler<List<SolarArrayListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SolarArrayListParams, requestOptions: RequestOptions): HttpResponseFor<SolarArrayListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray")
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
                  SolarArrayListPage.builder()
                      .service(SolarArrayServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SolarArrayDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", params._pathParam(0))
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

        override fun count(params: SolarArrayCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", "count")
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

        private val getHandler: Handler<SolarArrayFull> = jsonHandler<SolarArrayFull>(clientOptions.jsonMapper)

        override fun get(params: SolarArrayGetParams, requestOptions: RequestOptions): HttpResponseFor<SolarArrayFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SolarArrayQueryhelpResponse> = jsonHandler<SolarArrayQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SolarArrayQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SolarArrayQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", "queryhelp")
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

        private val tupleHandler: Handler<List<SolarArrayFull>> = jsonHandler<List<SolarArrayFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SolarArrayTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SolarArrayFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "solararray", "tuple")
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
