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
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCountParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateBulkParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetDeleteParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListPage
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManifoldelsetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ManifoldelsetService {

    private val withRawResponse: ManifoldelsetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ManifoldelsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldelsetService =
        ManifoldelsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ManifoldelsetCreateParams, requestOptions: RequestOptions) {
        // post /udl/manifoldelset
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: ManifoldelsetUpdateParams, requestOptions: RequestOptions) {
        // put /udl/manifoldelset/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: ManifoldelsetListParams,
        requestOptions: RequestOptions,
    ): ManifoldelsetListPage =
        // get /udl/manifoldelset
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ManifoldelsetDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/manifoldelset/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: ManifoldelsetCountParams, requestOptions: RequestOptions): String =
        // get /udl/manifoldelset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: ManifoldelsetCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/manifoldelset/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: ManifoldelsetGetParams,
        requestOptions: RequestOptions,
    ): ManifoldelsetGetResponse =
        // get /udl/manifoldelset/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: ManifoldelsetQueryhelpParams,
        requestOptions: RequestOptions,
    ): ManifoldelsetQueryhelpResponse =
        // get /udl/manifoldelset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: ManifoldelsetTupleParams,
        requestOptions: RequestOptions,
    ): List<ManifoldelsetTupleResponse> =
        // get /udl/manifoldelset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManifoldelsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManifoldelsetService.WithRawResponse =
            ManifoldelsetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ManifoldelsetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset")
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
            params: ManifoldelsetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<ManifoldelsetListResponse>> =
            jsonHandler<List<ManifoldelsetListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ManifoldelsetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManifoldelsetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset")
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
                        ManifoldelsetListPage.builder()
                            .service(ManifoldelsetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ManifoldelsetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", params._pathParam(0))
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
            params: ManifoldelsetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", "count")
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
            params: ManifoldelsetCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ManifoldelsetGetResponse> =
            jsonHandler<ManifoldelsetGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ManifoldelsetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManifoldelsetGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ManifoldelsetQueryhelpResponse> =
            jsonHandler<ManifoldelsetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ManifoldelsetQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManifoldelsetQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", "queryhelp")
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

        private val tupleHandler: Handler<List<ManifoldelsetTupleResponse>> =
            jsonHandler<List<ManifoldelsetTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ManifoldelsetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ManifoldelsetTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "manifoldelset", "tuple")
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
