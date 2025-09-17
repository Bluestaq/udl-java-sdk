// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCountParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCreateParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestGetParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestGetResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListPageAsync
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestQueryhelpParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestQueryhelpResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestTupleParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestTupleResponse
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.laserdeconflictrequest.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.laserdeconflictrequest.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaserdeconflictrequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LaserdeconflictrequestServiceAsync {

    private val withRawResponse: LaserdeconflictrequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LaserdeconflictrequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LaserdeconflictrequestServiceAsync =
        LaserdeconflictrequestServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: LaserdeconflictrequestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/laserdeconflictrequest
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(
        params: LaserdeconflictrequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaserdeconflictrequestListPageAsync> =
        // get /udl/laserdeconflictrequest
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: LaserdeconflictrequestCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/laserdeconflictrequest/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LaserdeconflictrequestGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaserdeconflictrequestGetResponse> =
        // get /udl/laserdeconflictrequest/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: LaserdeconflictrequestQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaserdeconflictrequestQueryhelpResponse> =
        // get /udl/laserdeconflictrequest/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: LaserdeconflictrequestTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<LaserdeconflictrequestTupleResponse>> =
        // get /udl/laserdeconflictrequest/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(
        params: LaserdeconflictrequestUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-laserdeconflictrequest
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaserdeconflictrequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaserdeconflictrequestServiceAsync.WithRawResponse =
            LaserdeconflictrequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaserdeconflictrequestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest")
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

        private val listHandler: Handler<List<LaserdeconflictrequestListResponse>> =
            jsonHandler<List<LaserdeconflictrequestListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaserdeconflictrequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest")
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
                                LaserdeconflictrequestListPageAsync.builder()
                                    .service(LaserdeconflictrequestServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: LaserdeconflictrequestCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest", "count")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { countHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<LaserdeconflictrequestGetResponse> =
            jsonHandler<LaserdeconflictrequestGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaserdeconflictrequestGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaserdeconflictrequestQueryhelpResponse> =
            jsonHandler<LaserdeconflictrequestQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: LaserdeconflictrequestQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaserdeconflictrequestQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryhelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tupleHandler: Handler<List<LaserdeconflictrequestTupleResponse>> =
            jsonHandler<List<LaserdeconflictrequestTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: LaserdeconflictrequestTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<LaserdeconflictrequestTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "laserdeconflictrequest", "tuple")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: LaserdeconflictrequestUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-laserdeconflictrequest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unvalidatedPublishHandler.handle(it) }
                    }
                }
        }
    }
}
