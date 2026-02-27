// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.reportandactivities.PoiService
import com.unifieddatalibrary.api.services.blocking.reportandactivities.UdlH3geoService
import com.unifieddatalibrary.api.services.blocking.reportandactivities.UdlSigactService
import java.util.function.Consumer

interface ReportAndActivityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportAndActivityService

    fun poi(): PoiService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun udlH3geo(): UdlH3geoService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun udlSigact(): UdlSigactService

    /**
     * A view of [ReportAndActivityService] that provides access to raw HTTP responses for each
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
        ): ReportAndActivityService.WithRawResponse

        fun poi(): PoiService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun udlH3geo(): UdlH3geoService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun udlSigact(): UdlSigactService.WithRawResponse
    }
}
