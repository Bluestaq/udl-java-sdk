// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListPageAsync
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListParams
import com.unifieddatalibrary.api.services.async.scs.notifications.OffsetServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * These endpoints provide the ability to subscribe to SCS Event Notifications for file
 * upload/update and folder creation events within a specific folder in the Secure Content Store. A
 * user must be authorized to view the file/folder for which a notification was created in order to
 * retrieve that notification.
 */
interface NotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync

    /**
     * These endpoints provide the ability to subscribe to SCS Event Notifications for file
     * upload/update and folder creation events within a specific folder in the Secure Content
     * Store. A user must be authorized to view the file/folder for which a notification was created
     * in order to retrieve that notification.
     */
    fun offset(): OffsetServiceAsync

    /** Returns a list of notifications for items in a specific folder. */
    fun list(offset: String): CompletableFuture<NotificationListPageAsync> =
        list(offset, NotificationListParams.none())

    /** @see list */
    fun list(
        offset: String,
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationListPageAsync> =
        list(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see list */
    fun list(
        offset: String,
        params: NotificationListParams = NotificationListParams.none(),
    ): CompletableFuture<NotificationListPageAsync> = list(offset, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationListPageAsync>

    /** @see list */
    fun list(params: NotificationListParams): CompletableFuture<NotificationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationListPageAsync> =
        list(offset, NotificationListParams.none(), requestOptions)

    /**
     * A view of [NotificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): NotificationServiceAsync.WithRawResponse

        /**
         * These endpoints provide the ability to subscribe to SCS Event Notifications for file
         * upload/update and folder creation events within a specific folder in the Secure Content
         * Store. A user must be authorized to view the file/folder for which a notification was
         * created in order to retrieve that notification.
         */
        fun offset(): OffsetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/notifications/{offset}`, but is otherwise the
         * same as [NotificationServiceAsync.list].
         */
        fun list(offset: String): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> =
            list(offset, NotificationListParams.none())

        /** @see list */
        fun list(
            offset: String,
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> =
            list(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see list */
        fun list(
            offset: String,
            params: NotificationListParams = NotificationListParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> =
            list(offset, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>>

        /** @see list */
        fun list(
            params: NotificationListParams
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationListPageAsync>> =
            list(offset, NotificationListParams.none(), requestOptions)
    }
}
