// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.reportandactivity

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.reportandactivity.poi.HistoryServiceAsync
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

    fun history(): HistoryServiceAsync

    /** A view of [PoiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse
    }
}
