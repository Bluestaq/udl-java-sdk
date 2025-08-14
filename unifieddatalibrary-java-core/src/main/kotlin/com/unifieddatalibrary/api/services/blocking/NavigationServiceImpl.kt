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
import com.unifieddatalibrary.api.models.navigation.NavigationCountParams
import com.unifieddatalibrary.api.models.navigation.NavigationCreateParams
import com.unifieddatalibrary.api.models.navigation.NavigationDeleteParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetResponse
import com.unifieddatalibrary.api.models.navigation.NavigationListPage
import com.unifieddatalibrary.api.models.navigation.NavigationListParams
import com.unifieddatalibrary.api.models.navigation.NavigationListResponse
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpParams
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.navigation.NavigationTupleParams
import com.unifieddatalibrary.api.models.navigation.NavigationTupleResponse
import com.unifieddatalibrary.api.models.navigation.NavigationUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NavigationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NavigationService {

    private val withRawResponse: NavigationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NavigationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationService =
        NavigationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: NavigationCreateParams, requestOptions: RequestOptions) {
        // post /udl/navigation
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: NavigationUpdateParams, requestOptions: RequestOptions) {
        // put /udl/navigation/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: NavigationListParams,
        requestOptions: RequestOptions,
    ): NavigationListPage =
        // get /udl/navigation
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: NavigationDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/navigation/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: NavigationCountParams, requestOptions: RequestOptions): String =
        // get /udl/navigation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: NavigationGetParams,
        requestOptions: RequestOptions,
    ): NavigationGetResponse =
        // get /udl/navigation/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: NavigationQueryhelpParams,
        requestOptions: RequestOptions,
    ): NavigationQueryhelpResponse =
        // get /udl/navigation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: NavigationTupleParams,
        requestOptions: RequestOptions,
    ): List<NavigationTupleResponse> =
        // get /udl/navigation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NavigationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationService.WithRawResponse =
            NavigationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: NavigationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation")
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
            params: NavigationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<NavigationListResponse>> =
            jsonHandler<List<NavigationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: NavigationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation")
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
                        NavigationListPage.builder()
                            .service(NavigationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NavigationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", params._pathParam(0))
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
            params: NavigationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<NavigationGetResponse> =
            jsonHandler<NavigationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: NavigationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", params._pathParam(0))
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

        private val queryhelpHandler: Handler<NavigationQueryhelpResponse> =
            jsonHandler<NavigationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: NavigationQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", "queryhelp")
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

        private val tupleHandler: Handler<List<NavigationTupleResponse>> =
            jsonHandler<List<NavigationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: NavigationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<NavigationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "navigation", "tuple")
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
