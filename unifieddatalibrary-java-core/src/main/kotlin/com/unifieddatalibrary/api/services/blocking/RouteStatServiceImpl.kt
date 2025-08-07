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
import com.unifieddatalibrary.api.models.routestats.RouteStatCountParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateBulkParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateParams
import com.unifieddatalibrary.api.models.routestats.RouteStatDeleteParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveParams
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleParams
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.routestats.RouteStatUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RouteStatServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RouteStatService {

    private val withRawResponse: RouteStatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RouteStatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteStatService =
        RouteStatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RouteStatCreateParams, requestOptions: RequestOptions) {
        // post /udl/routestats
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: RouteStatRetrieveParams,
        requestOptions: RequestOptions,
    ): RouteStatRetrieveResponse =
        // get /udl/routestats/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: RouteStatUpdateParams, requestOptions: RequestOptions) {
        // put /udl/routestats/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun delete(params: RouteStatDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/routestats/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: RouteStatCountParams, requestOptions: RequestOptions): String =
        // get /udl/routestats/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: RouteStatCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/routestats/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun query(
        params: RouteStatQueryParams,
        requestOptions: RequestOptions,
    ): List<RouteStatQueryResponse> =
        // get /udl/routestats
        withRawResponse().query(params, requestOptions).parse()

    override fun queryHelp(
        params: RouteStatQueryHelpParams,
        requestOptions: RequestOptions,
    ): RouteStatQueryHelpResponse =
        // get /udl/routestats/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: RouteStatTupleParams,
        requestOptions: RequestOptions,
    ): List<RouteStatTupleResponse> =
        // get /udl/routestats/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: RouteStatUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-routestats
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RouteStatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteStatService.WithRawResponse =
            RouteStatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: RouteStatCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<RouteStatRetrieveResponse> =
            jsonHandler<RouteStatRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RouteStatRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteStatRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: RouteStatUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RouteStatDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", params._pathParam(0))
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
            params: RouteStatCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", "count")
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
            params: RouteStatCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHandler: Handler<List<RouteStatQueryResponse>> =
            jsonHandler<List<RouteStatQueryResponse>>(clientOptions.jsonMapper)

        override fun query(
            params: RouteStatQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RouteStatQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val queryHelpHandler: Handler<RouteStatQueryHelpResponse> =
            jsonHandler<RouteStatQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: RouteStatQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteStatQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<RouteStatTupleResponse>> =
            jsonHandler<List<RouteStatTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: RouteStatTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RouteStatTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "routestats", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: RouteStatUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-routestats")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
