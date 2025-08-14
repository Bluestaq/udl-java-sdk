// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitBatteryFull
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryCreateParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryDeleteParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryGetParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListPageAsync
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitbatteryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitbatteryServiceAsync

    /**
     * Service operation to take a single OnorbitBattery as a POST body and ingest into the
     * database. OnorbitBattery is the association between on-orbit spacecraft batteries and a
     * particular on-orbit spacecraft. A Battery may be associated with many different on-orbit
     * spacecraft. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitbatteryCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitbatteryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single OnorbitBattery. OnorbitBattery is the association
     * between on-orbit spacecraft batteries and a particular on-orbit spacecraft. A Battery may be
     * associated with many different on-orbit spacecraft. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OnorbitbatteryUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OnorbitbatteryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitbatteryUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbitbatteryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OnorbitbatteryListPageAsync> =
        list(OnorbitbatteryListParams.none())

    /** @see list */
    fun list(
        params: OnorbitbatteryListParams = OnorbitbatteryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitbatteryListPageAsync>

    /** @see list */
    fun list(
        params: OnorbitbatteryListParams = OnorbitbatteryListParams.none()
    ): CompletableFuture<OnorbitbatteryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnorbitbatteryListPageAsync> =
        list(OnorbitbatteryListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitBattery object specified by the passed ID path
     * parameter. OnorbitBattery is the association between on-orbit spacecraft batteries and a
     * particular on-orbit spacecraft. A Battery may be associated with many different on-orbit
     * spacecraft. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OnorbitbatteryDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitbatteryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnorbitbatteryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OnorbitbatteryDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single OnorbitBattery record by its unique ID passed as a path
     * parameter. OnorbitBattery is the association between on-orbit spacecraft batteries and a
     * particular on-orbit spacecraft. A Battery may be associated with many different on-orbit
     * spacecraft.
     */
    fun get(id: String): CompletableFuture<OnorbitBatteryFull> =
        get(id, OnorbitbatteryGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitBatteryFull> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(),
    ): CompletableFuture<OnorbitBatteryFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitbatteryGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitBatteryFull>

    /** @see get */
    fun get(params: OnorbitbatteryGetParams): CompletableFuture<OnorbitBatteryFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OnorbitBatteryFull> =
        get(id, OnorbitbatteryGetParams.none(), requestOptions)

    /**
     * A view of [OnorbitbatteryServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnorbitbatteryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitbattery`, but is otherwise the same as
         * [OnorbitbatteryServiceAsync.create].
         */
        fun create(params: OnorbitbatteryCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OnorbitbatteryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/onorbitbattery/{id}`, but is otherwise the same
         * as [OnorbitbatteryServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: OnorbitbatteryUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: OnorbitbatteryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: OnorbitbatteryUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OnorbitbatteryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitbattery`, but is otherwise the same as
         * [OnorbitbatteryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OnorbitbatteryListPageAsync>> =
            list(OnorbitbatteryListParams.none())

        /** @see list */
        fun list(
            params: OnorbitbatteryListParams = OnorbitbatteryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitbatteryListPageAsync>>

        /** @see list */
        fun list(
            params: OnorbitbatteryListParams = OnorbitbatteryListParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbitbatteryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbitbatteryListPageAsync>> =
            list(OnorbitbatteryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitbattery/{id}`, but is otherwise the
         * same as [OnorbitbatteryServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OnorbitbatteryDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OnorbitbatteryDeleteParams = OnorbitbatteryDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OnorbitbatteryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnorbitbatteryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OnorbitbatteryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitbattery/{id}`, but is otherwise the same
         * as [OnorbitbatteryServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>> =
            get(id, OnorbitbatteryGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OnorbitbatteryGetParams = OnorbitbatteryGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OnorbitbatteryGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>>

        /** @see get */
        fun get(
            params: OnorbitbatteryGetParams
        ): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OnorbitBatteryFull>> =
            get(id, OnorbitbatteryGetParams.none(), requestOptions)
    }
}
