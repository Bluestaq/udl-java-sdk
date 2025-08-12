// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.AttitudedataFull
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpParams
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataQueryHelpResponse
import com.unifieddatalibrary.api.models.attitudedata.AttitudeDataTupleParams
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AttitudeDataServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AttitudeDataServiceAsync {

    private val withRawResponse: AttitudeDataServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AttitudeDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync = AttitudeDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun queryHelp(params: AttitudeDataQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<AttitudeDataQueryHelpResponse> =
        // get /udl/attitudedata/queryhelp
        withRawResponse().queryHelp(params, requestOptions).thenApply { it.parse() }

    override fun tuple(params: AttitudeDataTupleParams, requestOptions: RequestOptions): CompletableFuture<List<AttitudedataFull>> =
        // get /udl/attitudedata/tuple
        withRawResponse().tuple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AttitudeDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync.WithRawResponse = AttitudeDataServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val queryHelpHandler: Handler<AttitudeDataQueryHelpResponse> = jsonHandler<AttitudeDataQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: AttitudeDataQueryHelpParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AttitudeDataQueryHelpResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudedata", "queryhelp")
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

        private val tupleHandler: Handler<List<AttitudedataFull>> = jsonHandler<List<AttitudedataFull>>(clientOptions.jsonMapper)

        override fun tuple(params: AttitudeDataTupleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<AttitudedataFull>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "attitudedata", "tuple")
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
