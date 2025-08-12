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
import com.unifieddatalibrary.api.models.StatusFull
import com.unifieddatalibrary.api.models.status.StatusCountParams
import com.unifieddatalibrary.api.models.status.StatusCreateParams
import com.unifieddatalibrary.api.models.status.StatusDeleteParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityIdParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityTypeParams
import com.unifieddatalibrary.api.models.status.StatusGetParams
import com.unifieddatalibrary.api.models.status.StatusListPage
import com.unifieddatalibrary.api.models.status.StatusListPageAsync
import com.unifieddatalibrary.api.models.status.StatusListParams
import com.unifieddatalibrary.api.models.status.StatusListResponse
import com.unifieddatalibrary.api.models.status.StatusQueryhelpParams
import com.unifieddatalibrary.api.models.status.StatusQueryhelpResponse
import com.unifieddatalibrary.api.models.status.StatusTupleParams
import com.unifieddatalibrary.api.models.status.StatusUpdateParams
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import com.unifieddatalibrary.api.services.async.StatusServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatusServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : StatusServiceAsync {

    private val withRawResponse: StatusServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): StatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync = StatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: StatusCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/status
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: StatusUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/status/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: StatusListParams, requestOptions: RequestOptions): CompletableFuture<StatusListPageAsync> =
        // get /udl/status
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: StatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/status/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: StatusCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/status/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: StatusGetParams, requestOptions: RequestOptions): CompletableFuture<StatusFull> =
        // get /udl/status/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getByEntityId(params: StatusGetByEntityIdParams, requestOptions: RequestOptions): CompletableFuture<List<StatusFull>> =
        // get /udl/status/byIdEntity/{idEntity}
        withRawResponse().getByEntityId(params, requestOptions).thenApply { it.parse() }

    override fun getByEntityType(params: StatusGetByEntityTypeParams, requestOptions: RequestOptions): CompletableFuture<List<StatusFull>> =
        // get /udl/status/byEntityType/{entityType}
        withRawResponse().getByEntityType(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: StatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<StatusQueryhelpResponse> =
        // get /udl/status/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: StatusTupleParams, requestOptions: RequestOptions): CompletableFuture<List<StatusFull>> =
        // get /udl/status/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : StatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync.WithRawResponse = StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: StatusCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status")
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

        override fun update(params: StatusUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", params._pathParam(0))
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

        private val listHandler: Handler<List<StatusListResponse>> = jsonHandler<List<StatusListResponse>>(clientOptions.jsonMapper)

        override fun list(params: StatusListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StatusListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status")
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
                  StatusListPageAsync.builder()
                      .service(StatusServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: StatusDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", params._pathParam(0))
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

        override fun count(params: StatusCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", "count")
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

        private val getHandler: Handler<StatusFull> = jsonHandler<StatusFull>(clientOptions.jsonMapper)

        override fun get(params: StatusGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StatusFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", params._pathParam(0))
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

        private val getByEntityIdHandler: Handler<List<StatusFull>> = jsonHandler<List<StatusFull>>(clientOptions.jsonMapper)

        override fun getByEntityId(params: StatusGetByEntityIdParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<StatusFull>>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("idEntity", params.idEntity().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", "byIdEntity", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getByEntityIdHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val getByEntityTypeHandler: Handler<List<StatusFull>> = jsonHandler<List<StatusFull>>(clientOptions.jsonMapper)

        override fun getByEntityType(params: StatusGetByEntityTypeParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<StatusFull>>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("entityType", params.entityType().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", "byEntityType", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getByEntityTypeHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<StatusQueryhelpResponse> = jsonHandler<StatusQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: StatusQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<StatusQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", "queryhelp")
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

        private val tupleHandler: Handler<List<StatusFull>> = jsonHandler<List<StatusFull>>(clientOptions.jsonMapper)

        override fun tuple(params: StatusTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<StatusFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "status", "tuple")
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
