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
import com.unifieddatalibrary.api.models.mti.MtiCountParams
import com.unifieddatalibrary.api.models.mti.MtiCreateBulkParams
import com.unifieddatalibrary.api.models.mti.MtiListPage
import com.unifieddatalibrary.api.models.mti.MtiListParams
import com.unifieddatalibrary.api.models.mti.MtiListResponse
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpParams
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpResponse
import com.unifieddatalibrary.api.models.mti.MtiTupleParams
import com.unifieddatalibrary.api.models.mti.MtiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.mti.history.MtiFull
import com.unifieddatalibrary.api.services.blocking.mti.HistoryService
import com.unifieddatalibrary.api.services.blocking.mti.HistoryServiceImpl
import java.util.function.Consumer

class MtiServiceImpl internal constructor(private val clientOptions: ClientOptions) : MtiService {

    private val withRawResponse: MtiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): MtiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MtiService =
        MtiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: MtiListParams, requestOptions: RequestOptions): MtiListPage =
        // get /udl/mti
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: MtiCountParams, requestOptions: RequestOptions): String =
        // get /udl/mti/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: MtiCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/mti/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: MtiQueryhelpParams,
        requestOptions: RequestOptions,
    ): MtiQueryhelpResponse =
        // get /udl/mti/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: MtiTupleParams, requestOptions: RequestOptions): List<MtiFull> =
        // get /udl/mti/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: MtiUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-mti
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MtiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MtiService.WithRawResponse =
            MtiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<MtiListResponse>> =
            jsonHandler<List<MtiListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: MtiListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MtiListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "mti")
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
                        MtiListPage.builder()
                            .service(MtiServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: MtiCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "mti", "count")
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
            params: MtiCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "mti", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<MtiQueryhelpResponse> =
            jsonHandler<MtiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: MtiQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MtiQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "mti", "queryhelp")
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

        private val tupleHandler: Handler<List<MtiFull>> =
            jsonHandler<List<MtiFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: MtiTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<MtiFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "mti", "tuple")
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
            params: MtiUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-mti")
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
