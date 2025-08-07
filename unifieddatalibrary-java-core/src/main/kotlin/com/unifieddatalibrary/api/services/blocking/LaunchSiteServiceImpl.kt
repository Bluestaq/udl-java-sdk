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
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteDeleteParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListPage
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchSiteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LaunchSiteService {

    private val withRawResponse: LaunchSiteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LaunchSiteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteService =
        LaunchSiteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaunchSiteCreateParams, requestOptions: RequestOptions) {
        // post /udl/launchsite
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LaunchSiteUpdateParams, requestOptions: RequestOptions) {
        // put /udl/launchsite/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: LaunchSiteListParams,
        requestOptions: RequestOptions,
    ): LaunchSiteListPage =
        // get /udl/launchsite
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LaunchSiteDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/launchsite/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: LaunchSiteCountParams, requestOptions: RequestOptions): String =
        // get /udl/launchsite/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: LaunchSiteGetParams,
        requestOptions: RequestOptions,
    ): LaunchSiteGetResponse =
        // get /udl/launchsite/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: LaunchSiteQueryhelpParams,
        requestOptions: RequestOptions,
    ): LaunchSiteQueryhelpResponse =
        // get /udl/launchsite/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: LaunchSiteTupleParams,
        requestOptions: RequestOptions,
    ): List<LaunchSiteTupleResponse> =
        // get /udl/launchsite/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaunchSiteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchSiteService.WithRawResponse =
            LaunchSiteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaunchSiteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite")
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
            params: LaunchSiteUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<LaunchSiteListResponse>> =
            jsonHandler<List<LaunchSiteListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaunchSiteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite")
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
                        LaunchSiteListPage.builder()
                            .service(LaunchSiteServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LaunchSiteDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", params._pathParam(0))
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
            params: LaunchSiteCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<LaunchSiteGetResponse> =
            jsonHandler<LaunchSiteGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaunchSiteGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchSiteQueryhelpResponse> =
            jsonHandler<LaunchSiteQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaunchSiteQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchSiteTupleResponse>> =
            jsonHandler<List<LaunchSiteTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaunchSiteTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LaunchSiteTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsite", "tuple")
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
