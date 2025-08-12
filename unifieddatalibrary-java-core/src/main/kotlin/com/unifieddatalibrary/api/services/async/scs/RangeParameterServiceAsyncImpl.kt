// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

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
import com.unifieddatalibrary.api.models.scs.rangeparameters.RangeParameterListParams
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsync
import com.unifieddatalibrary.api.services.async.scs.RangeParameterServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RangeParameterServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RangeParameterServiceAsync {

    private val withRawResponse: RangeParameterServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RangeParameterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterServiceAsync = RangeParameterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: RangeParameterListParams, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        // get /scs/listRangeParameters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RangeParameterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RangeParameterServiceAsync.WithRawResponse = RangeParameterServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun list(params: RangeParameterListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("scs", "listRangeParameters")
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
          } }
        }
    }
}
