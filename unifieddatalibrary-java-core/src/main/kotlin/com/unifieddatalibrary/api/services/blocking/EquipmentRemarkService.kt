// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateBulkParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkFull
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListPage
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpResponse
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkRetrieveParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkTupleParams
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import java.util.function.Consumer

interface EquipmentRemarkService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkService

    /** Service operation to take a single equipmentremark record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EquipmentRemarkCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to get a single equipmentremark record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): EquipmentRemarkFull =
        retrieve(
          id, EquipmentRemarkRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EquipmentRemarkFull =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none()): EquipmentRemarkFull =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EquipmentRemarkFull

    /** @see retrieve */
    fun retrieve(params: EquipmentRemarkRetrieveParams): EquipmentRemarkFull =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EquipmentRemarkFull =
        retrieve(
          id,
          EquipmentRemarkRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): EquipmentRemarkListPage = list(EquipmentRemarkListParams.none())

    /** @see list */
    fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EquipmentRemarkListPage

    /** @see list */
    fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none()): EquipmentRemarkListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): EquipmentRemarkListPage =
        list(
          EquipmentRemarkListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(EquipmentRemarkCountParams.none())

    /** @see count */
    fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          EquipmentRemarkCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of equipmentremark records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EquipmentRemarkCreateBulkParams) =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): EquipmentRemarkQueryHelpResponse = queryHelp(EquipmentRemarkQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EquipmentRemarkQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none()): EquipmentRemarkQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): EquipmentRemarkQueryHelpResponse =
        queryHelp(
          EquipmentRemarkQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EquipmentRemarkTupleParams): List<EquipmentRemarkFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<EquipmentRemarkFull>

    /** A view of [EquipmentRemarkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/equipmentremark`, but is otherwise the same as [EquipmentRemarkService.create]. */
        @MustBeClosed
        fun create(params: EquipmentRemarkCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/equipmentremark/{id}`, but is otherwise the same as [EquipmentRemarkService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EquipmentRemarkFull> =
            retrieve(
              id, EquipmentRemarkRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EquipmentRemarkFull> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none()): HttpResponseFor<EquipmentRemarkFull> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EquipmentRemarkFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EquipmentRemarkRetrieveParams): HttpResponseFor<EquipmentRemarkFull> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkFull> =
            retrieve(
              id,
              EquipmentRemarkRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark`, but is otherwise the same as [EquipmentRemarkService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<EquipmentRemarkListPage> = list(EquipmentRemarkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EquipmentRemarkListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none()): HttpResponseFor<EquipmentRemarkListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkListPage> =
            list(
              EquipmentRemarkListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark/count`, but is otherwise the same as [EquipmentRemarkService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(EquipmentRemarkCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              EquipmentRemarkCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/equipmentremark/createBulk`, but is otherwise the same as [EquipmentRemarkService.createBulk]. */
        @MustBeClosed
        fun createBulk(params: EquipmentRemarkCreateBulkParams): HttpResponse =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/equipmentremark/queryhelp`, but is otherwise the same as [EquipmentRemarkService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<EquipmentRemarkQueryHelpResponse> = queryHelp(EquipmentRemarkQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EquipmentRemarkQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none()): HttpResponseFor<EquipmentRemarkQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<EquipmentRemarkQueryHelpResponse> =
            queryHelp(
              EquipmentRemarkQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark/tuple`, but is otherwise the same as [EquipmentRemarkService.tuple]. */
        @MustBeClosed
        fun tuple(params: EquipmentRemarkTupleParams): HttpResponseFor<List<EquipmentRemarkFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<EquipmentRemarkFull>>
    }
}
