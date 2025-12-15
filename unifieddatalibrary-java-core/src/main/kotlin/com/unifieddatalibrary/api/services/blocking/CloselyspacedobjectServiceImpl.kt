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
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCountParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateBulkParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListPage
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectsAbridged
import com.unifieddatalibrary.api.services.blocking.closelyspacedobjects.HistoryService
import com.unifieddatalibrary.api.services.blocking.closelyspacedobjects.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CloselyspacedobjectServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CloselyspacedobjectService {

    private val withRawResponse: CloselyspacedobjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): CloselyspacedobjectService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CloselyspacedobjectService =
        CloselyspacedobjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: CloselyspacedobjectCreateParams, requestOptions: RequestOptions) {
        // post /udl/closelyspacedobjects
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: CloselyspacedobjectRetrieveParams,
        requestOptions: RequestOptions,
    ): CloselyspacedobjectRetrieveResponse =
        // get /udl/closelyspacedobjects/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CloselyspacedobjectListParams,
        requestOptions: RequestOptions,
    ): CloselyspacedobjectListPage =
        // get /udl/closelyspacedobjects
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: CloselyspacedobjectCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/closelyspacedobjects/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: CloselyspacedobjectCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/closelyspacedobjects/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: CloselyspacedobjectQueryHelpParams,
        requestOptions: RequestOptions,
    ): CloselyspacedobjectQueryHelpResponse =
        // get /udl/closelyspacedobjects/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: CloselyspacedobjectTupleParams,
        requestOptions: RequestOptions,
    ): List<CloselyspacedobjectTupleResponse> =
        // get /udl/closelyspacedobjects/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: CloselyspacedobjectUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-closelyspacedobjects
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CloselyspacedobjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CloselyspacedobjectService.WithRawResponse =
            CloselyspacedobjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: CloselyspacedobjectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<CloselyspacedobjectRetrieveResponse> =
            jsonHandler<CloselyspacedobjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CloselyspacedobjectRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloselyspacedobjectRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", params._pathParam(0))
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

        private val listHandler: Handler<List<CloselyspacedobjectsAbridged>> =
            jsonHandler<List<CloselyspacedobjectsAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: CloselyspacedobjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloselyspacedobjectListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects")
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
                        CloselyspacedobjectListPage.builder()
                            .service(CloselyspacedobjectServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: CloselyspacedobjectCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "count")
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
            params: CloselyspacedobjectCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<CloselyspacedobjectQueryHelpResponse> =
            jsonHandler<CloselyspacedobjectQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: CloselyspacedobjectQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloselyspacedobjectQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "queryhelp")
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

        private val tupleHandler: Handler<List<CloselyspacedobjectTupleResponse>> =
            jsonHandler<List<CloselyspacedobjectTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: CloselyspacedobjectTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CloselyspacedobjectTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "tuple")
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
            params: CloselyspacedobjectUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-closelyspacedobjects")
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
