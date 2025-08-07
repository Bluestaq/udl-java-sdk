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
import com.unifieddatalibrary.api.models.hazard.HazardCountParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateBulkParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateParams
import com.unifieddatalibrary.api.models.hazard.HazardGetParams
import com.unifieddatalibrary.api.models.hazard.HazardGetResponse
import com.unifieddatalibrary.api.models.hazard.HazardListPage
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardListResponse
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpResponse
import com.unifieddatalibrary.api.models.hazard.HazardTupleParams
import com.unifieddatalibrary.api.models.hazard.HazardTupleResponse
import com.unifieddatalibrary.api.services.blocking.hazard.HistoryService
import com.unifieddatalibrary.api.services.blocking.hazard.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HazardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HazardService {

    private val withRawResponse: HazardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): HazardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardService =
        HazardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: HazardCreateParams, requestOptions: RequestOptions) {
        // post /udl/hazard
        withRawResponse().create(params, requestOptions)
    }

    override fun list(params: HazardListParams, requestOptions: RequestOptions): HazardListPage =
        // get /udl/hazard
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: HazardCountParams, requestOptions: RequestOptions): String =
        // get /udl/hazard/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/hazard/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: HazardGetParams, requestOptions: RequestOptions): HazardGetResponse =
        // get /udl/hazard/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: HazardQueryhelpParams,
        requestOptions: RequestOptions,
    ): HazardQueryhelpResponse =
        // get /udl/hazard/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: HazardTupleParams,
        requestOptions: RequestOptions,
    ): List<HazardTupleResponse> =
        // get /udl/hazard/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HazardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HazardService.WithRawResponse =
            HazardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: HazardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<HazardListResponse>> =
            jsonHandler<List<HazardListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: HazardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HazardListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard")
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
                        HazardListPage.builder()
                            .service(HazardServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: HazardCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard", "count")
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
            params: HazardCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<HazardGetResponse> =
            jsonHandler<HazardGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: HazardGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HazardGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard", params._pathParam(0))
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

        private val queryhelpHandler: Handler<HazardQueryhelpResponse> =
            jsonHandler<HazardQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: HazardQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HazardQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard", "queryhelp")
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

        private val tupleHandler: Handler<List<HazardTupleResponse>> =
            jsonHandler<List<HazardTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: HazardTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<HazardTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "hazard", "tuple")
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
