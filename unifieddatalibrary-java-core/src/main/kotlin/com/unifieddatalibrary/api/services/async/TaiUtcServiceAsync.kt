// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCountParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcDeleteParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcGetParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListPageAsync
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcQueryhelpResponse
import com.unifieddatalibrary.api.models.taiutc.TaiUtcTupleParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcUpdateParams
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import com.unifieddatalibrary.api.services.async.taiutc.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaiUtcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaiUtcServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single TAIUTC object as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: TaiUtcCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaiUtcCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single TAIUTC object. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: TaiUtcUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: TaiUtcUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: TaiUtcUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TaiUtcUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: TaiUtcListParams): CompletableFuture<TaiUtcListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TaiUtcListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaiUtcListPageAsync>

    /**
     * Service operation to delete an TAIUTC object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. Note, delete operations do not remove data from historical or publish/subscribe
     * stores.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, TaiUtcDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaiUtcDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TaiUtcDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TaiUtcDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: TaiUtcCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: TaiUtcCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to get a single TAIUTC record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<TaiutcFull> = get(id, TaiUtcGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: TaiUtcGetParams = TaiUtcGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaiutcFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: TaiUtcGetParams = TaiUtcGetParams.none(),
    ): CompletableFuture<TaiutcFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaiUtcGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaiutcFull>

    /** @see get */
    fun get(params: TaiUtcGetParams): CompletableFuture<TaiutcFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<TaiutcFull> =
        get(id, TaiUtcGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<TaiUtcQueryhelpResponse> =
        queryhelp(TaiUtcQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaiUtcQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none()
    ): CompletableFuture<TaiUtcQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<TaiUtcQueryhelpResponse> =
        queryhelp(TaiUtcQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: TaiUtcTupleParams): CompletableFuture<List<TaiutcFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: TaiUtcTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TaiutcFull>>

    /**
     * A view of [TaiUtcServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaiUtcServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/taiutc`, but is otherwise the same as
         * [TaiUtcServiceAsync.create].
         */
        fun create(params: TaiUtcCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TaiUtcCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/taiutc/{id}`, but is otherwise the same as
         * [TaiUtcServiceAsync.update].
         */
        fun update(pathId: String, params: TaiUtcUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: TaiUtcUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: TaiUtcUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TaiUtcUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/taiutc`, but is otherwise the same as
         * [TaiUtcServiceAsync.list].
         */
        fun list(
            params: TaiUtcListParams
        ): CompletableFuture<HttpResponseFor<TaiUtcListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TaiUtcListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaiUtcListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/taiutc/{id}`, but is otherwise the same as
         * [TaiUtcServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TaiUtcDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TaiUtcDeleteParams = TaiUtcDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TaiUtcDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TaiUtcDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TaiUtcDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/taiutc/count`, but is otherwise the same as
         * [TaiUtcServiceAsync.count].
         */
        fun count(params: TaiUtcCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: TaiUtcCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/taiutc/{id}`, but is otherwise the same as
         * [TaiUtcServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<TaiutcFull>> =
            get(id, TaiUtcGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: TaiUtcGetParams = TaiUtcGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaiutcFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: TaiUtcGetParams = TaiUtcGetParams.none(),
        ): CompletableFuture<HttpResponseFor<TaiutcFull>> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TaiUtcGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaiutcFull>>

        /** @see get */
        fun get(params: TaiUtcGetParams): CompletableFuture<HttpResponseFor<TaiutcFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaiutcFull>> =
            get(id, TaiUtcGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/taiutc/queryhelp`, but is otherwise the same as
         * [TaiUtcServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<TaiUtcQueryhelpResponse>> =
            queryhelp(TaiUtcQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaiUtcQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: TaiUtcQueryhelpParams = TaiUtcQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<TaiUtcQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TaiUtcQueryhelpResponse>> =
            queryhelp(TaiUtcQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/taiutc/tuple`, but is otherwise the same as
         * [TaiUtcServiceAsync.tuple].
         */
        fun tuple(params: TaiUtcTupleParams): CompletableFuture<HttpResponseFor<List<TaiutcFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: TaiUtcTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TaiutcFull>>>
    }
}
