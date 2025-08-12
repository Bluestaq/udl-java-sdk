// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.OrganizationFull
import com.unifieddatalibrary.api.models.organization.OrganizationCountParams
import com.unifieddatalibrary.api.models.organization.OrganizationCreateParams
import com.unifieddatalibrary.api.models.organization.OrganizationDeleteParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationCategoriesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationTypesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetParams
import com.unifieddatalibrary.api.models.organization.OrganizationListPage
import com.unifieddatalibrary.api.models.organization.OrganizationListPageAsync
import com.unifieddatalibrary.api.models.organization.OrganizationListParams
import com.unifieddatalibrary.api.models.organization.OrganizationListResponse
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpResponse
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrganizationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OrganizationServiceAsync {

    private val withRawResponse: OrganizationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OrganizationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync = OrganizationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/organization
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/organization/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: OrganizationListParams, requestOptions: RequestOptions): CompletableFuture<OrganizationListPageAsync> =
        // get /udl/organization
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/organization/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: OrganizationCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/organization/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): CompletableFuture<OrganizationFull> =
        // get /udl/organization/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        // get /udl/organization/getOrganizationCategories
        withRawResponse().getOrganizationCategories(params, requestOptions).thenApply { it.parse() }

    override fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        // get /udl/organization/getOrganizationTypes
        withRawResponse().getOrganizationTypes(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: OrganizationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<OrganizationQueryhelpResponse> =
        // get /udl/organization/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions): CompletableFuture<List<OrganizationFull>> =
        // get /udl/organization/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync.WithRawResponse = OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          } }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<List<OrganizationListResponse>> = jsonHandler<List<OrganizationListResponse>>(clientOptions.jsonMapper)

        override fun list(params: OrganizationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  OrganizationListPageAsync.builder()
                      .service(OrganizationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: OrganizationCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "count")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          } }
        }

        private val getHandler: Handler<OrganizationFull> = jsonHandler<OrganizationFull>(clientOptions.jsonMapper)

        override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrganizationFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val getOrganizationCategoriesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "getOrganizationCategories")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getOrganizationCategoriesHandler.handle(it)
              }
          } }
        }

        private val getOrganizationTypesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "getOrganizationTypes")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  getOrganizationTypesHandler.handle(it)
              }
          } }
        }

        private val queryhelpHandler: Handler<OrganizationQueryhelpResponse> = jsonHandler<OrganizationQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: OrganizationQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrganizationQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<OrganizationFull>> = jsonHandler<List<OrganizationFull>>(clientOptions.jsonMapper)

        override fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OrganizationFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "organization", "tuple")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }
    }
}
