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
import com.unifieddatalibrary.api.models.EopFull
import com.unifieddatalibrary.api.models.eop.EopAbridged
import com.unifieddatalibrary.api.models.eop.EopCountParams
import com.unifieddatalibrary.api.models.eop.EopCreateParams
import com.unifieddatalibrary.api.models.eop.EopDeleteParams
import com.unifieddatalibrary.api.models.eop.EopListPage
import com.unifieddatalibrary.api.models.eop.EopListParams
import com.unifieddatalibrary.api.models.eop.EopListTupleParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpParams
import com.unifieddatalibrary.api.models.eop.EopQueryhelpResponse
import com.unifieddatalibrary.api.models.eop.EopRetrieveParams
import com.unifieddatalibrary.api.models.eop.EopUpdateParams
import com.unifieddatalibrary.api.services.blocking.EopService
import com.unifieddatalibrary.api.services.blocking.EopServiceImpl
import com.unifieddatalibrary.api.services.blocking.eop.HistoryService
import com.unifieddatalibrary.api.services.blocking.eop.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EopServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EopService {

    private val withRawResponse: EopService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): EopService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EopService = EopServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: EopCreateParams, requestOptions: RequestOptions) {
      // post /udl/eop
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EopRetrieveParams, requestOptions: RequestOptions): EopFull =
        // get /udl/eop/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: EopUpdateParams, requestOptions: RequestOptions) {
      // put /udl/eop/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: EopListParams, requestOptions: RequestOptions): EopListPage =
        // get /udl/eop
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EopDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/eop/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: EopCountParams, requestOptions: RequestOptions): String =
        // get /udl/eop/count
        withRawResponse().count(params, requestOptions).parse()

    override fun listTuple(params: EopListTupleParams, requestOptions: RequestOptions): List<EopFull> =
        // get /udl/eop/tuple
        withRawResponse().listTuple(params, requestOptions).parse()

    override fun queryhelp(params: EopQueryhelpParams, requestOptions: RequestOptions): EopQueryhelpResponse =
        // get /udl/eop/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EopService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EopService.WithRawResponse = EopServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EopCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop")
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

        private val retrieveHandler: Handler<EopFull> = jsonHandler<EopFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EopRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<EopFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: EopUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", params._pathParam(0))
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

        private val listHandler: Handler<List<EopAbridged>> = jsonHandler<List<EopAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EopListParams, requestOptions: RequestOptions): HttpResponseFor<EopListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop")
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
                  EopListPage.builder()
                      .service(EopServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EopDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", params._pathParam(0))
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

        override fun count(params: EopCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", "count")
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

        private val listTupleHandler: Handler<List<EopFull>> = jsonHandler<List<EopFull>>(clientOptions.jsonMapper)

        override fun listTuple(params: EopListTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<EopFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", "tuple")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listTupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }

        private val queryhelpHandler: Handler<EopQueryhelpResponse> = jsonHandler<EopQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: EopQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<EopQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "eop", "queryhelp")
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
    }
}
