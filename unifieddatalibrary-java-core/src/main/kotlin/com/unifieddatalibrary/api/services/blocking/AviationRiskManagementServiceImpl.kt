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
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCountParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateBulkParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementDeleteParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryHelpResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleResponse
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUpdateParams
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementService
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AviationRiskManagementServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AviationRiskManagementService {

    private val withRawResponse: AviationRiskManagementService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AviationRiskManagementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AviationRiskManagementService = AviationRiskManagementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: AviationRiskManagementCreateParams, requestOptions: RequestOptions) {
      // post /udl/aviationriskmanagement
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: AviationRiskManagementRetrieveParams, requestOptions: RequestOptions): AviationRiskManagementRetrieveResponse =
        // get /udl/aviationriskmanagement/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AviationRiskManagementUpdateParams, requestOptions: RequestOptions) {
      // put /udl/aviationriskmanagement/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun delete(params: AviationRiskManagementDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/aviationriskmanagement/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: AviationRiskManagementCountParams, requestOptions: RequestOptions): String =
        // get /udl/aviationriskmanagement/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: AviationRiskManagementCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/aviationriskmanagement/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun query(params: AviationRiskManagementQueryParams, requestOptions: RequestOptions): List<AviationRiskManagementQueryResponse> =
        // get /udl/aviationriskmanagement
        withRawResponse().query(params, requestOptions).parse()

    override fun queryHelp(params: AviationRiskManagementQueryHelpParams, requestOptions: RequestOptions): AviationRiskManagementQueryHelpResponse =
        // get /udl/aviationriskmanagement/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: AviationRiskManagementTupleParams, requestOptions: RequestOptions): List<AviationRiskManagementTupleResponse> =
        // get /udl/aviationriskmanagement/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(params: AviationRiskManagementUnvalidatedPublishParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-aviationriskmanagement
      withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AviationRiskManagementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AviationRiskManagementService.WithRawResponse = AviationRiskManagementServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AviationRiskManagementCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement")
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

        private val retrieveHandler: Handler<AviationRiskManagementRetrieveResponse> = jsonHandler<AviationRiskManagementRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: AviationRiskManagementRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AviationRiskManagementRetrieveResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", params._pathParam(0))
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

        override fun update(params: AviationRiskManagementUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: AviationRiskManagementDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", params._pathParam(0))
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

        override fun count(params: AviationRiskManagementCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", "count")
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

        override fun createBulk(params: AviationRiskManagementCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", "createBulk")
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

        private val queryHandler: Handler<List<AviationRiskManagementQueryResponse>> = jsonHandler<List<AviationRiskManagementQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: AviationRiskManagementQueryParams, requestOptions: RequestOptions): HttpResponseFor<List<AviationRiskManagementQueryResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }

        private val queryHelpHandler: Handler<AviationRiskManagementQueryHelpResponse> = jsonHandler<AviationRiskManagementQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: AviationRiskManagementQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<AviationRiskManagementQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", "queryhelp")
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

        private val tupleHandler: Handler<List<AviationRiskManagementTupleResponse>> = jsonHandler<List<AviationRiskManagementTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: AviationRiskManagementTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<AviationRiskManagementTupleResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "aviationriskmanagement", "tuple")
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

        override fun unvalidatedPublish(params: AviationRiskManagementUnvalidatedPublishParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-aviationriskmanagement")
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
