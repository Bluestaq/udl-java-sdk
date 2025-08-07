// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AirspacecontrolorderFull
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCountParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateBulkParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListPageAsync
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderListParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderQueryHelpResponse
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderRetrieveParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderTupleParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AirspaceControlOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirspaceControlOrderServiceAsync

    /**
     * Service operation to take a single AirspaceControlOrder record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: AirspaceControlOrderCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AirspaceControlOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single AirspaceControlOrder record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): CompletableFuture<AirspacecontrolorderFull> =
        retrieve(id, AirspaceControlOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirspacecontrolorderFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(),
    ): CompletableFuture<AirspacecontrolorderFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AirspaceControlOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirspacecontrolorderFull>

    /** @see retrieve */
    fun retrieve(
        params: AirspaceControlOrderRetrieveParams
    ): CompletableFuture<AirspacecontrolorderFull> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AirspacecontrolorderFull> =
        retrieve(id, AirspaceControlOrderRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<AirspaceControlOrderListPageAsync> =
        list(AirspaceControlOrderListParams.none())

    /** @see list */
    fun list(
        params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirspaceControlOrderListPageAsync>

    /** @see list */
    fun list(
        params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none()
    ): CompletableFuture<AirspaceControlOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AirspaceControlOrderListPageAsync> =
        list(AirspaceControlOrderListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(AirspaceControlOrderCountParams.none())

    /** @see count */
    fun count(
        params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(AirspaceControlOrderCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of
     * AirspaceControlOrder records as a POST body and ingest into the database. This operation is
     * not intended to be used for automated feeds into UDL. Data providers should contact the UDL
     * team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: AirspaceControlOrderCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: AirspaceControlOrderCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<AirspaceControlOrderQueryHelpResponse> =
        queryHelp(AirspaceControlOrderQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AirspaceControlOrderQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none()
    ): CompletableFuture<AirspaceControlOrderQueryHelpResponse> =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(
        requestOptions: RequestOptions
    ): CompletableFuture<AirspaceControlOrderQueryHelpResponse> =
        queryHelp(AirspaceControlOrderQueryHelpParams.none(), requestOptions)

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
        params: AirspaceControlOrderTupleParams
    ): CompletableFuture<List<AirspacecontrolorderFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: AirspaceControlOrderTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AirspacecontrolorderFull>>

    /**
     * A view of [AirspaceControlOrderServiceAsync] that provides access to raw HTTP responses for
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
        ): AirspaceControlOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/airspacecontrolorder`, but is otherwise the
         * same as [AirspaceControlOrderServiceAsync.create].
         */
        fun create(params: AirspaceControlOrderCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AirspaceControlOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airspacecontrolorder/{id}`, but is otherwise
         * the same as [AirspaceControlOrderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> =
            retrieve(id, AirspaceControlOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AirspaceControlOrderRetrieveParams = AirspaceControlOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AirspaceControlOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>>

        /** @see retrieve */
        fun retrieve(
            params: AirspaceControlOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AirspacecontrolorderFull>> =
            retrieve(id, AirspaceControlOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airspacecontrolorder`, but is otherwise the
         * same as [AirspaceControlOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AirspaceControlOrderListPageAsync>> =
            list(AirspaceControlOrderListParams.none())

        /** @see list */
        fun list(
            params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderListPageAsync>>

        /** @see list */
        fun list(
            params: AirspaceControlOrderListParams = AirspaceControlOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderListPageAsync>> =
            list(AirspaceControlOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airspacecontrolorder/count`, but is otherwise
         * the same as [AirspaceControlOrderServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(AirspaceControlOrderCountParams.none())

        /** @see count */
        fun count(
            params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: AirspaceControlOrderCountParams = AirspaceControlOrderCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(AirspaceControlOrderCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/airspacecontrolorder/createBulk`, but is
         * otherwise the same as [AirspaceControlOrderServiceAsync.createBulk].
         */
        fun createBulk(
            params: AirspaceControlOrderCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: AirspaceControlOrderCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/airspacecontrolorder/queryhelp`, but is
         * otherwise the same as [AirspaceControlOrderServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<AirspaceControlOrderQueryHelpResponse>> =
            queryHelp(AirspaceControlOrderQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: AirspaceControlOrderQueryHelpParams =
                AirspaceControlOrderQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: AirspaceControlOrderQueryHelpParams = AirspaceControlOrderQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AirspaceControlOrderQueryHelpResponse>> =
            queryHelp(AirspaceControlOrderQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/airspacecontrolorder/tuple`, but is otherwise
         * the same as [AirspaceControlOrderServiceAsync.tuple].
         */
        fun tuple(
            params: AirspaceControlOrderTupleParams
        ): CompletableFuture<HttpResponseFor<List<AirspacecontrolorderFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: AirspaceControlOrderTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AirspacecontrolorderFull>>>
    }
}
