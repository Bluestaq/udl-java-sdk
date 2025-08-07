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
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCountParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateBulkParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListPage
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.maneuvers.HistoryService
import com.unifieddatalibrary.api.services.blocking.maneuvers.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManeuverServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ManeuverService {

    private val withRawResponse: ManeuverService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ManeuverService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverService =
        ManeuverServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: ManeuverCreateParams, requestOptions: RequestOptions) {
        // post /udl/maneuver
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: ManeuverListParams,
        requestOptions: RequestOptions,
    ): ManeuverListPage =
        // get /udl/maneuver
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: ManeuverCountParams, requestOptions: RequestOptions): String =
        // get /udl/maneuver/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: ManeuverCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/maneuver/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: ManeuverGetParams,
        requestOptions: RequestOptions,
    ): ManeuverGetResponse =
        // get /udl/maneuver/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: ManeuverQueryhelpParams,
        requestOptions: RequestOptions,
    ): ManeuverQueryhelpResponse =
        // get /udl/maneuver/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: ManeuverTupleParams,
        requestOptions: RequestOptions,
    ): List<ManeuverTupleResponse> =
        // get /udl/maneuver/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: ManeuverUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-maneuver
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManeuverService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManeuverService.WithRawResponse =
            ManeuverServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ManeuverCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<ManeuverListResponse>> =
            jsonHandler<List<ManeuverListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ManeuverListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManeuverListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver")
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
                        ManeuverListPage.builder()
                            .service(ManeuverServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: ManeuverCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver", "count")
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
            params: ManeuverCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ManeuverGetResponse> =
            jsonHandler<ManeuverGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ManeuverGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManeuverGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ManeuverQueryhelpResponse> =
            jsonHandler<ManeuverQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ManeuverQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManeuverQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver", "queryhelp")
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

        private val tupleHandler: Handler<List<ManeuverTupleResponse>> =
            jsonHandler<List<ManeuverTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ManeuverTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ManeuverTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "maneuver", "tuple")
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
            params: ManeuverUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-maneuver")
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
