// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.dropzone.DropzoneCountParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateBulkParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneDeleteParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryHelpResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneQueryResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleResponse
import com.unifieddatalibrary.api.models.dropzone.DropzoneUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DropzoneServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DropzoneServiceAsync

    /**
     * Service operation to take a single dropzone record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DropzoneCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DropzoneCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single dropzone record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<DropzoneRetrieveResponse> =
        retrieve(id, DropzoneRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DropzoneRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
    ): CompletableFuture<DropzoneRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DropzoneRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DropzoneRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: DropzoneRetrieveParams): CompletableFuture<DropzoneRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DropzoneRetrieveResponse> =
        retrieve(id, DropzoneRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single dropzone record. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: DropzoneUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DropzoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DropzoneUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DropzoneUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to delete a dropzone record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, DropzoneDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DropzoneDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DropzoneDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, DropzoneDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(DropzoneCountParams.none())

    /** @see count */
    fun count(
        params: DropzoneCountParams = DropzoneCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: DropzoneCountParams = DropzoneCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(DropzoneCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of dropzone records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: DropzoneCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: DropzoneCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun query(): CompletableFuture<List<DropzoneQueryResponse>> = query(DropzoneQueryParams.none())

    /** @see query */
    fun query(
        params: DropzoneQueryParams = DropzoneQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DropzoneQueryResponse>>

    /** @see query */
    fun query(
        params: DropzoneQueryParams = DropzoneQueryParams.none()
    ): CompletableFuture<List<DropzoneQueryResponse>> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<List<DropzoneQueryResponse>> =
        query(DropzoneQueryParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<DropzoneQueryHelpResponse> =
        queryHelp(DropzoneQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DropzoneQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none()
    ): CompletableFuture<DropzoneQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<DropzoneQueryHelpResponse> =
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
    fun tuple(params: DropzoneTupleParams): CompletableFuture<List<DropzoneTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DropzoneTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DropzoneTupleResponse>>

    /**
     * Service operation to take multiple dropzone records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: DropzoneUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DropzoneUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DropzoneServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DropzoneServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/dropzone`, but is otherwise the same as
         * [DropzoneServiceAsync.create].
         */
        fun create(params: DropzoneCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DropzoneCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>> =
            retrieve(id, DropzoneRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DropzoneRetrieveParams = DropzoneRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DropzoneRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DropzoneRetrieveParams
        ): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DropzoneRetrieveResponse>> =
            retrieve(id, DropzoneRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneServiceAsync.update].
         */
        fun update(pathId: String, params: DropzoneUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: DropzoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: DropzoneUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DropzoneUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /udl/dropzone/{id}`, but is otherwise the same as
         * [DropzoneServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, DropzoneDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DropzoneDeleteParams = DropzoneDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DropzoneDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DropzoneDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, DropzoneDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/count`, but is otherwise the same as
         * [DropzoneServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(DropzoneCountParams.none())

        /** @see count */
        fun count(
            params: DropzoneCountParams = DropzoneCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: DropzoneCountParams = DropzoneCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(DropzoneCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/dropzone/createBulk`, but is otherwise the
         * same as [DropzoneServiceAsync.createBulk].
         */
        fun createBulk(params: DropzoneCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: DropzoneCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/dropzone`, but is otherwise the same as
         * [DropzoneServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<List<DropzoneQueryResponse>>> =
            query(DropzoneQueryParams.none())

        /** @see query */
        fun query(
            params: DropzoneQueryParams = DropzoneQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DropzoneQueryResponse>>>

        /** @see query */
        fun query(
            params: DropzoneQueryParams = DropzoneQueryParams.none()
        ): CompletableFuture<HttpResponseFor<List<DropzoneQueryResponse>>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DropzoneQueryResponse>>> =
            query(DropzoneQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/queryhelp`, but is otherwise the same
         * as [DropzoneServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<DropzoneQueryHelpResponse>> =
            queryHelp(DropzoneQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DropzoneQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: DropzoneQueryHelpParams = DropzoneQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<DropzoneQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DropzoneQueryHelpResponse>> =
            queryHelp(DropzoneQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dropzone/tuple`, but is otherwise the same as
         * [DropzoneServiceAsync.tuple].
         */
        fun tuple(
            params: DropzoneTupleParams
        ): CompletableFuture<HttpResponseFor<List<DropzoneTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DropzoneTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DropzoneTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-dropzone`, but is otherwise the same
         * as [DropzoneServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: DropzoneUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: DropzoneUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
