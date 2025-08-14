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
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailDeleteParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListPage
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailListResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleResponse
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfEmitterDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RfEmitterDetailService {

    private val withRawResponse: RfEmitterDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RfEmitterDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfEmitterDetailService =
        RfEmitterDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RfEmitterDetailCreateParams, requestOptions: RequestOptions) {
        // post /udl/rfemitterdetails
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: RfEmitterDetailUpdateParams, requestOptions: RequestOptions) {
        // put /udl/rfemitterdetails/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: RfEmitterDetailListParams,
        requestOptions: RequestOptions,
    ): RfEmitterDetailListPage =
        // get /udl/rfemitterdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RfEmitterDetailDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/rfemitterdetails/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: RfEmitterDetailCountParams, requestOptions: RequestOptions): String =
        // get /udl/rfemitterdetails/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: RfEmitterDetailGetParams,
        requestOptions: RequestOptions,
    ): RfEmitterDetailGetResponse =
        // get /udl/rfemitterdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: RfEmitterDetailQueryhelpParams,
        requestOptions: RequestOptions,
    ): RfEmitterDetailQueryhelpResponse =
        // get /udl/rfemitterdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: RfEmitterDetailTupleParams,
        requestOptions: RequestOptions,
    ): List<RfEmitterDetailTupleResponse> =
        // get /udl/rfemitterdetails/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RfEmitterDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RfEmitterDetailService.WithRawResponse =
            RfEmitterDetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: RfEmitterDetailCreateParams,
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
            params: RfEmitterDetailUpdateParams,
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

        private val listHandler: Handler<List<RfEmitterDetailListResponse>> =
            jsonHandler<List<RfEmitterDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: RfEmitterDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RfEmitterDetailListPage> {
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
                        RfEmitterDetailListPage.builder()
                            .service(RfEmitterDetailServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RfEmitterDetailDeleteParams,
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
            params: RfEmitterDetailCountParams,
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

        private val getHandler: Handler<RfEmitterDetailGetResponse> =
            jsonHandler<RfEmitterDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: RfEmitterDetailGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RfEmitterDetailGetResponse> {
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

        private val queryhelpHandler: Handler<RfEmitterDetailQueryhelpResponse> =
            jsonHandler<RfEmitterDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: RfEmitterDetailQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RfEmitterDetailQueryhelpResponse> {
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

        private val tupleHandler: Handler<List<RfEmitterDetailTupleResponse>> =
            jsonHandler<List<RfEmitterDetailTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: RfEmitterDetailTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RfEmitterDetailTupleResponse>> {
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
