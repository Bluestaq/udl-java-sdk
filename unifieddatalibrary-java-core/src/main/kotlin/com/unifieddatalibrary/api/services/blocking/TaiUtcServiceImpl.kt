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
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCountParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcDeleteParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcGetParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListPage
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcTupleParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcUpdateParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import com.unifieddatalibrary.api.services.blocking.taiutc.HistoryService
import com.unifieddatalibrary.api.services.blocking.taiutc.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaiUtcServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TaiUtcService {

    private val withRawResponse: TaiUtcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): TaiUtcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcService =
        TaiUtcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: TaiUtcCreateParams, requestOptions: RequestOptions) {
        // post /udl/taiutc
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: TaiUtcUpdateParams, requestOptions: RequestOptions) {
        // put /udl/taiutc/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: TaiUtcListParams, requestOptions: RequestOptions): TaiUtcListPage =
        // get /udl/taiutc
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TaiUtcDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/taiutc/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: TaiUtcCountParams, requestOptions: RequestOptions): String =
        // get /udl/taiutc/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: TaiUtcGetParams, requestOptions: RequestOptions): TaiutcFull =
        // get /udl/taiutc/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: TaiUtcQueryhelpParams,
        requestOptions: RequestOptions,
    ): TaiUtcQueryhelpResponse =
        // get /udl/taiutc/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: TaiUtcTupleParams,
        requestOptions: RequestOptions,
    ): List<TaiutcFull> =
        // get /udl/taiutc/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaiUtcService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaiUtcService.WithRawResponse =
            TaiUtcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: TaiUtcCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc")
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
            params: TaiUtcUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<TaiUtcListResponse>> =
            jsonHandler<List<TaiUtcListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TaiUtcListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaiUtcListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc")
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
                        TaiUtcListPage.builder()
                            .service(TaiUtcServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TaiUtcDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", params._pathParam(0))
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
            params: TaiUtcCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<TaiutcFull> =
            jsonHandler<TaiutcFull>(clientOptions.jsonMapper)

        override fun get(
            params: TaiUtcGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaiutcFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", params._pathParam(0))
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

        private val queryhelpHandler: Handler<TaiUtcQueryhelpResponse> =
            jsonHandler<TaiUtcQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: TaiUtcQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaiUtcQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "queryhelp")
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

        private val tupleHandler: Handler<List<TaiutcFull>> =
            jsonHandler<List<TaiutcFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: TaiUtcTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TaiutcFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "taiutc", "tuple")
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
