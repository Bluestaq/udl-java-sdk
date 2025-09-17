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
import com.unifieddatalibrary.api.models.dropzone.DropzoneCountParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateBulkParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneDeleteParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneListPage
import com.unifieddatalibrary.api.models.dropzone.DropzoneListParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneListResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DropzoneServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DropzoneService {

    private val withRawResponse: DropzoneService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DropzoneService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DropzoneService =
        DropzoneServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DropzoneCreateParams, requestOptions: RequestOptions) {
        // post /udl/dropzone
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: DropzoneRetrieveParams,
        requestOptions: RequestOptions,
    ): DropzoneRetrieveResponse =
        // get /udl/dropzone/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: DropzoneUpdateParams, requestOptions: RequestOptions) {
        // put /udl/dropzone/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: DropzoneListParams,
        requestOptions: RequestOptions,
    ): DropzoneListPage =
        // get /udl/dropzone
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DropzoneDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/dropzone/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: DropzoneCountParams, requestOptions: RequestOptions): String =
        // get /udl/dropzone/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: DropzoneCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/dropzone/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: DropzoneQueryHelpParams,
        requestOptions: RequestOptions,
    ): DropzoneQueryHelpResponse =
        // get /udl/dropzone/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: DropzoneTupleParams,
        requestOptions: RequestOptions,
    ): List<DropzoneTupleResponse> =
        // get /udl/dropzone/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: DropzoneUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-dropzone
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DropzoneService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DropzoneService.WithRawResponse =
            DropzoneServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: DropzoneCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<DropzoneRetrieveResponse> =
            jsonHandler<DropzoneRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DropzoneRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DropzoneRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", params._pathParam(0))
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
            params: DropzoneUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<DropzoneListResponse>> =
            jsonHandler<List<DropzoneListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: DropzoneListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DropzoneListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone")
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
                        DropzoneListPage.builder()
                            .service(DropzoneServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DropzoneDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", params._pathParam(0))
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
            params: DropzoneCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", "count")
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
            params: DropzoneCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<DropzoneQueryHelpResponse> =
            jsonHandler<DropzoneQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: DropzoneQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DropzoneQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", "queryhelp")
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

        private val tupleHandler: Handler<List<DropzoneTupleResponse>> =
            jsonHandler<List<DropzoneTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: DropzoneTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DropzoneTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "dropzone", "tuple")
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
            params: DropzoneUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-dropzone")
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
