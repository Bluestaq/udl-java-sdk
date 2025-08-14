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
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.ElsetCountParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkFromTleParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateParams
import com.unifieddatalibrary.api.models.elsets.ElsetListPage
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetRetrieveParams
import com.unifieddatalibrary.api.models.elsets.ElsetTupleParams
import com.unifieddatalibrary.api.models.elsets.ElsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.elsets.CurrentService
import com.unifieddatalibrary.api.services.blocking.elsets.CurrentServiceImpl
import com.unifieddatalibrary.api.services.blocking.elsets.HistoryService
import com.unifieddatalibrary.api.services.blocking.elsets.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ElsetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ElsetService {

    private val withRawResponse: ElsetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ElsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ElsetService =
        ElsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentService = current

    override fun history(): HistoryService = history

    override fun create(params: ElsetCreateParams, requestOptions: RequestOptions) {
        // post /udl/elset
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: ElsetRetrieveParams, requestOptions: RequestOptions): Elset =
        // get /udl/elset/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ElsetListParams, requestOptions: RequestOptions): ElsetListPage =
        // get /udl/elset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: ElsetCountParams, requestOptions: RequestOptions): String =
        // get /udl/elset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: ElsetCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/elset/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun createBulkFromTle(
        params: ElsetCreateBulkFromTleParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/elset/createBulkFromTLE
        withRawResponse().createBulkFromTle(params, requestOptions)
    }

    override fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams,
        requestOptions: RequestOptions,
    ): ElsetQueryCurrentElsetHelpResponse =
        // get /udl/currentelset/queryhelp
        withRawResponse().queryCurrentElsetHelp(params, requestOptions).parse()

    override fun queryhelp(
        params: ElsetQueryhelpParams,
        requestOptions: RequestOptions,
    ): ElsetQueryhelpResponse =
        // get /udl/elset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: ElsetTupleParams, requestOptions: RequestOptions): List<Elset> =
        // get /udl/elset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: ElsetUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-elset
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ElsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentService.WithRawResponse by lazy {
            CurrentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ElsetService.WithRawResponse =
            ElsetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentService.WithRawResponse = current

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ElsetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Elset> = jsonHandler<Elset>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ElsetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Elset> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", params._pathParam(0))
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

        private val listHandler: Handler<List<ElsetAbridged>> =
            jsonHandler<List<ElsetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: ElsetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ElsetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset")
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
                        ElsetListPage.builder()
                            .service(ElsetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: ElsetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "count")
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
            params: ElsetCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val createBulkFromTleHandler: Handler<Void?> = emptyHandler()

        override fun createBulkFromTle(
            params: ElsetCreateBulkFromTleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "createBulkFromTLE")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkFromTleHandler.handle(it) }
            }
        }

        private val queryCurrentElsetHelpHandler: Handler<ElsetQueryCurrentElsetHelpResponse> =
            jsonHandler<ElsetQueryCurrentElsetHelpResponse>(clientOptions.jsonMapper)

        override fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ElsetQueryCurrentElsetHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "currentelset", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryCurrentElsetHelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryhelpHandler: Handler<ElsetQueryhelpResponse> =
            jsonHandler<ElsetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ElsetQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ElsetQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "queryhelp")
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

        private val tupleHandler: Handler<List<Elset>> =
            jsonHandler<List<Elset>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ElsetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Elset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "tuple")
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
            params: ElsetUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-elset")
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
