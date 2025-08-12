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
import com.unifieddatalibrary.api.models.OnorbitBatteryFull
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryCreateParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryDeleteParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryGetParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListPage
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListResponse
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryUpdateParams
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitbatteryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitbatteryService {

    private val withRawResponse: OnorbitbatteryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OnorbitbatteryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitbatteryService = OnorbitbatteryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbitbatteryCreateParams, requestOptions: RequestOptions) {
      // post /udl/onorbitbattery
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions) {
      // put /udl/onorbitbattery/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: OnorbitbatteryListParams, requestOptions: RequestOptions): OnorbitbatteryListPage =
        // get /udl/onorbitbattery
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnorbitbatteryDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/onorbitbattery/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: OnorbitbatteryGetParams, requestOptions: RequestOptions): OnorbitBatteryFull =
        // get /udl/onorbitbattery/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitbatteryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitbatteryService.WithRawResponse = OnorbitbatteryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitbatteryCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitbattery")
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

        override fun update(params: OnorbitbatteryUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitbattery", params._pathParam(0))
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

        private val listHandler: Handler<List<OnorbitbatteryListResponse>> = jsonHandler<List<OnorbitbatteryListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitbatteryListParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitbatteryListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitbattery")
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
                  OnorbitbatteryListPage.builder()
                      .service(OnorbitbatteryServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitbatteryDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitbattery", params._pathParam(0))
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

        private val getHandler: Handler<OnorbitBatteryFull> = jsonHandler<OnorbitBatteryFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitbatteryGetParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitBatteryFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitbattery", params._pathParam(0))
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
