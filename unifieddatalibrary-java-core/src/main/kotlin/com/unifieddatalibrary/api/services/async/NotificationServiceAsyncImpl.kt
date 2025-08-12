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
import com.unifieddatalibrary.api.models.NotificationFull
import com.unifieddatalibrary.api.models.notification.NotificationCountParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateRawParams
import com.unifieddatalibrary.api.models.notification.NotificationGetParams
import com.unifieddatalibrary.api.models.notification.NotificationListPage
import com.unifieddatalibrary.api.models.notification.NotificationListPageAsync
import com.unifieddatalibrary.api.models.notification.NotificationListParams
import com.unifieddatalibrary.api.models.notification.NotificationListResponse
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpParams
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpResponse
import com.unifieddatalibrary.api.models.notification.NotificationTupleParams
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.NotificationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.notification.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.notification.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync = NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: NotificationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/notification
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun list(params: NotificationListParams, requestOptions: RequestOptions): CompletableFuture<NotificationListPageAsync> =
        // get /udl/notification
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: NotificationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/notification/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/notification/createRaw
        withRawResponse().createRaw(params, requestOptions).thenAccept {}

    override fun get(params: NotificationGetParams, requestOptions: RequestOptions): CompletableFuture<NotificationFull> =
        // get /udl/notification/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: NotificationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<NotificationQueryhelpResponse> =
        // get /udl/notification/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<NotificationFull>> =
        // get /udl/notification/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : NotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync.WithRawResponse = NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: NotificationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification")
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

        private val listHandler: Handler<List<NotificationListResponse>> = jsonHandler<List<NotificationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: NotificationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification")
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
                  NotificationListPageAsync.builder()
                      .service(NotificationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: NotificationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "count")
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

        private val createRawHandler: Handler<Void?> = emptyHandler()

        override fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "createRaw")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createRawHandler.handle(it)
              }
          } }
        }

        private val getHandler: Handler<NotificationFull> = jsonHandler<NotificationFull>(clientOptions.jsonMapper)

        override fun get(params: NotificationGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NotificationFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", params._pathParam(0))
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

        private val queryhelpHandler: Handler<NotificationQueryhelpResponse> = jsonHandler<NotificationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: NotificationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<NotificationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "queryhelp")
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

        private val tupleHandler: Handler<List<NotificationFull>> = jsonHandler<List<NotificationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<NotificationFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "tuple")
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
