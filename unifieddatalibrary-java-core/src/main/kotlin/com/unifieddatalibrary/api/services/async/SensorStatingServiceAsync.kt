// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateBulkParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingDeleteParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListPageAsync
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorStatingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorStatingServiceAsync

    /**
     * Service operation to take a single SensorStaging record as a POST body and ingest into the
     * staging database. This API allows users to create, manage, and review SensorStaging records
     * in a staging environment before their incorporation into the production UDL. It supports
     * workflows involving validation, review, and approval of sensor data to ensure consistency,
     * compliance, and data quality. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: SensorStatingCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SensorStatingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update a single SensorStaging record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SensorStatingUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SensorStatingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SensorStatingUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorStatingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<SensorStatingListPageAsync> = list(SensorStatingListParams.none())

    /** @see list */
    fun list(
        params: SensorStatingListParams = SensorStatingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorStatingListPageAsync>

    /** @see list */
    fun list(
        params: SensorStatingListParams = SensorStatingListParams.none()
    ): CompletableFuture<SensorStatingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SensorStatingListPageAsync> =
        list(SensorStatingListParams.none(), requestOptions)

    /**
     * Service operation to delete a SensorStaging record specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, SensorStatingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SensorStatingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SensorStatingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, SensorStatingDeleteParams.none(), requestOptions)

    /**
     * Service operation to take multiple SensorStaging records as a POST body and ingest into the
     * staging database. This API allows users to create, manage, and review SensorStaging records
     * in a staging environment before their incorporation into the production UDL. It supports
     * workflows involving validation, review, and approval of sensor data to ensure consistency,
     * compliance, and data quality. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun createBulk(params: SensorStatingCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SensorStatingCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single SensorStaging record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SensorStatingGetResponse> =
        get(id, SensorStatingGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorStatingGetParams = SensorStatingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorStatingGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorStatingGetParams = SensorStatingGetParams.none(),
    ): CompletableFuture<SensorStatingGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorStatingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorStatingGetResponse>

    /** @see get */
    fun get(params: SensorStatingGetParams): CompletableFuture<SensorStatingGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorStatingGetResponse> =
        get(id, SensorStatingGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SensorStatingQueryhelpResponse> =
        queryhelp(SensorStatingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorStatingQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none()
    ): CompletableFuture<SensorStatingQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SensorStatingQueryhelpResponse> =
        queryhelp(SensorStatingQueryhelpParams.none(), requestOptions)

    /**
     * A view of [SensorStatingServiceAsync] that provides access to raw HTTP responses for each
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
        ): SensorStatingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensorstaging`, but is otherwise the same as
         * [SensorStatingServiceAsync.create].
         */
        fun create(params: SensorStatingCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SensorStatingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/sensorstaging/{id}`, but is otherwise the same
         * as [SensorStatingServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SensorStatingUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SensorStatingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: SensorStatingUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SensorStatingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging`, but is otherwise the same as
         * [SensorStatingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SensorStatingListPageAsync>> =
            list(SensorStatingListParams.none())

        /** @see list */
        fun list(
            params: SensorStatingListParams = SensorStatingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorStatingListPageAsync>>

        /** @see list */
        fun list(
            params: SensorStatingListParams = SensorStatingListParams.none()
        ): CompletableFuture<HttpResponseFor<SensorStatingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorStatingListPageAsync>> =
            list(SensorStatingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sensorstaging/{id}`, but is otherwise the
         * same as [SensorStatingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, SensorStatingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SensorStatingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SensorStatingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, SensorStatingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/sensorstaging/createBulk`, but is otherwise
         * the same as [SensorStatingServiceAsync.createBulk].
         */
        fun createBulk(params: SensorStatingCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: SensorStatingCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging/{id}`, but is otherwise the same
         * as [SensorStatingServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>> =
            get(id, SensorStatingGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SensorStatingGetParams = SensorStatingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SensorStatingGetParams = SensorStatingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SensorStatingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>>

        /** @see get */
        fun get(
            params: SensorStatingGetParams
        ): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorStatingGetResponse>> =
            get(id, SensorStatingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging/queryhelp`, but is otherwise the
         * same as [SensorStatingServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SensorStatingQueryhelpResponse>> =
            queryhelp(SensorStatingQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorStatingQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SensorStatingQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorStatingQueryhelpResponse>> =
            queryhelp(SensorStatingQueryhelpParams.none(), requestOptions)
    }
}
