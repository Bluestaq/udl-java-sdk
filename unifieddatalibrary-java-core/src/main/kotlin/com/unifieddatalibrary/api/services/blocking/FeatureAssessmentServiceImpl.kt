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
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCountParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateBulkParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryService
import com.unifieddatalibrary.api.services.blocking.featureassessment.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeatureAssessmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureAssessmentService {

    private val withRawResponse: FeatureAssessmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): FeatureAssessmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentService =
        FeatureAssessmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions) {
        // post /udl/featureassessment
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: FeatureAssessmentRetrieveParams,
        requestOptions: RequestOptions,
    ): FeatureAssessmentRetrieveResponse =
        // get /udl/featureassessment/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun count(
        params: FeatureAssessmentCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/featureassessment/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: FeatureAssessmentCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/featureassessment/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun query(
        params: FeatureAssessmentQueryParams,
        requestOptions: RequestOptions,
    ): List<FeatureAssessmentQueryResponse> =
        // get /udl/featureassessment
        withRawResponse().query(params, requestOptions).parse()

    override fun queryHelp(
        params: FeatureAssessmentQueryHelpParams,
        requestOptions: RequestOptions,
    ): FeatureAssessmentQueryHelpResponse =
        // get /udl/featureassessment/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: FeatureAssessmentTupleParams,
        requestOptions: RequestOptions,
    ): List<FeatureAssessmentTupleResponse> =
        // get /udl/featureassessment/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: FeatureAssessmentUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-featureassessment
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureAssessmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureAssessmentService.WithRawResponse =
            FeatureAssessmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: FeatureAssessmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<FeatureAssessmentRetrieveResponse> =
            jsonHandler<FeatureAssessmentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FeatureAssessmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureAssessmentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment", params._pathParam(0))
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: FeatureAssessmentCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment", "count")
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
            params: FeatureAssessmentCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHandler: Handler<List<FeatureAssessmentQueryResponse>> =
            jsonHandler<List<FeatureAssessmentQueryResponse>>(clientOptions.jsonMapper)

        override fun query(
            params: FeatureAssessmentQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeatureAssessmentQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val queryHelpHandler: Handler<FeatureAssessmentQueryHelpResponse> =
            jsonHandler<FeatureAssessmentQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: FeatureAssessmentQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureAssessmentQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment", "queryhelp")
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

        private val tupleHandler: Handler<List<FeatureAssessmentTupleResponse>> =
            jsonHandler<List<FeatureAssessmentTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: FeatureAssessmentTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeatureAssessmentTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "featureassessment", "tuple")
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
            params: FeatureAssessmentUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-featureassessment")
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
