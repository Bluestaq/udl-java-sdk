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
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCountParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCreateParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterDeleteParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListPage
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterListResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterQueryhelpResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleResponse
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaseremitterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LaseremitterService {

    private val withRawResponse: LaseremitterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LaseremitterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaseremitterService =
        LaseremitterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaseremitterCreateParams, requestOptions: RequestOptions) {
        // post /udl/laseremitter
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LaseremitterUpdateParams, requestOptions: RequestOptions) {
        // put /udl/laseremitter/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: LaseremitterListParams,
        requestOptions: RequestOptions,
    ): LaseremitterListPage =
        // get /udl/laseremitter
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LaseremitterDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/laseremitter/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: LaseremitterCountParams, requestOptions: RequestOptions): String =
        // get /udl/laseremitter/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: LaseremitterGetParams,
        requestOptions: RequestOptions,
    ): LaseremitterGetResponse =
        // get /udl/laseremitter/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: LaseremitterQueryhelpParams,
        requestOptions: RequestOptions,
    ): LaseremitterQueryhelpResponse =
        // get /udl/laseremitter/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: LaseremitterTupleParams,
        requestOptions: RequestOptions,
    ): List<LaseremitterTupleResponse> =
        // get /udl/laseremitter/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaseremitterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaseremitterService.WithRawResponse =
            LaseremitterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaseremitterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter")
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
            params: LaseremitterUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<LaseremitterListResponse>> =
            jsonHandler<List<LaseremitterListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaseremitterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaseremitterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter")
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
                        LaseremitterListPage.builder()
                            .service(LaseremitterServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LaseremitterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
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
            params: LaseremitterCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<LaseremitterGetResponse> =
            jsonHandler<LaseremitterGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaseremitterGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaseremitterGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaseremitterQueryhelpResponse> =
            jsonHandler<LaseremitterQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaseremitterQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaseremitterQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "queryhelp")
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

        private val tupleHandler: Handler<List<LaseremitterTupleResponse>> =
            jsonHandler<List<LaseremitterTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaseremitterTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LaseremitterTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laseremitter", "tuple")
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
