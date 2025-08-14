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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListPageAsync
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfUploadZipParams
import com.unifieddatalibrary.api.services.async.gnssrawif.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.gnssrawif.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GnssRawIfServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GnssRawIfServiceAsync {

    private val withRawResponse: GnssRawIfServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GnssRawIfServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfServiceAsync =
        GnssRawIfServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun list(
        params: GnssRawIfListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GnssRawIfListPageAsync> =
        // get /udl/gnssrawif
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(
        params: GnssRawIfCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/gnssrawif/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun fileGet(
        params: GnssRawIfFileGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /udl/gnssrawif/getFile/{id}
        withRawResponse().fileGet(params, requestOptions)

    override fun get(
        params: GnssRawIfGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GnssRawIfGetResponse> =
        // get /udl/gnssrawif/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: GnssRawIfQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GnssRawIfQueryhelpResponse> =
        // get /udl/gnssrawif/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: GnssRawIfTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<GnssRawIfTupleResponse>> =
        // get /udl/gnssrawif/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun uploadZip(
        params: GnssRawIfUploadZipParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /filedrop/udl-gnssrawif
        withRawResponse().uploadZip(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GnssRawIfServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssRawIfServiceAsync.WithRawResponse =
            GnssRawIfServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val listHandler: Handler<List<GnssRawIfListResponse>> =
            jsonHandler<List<GnssRawIfListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: GnssRawIfListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GnssRawIfListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif")
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
                                GnssRawIfListPageAsync.builder()
                                    .service(GnssRawIfServiceAsyncImpl(clientOptions))
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
            params: GnssRawIfCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif", "count")
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

        override fun fileGet(
            params: GnssRawIfFileGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif", "getFile", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getHandler: Handler<GnssRawIfGetResponse> =
            jsonHandler<GnssRawIfGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: GnssRawIfGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GnssRawIfGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif", params._pathParam(0))
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

        private val queryhelpHandler: Handler<GnssRawIfQueryhelpResponse> =
            jsonHandler<GnssRawIfQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: GnssRawIfQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GnssRawIfQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif", "queryhelp")
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

        private val tupleHandler: Handler<List<GnssRawIfTupleResponse>> =
            jsonHandler<List<GnssRawIfTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: GnssRawIfTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<GnssRawIfTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "gnssrawif", "tuple")
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

        private val uploadZipHandler: Handler<Void?> = emptyHandler()

        override fun uploadZip(
            params: GnssRawIfUploadZipParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-gnssrawif")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { uploadZipHandler.handle(it) }
                    }
                }
        }
    }
}
