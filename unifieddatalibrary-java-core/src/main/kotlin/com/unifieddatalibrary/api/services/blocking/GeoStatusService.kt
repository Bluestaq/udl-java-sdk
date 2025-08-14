// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCountParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateBulkParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusGetParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListPage
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.geostatus.GeoStatusTupleParams
import com.unifieddatalibrary.api.models.geostatus.history.GeoStatusFull
import com.unifieddatalibrary.api.services.blocking.geostatus.HistoryService
import java.util.function.Consumer

interface GeoStatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusService

    fun history(): HistoryService

    /**
     * Service operation to take a single GEOStatus record as a POST body and ingest into the
     * database. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun create(params: GeoStatusCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GeoStatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: GeoStatusListParams): GeoStatusListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GeoStatusListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeoStatusListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: GeoStatusCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: GeoStatusCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of GEOStatus records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: GeoStatusCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: GeoStatusCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single GEOStatus record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): GeoStatusFull = get(id, GeoStatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GeoStatusGetParams = GeoStatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeoStatusFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: GeoStatusGetParams = GeoStatusGetParams.none()): GeoStatusFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GeoStatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeoStatusFull

    /** @see get */
    fun get(params: GeoStatusGetParams): GeoStatusFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): GeoStatusFull =
        get(id, GeoStatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): GeoStatusQueryhelpResponse = queryhelp(GeoStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeoStatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none()
    ): GeoStatusQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): GeoStatusQueryhelpResponse =
        queryhelp(GeoStatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: GeoStatusTupleParams): List<GeoStatusFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: GeoStatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<GeoStatusFull>

    /** A view of [GeoStatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoStatusService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/geostatus`, but is otherwise the same as
         * [GeoStatusService.create].
         */
        @MustBeClosed
        fun create(params: GeoStatusCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GeoStatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/geostatus`, but is otherwise the same as
         * [GeoStatusService.list].
         */
        @MustBeClosed
        fun list(params: GeoStatusListParams): HttpResponseFor<GeoStatusListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GeoStatusListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeoStatusListPage>

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/count`, but is otherwise the same as
         * [GeoStatusService.count].
         */
        @MustBeClosed
        fun count(params: GeoStatusCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: GeoStatusCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/geostatus/createBulk`, but is otherwise the
         * same as [GeoStatusService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: GeoStatusCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: GeoStatusCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/{id}`, but is otherwise the same as
         * [GeoStatusService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<GeoStatusFull> = get(id, GeoStatusGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GeoStatusGetParams = GeoStatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeoStatusFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GeoStatusGetParams = GeoStatusGetParams.none(),
        ): HttpResponseFor<GeoStatusFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GeoStatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeoStatusFull>

        /** @see get */
        @MustBeClosed
        fun get(params: GeoStatusGetParams): HttpResponseFor<GeoStatusFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<GeoStatusFull> =
            get(id, GeoStatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/queryhelp`, but is otherwise the same
         * as [GeoStatusService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<GeoStatusQueryhelpResponse> =
            queryhelp(GeoStatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeoStatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: GeoStatusQueryhelpParams = GeoStatusQueryhelpParams.none()
        ): HttpResponseFor<GeoStatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<GeoStatusQueryhelpResponse> =
            queryhelp(GeoStatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/geostatus/tuple`, but is otherwise the same as
         * [GeoStatusService.tuple].
         */
        @MustBeClosed
        fun tuple(params: GeoStatusTupleParams): HttpResponseFor<List<GeoStatusFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: GeoStatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<GeoStatusFull>>
    }
}
