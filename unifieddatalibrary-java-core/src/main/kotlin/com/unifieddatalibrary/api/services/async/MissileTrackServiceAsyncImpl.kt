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
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCountParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCreateBulkParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListPage
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListPageAsync
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.missiletracks.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.missiletracks.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MissileTrackServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : MissileTrackServiceAsync {

    private val withRawResponse: MissileTrackServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MissileTrackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackServiceAsync = MissileTrackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(params: MissileTrackListParams, requestOptions: RequestOptions): CompletableFuture<MissileTrackListPageAsync> =
        // get /udl/missiletrack
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: MissileTrackCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/missiletrack/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/missiletrack/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryhelp(params: MissileTrackQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<MissileTrackQueryhelpResponse> =
        // get /udl/missiletrack/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions): CompletableFuture<List<MissileTrackTupleResponse>> =
        // get /udl/missiletrack/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-missiletrack
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : MissileTrackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackServiceAsync.WithRawResponse = MissileTrackServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<MissileTrackListResponse>> = jsonHandler<List<MissileTrackListResponse>>(clientOptions.jsonMapper)

        override fun list(params: MissileTrackListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<MissileTrackListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack")
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
                  MissileTrackListPageAsync.builder()
                      .service(MissileTrackServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: MissileTrackCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "createBulk")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createBulkHandler.handle(it)
              }
          } }
        }

        private val queryhelpHandler: Handler<MissileTrackQueryhelpResponse> = jsonHandler<MissileTrackQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: MissileTrackQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<MissileTrackQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "queryhelp")
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

        private val tupleHandler: Handler<List<MissileTrackTupleResponse>> = jsonHandler<List<MissileTrackTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<MissileTrackTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "tuple")
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

        override fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-missiletrack")
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
