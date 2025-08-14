// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCountParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationCreateParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationFileCreateParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationGetParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationGetResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListPageAsync
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleResponse
import com.unifieddatalibrary.api.services.async.observations.passiveradarobservation.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PassiveRadarObservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PassiveRadarObservationServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single PassiveRadarObservation as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: PassiveRadarObservationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PassiveRadarObservationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: PassiveRadarObservationListParams
    ): CompletableFuture<PassiveRadarObservationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PassiveRadarObservationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassiveRadarObservationListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: PassiveRadarObservationCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: PassiveRadarObservationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of
     * PassiveRadarObservation records as a POST body and ingest into the database. This operation
     * is not intended to be used for automated feeds into UDL. Data providers should contact the
     * UDL team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: PassiveRadarObservationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: PassiveRadarObservationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to take multiple PassiveRadarObservation records as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun fileCreate(params: PassiveRadarObservationFileCreateParams): CompletableFuture<Void?> =
        fileCreate(params, RequestOptions.none())

    /** @see fileCreate */
    fun fileCreate(
        params: PassiveRadarObservationFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single PassiveRadarObservation record by its unique ID passed as a
     * path parameter.
     */
    fun get(id: String): CompletableFuture<PassiveRadarObservationGetResponse> =
        get(id, PassiveRadarObservationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassiveRadarObservationGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
    ): CompletableFuture<PassiveRadarObservationGetResponse> =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PassiveRadarObservationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassiveRadarObservationGetResponse>

    /** @see get */
    fun get(
        params: PassiveRadarObservationGetParams
    ): CompletableFuture<PassiveRadarObservationGetResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassiveRadarObservationGetResponse> =
        get(id, PassiveRadarObservationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<PassiveRadarObservationQueryhelpResponse> =
        queryhelp(PassiveRadarObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: PassiveRadarObservationQueryhelpParams =
            PassiveRadarObservationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassiveRadarObservationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: PassiveRadarObservationQueryhelpParams =
            PassiveRadarObservationQueryhelpParams.none()
    ): CompletableFuture<PassiveRadarObservationQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<PassiveRadarObservationQueryhelpResponse> =
        queryhelp(PassiveRadarObservationQueryhelpParams.none(), requestOptions)

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
        params: PassiveRadarObservationTupleParams
    ): CompletableFuture<List<PassiveRadarObservationTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: PassiveRadarObservationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PassiveRadarObservationTupleResponse>>

    /**
     * A view of [PassiveRadarObservationServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PassiveRadarObservationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/passiveradarobservation`, but is otherwise the
         * same as [PassiveRadarObservationServiceAsync.create].
         */
        fun create(params: PassiveRadarObservationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PassiveRadarObservationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation`, but is otherwise the
         * same as [PassiveRadarObservationServiceAsync.list].
         */
        fun list(
            params: PassiveRadarObservationListParams
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PassiveRadarObservationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/count`, but is
         * otherwise the same as [PassiveRadarObservationServiceAsync.count].
         */
        fun count(
            params: PassiveRadarObservationCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: PassiveRadarObservationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/passiveradarobservation/createBulk`, but is
         * otherwise the same as [PassiveRadarObservationServiceAsync.createBulk].
         */
        fun createBulk(
            params: PassiveRadarObservationCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: PassiveRadarObservationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-passiveradar`, but is otherwise the
         * same as [PassiveRadarObservationServiceAsync.fileCreate].
         */
        fun fileCreate(
            params: PassiveRadarObservationFileCreateParams
        ): CompletableFuture<HttpResponse> = fileCreate(params, RequestOptions.none())

        /** @see fileCreate */
        fun fileCreate(
            params: PassiveRadarObservationFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/{id}`, but is otherwise
         * the same as [PassiveRadarObservationServiceAsync.get].
         */
        fun get(
            id: String
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> =
            get(id, PassiveRadarObservationGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PassiveRadarObservationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>>

        /** @see get */
        fun get(
            params: PassiveRadarObservationGetParams
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationGetResponse>> =
            get(id, PassiveRadarObservationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/queryhelp`, but is
         * otherwise the same as [PassiveRadarObservationServiceAsync.queryhelp].
         */
        fun queryhelp():
            CompletableFuture<HttpResponseFor<PassiveRadarObservationQueryhelpResponse>> =
            queryhelp(PassiveRadarObservationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: PassiveRadarObservationQueryhelpParams =
                PassiveRadarObservationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: PassiveRadarObservationQueryhelpParams =
                PassiveRadarObservationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PassiveRadarObservationQueryhelpResponse>> =
            queryhelp(PassiveRadarObservationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/tuple`, but is
         * otherwise the same as [PassiveRadarObservationServiceAsync.tuple].
         */
        fun tuple(
            params: PassiveRadarObservationTupleParams
        ): CompletableFuture<HttpResponseFor<List<PassiveRadarObservationTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: PassiveRadarObservationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PassiveRadarObservationTupleResponse>>>
    }
}
