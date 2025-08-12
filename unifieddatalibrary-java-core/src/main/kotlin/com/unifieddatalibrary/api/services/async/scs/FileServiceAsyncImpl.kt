// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListPage
import com.unifieddatalibrary.api.models.scs.file.FileListPageAsync
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FileServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync = FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): CompletableFuture<FileData> =
        // get /scs/file
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: FileUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // patch /scs/file
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: FileListParams, requestOptions: RequestOptions): CompletableFuture<FileListPageAsync> =
        // get /scs/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse = FileServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val retrieveHandler: Handler<FileData> = jsonHandler<FileData>(clientOptions.jsonMapper)

        override fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FileData>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "file")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: FileUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "file")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<List<FileData>> = jsonHandler<List<FileData>>(clientOptions.jsonMapper)

        override fun list(params: FileListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FileListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "list")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  FileListPageAsync.builder()
                      .service(FileServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }
    }
}
