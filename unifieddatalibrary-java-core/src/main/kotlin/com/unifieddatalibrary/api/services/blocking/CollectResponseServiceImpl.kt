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
import com.unifieddatalibrary.api.models.CollectResponseFull
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseAbridged
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCountParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListPage
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseRetrieveParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.collectresponses.HistoryService
import com.unifieddatalibrary.api.services.blocking.collectresponses.HistoryServiceImpl
import com.unifieddatalibrary.api.services.blocking.collectresponses.TupleService
import com.unifieddatalibrary.api.services.blocking.collectresponses.TupleServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CollectResponseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectResponseService {

    private val withRawResponse: CollectResponseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    private val tuple: TupleService by lazy { TupleServiceImpl(clientOptions) }

    override fun withRawResponse(): CollectResponseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseService =
        CollectResponseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun tuple(): TupleService = tuple

    override fun create(params: CollectResponseCreateParams, requestOptions: RequestOptions) {
        // post /udl/collectresponse
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: CollectResponseRetrieveParams,
        requestOptions: RequestOptions,
    ): CollectResponseFull =
        // get /udl/collectresponse/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CollectResponseListParams,
        requestOptions: RequestOptions,
    ): CollectResponseListPage =
        // get /udl/collectresponse
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: CollectResponseCountParams, requestOptions: RequestOptions): String =
        // get /udl/collectresponse/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: CollectResponseCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/collectresponse/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: CollectResponseQueryHelpParams,
        requestOptions: RequestOptions,
    ): CollectResponseQueryHelpResponse =
        // get /udl/collectresponse/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: CollectResponseUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-collectresponse
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectResponseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tuple: TupleService.WithRawResponse by lazy {
            TupleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectResponseService.WithRawResponse =
            CollectResponseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        override fun tuple(): TupleService.WithRawResponse = tuple

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: CollectResponseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<CollectResponseFull> =
            jsonHandler<CollectResponseFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CollectResponseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectResponseFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse", params._pathParam(0))
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

        private val listHandler: Handler<List<CollectResponseAbridged>> =
            jsonHandler<List<CollectResponseAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: CollectResponseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectResponseListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse")
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
                        CollectResponseListPage.builder()
                            .service(CollectResponseServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: CollectResponseCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse", "count")
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
            params: CollectResponseCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<CollectResponseQueryHelpResponse> =
            jsonHandler<CollectResponseQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: CollectResponseQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectResponseQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "collectresponse", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: CollectResponseUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-collectresponse")
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
