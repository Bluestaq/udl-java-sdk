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
import com.unifieddatalibrary.api.models.BeamcontourFull
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCountParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateBulkParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourDeleteParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListPage
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListPageAsync
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpResponse
import com.unifieddatalibrary.api.models.beamcontours.BeamContourRetrieveParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourTupleParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourUpdateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamcontourAbridged
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeamContourServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : BeamContourServiceAsync {

    private val withRawResponse: BeamContourServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): BeamContourServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourServiceAsync = BeamContourServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BeamContourCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/beamcontour
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: BeamContourRetrieveParams, requestOptions: RequestOptions): CompletableFuture<BeamcontourFull> =
        // get /udl/beamcontour/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: BeamContourUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/beamcontour/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: BeamContourListParams, requestOptions: RequestOptions): CompletableFuture<BeamContourListPageAsync> =
        // get /udl/beamcontour
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: BeamContourDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/beamcontour/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: BeamContourCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/beamcontour/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: BeamContourCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/beamcontour/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun queryHelp(params: BeamContourQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<BeamContourQueryHelpResponse> =
        // get /udl/beamcontour/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: BeamContourTupleParams, requestOptions: RequestOptions): CompletableFuture<List<BeamcontourFull>> =
        // get /udl/beamcontour/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : BeamContourServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourServiceAsync.WithRawResponse = BeamContourServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: BeamContourCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour")
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

        private val retrieveHandler: Handler<BeamcontourFull> = jsonHandler<BeamcontourFull>(clientOptions.jsonMapper)

        override fun retrieve(params: BeamContourRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamcontourFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", params._pathParam(0))
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

        override fun update(params: BeamContourUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", params._pathParam(0))
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

        private val listHandler: Handler<List<BeamcontourAbridged>> = jsonHandler<List<BeamcontourAbridged>>(clientOptions.jsonMapper)

        override fun list(params: BeamContourListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamContourListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour")
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
                  BeamContourListPageAsync.builder()
                      .service(BeamContourServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: BeamContourDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", params._pathParam(0))
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

        override fun count(params: BeamContourCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", "count")
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

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(params: BeamContourCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", "createBulk")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createBulkHandler.handle(it)
              }
          } }
        }

        private val queryHelpHandler: Handler<BeamContourQueryHelpResponse> = jsonHandler<BeamContourQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: BeamContourQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BeamContourQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", "queryhelp")
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

        private val tupleHandler: Handler<List<BeamcontourFull>> = jsonHandler<List<BeamcontourFull>>(clientOptions.jsonMapper)

        override fun tuple(params: BeamContourTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<BeamcontourFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "beamcontour", "tuple")
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
