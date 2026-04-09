// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.logisticssupport

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.logisticssupport.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.logisticssupport.history.HistoryCountParams
import com.unifieddatalibrary.api.models.logisticssupport.history.HistoryListPage
import com.unifieddatalibrary.api.models.logisticssupport.history.HistoryListParams
import java.util.function.Consumer

/**
 * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
 * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
 * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking Order,
 * Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation Risk
 * Management data. Aircraft Sortie information contains static and dynamic aircraft assignments,
 * departure and arrival times, and remarks. Aircraft Mission information contains static data for
 * mission planning to include assigned aircraft and crews, cargo pickup and dropoff locations,
 * unique identifiers, and prioritization. Item Tracking information contains data for tracking an
 * item from its origin to destination and how it may be configured during transport. Flight Plan
 * information contains schedule and route details. Air Event provides information concerning
 * various aerial events such as fuel transfer and air drops, as well as the associated aircraft
 * involved. Sortie PPR information contains details on operational access to a runway, taxiway, or
 * airport service. Diplomatic Clearance information contains details on the issuance and
 * coordination of aircraft clearance requests. Diplomatic Clearance Country provides information
 * such as entry/exit points, requirements, and points of contact for countries diplomatic
 * clearances are being created for. Airspace Control Order provides information concerning the
 * allocation, restriction, and deconfliction of airspace. Air Tasking Order information contains
 * details on the coordination of air missions and their tasks, resources, and timelines.
 * Navigational Obstruction provides the locations, characteristics, and boundaries of obstacles and
 * structures that can restrict or interfere with navigation. Logistics Support contains information
 * regarding the transport and maintenance of resources and equipment to sustain air operations.
 * Track Route information defines specific flight paths used by aircraft during the transport of
 * fuel and other resources. Air Load Plan information provides mission actuals concerning the
 * loading and air transport of cargo and passengers. Aviation Risk Management information help aid
 * in mission planning by accounting for factors such as mission complexity and crew fatigue.
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
    fun list(): HistoryListPage = list(HistoryListParams.none())

    /** @see list */
    fun list(
        params: HistoryListParams = HistoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HistoryListPage

    /** @see list */
    fun list(params: HistoryListParams = HistoryListParams.none()): HistoryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HistoryListPage =
        list(HistoryListParams.none(), requestOptions)

    /**
     * Service operation to dynamically query historical data by a variety of query parameters not
     * specified in this API documentation, then write that data to the Secure Content Store. See
     * the queryhelp operation (`/udl/<datatype>/queryhelp`) for more details on valid/required
     * query parameter information.
     */
    fun aodr() = aodr(HistoryAodrParams.none())

    /** @see aodr */
    fun aodr(
        params: HistoryAodrParams = HistoryAodrParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see aodr */
    fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()) =
        aodr(params, RequestOptions.none())

    /** @see aodr */
    fun aodr(requestOptions: RequestOptions) = aodr(HistoryAodrParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun count(): String = count(HistoryCountParams.none())

    /** @see count */
    fun count(
        params: HistoryCountParams = HistoryCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: HistoryCountParams = HistoryCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(HistoryCountParams.none(), requestOptions)

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/history`, but is otherwise the
         * same as [HistoryService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<HistoryListPage> = list(HistoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HistoryListParams = HistoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HistoryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HistoryListParams = HistoryListParams.none()
        ): HttpResponseFor<HistoryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HistoryListPage> =
            list(HistoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/history/aodr`, but is
         * otherwise the same as [HistoryService.aodr].
         */
        @MustBeClosed fun aodr(): HttpResponse = aodr(HistoryAodrParams.none())

        /** @see aodr */
        @MustBeClosed
        fun aodr(
            params: HistoryAodrParams = HistoryAodrParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see aodr */
        @MustBeClosed
        fun aodr(params: HistoryAodrParams = HistoryAodrParams.none()): HttpResponse =
            aodr(params, RequestOptions.none())

        /** @see aodr */
        @MustBeClosed
        fun aodr(requestOptions: RequestOptions): HttpResponse =
            aodr(HistoryAodrParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/history/count`, but is
         * otherwise the same as [HistoryService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(HistoryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: HistoryCountParams = HistoryCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: HistoryCountParams = HistoryCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(HistoryCountParams.none(), requestOptions)
    }
}
