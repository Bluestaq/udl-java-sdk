// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListPage
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorTypeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorTypeService {

    private val withRawResponse: SensorTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorTypeService =
        SensorTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SensorTypeListParams,
        requestOptions: RequestOptions,
    ): SensorTypeListPage =
        // get /udl/sensortype
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: SensorTypeGetParams,
        requestOptions: RequestOptions,
    ): SensorTypeGetResponse =
        // get /udl/sensortype/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SensorTypeQueryhelpParams,
        requestOptions: RequestOptions,
    ): SensorTypeQueryhelpResponse =
        // get /udl/sensortype/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorTypeService.WithRawResponse =
            SensorTypeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<SensorTypeListResponse>> =
            jsonHandler<List<SensorTypeListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorTypeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype")
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
                        SensorTypeListPage.builder()
                            .service(SensorTypeServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<SensorTypeGetResponse> =
            jsonHandler<SensorTypeGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorTypeGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorTypeGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorTypeQueryhelpResponse> =
            jsonHandler<SensorTypeQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorTypeQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorTypeQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensortype", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
