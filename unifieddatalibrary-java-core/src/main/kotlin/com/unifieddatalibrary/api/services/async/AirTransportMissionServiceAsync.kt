// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirTransportMissionFull
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCountParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCreateParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListPageAsync
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionQueryhelpResponse
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionRetrieveParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionTupleParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionUpdateParams
import com.unifieddatalibrary.api.services.async.airtransportmissions.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirTransportMissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTransportMissionServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single AirTransportMission object as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: AirTransportMissionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AirTransportMissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single Air Transport Mission record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): CompletableFuture<AirTransportMissionFull> =
        retrieve(id, AirTransportMissionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTransportMissionFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(),
    ): CompletableFuture<AirTransportMissionFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AirTransportMissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTransportMissionFull>

    /** @see retrieve */
    fun retrieve(
        params: AirTransportMissionRetrieveParams
    ): CompletableFuture<AirTransportMissionFull> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirTransportMissionFull> =
        retrieve(id, AirTransportMissionRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single AirTransportMission record. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AirTransportMissionUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AirTransportMissionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AirTransportMissionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AirTransportMissionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: AirTransportMissionListParams
    ): CompletableFuture<AirTransportMissionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AirTransportMissionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTransportMissionListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AirTransportMissionCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AirTransportMissionCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<AirTransportMissionQueryhelpResponse> =
        queryhelp(AirTransportMissionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirTransportMissionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none()
    ): CompletableFuture<AirTransportMissionQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AirTransportMissionQueryhelpResponse> =
        queryhelp(AirTransportMissionQueryhelpParams.none(), requestOptions)

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
        params: AirTransportMissionTupleParams
    ): CompletableFuture<List<AirTransportMissionFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AirTransportMissionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AirTransportMissionFull>>

    /**
     * A view of [AirTransportMissionServiceAsync] that provides access to raw HTTP responses for
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
        ): AirTransportMissionServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/airtransportmission`, but is otherwise the
         * same as [AirTransportMissionServiceAsync.create].
         */
        fun create(params: AirTransportMissionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AirTransportMissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airtransportmission/{id}`, but is otherwise the
         * same as [AirTransportMissionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> =
            retrieve(id, AirTransportMissionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirTransportMissionRetrieveParams = AirTransportMissionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AirTransportMissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTransportMissionFull>>

        /** @see retrieve */
        fun retrieve(
            params: AirTransportMissionRetrieveParams
        ): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirTransportMissionFull>> =
            retrieve(id, AirTransportMissionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/airtransportmission/{id}`, but is otherwise the
         * same as [AirTransportMissionServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: AirTransportMissionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AirTransportMissionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AirTransportMissionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AirTransportMissionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airtransportmission`, but is otherwise the same
         * as [AirTransportMissionServiceAsync.list].
         */
        fun list(
            params: AirTransportMissionListParams
        ): CompletableFuture<HttpResponseFor<AirTransportMissionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AirTransportMissionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTransportMissionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/airtransportmission/count`, but is otherwise
         * the same as [AirTransportMissionServiceAsync.count].
         */
        fun count(
            params: AirTransportMissionCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AirTransportMissionCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/airtransportmission/queryhelp`, but is
         * otherwise the same as [AirTransportMissionServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<AirTransportMissionQueryhelpResponse>> =
            queryhelp(AirTransportMissionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirTransportMissionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: AirTransportMissionQueryhelpParams = AirTransportMissionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<AirTransportMissionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirTransportMissionQueryhelpResponse>> =
            queryhelp(AirTransportMissionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airtransportmission/tuple`, but is otherwise
         * the same as [AirTransportMissionServiceAsync.tuple].
         */
        fun tuple(
            params: AirTransportMissionTupleParams
        ): CompletableFuture<HttpResponseFor<List<AirTransportMissionFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AirTransportMissionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AirTransportMissionFull>>>
    }
}
