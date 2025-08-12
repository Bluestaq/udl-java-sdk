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
import com.unifieddatalibrary.api.models.ChannelFull
import com.unifieddatalibrary.api.models.channels.ChannelAbridged
import com.unifieddatalibrary.api.models.channels.ChannelCountParams
import com.unifieddatalibrary.api.models.channels.ChannelCreateParams
import com.unifieddatalibrary.api.models.channels.ChannelDeleteParams
import com.unifieddatalibrary.api.models.channels.ChannelListPage
import com.unifieddatalibrary.api.models.channels.ChannelListParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpParams
import com.unifieddatalibrary.api.models.channels.ChannelQueryhelpResponse
import com.unifieddatalibrary.api.models.channels.ChannelRetrieveParams
import com.unifieddatalibrary.api.models.channels.ChannelTupleParams
import com.unifieddatalibrary.api.models.channels.ChannelUpdateParams
import com.unifieddatalibrary.api.services.blocking.ChannelService
import com.unifieddatalibrary.api.services.blocking.ChannelServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ChannelService {

    private val withRawResponse: ChannelService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ChannelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService = ChannelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ChannelCreateParams, requestOptions: RequestOptions) {
      // post /udl/channel
      withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: ChannelRetrieveParams, requestOptions: RequestOptions): ChannelFull =
        // get /udl/channel/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ChannelUpdateParams, requestOptions: RequestOptions) {
      // put /udl/channel/{id}
      withRawResponse().update(params, requestOptions)
    }

    override fun list(params: ChannelListParams, requestOptions: RequestOptions): ChannelListPage =
        // get /udl/channel
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ChannelDeleteParams, requestOptions: RequestOptions) {
      // delete /udl/channel/{id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun count(params: ChannelCountParams, requestOptions: RequestOptions): String =
        // get /udl/channel/count
        withRawResponse().count(params, requestOptions).parse()

    override fun queryhelp(params: ChannelQueryhelpParams, requestOptions: RequestOptions): ChannelQueryhelpResponse =
        // get /udl/channel/queryhelp
        withRawResponse().queryhelp(params, requestOptions).parse()

    override fun tuple(params: ChannelTupleParams, requestOptions: RequestOptions): List<ChannelFull> =
        // get /udl/channel/tuple
        withRawResponse().tuple(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ChannelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService.WithRawResponse = ChannelServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: ChannelCreateParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel")
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

        private val retrieveHandler: Handler<ChannelFull> = jsonHandler<ChannelFull>(clientOptions.jsonMapper)

        override fun retrieve(params: ChannelRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<ChannelFull> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", params._pathParam(0))
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

        override fun update(params: ChannelUpdateParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathId", params.pathId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", params._pathParam(0))
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

        private val listHandler: Handler<List<ChannelAbridged>> = jsonHandler<List<ChannelAbridged>>(clientOptions.jsonMapper)

        override fun list(params: ChannelListParams, requestOptions: RequestOptions): HttpResponseFor<ChannelListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel")
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
                  ChannelListPage.builder()
                      .service(ChannelServiceImpl(clientOptions))
                      .params(params)
                      .items(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ChannelDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", params._pathParam(0))
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

        override fun count(params: ChannelCountParams, requestOptions: RequestOptions): HttpResponseFor<String> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", "count")
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

        private val queryhelpHandler: Handler<ChannelQueryhelpResponse> = jsonHandler<ChannelQueryhelpResponse>(clientOptions.jsonMapper)

        override fun queryhelp(params: ChannelQueryhelpParams, requestOptions: RequestOptions): HttpResponseFor<ChannelQueryhelpResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", "queryhelp")
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

        private val tupleHandler: Handler<List<ChannelFull>> = jsonHandler<List<ChannelFull>>(clientOptions.jsonMapper)

        override fun tuple(params: ChannelTupleParams, requestOptions: RequestOptions): HttpResponseFor<List<ChannelFull>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("udl", "channel", "tuple")
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
