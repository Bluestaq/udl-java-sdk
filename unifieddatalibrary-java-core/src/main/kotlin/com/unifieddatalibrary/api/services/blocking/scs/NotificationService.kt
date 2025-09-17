// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListPage
import com.unifieddatalibrary.api.models.scs.notifications.NotificationListParams
import com.unifieddatalibrary.api.services.blocking.scs.notifications.OffsetService
import java.util.function.Consumer

interface NotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService

    fun offset(): OffsetService

    /** Returns a list of notifications for items in a specific folder. */
    fun list(offset: String): NotificationListPage = list(offset, NotificationListParams.none())

    /** @see list */
    fun list(
        offset: String,
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationListPage = list(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see list */
    fun list(
        offset: String,
        params: NotificationListParams = NotificationListParams.none(),
    ): NotificationListPage = list(offset, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationListPage

    /** @see list */
    fun list(params: NotificationListParams): NotificationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(offset: String, requestOptions: RequestOptions): NotificationListPage =
        list(offset, NotificationListParams.none(), requestOptions)

    /**
     * A view of [NotificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse

        fun offset(): OffsetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/notifications/{offset}`, but is otherwise the
         * same as [NotificationService.list].
         */
        @MustBeClosed
        fun list(offset: String): HttpResponseFor<NotificationListPage> =
            list(offset, NotificationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            offset: String,
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationListPage> =
            list(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            offset: String,
            params: NotificationListParams = NotificationListParams.none(),
        ): HttpResponseFor<NotificationListPage> = list(offset, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: NotificationListParams): HttpResponseFor<NotificationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationListPage> =
            list(offset, NotificationListParams.none(), requestOptions)
    }
}
