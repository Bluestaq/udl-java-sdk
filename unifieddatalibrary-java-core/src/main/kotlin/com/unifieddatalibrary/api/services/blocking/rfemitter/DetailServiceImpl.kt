// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.rfemitter

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
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCountParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCreateParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListPage
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailListResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitter.details.DetailUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DetailService {

    private val withRawResponse: DetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailService =
        DetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DetailCreateParams, requestOptions: RequestOptions) {
        // post /udl/rfemitterdetails
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: DetailUpdateParams, requestOptions: RequestOptions) {
        // put /udl/rfemitterdetails/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: DetailListParams, requestOptions: RequestOptions): DetailListPage =
        // get /udl/rfemitterdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DetailDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/rfemitterdetails/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: DetailCountParams, requestOptions: RequestOptions): String =
        // get /udl/rfemitterdetails/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: DetailGetParams, requestOptions: RequestOptions): DetailGetResponse =
        // get /udl/rfemitterdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: DetailQueryhelpParams,
        requestOptions: RequestOptions,
    ): DetailQueryhelpResponse =
        // get /udl/rfemitterdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: DetailTupleParams,
        requestOptions: RequestOptions,
    ): List<DetailTupleResponse> =
        // get /udl/rfemitterdetails/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailService.WithRawResponse =
            DetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: DetailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails")
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
            params: DetailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<DetailListResponse>> =
            jsonHandler<List<DetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: DetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails")
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
                        DetailListPage.builder()
                            .service(DetailServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DetailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", params._pathParam(0))
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
            params: DetailCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<DetailGetResponse> =
            jsonHandler<DetailGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DetailGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", params._pathParam(0))
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

        private val queryhelpHandler: Handler<DetailQueryhelpResponse> =
            jsonHandler<DetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: DetailQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", "queryhelp")
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

        private val tupleHandler: Handler<List<DetailTupleResponse>> =
            jsonHandler<List<DetailTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: DetailTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DetailTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterdetails", "tuple")
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
