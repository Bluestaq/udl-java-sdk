// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCountParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateBulkParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListPage
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrQueryhelpResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleResponse
import com.unifieddatalibrary.api.models.ecpedr.EcpedrUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.ecpedr.HistoryService
import java.util.function.Consumer

interface EcpedrService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpedrService

    fun history(): HistoryService

    /**
     * Service operation to take a single ECPEDR record as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: EcpedrCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EcpedrCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EcpedrListParams): EcpedrListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EcpedrListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EcpedrListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EcpedrCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EcpedrCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of ECPEDR records as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EcpedrCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EcpedrCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): EcpedrQueryhelpResponse = queryhelp(EcpedrQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EcpedrQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none()
    ): EcpedrQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EcpedrQueryhelpResponse =
        queryhelp(EcpedrQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EcpedrTupleParams): List<EcpedrTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EcpedrTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EcpedrTupleResponse>

    /**
     * Service operation to take multiple ECPEDR records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: EcpedrUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EcpedrUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [EcpedrService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpedrService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ecpedr`, but is otherwise the same as
         * [EcpedrService.create].
         */
        @MustBeClosed
        fun create(params: EcpedrCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EcpedrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr`, but is otherwise the same as
         * [EcpedrService.list].
         */
        @MustBeClosed
        fun list(params: EcpedrListParams): HttpResponseFor<EcpedrListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EcpedrListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EcpedrListPage>

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/count`, but is otherwise the same as
         * [EcpedrService.count].
         */
        @MustBeClosed
        fun count(params: EcpedrCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EcpedrCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/ecpedr/createBulk`, but is otherwise the same
         * as [EcpedrService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: EcpedrCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: EcpedrCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/queryhelp`, but is otherwise the same as
         * [EcpedrService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EcpedrQueryhelpResponse> =
            queryhelp(EcpedrQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EcpedrQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EcpedrQueryhelpParams = EcpedrQueryhelpParams.none()
        ): HttpResponseFor<EcpedrQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EcpedrQueryhelpResponse> =
            queryhelp(EcpedrQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ecpedr/tuple`, but is otherwise the same as
         * [EcpedrService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EcpedrTupleParams): HttpResponseFor<List<EcpedrTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EcpedrTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EcpedrTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-ecpedr`, but is otherwise the same as
         * [EcpedrService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: EcpedrUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: EcpedrUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
