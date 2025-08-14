// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.surface.SurfaceCountParams
import com.unifieddatalibrary.api.models.surface.SurfaceCreateParams
import com.unifieddatalibrary.api.models.surface.SurfaceDeleteParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetResponse
import com.unifieddatalibrary.api.models.surface.SurfaceListPageAsync
import com.unifieddatalibrary.api.models.surface.SurfaceListParams
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpParams
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpResponse
import com.unifieddatalibrary.api.models.surface.SurfaceTupleParams
import com.unifieddatalibrary.api.models.surface.SurfaceTupleResponse
import com.unifieddatalibrary.api.models.surface.SurfaceUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SurfaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceServiceAsync

    /**
     * Service operation to take a single Surface as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SurfaceCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SurfaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single Surface. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SurfaceUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SurfaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SurfaceUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SurfaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SurfaceListPageAsync> = list(SurfaceListParams.none())

    /** @see list */
    fun list(
        params: SurfaceListParams = SurfaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceListPageAsync>

    /** @see list */
    fun list(
        params: SurfaceListParams = SurfaceListParams.none()
    ): CompletableFuture<SurfaceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SurfaceListPageAsync> =
        list(SurfaceListParams.none(), requestOptions)

    /**
     * Service operation to delete a Surface object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SurfaceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SurfaceDeleteParams = SurfaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SurfaceDeleteParams = SurfaceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SurfaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SurfaceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SurfaceDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SurfaceCountParams.none())

    /** @see count */
    fun count(
        params: SurfaceCountParams = SurfaceCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: SurfaceCountParams = SurfaceCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SurfaceCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Surface record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<SurfaceGetResponse> = get(id, SurfaceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SurfaceGetParams = SurfaceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SurfaceGetParams = SurfaceGetParams.none(),
    ): CompletableFuture<SurfaceGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SurfaceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceGetResponse>

    /** @see get */
    fun get(params: SurfaceGetParams): CompletableFuture<SurfaceGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SurfaceGetResponse> =
        get(id, SurfaceGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SurfaceQueryhelpResponse> =
        queryhelp(SurfaceQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none()
    ): CompletableFuture<SurfaceQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SurfaceQueryhelpResponse> =
        queryhelp(SurfaceQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SurfaceTupleParams): CompletableFuture<List<SurfaceTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SurfaceTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SurfaceTupleResponse>>

    /**
     * A view of [SurfaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SurfaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/surface`, but is otherwise the same as
         * [SurfaceServiceAsync.create].
         */
        fun create(params: SurfaceCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SurfaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/surface/{id}`, but is otherwise the same as
         * [SurfaceServiceAsync.update].
         */
        fun update(pathId: String, params: SurfaceUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SurfaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SurfaceUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SurfaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/surface`, but is otherwise the same as
         * [SurfaceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SurfaceListPageAsync>> =
            list(SurfaceListParams.none())

        /** @see list */
        fun list(
            params: SurfaceListParams = SurfaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceListPageAsync>>

        /** @see list */
        fun list(
            params: SurfaceListParams = SurfaceListParams.none()
        ): CompletableFuture<HttpResponseFor<SurfaceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SurfaceListPageAsync>> =
            list(SurfaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/surface/{id}`, but is otherwise the same as
         * [SurfaceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SurfaceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SurfaceDeleteParams = SurfaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SurfaceDeleteParams = SurfaceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SurfaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SurfaceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SurfaceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surface/count`, but is otherwise the same as
         * [SurfaceServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(SurfaceCountParams.none())

        /** @see count */
        fun count(
            params: SurfaceCountParams = SurfaceCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SurfaceCountParams = SurfaceCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SurfaceCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surface/{id}`, but is otherwise the same as
         * [SurfaceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SurfaceGetResponse>> =
            get(id, SurfaceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SurfaceGetParams = SurfaceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SurfaceGetParams = SurfaceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SurfaceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceGetResponse>>

        /** @see get */
        fun get(params: SurfaceGetParams): CompletableFuture<HttpResponseFor<SurfaceGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SurfaceGetResponse>> =
            get(id, SurfaceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surface/queryhelp`, but is otherwise the same
         * as [SurfaceServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SurfaceQueryhelpResponse>> =
            queryhelp(SurfaceQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SurfaceQueryhelpParams = SurfaceQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SurfaceQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SurfaceQueryhelpResponse>> =
            queryhelp(SurfaceQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surface/tuple`, but is otherwise the same as
         * [SurfaceServiceAsync.tuple].
         */
        fun tuple(
            params: SurfaceTupleParams
        ): CompletableFuture<HttpResponseFor<List<SurfaceTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SurfaceTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SurfaceTupleResponse>>>
    }
}
