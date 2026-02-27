// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.gnssobservations.HistoryService
import java.util.function.Consumer

interface GnssObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun history(): HistoryService

    /**
     * A view of [GnssObservationService] that provides access to raw HTTP responses for each
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
        ): GnssObservationService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun history(): HistoryService.WithRawResponse
    }
}
