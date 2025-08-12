// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.reportandactivities

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.reportandactivities.PoiService
import com.unifieddatalibrary.api.services.blocking.reportandactivities.poi.HistoryService
import java.util.function.Consumer

interface PoiService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService

    fun history(): HistoryService

    /** A view of [PoiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService.WithRawResponse

        fun history(): HistoryService.WithRawResponse
    }
}
