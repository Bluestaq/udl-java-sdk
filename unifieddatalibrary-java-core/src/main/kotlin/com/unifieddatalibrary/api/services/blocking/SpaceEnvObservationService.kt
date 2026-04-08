// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCountParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCreateBulkParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListPage
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationTupleParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.spaceenvobservation.history.SpaceEnvObservationFull
import com.unifieddatalibrary.api.services.blocking.spaceenvobservation.HistoryService
import java.util.function.Consumer

/**
 * This collection of services provides operations for querying and manipulation of electro-optical
 * (EO), radar, radio frequency (RF), Global Navigation Satellite Systems (GNSS), Ionospheric
 * (IONO), Infrared (SWIR), and Space Environment observation data. The J2000 coordinate frame is
 * the preferred frame for all observations, as applicable, but in some cases observations may be in
 * an alternate frame depending on the provider and/or datatype.
 */
interface SpaceEnvObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpaceEnvObservationService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (`/udl/<datatype>/queryhelp`) for more
     * details on valid/required query parameter information.
     */
    fun list(params: SpaceEnvObservationListParams): SpaceEnvObservationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SpaceEnvObservationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpaceEnvObservationListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (`/udl/<datatype>/queryhelp`) for more details on valid/required query parameter information.
     */
    fun count(params: SpaceEnvObservationCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SpaceEnvObservationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of
     * SpaceEnvObservation records as a POST body and ingest into the database. This operation is
     * not intended to be used for automated feeds into UDL. Data providers should contact the UDL
     * team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: SpaceEnvObservationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SpaceEnvObservationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createBulk */
    fun createBulk(
        body: List<SpaceEnvObservationCreateBulkParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createBulk(SpaceEnvObservationCreateBulkParams.builder().body(body).build(), requestOptions)

    /** @see createBulk */
    fun createBulk(body: List<SpaceEnvObservationCreateBulkParams.Body>) =
        createBulk(body, RequestOptions.none())

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SpaceEnvObservationQueryhelpResponse =
        queryhelp(SpaceEnvObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpaceEnvObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none()
    ): SpaceEnvObservationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SpaceEnvObservationQueryhelpResponse =
        queryhelp(SpaceEnvObservationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (`/udl/<datatype>/queryhelp`) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SpaceEnvObservationTupleParams): List<SpaceEnvObservationFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SpaceEnvObservationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SpaceEnvObservationFull>

    /**
     * Service operation to accept one or more SpaceEnvObservation(s) as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SpaceEnvObservationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        body: List<SpaceEnvObservationUnvalidatedPublishParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        unvalidatedPublish(
            SpaceEnvObservationUnvalidatedPublishParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(body: List<SpaceEnvObservationUnvalidatedPublishParams.Body>) =
        unvalidatedPublish(body, RequestOptions.none())

    /**
     * A view of [SpaceEnvObservationService] that provides access to raw HTTP responses for each
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
        ): SpaceEnvObservationService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/spaceenvobservation`, but is otherwise the same
         * as [SpaceEnvObservationService.list].
         */
        @MustBeClosed
        fun list(
            params: SpaceEnvObservationListParams
        ): HttpResponseFor<SpaceEnvObservationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SpaceEnvObservationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpaceEnvObservationListPage>

        /**
         * Returns a raw HTTP response for `get /udl/spaceenvobservation/count`, but is otherwise
         * the same as [SpaceEnvObservationService.count].
         */
        @MustBeClosed
        fun count(params: SpaceEnvObservationCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SpaceEnvObservationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/spaceenvobservation/createBulk`, but is
         * otherwise the same as [SpaceEnvObservationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SpaceEnvObservationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SpaceEnvObservationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            body: List<SpaceEnvObservationCreateBulkParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createBulk(
                SpaceEnvObservationCreateBulkParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(body: List<SpaceEnvObservationCreateBulkParams.Body>): HttpResponse =
            createBulk(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/spaceenvobservation/queryhelp`, but is
         * otherwise the same as [SpaceEnvObservationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SpaceEnvObservationQueryhelpResponse> =
            queryhelp(SpaceEnvObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpaceEnvObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SpaceEnvObservationQueryhelpParams = SpaceEnvObservationQueryhelpParams.none()
        ): HttpResponseFor<SpaceEnvObservationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SpaceEnvObservationQueryhelpResponse> =
            queryhelp(SpaceEnvObservationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/spaceenvobservation/tuple`, but is otherwise
         * the same as [SpaceEnvObservationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: SpaceEnvObservationTupleParams
        ): HttpResponseFor<List<SpaceEnvObservationFull>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SpaceEnvObservationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SpaceEnvObservationFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-spaceenvobs`, but is otherwise the
         * same as [SpaceEnvObservationService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: SpaceEnvObservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: SpaceEnvObservationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            body: List<SpaceEnvObservationUnvalidatedPublishParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unvalidatedPublish(
                SpaceEnvObservationUnvalidatedPublishParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            body: List<SpaceEnvObservationUnvalidatedPublishParams.Body>
        ): HttpResponse = unvalidatedPublish(body, RequestOptions.none())
    }
}
