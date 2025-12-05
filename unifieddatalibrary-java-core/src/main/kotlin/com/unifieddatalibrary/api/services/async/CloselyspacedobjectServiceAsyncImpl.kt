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
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCountParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateBulkParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListPageAsync
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectQueryHelpResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleResponse
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectsAbridged
import com.unifieddatalibrary.api.services.async.closelyspacedobjects.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.closelyspacedobjects.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CloselyspacedobjectServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CloselyspacedobjectServiceAsync {

    private val withRawResponse: CloselyspacedobjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CloselyspacedobjectServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CloselyspacedobjectServiceAsync =
        CloselyspacedobjectServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: CloselyspacedobjectCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/closelyspacedobjects
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: CloselyspacedobjectRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloselyspacedobjectRetrieveResponse> =
        // get /udl/closelyspacedobjects/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CloselyspacedobjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloselyspacedobjectListPageAsync> =
        // get /udl/closelyspacedobjects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: CloselyspacedobjectCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/closelyspacedobjects/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: CloselyspacedobjectCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/closelyspacedobjects/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(
        params: CloselyspacedobjectQueryHelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloselyspacedobjectQueryHelpResponse> =
        // get /udl/closelyspacedobjects/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: CloselyspacedobjectTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CloselyspacedobjectTupleResponse>> =
        // get /udl/closelyspacedobjects/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(
        params: CloselyspacedobjectUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-closelyspacedobjects
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CloselyspacedobjectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CloselyspacedobjectServiceAsync.WithRawResponse =
            CloselyspacedobjectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: CloselyspacedobjectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects")
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

        private val retrieveHandler: Handler<CloselyspacedobjectRetrieveResponse> =
            jsonHandler<CloselyspacedobjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CloselyspacedobjectRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<CloselyspacedobjectsAbridged>> =
            jsonHandler<List<CloselyspacedobjectsAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: CloselyspacedobjectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects")
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
                                CloselyspacedobjectListPageAsync.builder()
                                    .service(CloselyspacedobjectServiceAsyncImpl(clientOptions))
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
            params: CloselyspacedobjectCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: CloselyspacedobjectCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createBulkHandler.handle(it) }
                    }
                }
        }

        private val queryHelpHandler: Handler<CloselyspacedobjectQueryHelpResponse> =
            jsonHandler<CloselyspacedobjectQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: CloselyspacedobjectQueryHelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloselyspacedobjectQueryHelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryHelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tupleHandler: Handler<List<CloselyspacedobjectTupleResponse>> =
            jsonHandler<List<CloselyspacedobjectTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: CloselyspacedobjectTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CloselyspacedobjectTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "closelyspacedobjects", "tuple")
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
            params: CloselyspacedobjectUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-closelyspacedobjects")
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
