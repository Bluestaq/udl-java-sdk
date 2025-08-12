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
import com.unifieddatalibrary.api.models.CountryFull
import com.unifieddatalibrary.api.models.countries.CountryAbridged
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryDeleteParams
import com.unifieddatalibrary.api.models.countries.CountryListPage
import com.unifieddatalibrary.api.models.countries.CountryListParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpParams
import com.unifieddatalibrary.api.models.countries.CountryQueryhelpResponse
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import com.unifieddatalibrary.api.services.blocking.CountryService
import com.unifieddatalibrary.api.services.blocking.CountryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CountryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CountryService {

    private val withRawResponse: CountryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CountryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService = CountryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: CountryCreateParams, requestOptions: RequestOptions) {
      // post /udl/country
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions): CountryFull =
        // get /udl/country/{code}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CountryUpdateParams, requestOptions: RequestOptions) {
      // put /udl/country/{code}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: CountryListParams, requestOptions: RequestOptions): CountryListPage =
        // get /udl/country
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CountryDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/country/{code}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: CountryCountParams, requestOptions: RequestOptions): String =
        // get /udl/country/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: CountryQueryhelpParams, requestOptions: RequestOptions): CountryQueryhelpResponse =
        // get /udl/country/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: CountryTupleParams, requestOptions: RequestOptions): List<CountryFull> =
        // get /udl/country/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CountryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryService.WithRawResponse = CountryServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: CountryCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
          }
        }

        private val retrieveHandler: Handler<CountryFull> = jsonHandler<CountryFull>(clientOptions.jsonMapper)

        override fun retrieve(params: CountryRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<CountryFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("code", params.code().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: CountryUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathCode", params.pathCode().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          }
        }

        private val listHandler: Handler<List<CountryAbridged>> = jsonHandler<List<CountryAbridged>>(clientOptions.jsonMapper)

        override fun list(params: CountryListParams, requestOptions: RequestOptions): HttpResponseFor<CountryListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country")
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
                  CountryListPage.builder()
                      .service(CountryServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: CountryDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("code", params.code().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: CountryCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "count")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  countHandler.handle(it)
              }
          }
        }

        private val queryhelpHandler: Handler<CountryQueryhelpResponse> = jsonHandler<CountryQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: CountryQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<CountryQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "queryhelp")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryhelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val tupleHandler: Handler<List<CountryFull>> = jsonHandler<List<CountryFull>>(clientOptions.jsonMapper)

        override fun tuple(params: CountryTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<CountryFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "country", "tuple")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  tupleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          }
        }
    }
}
