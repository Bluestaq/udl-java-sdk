// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.models.OrganizationDetailsFull
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailCreateParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailDeleteParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailFindBySourceParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailFindBySourceResponse
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailGetParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListPage
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListResponse
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrganizationdetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationdetailService {

    private val withRawResponse: OrganizationdetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrganizationdetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationdetailService =
        OrganizationdetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OrganizationdetailCreateParams, requestOptions: RequestOptions) {
        // post /udl/organizationdetails
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OrganizationdetailUpdateParams, requestOptions: RequestOptions) {
        // put /udl/organizationdetails/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: OrganizationdetailListParams,
        requestOptions: RequestOptions,
    ): OrganizationdetailListPage =
        // get /udl/organizationdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OrganizationdetailDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/organizationdetails/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun findBySource(
        params: OrganizationdetailFindBySourceParams,
        requestOptions: RequestOptions,
    ): List<OrganizationdetailFindBySourceResponse> =
        // get /udl/organizationdetails/findBySource
        withRawResponse().findBySource(params, requestOptions).parse()

    override fun get(
        params: OrganizationdetailGetParams,
        requestOptions: RequestOptions,
    ): OrganizationDetailsFull =
        // get /udl/organizationdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationdetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationdetailService.WithRawResponse =
            OrganizationdetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: OrganizationdetailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: OrganizationdetailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<OrganizationdetailListResponse>> =
            jsonHandler<List<OrganizationdetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: OrganizationdetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationdetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails")
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
                        OrganizationdetailListPage.builder()
                            .service(OrganizationdetailServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: OrganizationdetailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val findBySourceHandler: Handler<List<OrganizationdetailFindBySourceResponse>> =
            jsonHandler<List<OrganizationdetailFindBySourceResponse>>(clientOptions.jsonMapper)

        override fun findBySource(
            params: OrganizationdetailFindBySourceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationdetailFindBySourceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails", "findBySource")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { findBySourceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val getHandler: Handler<OrganizationDetailsFull> =
            jsonHandler<OrganizationDetailsFull>(clientOptions.jsonMapper)

        override fun get(
            params: OrganizationdetailGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationDetailsFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "organizationdetails", params._pathParam(0))
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
    }
}
