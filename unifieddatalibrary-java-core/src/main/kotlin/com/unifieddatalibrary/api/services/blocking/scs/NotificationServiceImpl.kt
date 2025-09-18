// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListPage
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListParams
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListResponse
import com.unifieddatalibrary.api.services.blocking.scs.notifications.OffsetService
import com.unifieddatalibrary.api.services.blocking.scs.notifications.OffsetServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offset: OffsetService by lazy { OffsetServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService =
        NotificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun offset(): OffsetService = offset

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): NotificationListPage =
        // get /scs/notifications/{offset}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val offset: OffsetService.WithRawResponse by lazy {
            OffsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse =
            NotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun offset(): OffsetService.WithRawResponse = offset

        private val listHandler: Handler<List<NotificationListResponse>> =
            jsonHandler<List<NotificationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "notifications", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        NotificationListPage.builder()
                            .service(NotificationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
