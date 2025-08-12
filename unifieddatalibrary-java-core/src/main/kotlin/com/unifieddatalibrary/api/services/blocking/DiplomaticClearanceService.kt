// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.DiplomaticclearanceFull
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListPage
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceUpdateParams
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.CountryService
import com.unifieddatalibrary.api.services.blocking.diplomaticclearance.HistoryService
import java.util.function.Consumer

interface DiplomaticClearanceService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService

    fun history(): HistoryService

    fun country(): CountryService

    /** Service operation to take a single diplomatic clearance record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: DiplomaticClearanceCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single diplomatic clearance record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): DiplomaticclearanceFull =
        retrieve(
          id, DiplomaticClearanceRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DiplomaticclearanceFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none()): DiplomaticclearanceFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DiplomaticclearanceFull

    /** @see retrieve */
    fun retrieve(params: DiplomaticClearanceRetrieveParams): DiplomaticclearanceFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DiplomaticclearanceFull =
        retrieve(
          id,
          DiplomaticClearanceRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single diplomatic clearance record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: DiplomaticClearanceUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: DiplomaticClearanceUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: DiplomaticClearanceListParams): DiplomaticClearanceListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions = RequestOptions.none()): DiplomaticClearanceListPage

    /** Service operation to delete a diplomatic clearance record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, DiplomaticClearanceDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DiplomaticClearanceDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          DiplomaticClearanceDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: DiplomaticClearanceCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of diplomaticclearance records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: DiplomaticClearanceCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): DiplomaticClearanceQueryhelpResponse = queryhelp(DiplomaticClearanceQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DiplomaticClearanceQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none()): DiplomaticClearanceQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): DiplomaticClearanceQueryhelpResponse =
        queryhelp(
          DiplomaticClearanceQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: DiplomaticClearanceTupleParams): List<DiplomaticclearanceFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<DiplomaticclearanceFull>

    /** A view of [DiplomaticClearanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        fun country(): CountryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/diplomaticclearance`, but is otherwise the same as [DiplomaticClearanceService.create]. */
        @MustBeClosed
        fun create(params: DiplomaticClearanceCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: DiplomaticClearanceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/diplomaticclearance/{id}`, but is otherwise the same as [DiplomaticClearanceService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DiplomaticclearanceFull> =
            retrieve(
              id, DiplomaticClearanceRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DiplomaticclearanceFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none()): HttpResponseFor<DiplomaticclearanceFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DiplomaticClearanceRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DiplomaticclearanceFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DiplomaticClearanceRetrieveParams): HttpResponseFor<DiplomaticclearanceFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<DiplomaticclearanceFull> =
            retrieve(
              id,
              DiplomaticClearanceRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/diplomaticclearance/{id}`, but is otherwise the same as [DiplomaticClearanceService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: DiplomaticClearanceUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: DiplomaticClearanceUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: DiplomaticClearanceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/diplomaticclearance`, but is otherwise the same as [DiplomaticClearanceService.list]. */
        @MustBeClosed
        fun list(params: DiplomaticClearanceListParams): HttpResponseFor<DiplomaticClearanceListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: DiplomaticClearanceListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DiplomaticClearanceListPage>

        /** Returns a raw HTTP response for `delete /udl/diplomaticclearance/{id}`, but is otherwise the same as [DiplomaticClearanceService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, DiplomaticClearanceDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: DiplomaticClearanceDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DiplomaticClearanceDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              DiplomaticClearanceDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/diplomaticclearance/count`, but is otherwise the same as [DiplomaticClearanceService.count]. */
        @MustBeClosed
        fun count(params: DiplomaticClearanceCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: DiplomaticClearanceCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/diplomaticclearance/createBulk`, but is otherwise the same as [DiplomaticClearanceService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: DiplomaticClearanceCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: DiplomaticClearanceCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/diplomaticclearance/queryhelp`, but is otherwise the same as [DiplomaticClearanceService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<DiplomaticClearanceQueryhelpResponse> = queryhelp(DiplomaticClearanceQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DiplomaticClearanceQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none()): HttpResponseFor<DiplomaticClearanceQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<DiplomaticClearanceQueryhelpResponse> =
            queryhelp(
              DiplomaticClearanceQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/diplomaticclearance/tuple`, but is otherwise the same as [DiplomaticClearanceService.tuple]. */
        @MustBeClosed
        fun tuple(params: DiplomaticClearanceTupleParams): HttpResponseFor<List<DiplomaticclearanceFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: DiplomaticClearanceTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<DiplomaticclearanceFull>>
    }
}
