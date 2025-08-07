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
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSet
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetAbridged
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCountParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCreateParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetFileRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListPage
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetListParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetTupleParams
import com.unifieddatalibrary.api.services.blocking.ephemerissets.HistoryService
import com.unifieddatalibrary.api.services.blocking.ephemerissets.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EphemerisSetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EphemerisSetService {

    private val withRawResponse: EphemerisSetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EphemerisSetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisSetService =
        EphemerisSetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: EphemerisSetCreateParams, requestOptions: RequestOptions) {
        // post /udl/ephemerisset
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: EphemerisSetRetrieveParams,
        requestOptions: RequestOptions,
    ): EphemerisSet =
        // get /udl/ephemerisset/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EphemerisSetListParams,
        requestOptions: RequestOptions,
    ): EphemerisSetListPage =
        // get /udl/ephemerisset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EphemerisSetCountParams, requestOptions: RequestOptions): String =
        // get /udl/ephemerisset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun fileRetrieve(
        params: EphemerisSetFileRetrieveParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /udl/ephemerisset/getFile/{id}
        withRawResponse().fileRetrieve(params, requestOptions)

    override fun queryhelp(
        params: EphemerisSetQueryhelpParams,
        requestOptions: RequestOptions,
    ): EphemerisSetQueryhelpResponse =
        // get /udl/ephemerisset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: EphemerisSetTupleParams,
        requestOptions: RequestOptions,
    ): List<EphemerisSet> =
        // get /udl/ephemerisset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EphemerisSetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisSetService.WithRawResponse =
            EphemerisSetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EphemerisSetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<EphemerisSet> =
            jsonHandler<EphemerisSet>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EphemerisSetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemerisSet> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", params._pathParam(0))
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

        private val listHandler: Handler<List<EphemerisSetAbridged>> =
            jsonHandler<List<EphemerisSetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EphemerisSetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemerisSetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset")
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
                        EphemerisSetListPage.builder()
                            .service(EphemerisSetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EphemerisSetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        override fun fileRetrieve(
            params: EphemerisSetFileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "getFile", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val queryhelpHandler: Handler<EphemerisSetQueryhelpResponse> =
            jsonHandler<EphemerisSetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EphemerisSetQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemerisSetQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "queryhelp")
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

        private val tupleHandler: Handler<List<EphemerisSet>> =
            jsonHandler<List<EphemerisSet>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EphemerisSetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<EphemerisSet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemerisset", "tuple")
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
    }
}
