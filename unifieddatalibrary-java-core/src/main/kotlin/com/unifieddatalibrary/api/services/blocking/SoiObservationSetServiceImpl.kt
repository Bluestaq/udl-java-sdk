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
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCountParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateBulkParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetGetParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListPage
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListResponse
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpResponse
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetTupleParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.soiobservationset.history.SoiObservationSetFull
import com.unifieddatalibrary.api.services.blocking.soiobservationset.HistoryService
import com.unifieddatalibrary.api.services.blocking.soiobservationset.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SoiObservationSetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SoiObservationSetService {

    private val withRawResponse: SoiObservationSetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): SoiObservationSetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SoiObservationSetService =
        SoiObservationSetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun create(params: SoiObservationSetCreateParams, requestOptions: RequestOptions) {
        // post /udl/soiobservationset
        withRawResponse().create(params, requestOptions)
    }

    override fun list(
        params: SoiObservationSetListParams,
        requestOptions: RequestOptions,
    ): SoiObservationSetListPage =
        // get /udl/soiobservationset
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: SoiObservationSetCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/soiobservationset/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(
        params: SoiObservationSetCreateBulkParams,
        requestOptions: RequestOptions,
    ) {
        // post /udl/soiobservationset/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun get(
        params: SoiObservationSetGetParams,
        requestOptions: RequestOptions,
    ): SoiObservationSetFull =
        // get /udl/soiobservationset/{id}
        withRawResponse().get(params, requestOptions).parse()

    override fun queryhelp(
        params: SoiObservationSetQueryhelpParams,
        requestOptions: RequestOptions,
    ): SoiObservationSetQueryhelpResponse =
        // get /udl/soiobservationset/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(
        params: SoiObservationSetTupleParams,
        requestOptions: RequestOptions,
    ): List<SoiObservationSetFull> =
        // get /udl/soiobservationset/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: SoiObservationSetUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-soiobservationset
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SoiObservationSetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SoiObservationSetService.WithRawResponse =
            SoiObservationSetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SoiObservationSetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<SoiObservationSetListResponse>> =
            jsonHandler<List<SoiObservationSetListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SoiObservationSetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SoiObservationSetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset")
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
                        SoiObservationSetListPage.builder()
                            .service(SoiObservationSetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: SoiObservationSetCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset", "count")
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
            params: SoiObservationSetCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SoiObservationSetFull> =
            jsonHandler<SoiObservationSetFull>(clientOptions.jsonMapper)

        override fun get(
            params: SoiObservationSetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SoiObservationSetFull> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryhelpHandler: Handler<SoiObservationSetQueryhelpResponse> =
            jsonHandler<SoiObservationSetQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(
            params: SoiObservationSetQueryhelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SoiObservationSetQueryhelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset", "queryhelp")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryhelpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tupleHandler: Handler<List<SoiObservationSetFull>> =
            jsonHandler<List<SoiObservationSetFull>>(clientOptions.jsonMapper)

        override fun tuple(
            params: SoiObservationSetTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SoiObservationSetFull>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "soiobservationset", "tuple")
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

        private val unvalidatedPublishHandler: Handler<Void?> = emptyHandler()

        override fun unvalidatedPublish(
            params: SoiObservationSetUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-soiobservationset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unvalidatedPublishHandler.handle(it) }
            }
        }
    }
}
