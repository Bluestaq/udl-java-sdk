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
import com.unifieddatalibrary.api.models.BeamFull
import com.unifieddatalibrary.api.models.beam.BeamAbridged
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamDeleteParams
import com.unifieddatalibrary.api.models.beam.BeamListPage
import com.unifieddatalibrary.api.models.beam.BeamListPageAsync
import com.unifieddatalibrary.api.models.beam.BeamListParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpResponse
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import com.unifieddatalibrary.api.services.async.BeamServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeamServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : BeamServiceAsync {

    private val withRawResponse: BeamServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): BeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamServiceAsync = BeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BeamCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/beam
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions): CompletableFuture<BeamFull> =
        // get /udl/beam/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: BeamUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/beam/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: BeamListParams, requestOptions: RequestOptions): CompletableFuture<BeamListPageAsync> =
        // get /udl/beam
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: BeamDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/beam/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: BeamCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/beam/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: BeamQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<BeamQueryHelpResponse> =
        // get /udl/beam/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: BeamTupleParams, requestOptions: RequestOptions): CompletableFuture<List<BeamFull>> =
        // get /udl/beam/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : BeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamServiceAsync.WithRawResponse = BeamServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: BeamCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam")
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

        private val retrieveHandler: Handler<BeamFull> = jsonHandler<BeamFull>(clientOptions.jsonMapper)

        override fun retrieve(params: BeamRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: BeamUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
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

        private val listHandler: Handler<List<BeamAbridged>> = jsonHandler<List<BeamAbridged>>(clientOptions.jsonMapper)

        override fun list(params: BeamListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam")
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
                  BeamListPageAsync.builder()
                      .service(BeamServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: BeamDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", params._pathParam(0))
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

        override fun count(params: BeamCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "count")
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

        private val queryHelpHandler: Handler<BeamQueryHelpResponse> = jsonHandler<BeamQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: BeamQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "queryhelp")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val tupleHandler: Handler<List<BeamFull>> = jsonHandler<List<BeamFull>>(clientOptions.jsonMapper)

        override fun tuple(params: BeamTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<BeamFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beam", "tuple")
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
