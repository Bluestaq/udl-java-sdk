// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.evac

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.models.evac.tuple.TupleListPage
import com.unifieddatalibrary.api.models.evac.tuple.TupleListParams
import com.unifieddatalibrary.api.services.blocking.evac.TupleService
import com.unifieddatalibrary.api.services.blocking.evac.TupleServiceImpl
import java.util.function.Consumer

class TupleServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TupleService {

    private val withRawResponse: TupleService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): TupleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleService = TupleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: TupleListParams, requestOptions: RequestOptions): TupleListPage =
        // get /udl/evac/tuple
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TupleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TupleService.WithRawResponse = TupleServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<EvacFull>> = jsonHandler<List<EvacFull>>(clientOptions.jsonMapper)

        override fun list(params: TupleListParams, requestOptions: RequestOptions): HttpResponseFor<TupleListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "evac", "tuple")
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
                  TupleListPage.builder()
                      .service(TupleServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }
    }
}
