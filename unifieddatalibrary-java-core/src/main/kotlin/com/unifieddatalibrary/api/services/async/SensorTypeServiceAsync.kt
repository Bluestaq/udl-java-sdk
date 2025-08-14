// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetResponse
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListPageAsync
import com.unifieddatalibrary.api.models.sensortype.SensorTypeListParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpParams
import com.unifieddatalibrary.api.models.sensortype.SensorTypeQueryhelpResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorTypeServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SensorTypeListPageAsync> = list(SensorTypeListParams.none())

    /** @see list */
    fun list(
        params: SensorTypeListParams = SensorTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorTypeListPageAsync>

    /** @see list */
    fun list(
        params: SensorTypeListParams = SensorTypeListParams.none()
    ): CompletableFuture<SensorTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SensorTypeListPageAsync> =
        list(SensorTypeListParams.none(), requestOptions)

    /**
     * Service operation to get a single Sensortype record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: Int): CompletableFuture<SensorTypeGetResponse> = get(id, SensorTypeGetParams.none())

    /** @see get */
    fun get(
        id: Int,
        params: SensorTypeGetParams = SensorTypeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorTypeGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: Int,
        params: SensorTypeGetParams = SensorTypeGetParams.none(),
    ): CompletableFuture<SensorTypeGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorTypeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorTypeGetResponse>

    /** @see get */
    fun get(params: SensorTypeGetParams): CompletableFuture<SensorTypeGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: Int, requestOptions: RequestOptions): CompletableFuture<SensorTypeGetResponse> =
        get(id, SensorTypeGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SensorTypeQueryhelpResponse> =
        queryhelp(SensorTypeQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorTypeQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none()
    ): CompletableFuture<SensorTypeQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<SensorTypeQueryhelpResponse> =
        queryhelp(SensorTypeQueryhelpParams.none(), requestOptions)

    /**
     * A view of [SensorTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): SensorTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensortype`, but is otherwise the same as
         * [SensorTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SensorTypeListPageAsync>> =
            list(SensorTypeListParams.none())

        /** @see list */
        fun list(
            params: SensorTypeListParams = SensorTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorTypeListPageAsync>>

        /** @see list */
        fun list(
            params: SensorTypeListParams = SensorTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<SensorTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorTypeListPageAsync>> =
            list(SensorTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensortype/{id}`, but is otherwise the same as
         * [SensorTypeServiceAsync.get].
         */
        fun get(id: Int): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> =
            get(id, SensorTypeGetParams.none())

        /** @see get */
        fun get(
            id: Int,
            params: SensorTypeGetParams = SensorTypeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: Int,
            params: SensorTypeGetParams = SensorTypeGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SensorTypeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>>

        /** @see get */
        fun get(
            params: SensorTypeGetParams
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorTypeGetResponse>> =
            get(id, SensorTypeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensortype/queryhelp`, but is otherwise the
         * same as [SensorTypeServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SensorTypeQueryhelpResponse>> =
            queryhelp(SensorTypeQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorTypeQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SensorTypeQueryhelpParams = SensorTypeQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SensorTypeQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorTypeQueryhelpResponse>> =
            queryhelp(SensorTypeQueryhelpParams.none(), requestOptions)
    }
}
