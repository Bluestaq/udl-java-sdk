// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCountParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateBulkParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverCreateParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverGetResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListPage
import com.unifieddatalibrary.api.models.maneuvers.ManeuverListParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleParams
import com.unifieddatalibrary.api.models.maneuvers.ManeuverTupleResponse
import com.unifieddatalibrary.api.models.maneuvers.ManeuverUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.ManeuverService
import com.unifieddatalibrary.api.services.blocking.maneuvers.HistoryService
import java.util.function.Consumer

interface ManeuverService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverService

    fun history(): HistoryService

    /** Service operation to take a single maneuver as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: ManeuverCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ManeuverCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: ManeuverListParams): ManeuverListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: ManeuverListParams, requestOptions: RequestOptions = RequestOptions.none()): ManeuverListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: ManeuverCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: ManeuverCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of maneuvers as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: ManeuverCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: ManeuverCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single maneuver by its unique ID passed as a path parameter. */
    fun get(id: String): ManeuverGetResponse =
        get(
          id, ManeuverGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ManeuverGetParams = ManeuverGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ManeuverGetResponse =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ManeuverGetParams = ManeuverGetParams.none()): ManeuverGetResponse =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ManeuverGetParams, requestOptions: RequestOptions = RequestOptions.none()): ManeuverGetResponse

    /** @see get */
    fun get(params: ManeuverGetParams): ManeuverGetResponse =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ManeuverGetResponse =
        get(
          id,
          ManeuverGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): ManeuverQueryhelpResponse = queryhelp(ManeuverQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ManeuverQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none()): ManeuverQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ManeuverQueryhelpResponse =
        queryhelp(
          ManeuverQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ManeuverTupleParams): List<ManeuverTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ManeuverTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<ManeuverTupleResponse>

    /** Service operation to take multiple maneuvers as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ManeuverService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManeuverService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/maneuver`, but is otherwise the same as [ManeuverService.create]. */
        @MustBeClosed
        fun create(params: ManeuverCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: ManeuverCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/maneuver`, but is otherwise the same as [ManeuverService.list]. */
        @MustBeClosed
        fun list(params: ManeuverListParams): HttpResponseFor<ManeuverListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: ManeuverListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManeuverListPage>

        /** Returns a raw HTTP response for `get /udl/maneuver/count`, but is otherwise the same as [ManeuverService.count]. */
        @MustBeClosed
        fun count(params: ManeuverCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: ManeuverCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/maneuver/createBulk`, but is otherwise the same as [ManeuverService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: ManeuverCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: ManeuverCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/maneuver/{id}`, but is otherwise the same as [ManeuverService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ManeuverGetResponse> =
            get(
              id, ManeuverGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ManeuverGetParams = ManeuverGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManeuverGetResponse> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: ManeuverGetParams = ManeuverGetParams.none()): HttpResponseFor<ManeuverGetResponse> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: ManeuverGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManeuverGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ManeuverGetParams): HttpResponseFor<ManeuverGetResponse> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ManeuverGetResponse> =
            get(
              id,
              ManeuverGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/maneuver/queryhelp`, but is otherwise the same as [ManeuverService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ManeuverQueryhelpResponse> = queryhelp(ManeuverQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ManeuverQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: ManeuverQueryhelpParams = ManeuverQueryhelpParams.none()): HttpResponseFor<ManeuverQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ManeuverQueryhelpResponse> =
            queryhelp(
              ManeuverQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/maneuver/tuple`, but is otherwise the same as [ManeuverService.tuple]. */
        @MustBeClosed
        fun tuple(params: ManeuverTupleParams): HttpResponseFor<List<ManeuverTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: ManeuverTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<ManeuverTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-maneuver`, but is otherwise the same as [ManeuverService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: ManeuverUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
