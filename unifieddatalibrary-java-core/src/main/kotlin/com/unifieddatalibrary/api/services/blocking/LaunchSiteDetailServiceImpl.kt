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
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailCreateParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailDeleteParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListPage
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailListResponse
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchSiteDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LaunchSiteDetailService {

    private val withRawResponse: LaunchSiteDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LaunchSiteDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteDetailService =
        LaunchSiteDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaunchSiteDetailCreateParams, requestOptions: RequestOptions) {
        // post /udl/launchsitedetails
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LaunchSiteDetailUpdateParams, requestOptions: RequestOptions) {
        // put /udl/launchsitedetails/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: LaunchSiteDetailListParams,
        requestOptions: RequestOptions,
    ): LaunchSiteDetailListPage =
        // get /udl/launchsitedetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LaunchSiteDetailDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/launchsitedetails/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun findBySource(
        params: LaunchSiteDetailFindBySourceParams,
        requestOptions: RequestOptions,
    ): List<LaunchSiteDetailFindBySourceResponse> =
        // get /udl/launchsitedetails/findBySource
        withRawResponse().findBySource(params, requestOptions).parse()

    override fun get(
        params: LaunchSiteDetailGetParams,
        requestOptions: RequestOptions,
    ): LaunchSiteDetailGetResponse =
        // get /udl/launchsitedetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LaunchSiteDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchSiteDetailService.WithRawResponse =
            LaunchSiteDetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LaunchSiteDetailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails")
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
            params: LaunchSiteDetailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<LaunchSiteDetailListResponse>> =
            jsonHandler<List<LaunchSiteDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LaunchSiteDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteDetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails")
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
                        LaunchSiteDetailListPage.builder()
                            .service(LaunchSiteDetailServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LaunchSiteDetailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val findBySourceHandler: Handler<List<LaunchSiteDetailFindBySourceResponse>> =
            jsonHandler<List<LaunchSiteDetailFindBySourceResponse>>(clientOptions.jsonMapper)

        override fun findBySource(
            params: LaunchSiteDetailFindBySourceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LaunchSiteDetailFindBySourceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", "findBySource")
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

        private val getHandler: Handler<LaunchSiteDetailGetResponse> =
            jsonHandler<LaunchSiteDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: LaunchSiteDetailGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteDetailGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "launchsitedetails", params._pathParam(0))
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
