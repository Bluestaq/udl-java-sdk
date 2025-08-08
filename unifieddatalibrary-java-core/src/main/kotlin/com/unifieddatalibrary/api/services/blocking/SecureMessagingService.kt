// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesPage
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingListTopicsParams
import com.unifieddatalibrary.api.models.securemessaging.TopicDetails
import java.util.function.Consumer

interface SecureMessagingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecureMessagingService

    /** Retrieve the details of the specified topic or data type. */
    fun describeTopic(topic: String): TopicDetails =
        describeTopic(topic, SecureMessagingDescribeTopicParams.none())

    /** @see describeTopic */
    fun describeTopic(
        topic: String,
        params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopicDetails = describeTopic(params.toBuilder().topic(topic).build(), requestOptions)

    /** @see describeTopic */
    fun describeTopic(
        topic: String,
        params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(),
    ): TopicDetails = describeTopic(topic, params, RequestOptions.none())

    /** @see describeTopic */
    fun describeTopic(
        params: SecureMessagingDescribeTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopicDetails

    /** @see describeTopic */
    fun describeTopic(params: SecureMessagingDescribeTopicParams): TopicDetails =
        describeTopic(params, RequestOptions.none())

    /** @see describeTopic */
    fun describeTopic(topic: String, requestOptions: RequestOptions): TopicDetails =
        describeTopic(topic, SecureMessagingDescribeTopicParams.none(), requestOptions)

    /** Returns the current/latest offset for the passed topic name. */
    fun getLatestOffset(topic: String) =
        getLatestOffset(topic, SecureMessagingGetLatestOffsetParams.none())

    /** @see getLatestOffset */
    fun getLatestOffset(
        topic: String,
        params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getLatestOffset(params.toBuilder().topic(topic).build(), requestOptions)

    /** @see getLatestOffset */
    fun getLatestOffset(
        topic: String,
        params: SecureMessagingGetLatestOffsetParams = SecureMessagingGetLatestOffsetParams.none(),
    ) = getLatestOffset(topic, params, RequestOptions.none())

    /** @see getLatestOffset */
    fun getLatestOffset(
        params: SecureMessagingGetLatestOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getLatestOffset */
    fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams) =
        getLatestOffset(params, RequestOptions.none())

    /** @see getLatestOffset */
    fun getLatestOffset(topic: String, requestOptions: RequestOptions) =
        getLatestOffset(topic, SecureMessagingGetLatestOffsetParams.none(), requestOptions)

    /**
     * Retrieve a set of messages from the given topic at the given offset. See Help > Secure
     * Messaging API on Storefront for more details on how to use getMessages.
     */
    fun getMessages(offset: Long, params: SecureMessagingGetMessagesParams) =
        getMessages(offset, params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        offset: Long,
        params: SecureMessagingGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecureMessagingGetMessagesPage =
        getMessages(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(params: SecureMessagingGetMessagesParams): SecureMessagingGetMessagesPage =
        getMessages(params, RequestOptions.none())

    /** @see getMessages */
    fun getMessages(
        params: SecureMessagingGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecureMessagingGetMessagesPage

    /** Retrieve the list of available secure messaging topics or data types available. */
    fun listTopics(): List<TopicDetails> = listTopics(SecureMessagingListTopicsParams.none())

    /** @see listTopics */
    fun listTopics(
        params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TopicDetails>

    /** @see listTopics */
    fun listTopics(
        params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none()
    ): List<TopicDetails> = listTopics(params, RequestOptions.none())

    /** @see listTopics */
    fun listTopics(requestOptions: RequestOptions): List<TopicDetails> =
        listTopics(SecureMessagingListTopicsParams.none(), requestOptions)

    /**
     * A view of [SecureMessagingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecureMessagingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sm/describeTopic/{topic}`, but is otherwise the
         * same as [SecureMessagingService.describeTopic].
         */
        @MustBeClosed
        fun describeTopic(topic: String): HttpResponseFor<TopicDetails> =
            describeTopic(topic, SecureMessagingDescribeTopicParams.none())

        /** @see describeTopic */
        @MustBeClosed
        fun describeTopic(
            topic: String,
            params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopicDetails> =
            describeTopic(params.toBuilder().topic(topic).build(), requestOptions)

        /** @see describeTopic */
        @MustBeClosed
        fun describeTopic(
            topic: String,
            params: SecureMessagingDescribeTopicParams = SecureMessagingDescribeTopicParams.none(),
        ): HttpResponseFor<TopicDetails> = describeTopic(topic, params, RequestOptions.none())

        /** @see describeTopic */
        @MustBeClosed
        fun describeTopic(
            params: SecureMessagingDescribeTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopicDetails>

        /** @see describeTopic */
        @MustBeClosed
        fun describeTopic(
            params: SecureMessagingDescribeTopicParams
        ): HttpResponseFor<TopicDetails> = describeTopic(params, RequestOptions.none())

        /** @see describeTopic */
        @MustBeClosed
        fun describeTopic(
            topic: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopicDetails> =
            describeTopic(topic, SecureMessagingDescribeTopicParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sm/getLatestOffset/{topic}`, but is otherwise the
         * same as [SecureMessagingService.getLatestOffset].
         */
        @MustBeClosed
        fun getLatestOffset(topic: String): HttpResponse =
            getLatestOffset(topic, SecureMessagingGetLatestOffsetParams.none())

        /** @see getLatestOffset */
        @MustBeClosed
        fun getLatestOffset(
            topic: String,
            params: SecureMessagingGetLatestOffsetParams =
                SecureMessagingGetLatestOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getLatestOffset(params.toBuilder().topic(topic).build(), requestOptions)

        /** @see getLatestOffset */
        @MustBeClosed
        fun getLatestOffset(
            topic: String,
            params: SecureMessagingGetLatestOffsetParams =
                SecureMessagingGetLatestOffsetParams.none(),
        ): HttpResponse = getLatestOffset(topic, params, RequestOptions.none())

        /** @see getLatestOffset */
        @MustBeClosed
        fun getLatestOffset(
            params: SecureMessagingGetLatestOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestOffset */
        @MustBeClosed
        fun getLatestOffset(params: SecureMessagingGetLatestOffsetParams): HttpResponse =
            getLatestOffset(params, RequestOptions.none())

        /** @see getLatestOffset */
        @MustBeClosed
        fun getLatestOffset(topic: String, requestOptions: RequestOptions): HttpResponse =
            getLatestOffset(topic, SecureMessagingGetLatestOffsetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sm/getMessages/{topic}/{offset}`, but is otherwise
         * the same as [SecureMessagingService.getMessages].
         */
        @MustBeClosed
        fun getMessages(
            offset: Long,
            params: SecureMessagingGetMessagesParams,
        ): HttpResponseFor<SecureMessagingGetMessagesPage> =
            getMessages(offset, params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            offset: Long,
            params: SecureMessagingGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecureMessagingGetMessagesPage> =
            getMessages(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: SecureMessagingGetMessagesParams
        ): HttpResponseFor<SecureMessagingGetMessagesPage> =
            getMessages(params, RequestOptions.none())

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: SecureMessagingGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecureMessagingGetMessagesPage>

        /**
         * Returns a raw HTTP response for `get /sm/listTopics`, but is otherwise the same as
         * [SecureMessagingService.listTopics].
         */
        @MustBeClosed
        fun listTopics(): HttpResponseFor<List<TopicDetails>> =
            listTopics(SecureMessagingListTopicsParams.none())

        /** @see listTopics */
        @MustBeClosed
        fun listTopics(
            params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TopicDetails>>

        /** @see listTopics */
        @MustBeClosed
        fun listTopics(
            params: SecureMessagingListTopicsParams = SecureMessagingListTopicsParams.none()
        ): HttpResponseFor<List<TopicDetails>> = listTopics(params, RequestOptions.none())

        /** @see listTopics */
        @MustBeClosed
        fun listTopics(requestOptions: RequestOptions): HttpResponseFor<List<TopicDetails>> =
            listTopics(SecureMessagingListTopicsParams.none(), requestOptions)
    }
}
