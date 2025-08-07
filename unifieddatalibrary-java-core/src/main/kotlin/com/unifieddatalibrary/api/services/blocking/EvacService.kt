// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EvacFull
import com.unifieddatalibrary.api.models.evac.EvacCountParams
import com.unifieddatalibrary.api.models.evac.EvacCreateBulkParams
import com.unifieddatalibrary.api.models.evac.EvacCreateParams
import com.unifieddatalibrary.api.models.evac.EvacListPage
import com.unifieddatalibrary.api.models.evac.EvacListParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpParams
import com.unifieddatalibrary.api.models.evac.EvacQueryHelpResponse
import com.unifieddatalibrary.api.models.evac.EvacRetrieveParams
import com.unifieddatalibrary.api.models.evac.EvacUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.evac.HistoryService
import com.unifieddatalibrary.api.services.blocking.evac.TupleService
import java.util.function.Consumer

interface EvacService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvacService

    fun history(): HistoryService

    fun tuple(): TupleService

    /**
     * Service operation to take a single evac as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: EvacCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EvacCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Evac by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EvacFull = retrieve(id, EvacRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EvacRetrieveParams = EvacRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvacFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: EvacRetrieveParams = EvacRetrieveParams.none()): EvacFull =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EvacRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvacFull

    /** @see retrieve */
    fun retrieve(params: EvacRetrieveParams): EvacFull = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EvacFull =
        retrieve(id, EvacRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EvacListParams): EvacListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EvacListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvacListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EvacCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EvacCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Evac records as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EvacCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EvacCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): EvacQueryHelpResponse = queryHelp(EvacQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EvacQueryHelpParams = EvacQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvacQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: EvacQueryHelpParams = EvacQueryHelpParams.none()): EvacQueryHelpResponse =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EvacQueryHelpResponse =
        queryHelp(EvacQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to take a list of Evac events as a POST body and ingest into the database.
     * Requires a specific role, please contact the UDL team to gain access. This operation is
     * intended to be used for automated feeds into UDL.
     */
    fun unvalidatedPublish(params: EvacUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EvacUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [EvacService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvacService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        fun tuple(): TupleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/evac`, but is otherwise the same as
         * [EvacService.create].
         */
        @MustBeClosed
        fun create(params: EvacCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EvacCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/evac/{id}`, but is otherwise the same as
         * [EvacService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EvacFull> =
            retrieve(id, EvacRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EvacRetrieveParams = EvacRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvacFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EvacRetrieveParams = EvacRetrieveParams.none(),
        ): HttpResponseFor<EvacFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EvacRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvacFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EvacRetrieveParams): HttpResponseFor<EvacFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EvacFull> =
            retrieve(id, EvacRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/evac`, but is otherwise the same as
         * [EvacService.list].
         */
        @MustBeClosed
        fun list(params: EvacListParams): HttpResponseFor<EvacListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EvacListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvacListPage>

        /**
         * Returns a raw HTTP response for `get /udl/evac/count`, but is otherwise the same as
         * [EvacService.count].
         */
        @MustBeClosed
        fun count(params: EvacCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EvacCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/evac/createBulk`, but is otherwise the same as
         * [EvacService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: EvacCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: EvacCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/evac/queryhelp`, but is otherwise the same as
         * [EvacService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EvacQueryHelpResponse> =
            queryHelp(EvacQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EvacQueryHelpParams = EvacQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvacQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EvacQueryHelpParams = EvacQueryHelpParams.none()
        ): HttpResponseFor<EvacQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EvacQueryHelpResponse> =
            queryHelp(EvacQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-evac`, but is otherwise the same as
         * [EvacService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: EvacUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: EvacUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
