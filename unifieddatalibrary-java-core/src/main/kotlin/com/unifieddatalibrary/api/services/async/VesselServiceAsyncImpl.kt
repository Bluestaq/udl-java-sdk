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
import com.unifieddatalibrary.api.models.vessel.VesselCountParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateBulkParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateParams
import com.unifieddatalibrary.api.models.vessel.VesselGetParams
import com.unifieddatalibrary.api.models.vessel.VesselGetResponse
import com.unifieddatalibrary.api.models.vessel.VesselListPage
import com.unifieddatalibrary.api.models.vessel.VesselListPageAsync
import com.unifieddatalibrary.api.models.vessel.VesselListParams
import com.unifieddatalibrary.api.models.vessel.VesselListResponse
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpParams
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpResponse
import com.unifieddatalibrary.api.models.vessel.VesselTupleParams
import com.unifieddatalibrary.api.models.vessel.VesselTupleResponse
import com.unifieddatalibrary.api.models.vessel.VesselUpdateParams
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import com.unifieddatalibrary.api.services.async.VesselServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VesselServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : VesselServiceAsync {

    private val withRawResponse: VesselServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): VesselServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VesselServiceAsync = VesselServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: VesselCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/vessel
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: VesselUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/vessel/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: VesselListParams, requestOptions: RequestOptions): CompletableFuture<VesselListPageAsync> =
        // get /udl/vessel
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: VesselCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/vessel/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: VesselCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/vessel/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: VesselGetParams, requestOptions: RequestOptions): CompletableFuture<VesselGetResponse> =
        // get /udl/vessel/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: VesselQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<VesselQueryhelpResponse> =
        // get /udl/vessel/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: VesselTupleParams, requestOptions: RequestOptions): CompletableFuture<List<VesselTupleResponse>> =
        // get /udl/vessel/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : VesselServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VesselServiceAsync.WithRawResponse = VesselServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: VesselCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel")
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

        override fun update(params: VesselUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", params._pathParam(0))
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

        private val listHandler: Handler<List<VesselListResponse>> = jsonHandler<List<VesselListResponse>>(clientOptions.jsonMapper)

        override fun list(params: VesselListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<VesselListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel")
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
                  VesselListPageAsync.builder()
                      .service(VesselServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: VesselCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", "count")
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

        override fun createBulk(params: VesselCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", "createBulk")
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

        private val getHandler: Handler<VesselGetResponse> = jsonHandler<VesselGetResponse>(clientOptions.jsonMapper)

        override fun get(params: VesselGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<VesselGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", params._pathParam(0))
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

        private val queryhelpHandler: Handler<VesselQueryhelpResponse> = jsonHandler<VesselQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: VesselQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<VesselQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", "queryhelp")
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

        private val tupleHandler: Handler<List<VesselTupleResponse>> = jsonHandler<List<VesselTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: VesselTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<VesselTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "vessel", "tuple")
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
