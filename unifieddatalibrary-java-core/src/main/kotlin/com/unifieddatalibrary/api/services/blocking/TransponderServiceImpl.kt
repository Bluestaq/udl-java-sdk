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
import com.unifieddatalibrary.api.models.transponder.TransponderCountParams
import com.unifieddatalibrary.api.models.transponder.TransponderCreateParams
import com.unifieddatalibrary.api.models.transponder.TransponderDeleteParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetResponse
import com.unifieddatalibrary.api.models.transponder.TransponderListPage
import com.unifieddatalibrary.api.models.transponder.TransponderListParams
import com.unifieddatalibrary.api.models.transponder.TransponderListResponse
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpParams
import com.unifieddatalibrary.api.models.transponder.TransponderQueryhelpResponse
import com.unifieddatalibrary.api.models.transponder.TransponderTupleParams
import com.unifieddatalibrary.api.models.transponder.TransponderTupleResponse
import com.unifieddatalibrary.api.models.transponder.TransponderUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TransponderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransponderService {

    private val withRawResponse: TransponderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransponderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransponderService =
        TransponderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TransponderCreateParams, requestOptions: RequestOptions) {
        // post /udl/transponder
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: TransponderUpdateParams, requestOptions: RequestOptions) {
        // put /udl/transponder/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: TransponderListParams,
        requestOptions: RequestOptions,
    ): TransponderListPage =
        // get /udl/transponder
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TransponderDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/transponder/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: TransponderCountParams, requestOptions: RequestOptions): String =
        // get /udl/transponder/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: TransponderGetParams,
        requestOptions: RequestOptions,
    ): TransponderGetResponse =
        // get /udl/transponder/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: TransponderQueryhelpParams,
        requestOptions: RequestOptions,
    ): TransponderQueryhelpResponse =
        // get /udl/transponder/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: TransponderTupleParams,
        requestOptions: RequestOptions,
    ): List<TransponderTupleResponse> =
        // get /udl/transponder/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransponderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransponderService.WithRawResponse =
            TransponderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: TransponderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder")
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
            params: TransponderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<TransponderListResponse>> =
            jsonHandler<List<TransponderListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TransponderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransponderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder")
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
                        TransponderListPage.builder()
                            .service(TransponderServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TransponderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", params._pathParam(0))
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
            params: TransponderCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<TransponderGetResponse> =
            jsonHandler<TransponderGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: TransponderGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransponderGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", params._pathParam(0))
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

        private val queryhelpHandler: Handler<TransponderQueryhelpResponse> =
            jsonHandler<TransponderQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: TransponderQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransponderQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", "queryhelp")
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

        private val tupleHandler: Handler<List<TransponderTupleResponse>> =
            jsonHandler<List<TransponderTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: TransponderTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransponderTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "transponder", "tuple")
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
