// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.scs.filemetadata.FileMetadataListParams
import com.unifieddatalibrary.api.services.async.scs.FileMetadataServiceAsync
import com.unifieddatalibrary.api.services.async.scs.FileMetadataServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FileMetadataServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : FileMetadataServiceAsync {

    private val withRawResponse: FileMetadataServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): FileMetadataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileMetadataServiceAsync = FileMetadataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: FileMetadataListParams, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        // get /scs/listFileMetadata
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : FileMetadataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileMetadataServiceAsync.WithRawResponse = FileMetadataServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun list(params: FileMetadataListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "listFileMetadata")
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
          } }
        }
    }
}
