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
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCountParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCreateParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailDeleteParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListPageAsync
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeraDataCommDetailServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SeraDataCommDetailServiceAsync {

    private val withRawResponse: SeraDataCommDetailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SeraDataCommDetailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SeraDataCommDetailServiceAsync =
        SeraDataCommDetailServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SeraDataCommDetailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /udl/seradatacommdetails
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(
        params: SeraDataCommDetailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /udl/seradatacommdetails/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: SeraDataCommDetailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeraDataCommDetailListPageAsync> =
        // get /udl/seradatacommdetails
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SeraDataCommDetailDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /udl/seradatacommdetails/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(
        params: SeraDataCommDetailCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /udl/seradatacommdetails/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SeraDataCommDetailGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeraDataCommDetailGetResponse> =
        // get /udl/seradatacommdetails/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(
        params: SeraDataCommDetailQueryhelpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SeraDataCommDetailQueryhelpResponse> =
        // get /udl/seradatacommdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(
        params: SeraDataCommDetailTupleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SeraDataCommDetailTupleResponse>> =
        // get /udl/seradatacommdetails/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SeraDataCommDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeraDataCommDetailServiceAsync.WithRawResponse =
            SeraDataCommDetailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SeraDataCommDetailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails")
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
            params: SeraDataCommDetailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        private val listHandler: Handler<List<SeraDataCommDetailListResponse>> =
            jsonHandler<List<SeraDataCommDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SeraDataCommDetailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails")
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
                                SeraDataCommDetailListPageAsync.builder()
                                    .service(SeraDataCommDetailServiceAsyncImpl(clientOptions))
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
            params: SeraDataCommDetailDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SeraDataCommDetailCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", "count")
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

        private val getHandler: Handler<SeraDataCommDetailGetResponse> =
            jsonHandler<SeraDataCommDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SeraDataCommDetailGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeraDataCommDetailQueryhelpResponse> =
            jsonHandler<SeraDataCommDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SeraDataCommDetailQueryhelpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SeraDataCommDetailQueryhelpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", "queryhelp")
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

        private val tupleHandler: Handler<List<SeraDataCommDetailTupleResponse>> =
            jsonHandler<List<SeraDataCommDetailTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SeraDataCommDetailTupleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SeraDataCommDetailTupleResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatacommdetails", "tuple")
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
