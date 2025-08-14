// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteDeleteParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListPageAsync
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchSiteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteServiceAsync

    /**
     * Service operation to take a single launch site as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: LaunchSiteCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchSiteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a launch. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchSiteUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchSiteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchSiteUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchSiteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaunchSiteListPageAsync> = list(LaunchSiteListParams.none())

    /** @see list */
    fun list(
        params: LaunchSiteListParams = LaunchSiteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteListPageAsync>

    /** @see list */
    fun list(
        params: LaunchSiteListParams = LaunchSiteListParams.none()
    ): CompletableFuture<LaunchSiteListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaunchSiteListPageAsync> =
        list(LaunchSiteListParams.none(), requestOptions)

    /**
     * Service operation to delete a launch site specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, LaunchSiteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchSiteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaunchSiteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaunchSiteDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(LaunchSiteCountParams.none())

    /** @see count */
    fun count(
        params: LaunchSiteCountParams = LaunchSiteCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: LaunchSiteCountParams = LaunchSiteCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(LaunchSiteCountParams.none(), requestOptions)

    /**
     * Service operation to get a single launch site by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<LaunchSiteGetResponse> =
        get(id, LaunchSiteGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
    ): CompletableFuture<LaunchSiteGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchSiteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteGetResponse>

    /** @see get */
    fun get(params: LaunchSiteGetParams): CompletableFuture<LaunchSiteGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<LaunchSiteGetResponse> =
        get(id, LaunchSiteGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LaunchSiteQueryhelpResponse> =
        queryhelp(LaunchSiteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchSiteQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none()
    ): CompletableFuture<LaunchSiteQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<LaunchSiteQueryhelpResponse> =
        queryhelp(LaunchSiteQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaunchSiteTupleParams): CompletableFuture<List<LaunchSiteTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchSiteTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LaunchSiteTupleResponse>>

    /**
     * A view of [LaunchSiteServiceAsync] that provides access to raw HTTP responses for each
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
        ): LaunchSiteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchsite`, but is otherwise the same as
         * [LaunchSiteServiceAsync.create].
         */
        fun create(params: LaunchSiteCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchSiteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/launchsite/{id}`, but is otherwise the same as
         * [LaunchSiteServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaunchSiteUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaunchSiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaunchSiteUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaunchSiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchsite`, but is otherwise the same as
         * [LaunchSiteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaunchSiteListPageAsync>> =
            list(LaunchSiteListParams.none())

        /** @see list */
        fun list(
            params: LaunchSiteListParams = LaunchSiteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteListPageAsync>>

        /** @see list */
        fun list(
            params: LaunchSiteListParams = LaunchSiteListParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchSiteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchSiteListPageAsync>> =
            list(LaunchSiteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchsite/{id}`, but is otherwise the same
         * as [LaunchSiteServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaunchSiteDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaunchSiteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaunchSiteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaunchSiteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/count`, but is otherwise the same as
         * [LaunchSiteServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchSiteCountParams.none())

        /** @see count */
        fun count(
            params: LaunchSiteCountParams = LaunchSiteCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: LaunchSiteCountParams = LaunchSiteCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(LaunchSiteCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/{id}`, but is otherwise the same as
         * [LaunchSiteServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> =
            get(id, LaunchSiteGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchSiteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>>

        /** @see get */
        fun get(
            params: LaunchSiteGetParams
        ): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchSiteGetResponse>> =
            get(id, LaunchSiteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/queryhelp`, but is otherwise the
         * same as [LaunchSiteServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LaunchSiteQueryhelpResponse>> =
            queryhelp(LaunchSiteQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchSiteQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchSiteQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchSiteQueryhelpResponse>> =
            queryhelp(LaunchSiteQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/tuple`, but is otherwise the same as
         * [LaunchSiteServiceAsync.tuple].
         */
        fun tuple(
            params: LaunchSiteTupleParams
        ): CompletableFuture<HttpResponseFor<List<LaunchSiteTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LaunchSiteTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LaunchSiteTupleResponse>>>
    }
}
