// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.elsets

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
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetAbridged
import com.unifieddatalibrary.api.models.elsets.current.CurrentListPage
import com.unifieddatalibrary.api.models.elsets.current.CurrentListParams
import com.unifieddatalibrary.api.models.elsets.current.CurrentTupleParams
import java.util.function.Consumer

class CurrentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentService {

    private val withRawResponse: CurrentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CurrentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService =
        CurrentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: CurrentListParams, requestOptions: RequestOptions): CurrentListPage =
        // get /udl/elset/current
        withRawResponse().list(params, requestOptions).parse()

    override fun tuple(params: CurrentTupleParams, requestOptions: RequestOptions): List<Elset> =
        // get /udl/elset/current/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentService.WithRawResponse =
            CurrentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<ElsetAbridged>> =
            jsonHandler<List<ElsetAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: CurrentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "current")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        CurrentListPage.builder()
                            .service(CurrentServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val tupleHandler: Handler<List<Elset>> =
            jsonHandler<List<Elset>>(clientOptions.jsonMapper)

        override fun tuple(
            params: CurrentTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Elset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "elset", "current", "tuple")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { tupleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
