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
import com.unifieddatalibrary.api.models.scientific.ScientificCountParams
import com.unifieddatalibrary.api.models.scientific.ScientificCreateParams
import com.unifieddatalibrary.api.models.scientific.ScientificDeleteParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetResponse
import com.unifieddatalibrary.api.models.scientific.ScientificListPage
import com.unifieddatalibrary.api.models.scientific.ScientificListParams
import com.unifieddatalibrary.api.models.scientific.ScientificListResponse
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpParams
import com.unifieddatalibrary.api.models.scientific.ScientificQueryhelpResponse
import com.unifieddatalibrary.api.models.scientific.ScientificTupleParams
import com.unifieddatalibrary.api.models.scientific.ScientificTupleResponse
import com.unifieddatalibrary.api.models.scientific.ScientificUpdateParams
import com.unifieddatalibrary.api.services.blocking.ScientificService
import com.unifieddatalibrary.api.services.blocking.ScientificServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScientificServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ScientificService {

    private val withRawResponse: ScientificService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ScientificService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificService = ScientificServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ScientificCreateParams, requestOptions: RequestOptions) {
      // post /udl/scientific
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: ScientificUpdateParams, requestOptions: RequestOptions) {
      // put /udl/scientific/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: ScientificListParams, requestOptions: RequestOptions): ScientificListPage =
        // get /udl/scientific
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/scientific/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: ScientificCountParams, requestOptions: RequestOptions): String =
        // get /udl/scientific/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: ScientificGetParams, requestOptions: RequestOptions): ScientificGetResponse =
        // get /udl/scientific/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: ScientificQueryhelpParams, requestOptions: RequestOptions): ScientificQueryhelpResponse =
        // get /udl/scientific/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions): List<ScientificTupleResponse> =
        // get /udl/scientific/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ScientificService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScientificService.WithRawResponse = ScientificServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: ScientificCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific")
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

        override fun update(params: ScientificUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", params._pathParam(0))
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

        private val listHandler: Handler<List<ScientificListResponse>> = jsonHandler<List<ScientificListResponse>>(clientOptions.jsonMapper)

        override fun list(params: ScientificListParams, requestOptions: RequestOptions): HttpResponseFor<ScientificListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific")
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
                  ScientificListPage.builder()
                      .service(ScientificServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ScientificDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", params._pathParam(0))
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

        override fun count(params: ScientificCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", "count")
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

        private val getHandler: Handler<ScientificGetResponse> = jsonHandler<ScientificGetResponse>(clientOptions.jsonMapper)

        override fun get(params: ScientificGetParams, requestOptions: RequestOptions): HttpResponseFor<ScientificGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ScientificQueryhelpResponse> = jsonHandler<ScientificQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: ScientificQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<ScientificQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", "queryhelp")
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

        private val tupleHandler: Handler<List<ScientificTupleResponse>> = jsonHandler<List<ScientificTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: ScientificTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<ScientificTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "scientific", "tuple")
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
