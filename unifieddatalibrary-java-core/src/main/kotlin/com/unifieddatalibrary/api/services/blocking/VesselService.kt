// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.vessel.VesselCountParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateBulkParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateParams
import com.unifieddatalibrary.api.models.vessel.VesselGetParams
import com.unifieddatalibrary.api.models.vessel.VesselGetResponse
import com.unifieddatalibrary.api.models.vessel.VesselListPage
import com.unifieddatalibrary.api.models.vessel.VesselListParams
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpParams
import com.unifieddatalibrary.api.models.vessel.VesselQueryhelpResponse
import com.unifieddatalibrary.api.models.vessel.VesselTupleParams
import com.unifieddatalibrary.api.models.vessel.VesselTupleResponse
import com.unifieddatalibrary.api.models.vessel.VesselUpdateParams
import com.unifieddatalibrary.api.services.blocking.VesselService
import java.util.function.Consumer

interface VesselService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VesselService

    /** Service operation to take a single vessel record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: VesselCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: VesselCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update a single vessel record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: VesselUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: VesselUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: VesselUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: VesselUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): VesselListPage = list(VesselListParams.none())

    /** @see list */
    fun list(params: VesselListParams = VesselListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VesselListPage

    /** @see list */
    fun list(params: VesselListParams = VesselListParams.none()): VesselListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): VesselListPage =
        list(
          VesselListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(VesselCountParams.none())

    /** @see count */
    fun count(params: VesselCountParams = VesselCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: VesselCountParams = VesselCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          VesselCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of vessel records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: VesselCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: VesselCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single vessel record by its unique ID passed as a path parameter. */
    fun get(id: String): VesselGetResponse =
        get(
          id, VesselGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: VesselGetParams = VesselGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VesselGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: VesselGetParams = VesselGetParams.none()): VesselGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: VesselGetParams, requestOptions: RequestOptions = RequestOptions.none()): VesselGetResponse

    /** @see get */
    fun get(params: VesselGetParams): VesselGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): VesselGetResponse =
        get(
          id,
          VesselGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): VesselQueryhelpResponse = queryhelp(VesselQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: VesselQueryhelpParams = VesselQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): VesselQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: VesselQueryhelpParams = VesselQueryhelpParams.none()): VesselQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): VesselQueryhelpResponse =
        queryhelp(
          VesselQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: VesselTupleParams): List<VesselTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: VesselTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<VesselTupleResponse>

    /** A view of [VesselService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VesselService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/vessel`, but is otherwise the same as [VesselService.create]. */
        @MustBeClosed
        fun create(params: VesselCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: VesselCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/vessel/{id}`, but is otherwise the same as [VesselService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: VesselUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: VesselUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: VesselUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: VesselUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/vessel`, but is otherwise the same as [VesselService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<VesselListPage> = list(VesselListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: VesselListParams = VesselListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VesselListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: VesselListParams = VesselListParams.none()): HttpResponseFor<VesselListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VesselListPage> =
            list(
              VesselListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/vessel/count`, but is otherwise the same as [VesselService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(VesselCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: VesselCountParams = VesselCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: VesselCountParams = VesselCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              VesselCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/vessel/createBulk`, but is otherwise the same as [VesselService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: VesselCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: VesselCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/vessel/{id}`, but is otherwise the same as [VesselService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<VesselGetResponse> =
            get(
              id, VesselGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: VesselGetParams = VesselGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VesselGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: VesselGetParams = VesselGetParams.none()): HttpResponseFor<VesselGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: VesselGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VesselGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: VesselGetParams): HttpResponseFor<VesselGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<VesselGetResponse> =
            get(
              id,
              VesselGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/vessel/queryhelp`, but is otherwise the same as [VesselService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<VesselQueryhelpResponse> = queryhelp(VesselQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: VesselQueryhelpParams = VesselQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<VesselQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: VesselQueryhelpParams = VesselQueryhelpParams.none()): HttpResponseFor<VesselQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<VesselQueryhelpResponse> =
            queryhelp(
              VesselQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/vessel/tuple`, but is otherwise the same as [VesselService.tuple]. */
        @MustBeClosed
        fun tuple(params: VesselTupleParams): HttpResponseFor<List<VesselTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: VesselTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<VesselTupleResponse>>
    }
}
