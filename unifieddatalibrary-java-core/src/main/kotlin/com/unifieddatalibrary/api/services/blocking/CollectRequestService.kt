// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.CollectRequestFull
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCountParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestCreateParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListPage
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestListParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestQueryHelpResponse
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestRetrieveParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestTupleParams
import com.unifieddatalibrary.api.models.collectrequests.CollectRequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.collectrequests.HistoryService
import java.util.function.Consumer

interface CollectRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectRequestService

    fun history(): HistoryService

    /**
     * Service operation to take a single CollectRequest as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: CollectRequestCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CollectRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single CollectRequest by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CollectRequestFull = retrieve(id, CollectRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectRequestFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(),
    ): CollectRequestFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectRequestFull

    /** @see retrieve */
    fun retrieve(params: CollectRequestRetrieveParams): CollectRequestFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CollectRequestFull =
        retrieve(id, CollectRequestRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: CollectRequestListParams): CollectRequestListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CollectRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectRequestListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: CollectRequestCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: CollectRequestCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of CollectRequest as
     * a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: CollectRequestCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: CollectRequestCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CollectRequestQueryHelpResponse =
        queryHelp(CollectRequestQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectRequestQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none()
    ): CollectRequestQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CollectRequestQueryHelpResponse =
        queryHelp(CollectRequestQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: CollectRequestTupleParams): List<CollectRequestFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: CollectRequestTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CollectRequestFull>

    /**
     * Service operation to take a list of CollectRequest as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: CollectRequestUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [CollectRequestService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectRequestService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/collectrequest`, but is otherwise the same as
         * [CollectRequestService.create].
         */
        @MustBeClosed
        fun create(params: CollectRequestCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CollectRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/collectrequest/{id}`, but is otherwise the same
         * as [CollectRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CollectRequestFull> =
            retrieve(id, CollectRequestRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectRequestFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectRequestRetrieveParams = CollectRequestRetrieveParams.none(),
        ): HttpResponseFor<CollectRequestFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CollectRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectRequestFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CollectRequestRetrieveParams): HttpResponseFor<CollectRequestFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectRequestFull> =
            retrieve(id, CollectRequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/collectrequest`, but is otherwise the same as
         * [CollectRequestService.list].
         */
        @MustBeClosed
        fun list(params: CollectRequestListParams): HttpResponseFor<CollectRequestListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectRequestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectRequestListPage>

        /**
         * Returns a raw HTTP response for `get /udl/collectrequest/count`, but is otherwise the
         * same as [CollectRequestService.count].
         */
        @MustBeClosed
        fun count(params: CollectRequestCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: CollectRequestCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/collectrequest/createBulk`, but is otherwise
         * the same as [CollectRequestService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: CollectRequestCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: CollectRequestCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/collectrequest/queryhelp`, but is otherwise the
         * same as [CollectRequestService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<CollectRequestQueryHelpResponse> =
            queryHelp(CollectRequestQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectRequestQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: CollectRequestQueryHelpParams = CollectRequestQueryHelpParams.none()
        ): HttpResponseFor<CollectRequestQueryHelpResponse> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectRequestQueryHelpResponse> =
            queryHelp(CollectRequestQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/collectrequest/tuple`, but is otherwise the
         * same as [CollectRequestService.tuple].
         */
        @MustBeClosed
        fun tuple(params: CollectRequestTupleParams): HttpResponseFor<List<CollectRequestFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: CollectRequestTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CollectRequestFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-collectrequest`, but is otherwise the
         * same as [CollectRequestService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: CollectRequestUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: CollectRequestUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
