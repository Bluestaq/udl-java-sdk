// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCountParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCreateParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingDeleteParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingGetParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingGetResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListPageAsync
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingQueryhelpParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingQueryhelpResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingTupleParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingTupleResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import com.unifieddatalibrary.api.services.async.itemtrackings.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ItemTrackingServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemTrackingServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to take a single itemtracking record as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: ItemTrackingCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ItemTrackingCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(params: ItemTrackingListParams): CompletableFuture<ItemTrackingListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(params: ItemTrackingListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ItemTrackingListPageAsync>

    /** Service operation to delete an item tracking object specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, ItemTrackingDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: ItemTrackingDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ItemTrackingDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          ItemTrackingDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: ItemTrackingCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: ItemTrackingCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to get a single item tracking record by its unique ID passed as a path parameter. */
    fun get(id: String): CompletableFuture<ItemTrackingGetResponse> =
        get(
          id, ItemTrackingGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: ItemTrackingGetParams = ItemTrackingGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ItemTrackingGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: ItemTrackingGetParams = ItemTrackingGetParams.none()): CompletableFuture<ItemTrackingGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: ItemTrackingGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ItemTrackingGetResponse>

    /** @see get */
    fun get(params: ItemTrackingGetParams): CompletableFuture<ItemTrackingGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ItemTrackingGetResponse> =
        get(
          id,
          ItemTrackingGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<ItemTrackingQueryhelpResponse> = queryhelp(ItemTrackingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ItemTrackingQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none()): CompletableFuture<ItemTrackingQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ItemTrackingQueryhelpResponse> =
        queryhelp(
          ItemTrackingQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: ItemTrackingTupleParams): CompletableFuture<List<ItemTrackingTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: ItemTrackingTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ItemTrackingTupleResponse>>

    /** Service operation to take multiple itemtracking records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [ItemTrackingServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemTrackingServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/itemtracking`, but is otherwise the same as [ItemTrackingServiceAsync.create]. */
        fun create(params: ItemTrackingCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: ItemTrackingCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/itemtracking`, but is otherwise the same as [ItemTrackingServiceAsync.list]. */
        fun list(params: ItemTrackingListParams): CompletableFuture<HttpResponseFor<ItemTrackingListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(params: ItemTrackingListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ItemTrackingListPageAsync>>

        /** Returns a raw HTTP response for `delete /udl/itemtracking/{id}`, but is otherwise the same as [ItemTrackingServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, ItemTrackingDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: ItemTrackingDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ItemTrackingDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              ItemTrackingDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/itemtracking/count`, but is otherwise the same as [ItemTrackingServiceAsync.count]. */
        fun count(params: ItemTrackingCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: ItemTrackingCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/itemtracking/{id}`, but is otherwise the same as [ItemTrackingServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>> =
            get(
              id, ItemTrackingGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: ItemTrackingGetParams = ItemTrackingGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: ItemTrackingGetParams = ItemTrackingGetParams.none()): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: ItemTrackingGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>>

        /** @see get */
        fun get(params: ItemTrackingGetParams): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ItemTrackingGetResponse>> =
            get(
              id,
              ItemTrackingGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/itemtracking/queryhelp`, but is otherwise the same as [ItemTrackingServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ItemTrackingQueryhelpResponse>> = queryhelp(ItemTrackingQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ItemTrackingQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none()): CompletableFuture<HttpResponseFor<ItemTrackingQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ItemTrackingQueryhelpResponse>> =
            queryhelp(
              ItemTrackingQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/itemtracking/tuple`, but is otherwise the same as [ItemTrackingServiceAsync.tuple]. */
        fun tuple(params: ItemTrackingTupleParams): CompletableFuture<HttpResponseFor<List<ItemTrackingTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: ItemTrackingTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ItemTrackingTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-itemtracking`, but is otherwise the same as [ItemTrackingServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
