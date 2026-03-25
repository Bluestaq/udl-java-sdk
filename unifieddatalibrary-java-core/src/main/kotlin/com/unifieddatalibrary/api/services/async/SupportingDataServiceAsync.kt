// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsync
import java.util.function.Consumer

interface SupportingDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun dataTypes(): DataTypeServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun dataowner(): DataownerServiceAsync

    /**
     * A view of [SupportingDataServiceAsync] that provides access to raw HTTP responses for each
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
        ): SupportingDataServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun dataTypes(): DataTypeServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun dataowner(): DataownerServiceAsync.WithRawResponse
    }
}
