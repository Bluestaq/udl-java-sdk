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
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelGetFileParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelListPage
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelListParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelListResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.globalatmosphericmodel.HistoryService
import com.unifieddatalibrary.api.services.blocking.globalatmosphericmodel.HistoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GlobalAtmosphericModelServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalAtmosphericModelService {

    private val withRawResponse: GlobalAtmosphericModelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): GlobalAtmosphericModelService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalAtmosphericModelService =
        GlobalAtmosphericModelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    override fun retrieve(
        params: GlobalAtmosphericModelRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalAtmosphericModelRetrieveResponse =
        // get /udl/globalatmosphericmodel/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: GlobalAtmosphericModelListParams,
        requestOptions: RequestOptions,
    ): GlobalAtmosphericModelListPage =
        // get /udl/globalatmosphericmodel
        withRawResponse().list(params, requestOptions).parse()

    override fun count(
        params: GlobalAtmosphericModelCountParams,
        requestOptions: RequestOptions,
    ): String =
        // get /udl/globalatmosphericmodel/count
        withRawResponse().count(params, requestOptions).parse()

    override fun getFile(
        params: GlobalAtmosphericModelGetFileParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /udl/globalatmosphericmodel/getFile/{id}
        withRawResponse().getFile(params, requestOptions)

    override fun queryHelp(
        params: GlobalAtmosphericModelQueryHelpParams,
        requestOptions: RequestOptions,
    ): GlobalAtmosphericModelQueryHelpResponse =
        // get /udl/globalatmosphericmodel/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: GlobalAtmosphericModelTupleParams,
        requestOptions: RequestOptions,
    ): List<GlobalAtmosphericModelTupleResponse> =
        // get /udl/globalatmosphericmodel/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: GlobalAtmosphericModelUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-globalatmosphericmodel
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalAtmosphericModelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalAtmosphericModelService.WithRawResponse =
            GlobalAtmosphericModelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun history(): HistoryService.WithRawResponse = history

        private val retrieveHandler: Handler<GlobalAtmosphericModelRetrieveResponse> =
            jsonHandler<GlobalAtmosphericModelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalAtmosphericModelRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", params._pathParam(0))
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

        private val listHandler: Handler<List<GlobalAtmosphericModelListResponse>> =
            jsonHandler<List<GlobalAtmosphericModelListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalAtmosphericModelListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalAtmosphericModelListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel")
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
                        GlobalAtmosphericModelListPage.builder()
                            .service(GlobalAtmosphericModelServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(
            params: GlobalAtmosphericModelCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { countHandler.handle(it) }
            }
        }

        override fun getFile(
            params: GlobalAtmosphericModelGetFileParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "udl",
                        "globalatmosphericmodel",
                        "getFile",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val queryHelpHandler: Handler<GlobalAtmosphericModelQueryHelpResponse> =
            jsonHandler<GlobalAtmosphericModelQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: GlobalAtmosphericModelQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "queryhelp")
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

        private val tupleHandler: Handler<List<GlobalAtmosphericModelTupleResponse>> =
            jsonHandler<List<GlobalAtmosphericModelTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: GlobalAtmosphericModelTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "globalatmosphericmodel", "tuple")
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
            params: GlobalAtmosphericModelUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-globalatmosphericmodel")
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
