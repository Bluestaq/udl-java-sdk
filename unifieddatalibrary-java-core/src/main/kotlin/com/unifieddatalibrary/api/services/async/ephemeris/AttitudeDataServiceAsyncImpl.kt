// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.ephemeris

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
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataAbridged
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListPageAsync
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListParams
import com.unifieddatalibrary.api.services.async.ephemeris.attitudedata.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ephemeris.attitudedata.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AttitudeDataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AttitudeDataServiceAsync {

    private val withRawResponse: AttitudeDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AttitudeDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync =
        AttitudeDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(
        params: AttitudeDataListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttitudeDataListPageAsync> =
        // get /udl/attitudedata
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: AttitudeDataCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/attitudedata/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttitudeDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudeDataServiceAsync.WithRawResponse =
            AttitudeDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<AttitudeDataAbridged>> =
            jsonHandler<List<AttitudeDataAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AttitudeDataListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttitudeDataListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudedata")
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
                                AttitudeDataListPageAsync.builder()
                                    .service(AttitudeDataServiceAsyncImpl(clientOptions))
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
            params: AttitudeDataCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudedata", "count")
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
