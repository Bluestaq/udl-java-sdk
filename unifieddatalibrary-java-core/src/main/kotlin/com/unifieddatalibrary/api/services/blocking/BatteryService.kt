// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BatteryFull
import com.unifieddatalibrary.api.models.BatteryIngest
import com.unifieddatalibrary.api.models.batteries.BatteryCountParams
import com.unifieddatalibrary.api.models.batteries.BatteryCreateParams
import com.unifieddatalibrary.api.models.batteries.BatteryDeleteParams
import com.unifieddatalibrary.api.models.batteries.BatteryListPage
import com.unifieddatalibrary.api.models.batteries.BatteryListParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpParams
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpResponse
import com.unifieddatalibrary.api.models.batteries.BatteryRetrieveParams
import com.unifieddatalibrary.api.models.batteries.BatteryTupleParams
import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import java.util.function.Consumer

interface BatteryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatteryService

    /**
     * Service operation to take a single Battery as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BatteryCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: BatteryCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see create */
    fun create(
        batteryIngest: BatteryIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(BatteryCreateParams.builder().batteryIngest(batteryIngest).build(), requestOptions)

    /** @see create */
    fun create(batteryIngest: BatteryIngest) = create(batteryIngest, RequestOptions.none())

    /**
     * Service operation to get a single Battery record by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): BatteryFull = retrieve(id, BatteryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatteryRetrieveParams = BatteryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatteryFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatteryRetrieveParams = BatteryRetrieveParams.none(),
    ): BatteryFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatteryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatteryFull

    /** @see retrieve */
    fun retrieve(params: BatteryRetrieveParams): BatteryFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BatteryFull =
        retrieve(id, BatteryRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Battery. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BatteryUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BatteryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BatteryUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: BatteryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): BatteryListPage = list(BatteryListParams.none())

    /** @see list */
    fun list(
        params: BatteryListParams = BatteryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatteryListPage

    /** @see list */
    fun list(params: BatteryListParams = BatteryListParams.none()): BatteryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BatteryListPage =
        list(BatteryListParams.none(), requestOptions)

    /**
     * Service operation to delete a Battery object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, BatteryDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BatteryDeleteParams = BatteryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: BatteryDeleteParams = BatteryDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatteryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BatteryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BatteryDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(BatteryCountParams.none())

    /** @see count */
    fun count(
        params: BatteryCountParams = BatteryCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: BatteryCountParams = BatteryCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(BatteryCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): BatteryQueryhelpResponse = queryhelp(BatteryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: BatteryQueryhelpParams = BatteryQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatteryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: BatteryQueryhelpParams = BatteryQueryhelpParams.none()
    ): BatteryQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): BatteryQueryhelpResponse =
        queryhelp(BatteryQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: BatteryTupleParams): List<BatteryFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: BatteryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BatteryFull>

    /** A view of [BatteryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatteryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/battery`, but is otherwise the same as
         * [BatteryService.create].
         */
        @MustBeClosed
        fun create(params: BatteryCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatteryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            batteryIngest: BatteryIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                BatteryCreateParams.builder().batteryIngest(batteryIngest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(batteryIngest: BatteryIngest): HttpResponse =
            create(batteryIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/battery/{id}`, but is otherwise the same as
         * [BatteryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BatteryFull> =
            retrieve(id, BatteryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatteryRetrieveParams = BatteryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatteryFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatteryRetrieveParams = BatteryRetrieveParams.none(),
        ): HttpResponseFor<BatteryFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BatteryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatteryFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BatteryRetrieveParams): HttpResponseFor<BatteryFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BatteryFull> =
            retrieve(id, BatteryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/battery/{id}`, but is otherwise the same as
         * [BatteryService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: BatteryUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: BatteryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BatteryUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatteryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/battery`, but is otherwise the same as
         * [BatteryService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BatteryListPage> = list(BatteryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatteryListParams = BatteryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatteryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatteryListParams = BatteryListParams.none()
        ): HttpResponseFor<BatteryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BatteryListPage> =
            list(BatteryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/battery/{id}`, but is otherwise the same as
         * [BatteryService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, BatteryDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BatteryDeleteParams = BatteryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BatteryDeleteParams = BatteryDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatteryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BatteryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BatteryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/battery/count`, but is otherwise the same as
         * [BatteryService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(BatteryCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: BatteryCountParams = BatteryCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: BatteryCountParams = BatteryCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(BatteryCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/battery/queryhelp`, but is otherwise the same
         * as [BatteryService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<BatteryQueryhelpResponse> =
            queryhelp(BatteryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: BatteryQueryhelpParams = BatteryQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatteryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: BatteryQueryhelpParams = BatteryQueryhelpParams.none()
        ): HttpResponseFor<BatteryQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<BatteryQueryhelpResponse> =
            queryhelp(BatteryQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/battery/tuple`, but is otherwise the same as
         * [BatteryService.tuple].
         */
        @MustBeClosed
        fun tuple(params: BatteryTupleParams): HttpResponseFor<List<BatteryFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: BatteryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BatteryFull>>
    }
}
