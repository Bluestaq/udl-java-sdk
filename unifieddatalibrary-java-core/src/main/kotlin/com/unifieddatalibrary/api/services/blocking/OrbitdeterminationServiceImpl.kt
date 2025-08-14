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
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCountParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateBulkParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListPage
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.orbitdetermination.HistoryService
import com.unifieddatalibrary.api.services.blocking.orbitdetermination.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrbitdeterminationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrbitdeterminationService {

    private val withRawResponse: OrbitdeterminationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): OrbitdeterminationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbitdeterminationService =
        OrbitdeterminationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: OrbitdeterminationCreateParams, requestOptions: RequestOptions) {
        // post /udl/orbitdetermination
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: OrbitdeterminationListParams,
        requestOptions: RequestOptions,
    ): OrbitdeterminationListPage =
        // get /udl/orbitdetermination
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: OrbitdeterminationCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/orbitdetermination/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: OrbitdeterminationCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/orbitdetermination/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: OrbitdeterminationGetParams,
        requestOptions: RequestOptions,
    ): OrbitdeterminationGetResponse =
        // get /udl/orbitdetermination/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: OrbitdeterminationQueryhelpParams,
        requestOptions: RequestOptions,
    ): OrbitdeterminationQueryhelpResponse =
        // get /udl/orbitdetermination/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: OrbitdeterminationTupleParams,
        requestOptions: RequestOptions,
    ): List<OrbitdeterminationTupleResponse> =
        // get /udl/orbitdetermination/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: OrbitdeterminationUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-orbitdetermination
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbitdeterminationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrbitdeterminationService.WithRawResponse =
            OrbitdeterminationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: OrbitdeterminationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<OrbitdeterminationListResponse>> =
            jsonHandler<List<OrbitdeterminationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OrbitdeterminationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbitdeterminationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination")
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
                        OrbitdeterminationListPage.builder()
                            .service(OrbitdeterminationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: OrbitdeterminationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination", "count")
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
            params: OrbitdeterminationCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<OrbitdeterminationGetResponse> =
            jsonHandler<OrbitdeterminationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: OrbitdeterminationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbitdeterminationGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OrbitdeterminationQueryhelpResponse> =
            jsonHandler<OrbitdeterminationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: OrbitdeterminationQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbitdeterminationQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination", "queryhelp")
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

        private val tupleHandler: Handler<List<OrbitdeterminationTupleResponse>> =
            jsonHandler<List<OrbitdeterminationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: OrbitdeterminationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrbitdeterminationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "orbitdetermination", "tuple")
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
            params: OrbitdeterminationUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-orbitdetermination")
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
