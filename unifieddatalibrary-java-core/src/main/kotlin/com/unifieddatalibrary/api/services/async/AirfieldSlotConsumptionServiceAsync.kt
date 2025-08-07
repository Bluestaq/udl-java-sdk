// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirfieldslotconsumptionFull
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCountParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCreateParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionDeleteParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListPageAsync
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionQueryhelpResponse
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionTupleParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirfieldSlotConsumptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirfieldSlotConsumptionServiceAsync

    /**
     * Service operation to take a single airfieldslotconsumption record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: AirfieldSlotConsumptionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AirfieldSlotConsumptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single airfieldslotconsumption record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): CompletableFuture<AirfieldslotconsumptionFull> =
        retrieve(id, AirfieldSlotConsumptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirfieldSlotConsumptionRetrieveParams =
            AirfieldSlotConsumptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirfieldslotconsumptionFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirfieldSlotConsumptionRetrieveParams = AirfieldSlotConsumptionRetrieveParams.none(),
    ): CompletableFuture<AirfieldslotconsumptionFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AirfieldSlotConsumptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirfieldslotconsumptionFull>

    /** @see retrieve */
    fun retrieve(
        params: AirfieldSlotConsumptionRetrieveParams
    ): CompletableFuture<AirfieldslotconsumptionFull> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirfieldslotconsumptionFull> =
        retrieve(id, AirfieldSlotConsumptionRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single AirfieldSlotConsumption. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(
        pathId: String,
        params: AirfieldSlotConsumptionUpdateParams,
    ): CompletableFuture<Void?> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AirfieldSlotConsumptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AirfieldSlotConsumptionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AirfieldSlotConsumptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: AirfieldSlotConsumptionListParams
    ): CompletableFuture<AirfieldSlotConsumptionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AirfieldSlotConsumptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirfieldSlotConsumptionListPageAsync>

    /**
     * Service operation to delete an airfieldslotconsumption record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, AirfieldSlotConsumptionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AirfieldSlotConsumptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AirfieldSlotConsumptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AirfieldSlotConsumptionDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: AirfieldSlotConsumptionCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: AirfieldSlotConsumptionCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<AirfieldSlotConsumptionQueryhelpResponse> =
        queryhelp(AirfieldSlotConsumptionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: AirfieldSlotConsumptionQueryhelpParams =
            AirfieldSlotConsumptionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirfieldSlotConsumptionQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: AirfieldSlotConsumptionQueryhelpParams =
            AirfieldSlotConsumptionQueryhelpParams.none()
    ): CompletableFuture<AirfieldSlotConsumptionQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AirfieldSlotConsumptionQueryhelpResponse> =
        queryhelp(AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: AirfieldSlotConsumptionTupleParams
    ): CompletableFuture<List<AirfieldslotconsumptionFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AirfieldSlotConsumptionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AirfieldslotconsumptionFull>>

    /**
     * A view of [AirfieldSlotConsumptionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirfieldSlotConsumptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/airfieldslotconsumption`, but is otherwise the
         * same as [AirfieldSlotConsumptionServiceAsync.create].
         */
        fun create(params: AirfieldSlotConsumptionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AirfieldSlotConsumptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslotconsumption/{id}`, but is otherwise
         * the same as [AirfieldSlotConsumptionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>> =
            retrieve(id, AirfieldSlotConsumptionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirfieldSlotConsumptionRetrieveParams =
                AirfieldSlotConsumptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirfieldSlotConsumptionRetrieveParams =
                AirfieldSlotConsumptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AirfieldSlotConsumptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>>

        /** @see retrieve */
        fun retrieve(
            params: AirfieldSlotConsumptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirfieldslotconsumptionFull>> =
            retrieve(id, AirfieldSlotConsumptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/airfieldslotconsumption/{id}`, but is otherwise
         * the same as [AirfieldSlotConsumptionServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: AirfieldSlotConsumptionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AirfieldSlotConsumptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AirfieldSlotConsumptionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AirfieldSlotConsumptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslotconsumption`, but is otherwise the
         * same as [AirfieldSlotConsumptionServiceAsync.list].
         */
        fun list(
            params: AirfieldSlotConsumptionListParams
        ): CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AirfieldSlotConsumptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/airfieldslotconsumption/{id}`, but is
         * otherwise the same as [AirfieldSlotConsumptionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AirfieldSlotConsumptionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AirfieldSlotConsumptionDeleteParams =
                AirfieldSlotConsumptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AirfieldSlotConsumptionDeleteParams = AirfieldSlotConsumptionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AirfieldSlotConsumptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AirfieldSlotConsumptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AirfieldSlotConsumptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslotconsumption/count`, but is
         * otherwise the same as [AirfieldSlotConsumptionServiceAsync.count].
         */
        fun count(
            params: AirfieldSlotConsumptionCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: AirfieldSlotConsumptionCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslotconsumption/queryhelp`, but is
         * otherwise the same as [AirfieldSlotConsumptionServiceAsync.queryhelp].
         */
        fun queryhelp():
            CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse>> =
            queryhelp(AirfieldSlotConsumptionQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: AirfieldSlotConsumptionQueryhelpParams =
                AirfieldSlotConsumptionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: AirfieldSlotConsumptionQueryhelpParams =
                AirfieldSlotConsumptionQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirfieldSlotConsumptionQueryhelpResponse>> =
            queryhelp(AirfieldSlotConsumptionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airfieldslotconsumption/tuple`, but is
         * otherwise the same as [AirfieldSlotConsumptionServiceAsync.tuple].
         */
        fun tuple(
            params: AirfieldSlotConsumptionTupleParams
        ): CompletableFuture<HttpResponseFor<List<AirfieldslotconsumptionFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AirfieldSlotConsumptionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AirfieldslotconsumptionFull>>>
    }
}
