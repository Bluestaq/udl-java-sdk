// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingListTopicsParams
import com.unifieddatalibrary.api.models.securemessaging.TopicDetails
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SecureMessagingServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecureMessagingServiceAsync

    /** Retrieve the details of the specified topic or data type. */
    fun describeTopic(topic: String): CompletableFuture<TopicDetails> =
        describeTopic(
          topic, SecureMessagingDescribeTopicParams.none()
        )

    /** @see describeTopic */
    fun describeTopic(topic: String, params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TopicDetails> =
        describeTopic(
          params.toBuilder()
              .topic(topic)
              .build(), requestOptions
        )

    /** @see describeTopic */
    fun describeTopic(topic: String, params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none()): CompletableFuture<TopicDetails> =
        describeTopic(
          topic,
          params,
          RequestOptions.none(),
        )

    /** @see describeTopic */
    fun describeTopic(params: SecureMessagingDescribeTopicParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TopicDetails>

    /** @see describeTopic */
    fun describeTopic(params: SecureMessagingDescribeTopicParams): CompletableFuture<TopicDetails> =
        describeTopic(
          params, RequestOptions.none()
        )

    /** @see describeTopic */
    fun describeTopic(topic: String, requestOptions: RequestOptions): CompletableFuture<TopicDetails> =
        describeTopic(
          topic,
          SecureMessagingDescribeTopicParams.none(),
          requestOptions,
        )

    /** Returns the current/latest offset for the passed topic name. */
    fun getLatestOffset(topic: String): CompletableFuture<Void?> =
        getLatestOffset(
          topic, SecureMessagingGetLatestOffsetParams.none()
        )

    /** @see getLatestOffset */
    fun getLatestOffset(topic: String, params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        getLatestOffset(
          params.toBuilder()
              .topic(topic)
              .build(), requestOptions
        )

    /** @see getLatestOffset */
    fun getLatestOffset(topic: String, params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none()): CompletableFuture<Void?> =
        getLatestOffset(
          topic,
          params,
          RequestOptions.none(),
        )

    /** @see getLatestOffset */
    fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see getLatestOffset */
    fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams): CompletableFuture<Void?> =
        getLatestOffset(
          params, RequestOptions.none()
        )

    /** @see getLatestOffset */
    fun getLatestOffset(topic: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getLatestOffset(
          topic,
          SecureMessagingGetLatestOffsetParams.none(),
          requestOptions,
        )

    /** Retrieve a set of messages from the given topic at the given offset. See Help > Secure Messaging API on Storefront for more details on how to use getMessages. */
    fun getMessages(offset: Long, params: SecureMessagingGetMessagesParams): CompletableFuture<Void?> =
        getMessages(
          offset,
          params,
          RequestOptions.none(),
        )

    /** @see getMessages */
    fun getMessages(offset: Long, params: SecureMessagingGetMessagesParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        getMessages(
          params.toBuilder()
              .offset(offset)
              .build(), requestOptions
        )

    /** @see getMessages */
    fun getMessages(params: SecureMessagingGetMessagesParams): CompletableFuture<Void?> =
        getMessages(
          params, RequestOptions.none()
        )

    /** @see getMessages */
    fun getMessages(params: SecureMessagingGetMessagesParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Retrieve the list of available secure messaging topics or data types available. */
    fun listTopics(): CompletableFuture<List<TopicDetails>> = listTopics(SecureMessagingListTopicsParams.none())

    /** @see listTopics */
    fun listTopics(params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<TopicDetails>>

    /** @see listTopics */
    fun listTopics(params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none()): CompletableFuture<List<TopicDetails>> =
        listTopics(
          params, RequestOptions.none()
        )

    /** @see listTopics */
    fun listTopics(requestOptions: RequestOptions): CompletableFuture<List<TopicDetails>> =
        listTopics(
          SecureMessagingListTopicsParams.none(), requestOptions
        )

    /** A view of [SecureMessagingServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecureMessagingServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /sm/describeTopic/{topic}`, but is otherwise the same as [SecureMessagingServiceAsync.describeTopic]. */
        fun describeTopic(topic: String): CompletableFuture<HttpResponseFor<TopicDetails>> =
            describeTopic(
              topic, SecureMessagingDescribeTopicParams.none()
            )

        /** @see describeTopic */
        fun describeTopic(topic: String, params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TopicDetails>> =
            describeTopic(
              params.toBuilder()
                  .topic(topic)
                  .build(), requestOptions
            )

        /** @see describeTopic */
        fun describeTopic(topic: String, params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none()): CompletableFuture<HttpResponseFor<TopicDetails>> =
            describeTopic(
              topic,
              params,
              RequestOptions.none(),
            )

        /** @see describeTopic */
        fun describeTopic(params: SecureMessagingDescribeTopicParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TopicDetails>>

        /** @see describeTopic */
        fun describeTopic(params: SecureMessagingDescribeTopicParams): CompletableFuture<HttpResponseFor<TopicDetails>> =
            describeTopic(
              params, RequestOptions.none()
            )

        /** @see describeTopic */
        fun describeTopic(topic: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TopicDetails>> =
            describeTopic(
              topic,
              SecureMessagingDescribeTopicParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /sm/getLatestOffset/{topic}`, but is otherwise the same as [SecureMessagingServiceAsync.getLatestOffset]. */
        fun getLatestOffset(topic: String): CompletableFuture<HttpResponse> =
            getLatestOffset(
              topic, SecureMessagingGetLatestOffsetParams.none()
            )

        /** @see getLatestOffset */
        fun getLatestOffset(topic: String, params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            getLatestOffset(
              params.toBuilder()
                  .topic(topic)
                  .build(), requestOptions
            )

        /** @see getLatestOffset */
        fun getLatestOffset(topic: String, params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none()): CompletableFuture<HttpResponse> =
            getLatestOffset(
              topic,
              params,
              RequestOptions.none(),
            )

        /** @see getLatestOffset */
        fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see getLatestOffset */
        fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams): CompletableFuture<HttpResponse> =
            getLatestOffset(
              params, RequestOptions.none()
            )

        /** @see getLatestOffset */
        fun getLatestOffset(topic: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatestOffset(
              topic,
              SecureMessagingGetLatestOffsetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /sm/getMessages/{topic}/{offset}`, but is otherwise the same as [SecureMessagingServiceAsync.getMessages]. */
        fun getMessages(offset: Long, params: SecureMessagingGetMessagesParams): CompletableFuture<HttpResponse> =
            getMessages(
              offset,
              params,
              RequestOptions.none(),
            )

        /** @see getMessages */
        fun getMessages(offset: Long, params: SecureMessagingGetMessagesParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            getMessages(
              params.toBuilder()
                  .offset(offset)
                  .build(), requestOptions
            )

        /** @see getMessages */
        fun getMessages(params: SecureMessagingGetMessagesParams): CompletableFuture<HttpResponse> =
            getMessages(
              params, RequestOptions.none()
            )

        /** @see getMessages */
        fun getMessages(params: SecureMessagingGetMessagesParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /sm/listTopics`, but is otherwise the same as [SecureMessagingServiceAsync.listTopics]. */
        fun listTopics(): CompletableFuture<HttpResponseFor<List<TopicDetails>>> = listTopics(SecureMessagingListTopicsParams.none())

        /** @see listTopics */
        fun listTopics(params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<TopicDetails>>>

        /** @see listTopics */
        fun listTopics(params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none()): CompletableFuture<HttpResponseFor<List<TopicDetails>>> =
            listTopics(
              params, RequestOptions.none()
            )

        /** @see listTopics */
        fun listTopics(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<TopicDetails>>> =
            listTopics(
              SecureMessagingListTopicsParams.none(), requestOptions
            )
    }
}
