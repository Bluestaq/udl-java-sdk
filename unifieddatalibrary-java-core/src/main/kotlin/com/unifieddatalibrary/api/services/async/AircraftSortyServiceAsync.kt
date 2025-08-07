// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AircraftsortieFull
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyQueryhelpParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyQueryhelpResponse
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyRetrieveParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyTupleParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AircraftSortyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AircraftSortyServiceAsync

    /**
     * Service operation to get a single AircraftSortie record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<AircraftsortieFull> =
        retrieve(id, AircraftSortyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AircraftSortyRetrieveParams = AircraftSortyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftsortieFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AircraftSortyRetrieveParams = AircraftSortyRetrieveParams.none(),
    ): CompletableFuture<AircraftsortieFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AircraftSortyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftsortieFull>

    /** @see retrieve */
    fun retrieve(params: AircraftSortyRetrieveParams): CompletableFuture<AircraftsortieFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AircraftsortieFull> =
        retrieve(id, AircraftSortyRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single AircraftSortie. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AircraftSortyUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AircraftSortyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AircraftSortyUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AircraftSortyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<AircraftSortyQueryhelpResponse> =
        queryhelp(AircraftSortyQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AircraftSortyQueryhelpParams = AircraftSortyQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AircraftSortyQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: AircraftSortyQueryhelpParams = AircraftSortyQueryhelpParams.none()
    ): CompletableFuture<AircraftSortyQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AircraftSortyQueryhelpResponse> =
        queryhelp(AircraftSortyQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AircraftSortyTupleParams): CompletableFuture<List<AircraftsortieFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AircraftSortyTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AircraftsortieFull>>

    /**
     * A view of [AircraftSortyServiceAsync] that provides access to raw HTTP responses for each
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
        ): AircraftSortyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/{id}`, but is otherwise the same
         * as [AircraftSortyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AircraftsortieFull>> =
            retrieve(id, AircraftSortyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AircraftSortyRetrieveParams = AircraftSortyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftsortieFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AircraftSortyRetrieveParams = AircraftSortyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AircraftsortieFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AircraftSortyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftsortieFull>>

        /** @see retrieve */
        fun retrieve(
            params: AircraftSortyRetrieveParams
        ): CompletableFuture<HttpResponseFor<AircraftsortieFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AircraftsortieFull>> =
            retrieve(id, AircraftSortyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/aircraftsortie/{id}`, but is otherwise the same
         * as [AircraftSortyServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: AircraftSortyUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AircraftSortyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AircraftSortyUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AircraftSortyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/queryhelp`, but is otherwise the
         * same as [AircraftSortyServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AircraftSortyQueryhelpResponse>> =
            queryhelp(AircraftSortyQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: AircraftSortyQueryhelpParams = AircraftSortyQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AircraftSortyQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: AircraftSortyQueryhelpParams = AircraftSortyQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<AircraftSortyQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AircraftSortyQueryhelpResponse>> =
            queryhelp(AircraftSortyQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/aircraftsortie/tuple`, but is otherwise the
         * same as [AircraftSortyServiceAsync.tuple].
         */
        fun tuple(
            params: AircraftSortyTupleParams
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AircraftSortyTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AircraftsortieFull>>>
    }
}
