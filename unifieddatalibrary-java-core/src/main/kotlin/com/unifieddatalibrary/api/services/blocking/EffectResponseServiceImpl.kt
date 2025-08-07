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
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCountParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListPage
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.effectresponses.HistoryService
import com.unifieddatalibrary.api.services.blocking.effectresponses.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EffectResponseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EffectResponseService {

    private val withRawResponse: EffectResponseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EffectResponseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseService =
        EffectResponseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: EffectResponseCreateParams, requestOptions: RequestOptions) {
        // post /udl/effectresponse
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: EffectResponseRetrieveParams,
        requestOptions: RequestOptions,
    ): EffectResponseRetrieveResponse =
        // get /udl/effectresponse/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EffectResponseListParams,
        requestOptions: RequestOptions,
    ): EffectResponseListPage =
        // get /udl/effectresponse
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EffectResponseCountParams, requestOptions: RequestOptions): String =
        // get /udl/effectresponse/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: EffectResponseCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/effectresponse/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: EffectResponseQueryHelpParams,
        requestOptions: RequestOptions,
    ): EffectResponseQueryHelpResponse =
        // get /udl/effectresponse/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: EffectResponseTupleParams,
        requestOptions: RequestOptions,
    ): List<EffectResponseTupleResponse> =
        // get /udl/effectresponse/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: EffectResponseUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-effectresponse
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EffectResponseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EffectResponseService.WithRawResponse =
            EffectResponseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EffectResponseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<EffectResponseRetrieveResponse> =
            jsonHandler<EffectResponseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EffectResponseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EffectResponseRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse", params._pathParam(0))
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

        private val listHandler: Handler<List<EffectResponseListResponse>> =
            jsonHandler<List<EffectResponseListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: EffectResponseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EffectResponseListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse")
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
                        EffectResponseListPage.builder()
                            .service(EffectResponseServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EffectResponseCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse", "count")
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
            params: EffectResponseCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<EffectResponseQueryHelpResponse> =
            jsonHandler<EffectResponseQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: EffectResponseQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EffectResponseQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse", "queryhelp")
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

        private val tupleHandler: Handler<List<EffectResponseTupleResponse>> =
            jsonHandler<List<EffectResponseTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EffectResponseTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<EffectResponseTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "effectresponse", "tuple")
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
            params: EffectResponseUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-effectresponse")
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
