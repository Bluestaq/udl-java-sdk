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
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCountParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateBulkParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryHelpResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentQueryResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleResponse
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.featureassessment.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.featureassessment.HistoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeatureAssessmentServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : FeatureAssessmentServiceAsync {

    private val withRawResponse: FeatureAssessmentServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FeatureAssessmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentServiceAsync = FeatureAssessmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    override fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/featureassessment
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions): CompletableFuture<FeatureAssessmentRetrieveResponse> =
        // get /udl/featureassessment/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/featureassessment/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/featureassessment/createBulk
        withRawResponse().createBulk(params, requestOptions).thenAccept {}

    override fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions): CompletableFuture<List<FeatureAssessmentQueryResponse>> =
        // get /udl/featureassessment
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun queryHelp(params: FeatureAssessmentQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<FeatureAssessmentQueryHelpResponse> =
        // get /udl/featureassessment/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions): CompletableFuture<List<FeatureAssessmentTupleResponse>> =
        // get /udl/featureassessment/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    override fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /filedrop/udl-featureassessment
        withRawResponse().unvalidatedPublish(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : FeatureAssessmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureAssessmentServiceAsync.WithRawResponse = FeatureAssessmentServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: FeatureAssessmentCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment")
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

        private val retrieveHandler: Handler<FeatureAssessmentRetrieveResponse> = jsonHandler<FeatureAssessmentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: FeatureAssessmentRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FeatureAssessmentRetrieveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", params._pathParam(0))
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

        override fun count(params: FeatureAssessmentCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "count")
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

        override fun createBulk(params: FeatureAssessmentCreateBulkParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "createBulk")
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

        private val queryHandler: Handler<List<FeatureAssessmentQueryResponse>> = jsonHandler<List<FeatureAssessmentQueryResponse>>(clientOptions.jsonMapper)

        override fun query(params: FeatureAssessmentQueryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<FeatureAssessmentQueryResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment")
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

        private val queryHelpHandler: Handler<FeatureAssessmentQueryHelpResponse> = jsonHandler<FeatureAssessmentQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: FeatureAssessmentQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FeatureAssessmentQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "queryhelp")
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

        private val tupleHandler: Handler<List<FeatureAssessmentTupleResponse>> = jsonHandler<List<FeatureAssessmentTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(params: FeatureAssessmentTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<FeatureAssessmentTupleResponse>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "featureassessment", "tuple")
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

        override fun unvalidatedPublish(params: FeatureAssessmentUnvalidatedPublishParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("filedrop", "udl-featureassessment")
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
