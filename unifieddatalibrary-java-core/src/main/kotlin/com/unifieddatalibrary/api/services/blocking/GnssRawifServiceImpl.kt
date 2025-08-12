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
import com.unifieddatalibrary.api.core.http.multipartFormData
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListPage
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleResponse
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfUploadZipParams
import com.unifieddatalibrary.api.services.blocking.GnssRawIfService
import com.unifieddatalibrary.api.services.blocking.GnssRawIfServiceImpl
import com.unifieddatalibrary.api.services.blocking.gnssrawif.HistoryService
import com.unifieddatalibrary.api.services.blocking.gnssrawif.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GnssRawIfServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GnssRawIfService {

    private val withRawResponse: GnssRawIfService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GnssRawIfService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfService = GnssRawIfServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: GnssRawIfListParams, requestOptions: RequestOptions): GnssRawIfListPage =
        // get /udl/gnssrawif
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: GnssRawIfCountParams, requestOptions: RequestOptions): String =
        // get /udl/gnssrawif/count
        withRawResponse().count(params, requestOptions).parse()

    override fun fileGet(params: GnssRawIfFileGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /udl/gnssrawif/getFile/{id}
        withRawResponse().fileGet(params, requestOptions)

    override fun get(params: GnssRawIfGetParams, requestOptions: RequestOptions): GnssRawIfGetResponse =
        // get /udl/gnssrawif/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: GnssRawIfQueryhelpParams, requestOptions: RequestOptions): GnssRawIfQueryhelpResponse =
        // get /udl/gnssrawif/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: GnssRawIfTupleParams, requestOptions: RequestOptions): List<GnssRawIfTupleResponse> =
        // get /udl/gnssrawif/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun uploadZip(params: GnssRawIfUploadZipParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-gnssrawif
      withRawResponse().uploadZip(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GnssRawIfService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssRawIfService.WithRawResponse = GnssRawIfServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<GnssRawIfListResponse>> = jsonHandler<List<GnssRawIfListResponse>>(clientOptions.jsonMapper)

        override fun list(params: GnssRawIfListParams, requestOptions: RequestOptions): HttpResponseFor<GnssRawIfListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif")
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
                  GnssRawIfListPage.builder()
                      .service(GnssRawIfServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: GnssRawIfCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif", "count")
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

        override fun fileGet(params: GnssRawIfFileGetParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif", "getFile", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response)
        }

        private val getHandler: Handler<GnssRawIfGetResponse> = jsonHandler<GnssRawIfGetResponse>(clientOptions.jsonMapper)

        override fun get(params: GnssRawIfGetParams, requestOptions: RequestOptions): HttpResponseFor<GnssRawIfGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif", params._pathParam(0))
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

        private val queryhelpHandler: Handler<GnssRawIfQueryhelpResponse> = jsonHandler<GnssRawIfQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: GnssRawIfQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<GnssRawIfQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif", "queryhelp")
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

        private val tupleHandler: Handler<List<GnssRawIfTupleResponse>> = jsonHandler<List<GnssRawIfTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: GnssRawIfTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<GnssRawIfTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "gnssrawif", "tuple")
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

        private val uploadZipHandler: Handler<Void?> = emptyHandler()

        override fun uploadZip(params: GnssRawIfUploadZipParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-gnssrawif")
            .body(multipartFormData(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  uploadZipHandler.handle(it)
              }
          }
        }
    }
}
