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
import com.unifieddatalibrary.api.models.BusFull
import com.unifieddatalibrary.api.models.buses.BusAbridged
import com.unifieddatalibrary.api.models.buses.BusCountParams
import com.unifieddatalibrary.api.models.buses.BusCreateParams
import com.unifieddatalibrary.api.models.buses.BusDeleteParams
import com.unifieddatalibrary.api.models.buses.BusListPage
import com.unifieddatalibrary.api.models.buses.BusListParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpParams
import com.unifieddatalibrary.api.models.buses.BusQueryHelpResponse
import com.unifieddatalibrary.api.models.buses.BusRetrieveParams
import com.unifieddatalibrary.api.models.buses.BusTupleParams
import com.unifieddatalibrary.api.models.buses.BusUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BusServiceImpl internal constructor(private val clientOptions: ClientOptions) : BusService {

    private val withRawResponse: BusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusService =
        BusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BusCreateParams, requestOptions: RequestOptions) {
        // post /udl/bus
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: BusRetrieveParams, requestOptions: RequestOptions): BusFull =
        // get /udl/bus/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BusUpdateParams, requestOptions: RequestOptions) {
        // put /udl/bus/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: BusListParams, requestOptions: RequestOptions): BusListPage =
        // get /udl/bus
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BusDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/bus/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: BusCountParams, requestOptions: RequestOptions): String =
        // get /udl/bus/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryHelp(
        params: BusQueryHelpParams,
        requestOptions: RequestOptions,
    ): BusQueryHelpResponse =
        // get /udl/bus/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: BusTupleParams, requestOptions: RequestOptions): List<BusFull> =
        // get /udl/bus/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusService.WithRawResponse =
            BusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: BusCreateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<BusFull> =
            jsonHandler<BusFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BusRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: BusUpdateParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<BusAbridged>> =
            jsonHandler<List<BusAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: BusListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus")
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
                        BusListPage.builder()
                            .service(BusServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: BusDeleteParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: BusCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<BusQueryHelpResponse> =
            jsonHandler<BusQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: BusQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", "queryhelp")
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

        private val tupleHandler: Handler<List<BusFull>> =
            jsonHandler<List<BusFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: BusTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BusFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "bus", "tuple")
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
