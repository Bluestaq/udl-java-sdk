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
import com.unifieddatalibrary.api.models.OnorbitthrusterstatusFull
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusDeleteParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusGetParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListPage
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusTupleParams
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus.HistoryService
import com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitthrusterstatusServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OnorbitthrusterstatusService {

    private val withRawResponse: OnorbitthrusterstatusService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): OnorbitthrusterstatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusService = OnorbitthrusterstatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions) {
      // post /udl/onorbitthrusterstatus
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: OnorbitthrusterstatusListParams, requestOptions: RequestOptions): OnorbitthrusterstatusListPage =
        // get /udl/onorbitthrusterstatus
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/onorbitthrusterstatus/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: OnorbitthrusterstatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/onorbitthrusterstatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/onorbitthrusterstatus/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions): OnorbitthrusterstatusFull =
        // get /udl/onorbitthrusterstatus/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams, requestOptions: RequestOptions): OnorbitthrusterstatusQueryhelpResponse =
        // get /udl/onorbitthrusterstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions): List<OnorbitthrusterstatusFull> =
        // get /udl/onorbitthrusterstatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OnorbitthrusterstatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusService.WithRawResponse = OnorbitthrusterstatusServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OnorbitthrusterstatusCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus")
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

        private val listHandler: Handler<List<OnorbitthrusterstatusListResponse>> = jsonHandler<List<OnorbitthrusterstatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OnorbitthrusterstatusListParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitthrusterstatusListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus")
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
                  OnorbitthrusterstatusListPage.builder()
                      .service(OnorbitthrusterstatusServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OnorbitthrusterstatusDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", params._pathParam(0))
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

        override fun count(params: OnorbitthrusterstatusCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "count")
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

        override fun createBulk(params: OnorbitthrusterstatusCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "createBulk")
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

        private val getHandler: Handler<OnorbitthrusterstatusFull> = jsonHandler<OnorbitthrusterstatusFull>(clientOptions.jsonMapper)

        override fun get(params: OnorbitthrusterstatusGetParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitthrusterstatusFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OnorbitthrusterstatusQueryhelpResponse> = jsonHandler<OnorbitthrusterstatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OnorbitthrusterstatusQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitthrusterstatusFull>> = jsonHandler<List<OnorbitthrusterstatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OnorbitthrusterstatusTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<OnorbitthrusterstatusFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "onorbitthrusterstatus", "tuple")
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
