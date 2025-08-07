// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.swir.SwirCountParams
import com.unifieddatalibrary.api.models.swir.SwirCreateBulkParams
import com.unifieddatalibrary.api.models.swir.SwirCreateParams
import com.unifieddatalibrary.api.models.swir.SwirGetParams
import com.unifieddatalibrary.api.models.swir.SwirListPage
import com.unifieddatalibrary.api.models.swir.SwirListParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpParams
import com.unifieddatalibrary.api.models.swir.SwirQueryhelpResponse
import com.unifieddatalibrary.api.models.swir.SwirTupleParams
import com.unifieddatalibrary.api.models.swir.history.SwirFull
import com.unifieddatalibrary.api.services.blocking.swir.HistoryService
import java.util.function.Consumer

interface SwirService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirService

    fun history(): HistoryService

    /**
     * Service operation to take a single SWIR record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SwirCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: SwirCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: SwirListParams): SwirListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SwirListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwirListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SwirCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SwirCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of SWIR records as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: SwirCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SwirCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single SWIR record by its unique ID passed as a path parameter.
     */
    fun get(id: String): SwirFull = get(id, SwirGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SwirGetParams = SwirGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwirFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: SwirGetParams = SwirGetParams.none()): SwirFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(params: SwirGetParams, requestOptions: RequestOptions = RequestOptions.none()): SwirFull

    /** @see get */
    fun get(params: SwirGetParams): SwirFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SwirFull =
        get(id, SwirGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SwirQueryhelpResponse = queryhelp(SwirQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SwirQueryhelpParams = SwirQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwirQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SwirQueryhelpParams = SwirQueryhelpParams.none()): SwirQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SwirQueryhelpResponse =
        queryhelp(SwirQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SwirTupleParams): List<SwirFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SwirTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SwirFull>

    /** A view of [SwirService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwirService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/swir`, but is otherwise the same as
         * [SwirService.create].
         */
        @MustBeClosed
        fun create(params: SwirCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SwirCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/swir`, but is otherwise the same as
         * [SwirService.list].
         */
        @MustBeClosed
        fun list(params: SwirListParams): HttpResponseFor<SwirListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SwirListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwirListPage>

        /**
         * Returns a raw HTTP response for `get /udl/swir/count`, but is otherwise the same as
         * [SwirService.count].
         */
        @MustBeClosed
        fun count(params: SwirCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SwirCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/swir/createBulk`, but is otherwise the same as
         * [SwirService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SwirCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SwirCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/swir/{id}`, but is otherwise the same as
         * [SwirService.get].
         */
        @MustBeClosed fun get(id: String): HttpResponseFor<SwirFull> = get(id, SwirGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SwirGetParams = SwirGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwirFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SwirGetParams = SwirGetParams.none(),
        ): HttpResponseFor<SwirFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SwirGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwirFull>

        /** @see get */
        @MustBeClosed
        fun get(params: SwirGetParams): HttpResponseFor<SwirFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SwirFull> =
            get(id, SwirGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/swir/queryhelp`, but is otherwise the same as
         * [SwirService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SwirQueryhelpResponse> =
            queryhelp(SwirQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SwirQueryhelpParams = SwirQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwirQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SwirQueryhelpParams = SwirQueryhelpParams.none()
        ): HttpResponseFor<SwirQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SwirQueryhelpResponse> =
            queryhelp(SwirQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/swir/tuple`, but is otherwise the same as
         * [SwirService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SwirTupleParams): HttpResponseFor<List<SwirFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SwirTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SwirFull>>
    }
}
