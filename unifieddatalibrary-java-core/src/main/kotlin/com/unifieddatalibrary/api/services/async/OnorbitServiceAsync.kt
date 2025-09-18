// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitFull
import com.unifieddatalibrary.api.models.onorbit.OnorbitCountParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitCreateParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitDeleteParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitIngest
import com.unifieddatalibrary.api.models.onorbit.OnorbitListPageAsync
import com.unifieddatalibrary.api.models.onorbit.OnorbitListParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbit.OnorbitTupleParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitUpdateParams
import com.unifieddatalibrary.api.services.async.onorbit.AntennaDetailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitServiceAsync

    fun antennaDetails(): AntennaDetailServiceAsync

    /**
     * Service operation to take a single onorbit object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        onorbitIngest: OnorbitIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(OnorbitCreateParams.builder().onorbitIngest(onorbitIngest).build(), requestOptions)

    /** @see create */
    fun create(onorbitIngest: OnorbitIngest): CompletableFuture<Void?> =
        create(onorbitIngest, RequestOptions.none())

    /**
     * Service operation to update a single OnOrbit object. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(id: String, params: OnorbitUpdateParams): CompletableFuture<Void?> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OnorbitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OnorbitListPageAsync> = list(OnorbitListParams.none())

    /** @see list */
    fun list(
        params: OnorbitListParams = OnorbitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitListPageAsync>

    /** @see list */
    fun list(
        params: OnorbitListParams = OnorbitListParams.none()
    ): CompletableFuture<OnorbitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitListPageAsync> =
        list(OnorbitListParams.none(), requestOptions)

    /**
     * Service operation to delete an OnOrbit object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OnorbitDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OnorbitDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(OnorbitCountParams.none())

    /** @see count */
    fun count(
        params: OnorbitCountParams = OnorbitCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: OnorbitCountParams = OnorbitCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(OnorbitCountParams.none(), requestOptions)

    /**
     * Service operation to get a single OnOrbit object by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<OnorbitFull> = get(id, OnorbitGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitGetParams = OnorbitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitGetParams = OnorbitGetParams.none(),
    ): CompletableFuture<OnorbitFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitFull>

    /** @see get */
    fun get(params: OnorbitGetParams): CompletableFuture<OnorbitFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitFull> =
        get(id, OnorbitGetParams.none(), requestOptions)

    /** This service queries common information across Radar, EO, and RF observations. */
    fun getSignature(
        params: OnorbitGetSignatureParams
    ): CompletableFuture<OnorbitGetSignatureResponse> = getSignature(params, RequestOptions.none())

    /** @see getSignature */
    fun getSignature(
        params: OnorbitGetSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitGetSignatureResponse>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OnorbitQueryhelpResponse> =
        queryhelp(OnorbitQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none()
    ): CompletableFuture<OnorbitQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<OnorbitQueryhelpResponse> =
        queryhelp(OnorbitQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbitTupleParams): CompletableFuture<List<OnorbitFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OnorbitFull>>

    /**
     * A view of [OnorbitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbitServiceAsync.WithRawResponse

        fun antennaDetails(): AntennaDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbit`, but is otherwise the same as
         * [OnorbitServiceAsync.create].
         */
        fun create(params: OnorbitCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OnorbitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            onorbitIngest: OnorbitIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                OnorbitCreateParams.builder().onorbitIngest(onorbitIngest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(onorbitIngest: OnorbitIngest): CompletableFuture<HttpResponse> =
            create(onorbitIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitServiceAsync.update].
         */
        fun update(id: String, params: OnorbitUpdateParams): CompletableFuture<HttpResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: OnorbitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: OnorbitUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OnorbitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbit`, but is otherwise the same as
         * [OnorbitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitListPageAsync>> =
            list(OnorbitListParams.none())

        /** @see list */
        fun list(
            params: OnorbitListParams = OnorbitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitListPageAsync>>

        /** @see list */
        fun list(
            params: OnorbitListParams = OnorbitListParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbitListPageAsync>> =
            list(OnorbitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OnorbitDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbitDeleteParams = OnorbitDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OnorbitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OnorbitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/count`, but is otherwise the same as
         * [OnorbitServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(OnorbitCountParams.none())

        /** @see count */
        fun count(
            params: OnorbitCountParams = OnorbitCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: OnorbitCountParams = OnorbitCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(OnorbitCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/{id}`, but is otherwise the same as
         * [OnorbitServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitFull>> =
            get(id, OnorbitGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OnorbitGetParams = OnorbitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OnorbitGetParams = OnorbitGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitFull>> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OnorbitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitFull>>

        /** @see get */
        fun get(params: OnorbitGetParams): CompletableFuture<HttpResponseFor<OnorbitFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OnorbitFull>> =
            get(id, OnorbitGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/getSignature`, but is otherwise the
         * same as [OnorbitServiceAsync.getSignature].
         */
        fun getSignature(
            params: OnorbitGetSignatureParams
        ): CompletableFuture<HttpResponseFor<OnorbitGetSignatureResponse>> =
            getSignature(params, RequestOptions.none())

        /** @see getSignature */
        fun getSignature(
            params: OnorbitGetSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitGetSignatureResponse>>

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/queryhelp`, but is otherwise the same
         * as [OnorbitServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnorbitQueryhelpResponse>> =
            queryhelp(OnorbitQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbitQueryhelpParams = OnorbitQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbitQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbitQueryhelpResponse>> =
            queryhelp(OnorbitQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbit/tuple`, but is otherwise the same as
         * [OnorbitServiceAsync.tuple].
         */
        fun tuple(
            params: OnorbitTupleParams
        ): CompletableFuture<HttpResponseFor<List<OnorbitFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OnorbitTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OnorbitFull>>>
    }
}
