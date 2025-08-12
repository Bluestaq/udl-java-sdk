// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCountParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCreateBulkParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListPage
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetQueryhelpResponse
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetTupleParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.gnssobservationset.history.GnssObservationSetFull
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import com.unifieddatalibrary.api.services.blocking.gnssobservationset.HistoryService
import java.util.function.Consumer

interface GnssObservationsetService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationsetService

    fun history(): HistoryService

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: GnssObservationsetListParams): GnssObservationsetListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: GnssObservationsetListParams, requestOptions: RequestOptions = RequestOptions.none()): GnssObservationsetListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: GnssObservationsetCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: GnssObservationsetCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of Track Details records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: GnssObservationsetCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: GnssObservationsetCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): GnssObservationsetQueryhelpResponse = queryhelp(GnssObservationsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): GnssObservationsetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none()): GnssObservationsetQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): GnssObservationsetQueryhelpResponse =
        queryhelp(
          GnssObservationsetQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: GnssObservationsetTupleParams): List<GnssObservationSetFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: GnssObservationsetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<GnssObservationSetFull>

    /** Service operation to accept one or more GNSSObservationSet(s) and associated GNSS Observation(s) as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [GnssObservationsetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GnssObservationsetService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/gnssobservationset`, but is otherwise the same as [GnssObservationsetService.list]. */
        @MustBeClosed
        fun list(params: GnssObservationsetListParams): HttpResponseFor<GnssObservationsetListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: GnssObservationsetListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<GnssObservationsetListPage>

        /** Returns a raw HTTP response for `get /udl/gnssobservationset/count`, but is otherwise the same as [GnssObservationsetService.count]. */
        @MustBeClosed
        fun count(params: GnssObservationsetCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: GnssObservationsetCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/gnssobservationset/createBulk`, but is otherwise the same as [GnssObservationsetService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: GnssObservationsetCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: GnssObservationsetCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/gnssobservationset/queryhelp`, but is otherwise the same as [GnssObservationsetService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<GnssObservationsetQueryhelpResponse> = queryhelp(GnssObservationsetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<GnssObservationsetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: GnssObservationsetQueryhelpParams = GnssObservationsetQueryhelpParams.none()): HttpResponseFor<GnssObservationsetQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<GnssObservationsetQueryhelpResponse> =
            queryhelp(
              GnssObservationsetQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/gnssobservationset/tuple`, but is otherwise the same as [GnssObservationsetService.tuple]. */
        @MustBeClosed
        fun tuple(params: GnssObservationsetTupleParams): HttpResponseFor<List<GnssObservationSetFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: GnssObservationsetTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<GnssObservationSetFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-gnssobset`, but is otherwise the same as [GnssObservationsetService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: GnssObservationsetUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
