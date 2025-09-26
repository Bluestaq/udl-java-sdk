// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.rfemitter

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingCreateBulkParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingCreateParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingListPage
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingListParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingListResponse
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingRetrieveParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingRetrieveResponse
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StagingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StagingService {

    private val withRawResponse: StagingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StagingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StagingService =
        StagingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: StagingCreateParams, requestOptions: RequestOptions) {
        // post /udl/rfemitterstaging
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: StagingRetrieveParams,
        requestOptions: RequestOptions,
    ): StagingRetrieveResponse =
        // get /udl/rfemitterstaging/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: StagingUpdateParams, requestOptions: RequestOptions) {
        // put /udl/rfemitterstaging/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: StagingListParams, requestOptions: RequestOptions): StagingListPage =
        // get /udl/rfemitterstaging
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: StagingDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/rfemitterstaging/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createBulk(params: StagingCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/rfemitterstaging/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(
        params: StagingQueryhelpParams,
        requestOptions: RequestOptions,
    ): StagingQueryhelpResponse =
        // get /udl/rfemitterstaging/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StagingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StagingService.WithRawResponse =
            StagingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: StagingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<StagingRetrieveResponse> =
            jsonHandler<StagingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StagingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StagingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging", params._pathParam(0))
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
            params: StagingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<StagingListResponse>> =
            jsonHandler<List<StagingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: StagingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StagingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging")
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
                        StagingListPage.builder()
                            .service(StagingServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: StagingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: StagingCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryhelpHandler: Handler<StagingQueryhelpResponse> =
            jsonHandler<StagingQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: StagingQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StagingQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "rfemitterstaging", "queryhelp")
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
    }
}
