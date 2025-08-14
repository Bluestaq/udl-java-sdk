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
import com.unifieddatalibrary.api.models.AntennaFull
import com.unifieddatalibrary.api.models.antennas.AntennaAbridged
import com.unifieddatalibrary.api.models.antennas.AntennaCountParams
import com.unifieddatalibrary.api.models.antennas.AntennaCreateParams
import com.unifieddatalibrary.api.models.antennas.AntennaDeleteParams
import com.unifieddatalibrary.api.models.antennas.AntennaListPage
import com.unifieddatalibrary.api.models.antennas.AntennaListParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpParams
import com.unifieddatalibrary.api.models.antennas.AntennaQueryhelpResponse
import com.unifieddatalibrary.api.models.antennas.AntennaRetrieveParams
import com.unifieddatalibrary.api.models.antennas.AntennaTupleParams
import com.unifieddatalibrary.api.models.antennas.AntennaUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AntennaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AntennaService {

    private val withRawResponse: AntennaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AntennaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaService =
        AntennaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AntennaCreateParams, requestOptions: RequestOptions) {
        // post /udl/antenna
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: AntennaRetrieveParams,
        requestOptions: RequestOptions,
    ): AntennaFull =
        // get /udl/antenna/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AntennaUpdateParams, requestOptions: RequestOptions) {
        // put /udl/antenna/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AntennaListParams, requestOptions: RequestOptions): AntennaListPage =
        // get /udl/antenna
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AntennaDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/antenna/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AntennaCountParams, requestOptions: RequestOptions): String =
        // get /udl/antenna/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(
        params: AntennaQueryhelpParams,
        requestOptions: RequestOptions,
    ): AntennaQueryhelpResponse =
        // get /udl/antenna/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: AntennaTupleParams,
        requestOptions: RequestOptions,
    ): List<AntennaFull> =
        // get /udl/antenna/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AntennaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AntennaService.WithRawResponse =
            AntennaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: AntennaCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<AntennaFull> =
            jsonHandler<AntennaFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AntennaRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AntennaFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", params._pathParam(0))
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
            params: AntennaUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<AntennaAbridged>> =
            jsonHandler<List<AntennaAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: AntennaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AntennaListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna")
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
                        AntennaListPage.builder()
                            .service(AntennaServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AntennaDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", params._pathParam(0))
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
            params: AntennaCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<AntennaQueryhelpResponse> =
            jsonHandler<AntennaQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: AntennaQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AntennaQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", "queryhelp")
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

        private val tupleHandler: Handler<List<AntennaFull>> =
            jsonHandler<List<AntennaFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: AntennaTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AntennaFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "antenna", "tuple")
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
