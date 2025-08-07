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
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSet
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetAbridged
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCountParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCreateParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetFileRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListPageAsync
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetTupleParams
import com.unifieddatalibrary.api.services.async.ephemerissets.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.ephemerissets.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EphemerisSetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EphemerisSetServiceAsync {

    private val withRawResponse: EphemerisSetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EphemerisSetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisSetServiceAsync =
        EphemerisSetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(
        params: EphemerisSetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/ephemerisset
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: EphemerisSetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EphemerisSet> =
        // get /udl/ephemerisset/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EphemerisSetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EphemerisSetListPageAsync> =
        // get /udl/ephemerisset
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: EphemerisSetCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/ephemerisset/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun fileRetrieve(
        params: EphemerisSetFileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /udl/ephemerisset/getFile/{id}
        withRawResponse().fileRetrieve(params, requestOptions)

    override fun queryhelp(
        params: EphemerisSetQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EphemerisSetQueryhelpResponse> =
        // get /udl/ephemerisset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: EphemerisSetTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<EphemerisSet>> =
        // get /udl/ephemerisset/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EphemerisSetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisSetServiceAsync.WithRawResponse =
            EphemerisSetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EphemerisSetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset")
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

        private val retrieveHandler: Handler<EphemerisSet> =
            jsonHandler<EphemerisSet>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EphemerisSetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EphemerisSet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", params._pathParam(0))
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

        private val listHandler: Handler<List<EphemerisSetAbridged>> =
            jsonHandler<List<EphemerisSetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EphemerisSetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EphemerisSetListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset")
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
                                EphemerisSetListPageAsync.builder()
                                    .service(EphemerisSetServiceAsyncImpl(clientOptions))
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
            params: EphemerisSetCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "count")
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

        override fun fileRetrieve(
            params: EphemerisSetFileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "getFile", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val queryhelpHandler: Handler<EphemerisSetQueryhelpResponse> =
            jsonHandler<EphemerisSetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EphemerisSetQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EphemerisSetQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "queryhelp")
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

        private val tupleHandler: Handler<List<EphemerisSet>> =
            jsonHandler<List<EphemerisSet>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EphemerisSetTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<EphemerisSet>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "tuple")
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
    }
}
