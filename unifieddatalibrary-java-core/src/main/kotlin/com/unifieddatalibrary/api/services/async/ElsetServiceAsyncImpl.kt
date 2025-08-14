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
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.ElsetCountParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkFromTleParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateParams
import com.unifieddatalibrary.api.models.elsets.ElsetListPageAsync
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetRetrieveParams
import com.unifieddatalibrary.api.models.elsets.ElsetTupleParams
import com.unifieddatalibrary.api.models.elsets.ElsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.elsets.CurrentServiceAsync
import com.unifieddatalibrary.api.services.async.elsets.CurrentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.elsets.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.elsets.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ElsetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ElsetServiceAsync {

    private val withRawResponse: ElsetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ElsetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ElsetServiceAsync =
        ElsetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentServiceAsync = current

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: ElsetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/elset
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: ElsetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Elset> =
        // get /udl/elset/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ElsetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ElsetListPageAsync> =
        // get /udl/elset
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: ElsetCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/elset/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(
        params: ElsetCreateBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/elset/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun createBulkFromTle(
        params: ElsetCreateBulkFromTleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/elset/createBulkFromTLE
        withRawResponse().createBulkFromTle(params, requestOptions).thenAccept {}

    override fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ElsetQueryCurrentElsetHelpResponse> =
        // get /udl/currentelset/queryhelp
        withRawResponse().queryCurrentElsetHelp(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: ElsetQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ElsetQueryhelpResponse> =
        // get /udl/elset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: ElsetTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Elset>> =
        // get /udl/elset/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(
        params: ElsetUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-elset
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ElsetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentServiceAsync.WithRawResponse by lazy {
            CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ElsetServiceAsync.WithRawResponse =
            ElsetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentServiceAsync.WithRawResponse = current

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ElsetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset")
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

        private val retrieveHandler: Handler<Elset> = jsonHandler<Elset>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ElsetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Elset>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", params._pathParam(0))
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

        private val listHandler: Handler<List<ElsetAbridged>> =
            jsonHandler<List<ElsetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: ElsetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ElsetListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset")
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
                                ElsetListPageAsync.builder()
                                    .service(ElsetServiceAsyncImpl(clientOptions))
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
            params: ElsetCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "count")
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
            params: ElsetCreateBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "createBulk")
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

        private val createBulkFromTleHandler: Handler<Void?> = emptyHandler()

        override fun createBulkFromTle(
            params: ElsetCreateBulkFromTleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "createBulkFromTLE")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createBulkFromTleHandler.handle(it) }
                    }
                }
        }

        private val queryCurrentElsetHelpHandler: Handler<ElsetQueryCurrentElsetHelpResponse> =
            jsonHandler<ElsetQueryCurrentElsetHelpResponse>(clientOptions.jsonMapper)

        override fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "currentelset", "queryhelp")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryCurrentElsetHelpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryhelpHandler: Handler<ElsetQueryhelpResponse> =
            jsonHandler<ElsetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ElsetQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ElsetQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "queryhelp")
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

        private val tupleHandler: Handler<List<Elset>> =
            jsonHandler<List<Elset>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ElsetTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Elset>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "tuple")
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
            params: ElsetUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-elset")
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
