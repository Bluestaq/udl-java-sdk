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
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCountParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCreateParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningDeleteParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListPage
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningListResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleResponse
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeraDataEarlyWarningServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeraDataEarlyWarningService {

    private val withRawResponse: SeraDataEarlyWarningService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeraDataEarlyWarningService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningService = SeraDataEarlyWarningServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions) {
      // post /udl/seradataearlywarning
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions) {
      // put /udl/seradataearlywarning/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SeraDataEarlyWarningListParams, requestOptions: RequestOptions): SeraDataEarlyWarningListPage =
        // get /udl/seradataearlywarning
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/seradataearlywarning/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SeraDataEarlyWarningCountParams, requestOptions: RequestOptions): String =
        // get /udl/seradataearlywarning/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions): SeraDataEarlyWarningGetResponse =
        // get /udl/seradataearlywarning/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams, requestOptions: RequestOptions): SeraDataEarlyWarningQueryhelpResponse =
        // get /udl/seradataearlywarning/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions): List<SeraDataEarlyWarningTupleResponse> =
        // get /udl/seradataearlywarning/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeraDataEarlyWarningService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataEarlyWarningService.WithRawResponse = SeraDataEarlyWarningServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeraDataEarlyWarningCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning")
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

        override fun update(params: SeraDataEarlyWarningUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", params._pathParam(0))
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

        private val listHandler: Handler<List<SeraDataEarlyWarningListResponse>> = jsonHandler<List<SeraDataEarlyWarningListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeraDataEarlyWarningListParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning")
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
                  SeraDataEarlyWarningListPage.builder()
                      .service(SeraDataEarlyWarningServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeraDataEarlyWarningDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", params._pathParam(0))
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

        override fun count(params: SeraDataEarlyWarningCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", "count")
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

        private val getHandler: Handler<SeraDataEarlyWarningGetResponse> = jsonHandler<SeraDataEarlyWarningGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeraDataEarlyWarningGetParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeraDataEarlyWarningQueryhelpResponse> = jsonHandler<SeraDataEarlyWarningQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeraDataEarlyWarningQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataEarlyWarningQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", "queryhelp")
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

        private val tupleHandler: Handler<List<SeraDataEarlyWarningTupleResponse>> = jsonHandler<List<SeraDataEarlyWarningTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeraDataEarlyWarningTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SeraDataEarlyWarningTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataearlywarning", "tuple")
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
