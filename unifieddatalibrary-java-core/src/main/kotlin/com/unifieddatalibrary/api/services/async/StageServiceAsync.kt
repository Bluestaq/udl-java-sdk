// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.stage.StageCountParams
import com.unifieddatalibrary.api.models.stage.StageCreateParams
import com.unifieddatalibrary.api.models.stage.StageDeleteParams
import com.unifieddatalibrary.api.models.stage.StageGetParams
import com.unifieddatalibrary.api.models.stage.StageGetResponse
import com.unifieddatalibrary.api.models.stage.StageListPageAsync
import com.unifieddatalibrary.api.models.stage.StageListParams
import com.unifieddatalibrary.api.models.stage.StageQueryhelpParams
import com.unifieddatalibrary.api.models.stage.StageQueryhelpResponse
import com.unifieddatalibrary.api.models.stage.StageTupleParams
import com.unifieddatalibrary.api.models.stage.StageTupleResponse
import com.unifieddatalibrary.api.models.stage.StageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageServiceAsync

    /**
     * Service operation to take a single Stage as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. A Stage represents various stages of a particular launch vehicle, compiled by a
     * particular source. A vehicle may have multiple stage records.
     */
    fun create(params: StageCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single Stage. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance. A Stage represents various
     * stages of a particular launch vehicle, compiled by a particular source. A vehicle may have
     * multiple stage records.
     */
    fun update(pathId: String, params: StageUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: StageUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<StageListPageAsync> = list(StageListParams.none())

    /** @see list */
    fun list(
        params: StageListParams = StageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StageListPageAsync>

    /** @see list */
    fun list(
        params: StageListParams = StageListParams.none()
    ): CompletableFuture<StageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StageListPageAsync> =
        list(StageListParams.none(), requestOptions)

    /**
     * Service operation to delete a Stage object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance. A Stage represents various stages of a particular launch vehicle, compiled by a
     * particular source. A vehicle may have multiple stage records.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, StageDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StageDeleteParams = StageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: StageDeleteParams = StageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: StageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, StageDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(StageCountParams.none())

    /** @see count */
    fun count(
        params: StageCountParams = StageCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: StageCountParams = StageCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(StageCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Stage record by its unique ID passed as a path parameter. A
     * Stage represents various stages of a particular launch vehicle, compiled by a particular
     * source. A vehicle may have multiple stage records.
     */
    fun get(id: String): CompletableFuture<StageGetResponse> = get(id, StageGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: StageGetParams = StageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StageGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: StageGetParams = StageGetParams.none(),
    ): CompletableFuture<StageGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StageGetResponse>

    /** @see get */
    fun get(params: StageGetParams): CompletableFuture<StageGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<StageGetResponse> =
        get(id, StageGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<StageQueryhelpResponse> =
        queryhelp(StageQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: StageQueryhelpParams = StageQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StageQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: StageQueryhelpParams = StageQueryhelpParams.none()
    ): CompletableFuture<StageQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<StageQueryhelpResponse> =
        queryhelp(StageQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: StageTupleParams): CompletableFuture<List<StageTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: StageTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StageTupleResponse>>

    /** A view of [StageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/stage`, but is otherwise the same as
         * [StageServiceAsync.create].
         */
        fun create(params: StageCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/stage/{id}`, but is otherwise the same as
         * [StageServiceAsync.update].
         */
        fun update(pathId: String, params: StageUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: StageUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/stage`, but is otherwise the same as
         * [StageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StageListPageAsync>> =
            list(StageListParams.none())

        /** @see list */
        fun list(
            params: StageListParams = StageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StageListPageAsync>>

        /** @see list */
        fun list(
            params: StageListParams = StageListParams.none()
        ): CompletableFuture<HttpResponseFor<StageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StageListPageAsync>> =
            list(StageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/stage/{id}`, but is otherwise the same as
         * [StageServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, StageDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: StageDeleteParams = StageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: StageDeleteParams = StageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: StageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, StageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/stage/count`, but is otherwise the same as
         * [StageServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(StageCountParams.none())

        /** @see count */
        fun count(
            params: StageCountParams = StageCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: StageCountParams = StageCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(StageCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/stage/{id}`, but is otherwise the same as
         * [StageServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<StageGetResponse>> =
            get(id, StageGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: StageGetParams = StageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StageGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: StageGetParams = StageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<StageGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: StageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StageGetResponse>>

        /** @see get */
        fun get(params: StageGetParams): CompletableFuture<HttpResponseFor<StageGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StageGetResponse>> =
            get(id, StageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/stage/queryhelp`, but is otherwise the same as
         * [StageServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<StageQueryhelpResponse>> =
            queryhelp(StageQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: StageQueryhelpParams = StageQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StageQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: StageQueryhelpParams = StageQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<StageQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StageQueryhelpResponse>> =
            queryhelp(StageQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/stage/tuple`, but is otherwise the same as
         * [StageServiceAsync.tuple].
         */
        fun tuple(
            params: StageTupleParams
        ): CompletableFuture<HttpResponseFor<List<StageTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: StageTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StageTupleResponse>>>
    }
}
