// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.item.ItemCountParams
import com.unifieddatalibrary.api.models.item.ItemCreateParams
import com.unifieddatalibrary.api.models.item.ItemDeleteParams
import com.unifieddatalibrary.api.models.item.ItemGetParams
import com.unifieddatalibrary.api.models.item.ItemGetResponse
import com.unifieddatalibrary.api.models.item.ItemListPage
import com.unifieddatalibrary.api.models.item.ItemListParams
import com.unifieddatalibrary.api.models.item.ItemQueryhelpParams
import com.unifieddatalibrary.api.models.item.ItemQueryhelpResponse
import com.unifieddatalibrary.api.models.item.ItemTupleParams
import com.unifieddatalibrary.api.models.item.ItemTupleResponse
import com.unifieddatalibrary.api.models.item.ItemUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.item.ItemUpdateParams
import java.util.function.Consumer

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService

    /**
     * Service operation to take a single item record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: ItemCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single Item. An Item can be cargo, equipment, or a passenger. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun update(pathId: String, params: ItemUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): ItemListPage = list(ItemListParams.none())

    /** @see list */
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPage

    /** @see list */
    fun list(params: ItemListParams = ItemListParams.none()): ItemListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ItemListPage =
        list(ItemListParams.none(), requestOptions)

    /**
     * Service operation to delete a item record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, ItemDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ItemDeleteParams = ItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ItemDeleteParams = ItemDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ItemDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ItemDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(ItemCountParams.none())

    /** @see count */
    fun count(
        params: ItemCountParams = ItemCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: ItemCountParams = ItemCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(ItemCountParams.none(), requestOptions)

    /**
     * Service operation to get a single item record by its unique ID passed as a path parameter.
     */
    fun get(id: String): ItemGetResponse = get(id, ItemGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ItemGetParams = ItemGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: ItemGetParams = ItemGetParams.none()): ItemGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ItemGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemGetResponse

    /** @see get */
    fun get(params: ItemGetParams): ItemGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ItemGetResponse =
        get(id, ItemGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): ItemQueryhelpResponse = queryhelp(ItemQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ItemQueryhelpParams = ItemQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: ItemQueryhelpParams = ItemQueryhelpParams.none()): ItemQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ItemQueryhelpResponse =
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
    fun tuple(params: ItemTupleParams): List<ItemTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ItemTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ItemTupleResponse>

    /**
     * Service operation to take multiple item records as a POST body and ingest into the database.
     * This operation is intended to be used for automated feeds into UDL. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: ItemUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ItemUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/item`, but is otherwise the same as
         * [ItemService.create].
         */
        @MustBeClosed
        fun create(params: ItemCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/item/{id}`, but is otherwise the same as
         * [ItemService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: ItemUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ItemUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/item`, but is otherwise the same as
         * [ItemService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ItemListPage> = list(ItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ItemListParams = ItemListParams.none()): HttpResponseFor<ItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ItemListPage> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/item/{id}`, but is otherwise the same as
         * [ItemService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, ItemDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ItemDeleteParams = ItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: ItemDeleteParams = ItemDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ItemDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ItemDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/count`, but is otherwise the same as
         * [ItemService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(ItemCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: ItemCountParams = ItemCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: ItemCountParams = ItemCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(ItemCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/{id}`, but is otherwise the same as
         * [ItemService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ItemGetResponse> = get(id, ItemGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ItemGetParams = ItemGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ItemGetParams = ItemGetParams.none(),
        ): HttpResponseFor<ItemGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ItemGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ItemGetParams): HttpResponseFor<ItemGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ItemGetResponse> =
            get(id, ItemGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/queryhelp`, but is otherwise the same as
         * [ItemService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ItemQueryhelpResponse> =
            queryhelp(ItemQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ItemQueryhelpParams = ItemQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ItemQueryhelpParams = ItemQueryhelpParams.none()
        ): HttpResponseFor<ItemQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ItemQueryhelpResponse> =
            queryhelp(ItemQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/item/tuple`, but is otherwise the same as
         * [ItemService.tuple].
         */
        @MustBeClosed
        fun tuple(params: ItemTupleParams): HttpResponseFor<List<ItemTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: ItemTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ItemTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-item`, but is otherwise the same as
         * [ItemService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: ItemUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: ItemUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
