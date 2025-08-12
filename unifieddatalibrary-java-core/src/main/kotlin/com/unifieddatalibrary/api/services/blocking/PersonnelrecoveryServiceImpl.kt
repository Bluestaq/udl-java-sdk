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
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelRecoveryFullL
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCountParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateBulkParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryFileCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryGetParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListPage
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListResponse
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpResponse
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryTupleParams
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryService
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryServiceImpl
import com.unifieddatalibrary.api.services.blocking.personnelrecovery.HistoryService
import com.unifieddatalibrary.api.services.blocking.personnelrecovery.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PersonnelrecoveryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PersonnelrecoveryService {

    private val withRawResponse: PersonnelrecoveryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): PersonnelrecoveryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonnelrecoveryService = PersonnelrecoveryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: PersonnelrecoveryCreateParams, requestOptions: RequestOptions) {
      // post /udl/personnelrecovery
      withRawResponse().create(params, requestOptions)
    }

    override fun list(params: PersonnelrecoveryListParams, requestOptions: RequestOptions): PersonnelrecoveryListPage =
        // get /udl/personnelrecovery
        withRawResponse().list(params, requestOptions).parse()

    override fun count(params: PersonnelrecoveryCountParams, requestOptions: RequestOptions): String =
        // get /udl/personnelrecovery/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: PersonnelrecoveryCreateBulkParams, requestOptions: RequestOptions) {
      // post /udl/personnelrecovery/createBulk
      withRawResponse().createBulk(params, requestOptions)
    }

    override fun fileCreate(params: PersonnelrecoveryFileCreateParams, requestOptions: RequestOptions) {
      // post /filedrop/udl-personnelrecovery
      withRawResponse().fileCreate(params, requestOptions)
    }

    override fun get(params: PersonnelrecoveryGetParams, requestOptions: RequestOptions): PersonnelRecoveryFullL =
        // get /udl/personnelrecovery/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(params: PersonnelrecoveryQueryhelpParams, requestOptions: RequestOptions): PersonnelrecoveryQueryhelpResponse =
        // get /udl/personnelrecovery/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: PersonnelrecoveryTupleParams, requestOptions: RequestOptions): List<PersonnelRecoveryFullL> =
        // get /udl/personnelrecovery/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PersonnelrecoveryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonnelrecoveryService.WithRawResponse = PersonnelrecoveryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: PersonnelrecoveryCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery")
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

        private val listHandler: Handler<List<PersonnelrecoveryListResponse>> = jsonHandler<List<PersonnelrecoveryListResponse>>(clientOptions.jsonMapper)

        override fun list(params: PersonnelrecoveryListParams, requestOptions: RequestOptions): HttpResponseFor<PersonnelrecoveryListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery")
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
                  PersonnelrecoveryListPage.builder()
                      .service(PersonnelrecoveryServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: PersonnelrecoveryCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery", "count")
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

        override fun createBulk(params: PersonnelrecoveryCreateBulkParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery", "createBulk")
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

        private val fileCreateHandler: Handler<Void?> = emptyHandler()

        override fun fileCreate(params: PersonnelrecoveryFileCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-personnelrecovery")
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
                  fileCreateHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<PersonnelRecoveryFullL> = jsonHandler<PersonnelRecoveryFullL>(clientOptions.jsonMapper)

        override fun get(params: PersonnelrecoveryGetParams, requestOptions: RequestOptions): HttpResponseFor<PersonnelRecoveryFullL> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery", params._pathParam(0))
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

        private val queryhelpHandler: Handler<PersonnelrecoveryQueryhelpResponse> = jsonHandler<PersonnelrecoveryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: PersonnelrecoveryQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<PersonnelrecoveryQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery", "queryhelp")
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

        private val tupleHandler: Handler<List<PersonnelRecoveryFullL>> = jsonHandler<List<PersonnelRecoveryFullL>>(clientOptions.jsonMapper)

        override fun tuple(params: PersonnelrecoveryTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<PersonnelRecoveryFullL>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "personnelrecovery", "tuple")
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
