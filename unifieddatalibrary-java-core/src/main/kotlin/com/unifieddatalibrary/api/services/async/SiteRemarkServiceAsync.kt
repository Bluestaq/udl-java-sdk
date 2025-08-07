// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListPageAsync
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkListParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkQueryhelpResponse
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiteRemarkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteRemarkServiceAsync

    /**
     * Service operation to take a single remark record as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: SiteRemarkCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiteRemarkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SiteRemarkListPageAsync> = list(SiteRemarkListParams.none())

    /** @see list */
    fun list(
        params: SiteRemarkListParams = SiteRemarkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteRemarkListPageAsync>

    /** @see list */
    fun list(
        params: SiteRemarkListParams = SiteRemarkListParams.none()
    ): CompletableFuture<SiteRemarkListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SiteRemarkListPageAsync> =
        list(SiteRemarkListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(SiteRemarkCountParams.none())

    /** @see count */
    fun count(
        params: SiteRemarkCountParams = SiteRemarkCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: SiteRemarkCountParams = SiteRemarkCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(SiteRemarkCountParams.none(), requestOptions)

    /**
     * Service operation to get a single remark record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<SiteRemarkGetResponse> =
        get(id, SiteRemarkGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteRemarkGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
    ): CompletableFuture<SiteRemarkGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SiteRemarkGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteRemarkGetResponse>

    /** @see get */
    fun get(params: SiteRemarkGetParams): CompletableFuture<SiteRemarkGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SiteRemarkGetResponse> =
        get(id, SiteRemarkGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SiteRemarkQueryhelpResponse> =
        queryhelp(SiteRemarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteRemarkQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none()
    ): CompletableFuture<SiteRemarkQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SiteRemarkQueryhelpResponse> =
        queryhelp(SiteRemarkQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SiteRemarkTupleParams): CompletableFuture<List<SiteRemarkTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SiteRemarkTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SiteRemarkTupleResponse>>

    /**
     * A view of [SiteRemarkServiceAsync] that provides access to raw HTTP responses for each
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
        ): SiteRemarkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/siteremark`, but is otherwise the same as
         * [SiteRemarkServiceAsync.create].
         */
        fun create(params: SiteRemarkCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SiteRemarkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/siteremark`, but is otherwise the same as
         * [SiteRemarkServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SiteRemarkListPageAsync>> =
            list(SiteRemarkListParams.none())

        /** @see list */
        fun list(
            params: SiteRemarkListParams = SiteRemarkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteRemarkListPageAsync>>

        /** @see list */
        fun list(
            params: SiteRemarkListParams = SiteRemarkListParams.none()
        ): CompletableFuture<HttpResponseFor<SiteRemarkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SiteRemarkListPageAsync>> =
            list(SiteRemarkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/count`, but is otherwise the same as
         * [SiteRemarkServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(SiteRemarkCountParams.none())

        /** @see count */
        fun count(
            params: SiteRemarkCountParams = SiteRemarkCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: SiteRemarkCountParams = SiteRemarkCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(SiteRemarkCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/{id}`, but is otherwise the same as
         * [SiteRemarkServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> =
            get(id, SiteRemarkGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SiteRemarkGetParams = SiteRemarkGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SiteRemarkGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>>

        /** @see get */
        fun get(
            params: SiteRemarkGetParams
        ): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiteRemarkGetResponse>> =
            get(id, SiteRemarkGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/queryhelp`, but is otherwise the
         * same as [SiteRemarkServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SiteRemarkQueryhelpResponse>> =
            queryhelp(SiteRemarkQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteRemarkQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SiteRemarkQueryhelpParams = SiteRemarkQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SiteRemarkQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SiteRemarkQueryhelpResponse>> =
            queryhelp(SiteRemarkQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/siteremark/tuple`, but is otherwise the same as
         * [SiteRemarkServiceAsync.tuple].
         */
        fun tuple(
            params: SiteRemarkTupleParams
        ): CompletableFuture<HttpResponseFor<List<SiteRemarkTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SiteRemarkTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SiteRemarkTupleResponse>>>
    }
}
