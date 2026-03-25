// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.groundimagery

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
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryCountParams
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryListParams
import com.unifieddatalibrary.api.models.groundimagery.history.HistoryListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * This collection of services provides operations for querying and manipulation of ground imagery
 * of terrestrial regions from on-orbit, air, and other sensors. Includes metadata on the image
 * (time, region, source, etc) as well as binary content (typically GeoTIFF). Binary content must be
 * downloaded individually by ID using the 'getFile' operation. Well-Known Text (WKT) and GeoJSON
 * formats are used for GIS representation and query support (see
 * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more information on
 * these formats).
 */
class HistoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync =
        HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: HistoryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HistoryListPageAsync> =
        // get /udl/groundimagery/history
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/groundimagery/history/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryServiceAsync.WithRawResponse =
            HistoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<HistoryListResponse>> =
            jsonHandler<List<HistoryListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "history")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                HistoryListPageAsync.builder()
                                    .service(HistoryServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "history", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { countHandler.handle(it) }
                    }
                }
        }
    }
}
