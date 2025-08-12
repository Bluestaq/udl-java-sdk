// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCountParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCreateBulkParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListPage
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarService
import com.unifieddatalibrary.api.services.blocking.observations.MonoradarServiceImpl
import com.unifieddatalibrary.api.services.blocking.observations.monoradar.HistoryService
import com.unifieddatalibrary.api.services.blocking.observations.monoradar.HistoryServiceImpl
import java.util.function.Consumer

class MonoradarServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : MonoradarService {

    private val withRawResponse: MonoradarService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): MonoradarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonoradarService = MonoradarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: MonoradarListParams, requestOptions: RequestOptions): MonoradarListPage =
        // get /udl/monoradar
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: MonoradarCountParams, requestOptions: RequestOptions): String =
        // get /udl/monoradar/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: MonoradarCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/monoradar/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: MonoradarQueryhelpParams, requestOptions: RequestOptions): MonoradarQueryhelpResponse =
        // get /udl/monoradar/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: MonoradarTupleParams, requestOptions: RequestOptions): List<MonoradarTupleResponse> =
        // get /udl/monoradar/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: MonoradarUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/monoradar
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : MonoradarService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonoradarService.WithRawResponse = MonoradarServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<MonoradarListResponse>> = jsonHandler<List<MonoradarListResponse>>(clientOptions.jsonMapper)

        override fun list(params: MonoradarListParams, requestOptions: RequestOptions): HttpResponseFor<MonoradarListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "monoradar")
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
                  MonoradarListPage.builder()
                      .service(MonoradarServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: MonoradarCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "monoradar", "count")
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

        override fun createBulk(params: MonoradarCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "monoradar", "createBulk")
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

        private val queryhelpHandler: Handler<MonoradarQueryhelpResponse> = jsonHandler<MonoradarQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: MonoradarQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<MonoradarQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "monoradar", "queryhelp")
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

        private val tupleHandler: Handler<List<MonoradarTupleResponse>> = jsonHandler<List<MonoradarTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: MonoradarTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<MonoradarTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "monoradar", "tuple")
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

        override fun unvalidatedPublish(params: MonoradarUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "monoradar")
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
