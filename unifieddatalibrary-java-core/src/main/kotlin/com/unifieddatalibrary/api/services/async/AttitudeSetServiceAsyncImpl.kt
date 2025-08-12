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
import com.unifieddatalibrary.api.models.AttitudesetFull
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCountParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCreateParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListPage
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListPageAsync
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetRetrieveParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetTupleParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetAbridged
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.attitudesets.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.attitudesets.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttitudeSetServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AttitudeSetServiceAsync {

    private val withRawResponse: AttitudeSetServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AttitudeSetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetServiceAsync = AttitudeSetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: AttitudeSetCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/attitudeset
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: AttitudeSetRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AttitudesetFull> =
        // get /udl/attitudeset/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: AttitudeSetListParams, requestOptions: RequestOptions): CompletableFuture<AttitudeSetListPageAsync> =
        // get /udl/attitudeset
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun count(params: AttitudeSetCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/attitudeset/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: AttitudeSetQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<AttitudeSetQueryHelpResponse> =
        // get /udl/attitudeset/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AttitudeSetTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AttitudesetFull>> =
        // get /udl/attitudeset/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-attitudeset
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AttitudeSetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeSetServiceAsync.WithRawResponse = AttitudeSetServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: AttitudeSetCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset")
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

        private val retrieveHandler: Handler<AttitudesetFull> = jsonHandler<AttitudesetFull>(clientOptions.jsonMapper)

        override fun retrieve(params: AttitudeSetRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudesetFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset", params._pathParam(0))
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

        private val listHandler: Handler<List<AttitudesetAbridged>> = jsonHandler<List<AttitudesetAbridged>>(clientOptions.jsonMapper)

        override fun list(params: AttitudeSetListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudeSetListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset")
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
                  AttitudeSetListPageAsync.builder()
                      .service(AttitudeSetServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: AttitudeSetCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset", "count")
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

        private val queryHelpHandler: Handler<AttitudeSetQueryHelpResponse> = jsonHandler<AttitudeSetQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: AttitudeSetQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudeSetQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset", "queryhelp")
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

        private val tupleHandler: Handler<List<AttitudesetFull>> = jsonHandler<List<AttitudesetFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AttitudeSetTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AttitudesetFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudeset", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(params: AttitudeSetUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-attitudeset")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  unvalidatedPublishHandler.handle(it)
              }
          } }
        }
    }
}
