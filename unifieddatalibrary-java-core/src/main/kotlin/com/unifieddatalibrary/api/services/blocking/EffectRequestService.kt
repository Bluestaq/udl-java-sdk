// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCountParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListPage
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestQueryHelpParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestQueryHelpResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestRetrieveParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestRetrieveResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestTupleParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestTupleResponse
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import com.unifieddatalibrary.api.services.blocking.effectrequests.HistoryService
import java.util.function.Consumer

interface EffectRequestService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectRequestService

    fun history(): HistoryService

    /** Service operation to take a single EffectRequest as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: EffectRequestCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EffectRequestCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EffectRequest by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EffectRequestRetrieveResponse =
        retrieve(
          id, EffectRequestRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EffectRequestRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none()): EffectRequestRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EffectRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EffectRequestRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EffectRequestRetrieveParams): EffectRequestRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EffectRequestRetrieveResponse =
        retrieve(
          id,
          EffectRequestRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: EffectRequestListParams): EffectRequestListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: EffectRequestListParams, requestOptions: RequestOptions = RequestOptions.none()): EffectRequestListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: EffectRequestCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: EffectRequestCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of EffectRequest records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EffectRequestCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EffectRequestCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): EffectRequestQueryHelpResponse = queryHelp(EffectRequestQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EffectRequestQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none()): EffectRequestQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EffectRequestQueryHelpResponse =
        queryHelp(
          EffectRequestQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EffectRequestTupleParams): List<EffectRequestTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EffectRequestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<EffectRequestTupleResponse>

    /** Service operation to take multiple EffectRequests as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: EffectRequestUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EffectRequestUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EffectRequestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectRequestService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/effectrequest`, but is otherwise the same as [EffectRequestService.create]. */
        @MustBeClosed
        fun create(params: EffectRequestCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EffectRequestCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/effectrequest/{id}`, but is otherwise the same as [EffectRequestService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EffectRequestRetrieveResponse> =
            retrieve(
              id, EffectRequestRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectRequestRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EffectRequestRetrieveParams = EffectRequestRetrieveParams.none()): HttpResponseFor<EffectRequestRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EffectRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectRequestRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EffectRequestRetrieveParams): HttpResponseFor<EffectRequestRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EffectRequestRetrieveResponse> =
            retrieve(
              id,
              EffectRequestRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/effectrequest`, but is otherwise the same as [EffectRequestService.list]. */
        @MustBeClosed
        fun list(params: EffectRequestListParams): HttpResponseFor<EffectRequestListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: EffectRequestListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectRequestListPage>

        /** Returns a raw HTTP response for `get /udl/effectrequest/count`, but is otherwise the same as [EffectRequestService.count]. */
        @MustBeClosed
        fun count(params: EffectRequestCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: EffectRequestCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/effectrequest/createBulk`, but is otherwise the same as [EffectRequestService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: EffectRequestCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: EffectRequestCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/effectrequest/queryhelp`, but is otherwise the same as [EffectRequestService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EffectRequestQueryHelpResponse> = queryHelp(EffectRequestQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectRequestQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EffectRequestQueryHelpParams = EffectRequestQueryHelpParams.none()): HttpResponseFor<EffectRequestQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EffectRequestQueryHelpResponse> =
            queryHelp(
              EffectRequestQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/effectrequest/tuple`, but is otherwise the same as [EffectRequestService.tuple]. */
        @MustBeClosed
        fun tuple(params: EffectRequestTupleParams): HttpResponseFor<List<EffectRequestTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: EffectRequestTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<EffectRequestTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-effectrequest`, but is otherwise the same as [EffectRequestService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: EffectRequestUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: EffectRequestUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
