// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.DriftHistoryFull
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryCountParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListPage
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryListParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryQueryhelpResponse
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryRetrieveParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryTupleParams
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import java.util.function.Consumer

interface DriftHistoryService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriftHistoryService

    /** Service operation to get a single DriftHistory record by its unique ID passed as a path parameter. DriftHistory represents historical drift rates for GEO Onorbit objects resulting from updates to OnorbitDetails driftRate values. */
    fun retrieve(id: String): DriftHistoryFull =
        retrieve(
          id, DriftHistoryRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DriftHistoryFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none()): DriftHistoryFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: DriftHistoryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DriftHistoryFull

    /** @see retrieve */
    fun retrieve(params: DriftHistoryRetrieveParams): DriftHistoryFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DriftHistoryFull =
        retrieve(
          id,
          DriftHistoryRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): DriftHistoryListPage = list(DriftHistoryListParams.none())

    /** @see list */
    fun list(params: DriftHistoryListParams = DriftHistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DriftHistoryListPage

    /** @see list */
    fun list(params: DriftHistoryListParams = DriftHistoryListParams.none()): DriftHistoryListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): DriftHistoryListPage =
        list(
          DriftHistoryListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(DriftHistoryCountParams.none())

    /** @see count */
    fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          DriftHistoryCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): DriftHistoryQueryhelpResponse = queryhelp(DriftHistoryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DriftHistoryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none()): DriftHistoryQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): DriftHistoryQueryhelpResponse =
        queryhelp(
          DriftHistoryQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: DriftHistoryTupleParams): List<DriftHistoryFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: DriftHistoryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<DriftHistoryFull>

    /** A view of [DriftHistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriftHistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/drifthistory/{id}`, but is otherwise the same as [DriftHistoryService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DriftHistoryFull> =
            retrieve(
              id, DriftHistoryRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DriftHistoryFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: DriftHistoryRetrieveParams = DriftHistoryRetrieveParams.none()): HttpResponseFor<DriftHistoryFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DriftHistoryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DriftHistoryFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DriftHistoryRetrieveParams): HttpResponseFor<DriftHistoryFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<DriftHistoryFull> =
            retrieve(
              id,
              DriftHistoryRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory`, but is otherwise the same as [DriftHistoryService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<DriftHistoryListPage> = list(DriftHistoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: DriftHistoryListParams = DriftHistoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DriftHistoryListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DriftHistoryListParams = DriftHistoryListParams.none()): HttpResponseFor<DriftHistoryListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DriftHistoryListPage> =
            list(
              DriftHistoryListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/count`, but is otherwise the same as [DriftHistoryService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(DriftHistoryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: DriftHistoryCountParams = DriftHistoryCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              DriftHistoryCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/queryhelp`, but is otherwise the same as [DriftHistoryService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<DriftHistoryQueryhelpResponse> = queryhelp(DriftHistoryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DriftHistoryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DriftHistoryQueryhelpParams = DriftHistoryQueryhelpParams.none()): HttpResponseFor<DriftHistoryQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<DriftHistoryQueryhelpResponse> =
            queryhelp(
              DriftHistoryQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/drifthistory/tuple`, but is otherwise the same as [DriftHistoryService.tuple]. */
        @MustBeClosed
        fun tuple(params: DriftHistoryTupleParams): HttpResponseFor<List<DriftHistoryFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: DriftHistoryTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<DriftHistoryFull>>
    }
}
