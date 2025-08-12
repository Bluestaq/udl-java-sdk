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
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCountParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadDeleteParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListPage
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadListResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleResponse
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataOpticalPayloadServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeradataOpticalPayloadService {

    private val withRawResponse: SeradataOpticalPayloadService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeradataOpticalPayloadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadService = SeradataOpticalPayloadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeradataOpticalPayloadCreateParams, requestOptions: RequestOptions) {
      // post /udl/seradataopticalpayload
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeradataOpticalPayloadUpdateParams, requestOptions: RequestOptions) {
      // put /udl/seradataopticalpayload/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SeradataOpticalPayloadListParams, requestOptions: RequestOptions): SeradataOpticalPayloadListPage =
        // get /udl/seradataopticalpayload
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeradataOpticalPayloadDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/seradataopticalpayload/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SeradataOpticalPayloadCountParams, requestOptions: RequestOptions): String =
        // get /udl/seradataopticalpayload/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SeradataOpticalPayloadGetParams, requestOptions: RequestOptions): SeradataOpticalPayloadGetResponse =
        // get /udl/seradataopticalpayload/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SeradataOpticalPayloadQueryhelpParams, requestOptions: RequestOptions): SeradataOpticalPayloadQueryhelpResponse =
        // get /udl/seradataopticalpayload/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SeradataOpticalPayloadTupleParams, requestOptions: RequestOptions): List<SeradataOpticalPayloadTupleResponse> =
        // get /udl/seradataopticalpayload/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeradataOpticalPayloadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataOpticalPayloadService.WithRawResponse = SeradataOpticalPayloadServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeradataOpticalPayloadCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload")
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

        override fun update(params: SeradataOpticalPayloadUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
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

        private val listHandler: Handler<List<SeradataOpticalPayloadListResponse>> = jsonHandler<List<SeradataOpticalPayloadListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeradataOpticalPayloadListParams, requestOptions: RequestOptions): HttpResponseFor<SeradataOpticalPayloadListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload")
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
                  SeradataOpticalPayloadListPage.builder()
                      .service(SeradataOpticalPayloadServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeradataOpticalPayloadDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
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

        override fun count(params: SeradataOpticalPayloadCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "count")
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

        private val getHandler: Handler<SeradataOpticalPayloadGetResponse> = jsonHandler<SeradataOpticalPayloadGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeradataOpticalPayloadGetParams, requestOptions: RequestOptions): HttpResponseFor<SeradataOpticalPayloadGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeradataOpticalPayloadQueryhelpResponse> = jsonHandler<SeradataOpticalPayloadQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeradataOpticalPayloadQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SeradataOpticalPayloadQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "queryhelp")
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

        private val tupleHandler: Handler<List<SeradataOpticalPayloadTupleResponse>> = jsonHandler<List<SeradataOpticalPayloadTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeradataOpticalPayloadTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SeradataOpticalPayloadTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataopticalpayload", "tuple")
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
