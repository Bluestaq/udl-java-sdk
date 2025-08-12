// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.handlers.errorBodyHandler
import com.unifieddatalibrary.api.core.handlers.errorHandler
import com.unifieddatalibrary.api.core.handlers.jsonHandler
import com.unifieddatalibrary.api.core.handlers.stringHandler
import com.unifieddatalibrary.api.core.http.HttpMethod
import com.unifieddatalibrary.api.core.http.HttpRequest
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponse.Handler
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.core.http.parseable
import com.unifieddatalibrary.api.core.prepare
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerQueryHelpParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerQueryHelpResponse
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveDataOwnerTypesParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveProviderMetadataParams
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerServiceImpl
import java.util.function.Consumer

class DataownerServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DataownerService {

    private val withRawResponse: DataownerService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DataownerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerService = DataownerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: DataownerRetrieveParams, requestOptions: RequestOptions): List<DataownerAbridged> =
        // get /udl/dataowner
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun count(params: DataownerCountParams, requestOptions: RequestOptions): String =
        // get /udl/dataowner/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryHelp(params: DataownerQueryHelpParams, requestOptions: RequestOptions): DataownerQueryHelpResponse =
        // get /udl/dataowner/queryhelp
        withRawResponse().queryHelp(params, requestOptions).parse()

    override fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams, requestOptions: RequestOptions): List<String> =
        // get /udl/dataowner/getDataOwnerTypes
        withRawResponse().retrieveDataOwnerTypes(params, requestOptions).parse()

    override fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams, requestOptions: RequestOptions): List<DataownerAbridged> =
        // get /udl/dataowner/providerMetadata
        withRawResponse().retrieveProviderMetadata(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DataownerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerService.WithRawResponse = DataownerServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val retrieveHandler: Handler<List<DataownerAbridged>> = jsonHandler<List<DataownerAbridged>>(clientOptions.jsonMapper)

        override fun retrieve(params: DataownerRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<List<DataownerAbridged>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "dataowner")
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
                    it.forEach { it.validate() }
                  }
              }
          }
        }

        private val countHandler: Handler<String> = stringHandler()

        override fun count(params: DataownerCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "dataowner", "count")
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

        private val queryHelpHandler: Handler<DataownerQueryHelpResponse> = jsonHandler<DataownerQueryHelpResponse>(clientOptions.jsonMapper)

        override fun queryHelp(params: DataownerQueryHelpParams, requestOptions: RequestOptions): HttpResponseFor<DataownerQueryHelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "dataowner", "queryhelp")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  queryHelpHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveDataOwnerTypesHandler: Handler<List<String>> = jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams, requestOptions: RequestOptions): HttpResponseFor<List<String>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "dataowner", "getDataOwnerTypes")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveDataOwnerTypesHandler.handle(it)
              }
          }
        }

        private val retrieveProviderMetadataHandler: Handler<List<DataownerAbridged>> = jsonHandler<List<DataownerAbridged>>(clientOptions.jsonMapper)

        override fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams, requestOptions: RequestOptions): HttpResponseFor<List<DataownerAbridged>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "dataowner", "providerMetadata")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  retrieveProviderMetadataHandler.handle(it)
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
