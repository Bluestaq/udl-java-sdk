// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.site

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
import com.unifieddatalibrary.api.models.site.operations.OperationCountParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateBulkParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateParams
import com.unifieddatalibrary.api.models.site.operations.OperationDeleteParams
import com.unifieddatalibrary.api.models.site.operations.OperationListPage
import com.unifieddatalibrary.api.models.site.operations.OperationListParams
import com.unifieddatalibrary.api.models.site.operations.OperationListResponse
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpParams
import com.unifieddatalibrary.api.models.site.operations.OperationQueryHelpResponse
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveParams
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveResponse
import com.unifieddatalibrary.api.models.site.operations.OperationTupleParams
import com.unifieddatalibrary.api.models.site.operations.OperationTupleResponse
import com.unifieddatalibrary.api.models.site.operations.OperationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.site.operations.OperationUpdateParams
import com.unifieddatalibrary.api.services.blocking.site.OperationService
import com.unifieddatalibrary.api.services.blocking.site.OperationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OperationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OperationService {

    private val withRawResponse: OperationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OperationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationService = OperationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OperationCreateParams, requestOptions: RequestOptions) {
      // post /udl/siteoperations
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions): OperationRetrieveResponse =
        // get /udl/siteoperations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: OperationUpdateParams, requestOptions: RequestOptions) {
      // put /udl/siteoperations/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: OperationListParams, requestOptions: RequestOptions): OperationListPage =
        // get /udl/siteoperations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OperationDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/siteoperations/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: OperationCountParams, requestOptions: RequestOptions): String =
        // get /udl/siteoperations/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/siteoperations/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(params: OperationQueryHelpParams, requestOptions: RequestOptions): OperationQueryHelpResponse =
        // get /udl/siteoperations/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: OperationTupleParams, requestOptions: RequestOptions): List<OperationTupleResponse> =
        // get /udl/siteoperations/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-siteoperations
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OperationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperationService.WithRawResponse = OperationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OperationCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations")
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

        private val retrieveHandler: Handler<OperationRetrieveResponse> = jsonHandler<OperationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: OperationRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<OperationRetrieveResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", params._pathParam(0))
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

        override fun update(params: OperationUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", params._pathParam(0))
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

        private val listHandler: Handler<List<OperationListResponse>> = jsonHandler<List<OperationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OperationListParams, requestOptions: RequestOptions): HttpResponseFor<OperationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations")
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
                  OperationListPage.builder()
                      .service(OperationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OperationDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", params._pathParam(0))
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

        override fun count(params: OperationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", "count")
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

        override fun createBulk(params: OperationCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", "createBulk")
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

        private val queryHelpHandler: Handler<OperationQueryHelpResponse> = jsonHandler<OperationQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: OperationQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<OperationQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", "queryhelp")
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

        private val tupleHandler: Handler<List<OperationTupleResponse>> = jsonHandler<List<OperationTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: OperationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<OperationTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "siteoperations", "tuple")
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

        override fun unvalidatedPublish(params: OperationUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-siteoperations")
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
