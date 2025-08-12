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
import com.unifieddatalibrary.api.models.AirfieldFull
import com.unifieddatalibrary.api.models.airfields.AirfieldAbridged
import com.unifieddatalibrary.api.models.airfields.AirfieldCountParams
import com.unifieddatalibrary.api.models.airfields.AirfieldCreateParams
import com.unifieddatalibrary.api.models.airfields.AirfieldListPage
import com.unifieddatalibrary.api.models.airfields.AirfieldListParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpParams
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpResponse
import com.unifieddatalibrary.api.models.airfields.AirfieldRetrieveParams
import com.unifieddatalibrary.api.models.airfields.AirfieldTupleParams
import com.unifieddatalibrary.api.models.airfields.AirfieldUpdateParams
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import com.unifieddatalibrary.api.services.blocking.AirfieldServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AirfieldServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AirfieldService {

    private val withRawResponse: AirfieldService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AirfieldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldService = AirfieldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AirfieldCreateParams, requestOptions: RequestOptions) {
      // post /udl/airfield
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions): AirfieldFull =
        // get /udl/airfield/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions) {
      // put /udl/airfield/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: AirfieldListParams, requestOptions: RequestOptions): AirfieldListPage =
        // get /udl/airfield
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: AirfieldCountParams, requestOptions: RequestOptions): String =
        // get /udl/airfield/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: AirfieldQueryhelpParams, requestOptions: RequestOptions): AirfieldQueryhelpResponse =
        // get /udl/airfield/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions): List<AirfieldFull> =
        // get /udl/airfield/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AirfieldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldService.WithRawResponse = AirfieldServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AirfieldCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield")
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

        private val retrieveHandler: Handler<AirfieldFull> = jsonHandler<AirfieldFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AirfieldRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield", params._pathParam(0))
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

        override fun update(params: AirfieldUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield", params._pathParam(0))
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

        private val listHandler: Handler<List<AirfieldAbridged>> = jsonHandler<List<AirfieldAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AirfieldListParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield")
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
                  AirfieldListPage.builder()
                      .service(AirfieldServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AirfieldCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield", "count")
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

        private val queryhelpHandler: Handler<AirfieldQueryhelpResponse> = jsonHandler<AirfieldQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: AirfieldQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<AirfieldQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield", "queryhelp")
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

        private val tupleHandler: Handler<List<AirfieldFull>> = jsonHandler<List<AirfieldFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AirfieldTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AirfieldFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "airfield", "tuple")
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
