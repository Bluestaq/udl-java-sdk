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
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.entities.EntityAbridged
import com.unifieddatalibrary.api.models.entities.EntityCountParams
import com.unifieddatalibrary.api.models.entities.EntityCreateParams
import com.unifieddatalibrary.api.models.entities.EntityDeleteParams
import com.unifieddatalibrary.api.models.entities.EntityGetAllTypesParams
import com.unifieddatalibrary.api.models.entities.EntityListPage
import com.unifieddatalibrary.api.models.entities.EntityListPageAsync
import com.unifieddatalibrary.api.models.entities.EntityListParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpResponse
import com.unifieddatalibrary.api.models.entities.EntityRetrieveParams
import com.unifieddatalibrary.api.models.entities.EntityTupleParams
import com.unifieddatalibrary.api.models.entities.EntityUpdateParams
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import com.unifieddatalibrary.api.services.async.EntityServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EntityServiceAsync {

    private val withRawResponse: EntityServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EntityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync = EntityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EntityCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/entity
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EntityFull> =
        // get /udl/entity/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: EntityUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/entity/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: EntityListParams, requestOptions: RequestOptions): CompletableFuture<EntityListPageAsync> =
        // get /udl/entity
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: EntityDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/entity/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: EntityCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/entity/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun getAllTypes(params: EntityGetAllTypesParams, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        // get /udl/entity/getAllTypes
        withRawResponse().getAllTypes(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: EntityQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<EntityQueryHelpResponse> =
        // get /udl/entity/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EntityTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EntityFull>> =
        // get /udl/entity/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EntityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync.WithRawResponse = EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EntityCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity")
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

        private val retrieveHandler: Handler<EntityFull> = jsonHandler<EntityFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EntityFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        override fun update(params: EntityUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        private val listHandler: Handler<List<EntityAbridged>> = jsonHandler<List<EntityAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EntityListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EntityListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity")
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
                  EntityListPageAsync.builder()
                      .service(EntityServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EntityDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        override fun count(params: EntityCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "count")
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

        private val getAllTypesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getAllTypes(params: EntityGetAllTypesParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "getAllTypes")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getAllTypesHandler.handle(it)
              }
          } }
        }

        private val queryHelpHandler: Handler<EntityQueryHelpResponse> = jsonHandler<EntityQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EntityQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EntityQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<EntityFull>> = jsonHandler<List<EntityFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EntityTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EntityFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "tuple")
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
