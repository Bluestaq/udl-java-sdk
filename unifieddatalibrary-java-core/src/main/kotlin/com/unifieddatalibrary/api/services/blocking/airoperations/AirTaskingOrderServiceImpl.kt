// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

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
import com.unifieddatalibrary.api.models.AirTaskingOrderFull
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCountParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCreateParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListPage
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderRetrieveParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderTupleParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirtaskingorderAbridged
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirTaskingOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AirTaskingOrderService {

    private val withRawResponse: AirTaskingOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AirTaskingOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderService =
        AirTaskingOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirTaskingOrderCreateParams, requestOptions: RequestOptions) {
        // post /udl/airtaskingorder
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AirTaskingOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): AirTaskingOrderFull =
        // get /udl/airtaskingorder/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AirTaskingOrderListParams,
        requestOptions: RequestOptions,
    ): AirTaskingOrderListPage =
        // get /udl/airtaskingorder
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AirTaskingOrderCountParams, requestOptions: RequestOptions): String =
        // get /udl/airtaskingorder/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryHelp(
        params: AirTaskingOrderQueryHelpParams,
        requestOptions: RequestOptions,
    ): AirTaskingOrderQueryHelpResponse =
        // get /udl/airtaskingorder/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: AirTaskingOrderTupleParams,
        requestOptions: RequestOptions,
    ): List<AirTaskingOrderFull> =
        // get /udl/airtaskingorder/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: AirTaskingOrderUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-airtaskingorder
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AirTaskingOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirTaskingOrderService.WithRawResponse =
            AirTaskingOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AirTaskingOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AirTaskingOrderFull> =
            jsonHandler<AirTaskingOrderFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AirTaskingOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTaskingOrderFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder", params._pathParam(0))
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

        private val listHandler: Handler<List<AirtaskingorderAbridged>> =
            jsonHandler<List<AirtaskingorderAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AirTaskingOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTaskingOrderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder")
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
                        AirTaskingOrderListPage.builder()
                            .service(AirTaskingOrderServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: AirTaskingOrderCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<AirTaskingOrderQueryHelpResponse> =
            jsonHandler<AirTaskingOrderQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: AirTaskingOrderQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirTaskingOrderQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder", "queryhelp")
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

        private val tupleHandler: Handler<List<AirTaskingOrderFull>> =
            jsonHandler<List<AirTaskingOrderFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AirTaskingOrderTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AirTaskingOrderFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "airtaskingorder", "tuple")
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
            params: AirTaskingOrderUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-airtaskingorder")
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
