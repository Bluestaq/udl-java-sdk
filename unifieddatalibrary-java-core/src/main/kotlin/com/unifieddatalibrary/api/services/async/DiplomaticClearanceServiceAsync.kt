// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.DiplomaticclearanceFull
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceDeleteParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListPageAsync
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceQueryhelpResponse
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceUpdateParams
import com.unifieddatalibrary.api.services.async.diplomaticclearance.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.diplomaticclearance.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiplomaticClearanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiplomaticClearanceServiceAsync

    fun country(): CountryServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single diplomatic clearance record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: DiplomaticClearanceCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DiplomaticClearanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single diplomatic clearance record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): CompletableFuture<DiplomaticclearanceFull> =
        retrieve(id, DiplomaticClearanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiplomaticclearanceFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(),
    ): CompletableFuture<DiplomaticclearanceFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DiplomaticClearanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiplomaticclearanceFull>

    /** @see retrieve */
    fun retrieve(
        params: DiplomaticClearanceRetrieveParams
    ): CompletableFuture<DiplomaticclearanceFull> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DiplomaticclearanceFull> =
        retrieve(id, DiplomaticClearanceRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single diplomatic clearance record. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: DiplomaticClearanceUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DiplomaticClearanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DiplomaticClearanceUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DiplomaticClearanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: DiplomaticClearanceListParams
    ): CompletableFuture<DiplomaticClearanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DiplomaticClearanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiplomaticClearanceListPageAsync>

    /**
     * Service operation to delete a diplomatic clearance record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, DiplomaticClearanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DiplomaticClearanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DiplomaticClearanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, DiplomaticClearanceDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: DiplomaticClearanceCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: DiplomaticClearanceCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of
     * diplomaticclearance records as a POST body and ingest into the database. This operation is
     * not intended to be used for automated feeds into UDL. Data providers should contact the UDL
     * team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: DiplomaticClearanceCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: DiplomaticClearanceCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<DiplomaticClearanceQueryhelpResponse> =
        queryhelp(DiplomaticClearanceQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiplomaticClearanceQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none()
    ): CompletableFuture<DiplomaticClearanceQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<DiplomaticClearanceQueryhelpResponse> =
        queryhelp(DiplomaticClearanceQueryhelpParams.none(), requestOptions)

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
        params: DiplomaticClearanceTupleParams
    ): CompletableFuture<List<DiplomaticclearanceFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DiplomaticClearanceTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DiplomaticclearanceFull>>

    /**
     * A view of [DiplomaticClearanceServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DiplomaticClearanceServiceAsync.WithRawResponse

        fun country(): CountryServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearance`, but is otherwise the
         * same as [DiplomaticClearanceServiceAsync.create].
         */
        fun create(params: DiplomaticClearanceCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DiplomaticClearanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearance/{id}`, but is otherwise the
         * same as [DiplomaticClearanceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> =
            retrieve(id, DiplomaticClearanceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DiplomaticClearanceRetrieveParams = DiplomaticClearanceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DiplomaticClearanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>>

        /** @see retrieve */
        fun retrieve(
            params: DiplomaticClearanceRetrieveParams
        ): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DiplomaticclearanceFull>> =
            retrieve(id, DiplomaticClearanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/diplomaticclearance/{id}`, but is otherwise the
         * same as [DiplomaticClearanceServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: DiplomaticClearanceUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: DiplomaticClearanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: DiplomaticClearanceUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DiplomaticClearanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearance`, but is otherwise the same
         * as [DiplomaticClearanceServiceAsync.list].
         */
        fun list(
            params: DiplomaticClearanceListParams
        ): CompletableFuture<HttpResponseFor<DiplomaticClearanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DiplomaticClearanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiplomaticClearanceListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /udl/diplomaticclearance/{id}`, but is otherwise
         * the same as [DiplomaticClearanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, DiplomaticClearanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DiplomaticClearanceDeleteParams = DiplomaticClearanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DiplomaticClearanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DiplomaticClearanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, DiplomaticClearanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearance/count`, but is otherwise
         * the same as [DiplomaticClearanceServiceAsync.count].
         */
        fun count(
            params: DiplomaticClearanceCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: DiplomaticClearanceCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/diplomaticclearance/createBulk`, but is
         * otherwise the same as [DiplomaticClearanceServiceAsync.createBulk].
         */
        fun createBulk(
            params: DiplomaticClearanceCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: DiplomaticClearanceCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearance/queryhelp`, but is
         * otherwise the same as [DiplomaticClearanceServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DiplomaticClearanceQueryhelpResponse>> =
            queryhelp(DiplomaticClearanceQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiplomaticClearanceQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: DiplomaticClearanceQueryhelpParams = DiplomaticClearanceQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<DiplomaticClearanceQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DiplomaticClearanceQueryhelpResponse>> =
            queryhelp(DiplomaticClearanceQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/diplomaticclearance/tuple`, but is otherwise
         * the same as [DiplomaticClearanceServiceAsync.tuple].
         */
        fun tuple(
            params: DiplomaticClearanceTupleParams
        ): CompletableFuture<HttpResponseFor<List<DiplomaticclearanceFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DiplomaticClearanceTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DiplomaticclearanceFull>>>
    }
}
