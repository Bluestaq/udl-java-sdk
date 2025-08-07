// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListPageAsync
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorTypeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorTypeServiceAsync {

    private val withRawResponse: SensorTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorTypeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorTypeServiceAsync =
        SensorTypeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SensorTypeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorTypeListPageAsync> =
        // get /udl/sensortype
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SensorTypeGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorTypeGetResponse> =
        // get /udl/sensortype/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: SensorTypeQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorTypeQueryhelpResponse> =
        // get /udl/sensortype/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorTypeServiceAsync.WithRawResponse =
            SensorTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<SensorTypeListResponse>> =
            jsonHandler<List<SensorTypeListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorTypeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorTypeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype")
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
                                SensorTypeListPageAsync.builder()
                                    .service(SensorTypeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<SensorTypeGetResponse> =
            jsonHandler<SensorTypeGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorTypeGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorTypeQueryhelpResponse> =
            jsonHandler<SensorTypeQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorTypeQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorTypeQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryhelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
