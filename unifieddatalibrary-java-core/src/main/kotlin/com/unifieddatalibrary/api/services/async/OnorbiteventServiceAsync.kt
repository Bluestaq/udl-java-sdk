// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCountParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCreateParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventDeleteParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListPageAsync
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventListParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleResponse
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbiteventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbiteventServiceAsync

    /**
     * Service operation to take a single OnorbitEvent as a POST body and ingest into the database.
     * An OnorbitEvent is an event associated with a particular on-orbit spacecraft including
     * insurance related losses, anomalies and incidents. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: OnorbiteventCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbiteventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single OnorbitEvent. An OnorbitEvent is an event associated
     * with a particular on-orbit spacecraft including insurance related losses, anomalies and
     * incidents. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun update(pathId: String, params: OnorbiteventUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OnorbiteventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbiteventUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbiteventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OnorbiteventListPageAsync> = list(OnorbiteventListParams.none())

    /** @see list */
    fun list(
        params: OnorbiteventListParams = OnorbiteventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbiteventListPageAsync>

    /** @see list */
    fun list(
        params: OnorbiteventListParams = OnorbiteventListParams.none()
    ): CompletableFuture<OnorbiteventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbiteventListPageAsync> =
        list(OnorbiteventListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitEvent object specified by the passed ID path parameter.
     * An OnorbitEvent is an event associated with a particular on-orbit spacecraft including
     * insurance related losses, anomalies and incidents. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OnorbiteventDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbiteventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbiteventDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OnorbiteventDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(OnorbiteventCountParams.none())

    /** @see count */
    fun count(
        params: OnorbiteventCountParams = OnorbiteventCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: OnorbiteventCountParams = OnorbiteventCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(OnorbiteventCountParams.none(), requestOptions)

    /**
     * Service operation to get a single OnorbitEvent record by its unique ID passed as a path
     * parameter. An OnorbitEvent is an event associated with a particular on-orbit spacecraft
     * including insurance related losses, anomalies and incidents.
     */
    fun get(id: String): CompletableFuture<OnorbiteventGetResponse> =
        get(id, OnorbiteventGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbiteventGetParams = OnorbiteventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbiteventGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbiteventGetParams = OnorbiteventGetParams.none(),
    ): CompletableFuture<OnorbiteventGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbiteventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbiteventGetResponse>

    /** @see get */
    fun get(params: OnorbiteventGetParams): CompletableFuture<OnorbiteventGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OnorbiteventGetResponse> =
        get(id, OnorbiteventGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OnorbiteventQueryhelpResponse> =
        queryhelp(OnorbiteventQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbiteventQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none()
    ): CompletableFuture<OnorbiteventQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OnorbiteventQueryhelpResponse> =
        queryhelp(OnorbiteventQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbiteventTupleParams): CompletableFuture<List<OnorbiteventTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbiteventTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OnorbiteventTupleResponse>>

    /**
     * A view of [OnorbiteventServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnorbiteventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitevent`, but is otherwise the same as
         * [OnorbiteventServiceAsync.create].
         */
        fun create(params: OnorbiteventCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OnorbiteventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/onorbitevent/{id}`, but is otherwise the same
         * as [OnorbiteventServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: OnorbiteventUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: OnorbiteventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: OnorbiteventUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OnorbiteventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitevent`, but is otherwise the same as
         * [OnorbiteventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OnorbiteventListPageAsync>> =
            list(OnorbiteventListParams.none())

        /** @see list */
        fun list(
            params: OnorbiteventListParams = OnorbiteventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbiteventListPageAsync>>

        /** @see list */
        fun list(
            params: OnorbiteventListParams = OnorbiteventListParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbiteventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbiteventListPageAsync>> =
            list(OnorbiteventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitevent/{id}`, but is otherwise the
         * same as [OnorbiteventServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OnorbiteventDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbiteventDeleteParams = OnorbiteventDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OnorbiteventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbiteventDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OnorbiteventDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitevent/count`, but is otherwise the same
         * as [OnorbiteventServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(OnorbiteventCountParams.none())

        /** @see count */
        fun count(
            params: OnorbiteventCountParams = OnorbiteventCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: OnorbiteventCountParams = OnorbiteventCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(OnorbiteventCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitevent/{id}`, but is otherwise the same
         * as [OnorbiteventServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>> =
            get(id, OnorbiteventGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OnorbiteventGetParams = OnorbiteventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OnorbiteventGetParams = OnorbiteventGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OnorbiteventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>>

        /** @see get */
        fun get(
            params: OnorbiteventGetParams
        ): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OnorbiteventGetResponse>> =
            get(id, OnorbiteventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitevent/queryhelp`, but is otherwise the
         * same as [OnorbiteventServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnorbiteventQueryhelpResponse>> =
            queryhelp(OnorbiteventQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbiteventQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbiteventQueryhelpParams = OnorbiteventQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbiteventQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbiteventQueryhelpResponse>> =
            queryhelp(OnorbiteventQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitevent/tuple`, but is otherwise the same
         * as [OnorbiteventServiceAsync.tuple].
         */
        fun tuple(
            params: OnorbiteventTupleParams
        ): CompletableFuture<HttpResponseFor<List<OnorbiteventTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OnorbiteventTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OnorbiteventTupleResponse>>>
    }
}
