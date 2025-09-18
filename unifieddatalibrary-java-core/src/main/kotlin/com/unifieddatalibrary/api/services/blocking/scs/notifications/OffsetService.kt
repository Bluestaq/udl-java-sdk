// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs.notifications

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetLatestParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetResponse
import java.util.function.Consumer

interface OffsetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService

    /** Retrieve the min and max offsets of the SCS Event Notification Kafka topic. */
    fun get(): OffsetGetResponse = get(OffsetGetParams.none())

    /** @see get */
    fun get(
        params: OffsetGetParams = OffsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OffsetGetResponse

    /** @see get */
    fun get(params: OffsetGetParams = OffsetGetParams.none()): OffsetGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): OffsetGetResponse =
        get(OffsetGetParams.none(), requestOptions)

    /** Returns the current/latest offset for the SCS Event Notification Kafka topic. */
    fun getLatest() = getLatest(OffsetGetLatestParams.none())

    /** @see getLatest */
    fun getLatest(
        params: OffsetGetLatestParams = OffsetGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getLatest */
    fun getLatest(params: OffsetGetLatestParams = OffsetGetLatestParams.none()) =
        getLatest(params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(requestOptions: RequestOptions) =
        getLatest(OffsetGetLatestParams.none(), requestOptions)

    /** A view of [OffsetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/notifications/offsets`, but is otherwise the
         * same as [OffsetService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<OffsetGetResponse> = get(OffsetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OffsetGetParams = OffsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OffsetGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: OffsetGetParams = OffsetGetParams.none()
        ): HttpResponseFor<OffsetGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<OffsetGetResponse> =
            get(OffsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/notifications/getLatestOffset`, but is
         * otherwise the same as [OffsetService.getLatest].
         */
        @MustBeClosed fun getLatest(): HttpResponse = getLatest(OffsetGetLatestParams.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            params: OffsetGetLatestParams = OffsetGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(params: OffsetGetLatestParams = OffsetGetLatestParams.none()): HttpResponse =
            getLatest(params, RequestOptions.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(requestOptions: RequestOptions): HttpResponse =
            getLatest(OffsetGetLatestParams.none(), requestOptions)
    }
}
