// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.EngineDetailsFull
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailCreateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailDeleteParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListPageAsync
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailListParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailRetrieveParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EngineDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineDetailServiceAsync

    /**
     * Service operation to take a single EngineDetails as a POST body and ingest into the database.
     * EngineDetails are launch vehicle engine details and performance characteristics/limits
     * compiled by a particular source. A launch vehicle engine may have several details records
     * from multiple sources. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: EngineDetailCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EngineDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single EngineDetails record by its unique ID passed as a path
     * parameter. EngineDetails are launch vehicle engine details and performance
     * characteristics/limits compiled by a particular source. A launch vehicle engine may have
     * several details records from multiple sources.
     */
    fun retrieve(id: String): CompletableFuture<EngineDetailsFull> =
        retrieve(id, EngineDetailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineDetailsFull> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(),
    ): CompletableFuture<EngineDetailsFull> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EngineDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineDetailsFull>

    /** @see retrieve */
    fun retrieve(params: EngineDetailRetrieveParams): CompletableFuture<EngineDetailsFull> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EngineDetailsFull> =
        retrieve(id, EngineDetailRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single EngineDetails. EngineDetails are launch vehicle engine
     * details and performance characteristics/limits compiled by a particular source. A launch
     * vehicle engine may have several details records from multiple sources. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: EngineDetailUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: EngineDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: EngineDetailUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EngineDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<EngineDetailListPageAsync> = list(EngineDetailListParams.none())

    /** @see list */
    fun list(
        params: EngineDetailListParams = EngineDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineDetailListPageAsync>

    /** @see list */
    fun list(
        params: EngineDetailListParams = EngineDetailListParams.none()
    ): CompletableFuture<EngineDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EngineDetailListPageAsync> =
        list(EngineDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a EngineDetails object specified by the passed ID path parameter.
     * EngineDetails are launch vehicle engine details and performance characteristics/limits
     * compiled by a particular source. A launch vehicle engine may have several details records
     * from multiple sources. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EngineDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EngineDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EngineDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EngineDetailDeleteParams.none(), requestOptions)

    /**
     * A view of [EngineDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): EngineDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/enginedetails`, but is otherwise the same as
         * [EngineDetailServiceAsync.create].
         */
        fun create(params: EngineDetailCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EngineDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/enginedetails/{id}`, but is otherwise the same
         * as [EngineDetailServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EngineDetailsFull>> =
            retrieve(id, EngineDetailRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineDetailsFull>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EngineDetailRetrieveParams = EngineDetailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EngineDetailsFull>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EngineDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineDetailsFull>>

        /** @see retrieve */
        fun retrieve(
            params: EngineDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<EngineDetailsFull>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EngineDetailsFull>> =
            retrieve(id, EngineDetailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/enginedetails/{id}`, but is otherwise the same
         * as [EngineDetailServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: EngineDetailUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: EngineDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: EngineDetailUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EngineDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/enginedetails`, but is otherwise the same as
         * [EngineDetailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EngineDetailListPageAsync>> =
            list(EngineDetailListParams.none())

        /** @see list */
        fun list(
            params: EngineDetailListParams = EngineDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineDetailListPageAsync>>

        /** @see list */
        fun list(
            params: EngineDetailListParams = EngineDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<EngineDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EngineDetailListPageAsync>> =
            list(EngineDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/enginedetails/{id}`, but is otherwise the
         * same as [EngineDetailServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EngineDetailDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EngineDetailDeleteParams = EngineDetailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EngineDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EngineDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EngineDetailDeleteParams.none(), requestOptions)
    }
}
