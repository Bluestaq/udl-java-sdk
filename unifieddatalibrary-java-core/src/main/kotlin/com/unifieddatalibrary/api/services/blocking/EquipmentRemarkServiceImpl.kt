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
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkAbridged
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateBulkParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkFull
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListPage
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpResponse
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkRetrieveParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkTupleParams
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EquipmentRemarkServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EquipmentRemarkService {

    private val withRawResponse: EquipmentRemarkService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EquipmentRemarkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkService = EquipmentRemarkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions) {
      // post /udl/equipmentremark
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions): EquipmentRemarkFull =
        // get /udl/equipmentremark/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EquipmentRemarkListParams, requestOptions: RequestOptions): EquipmentRemarkListPage =
        // get /udl/equipmentremark
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: EquipmentRemarkCountParams, requestOptions: RequestOptions): String =
        // get /udl/equipmentremark/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/equipmentremark/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(params: EquipmentRemarkQueryHelpParams, requestOptions: RequestOptions): EquipmentRemarkQueryHelpResponse =
        // get /udl/equipmentremark/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions): List<EquipmentRemarkFull> =
        // get /udl/equipmentremark/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EquipmentRemarkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkService.WithRawResponse = EquipmentRemarkServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark")
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

        private val retrieveHandler: Handler<EquipmentRemarkFull> = jsonHandler<EquipmentRemarkFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark", params._pathParam(0))
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

        private val listHandler: Handler<List<EquipmentRemarkAbridged>> = jsonHandler<List<EquipmentRemarkAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EquipmentRemarkListParams, requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark")
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
                  EquipmentRemarkListPage.builder()
                      .service(EquipmentRemarkServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: EquipmentRemarkCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark", "count")
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

        override fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark", "createBulk")
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

        private val queryHelpHandler: Handler<EquipmentRemarkQueryHelpResponse> = jsonHandler<EquipmentRemarkQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EquipmentRemarkQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark", "queryhelp")
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

        private val tupleHandler: Handler<List<EquipmentRemarkFull>> = jsonHandler<List<EquipmentRemarkFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<EquipmentRemarkFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "equipmentremark", "tuple")
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
