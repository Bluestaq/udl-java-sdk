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
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCountParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCreateParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestDeleteParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListPage
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestListResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestQueryhelpResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleResponse
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ObjectOfInterestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectOfInterestService {

    private val withRawResponse: ObjectOfInterestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ObjectOfInterestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectOfInterestService =
        ObjectOfInterestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ObjectOfInterestCreateParams, requestOptions: RequestOptions) {
        // post /udl/objectofinterest
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: ObjectOfInterestUpdateParams, requestOptions: RequestOptions) {
        // put /udl/objectofinterest/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: ObjectOfInterestListParams,
        requestOptions: RequestOptions,
    ): ObjectOfInterestListPage =
        // get /udl/objectofinterest
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ObjectOfInterestDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/objectofinterest/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(
        params: ObjectOfInterestCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/objectofinterest/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(
        params: ObjectOfInterestGetParams,
        requestOptions: RequestOptions,
    ): ObjectOfInterestGetResponse =
        // get /udl/objectofinterest/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: ObjectOfInterestQueryhelpParams,
        requestOptions: RequestOptions,
    ): ObjectOfInterestQueryhelpResponse =
        // get /udl/objectofinterest/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: ObjectOfInterestTupleParams,
        requestOptions: RequestOptions,
    ): List<ObjectOfInterestTupleResponse> =
        // get /udl/objectofinterest/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectOfInterestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectOfInterestService.WithRawResponse =
            ObjectOfInterestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ObjectOfInterestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest")
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
            params: ObjectOfInterestUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<ObjectOfInterestListResponse>> =
            jsonHandler<List<ObjectOfInterestListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ObjectOfInterestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectOfInterestListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest")
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
                        ObjectOfInterestListPage.builder()
                            .service(ObjectOfInterestServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ObjectOfInterestDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", params._pathParam(0))
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
            params: ObjectOfInterestCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ObjectOfInterestGetResponse> =
            jsonHandler<ObjectOfInterestGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ObjectOfInterestGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectOfInterestGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", params._pathParam(0))
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

        private val queryhelpHandler: Handler<ObjectOfInterestQueryhelpResponse> =
            jsonHandler<ObjectOfInterestQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: ObjectOfInterestQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectOfInterestQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", "queryhelp")
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

        private val tupleHandler: Handler<List<ObjectOfInterestTupleResponse>> =
            jsonHandler<List<ObjectOfInterestTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: ObjectOfInterestTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ObjectOfInterestTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "objectofinterest", "tuple")
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
