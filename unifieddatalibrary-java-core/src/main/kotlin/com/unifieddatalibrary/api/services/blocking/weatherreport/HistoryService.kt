// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.weatherreport

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryCountParams
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryListPage
import com.unifieddatalibrary.api.models.weatherreport.history.HistoryListParams
import java.util.function.Consumer

/**
 * These services provide for posting and querying terrestrial weather conditions over a target area
 * or region and raw sensor data used to produce condition reports. Weather Reports describe current
 * weather conditions over a target point or region to include general temperatures, pressures, and
 * moisture accumulation, as well as navigational considerations such as altimeter settings,
 * visibility, wind speeds, and cloud heights etc. Weather Data contains algorithmic parameters and
 * dynamic, raw measurements collected by individual sensors such as signal power, noise level,
 * etc., which are generally processed across multiple sensors to produce weather reports.
 */
interface HistoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun list(params: HistoryListParams): HistoryListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HistoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HistoryListPage

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (`/udl/<datatype>/queryhelp`) for more details on valid/required
     * query parameter information.
     */
    fun aodr(params: HistoryAodrParams) = aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(params: HistoryAodrParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun count(params: HistoryCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: HistoryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/history`, but is otherwise the
         * same as [HistoryService.list].
         */
        @MustBeClosed
        fun list(params: HistoryListParams): HttpResponseFor<HistoryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HistoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HistoryListPage>

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/history/aodr`, but is otherwise
         * the same as [HistoryService.aodr].
         */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams): HttpResponse = aodr(params, RequestOptions.none())

        /** @see aodr */
        @MustBeClosed
        fun aodr(
            params: HistoryAodrParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/weatherreport/history/count`, but is otherwise
         * the same as [HistoryService.count].
         */
        @MustBeClosed
        fun count(params: HistoryCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: HistoryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>
    }
}
