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
import com.unifieddatalibrary.api.models.CommFull
import com.unifieddatalibrary.api.models.comm.CommAbridged
import com.unifieddatalibrary.api.models.comm.CommCountParams
import com.unifieddatalibrary.api.models.comm.CommCreateParams
import com.unifieddatalibrary.api.models.comm.CommDeleteParams
import com.unifieddatalibrary.api.models.comm.CommListPage
import com.unifieddatalibrary.api.models.comm.CommListParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpParams
import com.unifieddatalibrary.api.models.comm.CommQueryhelpResponse
import com.unifieddatalibrary.api.models.comm.CommRetrieveParams
import com.unifieddatalibrary.api.models.comm.CommTupleParams
import com.unifieddatalibrary.api.models.comm.CommUpdateParams
import com.unifieddatalibrary.api.services.blocking.CommService
import com.unifieddatalibrary.api.services.blocking.CommServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CommService {

    private val withRawResponse: CommService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CommService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommService = CommServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CommCreateParams, requestOptions: RequestOptions) {
      // post /udl/comm
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: CommRetrieveParams, requestOptions: RequestOptions): CommFull =
        // get /udl/comm/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CommUpdateParams, requestOptions: RequestOptions) {
      // put /udl/comm/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: CommListParams, requestOptions: RequestOptions): CommListPage =
        // get /udl/comm
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CommDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/comm/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: CommCountParams, requestOptions: RequestOptions): String =
        // get /udl/comm/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: CommQueryhelpParams, requestOptions: RequestOptions): CommQueryhelpResponse =
        // get /udl/comm/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: CommTupleParams, requestOptions: RequestOptions): List<CommFull> =
        // get /udl/comm/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CommService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommService.WithRawResponse = CommServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CommCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm")
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

        private val retrieveHandler: Handler<CommFull> = jsonHandler<CommFull>(clientOptions.jsonMapper)

        override fun retrieve(params: CommRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<CommFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", params._pathParam(0))
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

        override fun update(params: CommUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", params._pathParam(0))
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

        private val listHandler: Handler<List<CommAbridged>> = jsonHandler<List<CommAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CommListParams, requestOptions: RequestOptions): HttpResponseFor<CommListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm")
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
                  CommListPage.builder()
                      .service(CommServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: CommDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", params._pathParam(0))
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

        override fun count(params: CommCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", "count")
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

        private val queryhelpHandler: Handler<CommQueryhelpResponse> = jsonHandler<CommQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: CommQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<CommQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", "queryhelp")
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

        private val tupleHandler: Handler<List<CommFull>> = jsonHandler<List<CommFull>>(clientOptions.jsonMapper)

        override fun tuple(params: CommTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<CommFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "comm", "tuple")
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
