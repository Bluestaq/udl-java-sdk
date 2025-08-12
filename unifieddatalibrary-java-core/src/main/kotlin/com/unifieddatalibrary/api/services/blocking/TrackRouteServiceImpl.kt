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
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCountParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateBulkParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteDeleteParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteGetParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListPage
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListResponse
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpResponse
import com.unifieddatalibrary.api.models.trackroute.TrackRouteTupleParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUpdateParams
import com.unifieddatalibrary.api.models.trackroute.history.TrackRouteFull
import com.unifieddatalibrary.api.services.blocking.TrackRouteService
import com.unifieddatalibrary.api.services.blocking.TrackRouteServiceImpl
import com.unifieddatalibrary.api.services.blocking.trackroute.HistoryService
import com.unifieddatalibrary.api.services.blocking.trackroute.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TrackRouteServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TrackRouteService {

    private val withRawResponse: TrackRouteService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): TrackRouteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackRouteService = TrackRouteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: TrackRouteCreateParams, requestOptions: RequestOptions) {
      // post /udl/trackroute
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: TrackRouteUpdateParams, requestOptions: RequestOptions) {
      // put /udl/trackroute/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: TrackRouteListParams, requestOptions: RequestOptions): TrackRouteListPage =
        // get /udl/trackroute
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TrackRouteDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/trackroute/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: TrackRouteCountParams, requestOptions: RequestOptions): String =
        // get /udl/trackroute/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: TrackRouteCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/trackroute/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: TrackRouteGetParams, requestOptions: RequestOptions): TrackRouteFull =
        // get /udl/trackroute/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: TrackRouteQueryhelpParams, requestOptions: RequestOptions): TrackRouteQueryhelpResponse =
        // get /udl/trackroute/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: TrackRouteTupleParams, requestOptions: RequestOptions): List<TrackRouteFull> =
        // get /udl/trackroute/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: TrackRouteUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-trackroute
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TrackRouteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackRouteService.WithRawResponse = TrackRouteServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: TrackRouteCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: TrackRouteUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", params._pathParam(0))
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
                  updateHandler.handle(it)
              }
          }
        }

        private val listHandler: Handler<List<TrackRouteListResponse>> = jsonHandler<List<TrackRouteListResponse>>(clientOptions.jsonMapper)

        override fun list(params: TrackRouteListParams, requestOptions: RequestOptions): HttpResponseFor<TrackRouteListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute")
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
                  TrackRouteListPage.builder()
                      .service(TrackRouteServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: TrackRouteDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: TrackRouteCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: TrackRouteCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", "createBulk")
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
                  createBulkHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<TrackRouteFull> = jsonHandler<TrackRouteFull>(clientOptions.jsonMapper)

        override fun get(params: TrackRouteGetParams, requestOptions: RequestOptions): HttpResponseFor<TrackRouteFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", params._pathParam(0))
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

        private val queryhelpHandler: Handler<TrackRouteQueryhelpResponse> = jsonHandler<TrackRouteQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: TrackRouteQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<TrackRouteQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", "queryhelp")
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

        private val tupleHandler: Handler<List<TrackRouteFull>> = jsonHandler<List<TrackRouteFull>>(clientOptions.jsonMapper)

        override fun tuple(params: TrackRouteTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<TrackRouteFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "trackroute", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: TrackRouteUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-trackroute")
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
                  unvalidatedPublishHandler.handle(it)
              }
          }
        }
    }
}
