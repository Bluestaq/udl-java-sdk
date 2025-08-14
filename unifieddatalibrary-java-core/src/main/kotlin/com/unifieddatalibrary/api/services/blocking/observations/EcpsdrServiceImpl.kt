// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

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
import com.unifieddatalibrary.api.models.observations.ecpsdr.Ecpsdr
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrAbridged
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCountParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateBulkParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListPage
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrQueryHelpParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrQueryHelpResponse
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrRetrieveParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrTupleParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EcpsdrServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EcpsdrService {

    private val withRawResponse: EcpsdrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EcpsdrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpsdrService =
        EcpsdrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EcpsdrCreateParams, requestOptions: RequestOptions) {
        // post /udl/ecpsdr
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EcpsdrRetrieveParams, requestOptions: RequestOptions): Ecpsdr =
        // get /udl/ecpsdr/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EcpsdrListParams, requestOptions: RequestOptions): EcpsdrListPage =
        // get /udl/ecpsdr
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EcpsdrCountParams, requestOptions: RequestOptions): String =
        // get /udl/ecpsdr/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EcpsdrCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/ecpsdr/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: EcpsdrQueryHelpParams,
        requestOptions: RequestOptions,
    ): EcpsdrQueryHelpResponse =
        // get /udl/ecpsdr/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: EcpsdrTupleParams, requestOptions: RequestOptions): List<Ecpsdr> =
        // get /udl/ecpsdr/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EcpsdrService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EcpsdrService.WithRawResponse =
            EcpsdrServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: EcpsdrCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Ecpsdr> = jsonHandler<Ecpsdr>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EcpsdrRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ecpsdr> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr", params._pathParam(0))
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

        private val listHandler: Handler<List<EcpsdrAbridged>> =
            jsonHandler<List<EcpsdrAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: EcpsdrListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EcpsdrListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr")
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
                        EcpsdrListPage.builder()
                            .service(EcpsdrServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: EcpsdrCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr", "count")
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
            params: EcpsdrCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<EcpsdrQueryHelpResponse> =
            jsonHandler<EcpsdrQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: EcpsdrQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EcpsdrQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr", "queryhelp")
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

        private val tupleHandler: Handler<List<Ecpsdr>> =
            jsonHandler<List<Ecpsdr>>(clientOptions.jsonMapper)

        override fun tuple(
            params: EcpsdrTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Ecpsdr>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "ecpsdr", "tuple")
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
