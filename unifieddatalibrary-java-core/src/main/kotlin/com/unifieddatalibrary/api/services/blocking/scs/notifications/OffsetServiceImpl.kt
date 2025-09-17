// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs.notifications

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetLatestParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetResponse
import java.util.function.Consumer

class OffsetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OffsetService {

    private val withRawResponse: OffsetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OffsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService =
        OffsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: OffsetGetParams, requestOptions: RequestOptions): OffsetGetResponse =
        // get /scs/notifications/offsets
        withRawResponse().get(params, requestOptions).parse()

    override fun getLatest(params: OffsetGetLatestParams, requestOptions: RequestOptions) {
        // get /scs/notifications/getLatestOffset
        withRawResponse().getLatest(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OffsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OffsetService.WithRawResponse =
            OffsetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<OffsetGetResponse> =
            jsonHandler<OffsetGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: OffsetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", "offsets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLatestHandler: Handler<Void?> = emptyHandler()

        override fun getLatest(
            params: OffsetGetLatestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", "getLatestOffset")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getLatestHandler.handle(it) }
            }
        }
    }
}
