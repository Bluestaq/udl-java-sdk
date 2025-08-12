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
import com.unifieddatalibrary.api.models.OrganizationFull
import com.unifieddatalibrary.api.models.organization.OrganizationCountParams
import com.unifieddatalibrary.api.models.organization.OrganizationCreateParams
import com.unifieddatalibrary.api.models.organization.OrganizationDeleteParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationCategoriesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationTypesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetParams
import com.unifieddatalibrary.api.models.organization.OrganizationListPage
import com.unifieddatalibrary.api.models.organization.OrganizationListParams
import com.unifieddatalibrary.api.models.organization.OrganizationListResponse
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpResponse
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import com.unifieddatalibrary.api.services.blocking.OrganizationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrganizationServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OrganizationService {

    private val withRawResponse: OrganizationService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OrganizationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService = OrganizationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions) {
      // post /udl/organization
      withRawResponse().create(params, requestOptions)
    }

    override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions) {
      // put /udl/organization/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: OrganizationListParams, requestOptions: RequestOptions): OrganizationListPage =
        // get /udl/organization
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/organization/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: OrganizationCountParams, requestOptions: RequestOptions): String =
        // get /udl/organization/count
        withRawResponse().count(params, requestOptions).parse()

    override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): OrganizationFull =
        // get /udl/organization/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams, requestOptions: RequestOptions): List<String> =
        // get /udl/organization/getOrganizationCategories
        withRawResponse().getOrganizationCategories(params, requestOptions).parse()

    override fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams, requestOptions: RequestOptions): List<String> =
        // get /udl/organization/getOrganizationTypes
        withRawResponse().getOrganizationTypes(params, requestOptions).parse()

    override fun queryhelp(params: OrganizationQueryhelpParams, requestOptions: RequestOptions): OrganizationQueryhelpResponse =
        // get /udl/organization/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions): List<OrganizationFull> =
        // get /udl/organization/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OrganizationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService.WithRawResponse = OrganizationServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization")
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

        override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
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

        private val listHandler: Handler<List<OrganizationListResponse>> = jsonHandler<List<OrganizationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OrganizationListParams, requestOptions: RequestOptions): HttpResponseFor<OrganizationListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization")
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
                  OrganizationListPage.builder()
                      .service(OrganizationServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
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

        override fun count(params: OrganizationCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "count")
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

        private val getHandler: Handler<OrganizationFull> = jsonHandler<OrganizationFull>(clientOptions.jsonMapper)

        override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): HttpResponseFor<OrganizationFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
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

        private val getOrganizationCategoriesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams, requestOptions: RequestOptions): HttpResponseFor<List<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "getOrganizationCategories")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getOrganizationCategoriesHandler.handle(it)
              }
          }
        }

        private val getOrganizationTypesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams, requestOptions: RequestOptions): HttpResponseFor<List<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "getOrganizationTypes")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getOrganizationTypesHandler.handle(it)
              }
          }
        }

        private val queryhelpHandler: Handler<OrganizationQueryhelpResponse> = jsonHandler<OrganizationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OrganizationQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<OrganizationQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "queryhelp")
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

        private val tupleHandler: Handler<List<OrganizationFull>> = jsonHandler<List<OrganizationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<OrganizationFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "tuple")
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
