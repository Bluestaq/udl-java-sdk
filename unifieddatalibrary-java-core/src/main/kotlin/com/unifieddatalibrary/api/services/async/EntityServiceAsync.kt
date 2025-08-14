// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.entities.EntityCountParams
import com.unifieddatalibrary.api.models.entities.EntityCreateParams
import com.unifieddatalibrary.api.models.entities.EntityDeleteParams
import com.unifieddatalibrary.api.models.entities.EntityGetAllTypesParams
import com.unifieddatalibrary.api.models.entities.EntityListPageAsync
import com.unifieddatalibrary.api.models.entities.EntityListParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpResponse
import com.unifieddatalibrary.api.models.entities.EntityRetrieveParams
import com.unifieddatalibrary.api.models.entities.EntityTupleParams
import com.unifieddatalibrary.api.models.entities.EntityUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync

    /**
     * Service operation to take a single Entity as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: EntityCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Entity record by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): CompletableFuture<EntityFull> =
        retrieve(id, EntityRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
    ): CompletableFuture<EntityFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityFull>

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): CompletableFuture<EntityFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EntityFull> =
        retrieve(id, EntityRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Entity. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: EntityUpdateParams): CompletableFuture<Void?> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntityUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<EntityListPageAsync> = list(EntityListParams.none())

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityListPageAsync>

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none()
    ): CompletableFuture<EntityListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EntityListPageAsync> =
        list(EntityListParams.none(), requestOptions)

    /**
     * Service operation to delete an Entity object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EntityDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntityDeleteParams = EntityDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EntityDeleteParams = EntityDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EntityDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EntityDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(EntityCountParams.none())

    /** @see count */
    fun count(
        params: EntityCountParams = EntityCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: EntityCountParams = EntityCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(EntityCountParams.none(), requestOptions)

    /** Retrieves all distinct entity types. */
    fun getAllTypes(): CompletableFuture<List<String>> = getAllTypes(EntityGetAllTypesParams.none())

    /** @see getAllTypes */
    fun getAllTypes(
        params: EntityGetAllTypesParams = EntityGetAllTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see getAllTypes */
    fun getAllTypes(
        params: EntityGetAllTypesParams = EntityGetAllTypesParams.none()
    ): CompletableFuture<List<String>> = getAllTypes(params, RequestOptions.none())

    /** @see getAllTypes */
    fun getAllTypes(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        getAllTypes(EntityGetAllTypesParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<EntityQueryHelpResponse> =
        queryHelp(EntityQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EntityQueryHelpParams = EntityQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: EntityQueryHelpParams = EntityQueryHelpParams.none()
    ): CompletableFuture<EntityQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<EntityQueryHelpResponse> =
        queryHelp(EntityQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EntityTupleParams): CompletableFuture<List<EntityFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EntityTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EntityFull>>

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/entity`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        fun create(params: EntityCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/entity/{id}`, but is otherwise the same as
         * [EntityServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EntityFull>> =
            retrieve(id, EntityRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityFull>>

        /** @see retrieve */
        fun retrieve(params: EntityRetrieveParams): CompletableFuture<HttpResponseFor<EntityFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityFull>> =
            retrieve(id, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/entity/{id}`, but is otherwise the same as
         * [EntityServiceAsync.update].
         */
        fun update(id: String, params: EntityUpdateParams): CompletableFuture<HttpResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: EntityUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/entity`, but is otherwise the same as
         * [EntityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none())

        /** @see list */
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>>

        /** @see list */
        fun list(
            params: EntityListParams = EntityListParams.none()
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/entity/{id}`, but is otherwise the same as
         * [EntityServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EntityDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EntityDeleteParams = EntityDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EntityDeleteParams = EntityDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EntityDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EntityDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/count`, but is otherwise the same as
         * [EntityServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(EntityCountParams.none())

        /** @see count */
        fun count(
            params: EntityCountParams = EntityCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: EntityCountParams = EntityCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(EntityCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/getAllTypes`, but is otherwise the same
         * as [EntityServiceAsync.getAllTypes].
         */
        fun getAllTypes(): CompletableFuture<HttpResponseFor<List<String>>> =
            getAllTypes(EntityGetAllTypesParams.none())

        /** @see getAllTypes */
        fun getAllTypes(
            params: EntityGetAllTypesParams = EntityGetAllTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see getAllTypes */
        fun getAllTypes(
            params: EntityGetAllTypesParams = EntityGetAllTypesParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getAllTypes(params, RequestOptions.none())

        /** @see getAllTypes */
        fun getAllTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getAllTypes(EntityGetAllTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/queryhelp`, but is otherwise the same as
         * [EntityServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EntityQueryHelpResponse>> =
            queryHelp(EntityQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: EntityQueryHelpParams = EntityQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: EntityQueryHelpParams = EntityQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<EntityQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityQueryHelpResponse>> =
            queryHelp(EntityQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/tuple`, but is otherwise the same as
         * [EntityServiceAsync.tuple].
         */
        fun tuple(params: EntityTupleParams): CompletableFuture<HttpResponseFor<List<EntityFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EntityTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EntityFull>>>
    }
}
