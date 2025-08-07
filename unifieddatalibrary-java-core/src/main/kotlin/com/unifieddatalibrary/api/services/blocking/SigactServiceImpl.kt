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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.sigact.SigactCountParams
import com.unifieddatalibrary.api.models.sigact.SigactCreateBulkParams
import com.unifieddatalibrary.api.models.sigact.SigactListPage
import com.unifieddatalibrary.api.models.sigact.SigactListParams
import com.unifieddatalibrary.api.models.sigact.SigactListResponse
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpParams
import com.unifieddatalibrary.api.models.sigact.SigactQueryhelpResponse
import com.unifieddatalibrary.api.models.sigact.SigactTupleParams
import com.unifieddatalibrary.api.models.sigact.SigactTupleResponse
import com.unifieddatalibrary.api.models.sigact.SigactUploadZipParams
import com.unifieddatalibrary.api.services.blocking.sigact.HistoryService
import com.unifieddatalibrary.api.services.blocking.sigact.HistoryServiceImpl
import java.util.function.Consumer

class SigactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SigactService {

    private val withRawResponse: SigactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SigactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SigactService =
        SigactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: SigactListParams, requestOptions: RequestOptions): SigactListPage =
        // get /udl/sigact
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SigactCountParams, requestOptions: RequestOptions): String =
        // get /udl/sigact/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: SigactCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/sigact/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: SigactQueryhelpParams,
        requestOptions: RequestOptions,
    ): SigactQueryhelpResponse =
        // get /udl/sigact/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SigactTupleParams,
        requestOptions: RequestOptions,
    ): List<SigactTupleResponse> =
        // get /udl/sigact/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun uploadZip(params: SigactUploadZipParams, requestOptions: RequestOptions) {
        // post /filedrop/udl-sigact-text
        withRawResponse().uploadZip(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SigactService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SigactService.WithRawResponse =
            SigactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<SigactListResponse>> =
            jsonHandler<List<SigactListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SigactListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SigactListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sigact")
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
                        SigactListPage.builder()
                            .service(SigactServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SigactCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sigact", "count")
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
            params: SigactCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sigact", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<SigactQueryhelpResponse> =
            jsonHandler<SigactQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SigactQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SigactQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sigact", "queryhelp")
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

        private val tupleHandler: Handler<List<SigactTupleResponse>> =
            jsonHandler<List<SigactTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SigactTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SigactTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sigact", "tuple")
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

        private val uploadZipHandler: Handler<Void?> = emptyHandler()

        override fun uploadZip(
            params: SigactUploadZipParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-sigact-text")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadZipHandler.handle(it) }
            }
        }
    }
}
