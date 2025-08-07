// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCountParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateBulkParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListPage
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventQueryhelpResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleResponse
import com.unifieddatalibrary.api.models.launchevent.LaunchEventUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.launchevent.HistoryService
import java.util.function.Consumer

interface LaunchEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchEventService

    fun history(): HistoryService

    /**
     * Service operation to take a single LaunchEvent as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: LaunchEventCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: LaunchEventListParams): LaunchEventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LaunchEventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchEventListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: LaunchEventCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: LaunchEventCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of LaunchEvent as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: LaunchEventCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: LaunchEventCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single LaunchEvent record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): LaunchEventGetResponse = get(id, LaunchEventGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchEventGetParams = LaunchEventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchEventGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchEventGetParams = LaunchEventGetParams.none(),
    ): LaunchEventGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchEventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchEventGetResponse

    /** @see get */
    fun get(params: LaunchEventGetParams): LaunchEventGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchEventGetResponse =
        get(id, LaunchEventGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LaunchEventQueryhelpResponse = queryhelp(LaunchEventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchEventQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none()
    ): LaunchEventQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LaunchEventQueryhelpResponse =
        queryhelp(LaunchEventQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaunchEventTupleParams): List<LaunchEventTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchEventTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LaunchEventTupleResponse>

    /**
     * Service operation to take LaunchEvent entries as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: LaunchEventUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: LaunchEventUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LaunchEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchEventService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchevent`, but is otherwise the same as
         * [LaunchEventService.create].
         */
        @MustBeClosed
        fun create(params: LaunchEventCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LaunchEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/launchevent`, but is otherwise the same as
         * [LaunchEventService.list].
         */
        @MustBeClosed
        fun list(params: LaunchEventListParams): HttpResponseFor<LaunchEventListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchEventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchEventListPage>

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/count`, but is otherwise the same
         * as [LaunchEventService.count].
         */
        @MustBeClosed
        fun count(params: LaunchEventCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaunchEventCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/launchevent/createBulk`, but is otherwise the
         * same as [LaunchEventService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: LaunchEventCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: LaunchEventCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/{id}`, but is otherwise the same as
         * [LaunchEventService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchEventGetResponse> =
            get(id, LaunchEventGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchEventGetParams = LaunchEventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchEventGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchEventGetParams = LaunchEventGetParams.none(),
        ): HttpResponseFor<LaunchEventGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaunchEventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchEventGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchEventGetParams): HttpResponseFor<LaunchEventGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchEventGetResponse> =
            get(id, LaunchEventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/queryhelp`, but is otherwise the
         * same as [LaunchEventService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LaunchEventQueryhelpResponse> =
            queryhelp(LaunchEventQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchEventQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchEventQueryhelpParams = LaunchEventQueryhelpParams.none()
        ): HttpResponseFor<LaunchEventQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<LaunchEventQueryhelpResponse> =
            queryhelp(LaunchEventQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchevent/tuple`, but is otherwise the same
         * as [LaunchEventService.tuple].
         */
        @MustBeClosed
        fun tuple(params: LaunchEventTupleParams): HttpResponseFor<List<LaunchEventTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LaunchEventTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LaunchEventTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-launchevent`, but is otherwise the
         * same as [LaunchEventService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: LaunchEventUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: LaunchEventUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
