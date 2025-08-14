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
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCountParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCreateParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListPage
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetRetrieveParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetTupleParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetAbridged
import com.unifieddatalibrary.api.services.blocking.attitudesets.HistoryService
import com.unifieddatalibrary.api.services.blocking.attitudesets.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttitudeSetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttitudeSetService {

    private val withRawResponse: AttitudeSetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): AttitudeSetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetService =
        AttitudeSetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: AttitudeSetCreateParams, requestOptions: RequestOptions) {
        // post /udl/attitudeset
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AttitudeSetRetrieveParams,
        requestOptions: RequestOptions,
    ): AttitudesetFull =
        // get /udl/attitudeset/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AttitudeSetListParams,
        requestOptions: RequestOptions,
    ): AttitudeSetListPage =
        // get /udl/attitudeset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AttitudeSetCountParams, requestOptions: RequestOptions): String =
        // get /udl/attitudeset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryHelp(
        params: AttitudeSetQueryHelpParams,
        requestOptions: RequestOptions,
    ): AttitudeSetQueryHelpResponse =
        // get /udl/attitudeset/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: AttitudeSetTupleParams,
        requestOptions: RequestOptions,
    ): List<AttitudesetFull> =
        // get /udl/attitudeset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: AttitudeSetUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-attitudeset
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttitudeSetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudeSetService.WithRawResponse =
            AttitudeSetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AttitudeSetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AttitudesetFull> =
            jsonHandler<AttitudesetFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AttitudeSetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttitudesetFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset", params._pathParam(0))
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

        private val listHandler: Handler<List<AttitudesetAbridged>> =
            jsonHandler<List<AttitudesetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AttitudeSetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttitudeSetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset")
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
                        AttitudeSetListPage.builder()
                            .service(AttitudeSetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AttitudeSetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<AttitudeSetQueryHelpResponse> =
            jsonHandler<AttitudeSetQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: AttitudeSetQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttitudeSetQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset", "queryhelp")
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

        private val tupleHandler: Handler<List<AttitudesetFull>> =
            jsonHandler<List<AttitudesetFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AttitudeSetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AttitudesetFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudeset", "tuple")
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
            params: AttitudeSetUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-attitudeset")
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
