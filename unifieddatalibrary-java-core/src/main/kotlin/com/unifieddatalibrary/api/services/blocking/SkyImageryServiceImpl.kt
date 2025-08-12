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
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryCountParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryFileGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListPage
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryQueryhelpResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleResponse
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryUploadZipParams
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import com.unifieddatalibrary.api.services.blocking.SkyImageryServiceImpl
import com.unifieddatalibrary.api.services.blocking.skyimagery.HistoryService
import com.unifieddatalibrary.api.services.blocking.skyimagery.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SkyImageryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SkyImageryService {

    private val withRawResponse: SkyImageryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SkyImageryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryService = SkyImageryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun list(params: SkyImageryListParams, requestOptions: RequestOptions): SkyImageryListPage =
        // get /udl/skyimagery
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SkyImageryCountParams, requestOptions: RequestOptions): String =
        // get /udl/skyimagery/count
        withRawResponse().count(params, requestOptions).parse()

    override fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /udl/skyimagery/getFile/{id}
        withRawResponse().fileGet(params, requestOptions)

    override fun get(params: SkyImageryGetParams, requestOptions: RequestOptions): SkyImageryGetResponse =
        // get /udl/skyimagery/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SkyImageryQueryhelpParams, requestOptions: RequestOptions): SkyImageryQueryhelpResponse =
        // get /udl/skyimagery/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions): List<SkyImageryTupleResponse> =
        // get /udl/skyimagery/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-skyimagery
      withRawResponse().uploadZip(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SkyImageryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkyImageryService.WithRawResponse = SkyImageryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val listHandler: Handler<List<SkyImageryListResponse>> = jsonHandler<List<SkyImageryListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SkyImageryListParams, requestOptions: RequestOptions): HttpResponseFor<SkyImageryListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery")
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
                  SkyImageryListPage.builder()
                      .service(SkyImageryServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SkyImageryCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "count")
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

        override fun fileGet(params: SkyImageryFileGetParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "getFile", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response)
        }

        private val getHandler: Handler<SkyImageryGetResponse> = jsonHandler<SkyImageryGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SkyImageryGetParams, requestOptions: RequestOptions): HttpResponseFor<SkyImageryGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SkyImageryQueryhelpResponse> = jsonHandler<SkyImageryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SkyImageryQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SkyImageryQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "queryhelp")
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

        private val tupleHandler: Handler<List<SkyImageryTupleResponse>> = jsonHandler<List<SkyImageryTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SkyImageryTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SkyImageryTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "skyimagery", "tuple")
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

        override fun uploadZip(params: SkyImageryUploadZipParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl() else "https://imagery.unifieddatalibrary.com")
            .addPathSegments("filedrop", "udl-skyimagery")
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
