// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldslotFull
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCountParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCreateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotDeleteParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListPage
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotListParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotTupleParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotUpdateParams
import java.util.function.Consumer

interface AirfieldSlotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotService

    /**
     * Service operation to take a single airfieldslot record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: AirfieldSlotCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AirfieldSlotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single airfieldslot record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): AirfieldslotFull = retrieve(id, AirfieldSlotRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AirfieldslotFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(),
    ): AirfieldslotFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AirfieldSlotRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AirfieldslotFull

    /** @see retrieve */
    fun retrieve(params: AirfieldSlotRetrieveParams): AirfieldslotFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AirfieldslotFull =
        retrieve(id, AirfieldSlotRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single airfieldslot record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AirfieldSlotUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AirfieldSlotUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AirfieldSlotUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AirfieldSlotUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): AirfieldSlotListPage = list(AirfieldSlotListParams.none())

    /** @see list */
    fun list(
        params: AirfieldSlotListParams = AirfieldSlotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AirfieldSlotListPage

    /** @see list */
    fun list(params: AirfieldSlotListParams = AirfieldSlotListParams.none()): AirfieldSlotListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AirfieldSlotListPage =
        list(AirfieldSlotListParams.none(), requestOptions)

    /**
     * Service operation to delete an airfieldslot record specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String) = delete(id, AirfieldSlotDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AirfieldSlotDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AirfieldSlotDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AirfieldSlotDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(AirfieldSlotCountParams.none())

    /** @see count */
    fun count(
        params: AirfieldSlotCountParams = AirfieldSlotCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: AirfieldSlotCountParams = AirfieldSlotCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(AirfieldSlotCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): AirfieldSlotQueryhelpResponse = queryhelp(AirfieldSlotQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AirfieldSlotQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none()
    ): AirfieldSlotQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): AirfieldSlotQueryhelpResponse =
        queryhelp(AirfieldSlotQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: AirfieldSlotTupleParams): List<AirfieldslotFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AirfieldSlotTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AirfieldslotFull>

    /**
     * A view of [AirfieldSlotService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirfieldSlotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/airfieldslot`, but is otherwise the same as
         * [AirfieldSlotService.create].
         */
        @MustBeClosed
        fun create(params: AirfieldSlotCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AirfieldSlotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslot/{id}`, but is otherwise the same
         * as [AirfieldSlotService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AirfieldslotFull> =
            retrieve(id, AirfieldSlotRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AirfieldslotFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AirfieldSlotRetrieveParams = AirfieldSlotRetrieveParams.none(),
        ): HttpResponseFor<AirfieldslotFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AirfieldSlotRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AirfieldslotFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AirfieldSlotRetrieveParams): HttpResponseFor<AirfieldslotFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AirfieldslotFull> =
            retrieve(id, AirfieldSlotRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/airfieldslot/{id}`, but is otherwise the same
         * as [AirfieldSlotService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: AirfieldSlotUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: AirfieldSlotUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AirfieldSlotUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AirfieldSlotUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslot`, but is otherwise the same as
         * [AirfieldSlotService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AirfieldSlotListPage> = list(AirfieldSlotListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AirfieldSlotListParams = AirfieldSlotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AirfieldSlotListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AirfieldSlotListParams = AirfieldSlotListParams.none()
        ): HttpResponseFor<AirfieldSlotListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AirfieldSlotListPage> =
            list(AirfieldSlotListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/airfieldslot/{id}`, but is otherwise the
         * same as [AirfieldSlotService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, AirfieldSlotDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AirfieldSlotDeleteParams = AirfieldSlotDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AirfieldSlotDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AirfieldSlotDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AirfieldSlotDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslot/count`, but is otherwise the same
         * as [AirfieldSlotService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(AirfieldSlotCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: AirfieldSlotCountParams = AirfieldSlotCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: AirfieldSlotCountParams = AirfieldSlotCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(AirfieldSlotCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslot/queryhelp`, but is otherwise the
         * same as [AirfieldSlotService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<AirfieldSlotQueryhelpResponse> =
            queryhelp(AirfieldSlotQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AirfieldSlotQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: AirfieldSlotQueryhelpParams = AirfieldSlotQueryhelpParams.none()
        ): HttpResponseFor<AirfieldSlotQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<AirfieldSlotQueryhelpResponse> =
            queryhelp(AirfieldSlotQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslot/tuple`, but is otherwise the same
         * as [AirfieldSlotService.tuple].
         */
        @MustBeClosed
        fun tuple(params: AirfieldSlotTupleParams): HttpResponseFor<List<AirfieldslotFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: AirfieldSlotTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AirfieldslotFull>>
    }
}
