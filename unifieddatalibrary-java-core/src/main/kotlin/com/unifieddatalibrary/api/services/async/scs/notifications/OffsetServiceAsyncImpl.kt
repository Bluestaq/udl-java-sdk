// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs.notifications

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetLatestParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OffsetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OffsetServiceAsync {

    private val withRawResponse: OffsetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OffsetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync =
        OffsetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: OffsetGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OffsetGetResponse> =
        // get /scs/notifications/offsets
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getLatest(
        params: OffsetGetLatestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /scs/notifications/getLatestOffset
        withRawResponse().getLatest(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OffsetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OffsetServiceAsync.WithRawResponse =
            OffsetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<OffsetGetResponse> =
            jsonHandler<OffsetGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: OffsetGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OffsetGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", "offsets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLatestHandler: Handler<Void?> = emptyHandler()

        override fun getLatest(
            params: OffsetGetLatestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", "getLatestOffset")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getLatestHandler.handle(it) }
                    }
                }
        }
    }
}
