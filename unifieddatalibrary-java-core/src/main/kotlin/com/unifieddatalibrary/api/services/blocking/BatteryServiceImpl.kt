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
import com.unifieddatalibrary.api.models.BatteryFull
import com.unifieddatalibrary.api.models.batteries.BatteryAbridged
import com.unifieddatalibrary.api.models.batteries.BatteryCountParams
import com.unifieddatalibrary.api.models.batteries.BatteryCreateParams
import com.unifieddatalibrary.api.models.batteries.BatteryDeleteParams
import com.unifieddatalibrary.api.models.batteries.BatteryListPage
import com.unifieddatalibrary.api.models.batteries.BatteryListParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpResponse
import com.unifieddatalibrary.api.models.batteries.BatteryRetrieveParams
import com.unifieddatalibrary.api.models.batteries.BatteryTupleParams
import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatteryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatteryService {

    private val withRawResponse: BatteryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatteryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatteryService =
        BatteryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BatteryCreateParams, requestOptions: RequestOptions) {
        // post /udl/battery
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: BatteryRetrieveParams,
        requestOptions: RequestOptions,
    ): BatteryFull =
        // get /udl/battery/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BatteryUpdateParams, requestOptions: RequestOptions) {
        // put /udl/battery/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: BatteryListParams, requestOptions: RequestOptions): BatteryListPage =
        // get /udl/battery
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BatteryDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/battery/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: BatteryCountParams, requestOptions: RequestOptions): String =
        // get /udl/battery/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: BatteryQueryhelpParams,
        requestOptions: RequestOptions,
    ): BatteryQueryhelpResponse =
        // get /udl/battery/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: BatteryTupleParams,
        requestOptions: RequestOptions,
    ): List<BatteryFull> =
        // get /udl/battery/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatteryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatteryService.WithRawResponse =
            BatteryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: BatteryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<BatteryFull> =
            jsonHandler<BatteryFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BatteryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatteryFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", params._pathParam(0))
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

        override fun update(
            params: BatteryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<BatteryAbridged>> =
            jsonHandler<List<BatteryAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: BatteryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatteryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery")
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
                        BatteryListPage.builder()
                            .service(BatteryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BatteryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", params._pathParam(0))
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
            params: BatteryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<BatteryQueryhelpResponse> =
            jsonHandler<BatteryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: BatteryQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatteryQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", "queryhelp")
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

        private val tupleHandler: Handler<List<BatteryFull>> =
            jsonHandler<List<BatteryFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: BatteryTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BatteryFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "battery", "tuple")
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
