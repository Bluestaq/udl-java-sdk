// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.reportandactivity.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivity.UdlH3geoServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivity.UdlSigactServiceAsync
import java.util.function.Consumer

interface ReportAndActivityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportAndActivityServiceAsync

    fun poi(): PoiServiceAsync

    fun udlH3geo(): UdlH3geoServiceAsync

    fun udlSigact(): UdlSigactServiceAsync

    /**
     * A view of [ReportAndActivityServiceAsync] that provides access to raw HTTP responses for each
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
        ): ReportAndActivityServiceAsync.WithRawResponse

        fun poi(): PoiServiceAsync.WithRawResponse

        fun udlH3geo(): UdlH3geoServiceAsync.WithRawResponse

        fun udlSigact(): UdlSigactServiceAsync.WithRawResponse
    }
}
