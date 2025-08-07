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
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListPageAsync
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListResponse
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeQueryhelpResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorObservationTypeServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SensorObservationTypeServiceAsync {

    private val withRawResponse: SensorObservationTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorObservationTypeServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SensorObservationTypeServiceAsync =
        SensorObservationTypeServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: SensorObservationTypeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorObservationTypeListPageAsync> =
        // get /udl/sensorobservationtype
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SensorObservationTypeGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorObservationTypeGetResponse> =
        // get /udl/sensorobservationtype/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: SensorObservationTypeQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorObservationTypeQueryhelpResponse> =
        // get /udl/sensorobservationtype/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorObservationTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorObservationTypeServiceAsync.WithRawResponse =
            SensorObservationTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<SensorObservationTypeListResponse>> =
            jsonHandler<List<SensorObservationTypeListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorObservationTypeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorobservationtype")
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
                                SensorObservationTypeListPageAsync.builder()
                                    .service(SensorObservationTypeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<SensorObservationTypeGetResponse> =
            jsonHandler<SensorObservationTypeGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorObservationTypeGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorobservationtype", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorObservationTypeQueryhelpResponse> =
            jsonHandler<SensorObservationTypeQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorObservationTypeQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorObservationTypeQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorobservationtype", "queryhelp")
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
