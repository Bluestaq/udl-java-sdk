// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateBulkParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingDeleteParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListPage
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorStatingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorStatingService {

    private val withRawResponse: SensorStatingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorStatingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorStatingService =
        SensorStatingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SensorStatingCreateParams, requestOptions: RequestOptions) {
        // post /udl/sensorstaging
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SensorStatingUpdateParams, requestOptions: RequestOptions) {
        // put /udl/sensorstaging/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SensorStatingListParams,
        requestOptions: RequestOptions,
    ): SensorStatingListPage =
        // get /udl/sensorstaging
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SensorStatingDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/sensorstaging/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createBulk(params: SensorStatingCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/sensorstaging/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: SensorStatingGetParams,
        requestOptions: RequestOptions,
    ): SensorStatingGetResponse =
        // get /udl/sensorstaging/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SensorStatingQueryhelpParams,
        requestOptions: RequestOptions,
    ): SensorStatingQueryhelpResponse =
        // get /udl/sensorstaging/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorStatingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorStatingService.WithRawResponse =
            SensorStatingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SensorStatingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: SensorStatingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SensorStatingListResponse>> =
            jsonHandler<List<SensorStatingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SensorStatingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorStatingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging")
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
                        SensorStatingListPage.builder()
                            .service(SensorStatingServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SensorStatingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: SensorStatingCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SensorStatingGetResponse> =
            jsonHandler<SensorStatingGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SensorStatingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorStatingGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SensorStatingQueryhelpResponse> =
            jsonHandler<SensorStatingQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SensorStatingQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorStatingQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sensorstaging", "queryhelp")
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
