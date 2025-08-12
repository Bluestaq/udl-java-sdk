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
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCountParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCreateParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListPage
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterListResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterUpdateParams
import com.unifieddatalibrary.api.services.blocking.RfEmitterService
import com.unifieddatalibrary.api.services.blocking.RfEmitterServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfEmitterServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RfEmitterService {

    private val withRawResponse: RfEmitterService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RfEmitterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterService = RfEmitterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RfEmitterCreateParams, requestOptions: RequestOptions) {
      // post /udl/rfemitter
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: RfEmitterUpdateParams, requestOptions: RequestOptions) {
      // put /udl/rfemitter/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: RfEmitterListParams, requestOptions: RequestOptions): RfEmitterListPage =
        // get /udl/rfemitter
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RfEmitterDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/rfemitter/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: RfEmitterCountParams, requestOptions: RequestOptions): String =
        // get /udl/rfemitter/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: RfEmitterGetParams, requestOptions: RequestOptions): RfEmitterGetResponse =
        // get /udl/rfemitter/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: RfEmitterQueryhelpParams, requestOptions: RequestOptions): RfEmitterQueryhelpResponse =
        // get /udl/rfemitter/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: RfEmitterTupleParams, requestOptions: RequestOptions): List<RfEmitterTupleResponse> =
        // get /udl/rfemitter/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RfEmitterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterService.WithRawResponse = RfEmitterServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: RfEmitterCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter")
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

        override fun update(params: RfEmitterUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        private val listHandler: Handler<List<RfEmitterListResponse>> = jsonHandler<List<RfEmitterListResponse>>(clientOptions.jsonMapper)

        override fun list(params: RfEmitterListParams, requestOptions: RequestOptions): HttpResponseFor<RfEmitterListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter")
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
                  RfEmitterListPage.builder()
                      .service(RfEmitterServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: RfEmitterDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        override fun count(params: RfEmitterCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "count")
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

        private val getHandler: Handler<RfEmitterGetResponse> = jsonHandler<RfEmitterGetResponse>(clientOptions.jsonMapper)

        override fun get(params: RfEmitterGetParams, requestOptions: RequestOptions): HttpResponseFor<RfEmitterGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", params._pathParam(0))
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

        private val queryhelpHandler: Handler<RfEmitterQueryhelpResponse> = jsonHandler<RfEmitterQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: RfEmitterQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<RfEmitterQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "queryhelp")
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

        private val tupleHandler: Handler<List<RfEmitterTupleResponse>> = jsonHandler<List<RfEmitterTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: RfEmitterTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<RfEmitterTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfemitter", "tuple")
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
