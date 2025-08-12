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
import com.unifieddatalibrary.api.models.swir.SwirCountParams
import com.unifieddatalibrary.api.models.swir.SwirCreateBulkParams
import com.unifieddatalibrary.api.models.swir.SwirCreateParams
import com.unifieddatalibrary.api.models.swir.SwirGetParams
import com.unifieddatalibrary.api.models.swir.SwirListPage
import com.unifieddatalibrary.api.models.swir.SwirListParams
import com.unifieddatalibrary.api.models.swir.SwirListResponse
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpResponse
import com.unifieddatalibrary.api.models.swir.SwirTupleParams
import com.unifieddatalibrary.api.models.swir.history.SwirFull
import com.unifieddatalibrary.api.services.blocking.SwirService
import com.unifieddatalibrary.api.services.blocking.SwirServiceImpl
import com.unifieddatalibrary.api.services.blocking.swir.HistoryService
import com.unifieddatalibrary.api.services.blocking.swir.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SwirServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SwirService {

    private val withRawResponse: SwirService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SwirService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirService = SwirServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SwirCreateParams, requestOptions: RequestOptions) {
      // post /udl/swir
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: SwirListParams, requestOptions: RequestOptions): SwirListPage =
        // get /udl/swir
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SwirCountParams, requestOptions: RequestOptions): String =
        // get /udl/swir/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/swir/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: SwirGetParams, requestOptions: RequestOptions): SwirFull =
        // get /udl/swir/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SwirQueryhelpParams, requestOptions: RequestOptions): SwirQueryhelpResponse =
        // get /udl/swir/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SwirTupleParams, requestOptions: RequestOptions): List<SwirFull> =
        // get /udl/swir/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SwirService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirService.WithRawResponse = SwirServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SwirCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir")
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

        private val listHandler: Handler<List<SwirListResponse>> = jsonHandler<List<SwirListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SwirListParams, requestOptions: RequestOptions): HttpResponseFor<SwirListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir")
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
                  SwirListPage.builder()
                      .service(SwirServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SwirCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "count")
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

        override fun createBulk(params: SwirCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "createBulk")
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

        private val getHandler: Handler<SwirFull> = jsonHandler<SwirFull>(clientOptions.jsonMapper)

        override fun get(params: SwirGetParams, requestOptions: RequestOptions): HttpResponseFor<SwirFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SwirQueryhelpResponse> = jsonHandler<SwirQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SwirQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SwirQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "queryhelp")
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

        private val tupleHandler: Handler<List<SwirFull>> = jsonHandler<List<SwirFull>>(clientOptions.jsonMapper)

        override fun tuple(params: SwirTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SwirFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "swir", "tuple")
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
