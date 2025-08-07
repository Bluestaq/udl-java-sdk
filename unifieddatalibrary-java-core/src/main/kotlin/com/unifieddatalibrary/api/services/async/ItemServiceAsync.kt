// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.item.ItemCountParams
import com.unifieddatalibrary.api.models.item.ItemCreateParams
import com.unifieddatalibrary.api.models.item.ItemDeleteParams
import com.unifieddatalibrary.api.models.item.ItemGetParams
import com.unifieddatalibrary.api.models.item.ItemGetResponse
import com.unifieddatalibrary.api.models.item.ItemListPageAsync
import com.unifieddatalibrary.api.models.item.ItemListParams
import com.unifieddatalibrary.api.models.item.ItemQueryhelpParams
import com.unifieddatalibrary.api.models.item.ItemQueryhelpResponse
import com.unifieddatalibrary.api.models.item.ItemTupleParams
import com.unifieddatalibrary.api.models.item.ItemTupleResponse
import com.unifieddatalibrary.api.models.item.ItemUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.item.ItemUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    /**
     * Service operation to take a single item record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: ItemCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single Item. An Item can be cargo, equipment, or a passenger. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun update(pathId: String, params: ItemUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<ItemListPageAsync> = list(ItemListParams.none())

    /** @see list */
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemListPageAsync>

    /** @see list */
    fun list(params: ItemListParams = ItemListParams.none()): CompletableFuture<ItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ItemListPageAsync> =
        list(ItemListParams.none(), requestOptions)

    /**
     * Service operation to delete a item record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, ItemDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ItemDeleteParams = ItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ItemDeleteParams = ItemDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ItemDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ItemDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(ItemCountParams.none())

    /** @see count */
    fun count(
        params: ItemCountParams = ItemCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(params: ItemCountParams = ItemCountParams.none()): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(ItemCountParams.none(), requestOptions)

    /**
     * Service operation to get a single item record by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<ItemGetResponse> = get(id, ItemGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ItemGetParams = ItemGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ItemGetParams = ItemGetParams.none(),
    ): CompletableFuture<ItemGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ItemGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemGetResponse>

    /** @see get */
    fun get(params: ItemGetParams): CompletableFuture<ItemGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ItemGetResponse> =
        get(id, ItemGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<ItemQueryhelpResponse> =
        queryhelp(ItemQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ItemQueryhelpParams = ItemQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: ItemQueryhelpParams = ItemQueryhelpParams.none()
    ): CompletableFuture<ItemQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<ItemQueryhelpResponse> =
        queryhelp(ItemQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ItemTupleParams): CompletableFuture<List<ItemTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ItemTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ItemTupleResponse>>

    /**
     * Service operation to take multiple item records as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: ItemUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ItemUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/item`, but is otherwise the same as
         * [ItemServiceAsync.create].
         */
        fun create(params: ItemCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/item/{id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        fun update(pathId: String, params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/item`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(ItemListParams.none())

        /** @see list */
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>>

        /** @see list */
        fun list(
            params: ItemListParams = ItemListParams.none()
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/item/{id}`, but is otherwise the same as
         * [ItemServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ItemDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ItemDeleteParams = ItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ItemDeleteParams = ItemDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ItemDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/count`, but is otherwise the same as
         * [ItemServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(ItemCountParams.none())

        /** @see count */
        fun count(
            params: ItemCountParams = ItemCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: ItemCountParams = ItemCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(ItemCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/{id}`, but is otherwise the same as
         * [ItemServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<ItemGetResponse>> =
            get(id, ItemGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: ItemGetParams = ItemGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: ItemGetParams = ItemGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ItemGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ItemGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemGetResponse>>

        /** @see get */
        fun get(params: ItemGetParams): CompletableFuture<HttpResponseFor<ItemGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemGetResponse>> =
            get(id, ItemGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/queryhelp`, but is otherwise the same as
         * [ItemServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<ItemQueryhelpResponse>> =
            queryhelp(ItemQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: ItemQueryhelpParams = ItemQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: ItemQueryhelpParams = ItemQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<ItemQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ItemQueryhelpResponse>> =
            queryhelp(ItemQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/tuple`, but is otherwise the same as
         * [ItemServiceAsync.tuple].
         */
        fun tuple(
            params: ItemTupleParams
        ): CompletableFuture<HttpResponseFor<List<ItemTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: ItemTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ItemTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-item`, but is otherwise the same as
         * [ItemServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: ItemUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: ItemUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
