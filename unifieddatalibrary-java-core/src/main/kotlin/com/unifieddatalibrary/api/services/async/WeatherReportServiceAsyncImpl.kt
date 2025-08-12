// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCountParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportCreateParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportGetParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListPage
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListPageAsync
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportListResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpResponse
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportTupleParams
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.weatherreport.history.WeatherReportFull
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.weatherreport.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.weatherreport.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WeatherReportServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : WeatherReportServiceAsync {

    private val withRawResponse: WeatherReportServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WeatherReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportServiceAsync = WeatherReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: WeatherReportCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/weatherreport
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: WeatherReportListParams, requestOptions: RequestOptions): CompletableFuture<WeatherReportListPageAsync> =
        // get /udl/weatherreport
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: WeatherReportCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/weatherreport/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: WeatherReportGetParams, requestOptions: RequestOptions): CompletableFuture<WeatherReportFull> =
        // get /udl/weatherreport/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: WeatherReportQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<WeatherReportQueryhelpResponse> =
        // get /udl/weatherreport/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: WeatherReportTupleParams, requestOptions: RequestOptions): CompletableFuture<List<WeatherReportFull>> =
        // get /udl/weatherreport/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-weatherreport
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : WeatherReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WeatherReportServiceAsync.WithRawResponse = WeatherReportServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: WeatherReportCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<List<WeatherReportListResponse>> = jsonHandler<List<WeatherReportListResponse>>(clientOptions.jsonMapper)

        override fun list(params: WeatherReportListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<WeatherReportListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  WeatherReportListPageAsync.builder()
                      .service(WeatherReportServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: WeatherReportCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport", "count")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          } }
        }

        private val getHandler: Handler<WeatherReportFull> = jsonHandler<WeatherReportFull>(clientOptions.jsonMapper)

        override fun get(params: WeatherReportGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<WeatherReportFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<WeatherReportQueryhelpResponse> = jsonHandler<WeatherReportQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: WeatherReportQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<WeatherReportQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<WeatherReportFull>> = jsonHandler<List<WeatherReportFull>>(clientOptions.jsonMapper)

        override fun tuple(params: WeatherReportTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<WeatherReportFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "weatherreport", "tuple")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: WeatherReportUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-weatherreport")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  unvalidatedPublishHandler.handle(it)
              }
          } }
        }
    }
}
