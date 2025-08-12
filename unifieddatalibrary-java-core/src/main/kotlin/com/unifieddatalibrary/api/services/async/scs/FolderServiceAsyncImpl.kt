// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import com.unifieddatalibrary.api.models.scs.folders.FolderUpdateParams
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FolderServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FolderServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : FolderServiceAsync {

    private val withRawResponse: FolderServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): FolderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync = FolderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: FolderCreateParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // post /scs/folder
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(params: FolderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<FileData> =
        // get /scs/folder
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: FolderUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // patch /scs/folder
        withRawResponse().update(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : FolderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync.WithRawResponse = FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<String> = stringHandler()

        override fun create(params: FolderCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "folder")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          } }
        }

        private val retrieveHandler: Handler<FileData> = jsonHandler<FileData>(clientOptions.jsonMapper)

        override fun retrieve(params: FolderRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FileData>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "folder")
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

        override fun update(params: FolderUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "folder")
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
    }
}
