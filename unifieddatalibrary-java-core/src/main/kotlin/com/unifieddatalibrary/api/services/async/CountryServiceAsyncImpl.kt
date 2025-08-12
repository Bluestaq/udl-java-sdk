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
import com.unifieddatalibrary.api.models.CountryFull
import com.unifieddatalibrary.api.models.countries.CountryAbridged
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryDeleteParams
import com.unifieddatalibrary.api.models.countries.CountryListPage
import com.unifieddatalibrary.api.models.countries.CountryListPageAsync
import com.unifieddatalibrary.api.models.countries.CountryListParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpResponse
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.CountryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CountryServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CountryServiceAsync {

    private val withRawResponse: CountryServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CountryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryServiceAsync = CountryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CountryCreateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // post /udl/country
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions): CompletableFuture<CountryFull> =
        // get /udl/country/{code}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: CountryUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // put /udl/country/{code}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: CountryListParams, requestOptions: RequestOptions): CompletableFuture<CountryListPageAsync> =
        // get /udl/country
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: CountryDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /udl/country/{code}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun count(params: CountryCountParams, requestOptions: RequestOptions): CompletableFuture<String> =
        // get /udl/country/count
        withRawResponse().count(params, requestOptions).thenApply { it.parse() }

    override fun queryhelp(params: CountryQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<CountryQueryhelpResponse> =
        // get /udl/country/queryhelp
        withRawResponse().queryhelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: CountryTupleParams, requestOptions: RequestOptions): CompletableFuture<List<CountryFull>> =
        // get /udl/country/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CountryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryServiceAsync.WithRawResponse = CountryServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CountryCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country")
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

        private val retrieveHandler: Handler<CountryFull> = jsonHandler<CountryFull>(clientOptions.jsonMapper)

        override fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryFull>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("code", params.code().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
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

        override fun update(params: CountryUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathCode", params.pathCode().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
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

        private val listHandler: Handler<List<CountryAbridged>> = jsonHandler<List<CountryAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CountryListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country")
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
                  CountryListPageAsync.builder()
                      .service(CountryServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .items(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: CountryDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("code", params.code().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
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

        override fun count(params: CountryCountParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "count")
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

        private val queryhelpHandler: Handler<CountryQueryhelpResponse> = jsonHandler<CountryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: CountryQueryhelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CountryQueryhelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "queryhelp")
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

        private val tupleHandler: Handler<List<CountryFull>> = jsonHandler<List<CountryFull>>(clientOptions.jsonMapper)

        override fun tuple(params: CountryTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<CountryFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "tuple")
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
