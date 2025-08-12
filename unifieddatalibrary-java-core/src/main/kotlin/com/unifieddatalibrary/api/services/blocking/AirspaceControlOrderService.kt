// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirspacecontrolorderFull
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCountParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateBulkParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListPage
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderRetrieveParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderTupleParams
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderService
import java.util.function.Consumer

interface AirspaceControlOrderService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderService

    /** Service operation to take a single AirspaceControlOrder record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirspaceControlOrderCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirspaceControlOrderCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single AirspaceControlOrder record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirspacecontrolorderFull =
        retrieve(
          id, AirspaceControlOrderRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirspacecontrolorderFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none()): AirspacecontrolorderFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirspaceControlOrderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirspacecontrolorderFull

    /** @see retrieve */
    fun retrieve(params: AirspaceControlOrderRetrieveParams): AirspacecontrolorderFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirspacecontrolorderFull =
        retrieve(
          id,
          AirspaceControlOrderRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AirspaceControlOrderListPage = list(AirspaceControlOrderListParams.none())

    /** @see list */
    fun list(params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirspaceControlOrderListPage

    /** @see list */
    fun list(params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none()): AirspaceControlOrderListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AirspaceControlOrderListPage =
        list(
          AirspaceControlOrderListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AirspaceControlOrderCountParams.none())

    /** @see count */
    fun count(params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AirspaceControlOrderCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of AirspaceControlOrder records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: AirspaceControlOrderCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: AirspaceControlOrderCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): AirspaceControlOrderQueryHelpResponse = queryHelp(AirspaceControlOrderQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirspaceControlOrderQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none()): AirspaceControlOrderQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): AirspaceControlOrderQueryHelpResponse =
        queryHelp(
          AirspaceControlOrderQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirspaceControlOrderTupleParams): List<AirspacecontrolorderFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirspaceControlOrderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirspacecontrolorderFull>

    /** A view of [AirspaceControlOrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airspacecontrolorder`, but is otherwise the same as [AirspaceControlOrderService.create]. */
        @MustBeClosed
        fun create(params: AirspaceControlOrderCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirspaceControlOrderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airspacecontrolorder/{id}`, but is otherwise the same as [AirspaceControlOrderService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirspacecontrolorderFull> =
            retrieve(
              id, AirspaceControlOrderRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirspacecontrolorderFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none()): HttpResponseFor<AirspacecontrolorderFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirspaceControlOrderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirspacecontrolorderFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirspaceControlOrderRetrieveParams): HttpResponseFor<AirspacecontrolorderFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirspacecontrolorderFull> =
            retrieve(
              id,
              AirspaceControlOrderRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airspacecontrolorder`, but is otherwise the same as [AirspaceControlOrderService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AirspaceControlOrderListPage> = list(AirspaceControlOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirspaceControlOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none()): HttpResponseFor<AirspaceControlOrderListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirspaceControlOrderListPage> =
            list(
              AirspaceControlOrderListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airspacecontrolorder/count`, but is otherwise the same as [AirspaceControlOrderService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AirspaceControlOrderCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AirspaceControlOrderCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/airspacecontrolorder/createBulk`, but is otherwise the same as [AirspaceControlOrderService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: AirspaceControlOrderCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: AirspaceControlOrderCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airspacecontrolorder/queryhelp`, but is otherwise the same as [AirspaceControlOrderService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<AirspaceControlOrderQueryHelpResponse> = queryHelp(AirspaceControlOrderQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirspaceControlOrderQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none()): HttpResponseFor<AirspaceControlOrderQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<AirspaceControlOrderQueryHelpResponse> =
            queryHelp(
              AirspaceControlOrderQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airspacecontrolorder/tuple`, but is otherwise the same as [AirspaceControlOrderService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirspaceControlOrderTupleParams): HttpResponseFor<List<AirspacecontrolorderFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirspaceControlOrderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirspacecontrolorderFull>>
    }
}
