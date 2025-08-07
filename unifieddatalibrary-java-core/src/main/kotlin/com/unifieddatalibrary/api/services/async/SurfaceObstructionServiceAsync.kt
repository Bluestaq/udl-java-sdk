// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCountParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCreateParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionDeleteParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListPageAsync
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionListParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionQueryhelpResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleResponse
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SurfaceObstructionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SurfaceObstructionServiceAsync

    /**
     * Service operation to take a single surfaceobstruction record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: SurfaceObstructionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SurfaceObstructionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single surfaceobstruction record. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SurfaceObstructionUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SurfaceObstructionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SurfaceObstructionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SurfaceObstructionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SurfaceObstructionListPageAsync> =
        list(SurfaceObstructionListParams.none())

    /** @see list */
    fun list(
        params: SurfaceObstructionListParams = SurfaceObstructionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceObstructionListPageAsync>

    /** @see list */
    fun list(
        params: SurfaceObstructionListParams = SurfaceObstructionListParams.none()
    ): CompletableFuture<SurfaceObstructionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SurfaceObstructionListPageAsync> =
        list(SurfaceObstructionListParams.none(), requestOptions)

    /**
     * Service operation to delete a surfaceobstruction record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, SurfaceObstructionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SurfaceObstructionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SurfaceObstructionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SurfaceObstructionDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SurfaceObstructionCountParams.none())

    /** @see count */
    fun count(
        params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SurfaceObstructionCountParams.none(), requestOptions)

    /**
     * Service operation to get a single surfaceobstruction record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SurfaceObstructionGetResponse> =
        get(id, SurfaceObstructionGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceObstructionGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(),
    ): CompletableFuture<SurfaceObstructionGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SurfaceObstructionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceObstructionGetResponse>

    /** @see get */
    fun get(params: SurfaceObstructionGetParams): CompletableFuture<SurfaceObstructionGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SurfaceObstructionGetResponse> =
        get(id, SurfaceObstructionGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SurfaceObstructionQueryhelpResponse> =
        queryhelp(SurfaceObstructionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SurfaceObstructionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none()
    ): CompletableFuture<SurfaceObstructionQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SurfaceObstructionQueryhelpResponse> =
        queryhelp(SurfaceObstructionQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: SurfaceObstructionTupleParams
    ): CompletableFuture<List<SurfaceObstructionTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SurfaceObstructionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SurfaceObstructionTupleResponse>>

    /**
     * Service operation to take multiple surfaceobstruction records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: SurfaceObstructionUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SurfaceObstructionUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SurfaceObstructionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SurfaceObstructionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/surfaceobstruction`, but is otherwise the same
         * as [SurfaceObstructionServiceAsync.create].
         */
        fun create(params: SurfaceObstructionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SurfaceObstructionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/surfaceobstruction/{id}`, but is otherwise the
         * same as [SurfaceObstructionServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SurfaceObstructionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SurfaceObstructionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SurfaceObstructionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SurfaceObstructionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/surfaceobstruction`, but is otherwise the same
         * as [SurfaceObstructionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SurfaceObstructionListPageAsync>> =
            list(SurfaceObstructionListParams.none())

        /** @see list */
        fun list(
            params: SurfaceObstructionListParams = SurfaceObstructionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionListPageAsync>>

        /** @see list */
        fun list(
            params: SurfaceObstructionListParams = SurfaceObstructionListParams.none()
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionListPageAsync>> =
            list(SurfaceObstructionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/surfaceobstruction/{id}`, but is otherwise
         * the same as [SurfaceObstructionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SurfaceObstructionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SurfaceObstructionDeleteParams = SurfaceObstructionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SurfaceObstructionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SurfaceObstructionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SurfaceObstructionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surfaceobstruction/count`, but is otherwise the
         * same as [SurfaceObstructionServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SurfaceObstructionCountParams.none())

        /** @see count */
        fun count(
            params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SurfaceObstructionCountParams = SurfaceObstructionCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SurfaceObstructionCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surfaceobstruction/{id}`, but is otherwise the
         * same as [SurfaceObstructionServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> =
            get(id, SurfaceObstructionGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SurfaceObstructionGetParams = SurfaceObstructionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SurfaceObstructionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>>

        /** @see get */
        fun get(
            params: SurfaceObstructionGetParams
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionGetResponse>> =
            get(id, SurfaceObstructionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surfaceobstruction/queryhelp`, but is otherwise
         * the same as [SurfaceObstructionServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SurfaceObstructionQueryhelpResponse>> =
            queryhelp(SurfaceObstructionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SurfaceObstructionQueryhelpParams = SurfaceObstructionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SurfaceObstructionQueryhelpResponse>> =
            queryhelp(SurfaceObstructionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/surfaceobstruction/tuple`, but is otherwise the
         * same as [SurfaceObstructionServiceAsync.tuple].
         */
        fun tuple(
            params: SurfaceObstructionTupleParams
        ): CompletableFuture<HttpResponseFor<List<SurfaceObstructionTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SurfaceObstructionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SurfaceObstructionTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-surfaceobstruction`, but is otherwise
         * the same as [SurfaceObstructionServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SurfaceObstructionUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SurfaceObstructionUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
