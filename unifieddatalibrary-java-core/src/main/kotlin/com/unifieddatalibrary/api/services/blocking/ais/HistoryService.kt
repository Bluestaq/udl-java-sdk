// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ais

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ais.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ais.history.HistoryCountParams
import com.unifieddatalibrary.api.models.ais.history.HistoryListPage
import com.unifieddatalibrary.api.models.ais.history.HistoryListParams
import java.util.function.Consumer

/**
 * These services provide for posting and querying of self-reported information obtained from the
 * Automatic Identification System (AIS) equipment. This contains information such as unique
 * identification, status, position, course, and speed. The AIS is an automatic tracking system that
 * uses transceivers on ships and is used by vessel traffic services. Although technically and
 * operationally distinct, the AIS system is analogous to ADS-B which performs a similar function
 * for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow maritime
 * authorities to track and monitor vessel movements. AIS integrates a standardized VHF transceiver
 * with a positioning system, such as Global Positioning System receiver, with other electronic
 * navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted with AIS
 * transceivers can be tracked by AIS base stations located along coastlines or, when out of range
 * of terrestrial networks, through a growing number of satellites that are fitted with special AIS
 * receivers that are capable of deconflicting a large number of signatures.
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
         * Returns a raw HTTP response for `get /udl/ais/history`, but is otherwise the same as
         * [HistoryService.list].
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
         * Returns a raw HTTP response for `get /udl/ais/history/aodr`, but is otherwise the same as
         * [HistoryService.aodr].
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
         * Returns a raw HTTP response for `get /udl/ais/history/count`, but is otherwise the same
         * as [HistoryService.count].
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
