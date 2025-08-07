// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CollectResponseFull
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCountParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListPage
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseRetrieveParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.collectresponses.HistoryService
import com.unifieddatalibrary.api.services.blocking.collectresponses.TupleService
import java.util.function.Consumer

interface CollectResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectResponseService

    fun history(): HistoryService

    fun tuple(): TupleService

    /**
     * Service operation to take a single Collect Response object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: CollectResponseCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CollectResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single Collect Response record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CollectResponseFull =
        retrieve(id, CollectResponseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectResponseFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(),
    ): CollectResponseFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectResponseFull

    /** @see retrieve */
    fun retrieve(params: CollectResponseRetrieveParams): CollectResponseFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CollectResponseFull =
        retrieve(id, CollectResponseRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: CollectResponseListParams): CollectResponseListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CollectResponseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectResponseListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: CollectResponseCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: CollectResponseCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Collect Response
     * objects as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: CollectResponseCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CollectResponseCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CollectResponseQueryHelpResponse =
        queryHelp(CollectResponseQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectResponseQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none()
    ): CollectResponseQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CollectResponseQueryHelpResponse =
        queryHelp(CollectResponseQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to take a list of CollectResponse as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CollectResponseUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [CollectResponseService] that provides access to raw HTTP responses for each
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
        ): CollectResponseService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        fun tuple(): TupleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/collectresponse`, but is otherwise the same as
         * [CollectResponseService.create].
         */
        @MustBeClosed
        fun create(params: CollectResponseCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CollectResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/collectresponse/{id}`, but is otherwise the
         * same as [CollectResponseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CollectResponseFull> =
            retrieve(id, CollectResponseRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectResponseFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectResponseRetrieveParams = CollectResponseRetrieveParams.none(),
        ): HttpResponseFor<CollectResponseFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CollectResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectResponseFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CollectResponseRetrieveParams): HttpResponseFor<CollectResponseFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectResponseFull> =
            retrieve(id, CollectResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/collectresponse`, but is otherwise the same as
         * [CollectResponseService.list].
         */
        @MustBeClosed
        fun list(params: CollectResponseListParams): HttpResponseFor<CollectResponseListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectResponseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectResponseListPage>

        /**
         * Returns a raw HTTP response for `get /udl/collectresponse/count`, but is otherwise the
         * same as [CollectResponseService.count].
         */
        @MustBeClosed
        fun count(params: CollectResponseCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: CollectResponseCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/collectresponse/createBulk`, but is otherwise
         * the same as [CollectResponseService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: CollectResponseCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: CollectResponseCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/collectresponse/queryhelp`, but is otherwise
         * the same as [CollectResponseService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<CollectResponseQueryHelpResponse> =
            queryHelp(CollectResponseQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectResponseQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CollectResponseQueryHelpParams = CollectResponseQueryHelpParams.none()
        ): HttpResponseFor<CollectResponseQueryHelpResponse> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectResponseQueryHelpResponse> =
            queryHelp(CollectResponseQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-collectresponse`, but is otherwise
         * the same as [CollectResponseService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: CollectResponseUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: CollectResponseUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
