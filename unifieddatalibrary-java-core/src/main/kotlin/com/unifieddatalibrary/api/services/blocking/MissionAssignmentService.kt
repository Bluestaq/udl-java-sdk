// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCountParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateBulkParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentDeleteParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentGetParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentGetResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListPage
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentUpdateParams
import com.unifieddatalibrary.api.services.blocking.missionassignment.HistoryService
import java.util.function.Consumer

interface MissionAssignmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionAssignmentService

    fun history(): HistoryService

    /**
     * Service operation to take a single MissionAssignment as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: MissionAssignmentCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MissionAssignmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single MissionAssignment. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: MissionAssignmentUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: MissionAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: MissionAssignmentUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MissionAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: MissionAssignmentListParams): MissionAssignmentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MissionAssignmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionAssignmentListPage

    /**
     * Service operation to delete a MissionAssignment object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, MissionAssignmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MissionAssignmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: MissionAssignmentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, MissionAssignmentDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: MissionAssignmentCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: MissionAssignmentCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to take multiple MissionAssignments as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: MissionAssignmentCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: MissionAssignmentCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single MissionAssignment record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): MissionAssignmentGetResponse = get(id, MissionAssignmentGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionAssignmentGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
    ): MissionAssignmentGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MissionAssignmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionAssignmentGetResponse

    /** @see get */
    fun get(params: MissionAssignmentGetParams): MissionAssignmentGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): MissionAssignmentGetResponse =
        get(id, MissionAssignmentGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): MissionAssignmentQueryhelpResponse =
        queryhelp(MissionAssignmentQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MissionAssignmentQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none()
    ): MissionAssignmentQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): MissionAssignmentQueryhelpResponse =
        queryhelp(MissionAssignmentQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: MissionAssignmentTupleParams): List<MissionAssignmentTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: MissionAssignmentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<MissionAssignmentTupleResponse>

    /**
     * A view of [MissionAssignmentService] that provides access to raw HTTP responses for each
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
        ): MissionAssignmentService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/missionassignment`, but is otherwise the same
         * as [MissionAssignmentService.create].
         */
        @MustBeClosed
        fun create(params: MissionAssignmentCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MissionAssignmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/missionassignment/{id}`, but is otherwise the
         * same as [MissionAssignmentService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: MissionAssignmentUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: MissionAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MissionAssignmentUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MissionAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment`, but is otherwise the same
         * as [MissionAssignmentService.list].
         */
        @MustBeClosed
        fun list(params: MissionAssignmentListParams): HttpResponseFor<MissionAssignmentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MissionAssignmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionAssignmentListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/missionassignment/{id}`, but is otherwise
         * the same as [MissionAssignmentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, MissionAssignmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MissionAssignmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MissionAssignmentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, MissionAssignmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/count`, but is otherwise the
         * same as [MissionAssignmentService.count].
         */
        @MustBeClosed
        fun count(params: MissionAssignmentCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: MissionAssignmentCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/missionassignment/createBulk`, but is
         * otherwise the same as [MissionAssignmentService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: MissionAssignmentCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: MissionAssignmentCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/{id}`, but is otherwise the
         * same as [MissionAssignmentService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<MissionAssignmentGetResponse> =
            get(id, MissionAssignmentGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionAssignmentGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
        ): HttpResponseFor<MissionAssignmentGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MissionAssignmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionAssignmentGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: MissionAssignmentGetParams): HttpResponseFor<MissionAssignmentGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionAssignmentGetResponse> =
            get(id, MissionAssignmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/queryhelp`, but is otherwise
         * the same as [MissionAssignmentService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<MissionAssignmentQueryhelpResponse> =
            queryhelp(MissionAssignmentQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MissionAssignmentQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none()
        ): HttpResponseFor<MissionAssignmentQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<MissionAssignmentQueryhelpResponse> =
            queryhelp(MissionAssignmentQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/tuple`, but is otherwise the
         * same as [MissionAssignmentService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: MissionAssignmentTupleParams
        ): HttpResponseFor<List<MissionAssignmentTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: MissionAssignmentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<MissionAssignmentTupleResponse>>
    }
}
