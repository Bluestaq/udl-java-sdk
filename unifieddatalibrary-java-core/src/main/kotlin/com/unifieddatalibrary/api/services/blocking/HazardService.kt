// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.hazard.HazardCountParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateBulkParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateParams
import com.unifieddatalibrary.api.models.hazard.HazardGetParams
import com.unifieddatalibrary.api.models.hazard.HazardGetResponse
import com.unifieddatalibrary.api.models.hazard.HazardListPage
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpParams
import com.unifieddatalibrary.api.models.hazard.HazardQueryhelpResponse
import com.unifieddatalibrary.api.models.hazard.HazardTupleParams
import com.unifieddatalibrary.api.models.hazard.HazardTupleResponse
import com.unifieddatalibrary.api.services.blocking.HazardService
import com.unifieddatalibrary.api.services.blocking.hazard.HistoryService
import java.util.function.Consumer

interface HazardService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardService

    fun history(): HistoryService

    /** Service operation to take a single hazard as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: HazardCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: HazardCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: HazardListParams): HazardListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: HazardListParams, requestOptions: RequestOptions = RequestOptions.none()): HazardListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: HazardCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: HazardCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of hazards as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: HazardCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single Hazard by its unique ID passed as a path parameter. */
    fun get(id: String): HazardGetResponse =
        get(
          id, HazardGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: HazardGetParams = HazardGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HazardGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: HazardGetParams = HazardGetParams.none()): HazardGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: HazardGetParams, requestOptions: RequestOptions = RequestOptions.none()): HazardGetResponse

    /** @see get */
    fun get(params: HazardGetParams): HazardGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): HazardGetResponse =
        get(
          id,
          HazardGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): HazardQueryhelpResponse = queryhelp(HazardQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HazardQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none()): HazardQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): HazardQueryhelpResponse =
        queryhelp(
          HazardQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: HazardTupleParams): List<HazardTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: HazardTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<HazardTupleResponse>

    /** A view of [HazardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HazardService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/hazard`, but is otherwise the same as [HazardService.create]. */
        @MustBeClosed
        fun create(params: HazardCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: HazardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/hazard`, but is otherwise the same as [HazardService.list]. */
        @MustBeClosed
        fun list(params: HazardListParams): HttpResponseFor<HazardListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: HazardListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HazardListPage>

        /** Returns a raw HTTP response for `get /udl/hazard/count`, but is otherwise the same as [HazardService.count]. */
        @MustBeClosed
        fun count(params: HazardCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: HazardCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/hazard/createBulk`, but is otherwise the same as [HazardService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: HazardCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: HazardCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/hazard/{id}`, but is otherwise the same as [HazardService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<HazardGetResponse> =
            get(
              id, HazardGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: HazardGetParams = HazardGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HazardGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: HazardGetParams = HazardGetParams.none()): HttpResponseFor<HazardGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: HazardGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HazardGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: HazardGetParams): HttpResponseFor<HazardGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<HazardGetResponse> =
            get(
              id,
              HazardGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/hazard/queryhelp`, but is otherwise the same as [HazardService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<HazardQueryhelpResponse> = queryhelp(HazardQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HazardQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: HazardQueryhelpParams = HazardQueryhelpParams.none()): HttpResponseFor<HazardQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<HazardQueryhelpResponse> =
            queryhelp(
              HazardQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/hazard/tuple`, but is otherwise the same as [HazardService.tuple]. */
        @MustBeClosed
        fun tuple(params: HazardTupleParams): HttpResponseFor<List<HazardTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: HazardTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<HazardTupleResponse>>
    }
}
