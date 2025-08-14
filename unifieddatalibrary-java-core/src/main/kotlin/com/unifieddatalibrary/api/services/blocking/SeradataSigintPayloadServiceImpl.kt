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
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListPage
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadListResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataSigintPayloadServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SeradataSigintPayloadService {

    private val withRawResponse: SeradataSigintPayloadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SeradataSigintPayloadService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SeradataSigintPayloadService =
        SeradataSigintPayloadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeradataSigintPayloadCreateParams, requestOptions: RequestOptions) {
        // post /udl/seradatasigintpayload
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeradataSigintPayloadUpdateParams, requestOptions: RequestOptions) {
        // put /udl/seradatasigintpayload/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SeradataSigintPayloadListParams,
        requestOptions: RequestOptions,
    ): SeradataSigintPayloadListPage =
        // get /udl/seradatasigintpayload
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeradataSigintPayloadDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/seradatasigintpayload/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(
        params: SeradataSigintPayloadCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/seradatasigintpayload/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SeradataSigintPayloadGetParams,
        requestOptions: RequestOptions,
    ): SeradataSigintPayloadGetResponse =
        // get /udl/seradatasigintpayload/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SeradataSigintPayloadQueryhelpParams,
        requestOptions: RequestOptions,
    ): SeradataSigintPayloadQueryhelpResponse =
        // get /udl/seradatasigintpayload/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SeradataSigintPayloadTupleParams,
        requestOptions: RequestOptions,
    ): List<SeradataSigintPayloadTupleResponse> =
        // get /udl/seradatasigintpayload/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SeradataSigintPayloadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeradataSigintPayloadService.WithRawResponse =
            SeradataSigintPayloadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SeradataSigintPayloadCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload")
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
            params: SeradataSigintPayloadUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SeradataSigintPayloadListResponse>> =
            jsonHandler<List<SeradataSigintPayloadListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SeradataSigintPayloadListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataSigintPayloadListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload")
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
                        SeradataSigintPayloadListPage.builder()
                            .service(SeradataSigintPayloadServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SeradataSigintPayloadDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
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
            params: SeradataSigintPayloadCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SeradataSigintPayloadGetResponse> =
            jsonHandler<SeradataSigintPayloadGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SeradataSigintPayloadGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataSigintPayloadGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeradataSigintPayloadQueryhelpResponse> =
            jsonHandler<SeradataSigintPayloadQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SeradataSigintPayloadQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataSigintPayloadQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "queryhelp")
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

        private val tupleHandler: Handler<List<SeradataSigintPayloadTupleResponse>> =
            jsonHandler<List<SeradataSigintPayloadTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SeradataSigintPayloadTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SeradataSigintPayloadTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatasigintpayload", "tuple")
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
