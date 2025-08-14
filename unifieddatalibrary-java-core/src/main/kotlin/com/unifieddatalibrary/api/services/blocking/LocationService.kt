// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.LocationFull
import com.unifieddatalibrary.api.models.location.LocationCountParams
import com.unifieddatalibrary.api.models.location.LocationCreateParams
import com.unifieddatalibrary.api.models.location.LocationDeleteParams
import com.unifieddatalibrary.api.models.location.LocationGetParams
import com.unifieddatalibrary.api.models.location.LocationListPage
import com.unifieddatalibrary.api.models.location.LocationListParams
import com.unifieddatalibrary.api.models.location.LocationQueryhelpParams
import com.unifieddatalibrary.api.models.location.LocationQueryhelpResponse
import com.unifieddatalibrary.api.models.location.LocationTupleParams
import com.unifieddatalibrary.api.models.location.LocationUpdateParams
import java.util.function.Consumer

interface LocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService

    /**
     * Service operation to take a single location as a POST body and ingest into the database.
     * Locations are specific fixed points on the earth and are used to denote the locations of
     * fixed sensors, operating units, etc. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun create(params: LocationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: LocationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single location. Locations are specific fixed points on the
     * earth and are used to denote the locations of fixed sensors, operating units, etc. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun update(id: String, params: LocationUpdateParams) = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LocationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LocationUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: LocationUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LocationListPage = list(LocationListParams.none())

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationListPage

    /** @see list */
    fun list(params: LocationListParams = LocationListParams.none()): LocationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LocationListPage =
        list(LocationListParams.none(), requestOptions)

    /**
     * Service operation to delete a location object specified by the passed ID path parameter.
     * Locations are specific fixed points on the earth and are used to denote the locations of
     * fixed sensors, operating units, etc. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, LocationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LocationDeleteParams = LocationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: LocationDeleteParams = LocationDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: LocationDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: LocationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LocationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(LocationCountParams.none())

    /** @see count */
    fun count(
        params: LocationCountParams = LocationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: LocationCountParams = LocationCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(LocationCountParams.none(), requestOptions)

    /**
     * Service operation to get a single location record by its unique ID passed as a path
     * parameter. Locations are specific fixed points on the earth and are used to denote the
     * locations of fixed sensors, operating units, etc.
     */
    fun get(id: String): LocationFull = get(id, LocationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LocationGetParams = LocationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: LocationGetParams = LocationGetParams.none()): LocationFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LocationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationFull

    /** @see get */
    fun get(params: LocationGetParams): LocationFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LocationFull =
        get(id, LocationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LocationQueryhelpResponse = queryhelp(LocationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LocationQueryhelpParams = LocationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LocationQueryhelpParams = LocationQueryhelpParams.none()
    ): LocationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LocationQueryhelpResponse =
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
    fun tuple(params: LocationTupleParams): List<LocationFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LocationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LocationFull>

    /** A view of [LocationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/location`, but is otherwise the same as
         * [LocationService.create].
         */
        @MustBeClosed
        fun create(params: LocationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LocationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/location/{id}`, but is otherwise the same as
         * [LocationService.update].
         */
        @MustBeClosed
        fun update(id: String, params: LocationUpdateParams): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LocationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LocationUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LocationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/location`, but is otherwise the same as
         * [LocationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LocationListPage> = list(LocationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocationListParams = LocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocationListParams = LocationListParams.none()
        ): HttpResponseFor<LocationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LocationListPage> =
            list(LocationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/location/{id}`, but is otherwise the same as
         * [LocationService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, LocationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LocationDeleteParams = LocationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LocationDeleteParams = LocationDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LocationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LocationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LocationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/count`, but is otherwise the same as
         * [LocationService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(LocationCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LocationCountParams = LocationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: LocationCountParams = LocationCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(LocationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/{id}`, but is otherwise the same as
         * [LocationService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LocationFull> = get(id, LocationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LocationGetParams = LocationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LocationGetParams = LocationGetParams.none(),
        ): HttpResponseFor<LocationFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LocationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationFull>

        /** @see get */
        @MustBeClosed
        fun get(params: LocationGetParams): HttpResponseFor<LocationFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<LocationFull> =
            get(id, LocationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/queryhelp`, but is otherwise the same
         * as [LocationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LocationQueryhelpResponse> =
            queryhelp(LocationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LocationQueryhelpParams = LocationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LocationQueryhelpParams = LocationQueryhelpParams.none()
        ): HttpResponseFor<LocationQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<LocationQueryhelpResponse> =
            queryhelp(LocationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/location/tuple`, but is otherwise the same as
         * [LocationService.tuple].
         */
        @MustBeClosed
        fun tuple(params: LocationTupleParams): HttpResponseFor<List<LocationFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LocationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LocationFull>>
    }
}
