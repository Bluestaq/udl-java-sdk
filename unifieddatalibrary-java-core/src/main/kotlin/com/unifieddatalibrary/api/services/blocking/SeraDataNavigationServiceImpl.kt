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
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationDeleteParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListPage
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeraDataNavigationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SeraDataNavigationService {

    private val withRawResponse: SeraDataNavigationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SeraDataNavigationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationService =
        SeraDataNavigationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeraDataNavigationCreateParams, requestOptions: RequestOptions) {
        // post /udl/seradatanavigation
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions) {
        // put /udl/seradatanavigation/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: SeraDataNavigationListParams,
        requestOptions: RequestOptions,
    ): SeraDataNavigationListPage =
        // get /udl/seradatanavigation
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeraDataNavigationDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/seradatanavigation/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(
        params: SeraDataNavigationCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/seradatanavigation/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: SeraDataNavigationGetParams,
        requestOptions: RequestOptions,
    ): SeraDataNavigationGetResponse =
        // get /udl/seradatanavigation/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SeraDataNavigationQueryhelpParams,
        requestOptions: RequestOptions,
    ): SeraDataNavigationQueryhelpResponse =
        // get /udl/seradatanavigation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SeraDataNavigationTupleParams,
        requestOptions: RequestOptions,
    ): List<SeraDataNavigationTupleResponse> =
        // get /udl/seradatanavigation/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SeraDataNavigationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SeraDataNavigationService.WithRawResponse =
            SeraDataNavigationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SeraDataNavigationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation")
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
            params: SeraDataNavigationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SeraDataNavigationListResponse>> =
            jsonHandler<List<SeraDataNavigationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SeraDataNavigationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeraDataNavigationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation")
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
                        SeraDataNavigationListPage.builder()
                            .service(SeraDataNavigationServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SeraDataNavigationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SeraDataNavigationCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SeraDataNavigationGetResponse> =
            jsonHandler<SeraDataNavigationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SeraDataNavigationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeraDataNavigationGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeraDataNavigationQueryhelpResponse> =
            jsonHandler<SeraDataNavigationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SeraDataNavigationQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SeraDataNavigationQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", "queryhelp")
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

        private val tupleHandler: Handler<List<SeraDataNavigationTupleResponse>> =
            jsonHandler<List<SeraDataNavigationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SeraDataNavigationTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SeraDataNavigationTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "seradatanavigation", "tuple")
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
