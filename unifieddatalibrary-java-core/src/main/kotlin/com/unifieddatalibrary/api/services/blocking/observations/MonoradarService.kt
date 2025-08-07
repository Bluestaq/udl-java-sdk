// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCountParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCreateBulkParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListPage
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleResponse
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.monoradar.HistoryService
import java.util.function.Consumer

interface MonoradarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonoradarService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: MonoradarListParams): MonoradarListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MonoradarListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonoradarListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: MonoradarCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: MonoradarCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of MonoRadar records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: MonoradarCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: MonoradarCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): MonoradarQueryhelpResponse = queryhelp(MonoradarQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonoradarQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none()
    ): MonoradarQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): MonoradarQueryhelpResponse =
        queryhelp(MonoradarQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: MonoradarTupleParams): List<MonoradarTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: MonoradarTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MonoradarTupleResponse>

    /**
     * Service operation to take a list of MonoRadar records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: MonoradarUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: MonoradarUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [MonoradarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonoradarService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/monoradar`, but is otherwise the same as
         * [MonoradarService.list].
         */
        @MustBeClosed
        fun list(params: MonoradarListParams): HttpResponseFor<MonoradarListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MonoradarListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonoradarListPage>

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/count`, but is otherwise the same as
         * [MonoradarService.count].
         */
        @MustBeClosed
        fun count(params: MonoradarCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: MonoradarCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/monoradar/createBulk`, but is otherwise the
         * same as [MonoradarService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: MonoradarCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: MonoradarCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/queryhelp`, but is otherwise the same
         * as [MonoradarService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<MonoradarQueryhelpResponse> =
            queryhelp(MonoradarQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonoradarQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MonoradarQueryhelpParams = MonoradarQueryhelpParams.none()
        ): HttpResponseFor<MonoradarQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<MonoradarQueryhelpResponse> =
            queryhelp(MonoradarQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/monoradar/tuple`, but is otherwise the same as
         * [MonoradarService.tuple].
         */
        @MustBeClosed
        fun tuple(params: MonoradarTupleParams): HttpResponseFor<List<MonoradarTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: MonoradarTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MonoradarTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/monoradar`, but is otherwise the same as
         * [MonoradarService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: MonoradarUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: MonoradarUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
