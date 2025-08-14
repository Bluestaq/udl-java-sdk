// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.diplomaticclearance

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
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListPage
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryRetrieveResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryTupleResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CountryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryService {

    private val withRawResponse: CountryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService =
        CountryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CountryCreateParams, requestOptions: RequestOptions) {
        // post /udl/diplomaticclearancecountry
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: CountryRetrieveParams,
        requestOptions: RequestOptions,
    ): CountryRetrieveResponse =
        // get /udl/diplomaticclearancecountry/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CountryUpdateParams, requestOptions: RequestOptions) {
        // put /udl/diplomaticclearancecountry/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: CountryListParams, requestOptions: RequestOptions): CountryListPage =
        // get /udl/diplomaticclearancecountry
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CountryDeleteParams, requestOptions: RequestOptions) {
        // delete /udl/diplomaticclearancecountry/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: CountryCountParams, requestOptions: RequestOptions): String =
        // get /udl/diplomaticclearancecountry/count
        withRawResponse().count(params, requestOptions).parse()

    override fun createBulk(params: CountryCreateBulkParams, requestOptions: RequestOptions) {
        // post /udl/diplomaticclearancecountry/createBulk
        withRawResponse().createBulk(params, requestOptions)
    }

    override fun queryHelp(
        params: CountryQueryHelpParams,
        requestOptions: RequestOptions,
    ): CountryQueryHelpResponse =
        // get /udl/diplomaticclearancecountry/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun tuple(
        params: CountryTupleParams,
        requestOptions: RequestOptions,
    ): List<CountryTupleResponse> =
        // get /udl/diplomaticclearancecountry/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    override fun unvalidatedPublish(
        params: CountryUnvalidatedPublishParams,
        requestOptions: RequestOptions,
    ) {
        // post /filedrop/udl-diplomaticclearancecountry
        withRawResponse().unvalidatedPublish(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CountryService.WithRawResponse =
            CountryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: CountryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<CountryRetrieveResponse> =
            jsonHandler<CountryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CountryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", params._pathParam(0))
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
            params: CountryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<CountryListResponse>> =
            jsonHandler<List<CountryListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: CountryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry")
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
                        CountryListPage.builder()
                            .service(CountryServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CountryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", params._pathParam(0))
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
            params: CountryCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", "count")
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
            params: CountryCreateBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", "createBulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createBulkHandler.handle(it) }
            }
        }

        private val queryHelpHandler: Handler<CountryQueryHelpResponse> =
            jsonHandler<CountryQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(
            params: CountryQueryHelpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryQueryHelpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", "queryhelp")
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

        private val tupleHandler: Handler<List<CountryTupleResponse>> =
            jsonHandler<List<CountryTupleResponse>>(clientOptions.jsonMapper)

        override fun tuple(
            params: CountryTupleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CountryTupleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("udl", "diplomaticclearancecountry", "tuple")
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
            params: CountryUnvalidatedPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("filedrop", "udl-diplomaticclearancecountry")
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
