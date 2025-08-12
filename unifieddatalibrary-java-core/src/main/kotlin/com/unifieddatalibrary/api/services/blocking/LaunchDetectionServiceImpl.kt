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
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCountParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCreateParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionDeleteParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListPage
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionUpdateParams
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionService
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LaunchDetectionServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LaunchDetectionService {

    private val withRawResponse: LaunchDetectionService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): LaunchDetectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchDetectionService = LaunchDetectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LaunchDetectionCreateParams, requestOptions: RequestOptions) {
      // post /udl/launchdetection
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LaunchDetectionUpdateParams, requestOptions: RequestOptions) {
      // put /udl/launchdetection/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: LaunchDetectionListParams, requestOptions: RequestOptions): LaunchDetectionListPage =
        // get /udl/launchdetection
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LaunchDetectionDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/launchdetection/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: LaunchDetectionCountParams, requestOptions: RequestOptions): String =
        // get /udl/launchdetection/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: LaunchDetectionGetParams, requestOptions: RequestOptions): LaunchDetectionGetResponse =
        // get /udl/launchdetection/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: LaunchDetectionQueryhelpParams, requestOptions: RequestOptions): LaunchDetectionQueryhelpResponse =
        // get /udl/launchdetection/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: LaunchDetectionTupleParams, requestOptions: RequestOptions): List<LaunchDetectionTupleResponse> =
        // get /udl/launchdetection/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LaunchDetectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchDetectionService.WithRawResponse = LaunchDetectionServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: LaunchDetectionCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection")
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

        override fun update(params: LaunchDetectionUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", params._pathParam(0))
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

        private val listHandler: Handler<List<LaunchDetectionListResponse>> = jsonHandler<List<LaunchDetectionListResponse>>(clientOptions.jsonMapper)

        override fun list(params: LaunchDetectionListParams, requestOptions: RequestOptions): HttpResponseFor<LaunchDetectionListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection")
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
                  LaunchDetectionListPage.builder()
                      .service(LaunchDetectionServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: LaunchDetectionDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", params._pathParam(0))
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

        override fun count(params: LaunchDetectionCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", "count")
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

        private val getHandler: Handler<LaunchDetectionGetResponse> = jsonHandler<LaunchDetectionGetResponse>(clientOptions.jsonMapper)

        override fun get(params: LaunchDetectionGetParams, requestOptions: RequestOptions): HttpResponseFor<LaunchDetectionGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", params._pathParam(0))
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

        private val queryhelpHandler: Handler<LaunchDetectionQueryhelpResponse> = jsonHandler<LaunchDetectionQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: LaunchDetectionQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<LaunchDetectionQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", "queryhelp")
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

        private val tupleHandler: Handler<List<LaunchDetectionTupleResponse>> = jsonHandler<List<LaunchDetectionTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: LaunchDetectionTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<LaunchDetectionTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "launchdetection", "tuple")
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
