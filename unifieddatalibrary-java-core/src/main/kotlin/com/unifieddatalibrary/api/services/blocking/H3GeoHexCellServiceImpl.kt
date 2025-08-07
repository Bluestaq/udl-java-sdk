// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellCountParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListPage
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleResponse
import java.util.function.Consumer

class H3GeoHexCellServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    H3GeoHexCellService {

    private val withRawResponse: H3GeoHexCellService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): H3GeoHexCellService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellService =
        H3GeoHexCellServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: H3GeoHexCellListParams,
        requestOptions: RequestOptions,
    ): H3GeoHexCellListPage =
        // get /udl/h3geohexcell
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: H3GeoHexCellCountParams, requestOptions: RequestOptions): String =
        // get /udl/h3geohexcell/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: H3GeoHexCellQueryhelpParams,
        requestOptions: RequestOptions,
    ): H3GeoHexCellQueryhelpResponse =
        // get /udl/h3geohexcell/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: H3GeoHexCellTupleParams,
        requestOptions: RequestOptions,
    ): List<H3GeoHexCellTupleResponse> =
        // get /udl/h3geohexcell/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        H3GeoHexCellService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): H3GeoHexCellService.WithRawResponse =
            H3GeoHexCellServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<H3GeoHexCellListResponse>> =
            jsonHandler<List<H3GeoHexCellListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: H3GeoHexCellListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<H3GeoHexCellListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "h3geohexcell")
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
                        H3GeoHexCellListPage.builder()
                            .service(H3GeoHexCellServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: H3GeoHexCellCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "h3geohexcell", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<H3GeoHexCellQueryhelpResponse> =
            jsonHandler<H3GeoHexCellQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: H3GeoHexCellQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<H3GeoHexCellQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "h3geohexcell", "queryhelp")
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

        private val tupleHandler: Handler<List<H3GeoHexCellTupleResponse>> =
            jsonHandler<List<H3GeoHexCellTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: H3GeoHexCellTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<H3GeoHexCellTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "h3geohexcell", "tuple")
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
