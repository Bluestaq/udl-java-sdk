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
import com.unifieddatalibrary.api.models.ConjunctionFull
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionAbridged
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCountParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCreateBulkParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionCreateUdlParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionGetHistoryParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionListPage
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionListParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionQueryhelpParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionQueryhelpResponse
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionRetrieveParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionTupleParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionUploadConjunctionDataMessageParams
import com.unifieddatalibrary.api.services.blocking.conjunctions.HistoryService
import com.unifieddatalibrary.api.services.blocking.conjunctions.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConjunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConjunctionService {

    private val withRawResponse: ConjunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ConjunctionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConjunctionService =
        ConjunctionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun retrieve(
        params: ConjunctionRetrieveParams,
        requestOptions: RequestOptions,
    ): ConjunctionFull =
        // get /udl/conjunction/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ConjunctionListParams,
        requestOptions: RequestOptions,
    ): ConjunctionListPage =
        // get /udl/conjunction
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: ConjunctionCountParams, requestOptions: RequestOptions): String =
        // get /udl/conjunction/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createUdl(params: ConjunctionCreateUdlParams, requestOptions: RequestOptions) {
        // post /udl/conjunction
        withRawResponse().createUdl(params, requestOptions)
    }

    override fun createBulk(params: ConjunctionCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/conjunction/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun getHistory(
        params: ConjunctionGetHistoryParams,
        requestOptions: RequestOptions,
    ): List<ConjunctionFull> =
        // get /udl/conjunction/history
        withRawResponse().getHistory(params, requestOptions).parse()

    override fun queryhelp(
        params: ConjunctionQueryhelpParams,
        requestOptions: RequestOptions,
    ): ConjunctionQueryhelpResponse =
        // get /udl/conjunction/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: ConjunctionTupleParams,
        requestOptions: RequestOptions,
    ): List<ConjunctionFull> =
        // get /udl/conjunction/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: ConjunctionUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-conjunction
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    override fun uploadConjunctionDataMessage(
        params: ConjunctionUploadConjunctionDataMessageParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/cdms
        withRawResponse().uploadConjunctionDataMessage(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConjunctionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConjunctionService.WithRawResponse =
            ConjunctionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val retrieveHandler: Handler<ConjunctionFull> =
            jsonHandler<ConjunctionFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConjunctionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConjunctionFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", params._pathParam(0))
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

        private val listHandler: Handler<List<ConjunctionAbridged>> =
            jsonHandler<List<ConjunctionAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: ConjunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConjunctionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction")
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
                        ConjunctionListPage.builder()
                            .service(ConjunctionServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: ConjunctionCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createUdlHandler: Handler<Void?> = emptyHandler()

        override fun createUdl(
            params: ConjunctionCreateUdlParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createUdlHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: ConjunctionCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHistoryHandler: Handler<List<ConjunctionFull>> =
            jsonHandler<List<ConjunctionFull>>(clientOptions.jsonMapper)

        override fun getHistory(
            params: ConjunctionGetHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ConjunctionFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", "history")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHistoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val queryhelpHandler: Handler<ConjunctionQueryhelpResponse> =
            jsonHandler<ConjunctionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ConjunctionQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConjunctionQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", "queryhelp")
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

        private val tupleHandler: Handler<List<ConjunctionFull>> =
            jsonHandler<List<ConjunctionFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ConjunctionTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ConjunctionFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "conjunction", "tuple")
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
            params: ConjunctionUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-conjunction")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }

        private val uploadConjunctionDataMessageHandler: Handler<Void?> = emptyHandler()

        override fun uploadConjunctionDataMessage(
            params: ConjunctionUploadConjunctionDataMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileContent", params._body().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "cdms")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadConjunctionDataMessageHandler.handle(it) }
            }
        }
    }
}
