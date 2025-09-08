// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListPage
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import java.util.function.Consumer

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): FileData =
        // get /scs/file
        withRawResponse().retrieve(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun update(params: FileUpdateParams, requestOptions: RequestOptions) {
        // patch /scs/file
        withRawResponse().update(params, requestOptions)
    }

    @Deprecated("deprecated")
    override fun list(params: FileListParams, requestOptions: RequestOptions): FileListPage =
        // get /scs/list
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<FileData> =
            jsonHandler<FileData>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileData> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "file")
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
            params: FileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "file")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<FileData>> =
            jsonHandler<List<FileData>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scs", "list")
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
                        FileListPage.builder()
                            .service(FileServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
