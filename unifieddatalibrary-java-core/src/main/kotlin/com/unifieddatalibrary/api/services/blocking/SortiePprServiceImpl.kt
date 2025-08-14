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
import com.unifieddatalibrary.api.models.SortiePprFull
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCountParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateBulkParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprDeleteParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprGetParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListPage
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListResponse
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprQueryhelpResponse
import com.unifieddatalibrary.api.models.sortieppr.SortiePprTupleParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUpdateParams
import com.unifieddatalibrary.api.services.blocking.sortieppr.HistoryService
import com.unifieddatalibrary.api.services.blocking.sortieppr.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SortiePprServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SortiePprService {

    private val withRawResponse: SortiePprService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SortiePprService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SortiePprService =
        SortiePprServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SortiePprCreateParams, requestOptions: RequestOptions) {
        // post /udl/sortieppr
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SortiePprUpdateParams, requestOptions: RequestOptions) {
        // put /udl/sortieppr/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SortiePprListParams,
        requestOptions: RequestOptions,
    ): SortiePprListPage =
        // get /udl/sortieppr
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SortiePprDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/sortieppr/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SortiePprCountParams, requestOptions: RequestOptions): String =
        // get /udl/sortieppr/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: SortiePprCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/sortieppr/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: SortiePprGetParams, requestOptions: RequestOptions): SortiePprFull =
        // get /udl/sortieppr/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SortiePprQueryhelpParams,
        requestOptions: RequestOptions,
    ): SortiePprQueryhelpResponse =
        // get /udl/sortieppr/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SortiePprTupleParams,
        requestOptions: RequestOptions,
    ): List<SortiePprFull> =
        // get /udl/sortieppr/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: SortiePprUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-sortieppr
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SortiePprService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SortiePprService.WithRawResponse =
            SortiePprServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SortiePprCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr")
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
            params: SortiePprUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SortiePprListResponse>> =
            jsonHandler<List<SortiePprListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SortiePprListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SortiePprListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr")
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
                        SortiePprListPage.builder()
                            .service(SortiePprServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SortiePprDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", params._pathParam(0))
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
            params: SortiePprCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", "count")
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
            params: SortiePprCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SortiePprFull> =
            jsonHandler<SortiePprFull>(clientOptions.jsonMapper)

        override fun get(
            params: SortiePprGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SortiePprFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SortiePprQueryhelpResponse> =
            jsonHandler<SortiePprQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SortiePprQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SortiePprQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", "queryhelp")
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

        private val tupleHandler: Handler<List<SortiePprFull>> =
            jsonHandler<List<SortiePprFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SortiePprTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SortiePprFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "sortieppr", "tuple")
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
            params: SortiePprUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-sortieppr")
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
