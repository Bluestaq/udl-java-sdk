// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onorbit

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.AntennaDetailsFull
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailDeleteParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListPage
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailsAbridged
import com.unifieddatalibrary.api.services.blocking.onorbit.AntennaDetailService
import com.unifieddatalibrary.api.services.blocking.onorbit.AntennaDetailServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AntennaDetailServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AntennaDetailService {

    private val withRawResponse: AntennaDetailService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AntennaDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailService = AntennaDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions) {
      // post /udl/antennadetails
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions): AntennaDetailsFull =
        // get /udl/antennadetails/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions) {
      // put /udl/antennadetails/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AntennaDetailListParams, requestOptions: RequestOptions): AntennaDetailListPage =
        // get /udl/antennadetails
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/antennadetails/{id}
      withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AntennaDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailService.WithRawResponse = AntennaDetailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AntennaDetailCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails")
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

        private val retrieveHandler: Handler<AntennaDetailsFull> = jsonHandler<AntennaDetailsFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AntennaDetailRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AntennaDetailsFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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

        override fun update(params: AntennaDetailUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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

        private val listHandler: Handler<List<AntennaDetailsAbridged>> = jsonHandler<List<AntennaDetailsAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AntennaDetailListParams, requestOptions: RequestOptions): HttpResponseFor<AntennaDetailListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails")
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
                  AntennaDetailListPage.builder()
                      .service(AntennaDetailServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AntennaDetailDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "antennadetails", params._pathParam(0))
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
    }
}
