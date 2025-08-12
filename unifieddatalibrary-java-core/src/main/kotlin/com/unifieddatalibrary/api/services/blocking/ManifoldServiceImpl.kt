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
import com.unifieddatalibrary.api.models.manifold.ManifoldCountParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateBulkParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateParams
import com.unifieddatalibrary.api.models.manifold.ManifoldDeleteParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldListPage
import com.unifieddatalibrary.api.models.manifold.ManifoldListParams
import com.unifieddatalibrary.api.models.manifold.ManifoldListResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpParams
import com.unifieddatalibrary.api.models.manifold.ManifoldQueryhelpResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleParams
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleResponse
import com.unifieddatalibrary.api.models.manifold.ManifoldUpdateParams
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import com.unifieddatalibrary.api.services.blocking.ManifoldServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManifoldServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ManifoldService {

    private val withRawResponse: ManifoldService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ManifoldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldService = ManifoldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ManifoldCreateParams, requestOptions: RequestOptions) {
      // post /udl/manifold
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions) {
      // put /udl/manifold/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: ManifoldListParams, requestOptions: RequestOptions): ManifoldListPage =
        // get /udl/manifold
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/manifold/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: ManifoldCountParams, requestOptions: RequestOptions): String =
        // get /udl/manifold/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/manifold/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: ManifoldGetParams, requestOptions: RequestOptions): ManifoldGetResponse =
        // get /udl/manifold/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: ManifoldQueryhelpParams, requestOptions: RequestOptions): ManifoldQueryhelpResponse =
        // get /udl/manifold/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions): List<ManifoldTupleResponse> =
        // get /udl/manifold/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ManifoldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldService.WithRawResponse = ManifoldServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: ManifoldCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold")
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

        override fun update(params: ManifoldUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        private val listHandler: Handler<List<ManifoldListResponse>> = jsonHandler<List<ManifoldListResponse>>(clientOptions.jsonMapper)

        override fun list(params: ManifoldListParams, requestOptions: RequestOptions): HttpResponseFor<ManifoldListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold")
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
                  ManifoldListPage.builder()
                      .service(ManifoldServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ManifoldDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        override fun count(params: ManifoldCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "count")
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

        override fun createBulk(params: ManifoldCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "createBulk")
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

        private val getHandler: Handler<ManifoldGetResponse> = jsonHandler<ManifoldGetResponse>(clientOptions.jsonMapper)

        override fun get(params: ManifoldGetParams, requestOptions: RequestOptions): HttpResponseFor<ManifoldGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ManifoldQueryhelpResponse> = jsonHandler<ManifoldQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: ManifoldQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<ManifoldQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "queryhelp")
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

        private val tupleHandler: Handler<List<ManifoldTupleResponse>> = jsonHandler<List<ManifoldTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: ManifoldTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<ManifoldTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "manifold", "tuple")
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
