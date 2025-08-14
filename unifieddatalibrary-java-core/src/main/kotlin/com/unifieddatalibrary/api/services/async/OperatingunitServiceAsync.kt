// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OperatingunitFull
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCountParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCreateParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitDeleteParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitGetParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitListPageAsync
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitListParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitTupleParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OperatingunitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitServiceAsync

    /**
     * Service operation to take a single Operatingunit as a POST body and ingest into the database.
     * Operatingunit defines a unit or organization which operates or controls a space-related
     * Entity. A specific role is required to perform this service operation. Please contact the UDL
     * team for assistance.
     */
    fun create(params: OperatingunitCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OperatingunitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single Operatingunit. Operatingunit defines a unit or
     * organization which operates or controls a space-related Entity. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: OperatingunitUpdateParams): CompletableFuture<Void?> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OperatingunitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: OperatingunitUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OperatingunitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OperatingunitListPageAsync> = list(OperatingunitListParams.none())

    /** @see list */
    fun list(
        params: OperatingunitListParams = OperatingunitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OperatingunitListPageAsync>

    /** @see list */
    fun list(
        params: OperatingunitListParams = OperatingunitListParams.none()
    ): CompletableFuture<OperatingunitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OperatingunitListPageAsync> =
        list(OperatingunitListParams.none(), requestOptions)

    /**
     * Service operation to delete an Operatingunit object specified by the passed ID path
     * parameter. Operatingunit defines a unit or organization which operates or controls a
     * space-related Entity. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OperatingunitDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OperatingunitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OperatingunitDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OperatingunitDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(OperatingunitCountParams.none())

    /** @see count */
    fun count(
        params: OperatingunitCountParams = OperatingunitCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: OperatingunitCountParams = OperatingunitCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(OperatingunitCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Operatingunit record by its unique ID passed as a path
     * parameter. Operatingunit defines a unit or organization which operates or controls a
     * space-related Entity.
     */
    fun get(id: String): CompletableFuture<OperatingunitFull> =
        get(id, OperatingunitGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OperatingunitGetParams = OperatingunitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OperatingunitFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OperatingunitGetParams = OperatingunitGetParams.none(),
    ): CompletableFuture<OperatingunitFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OperatingunitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OperatingunitFull>

    /** @see get */
    fun get(params: OperatingunitGetParams): CompletableFuture<OperatingunitFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OperatingunitFull> =
        get(id, OperatingunitGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OperatingunitQueryhelpResponse> =
        queryhelp(OperatingunitQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OperatingunitQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none()
    ): CompletableFuture<OperatingunitQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OperatingunitQueryhelpResponse> =
        queryhelp(OperatingunitQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OperatingunitTupleParams): CompletableFuture<List<OperatingunitFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OperatingunitTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OperatingunitFull>>

    /**
     * A view of [OperatingunitServiceAsync] that provides access to raw HTTP responses for each
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
        ): OperatingunitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/operatingunit`, but is otherwise the same as
         * [OperatingunitServiceAsync.create].
         */
        fun create(params: OperatingunitCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OperatingunitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/operatingunit/{id}`, but is otherwise the same
         * as [OperatingunitServiceAsync.update].
         */
        fun update(id: String, params: OperatingunitUpdateParams): CompletableFuture<HttpResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: OperatingunitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: OperatingunitUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OperatingunitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/operatingunit`, but is otherwise the same as
         * [OperatingunitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OperatingunitListPageAsync>> =
            list(OperatingunitListParams.none())

        /** @see list */
        fun list(
            params: OperatingunitListParams = OperatingunitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OperatingunitListPageAsync>>

        /** @see list */
        fun list(
            params: OperatingunitListParams = OperatingunitListParams.none()
        ): CompletableFuture<HttpResponseFor<OperatingunitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OperatingunitListPageAsync>> =
            list(OperatingunitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/operatingunit/{id}`, but is otherwise the
         * same as [OperatingunitServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OperatingunitDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OperatingunitDeleteParams = OperatingunitDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OperatingunitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OperatingunitDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OperatingunitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/operatingunit/count`, but is otherwise the same
         * as [OperatingunitServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(OperatingunitCountParams.none())

        /** @see count */
        fun count(
            params: OperatingunitCountParams = OperatingunitCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: OperatingunitCountParams = OperatingunitCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(OperatingunitCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/operatingunit/{id}`, but is otherwise the same
         * as [OperatingunitServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OperatingunitFull>> =
            get(id, OperatingunitGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OperatingunitGetParams = OperatingunitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OperatingunitFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OperatingunitGetParams = OperatingunitGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OperatingunitFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OperatingunitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OperatingunitFull>>

        /** @see get */
        fun get(
            params: OperatingunitGetParams
        ): CompletableFuture<HttpResponseFor<OperatingunitFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OperatingunitFull>> =
            get(id, OperatingunitGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/operatingunit/queryhelp`, but is otherwise the
         * same as [OperatingunitServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OperatingunitQueryhelpResponse>> =
            queryhelp(OperatingunitQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OperatingunitQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OperatingunitQueryhelpParams = OperatingunitQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OperatingunitQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OperatingunitQueryhelpResponse>> =
            queryhelp(OperatingunitQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/operatingunit/tuple`, but is otherwise the same
         * as [OperatingunitServiceAsync.tuple].
         */
        fun tuple(
            params: OperatingunitTupleParams
        ): CompletableFuture<HttpResponseFor<List<OperatingunitFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OperatingunitTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OperatingunitFull>>>
    }
}
