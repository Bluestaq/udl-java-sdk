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
import com.unifieddatalibrary.api.models.sgi.SgiCountParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateBulkParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateParams
import com.unifieddatalibrary.api.models.sgi.SgiDeleteParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateResponse
import com.unifieddatalibrary.api.models.sgi.SgiGetParams
import com.unifieddatalibrary.api.models.sgi.SgiGetResponse
import com.unifieddatalibrary.api.models.sgi.SgiListPage
import com.unifieddatalibrary.api.models.sgi.SgiListPageAsync
import com.unifieddatalibrary.api.models.sgi.SgiListParams
import com.unifieddatalibrary.api.models.sgi.SgiListResponse
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpResponse
import com.unifieddatalibrary.api.models.sgi.SgiTupleParams
import com.unifieddatalibrary.api.models.sgi.SgiTupleResponse
import com.unifieddatalibrary.api.models.sgi.SgiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sgi.SgiUpdateParams
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import com.unifieddatalibrary.api.services.async.SgiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.sgi.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.sgi.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SgiServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SgiServiceAsync {

    private val withRawResponse: SgiServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SgiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiServiceAsync = SgiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: SgiCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sgi
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: SgiUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/sgi/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: SgiListParams, requestOptions: RequestOptions): CompletableFuture<SgiListPageAsync> =
        // get /udl/sgi
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: SgiDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/sgi/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: SgiCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/sgi/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/sgi/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun get(params: SgiGetParams, requestOptions: RequestOptions): CompletableFuture<SgiGetResponse> =
        // get /udl/sgi/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams, requestOptions: RequestOptions): CompletableFuture<SgiGetDataByEffectiveAsOfDateResponse> =
        // get /udl/sgi/getSGIDataByEffectiveAsOfDate
        withRawResponse().getDataByEffectiveAsOfDate(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: SgiQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<SgiQueryhelpResponse> =
        // get /udl/sgi/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: SgiTupleParams, requestOptions: RequestOptions): CompletableFuture<List<SgiTupleResponse>> =
        // get /udl/sgi/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-sgi
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SgiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiServiceAsync.WithRawResponse = SgiServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SgiCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi")
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

        override fun update(params: SgiUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        private val listHandler: Handler<List<SgiListResponse>> = jsonHandler<List<SgiListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SgiListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SgiListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi")
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
                  SgiListPageAsync.builder()
                      .service(SgiServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SgiDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        override fun count(params: SgiCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "count")
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

        override fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "createBulk")
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

        private val getHandler: Handler<SgiGetResponse> = jsonHandler<SgiGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SgiGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SgiGetResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        private val getDataByEffectiveAsOfDateHandler: Handler<SgiGetDataByEffectiveAsOfDateResponse> = jsonHandler<SgiGetDataByEffectiveAsOfDateResponse>(clientOptions.jsonMapper)

        override fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "getSGIDataByEffectiveAsOfDate")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getDataByEffectiveAsOfDateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val queryhelpHandler: Handler<SgiQueryhelpResponse> = jsonHandler<SgiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SgiQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SgiQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "queryhelp")
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

        private val tupleHandler: Handler<List<SgiTupleResponse>> = jsonHandler<List<SgiTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SgiTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<SgiTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "tuple")
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

        override fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-sgi")
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
