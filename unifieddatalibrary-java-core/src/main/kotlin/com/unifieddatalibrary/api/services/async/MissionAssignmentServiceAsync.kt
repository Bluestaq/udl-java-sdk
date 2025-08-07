// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

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
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListPageAsync
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentQueryhelpResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleResponse
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentUpdateParams
import com.unifieddatalibrary.api.services.async.missionassignment.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MissionAssignmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionAssignmentServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single MissionAssignment as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: MissionAssignmentCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MissionAssignmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single MissionAssignment. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: MissionAssignmentUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: MissionAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: MissionAssignmentUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MissionAssignmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: MissionAssignmentListParams
    ): CompletableFuture<MissionAssignmentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MissionAssignmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionAssignmentListPageAsync>

    /**
     * Service operation to delete a MissionAssignment object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, MissionAssignmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MissionAssignmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MissionAssignmentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, MissionAssignmentDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: MissionAssignmentCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: MissionAssignmentCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to take multiple MissionAssignments as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: MissionAssignmentCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: MissionAssignmentCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single MissionAssignment record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<MissionAssignmentGetResponse> =
        get(id, MissionAssignmentGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionAssignmentGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
    ): CompletableFuture<MissionAssignmentGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MissionAssignmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionAssignmentGetResponse>

    /** @see get */
    fun get(params: MissionAssignmentGetParams): CompletableFuture<MissionAssignmentGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionAssignmentGetResponse> =
        get(id, MissionAssignmentGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<MissionAssignmentQueryhelpResponse> =
        queryhelp(MissionAssignmentQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MissionAssignmentQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none()
    ): CompletableFuture<MissionAssignmentQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<MissionAssignmentQueryhelpResponse> =
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
    fun tuple(
        params: MissionAssignmentTupleParams
    ): CompletableFuture<List<MissionAssignmentTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: MissionAssignmentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<MissionAssignmentTupleResponse>>

    /**
     * A view of [MissionAssignmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): MissionAssignmentServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/missionassignment`, but is otherwise the same
         * as [MissionAssignmentServiceAsync.create].
         */
        fun create(params: MissionAssignmentCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MissionAssignmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/missionassignment/{id}`, but is otherwise the
         * same as [MissionAssignmentServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: MissionAssignmentUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: MissionAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: MissionAssignmentUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MissionAssignmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment`, but is otherwise the same
         * as [MissionAssignmentServiceAsync.list].
         */
        fun list(
            params: MissionAssignmentListParams
        ): CompletableFuture<HttpResponseFor<MissionAssignmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MissionAssignmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionAssignmentListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/missionassignment/{id}`, but is otherwise
         * the same as [MissionAssignmentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, MissionAssignmentDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MissionAssignmentDeleteParams = MissionAssignmentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MissionAssignmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MissionAssignmentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, MissionAssignmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/count`, but is otherwise the
         * same as [MissionAssignmentServiceAsync.count].
         */
        fun count(
            params: MissionAssignmentCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: MissionAssignmentCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/missionassignment/createBulk`, but is
         * otherwise the same as [MissionAssignmentServiceAsync.createBulk].
         */
        fun createBulk(params: MissionAssignmentCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: MissionAssignmentCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/{id}`, but is otherwise the
         * same as [MissionAssignmentServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>> =
            get(id, MissionAssignmentGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: MissionAssignmentGetParams = MissionAssignmentGetParams.none(),
        ): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: MissionAssignmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>>

        /** @see get */
        fun get(
            params: MissionAssignmentGetParams
        ): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionAssignmentGetResponse>> =
            get(id, MissionAssignmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/queryhelp`, but is otherwise
         * the same as [MissionAssignmentServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<MissionAssignmentQueryhelpResponse>> =
            queryhelp(MissionAssignmentQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MissionAssignmentQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: MissionAssignmentQueryhelpParams = MissionAssignmentQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<MissionAssignmentQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MissionAssignmentQueryhelpResponse>> =
            queryhelp(MissionAssignmentQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/missionassignment/tuple`, but is otherwise the
         * same as [MissionAssignmentServiceAsync.tuple].
         */
        fun tuple(
            params: MissionAssignmentTupleParams
        ): CompletableFuture<HttpResponseFor<List<MissionAssignmentTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: MissionAssignmentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<MissionAssignmentTupleResponse>>>
    }
}
