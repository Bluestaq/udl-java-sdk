// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EntityFull
import com.unifieddatalibrary.api.models.entities.EntityCountParams
import com.unifieddatalibrary.api.models.entities.EntityCreateParams
import com.unifieddatalibrary.api.models.entities.EntityDeleteParams
import com.unifieddatalibrary.api.models.entities.EntityGetAllTypesParams
import com.unifieddatalibrary.api.models.entities.EntityListPage
import com.unifieddatalibrary.api.models.entities.EntityListParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpParams
import com.unifieddatalibrary.api.models.entities.EntityQueryHelpResponse
import com.unifieddatalibrary.api.models.entities.EntityRetrieveParams
import com.unifieddatalibrary.api.models.entities.EntityTupleParams
import com.unifieddatalibrary.api.models.entities.EntityUpdateParams
import java.util.function.Consumer

interface EntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService

    /**
     * Service operation to take a single Entity as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: EntityCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EntityCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single Entity record by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): EntityFull = retrieve(id, EntityRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
    ): EntityFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityFull

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): EntityFull = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EntityFull =
        retrieve(id, EntityRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Entity. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: EntityUpdateParams) = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EntityUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: EntityUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): EntityListPage = list(EntityListParams.none())

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage

    /** @see list */
    fun list(params: EntityListParams = EntityListParams.none()): EntityListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EntityListPage =
        list(EntityListParams.none(), requestOptions)

    /**
     * Service operation to delete an Entity object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, EntityDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EntityDeleteParams = EntityDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EntityDeleteParams = EntityDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EntityDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EntityDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EntityDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(EntityCountParams.none())

    /** @see count */
    fun count(
        params: EntityCountParams = EntityCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: EntityCountParams = EntityCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(EntityCountParams.none(), requestOptions)

    /** Retrieves all distinct entity types. */
    fun getAllTypes(): List<String> = getAllTypes(EntityGetAllTypesParams.none())

    /** @see getAllTypes */
    fun getAllTypes(
        params: EntityGetAllTypesParams = EntityGetAllTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see getAllTypes */
    fun getAllTypes(
        params: EntityGetAllTypesParams = EntityGetAllTypesParams.none()
    ): List<String> = getAllTypes(params, RequestOptions.none())

    /** @see getAllTypes */
    fun getAllTypes(requestOptions: RequestOptions): List<String> =
        getAllTypes(EntityGetAllTypesParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): EntityQueryHelpResponse = queryHelp(EntityQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EntityQueryHelpParams = EntityQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: EntityQueryHelpParams = EntityQueryHelpParams.none()
    ): EntityQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EntityQueryHelpResponse =
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
    fun tuple(params: EntityTupleParams): List<EntityFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EntityTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EntityFull>

    /** A view of [EntityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/entity`, but is otherwise the same as
         * [EntityService.create].
         */
        @MustBeClosed
        fun create(params: EntityCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/entity/{id}`, but is otherwise the same as
         * [EntityService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EntityFull> =
            retrieve(id, EntityRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
        ): HttpResponseFor<EntityFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EntityRetrieveParams): HttpResponseFor<EntityFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EntityFull> =
            retrieve(id, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/entity/{id}`, but is otherwise the same as
         * [EntityService.update].
         */
        @MustBeClosed
        fun update(id: String, params: EntityUpdateParams): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EntityUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/entity`, but is otherwise the same as
         * [EntityService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EntityListPage> = list(EntityListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none()
        ): HttpResponseFor<EntityListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityListPage> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/entity/{id}`, but is otherwise the same as
         * [EntityService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, EntityDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntityDeleteParams = EntityDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntityDeleteParams = EntityDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EntityDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EntityDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/count`, but is otherwise the same as
         * [EntityService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(EntityCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EntityCountParams = EntityCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: EntityCountParams = EntityCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(EntityCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/getAllTypes`, but is otherwise the same
         * as [EntityService.getAllTypes].
         */
        @MustBeClosed
        fun getAllTypes(): HttpResponseFor<List<String>> =
            getAllTypes(EntityGetAllTypesParams.none())

        /** @see getAllTypes */
        @MustBeClosed
        fun getAllTypes(
            params: EntityGetAllTypesParams = EntityGetAllTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see getAllTypes */
        @MustBeClosed
        fun getAllTypes(
            params: EntityGetAllTypesParams = EntityGetAllTypesParams.none()
        ): HttpResponseFor<List<String>> = getAllTypes(params, RequestOptions.none())

        /** @see getAllTypes */
        @MustBeClosed
        fun getAllTypes(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            getAllTypes(EntityGetAllTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/queryhelp`, but is otherwise the same as
         * [EntityService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EntityQueryHelpResponse> =
            queryHelp(EntityQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EntityQueryHelpParams = EntityQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EntityQueryHelpParams = EntityQueryHelpParams.none()
        ): HttpResponseFor<EntityQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EntityQueryHelpResponse> =
            queryHelp(EntityQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/entity/tuple`, but is otherwise the same as
         * [EntityService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EntityTupleParams): HttpResponseFor<List<EntityFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EntityTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EntityFull>>
    }
}
