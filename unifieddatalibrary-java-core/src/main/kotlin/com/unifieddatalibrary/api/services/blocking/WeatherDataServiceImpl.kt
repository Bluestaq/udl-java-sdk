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
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCountParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateBulkParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataGetParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListPage
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListResponse
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataTupleParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherdata.history.WeatherDataFull
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import com.unifieddatalibrary.api.services.blocking.WeatherDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.weatherdata.HistoryService
import com.unifieddatalibrary.api.services.blocking.weatherdata.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WeatherDataServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : WeatherDataService {

    private val withRawResponse: WeatherDataService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): WeatherDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherDataService = WeatherDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: WeatherDataCreateParams, requestOptions: RequestOptions) {
      // post /udl/weatherdata
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: WeatherDataListParams, requestOptions: RequestOptions): WeatherDataListPage =
        // get /udl/weatherdata
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: WeatherDataCountParams, requestOptions: RequestOptions): String =
        // get /udl/weatherdata/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: WeatherDataCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/weatherdata/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: WeatherDataGetParams, requestOptions: RequestOptions): WeatherDataFull =
        // get /udl/weatherdata/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: WeatherDataQueryhelpParams, requestOptions: RequestOptions): WeatherDataQueryhelpResponse =
        // get /udl/weatherdata/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: WeatherDataTupleParams, requestOptions: RequestOptions): List<WeatherDataFull> =
        // get /udl/weatherdata/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-weatherdata
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : WeatherDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherDataService.WithRawResponse = WeatherDataServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: WeatherDataCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata")
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

        private val listHandler: Handler<List<WeatherDataListResponse>> = jsonHandler<List<WeatherDataListResponse>>(clientOptions.jsonMapper)

        override fun list(params: WeatherDataListParams, requestOptions: RequestOptions): HttpResponseFor<WeatherDataListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata")
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
                  WeatherDataListPage.builder()
                      .service(WeatherDataServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: WeatherDataCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata", "count")
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

        override fun createBulk(params: WeatherDataCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata", "createBulk")
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

        private val getHandler: Handler<WeatherDataFull> = jsonHandler<WeatherDataFull>(clientOptions.jsonMapper)

        override fun get(params: WeatherDataGetParams, requestOptions: RequestOptions): HttpResponseFor<WeatherDataFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata", params._pathParam(0))
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

        private val queryhelpHandler: Handler<WeatherDataQueryhelpResponse> = jsonHandler<WeatherDataQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: WeatherDataQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<WeatherDataQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata", "queryhelp")
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

        private val tupleHandler: Handler<List<WeatherDataFull>> = jsonHandler<List<WeatherDataFull>>(clientOptions.jsonMapper)

        override fun tuple(params: WeatherDataTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<WeatherDataFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherdata", "tuple")
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

        override fun unvalidatedPublish(params: WeatherDataUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-weatherdata")
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
