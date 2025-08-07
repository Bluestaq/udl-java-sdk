// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

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
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.BeamcontourFull
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCountParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateBulkParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourDeleteParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListPage
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpResponse
import com.unifieddatalibrary.api.models.beamcontours.BeamContourRetrieveParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourTupleParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourUpdateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamcontourAbridged
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeamContourServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BeamContourService {

    private val withRawResponse: BeamContourService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BeamContourService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourService =
        BeamContourServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BeamContourCreateParams, requestOptions: RequestOptions) {
        // post /udl/beamcontour
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: BeamContourRetrieveParams,
        requestOptions: RequestOptions,
    ): BeamcontourFull =
        // get /udl/beamcontour/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BeamContourUpdateParams, requestOptions: RequestOptions) {
        // put /udl/beamcontour/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: BeamContourListParams,
        requestOptions: RequestOptions,
    ): BeamContourListPage =
        // get /udl/beamcontour
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BeamContourDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/beamcontour/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: BeamContourCountParams, requestOptions: RequestOptions): String =
        // get /udl/beamcontour/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: BeamContourCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/beamcontour/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: BeamContourQueryHelpParams,
        requestOptions: RequestOptions,
    ): BeamContourQueryHelpResponse =
        // get /udl/beamcontour/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: BeamContourTupleParams,
        requestOptions: RequestOptions,
    ): List<BeamcontourFull> =
        // get /udl/beamcontour/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BeamContourService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BeamContourService.WithRawResponse =
            BeamContourServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: BeamContourCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<BeamcontourFull> =
            jsonHandler<BeamcontourFull>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BeamContourRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeamcontourFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: BeamContourUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<BeamcontourAbridged>> =
            jsonHandler<List<BeamcontourAbridged>>(clientOptions.jsonMapper)

        override fun list(
            params: BeamContourListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeamContourListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour")
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
                        BeamContourListPage.builder()
                            .service(BeamContourServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BeamContourDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: BeamContourCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        private val createBulkHandler: Handler<Void?> = emptyHandler()

        override fun createBulk(
            params: BeamContourCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<BeamContourQueryHelpResponse> =
            jsonHandler<BeamContourQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: BeamContourQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeamContourQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<BeamcontourFull>> =
            jsonHandler<List<BeamcontourFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: BeamContourTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BeamcontourFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "beamcontour", "tuple")
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
