// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCountParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailCreateBulkParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListPage
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailListParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpParams
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailQueryhelpResponse
import com.unifieddatalibrary.api.models.trackdetails.TrackDetailTupleParams
import com.unifieddatalibrary.api.models.trackdetails.history.TrackDetailsFull
import com.unifieddatalibrary.api.services.blocking.trackdetails.HistoryService
import java.util.function.Consumer

interface TrackDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackDetailService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: TrackDetailListParams): TrackDetailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TrackDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackDetailListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: TrackDetailCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: TrackDetailCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Track Details
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: TrackDetailCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: TrackDetailCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): TrackDetailQueryhelpResponse = queryhelp(TrackDetailQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackDetailQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none()
    ): TrackDetailQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): TrackDetailQueryhelpResponse =
        queryhelp(TrackDetailQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: TrackDetailTupleParams): List<TrackDetailsFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: TrackDetailTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TrackDetailsFull>

    /**
     * A view of [TrackDetailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TrackDetailService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/trackdetails`, but is otherwise the same as
         * [TrackDetailService.list].
         */
        @MustBeClosed
        fun list(params: TrackDetailListParams): HttpResponseFor<TrackDetailListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TrackDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackDetailListPage>

        /**
         * Returns a raw HTTP response for `get /udl/trackdetails/count`, but is otherwise the same
         * as [TrackDetailService.count].
         */
        @MustBeClosed
        fun count(params: TrackDetailCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: TrackDetailCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/trackdetails/createBulk`, but is otherwise the
         * same as [TrackDetailService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: TrackDetailCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: TrackDetailCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/trackdetails/queryhelp`, but is otherwise the
         * same as [TrackDetailService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<TrackDetailQueryhelpResponse> =
            queryhelp(TrackDetailQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackDetailQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TrackDetailQueryhelpParams = TrackDetailQueryhelpParams.none()
        ): HttpResponseFor<TrackDetailQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<TrackDetailQueryhelpResponse> =
            queryhelp(TrackDetailQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackdetails/tuple`, but is otherwise the same
         * as [TrackDetailService.tuple].
         */
        @MustBeClosed
        fun tuple(params: TrackDetailTupleParams): HttpResponseFor<List<TrackDetailsFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: TrackDetailTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TrackDetailsFull>>
    }
}
