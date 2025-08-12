// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.linkstatus

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
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCountParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCreateParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListPage
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkService
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkServiceImpl
import java.util.function.Consumer

class DatalinkServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DatalinkService {

    private val withRawResponse: DatalinkService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DatalinkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkService = DatalinkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DatalinkCreateParams, requestOptions: RequestOptions) {
      // post /udl/datalink
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: DatalinkListParams, requestOptions: RequestOptions): DatalinkListPage =
        // get /udl/datalink
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: DatalinkCountParams, requestOptions: RequestOptions): String =
        // get /udl/datalink/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: DatalinkQueryhelpParams, requestOptions: RequestOptions): DatalinkQueryhelpResponse =
        // get /udl/datalink/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions): List<DatalinkTupleResponse> =
        // get /udl/datalink/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-datalink
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DatalinkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkService.WithRawResponse = DatalinkServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: DatalinkCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink")
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

        private val listHandler: Handler<List<DatalinkListResponse>> = jsonHandler<List<DatalinkListResponse>>(clientOptions.jsonMapper)

        override fun list(params: DatalinkListParams, requestOptions: RequestOptions): HttpResponseFor<DatalinkListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink")
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
                  DatalinkListPage.builder()
                      .service(DatalinkServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: DatalinkCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "count")
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

        private val queryhelpHandler: Handler<DatalinkQueryhelpResponse> = jsonHandler<DatalinkQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: DatalinkQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<DatalinkQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "queryhelp")
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

        private val tupleHandler: Handler<List<DatalinkTupleResponse>> = jsonHandler<List<DatalinkTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<DatalinkTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "datalink", "tuple")
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

        override fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-datalink")
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
