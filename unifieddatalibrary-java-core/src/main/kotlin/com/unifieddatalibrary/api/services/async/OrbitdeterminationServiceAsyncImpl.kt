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
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCountParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateBulkParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListPage
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListPageAsync
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.orbitdetermination.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.orbitdetermination.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrbitdeterminationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OrbitdeterminationServiceAsync {

    private val withRawResponse: OrbitdeterminationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrbitdeterminationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbitdeterminationServiceAsync = OrbitdeterminationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: OrbitdeterminationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/orbitdetermination
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: OrbitdeterminationListParams, requestOptions: RequestOptions): CompletableFuture<OrbitdeterminationListPageAsync> =
        // get /udl/orbitdetermination
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: OrbitdeterminationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/orbitdetermination/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: OrbitdeterminationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/orbitdetermination/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: OrbitdeterminationGetParams, requestOptions: RequestOptions): CompletableFuture<OrbitdeterminationGetResponse> =
        // get /udl/orbitdetermination/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OrbitdeterminationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OrbitdeterminationQueryhelpResponse> =
        // get /udl/orbitdetermination/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OrbitdeterminationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OrbitdeterminationTupleResponse>> =
        // get /udl/orbitdetermination/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: OrbitdeterminationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-orbitdetermination
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OrbitdeterminationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbitdeterminationServiceAsync.WithRawResponse = OrbitdeterminationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OrbitdeterminationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination")
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

        private val listHandler: Handler<List<OrbitdeterminationListResponse>> = jsonHandler<List<OrbitdeterminationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OrbitdeterminationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbitdeterminationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination")
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
                  OrbitdeterminationListPageAsync.builder()
                      .service(OrbitdeterminationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OrbitdeterminationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination", "count")
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

        override fun createBulk(params: OrbitdeterminationCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination", "createBulk")
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

        private val getHandler: Handler<OrbitdeterminationGetResponse> = jsonHandler<OrbitdeterminationGetResponse>(clientOptions.jsonMapper)

        override fun get(params: OrbitdeterminationGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination", params._pathParam(0))
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

        private val queryhelpHandler: Handler<OrbitdeterminationQueryhelpResponse> = jsonHandler<OrbitdeterminationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OrbitdeterminationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrbitdeterminationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination", "queryhelp")
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

        private val tupleHandler: Handler<List<OrbitdeterminationTupleResponse>> = jsonHandler<List<OrbitdeterminationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: OrbitdeterminationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OrbitdeterminationTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "orbitdetermination", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: OrbitdeterminationUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-orbitdetermination")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  unvalidatedPublishHandler.handle(it)
              }
          } }
        }
    }
}
