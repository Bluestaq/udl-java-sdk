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
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCountParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCreateParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusDeleteParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListPage
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.sitestatus.HistoryService
import com.unifieddatalibrary.api.services.blocking.sitestatus.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteStatusServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SiteStatusService {

    private val withRawResponse: SiteStatusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SiteStatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteStatusService =
        SiteStatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SiteStatusCreateParams, requestOptions: RequestOptions) {
        // post /udl/sitestatus
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SiteStatusUpdateParams, requestOptions: RequestOptions) {
        // put /udl/sitestatus/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SiteStatusListParams,
        requestOptions: RequestOptions,
    ): SiteStatusListPage =
        // get /udl/sitestatus
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SiteStatusDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/sitestatus/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SiteStatusCountParams, requestOptions: RequestOptions): String =
        // get /udl/sitestatus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SiteStatusGetParams,
        requestOptions: RequestOptions,
    ): SiteStatusGetResponse =
        // get /udl/sitestatus/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SiteStatusQueryhelpParams,
        requestOptions: RequestOptions,
    ): SiteStatusQueryhelpResponse =
        // get /udl/sitestatus/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SiteStatusTupleParams,
        requestOptions: RequestOptions,
    ): List<SiteStatusTupleResponse> =
        // get /udl/sitestatus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiteStatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteStatusService.WithRawResponse =
            SiteStatusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SiteStatusCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: SiteStatusUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SiteStatusListResponse>> =
            jsonHandler<List<SiteStatusListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SiteStatusListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteStatusListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus")
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
                        SiteStatusListPage.builder()
                            .service(SiteStatusServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SiteStatusDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SiteStatusCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SiteStatusGetResponse> =
            jsonHandler<SiteStatusGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SiteStatusGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteStatusGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SiteStatusQueryhelpResponse> =
            jsonHandler<SiteStatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SiteStatusQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteStatusQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", "queryhelp")
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

        private val tupleHandler: Handler<List<SiteStatusTupleResponse>> =
            jsonHandler<List<SiteStatusTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SiteStatusTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SiteStatusTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sitestatus", "tuple")
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
