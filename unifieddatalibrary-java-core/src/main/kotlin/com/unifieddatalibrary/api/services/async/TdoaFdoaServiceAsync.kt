// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsync
import com.unifieddatalibrary.api.services.async.tdoafdoa.DiffofarrivalServiceAsync
import java.util.function.Consumer

interface TdoaFdoaServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaServiceAsync

    fun diffofarrival(): DiffofarrivalServiceAsync

    /** A view of [TdoaFdoaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaServiceAsync.WithRawResponse

        fun diffofarrival(): DiffofarrivalServiceAsync.WithRawResponse
    }
}
