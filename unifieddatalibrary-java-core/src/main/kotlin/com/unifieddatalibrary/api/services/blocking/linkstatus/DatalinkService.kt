// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.linkstatus

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCountParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCreateParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListPage
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.linkstatus.DatalinkService
import java.util.function.Consumer

interface DatalinkService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkService

    /** Service operation to take a single DataLink record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: DatalinkCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: DatalinkCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: DatalinkListParams): DatalinkListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: DatalinkListParams, requestOptions: RequestOptions = RequestOptions.none()): DatalinkListPage

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: DatalinkCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: DatalinkCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): DatalinkQueryhelpResponse = queryhelp(DatalinkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): DatalinkQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none()): DatalinkQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): DatalinkQueryhelpResponse =
        queryhelp(
          DatalinkQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: DatalinkTupleParams): List<DatalinkTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<DatalinkTupleResponse>

    /** Service operation to take multiple datalink records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [DatalinkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/datalink`, but is otherwise the same as [DatalinkService.create]. */
        @MustBeClosed
        fun create(params: DatalinkCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: DatalinkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/datalink`, but is otherwise the same as [DatalinkService.list]. */
        @MustBeClosed
        fun list(params: DatalinkListParams): HttpResponseFor<DatalinkListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(params: DatalinkListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DatalinkListPage>

        /** Returns a raw HTTP response for `get /udl/datalink/count`, but is otherwise the same as [DatalinkService.count]. */
        @MustBeClosed
        fun count(params: DatalinkCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: DatalinkCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/datalink/queryhelp`, but is otherwise the same as [DatalinkService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<DatalinkQueryhelpResponse> = queryhelp(DatalinkQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DatalinkQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none()): HttpResponseFor<DatalinkQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<DatalinkQueryhelpResponse> =
            queryhelp(
              DatalinkQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/datalink/tuple`, but is otherwise the same as [DatalinkService.tuple]. */
        @MustBeClosed
        fun tuple(params: DatalinkTupleParams): HttpResponseFor<List<DatalinkTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: DatalinkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<DatalinkTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-datalink`, but is otherwise the same as [DatalinkService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}
