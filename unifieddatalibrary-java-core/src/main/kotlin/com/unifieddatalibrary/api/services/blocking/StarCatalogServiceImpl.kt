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
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCountParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateBulkParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogDeleteParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListPage
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogListResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogQueryhelpResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleResponse
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUpdateParams
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryService
import com.unifieddatalibrary.api.services.blocking.starcatalog.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StarCatalogServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StarCatalogService {

    private val withRawResponse: StarCatalogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): StarCatalogService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StarCatalogService =
        StarCatalogServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: StarCatalogCreateParams, requestOptions: RequestOptions) {
        // post /udl/starcatalog
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: StarCatalogUpdateParams, requestOptions: RequestOptions) {
        // put /udl/starcatalog/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: StarCatalogListParams,
        requestOptions: RequestOptions,
    ): StarCatalogListPage =
        // get /udl/starcatalog
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: StarCatalogDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/starcatalog/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: StarCatalogCountParams, requestOptions: RequestOptions): String =
        // get /udl/starcatalog/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: StarCatalogCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/starcatalog/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: StarCatalogGetParams,
        requestOptions: RequestOptions,
    ): StarCatalogGetResponse =
        // get /udl/starcatalog/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: StarCatalogQueryhelpParams,
        requestOptions: RequestOptions,
    ): StarCatalogQueryhelpResponse =
        // get /udl/starcatalog/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: StarCatalogTupleParams,
        requestOptions: RequestOptions,
    ): List<StarCatalogTupleResponse> =
        // get /udl/starcatalog/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: StarCatalogUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-starcatalog
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StarCatalogService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StarCatalogService.WithRawResponse =
            StarCatalogServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: StarCatalogCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog")
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
            params: StarCatalogUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<StarCatalogListResponse>> =
            jsonHandler<List<StarCatalogListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: StarCatalogListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StarCatalogListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog")
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
                        StarCatalogListPage.builder()
                            .service(StarCatalogServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: StarCatalogDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", params._pathParam(0))
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
            params: StarCatalogCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", "count")
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
            params: StarCatalogCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<StarCatalogGetResponse> =
            jsonHandler<StarCatalogGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: StarCatalogGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StarCatalogGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", params._pathParam(0))
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

        private val queryhelpHandler: Handler<StarCatalogQueryhelpResponse> =
            jsonHandler<StarCatalogQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: StarCatalogQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StarCatalogQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", "queryhelp")
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

        private val tupleHandler: Handler<List<StarCatalogTupleResponse>> =
            jsonHandler<List<StarCatalogTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: StarCatalogTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<StarCatalogTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "starcatalog", "tuple")
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
            params: StarCatalogUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-starcatalog")
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
