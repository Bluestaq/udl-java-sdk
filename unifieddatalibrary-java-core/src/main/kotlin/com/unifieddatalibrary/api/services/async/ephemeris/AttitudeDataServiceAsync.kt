// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.ephemeris

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListPageAsync
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListParams
import com.unifieddatalibrary.api.services.async.ephemeris.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.ephemeris.attitudedata.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttitudeDataServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AttitudeDataListParams): CompletableFuture<AttitudeDataListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AttitudeDataListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AttitudeDataListPageAsync>

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AttitudeDataCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** A view of [AttitudeDataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/attitudedata`, but is otherwise the same as [AttitudeDataServiceAsync.list]. */
        fun list(params: AttitudeDataListParams): CompletableFuture<HttpResponseFor<AttitudeDataListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: AttitudeDataListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AttitudeDataListPageAsync>>

        /** Returns a raw HTTP response for `get /udl/attitudedata/count`, but is otherwise the same as [AttitudeDataServiceAsync.count]. */
        fun count(params: AttitudeDataCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>
    }
}
