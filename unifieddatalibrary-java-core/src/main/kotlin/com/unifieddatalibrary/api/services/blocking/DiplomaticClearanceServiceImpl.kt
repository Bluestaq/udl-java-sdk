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
import com.unifieddatalibrary.api.models.DiplomaticclearanceFull
import com.unifieddatalibrary.api.models.airoperations.diplomaticclearance.DiplomaticclearanceAbridged
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListPage
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceUpdateParams
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceServiceImpl
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.CountryService
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.CountryServiceImpl
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.HistoryService
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DiplomaticClearanceServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DiplomaticClearanceService {

    private val withRawResponse: DiplomaticClearanceService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    private val country: CountryService by lazy { CountryServiceImpl(clientOptions) }

    override fun withRawResponse(): DiplomaticClearanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService = DiplomaticClearanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun country(): CountryService = country

    override fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions) {
      // post /udl/diplomaticclearance
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions): DiplomaticclearanceFull =
        // get /udl/diplomaticclearance/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions) {
      // put /udl/diplomaticclearance/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions): DiplomaticClearanceListPage =
        // get /udl/diplomaticclearance
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/diplomaticclearance/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions): String =
        // get /udl/diplomaticclearance/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/diplomaticclearance/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryhelp(params: DiplomaticClearanceQueryhelpParams, requestOptions: RequestOptions): DiplomaticClearanceQueryhelpResponse =
        // get /udl/diplomaticclearance/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions): List<DiplomaticclearanceFull> =
        // get /udl/diplomaticclearance/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DiplomaticClearanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val country: CountryService.WithRawResponse by lazy { CountryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService.WithRawResponse = DiplomaticClearanceServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        override fun country(): CountryService.WithRawResponse = country

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance")
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

        private val retrieveHandler: Handler<DiplomaticclearanceFull> = jsonHandler<DiplomaticclearanceFull>(clientOptions.jsonMapper)

        override fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<DiplomaticclearanceFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        override fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        private val listHandler: Handler<List<DiplomaticclearanceAbridged>> = jsonHandler<List<DiplomaticclearanceAbridged>>(clientOptions.jsonMapper)

        override fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions): HttpResponseFor<DiplomaticClearanceListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance")
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
                  DiplomaticClearanceListPage.builder()
                      .service(DiplomaticClearanceServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", params._pathParam(0))
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

        override fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "count")
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

        override fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "createBulk")
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

        private val queryhelpHandler: Handler<DiplomaticClearanceQueryhelpResponse> = jsonHandler<DiplomaticClearanceQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: DiplomaticClearanceQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<DiplomaticClearanceQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "queryhelp")
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

        private val tupleHandler: Handler<List<DiplomaticclearanceFull>> = jsonHandler<List<DiplomaticclearanceFull>>(clientOptions.jsonMapper)

        override fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<DiplomaticclearanceFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "diplomaticclearance", "tuple")
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
