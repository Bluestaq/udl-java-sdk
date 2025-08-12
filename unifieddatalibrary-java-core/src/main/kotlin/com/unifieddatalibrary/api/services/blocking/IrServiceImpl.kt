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
import com.unifieddatalibrary.api.models.ir.IrCountParams
import com.unifieddatalibrary.api.models.ir.IrCreateParams
import com.unifieddatalibrary.api.models.ir.IrDeleteParams
import com.unifieddatalibrary.api.models.ir.IrGetParams
import com.unifieddatalibrary.api.models.ir.IrGetResponse
import com.unifieddatalibrary.api.models.ir.IrListPage
import com.unifieddatalibrary.api.models.ir.IrListParams
import com.unifieddatalibrary.api.models.ir.IrListResponse
import com.unifieddatalibrary.api.models.ir.IrQueryhelpParams
import com.unifieddatalibrary.api.models.ir.IrQueryhelpResponse
import com.unifieddatalibrary.api.models.ir.IrTupleParams
import com.unifieddatalibrary.api.models.ir.IrTupleResponse
import com.unifieddatalibrary.api.models.ir.IrUpdateParams
import com.unifieddatalibrary.api.services.blocking.IrService
import com.unifieddatalibrary.api.services.blocking.IrServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IrServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : IrService {

    private val withRawResponse: IrService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): IrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrService = IrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: IrCreateParams, requestOptions: RequestOptions) {
      // post /udl/ir
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: IrUpdateParams, requestOptions: RequestOptions) {
      // put /udl/ir/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: IrListParams, requestOptions: RequestOptions): IrListPage =
        // get /udl/ir
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IrDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/ir/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: IrCountParams, requestOptions: RequestOptions): String =
        // get /udl/ir/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: IrGetParams, requestOptions: RequestOptions): IrGetResponse =
        // get /udl/ir/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: IrQueryhelpParams, requestOptions: RequestOptions): IrQueryhelpResponse =
        // get /udl/ir/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: IrTupleParams, requestOptions: RequestOptions): List<IrTupleResponse> =
        // get /udl/ir/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : IrService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrService.WithRawResponse = IrServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: IrCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir")
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

        override fun update(params: IrUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", params._pathParam(0))
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

        private val listHandler: Handler<List<IrListResponse>> = jsonHandler<List<IrListResponse>>(clientOptions.jsonMapper)

        override fun list(params: IrListParams, requestOptions: RequestOptions): HttpResponseFor<IrListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir")
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
                  IrListPage.builder()
                      .service(IrServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: IrDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", params._pathParam(0))
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

        override fun count(params: IrCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", "count")
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

        private val getHandler: Handler<IrGetResponse> = jsonHandler<IrGetResponse>(clientOptions.jsonMapper)

        override fun get(params: IrGetParams, requestOptions: RequestOptions): HttpResponseFor<IrGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", params._pathParam(0))
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

        private val queryhelpHandler: Handler<IrQueryhelpResponse> = jsonHandler<IrQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: IrQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<IrQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", "queryhelp")
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

        private val tupleHandler: Handler<List<IrTupleResponse>> = jsonHandler<List<IrTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: IrTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<IrTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "ir", "tuple")
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
