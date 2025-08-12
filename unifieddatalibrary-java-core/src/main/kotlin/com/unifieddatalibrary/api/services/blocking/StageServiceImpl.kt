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
import com.unifieddatalibrary.api.models.stage.StageCountParams
import com.unifieddatalibrary.api.models.stage.StageCreateParams
import com.unifieddatalibrary.api.models.stage.StageDeleteParams
import com.unifieddatalibrary.api.models.stage.StageGetParams
import com.unifieddatalibrary.api.models.stage.StageGetResponse
import com.unifieddatalibrary.api.models.stage.StageListPage
import com.unifieddatalibrary.api.models.stage.StageListParams
import com.unifieddatalibrary.api.models.stage.StageListResponse
import com.unifieddatalibrary.api.models.stage.StageQueryhelpParams
import com.unifieddatalibrary.api.models.stage.StageQueryhelpResponse
import com.unifieddatalibrary.api.models.stage.StageTupleParams
import com.unifieddatalibrary.api.models.stage.StageTupleResponse
import com.unifieddatalibrary.api.models.stage.StageUpdateParams
import com.unifieddatalibrary.api.services.blocking.StageService
import com.unifieddatalibrary.api.services.blocking.StageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StageServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : StageService {

    private val withRawResponse: StageService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): StageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService = StageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: StageCreateParams, requestOptions: RequestOptions) {
      // post /udl/stage
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: StageUpdateParams, requestOptions: RequestOptions) {
      // put /udl/stage/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: StageListParams, requestOptions: RequestOptions): StageListPage =
        // get /udl/stage
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: StageDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/stage/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: StageCountParams, requestOptions: RequestOptions): String =
        // get /udl/stage/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: StageGetParams, requestOptions: RequestOptions): StageGetResponse =
        // get /udl/stage/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: StageQueryhelpParams, requestOptions: RequestOptions): StageQueryhelpResponse =
        // get /udl/stage/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: StageTupleParams, requestOptions: RequestOptions): List<StageTupleResponse> =
        // get /udl/stage/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : StageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService.WithRawResponse = StageServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: StageCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage")
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

        override fun update(params: StageUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", params._pathParam(0))
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

        private val listHandler: Handler<List<StageListResponse>> = jsonHandler<List<StageListResponse>>(clientOptions.jsonMapper)

        override fun list(params: StageListParams, requestOptions: RequestOptions): HttpResponseFor<StageListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage")
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
                  StageListPage.builder()
                      .service(StageServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: StageDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", params._pathParam(0))
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

        override fun count(params: StageCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", "count")
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

        private val getHandler: Handler<StageGetResponse> = jsonHandler<StageGetResponse>(clientOptions.jsonMapper)

        override fun get(params: StageGetParams, requestOptions: RequestOptions): HttpResponseFor<StageGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", params._pathParam(0))
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

        private val queryhelpHandler: Handler<StageQueryhelpResponse> = jsonHandler<StageQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: StageQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<StageQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", "queryhelp")
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

        private val tupleHandler: Handler<List<StageTupleResponse>> = jsonHandler<List<StageTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: StageTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<StageTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "stage", "tuple")
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
