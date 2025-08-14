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
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCountParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListPage
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataRadarPayloadServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SeradataRadarPayloadService {

    private val withRawResponse: SeradataRadarPayloadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SeradataRadarPayloadService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SeradataRadarPayloadService =
        SeradataRadarPayloadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeradataRadarPayloadCreateParams, requestOptions: RequestOptions) {
        // post /udl/seradataradarpayload
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeradataRadarPayloadUpdateParams, requestOptions: RequestOptions) {
        // put /udl/seradataradarpayload/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SeradataRadarPayloadListParams,
        requestOptions: RequestOptions,
    ): SeradataRadarPayloadListPage =
        // get /udl/seradataradarpayload
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeradataRadarPayloadDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/seradataradarpayload/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(
        params: SeradataRadarPayloadCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/seradataradarpayload/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SeradataRadarPayloadGetParams,
        requestOptions: RequestOptions,
    ): SeradataRadarPayloadGetResponse =
        // get /udl/seradataradarpayload/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SeradataRadarPayloadQueryhelpParams,
        requestOptions: RequestOptions,
    ): SeradataRadarPayloadQueryhelpResponse =
        // get /udl/seradataradarpayload/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SeradataRadarPayloadTupleParams,
        requestOptions: RequestOptions,
    ): List<SeradataRadarPayloadTupleResponse> =
        // get /udl/seradataradarpayload/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SeradataRadarPayloadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeradataRadarPayloadService.WithRawResponse =
            SeradataRadarPayloadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SeradataRadarPayloadCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload")
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
            params: SeradataRadarPayloadUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SeradataRadarPayloadListResponse>> =
            jsonHandler<List<SeradataRadarPayloadListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SeradataRadarPayloadListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataRadarPayloadListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload")
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
                        SeradataRadarPayloadListPage.builder()
                            .service(SeradataRadarPayloadServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SeradataRadarPayloadDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", params._pathParam(0))
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
            params: SeradataRadarPayloadCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SeradataRadarPayloadGetResponse> =
            jsonHandler<SeradataRadarPayloadGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SeradataRadarPayloadGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataRadarPayloadGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeradataRadarPayloadQueryhelpResponse> =
            jsonHandler<SeradataRadarPayloadQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SeradataRadarPayloadQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeradataRadarPayloadQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", "queryhelp")
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

        private val tupleHandler: Handler<List<SeradataRadarPayloadTupleResponse>> =
            jsonHandler<List<SeradataRadarPayloadTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SeradataRadarPayloadTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SeradataRadarPayloadTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradataradarpayload", "tuple")
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
