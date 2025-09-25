// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.rfemitter

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingCreateBulkParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingCreateParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingDeleteParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingListPageAsync
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingListParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingQueryhelpParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingQueryhelpResponse
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingRetrieveParams
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingRetrieveResponse
import com.unifieddatalibrary.api.models.rfemitter.staging.StagingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StagingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StagingServiceAsync

    /**
     * Service operation to take a single RFEmitterStaging record as a POST body and ingest into the
     * staging database. This API allows users to create, manage, and review RFEmitter records in a
     * staging environment before their incorporation into the production UDL. It supports workflows
     * involving validation, review, and approval of emitter data to ensure consistency, compliance,
     * and data quality. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: StagingCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StagingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single RFEmitterStaging record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): CompletableFuture<StagingRetrieveResponse> =
        retrieve(id, StagingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StagingRetrieveParams = StagingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StagingRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StagingRetrieveParams = StagingRetrieveParams.none(),
    ): CompletableFuture<StagingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StagingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StagingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: StagingRetrieveParams): CompletableFuture<StagingRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StagingRetrieveResponse> =
        retrieve(id, StagingRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single RFEmitterStaging record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: StagingUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: StagingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: StagingUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StagingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<StagingListPageAsync> = list(StagingListParams.none())

    /** @see list */
    fun list(
        params: StagingListParams = StagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StagingListPageAsync>

    /** @see list */
    fun list(
        params: StagingListParams = StagingListParams.none()
    ): CompletableFuture<StagingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StagingListPageAsync> =
        list(StagingListParams.none(), requestOptions)

    /**
     * Service operation to delete a RFEmitterStaging record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, StagingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StagingDeleteParams = StagingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: StagingDeleteParams = StagingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StagingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: StagingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, StagingDeleteParams.none(), requestOptions)

    /**
     * Service operation to take multiple RFEmitterStaging records as a POST body and ingest into
     * the staging database. This API allows users to create, manage, and review RFEmitter records
     * in a staging environment before their incorporation into the production UDL. It supports
     * workflows involving validation, review, and approval of emitter data to ensure consistency,
     * compliance, and data quality. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun createBulk(params: StagingCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: StagingCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<StagingQueryhelpResponse> =
        queryhelp(StagingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: StagingQueryhelpParams = StagingQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StagingQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: StagingQueryhelpParams = StagingQueryhelpParams.none()
    ): CompletableFuture<StagingQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<StagingQueryhelpResponse> =
        queryhelp(StagingQueryhelpParams.none(), requestOptions)

    /**
     * A view of [StagingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StagingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/rfemitterstaging`, but is otherwise the same
         * as [StagingServiceAsync.create].
         */
        fun create(params: StagingCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StagingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterstaging/{id}`, but is otherwise the
         * same as [StagingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>> =
            retrieve(id, StagingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StagingRetrieveParams = StagingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StagingRetrieveParams = StagingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StagingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StagingRetrieveParams
        ): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StagingRetrieveResponse>> =
            retrieve(id, StagingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/rfemitterstaging/{id}`, but is otherwise the
         * same as [StagingServiceAsync.update].
         */
        fun update(pathId: String, params: StagingUpdateParams): CompletableFuture<HttpResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: StagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: StagingUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterstaging`, but is otherwise the same as
         * [StagingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StagingListPageAsync>> =
            list(StagingListParams.none())

        /** @see list */
        fun list(
            params: StagingListParams = StagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StagingListPageAsync>>

        /** @see list */
        fun list(
            params: StagingListParams = StagingListParams.none()
        ): CompletableFuture<HttpResponseFor<StagingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StagingListPageAsync>> =
            list(StagingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/rfemitterstaging/{id}`, but is otherwise the
         * same as [StagingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, StagingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: StagingDeleteParams = StagingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: StagingDeleteParams = StagingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StagingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: StagingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, StagingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/rfemitterstaging/createBulk`, but is otherwise
         * the same as [StagingServiceAsync.createBulk].
         */
        fun createBulk(params: StagingCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: StagingCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/rfemitterstaging/queryhelp`, but is otherwise
         * the same as [StagingServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<StagingQueryhelpResponse>> =
            queryhelp(StagingQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: StagingQueryhelpParams = StagingQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StagingQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: StagingQueryhelpParams = StagingQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<StagingQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StagingQueryhelpResponse>> =
            queryhelp(StagingQueryhelpParams.none(), requestOptions)
    }
}
