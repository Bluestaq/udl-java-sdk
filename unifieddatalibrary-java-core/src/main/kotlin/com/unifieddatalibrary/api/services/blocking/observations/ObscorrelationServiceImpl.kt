// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

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
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCountParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListPage
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationQueryHelpParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationQueryHelpResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationRetrieveParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationRetrieveResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationTupleParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationTupleResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.obscorrelation.HistoryService
import com.unifieddatalibrary.api.services.blocking.observations.obscorrelation.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ObscorrelationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObscorrelationService {

    private val withRawResponse: ObscorrelationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ObscorrelationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObscorrelationService =
        ObscorrelationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: ObscorrelationCreateParams, requestOptions: RequestOptions) {
        // post /udl/obscorrelation
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: ObscorrelationRetrieveParams,
        requestOptions: RequestOptions,
    ): ObscorrelationRetrieveResponse =
        // get /udl/obscorrelation/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ObscorrelationListParams,
        requestOptions: RequestOptions,
    ): ObscorrelationListPage =
        // get /udl/obscorrelation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: ObscorrelationCountParams, requestOptions: RequestOptions): String =
        // get /udl/obscorrelation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: ObscorrelationCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/obscorrelation/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: ObscorrelationQueryHelpParams,
        requestOptions: RequestOptions,
    ): ObscorrelationQueryHelpResponse =
        // get /udl/obscorrelation/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: ObscorrelationTupleParams,
        requestOptions: RequestOptions,
    ): List<ObscorrelationTupleResponse> =
        // get /udl/obscorrelation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: ObscorrelationUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-obscorrelation
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObscorrelationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObscorrelationService.WithRawResponse =
            ObscorrelationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ObscorrelationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<ObscorrelationRetrieveResponse> =
            jsonHandler<ObscorrelationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ObscorrelationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObscorrelationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation", params._pathParam(0))
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

        private val listHandler: Handler<List<ObscorrelationListResponse>> =
            jsonHandler<List<ObscorrelationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ObscorrelationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObscorrelationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation")
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
                        ObscorrelationListPage.builder()
                            .service(ObscorrelationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: ObscorrelationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation", "count")
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
            params: ObscorrelationCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<ObscorrelationQueryHelpResponse> =
            jsonHandler<ObscorrelationQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: ObscorrelationQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObscorrelationQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation", "queryhelp")
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

        private val tupleHandler: Handler<List<ObscorrelationTupleResponse>> =
            jsonHandler<List<ObscorrelationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ObscorrelationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ObscorrelationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "obscorrelation", "tuple")
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
            params: ObscorrelationUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-obscorrelation")
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
