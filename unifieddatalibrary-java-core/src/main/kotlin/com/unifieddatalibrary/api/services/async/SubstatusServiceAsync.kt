// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.SubStatusFull
import com.unifieddatalibrary.api.models.SubStatusIngest
import com.unifieddatalibrary.api.models.substatus.SubstatusCountParams
import com.unifieddatalibrary.api.models.substatus.SubstatusCreateParams
import com.unifieddatalibrary.api.models.substatus.SubstatusDeleteParams
import com.unifieddatalibrary.api.models.substatus.SubstatusGetParams
import com.unifieddatalibrary.api.models.substatus.SubstatusListPageAsync
import com.unifieddatalibrary.api.models.substatus.SubstatusListParams
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpParams
import com.unifieddatalibrary.api.models.substatus.SubstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.substatus.SubstatusTupleParams
import com.unifieddatalibrary.api.models.substatus.SubstatusUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubstatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubstatusServiceAsync

    /**
     * Service operation to take a single Sub Status record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SubstatusCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubstatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        subStatusIngest: SubStatusIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(
            SubstatusCreateParams.builder().subStatusIngest(subStatusIngest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(subStatusIngest: SubStatusIngest): CompletableFuture<Void?> =
        create(subStatusIngest, RequestOptions.none())

    /**
     * Service operation to update a single Sub Status record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SubstatusUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SubstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SubstatusUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubstatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SubstatusListPageAsync> = list(SubstatusListParams.none())

    /** @see list */
    fun list(
        params: SubstatusListParams = SubstatusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubstatusListPageAsync>

    /** @see list */
    fun list(
        params: SubstatusListParams = SubstatusListParams.none()
    ): CompletableFuture<SubstatusListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubstatusListPageAsync> =
        list(SubstatusListParams.none(), requestOptions)

    /**
     * Service operation to delete a Sub Status record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SubstatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubstatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SubstatusDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SubstatusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SubstatusCountParams.none())

    /** @see count */
    fun count(
        params: SubstatusCountParams = SubstatusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SubstatusCountParams = SubstatusCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SubstatusCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Sub Status record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SubStatusFull> = get(id, SubstatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SubstatusGetParams = SubstatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubStatusFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SubstatusGetParams = SubstatusGetParams.none(),
    ): CompletableFuture<SubStatusFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubstatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubStatusFull>

    /** @see get */
    fun get(params: SubstatusGetParams): CompletableFuture<SubStatusFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SubStatusFull> =
        get(id, SubstatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SubstatusQueryhelpResponse> =
        queryhelp(SubstatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubstatusQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none()
    ): CompletableFuture<SubstatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SubstatusQueryhelpResponse> =
        queryhelp(SubstatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SubstatusTupleParams): CompletableFuture<List<SubStatusFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SubstatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SubStatusFull>>

    /**
     * A view of [SubstatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubstatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/substatus`, but is otherwise the same as
         * [SubstatusServiceAsync.create].
         */
        fun create(params: SubstatusCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubstatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            subStatusIngest: SubStatusIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                SubstatusCreateParams.builder().subStatusIngest(subStatusIngest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(subStatusIngest: SubStatusIngest): CompletableFuture<HttpResponse> =
            create(subStatusIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /udl/substatus/{id}`, but is otherwise the same as
         * [SubstatusServiceAsync.update].
         */
        fun update(pathId: String, params: SubstatusUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SubstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SubstatusUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubstatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/substatus`, but is otherwise the same as
         * [SubstatusServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubstatusListPageAsync>> =
            list(SubstatusListParams.none())

        /** @see list */
        fun list(
            params: SubstatusListParams = SubstatusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubstatusListPageAsync>>

        /** @see list */
        fun list(
            params: SubstatusListParams = SubstatusListParams.none()
        ): CompletableFuture<HttpResponseFor<SubstatusListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubstatusListPageAsync>> =
            list(SubstatusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/substatus/{id}`, but is otherwise the same
         * as [SubstatusServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SubstatusDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SubstatusDeleteParams = SubstatusDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubstatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SubstatusDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SubstatusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/count`, but is otherwise the same as
         * [SubstatusServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SubstatusCountParams.none())

        /** @see count */
        fun count(
            params: SubstatusCountParams = SubstatusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SubstatusCountParams = SubstatusCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SubstatusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/{id}`, but is otherwise the same as
         * [SubstatusServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SubStatusFull>> =
            get(id, SubstatusGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SubstatusGetParams = SubstatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubStatusFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SubstatusGetParams = SubstatusGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SubStatusFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SubstatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubStatusFull>>

        /** @see get */
        fun get(params: SubstatusGetParams): CompletableFuture<HttpResponseFor<SubStatusFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubStatusFull>> =
            get(id, SubstatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/queryhelp`, but is otherwise the same
         * as [SubstatusServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SubstatusQueryhelpResponse>> =
            queryhelp(SubstatusQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubstatusQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SubstatusQueryhelpParams = SubstatusQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SubstatusQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubstatusQueryhelpResponse>> =
            queryhelp(SubstatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/substatus/tuple`, but is otherwise the same as
         * [SubstatusServiceAsync.tuple].
         */
        fun tuple(
            params: SubstatusTupleParams
        ): CompletableFuture<HttpResponseFor<List<SubStatusFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SubstatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SubStatusFull>>>
    }
}
