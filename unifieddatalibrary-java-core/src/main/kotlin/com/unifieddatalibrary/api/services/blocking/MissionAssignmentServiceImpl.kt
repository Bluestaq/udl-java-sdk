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
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCountParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateBulkParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentDeleteParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentGetParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentGetResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListPage
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentUpdateParams
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentService
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentServiceImpl
import com.unifieddatalibrary.api.services.blocking.missionassignment.HistoryService
import com.unifieddatalibrary.api.services.blocking.missionassignment.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MissionAssignmentServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : MissionAssignmentService {

    private val withRawResponse: MissionAssignmentService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): MissionAssignmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionAssignmentService = MissionAssignmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: MissionAssignmentCreateParams, requestOptions: RequestOptions) {
      // post /udl/missionassignment
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: MissionAssignmentUpdateParams, requestOptions: RequestOptions) {
      // put /udl/missionassignment/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: MissionAssignmentListParams, requestOptions: RequestOptions): MissionAssignmentListPage =
        // get /udl/missionassignment
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MissionAssignmentDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/missionassignment/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: MissionAssignmentCountParams, requestOptions: RequestOptions): String =
        // get /udl/missionassignment/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: MissionAssignmentCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/missionassignment/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: MissionAssignmentGetParams, requestOptions: RequestOptions): MissionAssignmentGetResponse =
        // get /udl/missionassignment/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: MissionAssignmentQueryhelpParams, requestOptions: RequestOptions): MissionAssignmentQueryhelpResponse =
        // get /udl/missionassignment/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: MissionAssignmentTupleParams, requestOptions: RequestOptions): List<MissionAssignmentTupleResponse> =
        // get /udl/missionassignment/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : MissionAssignmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionAssignmentService.WithRawResponse = MissionAssignmentServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: MissionAssignmentCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment")
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

        override fun update(params: MissionAssignmentUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", params._pathParam(0))
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

        private val listHandler: Handler<List<MissionAssignmentListResponse>> = jsonHandler<List<MissionAssignmentListResponse>>(clientOptions.jsonMapper)

        override fun list(params: MissionAssignmentListParams, requestOptions: RequestOptions): HttpResponseFor<MissionAssignmentListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment")
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
                  MissionAssignmentListPage.builder()
                      .service(MissionAssignmentServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: MissionAssignmentDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", params._pathParam(0))
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

        override fun count(params: MissionAssignmentCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", "count")
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

        override fun createBulk(params: MissionAssignmentCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", "createBulk")
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

        private val getHandler: Handler<MissionAssignmentGetResponse> = jsonHandler<MissionAssignmentGetResponse>(clientOptions.jsonMapper)

        override fun get(params: MissionAssignmentGetParams, requestOptions: RequestOptions): HttpResponseFor<MissionAssignmentGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", params._pathParam(0))
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

        private val queryhelpHandler: Handler<MissionAssignmentQueryhelpResponse> = jsonHandler<MissionAssignmentQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: MissionAssignmentQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<MissionAssignmentQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", "queryhelp")
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

        private val tupleHandler: Handler<List<MissionAssignmentTupleResponse>> = jsonHandler<List<MissionAssignmentTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: MissionAssignmentTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<MissionAssignmentTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missionassignment", "tuple")
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
