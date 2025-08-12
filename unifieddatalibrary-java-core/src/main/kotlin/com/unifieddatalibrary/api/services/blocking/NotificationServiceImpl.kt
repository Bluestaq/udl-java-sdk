// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.NotificationFull
import com.unifieddatalibrary.api.models.notification.NotificationCountParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateRawParams
import com.unifieddatalibrary.api.models.notification.NotificationGetParams
import com.unifieddatalibrary.api.models.notification.NotificationListPage
import com.unifieddatalibrary.api.models.notification.NotificationListParams
import com.unifieddatalibrary.api.models.notification.NotificationListResponse
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpParams
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpResponse
import com.unifieddatalibrary.api.models.notification.NotificationTupleParams
import com.unifieddatalibrary.api.services.blocking.NotificationService
import com.unifieddatalibrary.api.services.blocking.NotificationServiceImpl
import com.unifieddatalibrary.api.services.blocking.notification.HistoryService
import com.unifieddatalibrary.api.services.blocking.notification.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService = NotificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: NotificationCreateParams, requestOptions: RequestOptions) {
      // post /udl/notification
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: NotificationListParams, requestOptions: RequestOptions): NotificationListPage =
        // get /udl/notification
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: NotificationCountParams, requestOptions: RequestOptions): String =
        // get /udl/notification/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions) {
      // post /udl/notification/createRaw
      withRawResponse().createRaw(params, requestOptions)
    }

    override fun get(params: NotificationGetParams, requestOptions: RequestOptions): NotificationFull =
        // get /udl/notification/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: NotificationQueryhelpParams, requestOptions: RequestOptions): NotificationQueryhelpResponse =
        // get /udl/notification/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions): List<NotificationFull> =
        // get /udl/notification/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : NotificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService.WithRawResponse = NotificationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: NotificationCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          }
        }

        private val listHandler: Handler<List<NotificationListResponse>> = jsonHandler<List<NotificationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: NotificationListParams, requestOptions: RequestOptions): HttpResponseFor<NotificationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  NotificationListPage.builder()
                      .service(NotificationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: NotificationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "count")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          }
        }

        private val createRawHandler: Handler<Void?> = emptyHandler()

        override fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "createRaw")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  createRawHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<NotificationFull> = jsonHandler<NotificationFull>(clientOptions.jsonMapper)

        override fun get(params: NotificationGetParams, requestOptions: RequestOptions): HttpResponseFor<NotificationFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val queryhelpHandler: Handler<NotificationQueryhelpResponse> = jsonHandler<NotificationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: NotificationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<NotificationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "queryhelp")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val tupleHandler: Handler<List<NotificationFull>> = jsonHandler<List<NotificationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<NotificationFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "notification", "tuple")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }
    }
}
