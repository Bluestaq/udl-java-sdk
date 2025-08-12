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
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCountParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCreateParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailDeleteParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListPage
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailListResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleResponse
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailUpdateParams
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailService
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SeradataSpacecraftDetailServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SeradataSpacecraftDetailService {

    private val withRawResponse: SeradataSpacecraftDetailService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SeradataSpacecraftDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSpacecraftDetailService = SeradataSpacecraftDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SeradataSpacecraftDetailCreateParams, requestOptions: RequestOptions) {
      // post /udl/seradataspacecraftdetails
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SeradataSpacecraftDetailUpdateParams, requestOptions: RequestOptions) {
      // put /udl/seradataspacecraftdetails/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SeradataSpacecraftDetailListParams, requestOptions: RequestOptions): SeradataSpacecraftDetailListPage =
        // get /udl/seradataspacecraftdetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SeradataSpacecraftDetailDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/seradataspacecraftdetails/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SeradataSpacecraftDetailCountParams, requestOptions: RequestOptions): String =
        // get /udl/seradataspacecraftdetails/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SeradataSpacecraftDetailGetParams, requestOptions: RequestOptions): SeradataSpacecraftDetailGetResponse =
        // get /udl/seradataspacecraftdetails/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SeradataSpacecraftDetailQueryhelpParams, requestOptions: RequestOptions): SeradataSpacecraftDetailQueryhelpResponse =
        // get /udl/seradataspacecraftdetails/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SeradataSpacecraftDetailTupleParams, requestOptions: RequestOptions): List<SeradataSpacecraftDetailTupleResponse> =
        // get /udl/seradataspacecraftdetails/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SeradataSpacecraftDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SeradataSpacecraftDetailService.WithRawResponse = SeradataSpacecraftDetailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SeradataSpacecraftDetailCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails")
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

        override fun update(params: SeradataSpacecraftDetailUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", params._pathParam(0))
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

        private val listHandler: Handler<List<SeradataSpacecraftDetailListResponse>> = jsonHandler<List<SeradataSpacecraftDetailListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SeradataSpacecraftDetailListParams, requestOptions: RequestOptions): HttpResponseFor<SeradataSpacecraftDetailListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails")
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
                  SeradataSpacecraftDetailListPage.builder()
                      .service(SeradataSpacecraftDetailServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SeradataSpacecraftDetailDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", params._pathParam(0))
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

        override fun count(params: SeradataSpacecraftDetailCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", "count")
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

        private val getHandler: Handler<SeradataSpacecraftDetailGetResponse> = jsonHandler<SeradataSpacecraftDetailGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SeradataSpacecraftDetailGetParams, requestOptions: RequestOptions): HttpResponseFor<SeradataSpacecraftDetailGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SeradataSpacecraftDetailQueryhelpResponse> = jsonHandler<SeradataSpacecraftDetailQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SeradataSpacecraftDetailQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SeradataSpacecraftDetailQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", "queryhelp")
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

        private val tupleHandler: Handler<List<SeradataSpacecraftDetailTupleResponse>> = jsonHandler<List<SeradataSpacecraftDetailTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SeradataSpacecraftDetailTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SeradataSpacecraftDetailTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "seradataspacecraftdetails", "tuple")
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
