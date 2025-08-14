// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCountParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCreateParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionDeleteParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListPageAsync
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionListParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionQueryhelpResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleResponse
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchDetectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchDetectionServiceAsync

    /**
     * Service operation to take a single launch detection as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaunchDetectionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchDetectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single launch detection. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchDetectionUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchDetectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchDetectionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchDetectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaunchDetectionListPageAsync> =
        list(LaunchDetectionListParams.none())

    /** @see list */
    fun list(
        params: LaunchDetectionListParams = LaunchDetectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchDetectionListPageAsync>

    /** @see list */
    fun list(
        params: LaunchDetectionListParams = LaunchDetectionListParams.none()
    ): CompletableFuture<LaunchDetectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaunchDetectionListPageAsync> =
        list(LaunchDetectionListParams.none(), requestOptions)

    /**
     * Service operation to delete a launch detection object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, LaunchDetectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchDetectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaunchDetectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaunchDetectionDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(LaunchDetectionCountParams.none())

    /** @see count */
    fun count(
        params: LaunchDetectionCountParams = LaunchDetectionCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: LaunchDetectionCountParams = LaunchDetectionCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(LaunchDetectionCountParams.none(), requestOptions)

    /**
     * Service operation to get a single launch detection record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<LaunchDetectionGetResponse> =
        get(id, LaunchDetectionGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchDetectionGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
    ): CompletableFuture<LaunchDetectionGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchDetectionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchDetectionGetResponse>

    /** @see get */
    fun get(params: LaunchDetectionGetParams): CompletableFuture<LaunchDetectionGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchDetectionGetResponse> =
        get(id, LaunchDetectionGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaunchDetectionQueryhelpResponse> =
        queryhelp(LaunchDetectionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchDetectionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none()
    ): CompletableFuture<LaunchDetectionQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<LaunchDetectionQueryhelpResponse> =
        queryhelp(LaunchDetectionQueryhelpParams.none(), requestOptions)

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
        params: LaunchDetectionTupleParams
    ): CompletableFuture<List<LaunchDetectionTupleResponse>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchDetectionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaunchDetectionTupleResponse>>

    /**
     * A view of [LaunchDetectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaunchDetectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchdetection`, but is otherwise the same as
         * [LaunchDetectionServiceAsync.create].
         */
        fun create(params: LaunchDetectionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchDetectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaunchDetectionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaunchDetectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaunchDetectionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaunchDetectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection`, but is otherwise the same as
         * [LaunchDetectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaunchDetectionListPageAsync>> =
            list(LaunchDetectionListParams.none())

        /** @see list */
        fun list(
            params: LaunchDetectionListParams = LaunchDetectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchDetectionListPageAsync>>

        /** @see list */
        fun list(
            params: LaunchDetectionListParams = LaunchDetectionListParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchDetectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchDetectionListPageAsync>> =
            list(LaunchDetectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaunchDetectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchDetectionDeleteParams = LaunchDetectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaunchDetectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaunchDetectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaunchDetectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/count`, but is otherwise the
         * same as [LaunchDetectionServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchDetectionCountParams.none())

        /** @see count */
        fun count(
            params: LaunchDetectionCountParams = LaunchDetectionCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: LaunchDetectionCountParams = LaunchDetectionCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchDetectionCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/{id}`, but is otherwise the
         * same as [LaunchDetectionServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>> =
            get(id, LaunchDetectionGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchDetectionGetParams = LaunchDetectionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchDetectionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>>

        /** @see get */
        fun get(
            params: LaunchDetectionGetParams
        ): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchDetectionGetResponse>> =
            get(id, LaunchDetectionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/queryhelp`, but is otherwise
         * the same as [LaunchDetectionServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LaunchDetectionQueryhelpResponse>> =
            queryhelp(LaunchDetectionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchDetectionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchDetectionQueryhelpParams = LaunchDetectionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchDetectionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchDetectionQueryhelpResponse>> =
            queryhelp(LaunchDetectionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchdetection/tuple`, but is otherwise the
         * same as [LaunchDetectionServiceAsync.tuple].
         */
        fun tuple(
            params: LaunchDetectionTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaunchDetectionTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaunchDetectionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaunchDetectionTupleResponse>>>
    }
}
