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
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCountParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCreateParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListPage
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusListResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleResponse
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkService
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkServiceImpl
import com.unifieddatalibrary.api.services.blocking.linkstatus.HistoryService
import com.unifieddatalibrary.api.services.blocking.linkstatus.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LinkStatusServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LinkStatusService {

    private val withRawResponse: LinkStatusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datalink: DatalinkService by lazy { DatalinkServiceImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): LinkStatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkStatusService =
        LinkStatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datalink(): DatalinkService = datalink

    override fun history(): HistoryService = history

    override fun create(params: LinkStatusCreateParams, requestOptions: RequestOptions) {
        // post /udl/linkstatus
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: LinkStatusListParams,
        requestOptions: RequestOptions,
    ): LinkStatusListPage =
        // get /udl/linkstatus
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: LinkStatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/linkstatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: LinkStatusGetParams,
        requestOptions: RequestOptions,
    ): LinkStatusGetResponse =
        // get /udl/linkstatus/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: LinkStatusQueryhelpParams,
        requestOptions: RequestOptions,
    ): LinkStatusQueryhelpResponse =
        // get /udl/linkstatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: LinkStatusTupleParams,
        requestOptions: RequestOptions,
    ): List<LinkStatusTupleResponse> =
        // get /udl/linkstatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LinkStatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val datalink: DatalinkService.WithRawResponse by lazy {
            DatalinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkStatusService.WithRawResponse =
            LinkStatusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datalink(): DatalinkService.WithRawResponse = datalink

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LinkStatusCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<LinkStatusListResponse>> =
            jsonHandler<List<LinkStatusListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LinkStatusListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkStatusListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus")
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
                        LinkStatusListPage.builder()
                            .service(LinkStatusServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: LinkStatusCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<LinkStatusGetResponse> =
            jsonHandler<LinkStatusGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LinkStatusGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkStatusGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LinkStatusQueryhelpResponse> =
            jsonHandler<LinkStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LinkStatusQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkStatusQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus", "queryhelp")
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

        private val tupleHandler: Handler<List<LinkStatusTupleResponse>> =
            jsonHandler<List<LinkStatusTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LinkStatusTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LinkStatusTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "linkstatus", "tuple")
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
