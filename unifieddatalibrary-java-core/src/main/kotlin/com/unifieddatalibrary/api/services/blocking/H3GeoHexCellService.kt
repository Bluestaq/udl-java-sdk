// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellCountParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListPage
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellQueryhelpResponse
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleResponse
import java.util.function.Consumer

interface H3GeoHexCellService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): H3GeoHexCellService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: H3GeoHexCellListParams): H3GeoHexCellListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: H3GeoHexCellListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): H3GeoHexCellListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: H3GeoHexCellCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: H3GeoHexCellCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): H3GeoHexCellQueryhelpResponse = queryhelp(H3GeoHexCellQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): H3GeoHexCellQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none()
    ): H3GeoHexCellQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): H3GeoHexCellQueryhelpResponse =
        queryhelp(H3GeoHexCellQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: H3GeoHexCellTupleParams): List<H3GeoHexCellTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: H3GeoHexCellTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<H3GeoHexCellTupleResponse>

    /**
     * A view of [H3GeoHexCellService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): H3GeoHexCellService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/h3geohexcell`, but is otherwise the same as
         * [H3GeoHexCellService.list].
         */
        @MustBeClosed
        fun list(params: H3GeoHexCellListParams): HttpResponseFor<H3GeoHexCellListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: H3GeoHexCellListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<H3GeoHexCellListPage>

        /**
         * Returns a raw HTTP response for `get /udl/h3geohexcell/count`, but is otherwise the same
         * as [H3GeoHexCellService.count].
         */
        @MustBeClosed
        fun count(params: H3GeoHexCellCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: H3GeoHexCellCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/h3geohexcell/queryhelp`, but is otherwise the
         * same as [H3GeoHexCellService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<H3GeoHexCellQueryhelpResponse> =
            queryhelp(H3GeoHexCellQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<H3GeoHexCellQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: H3GeoHexCellQueryhelpParams = H3GeoHexCellQueryhelpParams.none()
        ): HttpResponseFor<H3GeoHexCellQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<H3GeoHexCellQueryhelpResponse> =
            queryhelp(H3GeoHexCellQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/h3geohexcell/tuple`, but is otherwise the same
         * as [H3GeoHexCellService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: H3GeoHexCellTupleParams
        ): HttpResponseFor<List<H3GeoHexCellTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: H3GeoHexCellTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<H3GeoHexCellTupleResponse>>
    }
}
