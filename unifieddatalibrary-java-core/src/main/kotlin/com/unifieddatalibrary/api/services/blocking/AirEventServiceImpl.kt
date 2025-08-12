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
import com.unifieddatalibrary.api.models.airevents.AirEventCountParams
import com.unifieddatalibrary.api.models.airevents.AirEventCreateBulkParams
import com.unifieddatalibrary.api.models.airevents.AirEventCreateParams
import com.unifieddatalibrary.api.models.airevents.AirEventDeleteParams
import com.unifieddatalibrary.api.models.airevents.AirEventGetParams
import com.unifieddatalibrary.api.models.airevents.AirEventGetResponse
import com.unifieddatalibrary.api.models.airevents.AirEventListPage
import com.unifieddatalibrary.api.models.airevents.AirEventListParams
import com.unifieddatalibrary.api.models.airevents.AirEventListResponse
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpParams
import com.unifieddatalibrary.api.models.airevents.AirEventQueryhelpResponse
import com.unifieddatalibrary.api.models.airevents.AirEventTupleParams
import com.unifieddatalibrary.api.models.airevents.AirEventTupleResponse
import com.unifieddatalibrary.api.models.airevents.AirEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.airevents.AirEventUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirEventService
import com.unifieddatalibrary.api.services.blocking.AirEventServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirEventServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirEventService {

    private val withRawResponse: AirEventService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AirEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventService = AirEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirEventCreateParams, requestOptions: RequestOptions) {
      // post /udl/airevent
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: AirEventUpdateParams, requestOptions: RequestOptions) {
      // put /udl/airevent/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AirEventListParams, requestOptions: RequestOptions): AirEventListPage =
        // get /udl/airevent
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/airevent/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AirEventCountParams, requestOptions: RequestOptions): String =
        // get /udl/airevent/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/airevent/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: AirEventGetParams, requestOptions: RequestOptions): AirEventGetResponse =
        // get /udl/airevent/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: AirEventQueryhelpParams, requestOptions: RequestOptions): AirEventQueryhelpResponse =
        // get /udl/airevent/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions): List<AirEventTupleResponse> =
        // get /udl/airevent/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-airevent
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirEventService.WithRawResponse = AirEventServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirEventCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent")
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

        override fun update(params: AirEventUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", params._pathParam(0))
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

        private val listHandler: Handler<List<AirEventListResponse>> = jsonHandler<List<AirEventListResponse>>(clientOptions.jsonMapper)

        override fun list(params: AirEventListParams, requestOptions: RequestOptions): HttpResponseFor<AirEventListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent")
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
                  AirEventListPage.builder()
                      .service(AirEventServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AirEventDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", params._pathParam(0))
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

        override fun count(params: AirEventCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", "count")
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

        override fun createBulk(params: AirEventCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", "createBulk")
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

        private val getHandler: Handler<AirEventGetResponse> = jsonHandler<AirEventGetResponse>(clientOptions.jsonMapper)

        override fun get(params: AirEventGetParams, requestOptions: RequestOptions): HttpResponseFor<AirEventGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", params._pathParam(0))
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

        private val queryhelpHandler: Handler<AirEventQueryhelpResponse> = jsonHandler<AirEventQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AirEventQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<AirEventQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", "queryhelp")
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

        private val tupleHandler: Handler<List<AirEventTupleResponse>> = jsonHandler<List<AirEventTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: AirEventTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AirEventTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airevent", "tuple")
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

        override fun unvalidatedPublish(params: AirEventUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-airevent")
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
