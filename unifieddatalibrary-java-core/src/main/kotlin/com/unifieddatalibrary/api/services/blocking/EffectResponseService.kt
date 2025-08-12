// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCountParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListPage
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleResponse
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.EffectResponseService
import com.unifieddatalibrary.api.services.blocking.effectresponses.HistoryService
import java.util.function.Consumer

interface EffectResponseService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseService

    fun history(): HistoryService

    /** Service operation to take a single EffectResponse as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun create(params: EffectResponseCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EffectResponseCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single EffectResponse by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EffectResponseRetrieveResponse =
        retrieve(
          id, EffectResponseRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EffectResponseRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none()): EffectResponseRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EffectResponseRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EffectResponseRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EffectResponseRetrieveParams): EffectResponseRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EffectResponseRetrieveResponse =
        retrieve(
          id,
          EffectResponseRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: EffectResponseListParams): EffectResponseListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: EffectResponseListParams, requestOptions: RequestOptions = RequestOptions.none()): EffectResponseListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: EffectResponseCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: EffectResponseCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation intended for initial integration only, to take a list of EffectResponse records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EffectResponseCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EffectResponseCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): EffectResponseQueryHelpResponse = queryHelp(EffectResponseQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EffectResponseQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none()): EffectResponseQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EffectResponseQueryHelpResponse =
        queryHelp(
          EffectResponseQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EffectResponseTupleParams): List<EffectResponseTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EffectResponseTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<EffectResponseTupleResponse>

    /** Service operation to take multiple EffectResponses as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EffectResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EffectResponseService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/effectresponse`, but is otherwise the same as [EffectResponseService.create]. */
        @MustBeClosed
        fun create(params: EffectResponseCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EffectResponseCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/effectresponse/{id}`, but is otherwise the same as [EffectResponseService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EffectResponseRetrieveResponse> =
            retrieve(
              id, EffectResponseRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectResponseRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EffectResponseRetrieveParams = EffectResponseRetrieveParams.none()): HttpResponseFor<EffectResponseRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EffectResponseRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectResponseRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EffectResponseRetrieveParams): HttpResponseFor<EffectResponseRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EffectResponseRetrieveResponse> =
            retrieve(
              id,
              EffectResponseRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/effectresponse`, but is otherwise the same as [EffectResponseService.list]. */
        @MustBeClosed
        fun list(params: EffectResponseListParams): HttpResponseFor<EffectResponseListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: EffectResponseListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectResponseListPage>

        /** Returns a raw HTTP response for `get /udl/effectresponse/count`, but is otherwise the same as [EffectResponseService.count]. */
        @MustBeClosed
        fun count(params: EffectResponseCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: EffectResponseCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `post /udl/effectresponse/createBulk`, but is otherwise the same as [EffectResponseService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: EffectResponseCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: EffectResponseCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/effectresponse/queryhelp`, but is otherwise the same as [EffectResponseService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EffectResponseQueryHelpResponse> = queryHelp(EffectResponseQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EffectResponseQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EffectResponseQueryHelpParams = EffectResponseQueryHelpParams.none()): HttpResponseFor<EffectResponseQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EffectResponseQueryHelpResponse> =
            queryHelp(
              EffectResponseQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/effectresponse/tuple`, but is otherwise the same as [EffectResponseService.tuple]. */
        @MustBeClosed
        fun tuple(params: EffectResponseTupleParams): HttpResponseFor<List<EffectResponseTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: EffectResponseTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<EffectResponseTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-effectresponse`, but is otherwise the same as [EffectResponseService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: EffectResponseUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
