// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
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
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCountParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCreateBulkParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListPage
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import com.unifieddatalibrary.api.services.blocking.MissileTrackServiceImpl
import com.unifieddatalibrary.api.services.blocking.missiletracks.HistoryService
import com.unifieddatalibrary.api.services.blocking.missiletracks.HistoryServiceImpl
import java.util.function.Consumer

class MissileTrackServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : MissileTrackService {

    private val withRawResponse: MissileTrackService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): MissileTrackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackService = MissileTrackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: MissileTrackListParams, requestOptions: RequestOptions): MissileTrackListPage =
        // get /udl/missiletrack
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: MissileTrackCountParams, requestOptions: RequestOptions): String =
        // get /udl/missiletrack/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/missiletrack/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: MissileTrackQueryhelpParams, requestOptions: RequestOptions): MissileTrackQueryhelpResponse =
        // get /udl/missiletrack/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions): List<MissileTrackTupleResponse> =
        // get /udl/missiletrack/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-missiletrack
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : MissileTrackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackService.WithRawResponse = MissileTrackServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<MissileTrackListResponse>> = jsonHandler<List<MissileTrackListResponse>>(clientOptions.jsonMapper)

        override fun list(params: MissileTrackListParams, requestOptions: RequestOptions): HttpResponseFor<MissileTrackListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack")
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
                  MissileTrackListPage.builder()
                      .service(MissileTrackServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: MissileTrackCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "count")
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

        override fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "createBulk")
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

        private val queryhelpHandler: Handler<MissileTrackQueryhelpResponse> = jsonHandler<MissileTrackQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: MissileTrackQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<MissileTrackQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "queryhelp")
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

        private val tupleHandler: Handler<List<MissileTrackTupleResponse>> = jsonHandler<List<MissileTrackTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<MissileTrackTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "missiletrack", "tuple")
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

        override fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-missiletrack")
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
