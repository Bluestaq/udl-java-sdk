// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import com.unifieddatalibrary.api.models.scs.folders.FolderUpdateParams
import java.util.function.Consumer

class FolderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FolderService {

    private val withRawResponse: FolderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FolderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService =
        FolderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(params: FolderCreateParams, requestOptions: RequestOptions): String =
        // post /scs/folder
        withRawResponse().create(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun retrieve(params: FolderRetrieveParams, requestOptions: RequestOptions): FileData =
        // get /scs/folder
        withRawResponse().retrieve(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun update(params: FolderUpdateParams, requestOptions: RequestOptions) {
        // patch /scs/folder
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FolderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderService.WithRawResponse =
            FolderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<String> = stringHandler()

        @Deprecated("deprecated")
        override fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "folder")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<FileData> =
            jsonHandler<FileData>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: FolderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileData> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "folder")
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

        @Deprecated("deprecated")
        override fun update(
            params: FolderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "folder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
