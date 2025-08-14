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
import com.unifieddatalibrary.api.models.OnboardnavigationFull
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCreateBulkParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListPage
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationTupleParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.onboardnavigation.HistoryService
import com.unifieddatalibrary.api.services.blocking.onboardnavigation.HistoryServiceImpl
import java.util.function.Consumer

class OnboardnavigationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OnboardnavigationService {

    private val withRawResponse: OnboardnavigationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): OnboardnavigationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardnavigationService =
        OnboardnavigationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(
        params: OnboardnavigationListParams,
        requestOptions: RequestOptions,
    ): OnboardnavigationListPage =
        // get /udl/onboardnavigation
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: OnboardnavigationCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/onboardnavigation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: OnboardnavigationCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/onboardnavigation/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: OnboardnavigationQueryhelpParams,
        requestOptions: RequestOptions,
    ): OnboardnavigationQueryhelpResponse =
        // get /udl/onboardnavigation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: OnboardnavigationTupleParams,
        requestOptions: RequestOptions,
    ): List<OnboardnavigationFull> =
        // get /udl/onboardnavigation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: OnboardnavigationUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-onboardnavigation
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnboardnavigationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnboardnavigationService.WithRawResponse =
            OnboardnavigationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<OnboardnavigationListResponse>> =
            jsonHandler<List<OnboardnavigationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OnboardnavigationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnboardnavigationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation")
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
                        OnboardnavigationListPage.builder()
                            .service(OnboardnavigationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: OnboardnavigationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "count")
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
            params: OnboardnavigationCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<OnboardnavigationQueryhelpResponse> =
            jsonHandler<OnboardnavigationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: OnboardnavigationQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnboardnavigationQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "queryhelp")
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

        private val tupleHandler: Handler<List<OnboardnavigationFull>> =
            jsonHandler<List<OnboardnavigationFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: OnboardnavigationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OnboardnavigationFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onboardnavigation", "tuple")
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
            params: OnboardnavigationUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-onboardnavigation")
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
