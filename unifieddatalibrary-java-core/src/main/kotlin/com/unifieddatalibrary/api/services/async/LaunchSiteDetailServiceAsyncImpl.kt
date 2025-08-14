// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailCreateParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailDeleteParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListPageAsync
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchSiteDetailServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LaunchSiteDetailServiceAsync {

    private val withRawResponse: LaunchSiteDetailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LaunchSiteDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LaunchSiteDetailServiceAsync =
        LaunchSiteDetailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LaunchSiteDetailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/launchsitedetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: LaunchSiteDetailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/launchsitedetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: LaunchSiteDetailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchSiteDetailListPageAsync> =
        // get /udl/launchsitedetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LaunchSiteDetailDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/launchsitedetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun findBySource(
        params: LaunchSiteDetailFindBySourceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<LaunchSiteDetailFindBySourceResponse>> =
        // get /udl/launchsitedetails/findBySource
        withRawResponse().findBySource(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LaunchSiteDetailGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchSiteDetailGetResponse> =
        // get /udl/launchsitedetails/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaunchSiteDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchSiteDetailServiceAsync.WithRawResponse =
            LaunchSiteDetailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaunchSiteDetailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: LaunchSiteDetailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<List<LaunchSiteDetailListResponse>> =
            jsonHandler<List<LaunchSiteDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaunchSiteDetailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                LaunchSiteDetailListPageAsync.builder()
                                    .service(LaunchSiteDetailServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LaunchSiteDetailDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val findBySourceHandler: Handler<List<LaunchSiteDetailFindBySourceResponse>> =
            jsonHandler<List<LaunchSiteDetailFindBySourceResponse>>(clientOptions.jsonMapper)

        override fun findBySource(
            params: LaunchSiteDetailFindBySourceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", "findBySource")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { findBySourceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<LaunchSiteDetailGetResponse> =
            jsonHandler<LaunchSiteDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaunchSiteDetailGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchSiteDetailGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
