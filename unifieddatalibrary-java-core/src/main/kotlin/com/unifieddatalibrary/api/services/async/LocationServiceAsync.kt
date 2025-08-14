// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.LocationFull
import com.unifieddatalibrary.api.models.location.LocationCountParams
import com.unifieddatalibrary.api.models.location.LocationCreateParams
import com.unifieddatalibrary.api.models.location.LocationDeleteParams
import com.unifieddatalibrary.api.models.location.LocationGetParams
import com.unifieddatalibrary.api.models.location.LocationListPageAsync
import com.unifieddatalibrary.api.models.location.LocationListParams
import com.unifieddatalibrary.api.models.location.LocationQueryhelpParams
import com.unifieddatalibrary.api.models.location.LocationQueryhelpResponse
import com.unifieddatalibrary.api.models.location.LocationTupleParams
import com.unifieddatalibrary.api.models.location.LocationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationServiceAsync

    /**
     * Service operation to take a single location as a POST body and ingest into the database.
     * Locations are specific fixed points on the earth and are used to denote the locations of
     * fixed sensors, operating units, etc. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun create(params: LocationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LocationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single location. Locations are specific fixed points on the
     * earth and are used to denote the locations of fixed sensors, operating units, etc. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun update(id: String, params: LocationUpdateParams): CompletableFuture<Void?> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LocationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LocationUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LocationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<LocationListPageAsync> = list(LocationListParams.none())

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationListPageAsync>

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none()
    ): CompletableFuture<LocationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LocationListPageAsync> =
        list(LocationListParams.none(), requestOptions)

    /**
     * Service operation to delete a location object specified by the passed ID path parameter.
     * Locations are specific fixed points on the earth and are used to denote the locations of
     * fixed sensors, operating units, etc. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, LocationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LocationDeleteParams = LocationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LocationDeleteParams = LocationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LocationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LocationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LocationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(LocationCountParams.none())

    /** @see count */
    fun count(
        params: LocationCountParams = LocationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: LocationCountParams = LocationCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(LocationCountParams.none(), requestOptions)

    /**
     * Service operation to get a single location record by its unique ID passed as a path
     * parameter. Locations are specific fixed points on the earth and are used to denote the
     * locations of fixed sensors, operating units, etc.
     */
    fun get(id: String): CompletableFuture<LocationFull> = get(id, LocationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LocationGetParams = LocationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LocationGetParams = LocationGetParams.none(),
    ): CompletableFuture<LocationFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LocationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationFull>

    /** @see get */
    fun get(params: LocationGetParams): CompletableFuture<LocationFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<LocationFull> =
        get(id, LocationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<LocationQueryhelpResponse> =
        queryhelp(LocationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LocationQueryhelpParams = LocationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: LocationQueryhelpParams = LocationQueryhelpParams.none()
    ): CompletableFuture<LocationQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<LocationQueryhelpResponse> =
        queryhelp(LocationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LocationTupleParams): CompletableFuture<List<LocationFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LocationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LocationFull>>

    /**
     * A view of [LocationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/location`, but is otherwise the same as
         * [LocationServiceAsync.create].
         */
        fun create(params: LocationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LocationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/location/{id}`, but is otherwise the same as
         * [LocationServiceAsync.update].
         */
        fun update(id: String, params: LocationUpdateParams): CompletableFuture<HttpResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LocationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: LocationUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LocationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/location`, but is otherwise the same as
         * [LocationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LocationListPageAsync>> =
            list(LocationListParams.none())

        /** @see list */
        fun list(
            params: LocationListParams = LocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationListPageAsync>>

        /** @see list */
        fun list(
            params: LocationListParams = LocationListParams.none()
        ): CompletableFuture<HttpResponseFor<LocationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LocationListPageAsync>> =
            list(LocationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/location/{id}`, but is otherwise the same as
         * [LocationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LocationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LocationDeleteParams = LocationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LocationDeleteParams = LocationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LocationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LocationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LocationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/count`, but is otherwise the same as
         * [LocationServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(LocationCountParams.none())

        /** @see count */
        fun count(
            params: LocationCountParams = LocationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: LocationCountParams = LocationCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(LocationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/{id}`, but is otherwise the same as
         * [LocationServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<LocationFull>> =
            get(id, LocationGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: LocationGetParams = LocationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: LocationGetParams = LocationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<LocationFull>> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LocationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationFull>>

        /** @see get */
        fun get(params: LocationGetParams): CompletableFuture<HttpResponseFor<LocationFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocationFull>> =
            get(id, LocationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/queryhelp`, but is otherwise the same
         * as [LocationServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<LocationQueryhelpResponse>> =
            queryhelp(LocationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: LocationQueryhelpParams = LocationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: LocationQueryhelpParams = LocationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<LocationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LocationQueryhelpResponse>> =
            queryhelp(LocationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/tuple`, but is otherwise the same as
         * [LocationServiceAsync.tuple].
         */
        fun tuple(
            params: LocationTupleParams
        ): CompletableFuture<HttpResponseFor<List<LocationFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: LocationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LocationFull>>>
    }
}
