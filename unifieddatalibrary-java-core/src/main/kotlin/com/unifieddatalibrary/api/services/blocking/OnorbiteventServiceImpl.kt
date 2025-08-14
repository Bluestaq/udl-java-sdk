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
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCountParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCreateParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventDeleteParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListPage
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbiteventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OnorbiteventService {

    private val withRawResponse: OnorbiteventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OnorbiteventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbiteventService =
        OnorbiteventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OnorbiteventCreateParams, requestOptions: RequestOptions) {
        // post /udl/onorbitevent
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OnorbiteventUpdateParams, requestOptions: RequestOptions) {
        // put /udl/onorbitevent/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: OnorbiteventListParams,
        requestOptions: RequestOptions,
    ): OnorbiteventListPage =
        // get /udl/onorbitevent
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OnorbiteventDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/onorbitevent/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: OnorbiteventCountParams, requestOptions: RequestOptions): String =
        // get /udl/onorbitevent/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: OnorbiteventGetParams,
        requestOptions: RequestOptions,
    ): OnorbiteventGetResponse =
        // get /udl/onorbitevent/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: OnorbiteventQueryhelpParams,
        requestOptions: RequestOptions,
    ): OnorbiteventQueryhelpResponse =
        // get /udl/onorbitevent/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: OnorbiteventTupleParams,
        requestOptions: RequestOptions,
    ): List<OnorbiteventTupleResponse> =
        // get /udl/onorbitevent/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnorbiteventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbiteventService.WithRawResponse =
            OnorbiteventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: OnorbiteventCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent")
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
            params: OnorbiteventUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<OnorbiteventListResponse>> =
            jsonHandler<List<OnorbiteventListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OnorbiteventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbiteventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent")
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
                        OnorbiteventListPage.builder()
                            .service(OnorbiteventServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: OnorbiteventDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", params._pathParam(0))
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
            params: OnorbiteventCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<OnorbiteventGetResponse> =
            jsonHandler<OnorbiteventGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: OnorbiteventGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbiteventGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OnorbiteventQueryhelpResponse> =
            jsonHandler<OnorbiteventQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: OnorbiteventQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbiteventQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbiteventTupleResponse>> =
            jsonHandler<List<OnorbiteventTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: OnorbiteventTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OnorbiteventTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitevent", "tuple")
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
