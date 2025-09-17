// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs.notifications

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetLatestParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetParams
import com.unifieddatalibrary.api.models.scs.notifications.offset.OffsetGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OffsetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync

    /** Retrieve the min and max offsets of the SCS Event Notification Kafka topic. */
    fun get(): CompletableFuture<OffsetGetResponse> = get(OffsetGetParams.none())

    /** @see get */
    fun get(
        params: OffsetGetParams = OffsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OffsetGetResponse>

    /** @see get */
    fun get(
        params: OffsetGetParams = OffsetGetParams.none()
    ): CompletableFuture<OffsetGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<OffsetGetResponse> =
        get(OffsetGetParams.none(), requestOptions)

    /** Returns the current/latest offset for the SCS Event Notification Kafka topic. */
    fun getLatest(): CompletableFuture<Void?> = getLatest(OffsetGetLatestParams.none())

    /** @see getLatest */
    fun getLatest(
        params: OffsetGetLatestParams = OffsetGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getLatest */
    fun getLatest(
        params: OffsetGetLatestParams = OffsetGetLatestParams.none()
    ): CompletableFuture<Void?> = getLatest(params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(requestOptions: RequestOptions): CompletableFuture<Void?> =
        getLatest(OffsetGetLatestParams.none(), requestOptions)

    /**
     * A view of [OffsetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OffsetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scs/notifications/offsets`, but is otherwise the
         * same as [OffsetServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<OffsetGetResponse>> =
            get(OffsetGetParams.none())

        /** @see get */
        fun get(
            params: OffsetGetParams = OffsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OffsetGetResponse>>

        /** @see get */
        fun get(
            params: OffsetGetParams = OffsetGetParams.none()
        ): CompletableFuture<HttpResponseFor<OffsetGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OffsetGetResponse>> =
            get(OffsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scs/notifications/getLatestOffset`, but is
         * otherwise the same as [OffsetServiceAsync.getLatest].
         */
        fun getLatest(): CompletableFuture<HttpResponse> = getLatest(OffsetGetLatestParams.none())

        /** @see getLatest */
        fun getLatest(
            params: OffsetGetLatestParams = OffsetGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatest */
        fun getLatest(
            params: OffsetGetLatestParams = OffsetGetLatestParams.none()
        ): CompletableFuture<HttpResponse> = getLatest(params, RequestOptions.none())

        /** @see getLatest */
        fun getLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatest(OffsetGetLatestParams.none(), requestOptions)
    }
}
