// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.reportandactivities

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.reportandactivities.poi.HistoryServiceAsync
import java.util.function.Consumer

interface PoiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun history(): HistoryServiceAsync

    /** A view of [PoiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun history(): HistoryServiceAsync.WithRawResponse
    }
}
