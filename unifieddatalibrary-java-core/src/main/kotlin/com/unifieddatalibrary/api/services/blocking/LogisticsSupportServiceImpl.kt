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
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCountParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateBulkParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListPage
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUpdateParams
import com.unifieddatalibrary.api.services.blocking.logisticssupport.HistoryService
import com.unifieddatalibrary.api.services.blocking.logisticssupport.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LogisticsSupportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LogisticsSupportService {

    private val withRawResponse: LogisticsSupportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): LogisticsSupportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogisticsSupportService =
        LogisticsSupportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: LogisticsSupportCreateParams, requestOptions: RequestOptions) {
        // post /udl/logisticssupport
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LogisticsSupportUpdateParams, requestOptions: RequestOptions) {
        // put /udl/logisticssupport/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: LogisticsSupportListParams,
        requestOptions: RequestOptions,
    ): LogisticsSupportListPage =
        // get /udl/logisticssupport
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: LogisticsSupportCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/logisticssupport/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: LogisticsSupportCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/logisticssupport/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: LogisticsSupportGetParams,
        requestOptions: RequestOptions,
    ): LogisticsSupportGetResponse =
        // get /udl/logisticssupport/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: LogisticsSupportQueryhelpParams,
        requestOptions: RequestOptions,
    ): LogisticsSupportQueryhelpResponse =
        // get /udl/logisticssupport/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: LogisticsSupportTupleParams,
        requestOptions: RequestOptions,
    ): List<LogisticsSupportTupleResponse> =
        // get /udl/logisticssupport/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: LogisticsSupportUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-logisticssupport
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogisticsSupportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogisticsSupportService.WithRawResponse =
            LogisticsSupportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LogisticsSupportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport")
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
            params: LogisticsSupportUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<LogisticsSupportListResponse>> =
            jsonHandler<List<LogisticsSupportListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LogisticsSupportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogisticsSupportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport")
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
                        LogisticsSupportListPage.builder()
                            .service(LogisticsSupportServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: LogisticsSupportCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", "count")
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
            params: LogisticsSupportCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<LogisticsSupportGetResponse> =
            jsonHandler<LogisticsSupportGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LogisticsSupportGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogisticsSupportGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LogisticsSupportQueryhelpResponse> =
            jsonHandler<LogisticsSupportQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LogisticsSupportQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogisticsSupportQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", "queryhelp")
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

        private val tupleHandler: Handler<List<LogisticsSupportTupleResponse>> =
            jsonHandler<List<LogisticsSupportTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LogisticsSupportTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LogisticsSupportTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "logisticssupport", "tuple")
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
            params: LogisticsSupportUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-logisticssupport")
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
