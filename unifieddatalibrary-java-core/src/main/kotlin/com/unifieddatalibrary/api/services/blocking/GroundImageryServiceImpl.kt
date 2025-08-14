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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCountParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCreateParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetFileParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryHistoryAodrParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListPage
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleResponse
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryUploadZipParams
import com.unifieddatalibrary.api.services.blocking.groundimagery.HistoryService
import com.unifieddatalibrary.api.services.blocking.groundimagery.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GroundImageryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GroundImageryService {

    private val withRawResponse: GroundImageryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GroundImageryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroundImageryService =
        GroundImageryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: GroundImageryCreateParams, requestOptions: RequestOptions) {
        // post /udl/groundimagery
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: GroundImageryListParams,
        requestOptions: RequestOptions,
    ): GroundImageryListPage =
        // get /udl/groundimagery
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: GroundImageryCountParams, requestOptions: RequestOptions): String =
        // get /udl/groundimagery/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: GroundImageryGetParams,
        requestOptions: RequestOptions,
    ): GroundImageryGetResponse =
        // get /udl/groundimagery/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getFile(
        params: GroundImageryGetFileParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /udl/groundimagery/getFile/{id}
        withRawResponse().getFile(params, requestOptions)

    override fun historyAodr(
        params: GroundImageryHistoryAodrParams,
        requestOptions: RequestOptions,
    ) {
        // get /udl/groundimagery/history/aodr
        withRawResponse().historyAodr(params, requestOptions)
    }

    override fun queryhelp(
        params: GroundImageryQueryhelpParams,
        requestOptions: RequestOptions,
    ): GroundImageryQueryhelpResponse =
        // get /udl/groundimagery/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: GroundImageryTupleParams,
        requestOptions: RequestOptions,
    ): List<GroundImageryTupleResponse> =
        // get /udl/groundimagery/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun uploadZip(params: GroundImageryUploadZipParams, requestOptions: RequestOptions) {
        // post /filedrop/udl-groundimagery
        withRawResponse().uploadZip(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroundImageryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroundImageryService.WithRawResponse =
            GroundImageryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: GroundImageryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<GroundImageryListResponse>> =
            jsonHandler<List<GroundImageryListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: GroundImageryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroundImageryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery")
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
                        GroundImageryListPage.builder()
                            .service(GroundImageryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: GroundImageryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<GroundImageryGetResponse> =
            jsonHandler<GroundImageryGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: GroundImageryGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroundImageryGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", params._pathParam(0))
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

        override fun getFile(
            params: GroundImageryGetFileParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "getFile", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val historyAodrHandler: Handler<Void?> = emptyHandler()

        override fun historyAodr(
            params: GroundImageryHistoryAodrParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "history", "aodr")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { historyAodrHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<GroundImageryQueryhelpResponse> =
            jsonHandler<GroundImageryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: GroundImageryQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroundImageryQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "queryhelp")
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

        private val tupleHandler: Handler<List<GroundImageryTupleResponse>> =
            jsonHandler<List<GroundImageryTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: GroundImageryTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<GroundImageryTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "groundimagery", "tuple")
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
            params: GroundImageryUploadZipParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://imagery.unifieddatalibrary.com"
                    )
                    .addPathSegments("filedrop", "udl-groundimagery")
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
