// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.TdoaFdoaService
import com.unifieddatalibrary.api.services.blocking.tdoafdoa.DiffofarrivalService
import java.util.function.Consumer

interface TdoaFdoaService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaService

    fun diffofarrival(): DiffofarrivalService

    /** A view of [TdoaFdoaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TdoaFdoaService.WithRawResponse

        fun diffofarrival(): DiffofarrivalService.WithRawResponse
    }
}
