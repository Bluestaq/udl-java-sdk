// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
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
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.port.PortCountParams
import com.unifieddatalibrary.api.models.port.PortCreateBulkParams
import com.unifieddatalibrary.api.models.port.PortCreateParams
import com.unifieddatalibrary.api.models.port.PortGetParams
import com.unifieddatalibrary.api.models.port.PortGetResponse
import com.unifieddatalibrary.api.models.port.PortListPage
import com.unifieddatalibrary.api.models.port.PortListParams
import com.unifieddatalibrary.api.models.port.PortListResponse
import com.unifieddatalibrary.api.models.port.PortQueryhelpParams
import com.unifieddatalibrary.api.models.port.PortQueryhelpResponse
import com.unifieddatalibrary.api.models.port.PortTupleParams
import com.unifieddatalibrary.api.models.port.PortTupleResponse
import com.unifieddatalibrary.api.models.port.PortUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortServiceImpl internal constructor(private val clientOptions: ClientOptions) : PortService {

    private val withRawResponse: PortService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortService =
        PortServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: PortCreateParams, requestOptions: RequestOptions) {
        // post /udl/port
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: PortUpdateParams, requestOptions: RequestOptions) {
        // put /udl/port/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: PortListParams, requestOptions: RequestOptions): PortListPage =
        // get /udl/port
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: PortCountParams, requestOptions: RequestOptions): String =
        // get /udl/port/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: PortCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/port/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: PortGetParams, requestOptions: RequestOptions): PortGetResponse =
        // get /udl/port/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: PortQueryhelpParams,
        requestOptions: RequestOptions,
    ): PortQueryhelpResponse =
        // get /udl/port/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: PortTupleParams,
        requestOptions: RequestOptions,
    ): List<PortTupleResponse> =
        // get /udl/port/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortService.WithRawResponse =
            PortServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: PortCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port")
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
            params: PortUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<PortListResponse>> =
            jsonHandler<List<PortListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: PortListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port")
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
                        PortListPage.builder()
                            .service(PortServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: PortCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: PortCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PortGetResponse> =
            jsonHandler<PortGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PortGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", params._pathParam(0))
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

        private val queryhelpHandler: Handler<PortQueryhelpResponse> =
            jsonHandler<PortQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: PortQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", "queryhelp")
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

        private val tupleHandler: Handler<List<PortTupleResponse>> =
            jsonHandler<List<PortTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: PortTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PortTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "port", "tuple")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { tupleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
