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
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelGetFileParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.globalatmosphericmodel.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.globalatmosphericmodel.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GlobalAtmosphericModelServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GlobalAtmosphericModelServiceAsync {

    private val withRawResponse: GlobalAtmosphericModelServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GlobalAtmosphericModelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelServiceAsync = GlobalAtmosphericModelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        // get /udl/globalatmosphericmodel/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/globalatmosphericmodel/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        // get /udl/globalatmosphericmodel/getFile/{id}
        withRawResponse().getFile(params, requestOptions)

    override fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions): CompletableFuture<List<GlobalAtmosphericModelQueryResponse>> =
        // get /udl/globalatmosphericmodel
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<GlobalAtmosphericModelQueryHelpResponse> =
        // get /udl/globalatmosphericmodel/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions): CompletableFuture<List<GlobalAtmosphericModelTupleResponse>> =
        // get /udl/globalatmosphericmodel/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-globalatmosphericmodel
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GlobalAtmosphericModelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelServiceAsync.WithRawResponse = GlobalAtmosphericModelServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val retrieveHandler: Handler<GlobalAtmosphericModelRetrieveResponse> = jsonHandler<GlobalAtmosphericModelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel", params._pathParam(0))
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

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel", "count")
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

        override fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel", "getFile", params._pathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response) }
        }

        private val queryHandler: Handler<List<GlobalAtmosphericModelQueryResponse>> = jsonHandler<List<GlobalAtmosphericModelQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelQueryResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  queryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val queryHelpHandler: Handler<GlobalAtmosphericModelQueryHelpResponse> = jsonHandler<GlobalAtmosphericModelQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel", "queryhelp")
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

        private val tupleHandler: Handler<List<GlobalAtmosphericModelTupleResponse>> = jsonHandler<List<GlobalAtmosphericModelTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "globalatmosphericmodel", "tuple")
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

        override fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-globalatmosphericmodel")
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
