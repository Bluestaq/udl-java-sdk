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
import com.unifieddatalibrary.api.models.SubStatusFull
import com.unifieddatalibrary.api.models.substatus.SubstatusCountParams
import com.unifieddatalibrary.api.models.substatus.SubstatusCreateParams
import com.unifieddatalibrary.api.models.substatus.SubstatusDeleteParams
import com.unifieddatalibrary.api.models.substatus.SubstatusGetParams
import com.unifieddatalibrary.api.models.substatus.SubstatusListPage
import com.unifieddatalibrary.api.models.substatus.SubstatusListParams
import com.unifieddatalibrary.api.models.substatus.SubstatusListResponse
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpParams
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.substatus.SubstatusTupleParams
import com.unifieddatalibrary.api.models.substatus.SubstatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.SubstatusService
import com.unifieddatalibrary.api.services.blocking.SubstatusServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubstatusServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SubstatusService {

    private val withRawResponse: SubstatusService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SubstatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubstatusService = SubstatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SubstatusCreateParams, requestOptions: RequestOptions) {
      // post /udl/substatus
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SubstatusUpdateParams, requestOptions: RequestOptions) {
      // put /udl/substatus/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SubstatusListParams, requestOptions: RequestOptions): SubstatusListPage =
        // get /udl/substatus
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SubstatusDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/substatus/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SubstatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/substatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SubstatusGetParams, requestOptions: RequestOptions): SubStatusFull =
        // get /udl/substatus/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SubstatusQueryhelpParams, requestOptions: RequestOptions): SubstatusQueryhelpResponse =
        // get /udl/substatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SubstatusTupleParams, requestOptions: RequestOptions): List<SubStatusFull> =
        // get /udl/substatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SubstatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubstatusService.WithRawResponse = SubstatusServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SubstatusCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus")
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

        override fun update(params: SubstatusUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", params._pathParam(0))
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

        private val listHandler: Handler<List<SubstatusListResponse>> = jsonHandler<List<SubstatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SubstatusListParams, requestOptions: RequestOptions): HttpResponseFor<SubstatusListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus")
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
                  SubstatusListPage.builder()
                      .service(SubstatusServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SubstatusDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", params._pathParam(0))
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

        override fun count(params: SubstatusCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", "count")
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

        private val getHandler: Handler<SubStatusFull> = jsonHandler<SubStatusFull>(clientOptions.jsonMapper)

        override fun get(params: SubstatusGetParams, requestOptions: RequestOptions): HttpResponseFor<SubStatusFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SubstatusQueryhelpResponse> = jsonHandler<SubstatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SubstatusQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SubstatusQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", "queryhelp")
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

        private val tupleHandler: Handler<List<SubStatusFull>> = jsonHandler<List<SubStatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SubstatusTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SubStatusFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "substatus", "tuple")
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
