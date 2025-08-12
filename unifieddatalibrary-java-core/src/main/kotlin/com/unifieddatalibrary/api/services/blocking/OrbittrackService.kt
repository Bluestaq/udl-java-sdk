// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCountParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCreateBulkParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListPage
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackQueryhelpResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleResponse
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.OrbittrackService
import com.unifieddatalibrary.api.services.blocking.orbittrack.HistoryService
import java.util.function.Consumer

interface OrbittrackService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackService

    fun history(): HistoryService

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: OrbittrackListParams): OrbittrackListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: OrbittrackListParams, requestOptions: RequestOptions = RequestOptions.none()): OrbittrackListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: OrbittrackCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: OrbittrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of orbit track records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OrbittrackCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): OrbittrackQueryhelpResponse = queryhelp(OrbittrackQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OrbittrackQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none()): OrbittrackQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OrbittrackQueryhelpResponse =
        queryhelp(
          OrbittrackQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OrbittrackTupleParams): List<OrbittrackTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OrbittrackTupleResponse>

    /** Service operation to take multiple orbit track records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [OrbittrackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbittrackService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/orbittrack`, but is otherwise the same as [OrbittrackService.list]. */
        @MustBeClosed
        fun list(params: OrbittrackListParams): HttpResponseFor<OrbittrackListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: OrbittrackListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrbittrackListPage>

        /** Returns a raw HTTP response for `get /udl/orbittrack/count`, but is otherwise the same as [OrbittrackService.count]. */
        @MustBeClosed
        fun count(params: OrbittrackCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: OrbittrackCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/orbittrack/createBulk`, but is otherwise the same as [OrbittrackService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: OrbittrackCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: OrbittrackCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/orbittrack/queryhelp`, but is otherwise the same as [OrbittrackService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OrbittrackQueryhelpResponse> = queryhelp(OrbittrackQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrbittrackQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OrbittrackQueryhelpParams = OrbittrackQueryhelpParams.none()): HttpResponseFor<OrbittrackQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OrbittrackQueryhelpResponse> =
            queryhelp(
              OrbittrackQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/orbittrack/tuple`, but is otherwise the same as [OrbittrackService.tuple]. */
        @MustBeClosed
        fun tuple(params: OrbittrackTupleParams): HttpResponseFor<List<OrbittrackTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OrbittrackTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OrbittrackTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-orbittrack`, but is otherwise the same as [OrbittrackService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: OrbittrackUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
