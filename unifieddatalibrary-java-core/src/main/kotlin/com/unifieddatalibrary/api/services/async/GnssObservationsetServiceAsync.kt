// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCountParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCreateBulkParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListPageAsync
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetTupleParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.gnssobservationset.history.GnssObservationSetFull
import com.unifieddatalibrary.api.services.async.gnssobservationset.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GnssObservationsetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationsetServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: GnssObservationsetListParams
    ): CompletableFuture<GnssObservationsetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GnssObservationsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssObservationsetListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GnssObservationsetCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GnssObservationsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of Track Details
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: GnssObservationsetCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: GnssObservationsetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<GnssObservationsetQueryhelpResponse> =
        queryhelp(GnssObservationsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GnssObservationsetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none()
    ): CompletableFuture<GnssObservationsetQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<GnssObservationsetQueryhelpResponse> =
        queryhelp(GnssObservationsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: GnssObservationsetTupleParams
    ): CompletableFuture<List<GnssObservationSetFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GnssObservationsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<GnssObservationSetFull>>

    /**
     * Service operation to accept one or more GNSSObservationSet(s) and associated GNSS
     * Observation(s) as a POST body and ingest into the database. This operation is intended to be
     * used for automated feeds into UDL. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(
        params: GnssObservationsetUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: GnssObservationsetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [GnssObservationsetServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GnssObservationsetServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/gnssobservationset`, but is otherwise the same
         * as [GnssObservationsetServiceAsync.list].
         */
        fun list(
            params: GnssObservationsetListParams
        ): CompletableFuture<HttpResponseFor<GnssObservationsetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GnssObservationsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssObservationsetListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/gnssobservationset/count`, but is otherwise the
         * same as [GnssObservationsetServiceAsync.count].
         */
        fun count(
            params: GnssObservationsetCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: GnssObservationsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/gnssobservationset/createBulk`, but is
         * otherwise the same as [GnssObservationsetServiceAsync.createBulk].
         */
        fun createBulk(
            params: GnssObservationsetCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: GnssObservationsetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/gnssobservationset/queryhelp`, but is otherwise
         * the same as [GnssObservationsetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<GnssObservationsetQueryhelpResponse>> =
            queryhelp(GnssObservationsetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GnssObservationsetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<GnssObservationsetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GnssObservationsetQueryhelpResponse>> =
            queryhelp(GnssObservationsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/gnssobservationset/tuple`, but is otherwise the
         * same as [GnssObservationsetServiceAsync.tuple].
         */
        fun tuple(
            params: GnssObservationsetTupleParams
        ): CompletableFuture<HttpResponseFor<List<GnssObservationSetFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: GnssObservationsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<GnssObservationSetFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-gnssobset`, but is otherwise the same
         * as [GnssObservationsetServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: GnssObservationsetUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: GnssObservationsetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
