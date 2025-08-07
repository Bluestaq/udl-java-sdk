// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCountParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCreateParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingDeleteParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingGetParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingGetResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListPage
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingQueryhelpParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingQueryhelpResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingTupleParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingTupleResponse
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.itemtrackings.HistoryService
import java.util.function.Consumer

interface ItemTrackingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemTrackingService

    fun history(): HistoryService

    /**
     * Service operation to take a single itemtracking record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: ItemTrackingCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ItemTrackingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ItemTrackingListParams): ItemTrackingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ItemTrackingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemTrackingListPage

    /**
     * Service operation to delete an item tracking object specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, ItemTrackingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ItemTrackingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ItemTrackingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ItemTrackingDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ItemTrackingCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ItemTrackingCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to get a single item tracking record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): ItemTrackingGetResponse = get(id, ItemTrackingGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ItemTrackingGetParams = ItemTrackingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemTrackingGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ItemTrackingGetParams = ItemTrackingGetParams.none(),
    ): ItemTrackingGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ItemTrackingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemTrackingGetResponse

    /** @see get */
    fun get(params: ItemTrackingGetParams): ItemTrackingGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ItemTrackingGetResponse =
        get(id, ItemTrackingGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): ItemTrackingQueryhelpResponse = queryhelp(ItemTrackingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemTrackingQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none()
    ): ItemTrackingQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ItemTrackingQueryhelpResponse =
        queryhelp(ItemTrackingQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ItemTrackingTupleParams): List<ItemTrackingTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ItemTrackingTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ItemTrackingTupleResponse>

    /**
     * Service operation to take multiple itemtracking records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ItemTrackingUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ItemTrackingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ItemTrackingService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/itemtracking`, but is otherwise the same as
         * [ItemTrackingService.create].
         */
        @MustBeClosed
        fun create(params: ItemTrackingCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ItemTrackingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/itemtracking`, but is otherwise the same as
         * [ItemTrackingService.list].
         */
        @MustBeClosed
        fun list(params: ItemTrackingListParams): HttpResponseFor<ItemTrackingListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ItemTrackingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemTrackingListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/itemtracking/{id}`, but is otherwise the
         * same as [ItemTrackingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, ItemTrackingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ItemTrackingDeleteParams = ItemTrackingDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ItemTrackingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ItemTrackingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ItemTrackingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/itemtracking/count`, but is otherwise the same
         * as [ItemTrackingService.count].
         */
        @MustBeClosed
        fun count(params: ItemTrackingCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: ItemTrackingCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/itemtracking/{id}`, but is otherwise the same
         * as [ItemTrackingService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ItemTrackingGetResponse> =
            get(id, ItemTrackingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ItemTrackingGetParams = ItemTrackingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemTrackingGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ItemTrackingGetParams = ItemTrackingGetParams.none(),
        ): HttpResponseFor<ItemTrackingGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ItemTrackingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemTrackingGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ItemTrackingGetParams): HttpResponseFor<ItemTrackingGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemTrackingGetResponse> =
            get(id, ItemTrackingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/itemtracking/queryhelp`, but is otherwise the
         * same as [ItemTrackingService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ItemTrackingQueryhelpResponse> =
            queryhelp(ItemTrackingQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemTrackingQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ItemTrackingQueryhelpParams = ItemTrackingQueryhelpParams.none()
        ): HttpResponseFor<ItemTrackingQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<ItemTrackingQueryhelpResponse> =
            queryhelp(ItemTrackingQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/itemtracking/tuple`, but is otherwise the same
         * as [ItemTrackingService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: ItemTrackingTupleParams
        ): HttpResponseFor<List<ItemTrackingTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: ItemTrackingTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ItemTrackingTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-itemtracking`, but is otherwise the
         * same as [ItemTrackingService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: ItemTrackingUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: ItemTrackingUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
