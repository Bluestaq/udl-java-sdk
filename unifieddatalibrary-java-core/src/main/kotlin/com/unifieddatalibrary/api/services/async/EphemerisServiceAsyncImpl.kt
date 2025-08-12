// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.EphemerisFull
import com.unifieddatalibrary.api.models.ephemeris.EphemerisAbridged
import com.unifieddatalibrary.api.models.ephemeris.EphemerisCountParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisFileUploadParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListPage
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListPageAsync
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemeris.EphemerisTupleParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ephemeris.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.ephemeris.AttitudeDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ephemeris.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ephemeris.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EphemerisServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EphemerisServiceAsync {

    private val withRawResponse: EphemerisServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val attitudeData: AttitudeDataServiceAsync by lazy { AttitudeDataServiceAsyncImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EphemerisServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisServiceAsync = EphemerisServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attitudeData(): AttitudeDataServiceAsync = attitudeData

    override fun history(): HistoryServiceAsync = history

    override fun list(params: EphemerisListParams, requestOptions: RequestOptions): CompletableFuture<EphemerisListPageAsync> =
        // get /udl/ephemeris
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: EphemerisCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/ephemeris/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun fileUpload(params: EphemerisFileUploadParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/ephem
        withRawResponse().fileUpload(params, requestOptions).thenAccept {}

    override fun queryhelp(params: EphemerisQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<EphemerisQueryhelpResponse> =
        // get /udl/ephemeris/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EphemerisTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EphemerisFull>> =
        // get /udl/ephemeris/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: EphemerisUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-ephset
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EphemerisServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attitudeData: AttitudeDataServiceAsync.WithRawResponse by lazy { AttitudeDataServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisServiceAsync.WithRawResponse = EphemerisServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse = attitudeData

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<EphemerisAbridged>> = jsonHandler<List<EphemerisAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EphemerisListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EphemerisListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ephemeris")
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
                  EphemerisListPageAsync.builder()
                      .service(EphemerisServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: EphemerisCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ephemeris", "count")
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

        private val fileUploadHandler: Handler<Void?> = emptyHandler()

        override fun fileUpload(params: EphemerisFileUploadParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "ephem")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  fileUploadHandler.handle(it)
              }
          } }
        }

        private val queryhelpHandler: Handler<EphemerisQueryhelpResponse> = jsonHandler<EphemerisQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: EphemerisQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EphemerisQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ephemeris", "queryhelp")
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

        private val tupleHandler: Handler<List<EphemerisFull>> = jsonHandler<List<EphemerisFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EphemerisTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EphemerisFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ephemeris", "tuple")
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

        override fun unvalidatedPublish(params: EphemerisUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-ephset")
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
