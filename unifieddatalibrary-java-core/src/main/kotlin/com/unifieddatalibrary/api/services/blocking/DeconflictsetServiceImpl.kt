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
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCountParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCreateParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListPage
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.deconflictset.HistoryService
import com.unifieddatalibrary.api.services.blocking.deconflictset.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DeconflictsetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeconflictsetService {

    private val withRawResponse: DeconflictsetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): DeconflictsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeconflictsetService =
        DeconflictsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: DeconflictsetCreateParams, requestOptions: RequestOptions) {
        // post /udl/deconflictset
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: DeconflictsetListParams,
        requestOptions: RequestOptions,
    ): DeconflictsetListPage =
        // get /udl/deconflictset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: DeconflictsetCountParams, requestOptions: RequestOptions): String =
        // get /udl/deconflictset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: DeconflictsetGetParams,
        requestOptions: RequestOptions,
    ): DeconflictsetGetResponse =
        // get /udl/deconflictset/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: DeconflictsetQueryhelpParams,
        requestOptions: RequestOptions,
    ): DeconflictsetQueryhelpResponse =
        // get /udl/deconflictset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: DeconflictsetTupleParams,
        requestOptions: RequestOptions,
    ): List<DeconflictsetTupleResponse> =
        // get /udl/deconflictset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: DeconflictsetUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-deconflictset
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeconflictsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeconflictsetService.WithRawResponse =
            DeconflictsetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: DeconflictsetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<DeconflictsetListResponse>> =
            jsonHandler<List<DeconflictsetListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: DeconflictsetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeconflictsetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset")
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
                        DeconflictsetListPage.builder()
                            .service(DeconflictsetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: DeconflictsetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<DeconflictsetGetResponse> =
            jsonHandler<DeconflictsetGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DeconflictsetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeconflictsetGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset", params._pathParam(0))
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

        private val queryhelpHandler: Handler<DeconflictsetQueryhelpResponse> =
            jsonHandler<DeconflictsetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: DeconflictsetQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeconflictsetQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset", "queryhelp")
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

        private val tupleHandler: Handler<List<DeconflictsetTupleResponse>> =
            jsonHandler<List<DeconflictsetTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: DeconflictsetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DeconflictsetTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "deconflictset", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: DeconflictsetUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-deconflictset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
