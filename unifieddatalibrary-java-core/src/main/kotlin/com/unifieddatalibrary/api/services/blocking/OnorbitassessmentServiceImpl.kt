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
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCountParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListPage
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.onorbitassessment.HistoryService
import com.unifieddatalibrary.api.services.blocking.onorbitassessment.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnorbitassessmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OnorbitassessmentService {

    private val withRawResponse: OnorbitassessmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): OnorbitassessmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitassessmentService =
        OnorbitassessmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: OnorbitassessmentCreateParams, requestOptions: RequestOptions) {
        // post /udl/onorbitassessment
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: OnorbitassessmentListParams,
        requestOptions: RequestOptions,
    ): OnorbitassessmentListPage =
        // get /udl/onorbitassessment
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: OnorbitassessmentCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/onorbitassessment/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: OnorbitassessmentCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/onorbitassessment/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: OnorbitassessmentGetParams,
        requestOptions: RequestOptions,
    ): OnorbitassessmentGetResponse =
        // get /udl/onorbitassessment/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: OnorbitassessmentQueryhelpParams,
        requestOptions: RequestOptions,
    ): OnorbitassessmentQueryhelpResponse =
        // get /udl/onorbitassessment/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: OnorbitassessmentTupleParams,
        requestOptions: RequestOptions,
    ): List<OnorbitassessmentTupleResponse> =
        // get /udl/onorbitassessment/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: OnorbitassessmentUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-onorbitassessment
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnorbitassessmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbitassessmentService.WithRawResponse =
            OnorbitassessmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: OnorbitassessmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<OnorbitassessmentListResponse>> =
            jsonHandler<List<OnorbitassessmentListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OnorbitassessmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitassessmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment")
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
                        OnorbitassessmentListPage.builder()
                            .service(OnorbitassessmentServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: OnorbitassessmentCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment", "count")
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
            params: OnorbitassessmentCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<OnorbitassessmentGetResponse> =
            jsonHandler<OnorbitassessmentGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: OnorbitassessmentGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitassessmentGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryhelpHandler: Handler<OnorbitassessmentQueryhelpResponse> =
            jsonHandler<OnorbitassessmentQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: OnorbitassessmentQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitassessmentQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment", "queryhelp")
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

        private val tupleHandler: Handler<List<OnorbitassessmentTupleResponse>> =
            jsonHandler<List<OnorbitassessmentTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: OnorbitassessmentTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OnorbitassessmentTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "onorbitassessment", "tuple")
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
            params: OnorbitassessmentUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-onorbitassessment")
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
