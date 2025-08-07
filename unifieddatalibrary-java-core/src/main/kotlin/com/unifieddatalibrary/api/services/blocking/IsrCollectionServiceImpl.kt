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
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCountParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCreateBulkParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListPage
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleResponse
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.isrcollections.HistoryService
import com.unifieddatalibrary.api.services.blocking.isrcollections.HistoryServiceImpl
import java.util.function.Consumer

class IsrCollectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IsrCollectionService {

    private val withRawResponse: IsrCollectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): IsrCollectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsrCollectionService =
        IsrCollectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(
        params: IsrCollectionListParams,
        requestOptions: RequestOptions,
    ): IsrCollectionListPage =
        // get /udl/isrcollection
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: IsrCollectionCountParams, requestOptions: RequestOptions): String =
        // get /udl/isrcollection/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: IsrCollectionCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/isrcollection/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: IsrCollectionQueryhelpParams,
        requestOptions: RequestOptions,
    ): IsrCollectionQueryhelpResponse =
        // get /udl/isrcollection/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: IsrCollectionTupleParams,
        requestOptions: RequestOptions,
    ): List<IsrCollectionTupleResponse> =
        // get /udl/isrcollection/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: IsrCollectionUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-isrcollection
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IsrCollectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IsrCollectionService.WithRawResponse =
            IsrCollectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<IsrCollectionListResponse>> =
            jsonHandler<List<IsrCollectionListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: IsrCollectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IsrCollectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "isrcollection")
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
                        IsrCollectionListPage.builder()
                            .service(IsrCollectionServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: IsrCollectionCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "isrcollection", "count")
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
            params: IsrCollectionCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "isrcollection", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<IsrCollectionQueryhelpResponse> =
            jsonHandler<IsrCollectionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: IsrCollectionQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IsrCollectionQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "isrcollection", "queryhelp")
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

        private val tupleHandler: Handler<List<IsrCollectionTupleResponse>> =
            jsonHandler<List<IsrCollectionTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: IsrCollectionTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IsrCollectionTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "isrcollection", "tuple")
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
            params: IsrCollectionUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-isrcollection")
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
