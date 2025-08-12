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
import com.unifieddatalibrary.api.models.equipment.EquipmentAbridged
import com.unifieddatalibrary.api.models.equipment.EquipmentCountParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateBulkParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateParams
import com.unifieddatalibrary.api.models.equipment.EquipmentDeleteParams
import com.unifieddatalibrary.api.models.equipment.EquipmentFull
import com.unifieddatalibrary.api.models.equipment.EquipmentListPage
import com.unifieddatalibrary.api.models.equipment.EquipmentListPageAsync
import com.unifieddatalibrary.api.models.equipment.EquipmentListParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpResponse
import com.unifieddatalibrary.api.models.equipment.EquipmentRetrieveParams
import com.unifieddatalibrary.api.models.equipment.EquipmentTupleParams
import com.unifieddatalibrary.api.models.equipment.EquipmentUpdateParams
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EquipmentServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EquipmentServiceAsync {

    private val withRawResponse: EquipmentServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EquipmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentServiceAsync = EquipmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EquipmentCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/equipment
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: EquipmentRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EquipmentFull> =
        // get /udl/equipment/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: EquipmentUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/equipment/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: EquipmentListParams, requestOptions: RequestOptions): CompletableFuture<EquipmentListPageAsync> =
        // get /udl/equipment
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: EquipmentDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/equipment/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: EquipmentCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/equipment/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: EquipmentCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/equipment/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: EquipmentQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<EquipmentQueryHelpResponse> =
        // get /udl/equipment/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: EquipmentTupleParams, requestOptions: RequestOptions): CompletableFuture<List<EquipmentFull>> =
        // get /udl/equipment/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EquipmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentServiceAsync.WithRawResponse = EquipmentServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EquipmentCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment")
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

        private val retrieveHandler: Handler<EquipmentFull> = jsonHandler<EquipmentFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EquipmentRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", params._pathParam(0))
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

        override fun update(params: EquipmentUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", params._pathParam(0))
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

        private val listHandler: Handler<List<EquipmentAbridged>> = jsonHandler<List<EquipmentAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EquipmentListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment")
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
                  EquipmentListPageAsync.builder()
                      .service(EquipmentServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EquipmentDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", params._pathParam(0))
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

        override fun count(params: EquipmentCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: EquipmentCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", "createBulk")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createBulkHandler.handle(it)
              }
          } }
        }

        private val queryHelpHandler: Handler<EquipmentQueryHelpResponse> = jsonHandler<EquipmentQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EquipmentQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", "queryhelp")
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

        private val tupleHandler: Handler<List<EquipmentFull>> = jsonHandler<List<EquipmentFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EquipmentTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<EquipmentFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipment", "tuple")
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
