// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.starcatalog

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.starcatalog.history.HistoryAodrParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HistoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync =
        HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aodr(
        params: HistoryAodrParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /udl/starcatalog/history/aodr
        withRawResponse().aodr(params, requestOptions).thenAccept {}

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

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(
            params: HistoryAodrParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", "history", "aodr")
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
    }
}
