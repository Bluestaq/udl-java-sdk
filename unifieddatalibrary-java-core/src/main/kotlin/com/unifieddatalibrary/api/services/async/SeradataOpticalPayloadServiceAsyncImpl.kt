// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCountParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListPage
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListPageAsync
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadUpdateParams
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataOpticalPayloadServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeradataOpticalPayloadServiceAsync {

    private val withRawResponse: SeradataOpticalPayloadServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeradataOpticalPayloadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadServiceAsync = SeradataOpticalPayloadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeradataOpticalPayloadCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/seradataopticalpayload
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SeradataOpticalPayloadUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/seradataopticalpayload/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SeradataOpticalPayloadListParams, requestOptions: RequestOptions): CompletableFuture<SeradataOpticalPayloadListPageAsync> =
        // get /udl/seradataopticalpayload
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SeradataOpticalPayloadDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/seradataopticalpayload/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: SeradataOpticalPayloadCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/seradataopticalpayload/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: SeradataOpticalPayloadGetParams, requestOptions: RequestOptions): CompletableFuture<SeradataOpticalPayloadGetResponse> =
        // get /udl/seradataopticalpayload/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SeradataOpticalPayloadQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SeradataOpticalPayloadQueryhelpResponse> =
        // get /udl/seradataopticalpayload/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SeradataOpticalPayloadTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SeradataOpticalPayloadTupleResponse>> =
        // get /udl/seradataopticalpayload/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeradataOpticalPayloadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadServiceAsync.WithRawResponse = SeradataOpticalPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeradataOpticalPayloadCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload")
            .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: SeradataOpticalPayloadUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
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

        private val listHandler: Handler<List<SeradataOpticalPayloadListResponse>> = jsonHandler<List<SeradataOpticalPayloadListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeradataOpticalPayloadListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload")
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
                  SeradataOpticalPayloadListPageAsync.builder()
                      .service(SeradataOpticalPayloadServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeradataOpticalPayloadDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SeradataOpticalPayloadCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "count")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          } }
        }

        private val getHandler: Handler<SeradataOpticalPayloadGetResponse> = jsonHandler<SeradataOpticalPayloadGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeradataOpticalPayloadGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<SeradataOpticalPayloadQueryhelpResponse> = jsonHandler<SeradataOpticalPayloadQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeradataOpticalPayloadQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<SeradataOpticalPayloadTupleResponse>> = jsonHandler<List<SeradataOpticalPayloadTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeradataOpticalPayloadTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "tuple")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }
    }
}
