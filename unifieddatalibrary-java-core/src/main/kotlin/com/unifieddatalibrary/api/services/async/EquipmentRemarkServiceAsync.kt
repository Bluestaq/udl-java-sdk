// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateBulkParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkFull
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListPageAsync
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkListParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpResponse
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkRetrieveParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkTupleParams
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EquipmentRemarkServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkServiceAsync

    /** Service operation to take a single equipmentremark record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EquipmentRemarkCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single equipmentremark record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<EquipmentRemarkFull> =
        retrieve(
          id, EquipmentRemarkRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentRemarkFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none()): CompletableFuture<EquipmentRemarkFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentRemarkFull>

    /** @see retrieve */
    fun retrieve(params: EquipmentRemarkRetrieveParams): CompletableFuture<EquipmentRemarkFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EquipmentRemarkFull> =
        retrieve(
          id,
          EquipmentRemarkRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<EquipmentRemarkListPageAsync> = list(EquipmentRemarkListParams.none())

    /** @see list */
    fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentRemarkListPageAsync>

    /** @see list */
    fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none()): CompletableFuture<EquipmentRemarkListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EquipmentRemarkListPageAsync> =
        list(
          EquipmentRemarkListParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(EquipmentRemarkCountParams.none())

    /** @see count */
    fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          EquipmentRemarkCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of equipmentremark records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EquipmentRemarkCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<EquipmentRemarkQueryHelpResponse> = queryHelp(EquipmentRemarkQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentRemarkQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none()): CompletableFuture<EquipmentRemarkQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<EquipmentRemarkQueryHelpResponse> =
        queryHelp(
          EquipmentRemarkQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EquipmentRemarkTupleParams): CompletableFuture<List<EquipmentRemarkFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<EquipmentRemarkFull>>

    /** A view of [EquipmentRemarkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentRemarkServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/equipmentremark`, but is otherwise the same as [EquipmentRemarkServiceAsync.create]. */
        fun create(params: EquipmentRemarkCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: EquipmentRemarkCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/equipmentremark/{id}`, but is otherwise the same as [EquipmentRemarkServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>> =
            retrieve(
              id, EquipmentRemarkRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EquipmentRemarkRetrieveParams = EquipmentRemarkRetrieveParams.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: EquipmentRemarkRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>>

        /** @see retrieve */
        fun retrieve(params: EquipmentRemarkRetrieveParams): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentRemarkFull>> =
            retrieve(
              id,
              EquipmentRemarkRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark`, but is otherwise the same as [EquipmentRemarkServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<EquipmentRemarkListPageAsync>> = list(EquipmentRemarkListParams.none())

        /** @see list */
        fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkListPageAsync>>

        /** @see list */
        fun list(params: EquipmentRemarkListParams = EquipmentRemarkListParams.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentRemarkListPageAsync>> =
            list(
              EquipmentRemarkListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark/count`, but is otherwise the same as [EquipmentRemarkServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(EquipmentRemarkCountParams.none())

        /** @see count */
        fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: EquipmentRemarkCountParams = EquipmentRemarkCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              EquipmentRemarkCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/equipmentremark/createBulk`, but is otherwise the same as [EquipmentRemarkServiceAsync.createBulk]. */
        fun createBulk(params: EquipmentRemarkCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: EquipmentRemarkCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/equipmentremark/queryhelp`, but is otherwise the same as [EquipmentRemarkServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EquipmentRemarkQueryHelpResponse>> = queryHelp(EquipmentRemarkQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: EquipmentRemarkQueryHelpParams = EquipmentRemarkQueryHelpParams.none()): CompletableFuture<HttpResponseFor<EquipmentRemarkQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentRemarkQueryHelpResponse>> =
            queryHelp(
              EquipmentRemarkQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/equipmentremark/tuple`, but is otherwise the same as [EquipmentRemarkServiceAsync.tuple]. */
        fun tuple(params: EquipmentRemarkTupleParams): CompletableFuture<HttpResponseFor<List<EquipmentRemarkFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: EquipmentRemarkTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<EquipmentRemarkFull>>>
    }
}
