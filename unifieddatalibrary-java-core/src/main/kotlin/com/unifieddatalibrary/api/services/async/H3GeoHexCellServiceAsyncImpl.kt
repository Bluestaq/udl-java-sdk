// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellCountParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListPage
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListPageAsync
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleResponse
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class H3GeoHexCellServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : H3GeoHexCellServiceAsync {

    private val withRawResponse: H3GeoHexCellServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): H3GeoHexCellServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellServiceAsync = H3GeoHexCellServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: H3GeoHexCellListParams, requestOptions: RequestOptions): CompletableFuture<H3GeoHexCellListPageAsync> =
        // get /udl/h3geohexcell
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: H3GeoHexCellCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/h3geohexcell/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: H3GeoHexCellQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<H3GeoHexCellQueryhelpResponse> =
        // get /udl/h3geohexcell/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: H3GeoHexCellTupleParams, requestOptions: RequestOptions): CompletableFuture<List<H3GeoHexCellTupleResponse>> =
        // get /udl/h3geohexcell/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : H3GeoHexCellServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellServiceAsync.WithRawResponse = H3GeoHexCellServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<H3GeoHexCellListResponse>> = jsonHandler<List<H3GeoHexCellListResponse>>(clientOptions.jsonMapper)

        override fun list(params: H3GeoHexCellListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<H3GeoHexCellListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geohexcell")
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
                  H3GeoHexCellListPageAsync.builder()
                      .service(H3GeoHexCellServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: H3GeoHexCellCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geohexcell", "count")
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

        private val queryhelpHandler: Handler<H3GeoHexCellQueryhelpResponse> = jsonHandler<H3GeoHexCellQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: H3GeoHexCellQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<H3GeoHexCellQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geohexcell", "queryhelp")
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

        private val tupleHandler: Handler<List<H3GeoHexCellTupleResponse>> = jsonHandler<List<H3GeoHexCellTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: H3GeoHexCellTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<H3GeoHexCellTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "h3geohexcell", "tuple")
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
    }
}
