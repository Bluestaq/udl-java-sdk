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
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCountParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCreateParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailDeleteParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListPage
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleResponse
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailService
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeraDataCommDetailServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeraDataCommDetailService {

    private val withRawResponse: SeraDataCommDetailService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeraDataCommDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataCommDetailService = SeraDataCommDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeraDataCommDetailCreateParams, requestOptions: RequestOptions) {
      // post /udl/seradatacommdetails
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeraDataCommDetailUpdateParams, requestOptions: RequestOptions) {
      // put /udl/seradatacommdetails/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SeraDataCommDetailListParams, requestOptions: RequestOptions): SeraDataCommDetailListPage =
        // get /udl/seradatacommdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeraDataCommDetailDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/seradatacommdetails/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SeraDataCommDetailCountParams, requestOptions: RequestOptions): String =
        // get /udl/seradatacommdetails/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SeraDataCommDetailGetParams, requestOptions: RequestOptions): SeraDataCommDetailGetResponse =
        // get /udl/seradatacommdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SeraDataCommDetailQueryhelpParams, requestOptions: RequestOptions): SeraDataCommDetailQueryhelpResponse =
        // get /udl/seradatacommdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SeraDataCommDetailTupleParams, requestOptions: RequestOptions): List<SeraDataCommDetailTupleResponse> =
        // get /udl/seradatacommdetails/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeraDataCommDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeraDataCommDetailService.WithRawResponse = SeraDataCommDetailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeraDataCommDetailCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails")
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

        override fun update(params: SeraDataCommDetailUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        private val listHandler: Handler<List<SeraDataCommDetailListResponse>> = jsonHandler<List<SeraDataCommDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeraDataCommDetailListParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataCommDetailListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails")
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
                  SeraDataCommDetailListPage.builder()
                      .service(SeraDataCommDetailServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeraDataCommDetailDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        override fun count(params: SeraDataCommDetailCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", "count")
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

        private val getHandler: Handler<SeraDataCommDetailGetResponse> = jsonHandler<SeraDataCommDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeraDataCommDetailGetParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataCommDetailGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeraDataCommDetailQueryhelpResponse> = jsonHandler<SeraDataCommDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeraDataCommDetailQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SeraDataCommDetailQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", "queryhelp")
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

        private val tupleHandler: Handler<List<SeraDataCommDetailTupleResponse>> = jsonHandler<List<SeraDataCommDetailTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeraDataCommDetailTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SeraDataCommDetailTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradatacommdetails", "tuple")
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
