// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.onorbit

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.AntennaDetailsFull
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailDeleteParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListPageAsync
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AntennaDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AntennaDetailServiceAsync

    /**
     * Service operation to take a single AntennaDetails as a POST body and ingest into the
     * database. An antenna may have multiple details records compiled by various sources. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: AntennaDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AntennaDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single AntennaDetails record by its unique ID passed as a path
     * parameter. An antenna may have multiple details records compiled by various sources.
     */
    fun retrieve(id: String): CompletableFuture<AntennaDetailsFull> =
        retrieve(id, AntennaDetailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaDetailsFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(),
    ): CompletableFuture<AntennaDetailsFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AntennaDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaDetailsFull>

    /** @see retrieve */
    fun retrieve(params: AntennaDetailRetrieveParams): CompletableFuture<AntennaDetailsFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AntennaDetailsFull> =
        retrieve(id, AntennaDetailRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single AntennaDetails. An antenna may have multiple details
     * records compiled by various sources. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: AntennaDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: AntennaDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: AntennaDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AntennaDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<AntennaDetailListPageAsync> = list(AntennaDetailListParams.none())

    /** @see list */
    fun list(
        params: AntennaDetailListParams = AntennaDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AntennaDetailListPageAsync>

    /** @see list */
    fun list(
        params: AntennaDetailListParams = AntennaDetailListParams.none()
    ): CompletableFuture<AntennaDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AntennaDetailListPageAsync> =
        list(AntennaDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a AntennaDetails object specified by the passed ID path
     * parameter. An antenna may have multiple details records compiled by various sources. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, AntennaDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AntennaDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AntennaDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AntennaDetailDeleteParams.none(), requestOptions)

    /**
     * A view of [AntennaDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): AntennaDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/antennadetails`, but is otherwise the same as
         * [AntennaDetailServiceAsync.create].
         */
        fun create(params: AntennaDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AntennaDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/antennadetails/{id}`, but is otherwise the same
         * as [AntennaDetailServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> =
            retrieve(id, AntennaDetailRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AntennaDetailRetrieveParams = AntennaDetailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AntennaDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaDetailsFull>>

        /** @see retrieve */
        fun retrieve(
            params: AntennaDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AntennaDetailsFull>> =
            retrieve(id, AntennaDetailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/antennadetails/{id}`, but is otherwise the same
         * as [AntennaDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: AntennaDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: AntennaDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: AntennaDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AntennaDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/antennadetails`, but is otherwise the same as
         * [AntennaDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AntennaDetailListPageAsync>> =
            list(AntennaDetailListParams.none())

        /** @see list */
        fun list(
            params: AntennaDetailListParams = AntennaDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AntennaDetailListPageAsync>>

        /** @see list */
        fun list(
            params: AntennaDetailListParams = AntennaDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<AntennaDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AntennaDetailListPageAsync>> =
            list(AntennaDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/antennadetails/{id}`, but is otherwise the
         * same as [AntennaDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AntennaDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AntennaDetailDeleteParams = AntennaDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AntennaDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AntennaDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AntennaDetailDeleteParams.none(), requestOptions)
    }
}
