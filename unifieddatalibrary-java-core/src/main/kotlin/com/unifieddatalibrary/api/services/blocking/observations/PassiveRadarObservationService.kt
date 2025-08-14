// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListPage
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationListParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleParams
import com.unifieddatalibrary.api.models.observations.passiveradarobservation.PassiveRadarObservationTupleResponse
import com.unifieddatalibrary.api.services.blocking.observations.passiveradarobservation.HistoryService
import java.util.function.Consumer

interface PassiveRadarObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PassiveRadarObservationService

    fun history(): HistoryService

    /**
     * Service operation to take a single PassiveRadarObservation as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: PassiveRadarObservationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PassiveRadarObservationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: PassiveRadarObservationListParams): PassiveRadarObservationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PassiveRadarObservationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassiveRadarObservationListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: PassiveRadarObservationCountParams): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: PassiveRadarObservationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of
     * PassiveRadarObservation records as a POST body and ingest into the database. This operation
     * is not intended to be used for automated feeds into UDL. Data providers should contact the
     * UDL team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: PassiveRadarObservationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: PassiveRadarObservationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to take multiple PassiveRadarObservation records as a POST body and ingest
     * into the database. This operation is intended to be used for automated feeds into UDL. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun fileCreate(params: PassiveRadarObservationFileCreateParams) =
        fileCreate(params, RequestOptions.none())

    /** @see fileCreate */
    fun fileCreate(
        params: PassiveRadarObservationFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single PassiveRadarObservation record by its unique ID passed as a
     * path parameter.
     */
    fun get(id: String): PassiveRadarObservationGetResponse =
        get(id, PassiveRadarObservationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassiveRadarObservationGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
    ): PassiveRadarObservationGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PassiveRadarObservationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassiveRadarObservationGetResponse

    /** @see get */
    fun get(params: PassiveRadarObservationGetParams): PassiveRadarObservationGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): PassiveRadarObservationGetResponse =
        get(id, PassiveRadarObservationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): PassiveRadarObservationQueryhelpResponse =
        queryhelp(PassiveRadarObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: PassiveRadarObservationQueryhelpParams =
            PassiveRadarObservationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassiveRadarObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: PassiveRadarObservationQueryhelpParams =
            PassiveRadarObservationQueryhelpParams.none()
    ): PassiveRadarObservationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): PassiveRadarObservationQueryhelpResponse =
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
    ): List<PassiveRadarObservationTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: PassiveRadarObservationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PassiveRadarObservationTupleResponse>

    /**
     * A view of [PassiveRadarObservationService] that provides access to raw HTTP responses for
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
        ): PassiveRadarObservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/passiveradarobservation`, but is otherwise the
         * same as [PassiveRadarObservationService.create].
         */
        @MustBeClosed
        fun create(params: PassiveRadarObservationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PassiveRadarObservationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation`, but is otherwise the
         * same as [PassiveRadarObservationService.list].
         */
        @MustBeClosed
        fun list(
            params: PassiveRadarObservationListParams
        ): HttpResponseFor<PassiveRadarObservationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PassiveRadarObservationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassiveRadarObservationListPage>

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/count`, but is
         * otherwise the same as [PassiveRadarObservationService.count].
         */
        @MustBeClosed
        fun count(params: PassiveRadarObservationCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: PassiveRadarObservationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/passiveradarobservation/createBulk`, but is
         * otherwise the same as [PassiveRadarObservationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: PassiveRadarObservationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: PassiveRadarObservationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-passiveradar`, but is otherwise the
         * same as [PassiveRadarObservationService.fileCreate].
         */
        @MustBeClosed
        fun fileCreate(params: PassiveRadarObservationFileCreateParams): HttpResponse =
            fileCreate(params, RequestOptions.none())

        /** @see fileCreate */
        @MustBeClosed
        fun fileCreate(
            params: PassiveRadarObservationFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/{id}`, but is otherwise
         * the same as [PassiveRadarObservationService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<PassiveRadarObservationGetResponse> =
            get(id, PassiveRadarObservationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassiveRadarObservationGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PassiveRadarObservationGetParams = PassiveRadarObservationGetParams.none(),
        ): HttpResponseFor<PassiveRadarObservationGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PassiveRadarObservationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassiveRadarObservationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: PassiveRadarObservationGetParams
        ): HttpResponseFor<PassiveRadarObservationGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassiveRadarObservationGetResponse> =
            get(id, PassiveRadarObservationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/queryhelp`, but is
         * otherwise the same as [PassiveRadarObservationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<PassiveRadarObservationQueryhelpResponse> =
            queryhelp(PassiveRadarObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PassiveRadarObservationQueryhelpParams =
                PassiveRadarObservationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassiveRadarObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PassiveRadarObservationQueryhelpParams =
                PassiveRadarObservationQueryhelpParams.none()
        ): HttpResponseFor<PassiveRadarObservationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<PassiveRadarObservationQueryhelpResponse> =
            queryhelp(PassiveRadarObservationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/passiveradarobservation/tuple`, but is
         * otherwise the same as [PassiveRadarObservationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: PassiveRadarObservationTupleParams
        ): HttpResponseFor<List<PassiveRadarObservationTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: PassiveRadarObservationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PassiveRadarObservationTupleResponse>>
    }
}
