// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.equipment.EquipmentCountParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateBulkParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateParams
import com.unifieddatalibrary.api.models.equipment.EquipmentDeleteParams
import com.unifieddatalibrary.api.models.equipment.EquipmentFull
import com.unifieddatalibrary.api.models.equipment.EquipmentListPageAsync
import com.unifieddatalibrary.api.models.equipment.EquipmentListParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpParams
import com.unifieddatalibrary.api.models.equipment.EquipmentQueryHelpResponse
import com.unifieddatalibrary.api.models.equipment.EquipmentRetrieveParams
import com.unifieddatalibrary.api.models.equipment.EquipmentTupleParams
import com.unifieddatalibrary.api.models.equipment.EquipmentUpdateParams
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EquipmentServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentServiceAsync

    /** Service operation to take a single equipment record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: EquipmentCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EquipmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to get a single equipment record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<EquipmentFull> =
        retrieve(
          id, EquipmentRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentFull> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EquipmentRetrieveParams = EquipmentRetrieveParams.none()): CompletableFuture<EquipmentFull> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EquipmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentFull>

    /** @see retrieve */
    fun retrieve(params: EquipmentRetrieveParams): CompletableFuture<EquipmentFull> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EquipmentFull> =
        retrieve(
          id,
          EquipmentRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to update a single equipment record. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: EquipmentUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: EquipmentUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: EquipmentUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: EquipmentUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<EquipmentListPageAsync> = list(EquipmentListParams.none())

    /** @see list */
    fun list(params: EquipmentListParams = EquipmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentListPageAsync>

    /** @see list */
    fun list(params: EquipmentListParams = EquipmentListParams.none()): CompletableFuture<EquipmentListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EquipmentListPageAsync> =
        list(
          EquipmentListParams.none(), requestOptions
        )

    /** Service operation to delete a equipment record specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, EquipmentDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: EquipmentDeleteParams = EquipmentDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: EquipmentDeleteParams = EquipmentDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: EquipmentDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EquipmentDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          EquipmentDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(EquipmentCountParams.none())

    /** @see count */
    fun count(params: EquipmentCountParams = EquipmentCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: EquipmentCountParams = EquipmentCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          EquipmentCountParams.none(), requestOptions
        )

    /** Service operation intended for initial integration only, to take a list of Equipment records as a POST body and ingest into the database. This operation is not intended to be used for automated feeds into UDL. Data providers should contact the UDL team for specific role assignments and for instructions on setting up a permanent feed through an alternate mechanism. */
    fun createBulk(params: EquipmentCreateBulkParams): CompletableFuture<Void?> =
        createBulk(
          params, RequestOptions.none()
        )

    /** @see createBulk */
    fun createBulk(params: EquipmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<EquipmentQueryHelpResponse> = queryHelp(EquipmentQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EquipmentQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none()): CompletableFuture<EquipmentQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<EquipmentQueryHelpResponse> =
        queryHelp(
          EquipmentQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: EquipmentTupleParams): CompletableFuture<List<EquipmentFull>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: EquipmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<EquipmentFull>>

    /** A view of [EquipmentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EquipmentServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/equipment`, but is otherwise the same as [EquipmentServiceAsync.create]. */
        fun create(params: EquipmentCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: EquipmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/equipment/{id}`, but is otherwise the same as [EquipmentServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EquipmentFull>> =
            retrieve(
              id, EquipmentRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EquipmentRetrieveParams = EquipmentRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentFull>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EquipmentRetrieveParams = EquipmentRetrieveParams.none()): CompletableFuture<HttpResponseFor<EquipmentFull>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: EquipmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentFull>>

        /** @see retrieve */
        fun retrieve(params: EquipmentRetrieveParams): CompletableFuture<HttpResponseFor<EquipmentFull>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentFull>> =
            retrieve(
              id,
              EquipmentRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `put /udl/equipment/{id}`, but is otherwise the same as [EquipmentServiceAsync.update]. */
        fun update(pathId: String, params: EquipmentUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: EquipmentUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: EquipmentUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: EquipmentUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/equipment`, but is otherwise the same as [EquipmentServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<EquipmentListPageAsync>> = list(EquipmentListParams.none())

        /** @see list */
        fun list(params: EquipmentListParams = EquipmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentListPageAsync>>

        /** @see list */
        fun list(params: EquipmentListParams = EquipmentListParams.none()): CompletableFuture<HttpResponseFor<EquipmentListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentListPageAsync>> =
            list(
              EquipmentListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/equipment/{id}`, but is otherwise the same as [EquipmentServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, EquipmentDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: EquipmentDeleteParams = EquipmentDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: EquipmentDeleteParams = EquipmentDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: EquipmentDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EquipmentDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              EquipmentDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/equipment/count`, but is otherwise the same as [EquipmentServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(EquipmentCountParams.none())

        /** @see count */
        fun count(params: EquipmentCountParams = EquipmentCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: EquipmentCountParams = EquipmentCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              EquipmentCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /udl/equipment/createBulk`, but is otherwise the same as [EquipmentServiceAsync.createBulk]. */
        fun createBulk(params: EquipmentCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(
              params, RequestOptions.none()
            )

        /** @see createBulk */
        fun createBulk(params: EquipmentCreateBulkParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/equipment/queryhelp`, but is otherwise the same as [EquipmentServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EquipmentQueryHelpResponse>> = queryHelp(EquipmentQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EquipmentQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: EquipmentQueryHelpParams = EquipmentQueryHelpParams.none()): CompletableFuture<HttpResponseFor<EquipmentQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EquipmentQueryHelpResponse>> =
            queryHelp(
              EquipmentQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/equipment/tuple`, but is otherwise the same as [EquipmentServiceAsync.tuple]. */
        fun tuple(params: EquipmentTupleParams): CompletableFuture<HttpResponseFor<List<EquipmentFull>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: EquipmentTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<EquipmentFull>>>
    }
}
