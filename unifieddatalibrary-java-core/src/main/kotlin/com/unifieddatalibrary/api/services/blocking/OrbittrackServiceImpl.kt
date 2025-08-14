// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCountParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCreateBulkParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListPage
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.orbittrack.HistoryService
import com.unifieddatalibrary.api.services.blocking.orbittrack.HistoryServiceImpl
import java.util.function.Consumer

class OrbittrackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrbittrackService {

    private val withRawResponse: OrbittrackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): OrbittrackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackService =
        OrbittrackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(
        params: OrbittrackListParams,
        requestOptions: RequestOptions,
    ): OrbittrackListPage =
        // get /udl/orbittrack
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: OrbittrackCountParams, requestOptions: RequestOptions): String =
        // get /udl/orbittrack/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/orbittrack/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: OrbittrackQueryhelpParams,
        requestOptions: RequestOptions,
    ): OrbittrackQueryhelpResponse =
        // get /udl/orbittrack/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: OrbittrackTupleParams,
        requestOptions: RequestOptions,
    ): List<OrbittrackTupleResponse> =
        // get /udl/orbittrack/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: OrbittrackUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-orbittrack
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbittrackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrbittrackService.WithRawResponse =
            OrbittrackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<OrbittrackListResponse>> =
            jsonHandler<List<OrbittrackListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OrbittrackListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbittrackListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbittrack")
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
                        OrbittrackListPage.builder()
                            .service(OrbittrackServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: OrbittrackCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbittrack", "count")
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
            params: OrbittrackCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbittrack", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<OrbittrackQueryhelpResponse> =
            jsonHandler<OrbittrackQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: OrbittrackQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbittrackQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbittrack", "queryhelp")
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

        private val tupleHandler: Handler<List<OrbittrackTupleResponse>> =
            jsonHandler<List<OrbittrackTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: OrbittrackTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrbittrackTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbittrack", "tuple")
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
            params: OrbittrackUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-orbittrack")
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
