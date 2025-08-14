// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.mti.MtiCountParams
import com.unifieddatalibrary.api.models.mti.MtiCreateBulkParams
import com.unifieddatalibrary.api.models.mti.MtiListPage
import com.unifieddatalibrary.api.models.mti.MtiListParams
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpParams
import com.unifieddatalibrary.api.models.mti.MtiQueryhelpResponse
import com.unifieddatalibrary.api.models.mti.MtiTupleParams
import com.unifieddatalibrary.api.models.mti.MtiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.mti.history.MtiFull
import com.unifieddatalibrary.api.services.blocking.mti.HistoryService
import java.util.function.Consumer

interface MtiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MtiService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: MtiListParams): MtiListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MtiListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MtiListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: MtiCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: MtiCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Moving Target
     * Indicator (MTI) records as a POST body and ingest into the database. This operation is not
     * intended to be used for automated feeds into UDL. Data providers should contact the UDL team
     * for specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: MtiCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: MtiCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): MtiQueryhelpResponse = queryhelp(MtiQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: MtiQueryhelpParams = MtiQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MtiQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: MtiQueryhelpParams = MtiQueryhelpParams.none()): MtiQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): MtiQueryhelpResponse =
        queryhelp(MtiQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: MtiTupleParams): List<MtiFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: MtiTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MtiFull>

    /**
     * Service operation to take a list of Moving Target Indicator (MTI) formatted data as a POST
     * body and ingest into the database. This operation is intended to be used for automated feeds
     * into UDL. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun unvalidatedPublish(params: MtiUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: MtiUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [MtiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MtiService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/mti`, but is otherwise the same as
         * [MtiService.list].
         */
        @MustBeClosed
        fun list(params: MtiListParams): HttpResponseFor<MtiListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MtiListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MtiListPage>

        /**
         * Returns a raw HTTP response for `get /udl/mti/count`, but is otherwise the same as
         * [MtiService.count].
         */
        @MustBeClosed
        fun count(params: MtiCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: MtiCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/mti/createBulk`, but is otherwise the same as
         * [MtiService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: MtiCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: MtiCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/mti/queryhelp`, but is otherwise the same as
         * [MtiService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<MtiQueryhelpResponse> =
            queryhelp(MtiQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MtiQueryhelpParams = MtiQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MtiQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MtiQueryhelpParams = MtiQueryhelpParams.none()
        ): HttpResponseFor<MtiQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<MtiQueryhelpResponse> =
            queryhelp(MtiQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/mti/tuple`, but is otherwise the same as
         * [MtiService.tuple].
         */
        @MustBeClosed
        fun tuple(params: MtiTupleParams): HttpResponseFor<List<MtiFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: MtiTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MtiFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-mti`, but is otherwise the same as
         * [MtiService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: MtiUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: MtiUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
