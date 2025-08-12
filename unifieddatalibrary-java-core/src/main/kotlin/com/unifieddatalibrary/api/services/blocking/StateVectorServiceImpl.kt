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
import com.unifieddatalibrary.api.models.StateVectorFull
import com.unifieddatalibrary.api.models.statevector.StateVectorAbridged
import com.unifieddatalibrary.api.models.statevector.StateVectorCountParams
import com.unifieddatalibrary.api.models.statevector.StateVectorCreateBulkParams
import com.unifieddatalibrary.api.models.statevector.StateVectorCreateParams
import com.unifieddatalibrary.api.models.statevector.StateVectorGetParams
import com.unifieddatalibrary.api.models.statevector.StateVectorListPage
import com.unifieddatalibrary.api.models.statevector.StateVectorListParams
import com.unifieddatalibrary.api.models.statevector.StateVectorQueryhelpParams
import com.unifieddatalibrary.api.models.statevector.StateVectorQueryhelpResponse
import com.unifieddatalibrary.api.models.statevector.StateVectorTupleParams
import com.unifieddatalibrary.api.models.statevector.StateVectorUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.StateVectorService
import com.unifieddatalibrary.api.services.blocking.StateVectorServiceImpl
import com.unifieddatalibrary.api.services.blocking.statevector.CurrentService
import com.unifieddatalibrary.api.services.blocking.statevector.CurrentServiceImpl
import com.unifieddatalibrary.api.services.blocking.statevector.HistoryService
import com.unifieddatalibrary.api.services.blocking.statevector.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StateVectorServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : StateVectorService {

    private val withRawResponse: StateVectorService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    override fun withRawResponse(): StateVectorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StateVectorService = StateVectorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun current(): CurrentService = current

    override fun create(params: StateVectorCreateParams, requestOptions: RequestOptions) {
      // post /udl/statevector
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: StateVectorListParams, requestOptions: RequestOptions): StateVectorListPage =
        // get /udl/statevector
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: StateVectorCountParams, requestOptions: RequestOptions): String =
        // get /udl/statevector/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: StateVectorCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/statevector/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: StateVectorGetParams, requestOptions: RequestOptions): StateVectorFull =
        // get /udl/statevector/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: StateVectorQueryhelpParams, requestOptions: RequestOptions): StateVectorQueryhelpResponse =
        // get /udl/statevector/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: StateVectorTupleParams, requestOptions: RequestOptions): List<StateVectorFull> =
        // get /udl/statevector/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-sv
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : StateVectorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val current: CurrentService.WithRawResponse by lazy { CurrentServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StateVectorService.WithRawResponse = StateVectorServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        override fun current(): CurrentService.WithRawResponse = current

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: StateVectorCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector")
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

        private val listHandler: Handler<List<StateVectorAbridged>> = jsonHandler<List<StateVectorAbridged>>(clientOptions.jsonMapper)

        override fun list(params: StateVectorListParams, requestOptions: RequestOptions): HttpResponseFor<StateVectorListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector")
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
                  StateVectorListPage.builder()
                      .service(StateVectorServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: StateVectorCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector", "count")
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

        override fun createBulk(params: StateVectorCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector", "createBulk")
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

        private val getHandler: Handler<StateVectorFull> = jsonHandler<StateVectorFull>(clientOptions.jsonMapper)

        override fun get(params: StateVectorGetParams, requestOptions: RequestOptions): HttpResponseFor<StateVectorFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector", params._pathParam(0))
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

        private val queryhelpHandler: Handler<StateVectorQueryhelpResponse> = jsonHandler<StateVectorQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: StateVectorQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<StateVectorQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector", "queryhelp")
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

        private val tupleHandler: Handler<List<StateVectorFull>> = jsonHandler<List<StateVectorFull>>(clientOptions.jsonMapper)

        override fun tuple(params: StateVectorTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<StateVectorFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "statevector", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: StateVectorUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-sv")
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
                  unvalidatedPublishHandler.handle(it)
              }
          }
        }
    }
}
