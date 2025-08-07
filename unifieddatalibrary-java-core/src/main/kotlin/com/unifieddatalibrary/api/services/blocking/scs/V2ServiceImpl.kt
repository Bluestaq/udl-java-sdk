// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

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
import com.unifieddatalibrary.api.models.scs.v2.ScsEntity
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import com.unifieddatalibrary.api.models.scs.v2.V2FileUploadParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import com.unifieddatalibrary.api.models.scs.v2.V2ListPage
import com.unifieddatalibrary.api.models.scs.v2.V2ListParams
import com.unifieddatalibrary.api.models.scs.v2.V2MoveParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(params: V2UpdateParams, requestOptions: RequestOptions) {
        // patch /scs/v2/update
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: V2ListParams, requestOptions: RequestOptions): V2ListPage =
        // get /scs/v2/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: V2DeleteParams, requestOptions: RequestOptions) {
        // delete /scs/v2/delete
        withRawResponse().delete(params, requestOptions)
    }

    override fun copy(params: V2CopyParams, requestOptions: RequestOptions) {
        // post /scs/v2/copy
        withRawResponse().copy(params, requestOptions)
    }

    override fun fileUpload(params: V2FileUploadParams, requestOptions: RequestOptions) {
        // post /scs/v2/file
        withRawResponse().fileUpload(params, requestOptions)
    }

    override fun folderCreate(params: V2FolderCreateParams, requestOptions: RequestOptions) {
        // post /scs/v2/folder
        withRawResponse().folderCreate(params, requestOptions)
    }

    override fun move(params: V2MoveParams, requestOptions: RequestOptions) {
        // put /scs/v2/move
        withRawResponse().move(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: V2UpdateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<ScsEntity>> =
            jsonHandler<List<ScsEntity>>(clientOptions.jsonMapper)

        override fun list(
            params: V2ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2ListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "list")
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
                        V2ListPage.builder()
                            .service(V2ServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: V2DeleteParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "delete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val copyHandler: Handler<Void?> = emptyHandler()

        override fun copy(params: V2CopyParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "copy")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { copyHandler.handle(it) }
            }
        }

        private val fileUploadHandler: Handler<Void?> = emptyHandler()

        override fun fileUpload(
            params: V2FileUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileContent", !params._fileContent().isMissing())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "file")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { fileUploadHandler.handle(it) }
            }
        }

        private val folderCreateHandler: Handler<Void?> = emptyHandler()

        override fun folderCreate(
            params: V2FolderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "folder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { folderCreateHandler.handle(it) }
            }
        }

        private val moveHandler: Handler<Void?> = emptyHandler()

        override fun move(params: V2MoveParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "v2", "move")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { moveHandler.handle(it) }
            }
        }
    }
}
