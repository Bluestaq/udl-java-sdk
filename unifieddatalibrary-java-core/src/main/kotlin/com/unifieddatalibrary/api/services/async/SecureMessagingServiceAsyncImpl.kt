// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.core.prepareAsync
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingListTopicsParams
import com.unifieddatalibrary.api.models.securemessaging.TopicDetails
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SecureMessagingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SecureMessagingServiceAsync {

    private val withRawResponse: SecureMessagingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecureMessagingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SecureMessagingServiceAsync =
        SecureMessagingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun describeTopic(
        params: SecureMessagingDescribeTopicParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TopicDetails> =
        // get /sm/describeTopic/{topic}
        withRawResponse().describeTopic(params, requestOptions).thenApply { it.parse() }

    override fun getLatestOffset(
        params: SecureMessagingGetLatestOffsetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /sm/getLatestOffset/{topic}
        withRawResponse().getLatestOffset(params, requestOptions).thenAccept {}

    override fun getMessages(
        params: SecureMessagingGetMessagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /sm/getMessages/{topic}/{offset}
        withRawResponse().getMessages(params, requestOptions).thenAccept {}

    override fun listTopics(
        params: SecureMessagingListTopicsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TopicDetails>> =
        // get /sm/listTopics
        withRawResponse().listTopics(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecureMessagingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecureMessagingServiceAsync.WithRawResponse =
            SecureMessagingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val describeTopicHandler: Handler<TopicDetails> =
            jsonHandler<TopicDetails>(clientOptions.jsonMapper)

        override fun describeTopic(
            params: SecureMessagingDescribeTopicParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TopicDetails>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topic", params.topic().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "describeTopic", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { describeTopicHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLatestOffsetHandler: Handler<Void?> = emptyHandler()

        override fun getLatestOffset(
            params: SecureMessagingGetLatestOffsetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topic", params.topic().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "getLatestOffset", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getLatestOffsetHandler.handle(it) }
                    }
                }
        }

        private val getMessagesHandler: Handler<Void?> = emptyHandler()

        override fun getMessages(
            params: SecureMessagingGetMessagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getMessagesHandler.handle(it) }
                    }
                }
        }

        private val listTopicsHandler: Handler<List<TopicDetails>> =
            jsonHandler<List<TopicDetails>>(clientOptions.jsonMapper)

        override fun listTopics(
            params: SecureMessagingListTopicsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TopicDetails>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sm", "listTopics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
