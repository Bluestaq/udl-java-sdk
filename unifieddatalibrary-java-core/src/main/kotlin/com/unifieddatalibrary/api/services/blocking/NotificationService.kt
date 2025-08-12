// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.NotificationFull
import com.unifieddatalibrary.api.models.notification.NotificationCountParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateRawParams
import com.unifieddatalibrary.api.models.notification.NotificationGetParams
import com.unifieddatalibrary.api.models.notification.NotificationListPage
import com.unifieddatalibrary.api.models.notification.NotificationListParams
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpParams
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpResponse
import com.unifieddatalibrary.api.models.notification.NotificationTupleParams
import com.unifieddatalibrary.api.services.blocking.NotificationService
import com.unifieddatalibrary.api.services.blocking.notification.HistoryService
import java.util.function.Consumer

interface NotificationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService

    fun history(): HistoryService

    /** Service operation to push a generic Notification/Alert JSON message into the UDL. This operation accepts a UDL-formatted Notification JSON notification/alert message. See the Notification schema for required fields such as classificationMarking, msgType, etc. Messages pushed through this service may be pulled via Secure Messaging and historical REST services. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: NotificationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: NotificationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: NotificationListParams): NotificationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: NotificationListParams, requestOptions: RequestOptions = RequestOptions.none()): NotificationListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: NotificationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: NotificationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to push a Notification/Alert message into the UDL. This operation uses query parameters to pass UDL-required fields such as classificationMarking, msgType, etc and takes a raw string payload which can be XML, JSON, or plain text. The preferred mechanism for posting notifications is to use the standard POST which takes the proper UDL JSON Notification schema as this service may convert the message in an undesirable manner. The service will wrap the passed payload with the appropriate UDL JSON schema, using escape characters as necessary for the payload to produce a valid JSON document. XML payloads (not recommended) are automatically converted to JSON. Messages pushed through this service may be pulled via Secure Messaging and historical REST services. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun createRaw(params: NotificationCreateRawParams) =
        createRaw(
          params, RequestOptions.none()
        )

    /** @see createRaw */
    fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single notification by its unique ID passed as a path parameter. */
    fun get(id: String): NotificationFull =
        get(
          id, NotificationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: NotificationGetParams = NotificationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): NotificationFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: NotificationGetParams = NotificationGetParams.none()): NotificationFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: NotificationGetParams, requestOptions: RequestOptions = RequestOptions.none()): NotificationFull

    /** @see get */
    fun get(params: NotificationGetParams): NotificationFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): NotificationFull =
        get(
          id,
          NotificationGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): NotificationQueryhelpResponse = queryhelp(NotificationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: NotificationQueryhelpParams = NotificationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): NotificationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: NotificationQueryhelpParams = NotificationQueryhelpParams.none()): NotificationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): NotificationQueryhelpResponse =
        queryhelp(
          NotificationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: NotificationTupleParams): List<NotificationFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<NotificationFull>

    /** A view of [NotificationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/notification`, but is otherwise the same as [NotificationService.create]. */
        @MustBeClosed
        fun create(params: NotificationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: NotificationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/notification`, but is otherwise the same as [NotificationService.list]. */
        @MustBeClosed
        fun list(params: NotificationListParams): HttpResponseFor<NotificationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: NotificationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<NotificationListPage>

        /** Returns a raw HTTP response for `get /udl/notification/count`, but is otherwise the same as [NotificationService.count]. */
        @MustBeClosed
        fun count(params: NotificationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: NotificationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/notification/createRaw`, but is otherwise the same as [NotificationService.createRaw]. */
        @MustBeClosed
        fun createRaw(params: NotificationCreateRawParams): HttpResponse =
            createRaw(
              params, RequestOptions.none()
            )

        /** @see createRaw */
        @MustBeClosed
        fun createRaw(params: NotificationCreateRawParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/notification/{id}`, but is otherwise the same as [NotificationService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<NotificationFull> =
            get(
              id, NotificationGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: NotificationGetParams = NotificationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<NotificationFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: NotificationGetParams = NotificationGetParams.none()): HttpResponseFor<NotificationFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: NotificationGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<NotificationFull>

        /** @see get */
        @MustBeClosed
        fun get(params: NotificationGetParams): HttpResponseFor<NotificationFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<NotificationFull> =
            get(
              id,
              NotificationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/notification/queryhelp`, but is otherwise the same as [NotificationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<NotificationQueryhelpResponse> = queryhelp(NotificationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: NotificationQueryhelpParams = NotificationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<NotificationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: NotificationQueryhelpParams = NotificationQueryhelpParams.none()): HttpResponseFor<NotificationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<NotificationQueryhelpResponse> =
            queryhelp(
              NotificationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/notification/tuple`, but is otherwise the same as [NotificationService.tuple]. */
        @MustBeClosed
        fun tuple(params: NotificationTupleParams): HttpResponseFor<List<NotificationFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: NotificationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<NotificationFull>>
    }
}
