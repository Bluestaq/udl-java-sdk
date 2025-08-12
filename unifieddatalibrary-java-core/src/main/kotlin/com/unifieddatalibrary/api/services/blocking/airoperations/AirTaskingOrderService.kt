// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirTaskingOrderFull
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCountParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCreateParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListPage
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderListParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderRetrieveParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderTupleParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderService
import java.util.function.Consumer

interface AirTaskingOrderService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderService

    /** Service operation to take a single airtaskingorder record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: AirTaskingOrderCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: AirTaskingOrderCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single airtaskingorder record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): AirTaskingOrderFull =
        retrieve(
          id, AirTaskingOrderRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirTaskingOrderFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none()): AirTaskingOrderFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: AirTaskingOrderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AirTaskingOrderFull

    /** @see retrieve */
    fun retrieve(params: AirTaskingOrderRetrieveParams): AirTaskingOrderFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirTaskingOrderFull =
        retrieve(
          id,
          AirTaskingOrderRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): AirTaskingOrderListPage = list(AirTaskingOrderListParams.none())

    /** @see list */
    fun list(params: AirTaskingOrderListParams = AirTaskingOrderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirTaskingOrderListPage

    /** @see list */
    fun list(params: AirTaskingOrderListParams = AirTaskingOrderListParams.none()): AirTaskingOrderListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): AirTaskingOrderListPage =
        list(
          AirTaskingOrderListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(AirTaskingOrderCountParams.none())

    /** @see count */
    fun count(params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          AirTaskingOrderCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): AirTaskingOrderQueryHelpResponse = queryHelp(AirTaskingOrderQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AirTaskingOrderQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none()): AirTaskingOrderQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): AirTaskingOrderQueryHelpResponse =
        queryHelp(
          AirTaskingOrderQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: AirTaskingOrderTupleParams): List<AirTaskingOrderFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: AirTaskingOrderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<AirTaskingOrderFull>

    /** Service operation to take multiple airtaskingorder records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AirTaskingOrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirTaskingOrderService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/airtaskingorder`, but is otherwise the same as [AirTaskingOrderService.create]. */
        @MustBeClosed
        fun create(params: AirTaskingOrderCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AirTaskingOrderCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/airtaskingorder/{id}`, but is otherwise the same as [AirTaskingOrderService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirTaskingOrderFull> =
            retrieve(
              id, AirTaskingOrderRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTaskingOrderFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: AirTaskingOrderRetrieveParams = AirTaskingOrderRetrieveParams.none()): HttpResponseFor<AirTaskingOrderFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirTaskingOrderRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTaskingOrderFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirTaskingOrderRetrieveParams): HttpResponseFor<AirTaskingOrderFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AirTaskingOrderFull> =
            retrieve(
              id,
              AirTaskingOrderRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/airtaskingorder`, but is otherwise the same as [AirTaskingOrderService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<AirTaskingOrderListPage> = list(AirTaskingOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: AirTaskingOrderListParams = AirTaskingOrderListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTaskingOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AirTaskingOrderListParams = AirTaskingOrderListParams.none()): HttpResponseFor<AirTaskingOrderListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirTaskingOrderListPage> =
            list(
              AirTaskingOrderListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airtaskingorder/count`, but is otherwise the same as [AirTaskingOrderService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(AirTaskingOrderCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: AirTaskingOrderCountParams = AirTaskingOrderCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              AirTaskingOrderCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airtaskingorder/queryhelp`, but is otherwise the same as [AirTaskingOrderService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<AirTaskingOrderQueryHelpResponse> = queryHelp(AirTaskingOrderQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AirTaskingOrderQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: AirTaskingOrderQueryHelpParams = AirTaskingOrderQueryHelpParams.none()): HttpResponseFor<AirTaskingOrderQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<AirTaskingOrderQueryHelpResponse> =
            queryHelp(
              AirTaskingOrderQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/airtaskingorder/tuple`, but is otherwise the same as [AirTaskingOrderService.tuple]. */
        @MustBeClosed
        fun tuple(params: AirTaskingOrderTupleParams): HttpResponseFor<List<AirTaskingOrderFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: AirTaskingOrderTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<AirTaskingOrderFull>>

        /** Returns a raw HTTP response for `post /filedrop/udl-airtaskingorder`, but is otherwise the same as [AirTaskingOrderService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: AirTaskingOrderUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
