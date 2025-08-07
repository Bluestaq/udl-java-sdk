// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.AttitudedataFull
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpParams
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataTupleParams
import java.util.function.Consumer

class AttitudeDataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttitudeDataService {

    private val withRawResponse: AttitudeDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttitudeDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataService =
        AttitudeDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun queryHelp(
        params: AttitudeDataQueryHelpParams,
        requestOptions: RequestOptions,
    ): AttitudeDataQueryHelpResponse =
        // get /udl/attitudedata/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: AttitudeDataTupleParams,
        requestOptions: RequestOptions,
    ): List<AttitudedataFull> =
        // get /udl/attitudedata/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttitudeDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttitudeDataService.WithRawResponse =
            AttitudeDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val queryHelpHandler: Handler<AttitudeDataQueryHelpResponse> =
            jsonHandler<AttitudeDataQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: AttitudeDataQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttitudeDataQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudedata", "queryhelp")
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

        private val tupleHandler: Handler<List<AttitudedataFull>> =
            jsonHandler<List<AttitudedataFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AttitudeDataTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AttitudedataFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "attitudedata", "tuple")
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
