// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerService
import java.util.function.Consumer

interface SupportingDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataService

    fun dataTypes(): DataTypeService

    fun dataowner(): DataownerService

    /**
     * A view of [SupportingDataService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupportingDataService.WithRawResponse

        fun dataTypes(): DataTypeService.WithRawResponse

        fun dataowner(): DataownerService.WithRawResponse
    }
}
