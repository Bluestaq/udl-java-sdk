// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.dropzone.DropzoneCountParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateBulkParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneDeleteParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneListPage
import com.unifieddatalibrary.api.models.dropzone.DropzoneListParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneUpdateParams
import java.util.function.Consumer

interface DropzoneService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DropzoneService

    /**
     * Service operation to take a single dropzone record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DropzoneCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: DropzoneCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single dropzone record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): DropzoneRetrieveResponse = retrieve(id, DropzoneRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DropzoneRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
    ): DropzoneRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DropzoneRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DropzoneRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DropzoneRetrieveParams): DropzoneRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DropzoneRetrieveResponse =
        retrieve(id, DropzoneRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single dropzone record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: DropzoneUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DropzoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DropzoneUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: DropzoneUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): DropzoneListPage = list(DropzoneListParams.none())

    /** @see list */
    fun list(
        params: DropzoneListParams = DropzoneListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DropzoneListPage

    /** @see list */
    fun list(params: DropzoneListParams = DropzoneListParams.none()): DropzoneListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DropzoneListPage =
        list(DropzoneListParams.none(), requestOptions)

    /**
     * Service operation to delete a dropzone record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, DropzoneDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: DropzoneDeleteParams = DropzoneDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DropzoneDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DropzoneDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, DropzoneDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(DropzoneCountParams.none())

    /** @see count */
    fun count(
        params: DropzoneCountParams = DropzoneCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: DropzoneCountParams = DropzoneCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(DropzoneCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of dropzone records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: DropzoneCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: DropzoneCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): DropzoneQueryHelpResponse = queryHelp(DropzoneQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DropzoneQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none()
    ): DropzoneQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): DropzoneQueryHelpResponse =
        queryHelp(DropzoneQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DropzoneTupleParams): List<DropzoneTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DropzoneTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DropzoneTupleResponse>

    /**
     * Service operation to take multiple dropzone records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: DropzoneUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DropzoneUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [DropzoneService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DropzoneService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/dropzone`, but is otherwise the same as
         * [DropzoneService.create].
         */
        @MustBeClosed
        fun create(params: DropzoneCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DropzoneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DropzoneRetrieveResponse> =
            retrieve(id, DropzoneRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DropzoneRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
        ): HttpResponseFor<DropzoneRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DropzoneRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DropzoneRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DropzoneRetrieveParams): HttpResponseFor<DropzoneRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DropzoneRetrieveResponse> =
            retrieve(id, DropzoneRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: DropzoneUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: DropzoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DropzoneUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DropzoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/dropzone`, but is otherwise the same as
         * [DropzoneService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DropzoneListPage> = list(DropzoneListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DropzoneListParams = DropzoneListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DropzoneListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DropzoneListParams = DropzoneListParams.none()
        ): HttpResponseFor<DropzoneListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DropzoneListPage> =
            list(DropzoneListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, DropzoneDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DropzoneDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DropzoneDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, DropzoneDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/count`, but is otherwise the same as
         * [DropzoneService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(DropzoneCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: DropzoneCountParams = DropzoneCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: DropzoneCountParams = DropzoneCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(DropzoneCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/dropzone/createBulk`, but is otherwise the
         * same as [DropzoneService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: DropzoneCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: DropzoneCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/queryhelp`, but is otherwise the same
         * as [DropzoneService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<DropzoneQueryHelpResponse> =
            queryHelp(DropzoneQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DropzoneQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none()
        ): HttpResponseFor<DropzoneQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<DropzoneQueryHelpResponse> =
            queryHelp(DropzoneQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/tuple`, but is otherwise the same as
         * [DropzoneService.tuple].
         */
        @MustBeClosed
        fun tuple(params: DropzoneTupleParams): HttpResponseFor<List<DropzoneTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: DropzoneTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DropzoneTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-dropzone`, but is otherwise the same
         * as [DropzoneService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: DropzoneUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: DropzoneUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
