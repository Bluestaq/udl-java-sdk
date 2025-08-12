// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCountParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListPage
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationListParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleParams
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationTupleResponse
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.ionoobservations.HistoryService
import java.util.function.Consumer

interface IonoObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IonoObservationService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: IonoObservationListParams): IonoObservationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IonoObservationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IonoObservationListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: IonoObservationCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: IonoObservationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of IonoObservation
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: IonoObservationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: IonoObservationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): IonoObservationQueryhelpResponse =
        queryhelp(IonoObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: IonoObservationQueryhelpParams = IonoObservationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IonoObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: IonoObservationQueryhelpParams = IonoObservationQueryhelpParams.none()
    ): IonoObservationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): IonoObservationQueryhelpResponse =
        queryhelp(IonoObservationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: IonoObservationTupleParams): List<IonoObservationTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: IonoObservationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IonoObservationTupleResponse>

    /**
     * Service operation to take Ionospheric Observation entries as a POST body and ingest into the
     * database with or without dupe detection. Default is no dupe checking. This operation is
     * intended to be used for automated feeds into UDL. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: IonoObservationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [IonoObservationService] that provides access to raw HTTP responses for each
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
        ): IonoObservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/ionoobservation`, but is otherwise the same as
         * [IonoObservationService.list].
         */
        @MustBeClosed
        fun list(params: IonoObservationListParams): HttpResponseFor<IonoObservationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IonoObservationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IonoObservationListPage>

        /**
         * Returns a raw HTTP response for `get /udl/ionoobservation/count`, but is otherwise the
         * same as [IonoObservationService.count].
         */
        @MustBeClosed
        fun count(params: IonoObservationCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: IonoObservationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/ionoobservation/createBulk`, but is otherwise
         * the same as [IonoObservationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: IonoObservationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: IonoObservationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/ionoobservation/queryhelp`, but is otherwise
         * the same as [IonoObservationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<IonoObservationQueryhelpResponse> =
            queryhelp(IonoObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: IonoObservationQueryhelpParams = IonoObservationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IonoObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: IonoObservationQueryhelpParams = IonoObservationQueryhelpParams.none()
        ): HttpResponseFor<IonoObservationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<IonoObservationQueryhelpResponse> =
            queryhelp(IonoObservationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ionoobservation/tuple`, but is otherwise the
         * same as [IonoObservationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: IonoObservationTupleParams
        ): HttpResponseFor<List<IonoObservationTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: IonoObservationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IonoObservationTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-ionoobs`, but is otherwise the same
         * as [IonoObservationService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: IonoObservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: IonoObservationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
