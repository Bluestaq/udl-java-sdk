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
import com.unifieddatalibrary.api.models.sgi.SgiCountParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateBulkParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateParams
import com.unifieddatalibrary.api.models.sgi.SgiDeleteParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateResponse
import com.unifieddatalibrary.api.models.sgi.SgiGetParams
import com.unifieddatalibrary.api.models.sgi.SgiGetResponse
import com.unifieddatalibrary.api.models.sgi.SgiListPage
import com.unifieddatalibrary.api.models.sgi.SgiListParams
import com.unifieddatalibrary.api.models.sgi.SgiListResponse
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpParams
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpResponse
import com.unifieddatalibrary.api.models.sgi.SgiTupleParams
import com.unifieddatalibrary.api.models.sgi.SgiTupleResponse
import com.unifieddatalibrary.api.models.sgi.SgiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sgi.SgiUpdateParams
import com.unifieddatalibrary.api.services.blocking.SgiService
import com.unifieddatalibrary.api.services.blocking.SgiServiceImpl
import com.unifieddatalibrary.api.services.blocking.sgi.HistoryService
import com.unifieddatalibrary.api.services.blocking.sgi.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SgiServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SgiService {

    private val withRawResponse: SgiService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SgiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiService = SgiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SgiCreateParams, requestOptions: RequestOptions) {
      // post /udl/sgi
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SgiUpdateParams, requestOptions: RequestOptions) {
      // put /udl/sgi/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SgiListParams, requestOptions: RequestOptions): SgiListPage =
        // get /udl/sgi
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SgiDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/sgi/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: SgiCountParams, requestOptions: RequestOptions): String =
        // get /udl/sgi/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/sgi/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(params: SgiGetParams, requestOptions: RequestOptions): SgiGetResponse =
        // get /udl/sgi/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams, requestOptions: RequestOptions): SgiGetDataByEffectiveAsOfDateResponse =
        // get /udl/sgi/getSGIDataByEffectiveAsOfDate
        withRawResponse().getDataByEffectiveAsOfDate(params, requestOptions).parse()

    override fun queryhelp(params: SgiQueryhelpParams, requestOptions: RequestOptions): SgiQueryhelpResponse =
        // get /udl/sgi/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SgiTupleParams, requestOptions: RequestOptions): List<SgiTupleResponse> =
        // get /udl/sgi/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-sgi
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SgiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SgiService.WithRawResponse = SgiServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SgiCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi")
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

        override fun update(params: SgiUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        private val listHandler: Handler<List<SgiListResponse>> = jsonHandler<List<SgiListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SgiListParams, requestOptions: RequestOptions): HttpResponseFor<SgiListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi")
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
                  SgiListPage.builder()
                      .service(SgiServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: SgiDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        override fun count(params: SgiCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "count")
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

        override fun createBulk(params: SgiCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "createBulk")
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

        private val getHandler: Handler<SgiGetResponse> = jsonHandler<SgiGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SgiGetParams, requestOptions: RequestOptions): HttpResponseFor<SgiGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", params._pathParam(0))
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

        private val getDataByEffectiveAsOfDateHandler: Handler<SgiGetDataByEffectiveAsOfDateResponse> = jsonHandler<SgiGetDataByEffectiveAsOfDateResponse>(clientOptions.jsonMapper)

        override fun getDataByEffectiveAsOfDate(params: SgiGetDataByEffectiveAsOfDateParams, requestOptions: RequestOptions): HttpResponseFor<SgiGetDataByEffectiveAsOfDateResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "getSGIDataByEffectiveAsOfDate")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getDataByEffectiveAsOfDateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val queryhelpHandler: Handler<SgiQueryhelpResponse> = jsonHandler<SgiQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SgiQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SgiQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "queryhelp")
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

        private val tupleHandler: Handler<List<SgiTupleResponse>> = jsonHandler<List<SgiTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SgiTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SgiTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "sgi", "tuple")
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

        override fun unvalidatedPublish(params: SgiUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-sgi")
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
