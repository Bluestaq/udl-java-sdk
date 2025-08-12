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
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.entities.EntityAbridged
import com.unifieddatalibrary.api.models.entities.EntityCountParams
import com.unifieddatalibrary.api.models.entities.EntityCreateParams
import com.unifieddatalibrary.api.models.entities.EntityDeleteParams
import com.unifieddatalibrary.api.models.entities.EntityGetAllTypesParams
import com.unifieddatalibrary.api.models.entities.EntityListPage
import com.unifieddatalibrary.api.models.entities.EntityListParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpResponse
import com.unifieddatalibrary.api.models.entities.EntityRetrieveParams
import com.unifieddatalibrary.api.models.entities.EntityTupleParams
import com.unifieddatalibrary.api.models.entities.EntityUpdateParams
import com.unifieddatalibrary.api.services.blocking.EntityService
import com.unifieddatalibrary.api.services.blocking.EntityServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EntityService {

    private val withRawResponse: EntityService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EntityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService = EntityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EntityCreateParams, requestOptions: RequestOptions) {
      // post /udl/entity
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): EntityFull =
        // get /udl/entity/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: EntityUpdateParams, requestOptions: RequestOptions) {
      // put /udl/entity/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: EntityListParams, requestOptions: RequestOptions): EntityListPage =
        // get /udl/entity
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EntityDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/entity/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: EntityCountParams, requestOptions: RequestOptions): String =
        // get /udl/entity/count
        withRawResponse().count(params, requestOptions).parse()

    override fun getAllTypes(params: EntityGetAllTypesParams, requestOptions: RequestOptions): List<String> =
        // get /udl/entity/getAllTypes
        withRawResponse().getAllTypes(params, requestOptions).parse()

    override fun queryHelp(params: EntityQueryHelpParams, requestOptions: RequestOptions): EntityQueryHelpResponse =
        // get /udl/entity/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(params: EntityTupleParams, requestOptions: RequestOptions): List<EntityFull> =
        // get /udl/entity/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EntityService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService.WithRawResponse = EntityServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: EntityCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity")
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

        private val retrieveHandler: Handler<EntityFull> = jsonHandler<EntityFull>(clientOptions.jsonMapper)

        override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<EntityFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        override fun update(params: EntityUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        private val listHandler: Handler<List<EntityAbridged>> = jsonHandler<List<EntityAbridged>>(clientOptions.jsonMapper)

        override fun list(params: EntityListParams, requestOptions: RequestOptions): HttpResponseFor<EntityListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity")
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
                  EntityListPage.builder()
                      .service(EntityServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: EntityDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", params._pathParam(0))
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

        override fun count(params: EntityCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "count")
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

        private val getAllTypesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getAllTypes(params: EntityGetAllTypesParams, requestOptions: RequestOptions): HttpResponseFor<List<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "getAllTypes")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getAllTypesHandler.handle(it)
              }
          }
        }

        private val queryHelpHandler: Handler<EntityQueryHelpResponse> = jsonHandler<EntityQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: EntityQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<EntityQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "queryhelp")
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

        private val tupleHandler: Handler<List<EntityFull>> = jsonHandler<List<EntityFull>>(clientOptions.jsonMapper)

        override fun tuple(params: EntityTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<EntityFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "entity", "tuple")
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
