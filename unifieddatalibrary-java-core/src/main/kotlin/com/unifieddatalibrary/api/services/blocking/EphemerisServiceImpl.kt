// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.EphemerisFull
import com.unifieddatalibrary.api.models.ephemeris.EphemerisAbridged
import com.unifieddatalibrary.api.models.ephemeris.EphemerisCountParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisFileUploadParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListPage
import com.unifieddatalibrary.api.models.ephemeris.EphemerisListParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisQueryhelpResponse
import com.unifieddatalibrary.api.models.ephemeris.EphemerisTupleParams
import com.unifieddatalibrary.api.models.ephemeris.EphemerisUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.ephemeris.HistoryService
import com.unifieddatalibrary.api.services.blocking.ephemeris.HistoryServiceImpl
import java.util.function.Consumer

class EphemerisServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EphemerisService {

    private val withRawResponse: EphemerisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attitudeData: AttitudeDataService by lazy { AttitudeDataServiceImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EphemerisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemerisService =
        EphemerisServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attitudeData(): AttitudeDataService = attitudeData

    override fun history(): HistoryService = history

    override fun list(
        params: EphemerisListParams,
        requestOptions: RequestOptions,
    ): EphemerisListPage =
        // get /udl/ephemeris
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EphemerisCountParams, requestOptions: RequestOptions): String =
        // get /udl/ephemeris/count
        withRawResponse().count(params, requestOptions).parse()

    override fun fileUpload(params: EphemerisFileUploadParams, requestOptions: RequestOptions) {
        // post /filedrop/ephem
        withRawResponse().fileUpload(params, requestOptions)
    }

    override fun queryhelp(
        params: EphemerisQueryhelpParams,
        requestOptions: RequestOptions,
    ): EphemerisQueryhelpResponse =
        // get /udl/ephemeris/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: EphemerisTupleParams,
        requestOptions: RequestOptions,
    ): List<EphemerisFull> =
        // get /udl/ephemeris/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: EphemerisUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-ephset
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EphemerisService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attitudeData: AttitudeDataService.WithRawResponse by lazy {
            AttitudeDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemerisService.WithRawResponse =
            EphemerisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attitudeData(): AttitudeDataService.WithRawResponse = attitudeData

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<EphemerisAbridged>> =
            jsonHandler<List<EphemerisAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EphemerisListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemerisListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemeris")
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
                        EphemerisListPage.builder()
                            .service(EphemerisServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EphemerisCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemeris", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val fileUploadHandler: Handler<Void?> = emptyHandler()

        override fun fileUpload(
            params: EphemerisFileUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "ephem")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { fileUploadHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<EphemerisQueryhelpResponse> =
            jsonHandler<EphemerisQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: EphemerisQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemerisQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemeris", "queryhelp")
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

        private val tupleHandler: Handler<List<EphemerisFull>> =
            jsonHandler<List<EphemerisFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EphemerisTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<EphemerisFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ephemeris", "tuple")
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
            params: EphemerisUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-ephset")
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
