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
import com.unifieddatalibrary.api.models.surface.SurfaceCountParams
import com.unifieddatalibrary.api.models.surface.SurfaceCreateParams
import com.unifieddatalibrary.api.models.surface.SurfaceDeleteParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetResponse
import com.unifieddatalibrary.api.models.surface.SurfaceListPage
import com.unifieddatalibrary.api.models.surface.SurfaceListParams
import com.unifieddatalibrary.api.models.surface.SurfaceListResponse
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpParams
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpResponse
import com.unifieddatalibrary.api.models.surface.SurfaceTupleParams
import com.unifieddatalibrary.api.models.surface.SurfaceTupleResponse
import com.unifieddatalibrary.api.models.surface.SurfaceUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SurfaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SurfaceService {

    private val withRawResponse: SurfaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SurfaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceService =
        SurfaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SurfaceCreateParams, requestOptions: RequestOptions) {
        // post /udl/surface
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SurfaceUpdateParams, requestOptions: RequestOptions) {
        // put /udl/surface/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SurfaceListParams, requestOptions: RequestOptions): SurfaceListPage =
        // get /udl/surface
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SurfaceDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/surface/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SurfaceCountParams, requestOptions: RequestOptions): String =
        // get /udl/surface/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SurfaceGetParams, requestOptions: RequestOptions): SurfaceGetResponse =
        // get /udl/surface/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SurfaceQueryhelpParams,
        requestOptions: RequestOptions,
    ): SurfaceQueryhelpResponse =
        // get /udl/surface/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SurfaceTupleParams,
        requestOptions: RequestOptions,
    ): List<SurfaceTupleResponse> =
        // get /udl/surface/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SurfaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SurfaceService.WithRawResponse =
            SurfaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SurfaceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface")
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
            params: SurfaceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SurfaceListResponse>> =
            jsonHandler<List<SurfaceListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SurfaceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SurfaceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface")
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
                        SurfaceListPage.builder()
                            .service(SurfaceServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SurfaceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", params._pathParam(0))
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
            params: SurfaceCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SurfaceGetResponse> =
            jsonHandler<SurfaceGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SurfaceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SurfaceGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SurfaceQueryhelpResponse> =
            jsonHandler<SurfaceQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SurfaceQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SurfaceQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", "queryhelp")
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

        private val tupleHandler: Handler<List<SurfaceTupleResponse>> =
            jsonHandler<List<SurfaceTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SurfaceTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SurfaceTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "surface", "tuple")
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
