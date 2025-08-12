// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCountParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCreateBulkParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListPage
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackQueryhelpResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleResponse
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import com.unifieddatalibrary.api.services.blocking.missiletracks.HistoryService
import java.util.function.Consumer

interface MissileTrackService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackService

    fun history(): HistoryService

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: MissileTrackListParams): MissileTrackListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: MissileTrackListParams, requestOptions: RequestOptions = RequestOptions.none()): MissileTrackListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: MissileTrackCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: MissileTrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of MissileTrack records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: MissileTrackCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): MissileTrackQueryhelpResponse = queryhelp(MissileTrackQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): MissileTrackQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none()): MissileTrackQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): MissileTrackQueryhelpResponse =
        queryhelp(
          MissileTrackQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: MissileTrackTupleParams): List<MissileTrackTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<MissileTrackTupleResponse>

    /** Service operation to take multiple missile track records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [MissileTrackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissileTrackService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/missiletrack`, but is otherwise the same as [MissileTrackService.list]. */
        @MustBeClosed
        fun list(params: MissileTrackListParams): HttpResponseFor<MissileTrackListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: MissileTrackListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<MissileTrackListPage>

        /** Returns a raw HTTP response for `get /udl/missiletrack/count`, but is otherwise the same as [MissileTrackService.count]. */
        @MustBeClosed
        fun count(params: MissileTrackCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: MissileTrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/missiletrack/createBulk`, but is otherwise the same as [MissileTrackService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: MissileTrackCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: MissileTrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/missiletrack/queryhelp`, but is otherwise the same as [MissileTrackService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<MissileTrackQueryhelpResponse> = queryhelp(MissileTrackQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<MissileTrackQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: MissileTrackQueryhelpParams = MissileTrackQueryhelpParams.none()): HttpResponseFor<MissileTrackQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<MissileTrackQueryhelpResponse> =
            queryhelp(
              MissileTrackQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/missiletrack/tuple`, but is otherwise the same as [MissileTrackService.tuple]. */
        @MustBeClosed
        fun tuple(params: MissileTrackTupleParams): HttpResponseFor<List<MissileTrackTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: MissileTrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<MissileTrackTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-missiletrack`, but is otherwise the same as [MissileTrackService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: MissileTrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
