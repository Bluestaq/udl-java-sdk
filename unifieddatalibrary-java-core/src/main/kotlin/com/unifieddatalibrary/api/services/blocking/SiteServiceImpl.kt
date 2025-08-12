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
import com.unifieddatalibrary.api.models.site.SiteCountParams
import com.unifieddatalibrary.api.models.site.SiteCreateParams
import com.unifieddatalibrary.api.models.site.SiteGetParams
import com.unifieddatalibrary.api.models.site.SiteGetResponse
import com.unifieddatalibrary.api.models.site.SiteListPage
import com.unifieddatalibrary.api.models.site.SiteListParams
import com.unifieddatalibrary.api.models.site.SiteListResponse
import com.unifieddatalibrary.api.models.site.SiteQueryhelpParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpResponse
import com.unifieddatalibrary.api.models.site.SiteTupleParams
import com.unifieddatalibrary.api.models.site.SiteTupleResponse
import com.unifieddatalibrary.api.models.site.SiteUpdateParams
import com.unifieddatalibrary.api.services.blocking.SiteService
import com.unifieddatalibrary.api.services.blocking.SiteServiceImpl
import com.unifieddatalibrary.api.services.blocking.site.OperationService
import com.unifieddatalibrary.api.services.blocking.site.OperationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiteServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SiteService {

    private val withRawResponse: SiteService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val operations: OperationService by lazy { OperationServiceImpl(clientOptions) }

    override fun withRawResponse(): SiteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteService = SiteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun operations(): OperationService = operations

    override fun create(params: SiteCreateParams, requestOptions: RequestOptions) {
      // post /udl/site
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SiteUpdateParams, requestOptions: RequestOptions) {
      // put /udl/site/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: SiteListParams, requestOptions: RequestOptions): SiteListPage =
        // get /udl/site
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: SiteCountParams, requestOptions: RequestOptions): String =
        // get /udl/site/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: SiteGetParams, requestOptions: RequestOptions): SiteGetResponse =
        // get /udl/site/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: SiteQueryhelpParams, requestOptions: RequestOptions): SiteQueryhelpResponse =
        // get /udl/site/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: SiteTupleParams, requestOptions: RequestOptions): List<SiteTupleResponse> =
        // get /udl/site/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SiteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val operations: OperationService.WithRawResponse by lazy { OperationServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteService.WithRawResponse = SiteServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun operations(): OperationService.WithRawResponse = operations

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: SiteCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site")
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

        override fun update(params: SiteUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site", params._pathParam(0))
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

        private val listHandler: Handler<List<SiteListResponse>> = jsonHandler<List<SiteListResponse>>(clientOptions.jsonMapper)

        override fun list(params: SiteListParams, requestOptions: RequestOptions): HttpResponseFor<SiteListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site")
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
                  SiteListPage.builder()
                      .service(SiteServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: SiteCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site", "count")
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

        private val getHandler: Handler<SiteGetResponse> = jsonHandler<SiteGetResponse>(clientOptions.jsonMapper)

        override fun get(params: SiteGetParams, requestOptions: RequestOptions): HttpResponseFor<SiteGetResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site", params._pathParam(0))
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

        private val queryhelpHandler: Handler<SiteQueryhelpResponse> = jsonHandler<SiteQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: SiteQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<SiteQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site", "queryhelp")
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

        private val tupleHandler: Handler<List<SiteTupleResponse>> = jsonHandler<List<SiteTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: SiteTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<SiteTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "site", "tuple")
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
