// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.StatusFull
import com.unifieddatalibrary.api.models.status.StatusCountParams
import com.unifieddatalibrary.api.models.status.StatusCreateParams
import com.unifieddatalibrary.api.models.status.StatusDeleteParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityIdParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityTypeParams
import com.unifieddatalibrary.api.models.status.StatusGetParams
import com.unifieddatalibrary.api.models.status.StatusListPageAsync
import com.unifieddatalibrary.api.models.status.StatusListParams
import com.unifieddatalibrary.api.models.status.StatusQueryhelpParams
import com.unifieddatalibrary.api.models.status.StatusQueryhelpResponse
import com.unifieddatalibrary.api.models.status.StatusTupleParams
import com.unifieddatalibrary.api.models.status.StatusUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync

    /**
     * Service operation to take a single Status as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: StatusCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single Status. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: StatusUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: StatusUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<StatusListPageAsync> = list(StatusListParams.none())

    /** @see list */
    fun list(
        params: StatusListParams = StatusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusListPageAsync>

    /** @see list */
    fun list(
        params: StatusListParams = StatusListParams.none()
    ): CompletableFuture<StatusListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StatusListPageAsync> =
        list(StatusListParams.none(), requestOptions)

    /**
     * Service operation to delete a Status object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, StatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StatusDeleteParams = StatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: StatusDeleteParams = StatusDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: StatusDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, StatusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(StatusCountParams.none())

    /** @see count */
    fun count(
        params: StatusCountParams = StatusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: StatusCountParams = StatusCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(StatusCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Status record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<StatusFull> = get(id, StatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: StatusGetParams = StatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: StatusGetParams = StatusGetParams.none(),
    ): CompletableFuture<StatusFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusFull>

    /** @see get */
    fun get(params: StatusGetParams): CompletableFuture<StatusFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<StatusFull> =
        get(id, StatusGetParams.none(), requestOptions)

    /** Service operation to get all statuses related to a particular entity. */
    fun getByEntityId(idEntity: String): CompletableFuture<List<StatusFull>> =
        getByEntityId(idEntity, StatusGetByEntityIdParams.none())

    /** @see getByEntityId */
    fun getByEntityId(
        idEntity: String,
        params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatusFull>> =
        getByEntityId(params.toBuilder().idEntity(idEntity).build(), requestOptions)

    /** @see getByEntityId */
    fun getByEntityId(
        idEntity: String,
        params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(),
    ): CompletableFuture<List<StatusFull>> = getByEntityId(idEntity, params, RequestOptions.none())

    /** @see getByEntityId */
    fun getByEntityId(
        params: StatusGetByEntityIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatusFull>>

    /** @see getByEntityId */
    fun getByEntityId(params: StatusGetByEntityIdParams): CompletableFuture<List<StatusFull>> =
        getByEntityId(params, RequestOptions.none())

    /** @see getByEntityId */
    fun getByEntityId(
        idEntity: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<StatusFull>> =
        getByEntityId(idEntity, StatusGetByEntityIdParams.none(), requestOptions)

    /** Service operation to get all statuses related to a particular entity type. */
    fun getByEntityType(entityType: String): CompletableFuture<List<StatusFull>> =
        getByEntityType(entityType, StatusGetByEntityTypeParams.none())

    /** @see getByEntityType */
    fun getByEntityType(
        entityType: String,
        params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatusFull>> =
        getByEntityType(params.toBuilder().entityType(entityType).build(), requestOptions)

    /** @see getByEntityType */
    fun getByEntityType(
        entityType: String,
        params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(),
    ): CompletableFuture<List<StatusFull>> =
        getByEntityType(entityType, params, RequestOptions.none())

    /** @see getByEntityType */
    fun getByEntityType(
        params: StatusGetByEntityTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatusFull>>

    /** @see getByEntityType */
    fun getByEntityType(params: StatusGetByEntityTypeParams): CompletableFuture<List<StatusFull>> =
        getByEntityType(params, RequestOptions.none())

    /** @see getByEntityType */
    fun getByEntityType(
        entityType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<StatusFull>> =
        getByEntityType(entityType, StatusGetByEntityTypeParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<StatusQueryhelpResponse> =
        queryhelp(StatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: StatusQueryhelpParams = StatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: StatusQueryhelpParams = StatusQueryhelpParams.none()
    ): CompletableFuture<StatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<StatusQueryhelpResponse> =
        queryhelp(StatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: StatusTupleParams): CompletableFuture<List<StatusFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: StatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatusFull>>

    /**
     * A view of [StatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/status`, but is otherwise the same as
         * [StatusServiceAsync.create].
         */
        fun create(params: StatusCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/status/{id}`, but is otherwise the same as
         * [StatusServiceAsync.update].
         */
        fun update(pathId: String, params: StatusUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: StatusUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/status`, but is otherwise the same as
         * [StatusServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StatusListPageAsync>> =
            list(StatusListParams.none())

        /** @see list */
        fun list(
            params: StatusListParams = StatusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusListPageAsync>>

        /** @see list */
        fun list(
            params: StatusListParams = StatusListParams.none()
        ): CompletableFuture<HttpResponseFor<StatusListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatusListPageAsync>> =
            list(StatusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/status/{id}`, but is otherwise the same as
         * [StatusServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, StatusDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: StatusDeleteParams = StatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: StatusDeleteParams = StatusDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: StatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, StatusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/count`, but is otherwise the same as
         * [StatusServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(StatusCountParams.none())

        /** @see count */
        fun count(
            params: StatusCountParams = StatusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: StatusCountParams = StatusCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(StatusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/{id}`, but is otherwise the same as
         * [StatusServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<StatusFull>> =
            get(id, StatusGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: StatusGetParams = StatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: StatusGetParams = StatusGetParams.none(),
        ): CompletableFuture<HttpResponseFor<StatusFull>> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: StatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusFull>>

        /** @see get */
        fun get(params: StatusGetParams): CompletableFuture<HttpResponseFor<StatusFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatusFull>> =
            get(id, StatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/byIdEntity/{idEntity}`, but is otherwise
         * the same as [StatusServiceAsync.getByEntityId].
         */
        fun getByEntityId(idEntity: String): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityId(idEntity, StatusGetByEntityIdParams.none())

        /** @see getByEntityId */
        fun getByEntityId(
            idEntity: String,
            params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityId(params.toBuilder().idEntity(idEntity).build(), requestOptions)

        /** @see getByEntityId */
        fun getByEntityId(
            idEntity: String,
            params: StatusGetByEntityIdParams = StatusGetByEntityIdParams.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityId(idEntity, params, RequestOptions.none())

        /** @see getByEntityId */
        fun getByEntityId(
            params: StatusGetByEntityIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>>

        /** @see getByEntityId */
        fun getByEntityId(
            params: StatusGetByEntityIdParams
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityId(params, RequestOptions.none())

        /** @see getByEntityId */
        fun getByEntityId(
            idEntity: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityId(idEntity, StatusGetByEntityIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/byEntityType/{entityType}`, but is
         * otherwise the same as [StatusServiceAsync.getByEntityType].
         */
        fun getByEntityType(
            entityType: String
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityType(entityType, StatusGetByEntityTypeParams.none())

        /** @see getByEntityType */
        fun getByEntityType(
            entityType: String,
            params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityType(params.toBuilder().entityType(entityType).build(), requestOptions)

        /** @see getByEntityType */
        fun getByEntityType(
            entityType: String,
            params: StatusGetByEntityTypeParams = StatusGetByEntityTypeParams.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityType(entityType, params, RequestOptions.none())

        /** @see getByEntityType */
        fun getByEntityType(
            params: StatusGetByEntityTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>>

        /** @see getByEntityType */
        fun getByEntityType(
            params: StatusGetByEntityTypeParams
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityType(params, RequestOptions.none())

        /** @see getByEntityType */
        fun getByEntityType(
            entityType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            getByEntityType(entityType, StatusGetByEntityTypeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/queryhelp`, but is otherwise the same as
         * [StatusServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<StatusQueryhelpResponse>> =
            queryhelp(StatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: StatusQueryhelpParams = StatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: StatusQueryhelpParams = StatusQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<StatusQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatusQueryhelpResponse>> =
            queryhelp(StatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/status/tuple`, but is otherwise the same as
         * [StatusServiceAsync.tuple].
         */
        fun tuple(params: StatusTupleParams): CompletableFuture<HttpResponseFor<List<StatusFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: StatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatusFull>>>
    }
}
