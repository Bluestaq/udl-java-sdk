// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EventEvolutionFull
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCountParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateBulkParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListPage
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionListParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionQueryhelpResponse
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionRetrieveParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionTupleParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.EventEvolutionService
import com.unifieddatalibrary.api.services.blocking.eventevolution.HistoryService
import java.util.function.Consumer

interface EventEvolutionService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventEvolutionService

    fun history(): HistoryService

    /** Service operation to take a single EventEvolution object as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EventEvolutionCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EventEvolutionCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EventEvolution by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EventEvolutionFull =
        retrieve(
          id, EventEvolutionRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventEvolutionFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none()): EventEvolutionFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EventEvolutionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EventEvolutionFull

    /** @see retrieve */
    fun retrieve(params: EventEvolutionRetrieveParams): EventEvolutionFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EventEvolutionFull =
        retrieve(
          id,
          EventEvolutionRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): EventEvolutionListPage = list(EventEvolutionListParams.none())

    /** @see list */
    fun list(params: EventEvolutionListParams = EventEvolutionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventEvolutionListPage

    /** @see list */
    fun list(params: EventEvolutionListParams = EventEvolutionListParams.none()): EventEvolutionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): EventEvolutionListPage =
        list(
          EventEvolutionListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(EventEvolutionCountParams.none())

    /** @see count */
    fun count(params: EventEvolutionCountParams = EventEvolutionCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: EventEvolutionCountParams = EventEvolutionCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          EventEvolutionCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of EventEvolution records as a POST body and ingest into the database. Requires specific roles, please contact the UDL team to gain access. This operation is not intended to be used for automated feeds into UDL...data providers should contact the UDL team for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EventEvolutionCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EventEvolutionCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): EventEvolutionQueryhelpResponse = queryhelp(EventEvolutionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventEvolutionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none()): EventEvolutionQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EventEvolutionQueryhelpResponse =
        queryhelp(
          EventEvolutionQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EventEvolutionTupleParams): List<EventEvolutionFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EventEvolutionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<EventEvolutionFull>

    /** Service operation to take a list of EventEvolution records as a POST body and ingest into the database. Requires a specific role, please contact the UDL team to gain access. This operation is intended to be used for automated feeds into UDL. */
    fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EventEvolutionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventEvolutionService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/eventevolution`, but is otherwise the same as [EventEvolutionService.create]. */
        @MustBeClosed
        fun create(params: EventEvolutionCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EventEvolutionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/eventevolution/{id}`, but is otherwise the same as [EventEvolutionService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EventEvolutionFull> =
            retrieve(
              id, EventEvolutionRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventEvolutionFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EventEvolutionRetrieveParams = EventEvolutionRetrieveParams.none()): HttpResponseFor<EventEvolutionFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EventEvolutionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventEvolutionFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EventEvolutionRetrieveParams): HttpResponseFor<EventEvolutionFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EventEvolutionFull> =
            retrieve(
              id,
              EventEvolutionRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/eventevolution`, but is otherwise the same as [EventEvolutionService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<EventEvolutionListPage> = list(EventEvolutionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: EventEvolutionListParams = EventEvolutionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventEvolutionListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EventEvolutionListParams = EventEvolutionListParams.none()): HttpResponseFor<EventEvolutionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventEvolutionListPage> =
            list(
              EventEvolutionListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/eventevolution/count`, but is otherwise the same as [EventEvolutionService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(EventEvolutionCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: EventEvolutionCountParams = EventEvolutionCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: EventEvolutionCountParams = EventEvolutionCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              EventEvolutionCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/eventevolution/createBulk`, but is otherwise the same as [EventEvolutionService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: EventEvolutionCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: EventEvolutionCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/eventevolution/queryhelp`, but is otherwise the same as [EventEvolutionService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EventEvolutionQueryhelpResponse> = queryhelp(EventEvolutionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventEvolutionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: EventEvolutionQueryhelpParams = EventEvolutionQueryhelpParams.none()): HttpResponseFor<EventEvolutionQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EventEvolutionQueryhelpResponse> =
            queryhelp(
              EventEvolutionQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/eventevolution/tuple`, but is otherwise the same as [EventEvolutionService.tuple]. */
        @MustBeClosed
        fun tuple(params: EventEvolutionTupleParams): HttpResponseFor<List<EventEvolutionFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: EventEvolutionTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<EventEvolutionFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-eventevolution`, but is otherwise the same as [EventEvolutionService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: EventEvolutionUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
