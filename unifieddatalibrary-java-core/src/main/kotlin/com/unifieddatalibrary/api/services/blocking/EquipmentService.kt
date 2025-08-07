// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.equipment.EquipmentCountParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateBulkParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateParams
import com.unifieddatalibrary.api.models.equipment.EquipmentDeleteParams
import com.unifieddatalibrary.api.models.equipment.EquipmentFull
import com.unifieddatalibrary.api.models.equipment.EquipmentListPage
import com.unifieddatalibrary.api.models.equipment.EquipmentListParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpResponse
import com.unifieddatalibrary.api.models.equipment.EquipmentRetrieveParams
import com.unifieddatalibrary.api.models.equipment.EquipmentTupleParams
import com.unifieddatalibrary.api.models.equipment.EquipmentUpdateParams
import java.util.function.Consumer

interface EquipmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentService

    /**
     * Service operation to take a single equipment record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: EquipmentCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EquipmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single equipment record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): EquipmentFull = retrieve(id, EquipmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EquipmentFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(),
    ): EquipmentFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EquipmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EquipmentFull

    /** @see retrieve */
    fun retrieve(params: EquipmentRetrieveParams): EquipmentFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EquipmentFull =
        retrieve(id, EquipmentRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single equipment record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: EquipmentUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: EquipmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: EquipmentUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EquipmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): EquipmentListPage = list(EquipmentListParams.none())

    /** @see list */
    fun list(
        params: EquipmentListParams = EquipmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EquipmentListPage

    /** @see list */
    fun list(params: EquipmentListParams = EquipmentListParams.none()): EquipmentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EquipmentListPage =
        list(EquipmentListParams.none(), requestOptions)

    /**
     * Service operation to delete a equipment record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, EquipmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EquipmentDeleteParams = EquipmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EquipmentDeleteParams = EquipmentDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EquipmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EquipmentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EquipmentDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(EquipmentCountParams.none())

    /** @see count */
    fun count(
        params: EquipmentCountParams = EquipmentCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: EquipmentCountParams = EquipmentCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(EquipmentCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of Equipment records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EquipmentCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EquipmentCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): EquipmentQueryHelpResponse = queryHelp(EquipmentQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EquipmentQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none()
    ): EquipmentQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EquipmentQueryHelpResponse =
        queryHelp(EquipmentQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EquipmentTupleParams): List<EquipmentFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EquipmentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EquipmentFull>

    /** A view of [EquipmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/equipment`, but is otherwise the same as
         * [EquipmentService.create].
         */
        @MustBeClosed
        fun create(params: EquipmentCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EquipmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/equipment/{id}`, but is otherwise the same as
         * [EquipmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EquipmentFull> =
            retrieve(id, EquipmentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EquipmentFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(),
        ): HttpResponseFor<EquipmentFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EquipmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EquipmentFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EquipmentRetrieveParams): HttpResponseFor<EquipmentFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EquipmentFull> =
            retrieve(id, EquipmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/equipment/{id}`, but is otherwise the same as
         * [EquipmentService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: EquipmentUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: EquipmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EquipmentUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EquipmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/equipment`, but is otherwise the same as
         * [EquipmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EquipmentListPage> = list(EquipmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EquipmentListParams = EquipmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EquipmentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EquipmentListParams = EquipmentListParams.none()
        ): HttpResponseFor<EquipmentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EquipmentListPage> =
            list(EquipmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/equipment/{id}`, but is otherwise the same
         * as [EquipmentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, EquipmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EquipmentDeleteParams = EquipmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EquipmentDeleteParams = EquipmentDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EquipmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EquipmentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EquipmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/equipment/count`, but is otherwise the same as
         * [EquipmentService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(EquipmentCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EquipmentCountParams = EquipmentCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: EquipmentCountParams = EquipmentCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(EquipmentCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/equipment/createBulk`, but is otherwise the
         * same as [EquipmentService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: EquipmentCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: EquipmentCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/equipment/queryhelp`, but is otherwise the same
         * as [EquipmentService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EquipmentQueryHelpResponse> =
            queryHelp(EquipmentQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EquipmentQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none()
        ): HttpResponseFor<EquipmentQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EquipmentQueryHelpResponse> =
            queryHelp(EquipmentQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/equipment/tuple`, but is otherwise the same as
         * [EquipmentService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EquipmentTupleParams): HttpResponseFor<List<EquipmentFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EquipmentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EquipmentFull>>
    }
}
