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
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCountParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateBulkParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListPage
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.ecpedr.HistoryService
import com.unifieddatalibrary.api.services.blocking.ecpedr.HistoryServiceImpl
import java.util.function.Consumer

class EcpedrServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EcpedrService {

    private val withRawResponse: EcpedrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EcpedrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpedrService =
        EcpedrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: EcpedrCreateParams, requestOptions: RequestOptions) {
        // post /udl/ecpedr
        withRawResponse().create(params, requestOptions)
    }

    override fun list(params: EcpedrListParams, requestOptions: RequestOptions): EcpedrListPage =
        // get /udl/ecpedr
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EcpedrCountParams, requestOptions: RequestOptions): String =
        // get /udl/ecpedr/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EcpedrCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/ecpedr/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: EcpedrQueryhelpParams,
        requestOptions: RequestOptions,
    ): EcpedrQueryhelpResponse =
        // get /udl/ecpedr/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: EcpedrTupleParams,
        requestOptions: RequestOptions,
    ): List<EcpedrTupleResponse> =
        // get /udl/ecpedr/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: EcpedrUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-ecpedr
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EcpedrService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EcpedrService.WithRawResponse =
            EcpedrServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EcpedrCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<EcpedrListResponse>> =
            jsonHandler<List<EcpedrListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: EcpedrListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EcpedrListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr")
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
                        EcpedrListPage.builder()
                            .service(EcpedrServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EcpedrCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr", "count")
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
            params: EcpedrCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<EcpedrQueryhelpResponse> =
            jsonHandler<EcpedrQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EcpedrQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EcpedrQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr", "queryhelp")
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

        private val tupleHandler: Handler<List<EcpedrTupleResponse>> =
            jsonHandler<List<EcpedrTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EcpedrTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<EcpedrTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpedr", "tuple")
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
            params: EcpedrUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-ecpedr")
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
