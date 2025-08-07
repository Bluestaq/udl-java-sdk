// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailCreateParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailDeleteParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailGetParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailGetResponse
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailListPageAsync
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailListParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LaunchVehicleDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleDetailServiceAsync

    /**
     * Service operation to take a single LaunchVehicleDetails as a POST body and ingest into the
     * database. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaunchVehicleDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchVehicleDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single LaunchVehicleDetails. LaunchVehicleDetails represents
     * launch vehicle details and characteristics, compiled by a particular source. A vehicle may
     * have multiple details records from various sources. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchVehicleDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchVehicleDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchVehicleDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchVehicleDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LaunchVehicleDetailListPageAsync> =
        list(LaunchVehicleDetailListParams.none())

    /** @see list */
    fun list(
        params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleDetailListPageAsync>

    /** @see list */
    fun list(
        params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none()
    ): CompletableFuture<LaunchVehicleDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LaunchVehicleDetailListPageAsync> =
        list(LaunchVehicleDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaunchVehicleDetails object specified by the passed ID path
     * parameter. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, LaunchVehicleDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchVehicleDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LaunchVehicleDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LaunchVehicleDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single LaunchVehicleDetails record by its unique ID passed as a
     * path parameter. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources.
     */
    fun get(id: String): CompletableFuture<LaunchVehicleDetailGetResponse> =
        get(id, LaunchVehicleDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleDetailGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
    ): CompletableFuture<LaunchVehicleDetailGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchVehicleDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LaunchVehicleDetailGetResponse>

    /** @see get */
    fun get(
        params: LaunchVehicleDetailGetParams
    ): CompletableFuture<LaunchVehicleDetailGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LaunchVehicleDetailGetResponse> =
        get(id, LaunchVehicleDetailGetParams.none(), requestOptions)

    /**
     * A view of [LaunchVehicleDetailServiceAsync] that provides access to raw HTTP responses for
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
        ): LaunchVehicleDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchvehicledetails`, but is otherwise the
         * same as [LaunchVehicleDetailServiceAsync.create].
         */
        fun create(params: LaunchVehicleDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LaunchVehicleDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: LaunchVehicleDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: LaunchVehicleDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: LaunchVehicleDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LaunchVehicleDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicledetails`, but is otherwise the
         * same as [LaunchVehicleDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LaunchVehicleDetailListPageAsync>> =
            list(LaunchVehicleDetailListParams.none())

        /** @see list */
        fun list(
            params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailListPageAsync>>

        /** @see list */
        fun list(
            params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailListPageAsync>> =
            list(LaunchVehicleDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LaunchVehicleDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LaunchVehicleDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LaunchVehicleDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LaunchVehicleDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>> =
            get(id, LaunchVehicleDetailGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LaunchVehicleDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>>

        /** @see get */
        fun get(
            params: LaunchVehicleDetailGetParams
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LaunchVehicleDetailGetResponse>> =
            get(id, LaunchVehicleDetailGetParams.none(), requestOptions)
    }
}
