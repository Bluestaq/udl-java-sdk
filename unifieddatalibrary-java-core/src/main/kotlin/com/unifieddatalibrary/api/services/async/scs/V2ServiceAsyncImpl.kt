// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.scs.v2.ScsEntity
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import com.unifieddatalibrary.api.models.scs.v2.V2FileUploadParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import com.unifieddatalibrary.api.models.scs.v2.V2ListPage
import com.unifieddatalibrary.api.models.scs.v2.V2ListPageAsync
import com.unifieddatalibrary.api.models.scs.v2.V2ListParams
import com.unifieddatalibrary.api.models.scs.v2.V2MoveParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsync
import com.unifieddatalibrary.api.services.async.scs.V2ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V2ServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync = V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(params: V2UpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // patch /scs/v2/update
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: V2ListParams, requestOptions: RequestOptions): CompletableFuture<V2ListPageAsync> =
        // get /scs/v2/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: V2DeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /scs/v2/delete
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun copy(params: V2CopyParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /scs/v2/copy
        withRawResponse().copy(params, requestOptions).thenAccept {}

    override fun fileUpload(params: V2FileUploadParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /scs/v2/file
        withRawResponse().fileUpload(params, requestOptions).thenAccept {}

    override fun folderCreate(params: V2FolderCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /scs/v2/folder
        withRawResponse().folderCreate(params, requestOptions).thenAccept {}

    override fun move(params: V2MoveParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /scs/v2/move
        withRawResponse().move(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : V2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync.WithRawResponse = V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: V2UpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "update")
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

        private val listHandler: Handler<List<ScsEntity>> = jsonHandler<List<ScsEntity>>(clientOptions.jsonMapper)

        override fun list(params: V2ListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<V2ListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "list")
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
                  V2ListPageAsync.builder()
                      .service(V2ServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: V2DeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "delete")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          } }
        }

        private val copyHandler: Handler<Void?> = emptyHandler()

        override fun copy(params: V2CopyParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "copy")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  copyHandler.handle(it)
              }
          } }
        }

        private val fileUploadHandler: Handler<Void?> = emptyHandler()

        override fun fileUpload(params: V2FileUploadParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("fileContent", params._body().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "file")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  fileUploadHandler.handle(it)
              }
          } }
        }

        private val folderCreateHandler: Handler<Void?> = emptyHandler()

        override fun folderCreate(params: V2FolderCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "folder")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  folderCreateHandler.handle(it)
              }
          } }
        }

        private val moveHandler: Handler<Void?> = emptyHandler()

        override fun move(params: V2MoveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "v2", "move")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  moveHandler.handle(it)
              }
          } }
        }
    }
}
