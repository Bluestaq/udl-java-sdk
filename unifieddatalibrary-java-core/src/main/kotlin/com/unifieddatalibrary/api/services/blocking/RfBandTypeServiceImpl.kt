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
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCountParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeDeleteParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListPage
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeListResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleResponse
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeUpdateParams
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import com.unifieddatalibrary.api.services.blocking.RfBandTypeServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RfBandTypeServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RfBandTypeService {

    private val withRawResponse: RfBandTypeService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RfBandTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandTypeService = RfBandTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RfBandTypeCreateParams, requestOptions: RequestOptions) {
      // post /udl/rfbandtype
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: RfBandTypeUpdateParams, requestOptions: RequestOptions) {
      // put /udl/rfbandtype/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: RfBandTypeListParams, requestOptions: RequestOptions): RfBandTypeListPage =
        // get /udl/rfbandtype
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RfBandTypeDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/rfbandtype/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: RfBandTypeCountParams, requestOptions: RequestOptions): String =
        // get /udl/rfbandtype/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: RfBandTypeGetParams, requestOptions: RequestOptions): RfBandTypeGetResponse =
        // get /udl/rfbandtype/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: RfBandTypeQueryhelpParams, requestOptions: RequestOptions): RfBandTypeQueryhelpResponse =
        // get /udl/rfbandtype/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: RfBandTypeTupleParams, requestOptions: RequestOptions): List<RfBandTypeTupleResponse> =
        // get /udl/rfbandtype/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RfBandTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RfBandTypeService.WithRawResponse = RfBandTypeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: RfBandTypeCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype")
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

        override fun update(params: RfBandTypeUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", params._pathParam(0))
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

        private val listHandler: Handler<List<RfBandTypeListResponse>> = jsonHandler<List<RfBandTypeListResponse>>(clientOptions.jsonMapper)

        override fun list(params: RfBandTypeListParams, requestOptions: RequestOptions): HttpResponseFor<RfBandTypeListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype")
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
                  RfBandTypeListPage.builder()
                      .service(RfBandTypeServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: RfBandTypeDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", params._pathParam(0))
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

        override fun count(params: RfBandTypeCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", "count")
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

        private val getHandler: Handler<RfBandTypeGetResponse> = jsonHandler<RfBandTypeGetResponse>(clientOptions.jsonMapper)

        override fun get(params: RfBandTypeGetParams, requestOptions: RequestOptions): HttpResponseFor<RfBandTypeGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", params._pathParam(0))
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

        private val queryhelpHandler: Handler<RfBandTypeQueryhelpResponse> = jsonHandler<RfBandTypeQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: RfBandTypeQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<RfBandTypeQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", "queryhelp")
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

        private val tupleHandler: Handler<List<RfBandTypeTupleResponse>> = jsonHandler<List<RfBandTypeTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: RfBandTypeTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<RfBandTypeTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "rfbandtype", "tuple")
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
