// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.json
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CrewpaperServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CrewpaperService {

    private val withRawResponse: CrewpaperService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CrewpaperService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewpaperService =
        CrewpaperServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unpublish(params: CrewpaperUnpublishParams, requestOptions: RequestOptions) {
        // post /udl/crewpapers/unpublish
        withRawResponse().unpublish(params, requestOptions)
    }

    override fun uploadPdf(params: CrewpaperUploadPdfParams, requestOptions: RequestOptions) {
        // post /filedrop/crewpapers
        withRawResponse().uploadPdf(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrewpaperService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrewpaperService.WithRawResponse =
            CrewpaperServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val unpublishHandler: Handler<Void?> = emptyHandler()

        override fun unpublish(
            params: CrewpaperUnpublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "crewpapers", "unpublish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unpublishHandler.handle(it) }
            }
        }

        private val uploadPdfHandler: Handler<Void?> = emptyHandler()

        override fun uploadPdf(
            params: CrewpaperUploadPdfParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileContent", params._body().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "crewpapers")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadPdfHandler.handle(it) }
            }
        }
    }
}
