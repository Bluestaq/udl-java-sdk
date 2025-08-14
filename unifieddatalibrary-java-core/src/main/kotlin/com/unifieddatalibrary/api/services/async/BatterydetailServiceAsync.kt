// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BatterydetailsFull
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailCreateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailDeleteParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListPageAsync
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailRetrieveParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatterydetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatterydetailServiceAsync

    /**
     * Service operation to take a single BatteryDetails as a POST body and ingest into the
     * database. A Battery record may have multiple details records from several sources. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BatterydetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatterydetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single BatteryDetails record by its unique ID passed as a path
     * parameter. A Battery record may have multiple details records from several sources.
     */
    fun retrieve(id: String): CompletableFuture<BatterydetailsFull> =
        retrieve(id, BatterydetailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatterydetailsFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
    ): CompletableFuture<BatterydetailsFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatterydetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatterydetailsFull>

    /** @see retrieve */
    fun retrieve(params: BatterydetailRetrieveParams): CompletableFuture<BatterydetailsFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatterydetailsFull> =
        retrieve(id, BatterydetailRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single BatteryDetails. A Battery record may have multiple
     * details records from several sources. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BatterydetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BatterydetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BatterydetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatterydetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<BatterydetailListPageAsync> = list(BatterydetailListParams.none())

    /** @see list */
    fun list(
        params: BatterydetailListParams = BatterydetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatterydetailListPageAsync>

    /** @see list */
    fun list(
        params: BatterydetailListParams = BatterydetailListParams.none()
    ): CompletableFuture<BatterydetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatterydetailListPageAsync> =
        list(BatterydetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a BatteryDetails object specified by the passed ID path
     * parameter. A Battery record may have multiple details records from several sources. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, BatterydetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatterydetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BatterydetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, BatterydetailDeleteParams.none(), requestOptions)

    /**
     * A view of [BatterydetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatterydetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/batterydetails`, but is otherwise the same as
         * [BatterydetailServiceAsync.create].
         */
        fun create(params: BatterydetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatterydetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/batterydetails/{id}`, but is otherwise the same
         * as [BatterydetailServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BatterydetailsFull>> =
            retrieve(id, BatterydetailRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatterydetailsFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BatterydetailsFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BatterydetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatterydetailsFull>>

        /** @see retrieve */
        fun retrieve(
            params: BatterydetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<BatterydetailsFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatterydetailsFull>> =
            retrieve(id, BatterydetailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/batterydetails/{id}`, but is otherwise the same
         * as [BatterydetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: BatterydetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: BatterydetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: BatterydetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatterydetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/batterydetails`, but is otherwise the same as
         * [BatterydetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BatterydetailListPageAsync>> =
            list(BatterydetailListParams.none())

        /** @see list */
        fun list(
            params: BatterydetailListParams = BatterydetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatterydetailListPageAsync>>

        /** @see list */
        fun list(
            params: BatterydetailListParams = BatterydetailListParams.none()
        ): CompletableFuture<HttpResponseFor<BatterydetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatterydetailListPageAsync>> =
            list(BatterydetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/batterydetails/{id}`, but is otherwise the
         * same as [BatterydetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, BatterydetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatterydetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BatterydetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, BatterydetailDeleteParams.none(), requestOptions)
    }
}
