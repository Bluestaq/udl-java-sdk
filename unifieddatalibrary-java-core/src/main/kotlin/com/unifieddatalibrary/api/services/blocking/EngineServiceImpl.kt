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
import com.unifieddatalibrary.api.models.Engine
import com.unifieddatalibrary.api.models.engines.EngineAbridged
import com.unifieddatalibrary.api.models.engines.EngineCountParams
import com.unifieddatalibrary.api.models.engines.EngineCreateParams
import com.unifieddatalibrary.api.models.engines.EngineDeleteParams
import com.unifieddatalibrary.api.models.engines.EngineListPage
import com.unifieddatalibrary.api.models.engines.EngineListParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpParams
import com.unifieddatalibrary.api.models.engines.EngineQueryhelpResponse
import com.unifieddatalibrary.api.models.engines.EngineRetrieveParams
import com.unifieddatalibrary.api.models.engines.EngineTupleParams
import com.unifieddatalibrary.api.models.engines.EngineUpdateParams
import com.unifieddatalibrary.api.services.blocking.EngineService
import com.unifieddatalibrary.api.services.blocking.EngineServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EngineServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EngineService {

    private val withRawResponse: EngineService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EngineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineService = EngineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EngineCreateParams, requestOptions: RequestOptions) {
      // post /udl/engine
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EngineRetrieveParams, requestOptions: RequestOptions): Engine =
        // get /udl/engine/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: EngineUpdateParams, requestOptions: RequestOptions) {
      // put /udl/engine/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: EngineListParams, requestOptions: RequestOptions): EngineListPage =
        // get /udl/engine
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EngineDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/engine/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: EngineCountParams, requestOptions: RequestOptions): String =
        // get /udl/engine/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: EngineQueryhelpParams, requestOptions: RequestOptions): EngineQueryhelpResponse =
        // get /udl/engine/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: EngineTupleParams, requestOptions: RequestOptions): List<Engine> =
        // get /udl/engine/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EngineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineService.WithRawResponse = EngineServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EngineCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine")
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

        private val retrieveHandler: Handler<Engine> = jsonHandler<Engine>(clientOptions.jsonMapper)

        override fun retrieve(params: EngineRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Engine> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: EngineUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", params._pathParam(0))
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

        private val listHandler: Handler<List<EngineAbridged>> = jsonHandler<List<EngineAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EngineListParams, requestOptions: RequestOptions): HttpResponseFor<EngineListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine")
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
                  EngineListPage.builder()
                      .service(EngineServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EngineDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", params._pathParam(0))
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

        override fun count(params: EngineCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", "count")
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

        private val queryhelpHandler: Handler<EngineQueryhelpResponse> = jsonHandler<EngineQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: EngineQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<EngineQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", "queryhelp")
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

        private val tupleHandler: Handler<List<Engine>> = jsonHandler<List<Engine>>(clientOptions.jsonMapper)

        override fun tuple(params: EngineTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<Engine>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "engine", "tuple")
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
