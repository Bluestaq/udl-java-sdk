// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EoObservationFull
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCountParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationCreateParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListPage
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationListParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationQueryhelpResponse
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationRetrieveParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationTupleParams
import com.unifieddatalibrary.api.models.observations.eoobservations.EoObservationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.EoObservationService
import com.unifieddatalibrary.api.services.blocking.observations.eoobservations.HistoryService
import java.util.function.Consumer

interface EoObservationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationService

    fun history(): HistoryService

    /** Service operation to take a single EO observation as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: EoObservationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EoObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EO observation by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EoObservationFull =
        retrieve(
          id, EoObservationRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EoObservationFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none()): EoObservationFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EoObservationFull

    /** @see retrieve */
    fun retrieve(params: EoObservationRetrieveParams): EoObservationFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EoObservationFull =
        retrieve(
          id,
          EoObservationRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: EoObservationListParams): EoObservationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: EoObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): EoObservationListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: EoObservationCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: EoObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of EO observations as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EoObservationCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): EoObservationQueryhelpResponse = queryhelp(EoObservationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EoObservationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none()): EoObservationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EoObservationQueryhelpResponse =
        queryhelp(
          EoObservationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EoObservationTupleParams): List<EoObservationFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<EoObservationFull>

    /** Service operation to take multiple EO observations as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EoObservationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EoObservationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/eoobservation`, but is otherwise the same as [EoObservationService.create]. */
        @MustBeClosed
        fun create(params: EoObservationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EoObservationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/eoobservation/{id}`, but is otherwise the same as [EoObservationService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EoObservationFull> =
            retrieve(
              id, EoObservationRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EoObservationFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EoObservationRetrieveParams = EoObservationRetrieveParams.none()): HttpResponseFor<EoObservationFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EoObservationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EoObservationFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EoObservationRetrieveParams): HttpResponseFor<EoObservationFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EoObservationFull> =
            retrieve(
              id,
              EoObservationRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/eoobservation`, but is otherwise the same as [EoObservationService.list]. */
        @MustBeClosed
        fun list(params: EoObservationListParams): HttpResponseFor<EoObservationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: EoObservationListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EoObservationListPage>

        /** Returns a raw HTTP response for `get /udl/eoobservation/count`, but is otherwise the same as [EoObservationService.count]. */
        @MustBeClosed
        fun count(params: EoObservationCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: EoObservationCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/eoobservation/createBulk`, but is otherwise the same as [EoObservationService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: EoObservationCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: EoObservationCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/eoobservation/queryhelp`, but is otherwise the same as [EoObservationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EoObservationQueryhelpResponse> = queryhelp(EoObservationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EoObservationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: EoObservationQueryhelpParams = EoObservationQueryhelpParams.none()): HttpResponseFor<EoObservationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EoObservationQueryhelpResponse> =
            queryhelp(
              EoObservationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/eoobservation/tuple`, but is otherwise the same as [EoObservationService.tuple]. */
        @MustBeClosed
        fun tuple(params: EoObservationTupleParams): HttpResponseFor<List<EoObservationFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: EoObservationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<EoObservationFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-eo`, but is otherwise the same as [EoObservationService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: EoObservationUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
