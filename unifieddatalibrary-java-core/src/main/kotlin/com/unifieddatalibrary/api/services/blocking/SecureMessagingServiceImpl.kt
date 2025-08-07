// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.handlers.emptyHandler
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
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingListTopicsParams
import com.unifieddatalibrary.api.models.securemessaging.TopicDetails
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SecureMessagingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SecureMessagingService {

    private val withRawResponse: SecureMessagingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecureMessagingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecureMessagingService =
        SecureMessagingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun describeTopic(
        params: SecureMessagingDescribeTopicParams,
        requestOptions: RequestOptions,
    ): TopicDetails =
        // get /sm/describeTopic/{topic}
        withRawResponse().describeTopic(params, requestOptions).parse()

    override fun getLatestOffset(
        params: SecureMessagingGetLatestOffsetParams,
        requestOptions: RequestOptions,
    ) {
        // get /sm/getLatestOffset/{topic}
        withRawResponse().getLatestOffset(params, requestOptions)
    }

    override fun getMessages(
        params: SecureMessagingGetMessagesParams,
        requestOptions: RequestOptions,
    ) {
        // get /sm/getMessages/{topic}/{offset}
        withRawResponse().getMessages(params, requestOptions)
    }

    override fun listTopics(
        params: SecureMessagingListTopicsParams,
        requestOptions: RequestOptions,
    ): List<TopicDetails> =
        // get /sm/listTopics
        withRawResponse().listTopics(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecureMessagingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecureMessagingService.WithRawResponse =
            SecureMessagingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val describeTopicHandler: Handler<TopicDetails> =
            jsonHandler<TopicDetails>(clientOptions.jsonMapper)

        override fun describeTopic(
            params: SecureMessagingDescribeTopicParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopicDetails> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topic", params.topic().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "describeTopic", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { describeTopicHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLatestOffsetHandler: Handler<Void?> = emptyHandler()

        override fun getLatestOffset(
            params: SecureMessagingGetLatestOffsetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topic", params.topic().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "getLatestOffset", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getLatestOffsetHandler.handle(it) }
            }
        }

        private val getMessagesHandler: Handler<Void?> = emptyHandler()

        override fun getMessages(
            params: SecureMessagingGetMessagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sm",
                        "getMessages",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getMessagesHandler.handle(it) }
            }
        }

        private val listTopicsHandler: Handler<List<TopicDetails>> =
            jsonHandler<List<TopicDetails>>(clientOptions.jsonMapper)

        override fun listTopics(
            params: SecureMessagingListTopicsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TopicDetails>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "listTopics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopicsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
