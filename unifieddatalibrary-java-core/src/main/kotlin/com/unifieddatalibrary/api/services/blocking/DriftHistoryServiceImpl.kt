// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.DriftHistoryAbridged
import com.unifieddatalibrary.api.models.DriftHistoryFull
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryCountParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListPage
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpResponse
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryRetrieveParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryTupleParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DriftHistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DriftHistoryService {

    private val withRawResponse: DriftHistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DriftHistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriftHistoryService =
        DriftHistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DriftHistoryRetrieveParams,
        requestOptions: RequestOptions,
    ): DriftHistoryFull =
        // get /udl/drifthistory/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DriftHistoryListParams,
        requestOptions: RequestOptions,
    ): DriftHistoryListPage =
        // get /udl/drifthistory
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: DriftHistoryCountParams, requestOptions: RequestOptions): String =
        // get /udl/drifthistory/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: DriftHistoryQueryhelpParams,
        requestOptions: RequestOptions,
    ): DriftHistoryQueryhelpResponse =
        // get /udl/drifthistory/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: DriftHistoryTupleParams,
        requestOptions: RequestOptions,
    ): List<DriftHistoryFull> =
        // get /udl/drifthistory/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DriftHistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DriftHistoryService.WithRawResponse =
            DriftHistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DriftHistoryFull> =
            jsonHandler<DriftHistoryFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DriftHistoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DriftHistoryFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "drifthistory", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<DriftHistoryAbridged>> =
            jsonHandler<List<DriftHistoryAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: DriftHistoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DriftHistoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "drifthistory")
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
                        DriftHistoryListPage.builder()
                            .service(DriftHistoryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: DriftHistoryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "drifthistory", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<DriftHistoryQueryhelpResponse> =
            jsonHandler<DriftHistoryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: DriftHistoryQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DriftHistoryQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "drifthistory", "queryhelp")
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

        private val tupleHandler: Handler<List<DriftHistoryFull>> =
            jsonHandler<List<DriftHistoryFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: DriftHistoryTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DriftHistoryFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "drifthistory", "tuple")
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
