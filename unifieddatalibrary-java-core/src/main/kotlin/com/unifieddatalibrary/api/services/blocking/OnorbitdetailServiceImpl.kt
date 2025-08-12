// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.OnorbitDetailsFull
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailCreateParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailDeleteParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailGetParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListPage
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailListResponse
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitdetailServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitdetailService {

    private val withRawResponse: OnorbitdetailService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitdetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailService = OnorbitdetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions) {
      // post /udl/onorbitdetails
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions) {
      // put /udl/onorbitdetails/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: OnorbitdetailListParams, requestOptions: RequestOptions): OnorbitdetailListPage =
        // get /udl/onorbitdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/onorbitdetails/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions): OnorbitDetailsFull =
        // get /udl/onorbitdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitdetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitdetailService.WithRawResponse = OnorbitdetailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitdetailCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitdetails")
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

        override fun update(params: OnorbitdetailUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitdetails", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitdetailListResponse>> = jsonHandler<List<OnorbitdetailListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitdetailListParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitdetailListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitdetails")
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
                  OnorbitdetailListPage.builder()
                      .service(OnorbitdetailServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitdetailDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitdetails", params._pathParam(0))
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

        private val getHandler: Handler<OnorbitDetailsFull> = jsonHandler<OnorbitDetailsFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitdetailGetParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitDetailsFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitdetails", params._pathParam(0))
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
    }
}
