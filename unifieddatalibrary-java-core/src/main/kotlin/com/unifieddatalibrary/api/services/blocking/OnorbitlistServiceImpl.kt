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
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCountParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCreateParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistDeleteParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListPage
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitlistService
import com.unifieddatalibrary.api.services.blocking.OnorbitlistServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitlistServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitlistService {

    private val withRawResponse: OnorbitlistService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitlistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistService = OnorbitlistServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions) {
      // post /udl/onorbitlist
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions) {
      // put /udl/onorbitlist/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: OnorbitlistListParams, requestOptions: RequestOptions): OnorbitlistListPage =
        // get /udl/onorbitlist
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/onorbitlist/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: OnorbitlistCountParams, requestOptions: RequestOptions): String =
        // get /udl/onorbitlist/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions): OnorbitlistGetResponse =
        // get /udl/onorbitlist/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: OnorbitlistQueryhelpParams, requestOptions: RequestOptions): OnorbitlistQueryhelpResponse =
        // get /udl/onorbitlist/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions): List<OnorbitlistTupleResponse> =
        // get /udl/onorbitlist/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitlistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistService.WithRawResponse = OnorbitlistServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitlistCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist")
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

        override fun update(params: OnorbitlistUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitlistListResponse>> = jsonHandler<List<OnorbitlistListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitlistListParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitlistListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist")
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
                  OnorbitlistListPage.builder()
                      .service(OnorbitlistServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitlistDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        override fun count(params: OnorbitlistCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "count")
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

        private val getHandler: Handler<OnorbitlistGetResponse> = jsonHandler<OnorbitlistGetResponse>(clientOptions.jsonMapper)

        override fun get(params: OnorbitlistGetParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitlistGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OnorbitlistQueryhelpResponse> = jsonHandler<OnorbitlistQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnorbitlistQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitlistQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitlistTupleResponse>> = jsonHandler<List<OnorbitlistTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: OnorbitlistTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<OnorbitlistTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitlist", "tuple")
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
