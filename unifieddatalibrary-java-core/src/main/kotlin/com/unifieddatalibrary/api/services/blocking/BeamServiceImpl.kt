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
import com.unifieddatalibrary.api.models.BeamFull
import com.unifieddatalibrary.api.models.beam.BeamAbridged
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamDeleteParams
import com.unifieddatalibrary.api.models.beam.BeamListPage
import com.unifieddatalibrary.api.models.beam.BeamListParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpResponse
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import com.unifieddatalibrary.api.services.blocking.BeamService
import com.unifieddatalibrary.api.services.blocking.BeamServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeamServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : BeamService {

    private val withRawResponse: BeamService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): BeamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamService = BeamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BeamCreateParams, requestOptions: RequestOptions) {
      // post /udl/beam
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions): BeamFull =
        // get /udl/beam/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BeamUpdateParams, requestOptions: RequestOptions) {
      // put /udl/beam/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: BeamListParams, requestOptions: RequestOptions): BeamListPage =
        // get /udl/beam
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BeamDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/beam/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: BeamCountParams, requestOptions: RequestOptions): String =
        // get /udl/beam/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryHelp(params: BeamQueryHelpParams, requestOptions: RequestOptions): BeamQueryHelpResponse =
        // get /udl/beam/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: BeamTupleParams, requestOptions: RequestOptions): List<BeamFull> =
        // get /udl/beam/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : BeamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamService.WithRawResponse = BeamServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: BeamCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam")
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

        private val retrieveHandler: Handler<BeamFull> = jsonHandler<BeamFull>(clientOptions.jsonMapper)

        override fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<BeamFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
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

        override fun update(params: BeamUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
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

        private val listHandler: Handler<List<BeamAbridged>> = jsonHandler<List<BeamAbridged>>(clientOptions.jsonMapper)

        override fun list(params: BeamListParams, requestOptions: RequestOptions): HttpResponseFor<BeamListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam")
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
                  BeamListPage.builder()
                      .service(BeamServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: BeamDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
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

        override fun count(params: BeamCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "count")
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

        private val queryHelpHandler: Handler<BeamQueryHelpResponse> = jsonHandler<BeamQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: BeamQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<BeamQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "queryhelp")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryHelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val tupleHandler: Handler<List<BeamFull>> = jsonHandler<List<BeamFull>>(clientOptions.jsonMapper)

        override fun tuple(params: BeamTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<BeamFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "tuple")
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
