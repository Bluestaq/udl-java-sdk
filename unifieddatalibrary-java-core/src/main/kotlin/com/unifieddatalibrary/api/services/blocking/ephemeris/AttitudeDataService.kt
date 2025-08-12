// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ephemeris

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListPage
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.AttitudeDataListParams
import com.unifieddatalibrary.api.services.blocking.ephemeris.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.ephemeris.attitudedata.HistoryService
import java.util.function.Consumer

interface AttitudeDataService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataService

    fun history(): HistoryService

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: AttitudeDataListParams): AttitudeDataListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: AttitudeDataListParams, requestOptions: RequestOptions = RequestOptions.none()): AttitudeDataListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: AttitudeDataCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** A view of [AttitudeDataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttitudeDataService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/attitudedata`, but is otherwise the same as [AttitudeDataService.list]. */
        @MustBeClosed
        fun list(params: AttitudeDataListParams): HttpResponseFor<AttitudeDataListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: AttitudeDataListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AttitudeDataListPage>

        /** Returns a raw HTTP response for `get /udl/attitudedata/count`, but is otherwise the same as [AttitudeDataService.count]. */
        @MustBeClosed
        fun count(params: AttitudeDataCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: AttitudeDataCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>
    }
}
