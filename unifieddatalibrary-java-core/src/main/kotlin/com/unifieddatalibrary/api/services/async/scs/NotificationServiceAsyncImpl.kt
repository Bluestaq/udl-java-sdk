// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
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
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListPageAsync
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListParams
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListResponse
import com.unifieddatalibrary.api.services.async.scs.notifications.OffsetServiceAsync
import com.unifieddatalibrary.api.services.async.scs.notifications.OffsetServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offset: OffsetServiceAsync by lazy { OffsetServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun offset(): OffsetServiceAsync = offset

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationListPageAsync> =
        // get /scs/notifications/{offset}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val offset: OffsetServiceAsync.WithRawResponse by lazy {
            OffsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun offset(): OffsetServiceAsync.WithRawResponse = offset

        private val listHandler: Handler<List<NotificationListResponse>> =
            jsonHandler<List<NotificationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", params._pathParam(0))
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
                                NotificationListPageAsync.builder()
                                    .service(NotificationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
