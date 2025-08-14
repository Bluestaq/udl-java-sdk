// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCountParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCreateParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleDeleteParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListPageAsync
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleListParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleQueryhelpResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleResponse
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchVehicleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleServiceAsync

    /**
     * Service operation to take a single LaunchVehicle as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: LaunchVehicleCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchVehicleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single LaunchVehicle. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchVehicleUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchVehicleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchVehicleUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchVehicleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaunchVehicleListPageAsync> = list(LaunchVehicleListParams.none())

    /** @see list */
    fun list(
        params: LaunchVehicleListParams = LaunchVehicleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleListPageAsync>

    /** @see list */
    fun list(
        params: LaunchVehicleListParams = LaunchVehicleListParams.none()
    ): CompletableFuture<LaunchVehicleListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaunchVehicleListPageAsync> =
        list(LaunchVehicleListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaunchVehicle object specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, LaunchVehicleDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchVehicleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaunchVehicleDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaunchVehicleDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(LaunchVehicleCountParams.none())

    /** @see count */
    fun count(
        params: LaunchVehicleCountParams = LaunchVehicleCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: LaunchVehicleCountParams = LaunchVehicleCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(LaunchVehicleCountParams.none(), requestOptions)

    /**
     * Service operation to get a single LaunchVehicle record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<LaunchVehicleGetResponse> =
        get(id, LaunchVehicleGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(),
    ): CompletableFuture<LaunchVehicleGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchVehicleGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleGetResponse>

    /** @see get */
    fun get(params: LaunchVehicleGetParams): CompletableFuture<LaunchVehicleGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchVehicleGetResponse> =
        get(id, LaunchVehicleGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaunchVehicleQueryhelpResponse> =
        queryhelp(LaunchVehicleQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none()
    ): CompletableFuture<LaunchVehicleQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<LaunchVehicleQueryhelpResponse> =
        queryhelp(LaunchVehicleQueryhelpParams.none(), requestOptions)

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
        params: LaunchVehicleTupleParams
    ): CompletableFuture<List<LaunchVehicleTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchVehicleTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaunchVehicleTupleResponse>>

    /**
     * A view of [LaunchVehicleServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaunchVehicleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchvehicle`, but is otherwise the same as
         * [LaunchVehicleServiceAsync.create].
         */
        fun create(params: LaunchVehicleCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchVehicleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/launchvehicle/{id}`, but is otherwise the same
         * as [LaunchVehicleServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaunchVehicleUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaunchVehicleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaunchVehicleUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaunchVehicleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicle`, but is otherwise the same as
         * [LaunchVehicleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaunchVehicleListPageAsync>> =
            list(LaunchVehicleListParams.none())

        /** @see list */
        fun list(
            params: LaunchVehicleListParams = LaunchVehicleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleListPageAsync>>

        /** @see list */
        fun list(
            params: LaunchVehicleListParams = LaunchVehicleListParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchVehicleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchVehicleListPageAsync>> =
            list(LaunchVehicleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchvehicle/{id}`, but is otherwise the
         * same as [LaunchVehicleServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaunchVehicleDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchVehicleDeleteParams = LaunchVehicleDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaunchVehicleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaunchVehicleDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaunchVehicleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicle/count`, but is otherwise the same
         * as [LaunchVehicleServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchVehicleCountParams.none())

        /** @see count */
        fun count(
            params: LaunchVehicleCountParams = LaunchVehicleCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: LaunchVehicleCountParams = LaunchVehicleCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchVehicleCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicle/{id}`, but is otherwise the same
         * as [LaunchVehicleServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> =
            get(id, LaunchVehicleGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchVehicleGetParams = LaunchVehicleGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchVehicleGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>>

        /** @see get */
        fun get(
            params: LaunchVehicleGetParams
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchVehicleGetResponse>> =
            get(id, LaunchVehicleGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicle/queryhelp`, but is otherwise the
         * same as [LaunchVehicleServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LaunchVehicleQueryhelpResponse>> =
            queryhelp(LaunchVehicleQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchVehicleQueryhelpParams = LaunchVehicleQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchVehicleQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchVehicleQueryhelpResponse>> =
            queryhelp(LaunchVehicleQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicle/tuple`, but is otherwise the same
         * as [LaunchVehicleServiceAsync.tuple].
         */
        fun tuple(
            params: LaunchVehicleTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaunchVehicleTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaunchVehicleTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaunchVehicleTupleResponse>>>
    }
}
