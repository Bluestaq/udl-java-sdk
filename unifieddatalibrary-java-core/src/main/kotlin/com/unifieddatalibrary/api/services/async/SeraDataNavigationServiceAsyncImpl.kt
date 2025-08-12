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
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationDeleteParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListPage
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListPageAsync
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleResponse
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeraDataNavigationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeraDataNavigationServiceAsync {

    private val withRawResponse: SeraDataNavigationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeraDataNavigationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationServiceAsync = SeraDataNavigationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeraDataNavigationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/seradatanavigation
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/seradatanavigation/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SeraDataNavigationListParams, requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationListPageAsync> =
        // get /udl/seradatanavigation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SeraDataNavigationDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/seradatanavigation/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: SeraDataNavigationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/seradatanavigation/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: SeraDataNavigationGetParams, requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationGetResponse> =
        // get /udl/seradatanavigation/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SeraDataNavigationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SeraDataNavigationQueryhelpResponse> =
        // get /udl/seradatanavigation/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SeraDataNavigationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SeraDataNavigationTupleResponse>> =
        // get /udl/seradatanavigation/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeraDataNavigationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataNavigationServiceAsync.WithRawResponse = SeraDataNavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeraDataNavigationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation")
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

        override fun update(params: SeraDataNavigationUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
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

        private val listHandler: Handler<List<SeraDataNavigationListResponse>> = jsonHandler<List<SeraDataNavigationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeraDataNavigationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation")
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
                  SeraDataNavigationListPageAsync.builder()
                      .service(SeraDataNavigationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeraDataNavigationDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
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

        override fun count(params: SeraDataNavigationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", "count")
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

        private val getHandler: Handler<SeraDataNavigationGetResponse> = jsonHandler<SeraDataNavigationGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeraDataNavigationGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeraDataNavigationQueryhelpResponse> = jsonHandler<SeraDataNavigationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeraDataNavigationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SeraDataNavigationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", "queryhelp")
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

        private val tupleHandler: Handler<List<SeraDataNavigationTupleResponse>> = jsonHandler<List<SeraDataNavigationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeraDataNavigationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SeraDataNavigationTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatanavigation", "tuple")
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
