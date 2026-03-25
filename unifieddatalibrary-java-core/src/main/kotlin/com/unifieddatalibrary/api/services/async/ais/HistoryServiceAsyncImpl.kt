// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.ais

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
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.AisFull
import com.unifieddatalibrary.api.models.ais.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ais.history.HistoryCountParams
import com.unifieddatalibrary.api.models.ais.history.HistoryListPageAsync
import com.unifieddatalibrary.api.models.ais.history.HistoryListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * These services provide for posting and querying of self-reported information obtained from the
 * Automatic Identification System (AIS) equipment. This contains information such as unique
 * identification, status, position, course, and speed. The AIS is an automatic tracking system that
 * uses transceivers on ships and is used by vessel traffic services. Although technically and
 * operationally distinct, the AIS system is analogous to ADS-B which performs a similar function
 * for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow maritime
 * authorities to track and monitor vessel movements. AIS integrates a standardized VHF transceiver
 * with a positioning system, such as Global Positioning System receiver, with other electronic
 * navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted with AIS
 * transceivers can be tracked by AIS base stations located along coastlines or, when out of range
 * of terrestrial networks, through a growing number of satellites that are fitted with special AIS
 * receivers that are capable of deconflicting a large number of signatures.
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
        // get /udl/ais/history
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun aodr(
        params: HistoryAodrParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /udl/ais/history/aodr
        withRawResponse().aodr(params, requestOptions).thenAccept {}

    override fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/ais/history/count
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

        private val listHandler: Handler<List<AisFull>> =
            jsonHandler<List<AisFull>>(clientOptions.jsonMapper)

        override fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HistoryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "history")
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

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(
            params: HistoryAodrParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ais", "history", "aodr")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { aodrHandler.handle(it) }
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
                    .addPathSegments("udl", "ais", "history", "count")
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
