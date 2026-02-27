// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onboardnavigation

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.OnboardnavigationFull
import com.unifieddatalibrary.api.models.onboardnavigation.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.onboardnavigation.history.HistoryCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.history.HistoryListPage
import com.unifieddatalibrary.api.models.onboardnavigation.history.HistoryListParams
import java.util.function.Consumer

/**
 * This collection of services provides operations for querying and manipulation of electro-optical
 * (EO), radar, radio frequency (RF), Global Navigation Satellite Systems (GNSS), Ionospheric
 * (IONO), Infrared (SWIR), and Space Environment observation data. The J2000 coordinate frame is
 * the preferred frame for all observations, as applicable, but in some cases observations may be in
 * an alternate frame depending on the provider and/or datatype.
 */
class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: HistoryListParams, requestOptions: RequestOptions): HistoryListPage =
        // get /udl/onboardnavigation/history
        withRawResponse().list(params, requestOptions).parse()

    override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions) {
        // get /udl/onboardnavigation/history/aodr
        withRawResponse().aodr(params, requestOptions)
    }

    override fun count(params: HistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/onboardnavigation/history/count
        withRawResponse().count(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<OnboardnavigationFull>> =
            jsonHandler<List<OnboardnavigationFull>>(clientOptions.jsonMapper)

        override fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HistoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "history")
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
                        HistoryListPage.builder()
                            .service(HistoryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val aodrHandler: Handler<Void?> = emptyHandler()

        override fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { aodrHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "history", "count")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }
    }
}
