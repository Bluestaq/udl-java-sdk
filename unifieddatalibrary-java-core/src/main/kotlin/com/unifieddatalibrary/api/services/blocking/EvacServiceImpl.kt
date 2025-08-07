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
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.models.evac.EvacAbridged
import com.unifieddatalibrary.api.models.evac.EvacCountParams
import com.unifieddatalibrary.api.models.evac.EvacCreateBulkParams
import com.unifieddatalibrary.api.models.evac.EvacCreateParams
import com.unifieddatalibrary.api.models.evac.EvacListPage
import com.unifieddatalibrary.api.models.evac.EvacListParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpResponse
import com.unifieddatalibrary.api.models.evac.EvacRetrieveParams
import com.unifieddatalibrary.api.models.evac.EvacUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.evac.HistoryService
import com.unifieddatalibrary.api.services.blocking.evac.HistoryServiceImpl
import com.unifieddatalibrary.api.services.blocking.evac.TupleService
import com.unifieddatalibrary.api.services.blocking.evac.TupleServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EvacServiceImpl internal constructor(private val clientOptions: ClientOptions) : EvacService {

    private val withRawResponse: EvacService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    private val tuple: TupleService by lazy { TupleServiceImpl(clientOptions) }

    override fun withRawResponse(): EvacService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvacService =
        EvacServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun tuple(): TupleService = tuple

    override fun create(params: EvacCreateParams, requestOptions: RequestOptions) {
        // post /udl/evac
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EvacRetrieveParams, requestOptions: RequestOptions): EvacFull =
        // get /udl/evac/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EvacListParams, requestOptions: RequestOptions): EvacListPage =
        // get /udl/evac
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EvacCountParams, requestOptions: RequestOptions): String =
        // get /udl/evac/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EvacCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/evac/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: EvacQueryHelpParams,
        requestOptions: RequestOptions,
    ): EvacQueryHelpResponse =
        // get /udl/evac/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: EvacUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-evac
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvacService.WithRawResponse {

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
        ): EvacService.WithRawResponse =
            EvacServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        override fun tuple(): TupleService.WithRawResponse = tuple

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EvacCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<EvacFull> =
            jsonHandler<EvacFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EvacRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvacFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac", params._pathParam(0))
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

        private val listHandler: Handler<List<EvacAbridged>> =
            jsonHandler<List<EvacAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EvacListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvacListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac")
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
                        EvacListPage.builder()
                            .service(EvacServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EvacCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac", "count")
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
            params: EvacCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<EvacQueryHelpResponse> =
            jsonHandler<EvacQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: EvacQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvacQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "evac", "queryhelp")
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
            params: EvacUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-evac")
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
