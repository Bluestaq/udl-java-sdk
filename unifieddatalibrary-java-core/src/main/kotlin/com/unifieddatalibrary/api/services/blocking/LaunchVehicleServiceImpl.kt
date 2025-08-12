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
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCountParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCreateParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleDeleteParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListPage
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleUpdateParams
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchVehicleServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LaunchVehicleService {

    private val withRawResponse: LaunchVehicleService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): LaunchVehicleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleService = LaunchVehicleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaunchVehicleCreateParams, requestOptions: RequestOptions) {
      // post /udl/launchvehicle
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LaunchVehicleUpdateParams, requestOptions: RequestOptions) {
      // put /udl/launchvehicle/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: LaunchVehicleListParams, requestOptions: RequestOptions): LaunchVehicleListPage =
        // get /udl/launchvehicle
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LaunchVehicleDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/launchvehicle/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: LaunchVehicleCountParams, requestOptions: RequestOptions): String =
        // get /udl/launchvehicle/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: LaunchVehicleGetParams, requestOptions: RequestOptions): LaunchVehicleGetResponse =
        // get /udl/launchvehicle/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: LaunchVehicleQueryhelpParams, requestOptions: RequestOptions): LaunchVehicleQueryhelpResponse =
        // get /udl/launchvehicle/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: LaunchVehicleTupleParams, requestOptions: RequestOptions): List<LaunchVehicleTupleResponse> =
        // get /udl/launchvehicle/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LaunchVehicleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleService.WithRawResponse = LaunchVehicleServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: LaunchVehicleCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle")
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

        override fun update(params: LaunchVehicleUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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

        private val listHandler: Handler<List<LaunchVehicleListResponse>> = jsonHandler<List<LaunchVehicleListResponse>>(clientOptions.jsonMapper)

        override fun list(params: LaunchVehicleListParams, requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle")
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
                  LaunchVehicleListPage.builder()
                      .service(LaunchVehicleServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: LaunchVehicleDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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

        override fun count(params: LaunchVehicleCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", "count")
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

        private val getHandler: Handler<LaunchVehicleGetResponse> = jsonHandler<LaunchVehicleGetResponse>(clientOptions.jsonMapper)

        override fun get(params: LaunchVehicleGetParams, requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchVehicleQueryhelpResponse> = jsonHandler<LaunchVehicleQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: LaunchVehicleQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchVehicleTupleResponse>> = jsonHandler<List<LaunchVehicleTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: LaunchVehicleTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<LaunchVehicleTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchvehicle", "tuple")
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
