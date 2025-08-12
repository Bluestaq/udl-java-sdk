// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OperatingUnitRemarkFull
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListPage
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkListParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpResponse
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import java.util.function.Consumer

interface OperatingunitremarkService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkService

    /** Service operation to take a single operatingunitremark record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OperatingunitremarkCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OperatingunitremarkListPage = list(OperatingunitremarkListParams.none())

    /** @see list */
    fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingunitremarkListPage

    /** @see list */
    fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none()): OperatingunitremarkListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OperatingunitremarkListPage =
        list(
          OperatingunitremarkListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(OperatingunitremarkCountParams.none())

    /** @see count */
    fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          OperatingunitremarkCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of operatingunitremark records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: OperatingunitremarkCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single operatingunitremark record by its unique ID passed as a path parameter. */
    fun get(id: String): OperatingUnitRemarkFull =
        get(
          id, OperatingunitremarkGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingUnitRemarkFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none()): OperatingUnitRemarkFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions = RequestOptions.none()): OperatingUnitRemarkFull

    /** @see get */
    fun get(params: OperatingunitremarkGetParams): OperatingUnitRemarkFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OperatingUnitRemarkFull =
        get(
          id,
          OperatingunitremarkGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): OperatingunitremarkQueryhelpResponse = queryhelp(OperatingunitremarkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OperatingunitremarkQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none()): OperatingunitremarkQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OperatingunitremarkQueryhelpResponse =
        queryhelp(
          OperatingunitremarkQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OperatingunitremarkTupleParams): List<OperatingUnitRemarkFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OperatingUnitRemarkFull>

    /** A view of [OperatingunitremarkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatingunitremarkService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/operatingunitremark`, but is otherwise the same as [OperatingunitremarkService.create]. */
        @MustBeClosed
        fun create(params: OperatingunitremarkCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OperatingunitremarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/operatingunitremark`, but is otherwise the same as [OperatingunitremarkService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OperatingunitremarkListPage> = list(OperatingunitremarkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitremarkListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OperatingunitremarkListParams = OperatingunitremarkListParams.none()): HttpResponseFor<OperatingunitremarkListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OperatingunitremarkListPage> =
            list(
              OperatingunitremarkListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/count`, but is otherwise the same as [OperatingunitremarkService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OperatingunitremarkCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: OperatingunitremarkCountParams = OperatingunitremarkCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              OperatingunitremarkCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/operatingunitremark/createBulk`, but is otherwise the same as [OperatingunitremarkService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: OperatingunitremarkCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: OperatingunitremarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/{id}`, but is otherwise the same as [OperatingunitremarkService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OperatingUnitRemarkFull> =
            get(
              id, OperatingunitremarkGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingUnitRemarkFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OperatingunitremarkGetParams = OperatingunitremarkGetParams.none()): HttpResponseFor<OperatingUnitRemarkFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OperatingunitremarkGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingUnitRemarkFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OperatingunitremarkGetParams): HttpResponseFor<OperatingUnitRemarkFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OperatingUnitRemarkFull> =
            get(
              id,
              OperatingunitremarkGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/queryhelp`, but is otherwise the same as [OperatingunitremarkService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OperatingunitremarkQueryhelpResponse> = queryhelp(OperatingunitremarkQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OperatingunitremarkQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OperatingunitremarkQueryhelpParams = OperatingunitremarkQueryhelpParams.none()): HttpResponseFor<OperatingunitremarkQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OperatingunitremarkQueryhelpResponse> =
            queryhelp(
              OperatingunitremarkQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/operatingunitremark/tuple`, but is otherwise the same as [OperatingunitremarkService.tuple]. */
        @MustBeClosed
        fun tuple(params: OperatingunitremarkTupleParams): HttpResponseFor<List<OperatingUnitRemarkFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OperatingunitremarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OperatingUnitRemarkFull>>
    }
}
