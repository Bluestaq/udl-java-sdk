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
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListPage
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteRemarkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SiteRemarkService {

    private val withRawResponse: SiteRemarkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SiteRemarkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteRemarkService =
        SiteRemarkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SiteRemarkCreateParams, requestOptions: RequestOptions) {
        // post /udl/siteremark
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: SiteRemarkListParams,
        requestOptions: RequestOptions,
    ): SiteRemarkListPage =
        // get /udl/siteremark
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SiteRemarkCountParams, requestOptions: RequestOptions): String =
        // get /udl/siteremark/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SiteRemarkGetParams,
        requestOptions: RequestOptions,
    ): SiteRemarkGetResponse =
        // get /udl/siteremark/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SiteRemarkQueryhelpParams,
        requestOptions: RequestOptions,
    ): SiteRemarkQueryhelpResponse =
        // get /udl/siteremark/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SiteRemarkTupleParams,
        requestOptions: RequestOptions,
    ): List<SiteRemarkTupleResponse> =
        // get /udl/siteremark/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiteRemarkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteRemarkService.WithRawResponse =
            SiteRemarkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SiteRemarkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SiteRemarkListResponse>> =
            jsonHandler<List<SiteRemarkListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SiteRemarkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteRemarkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark")
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
                        SiteRemarkListPage.builder()
                            .service(SiteRemarkServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SiteRemarkCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SiteRemarkGetResponse> =
            jsonHandler<SiteRemarkGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SiteRemarkGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteRemarkGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SiteRemarkQueryhelpResponse> =
            jsonHandler<SiteRemarkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SiteRemarkQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteRemarkQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark", "queryhelp")
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

        private val tupleHandler: Handler<List<SiteRemarkTupleResponse>> =
            jsonHandler<List<SiteRemarkTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SiteRemarkTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SiteRemarkTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "siteremark", "tuple")
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
