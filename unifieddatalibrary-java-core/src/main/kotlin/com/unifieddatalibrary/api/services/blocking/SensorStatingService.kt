// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateBulkParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingDeleteParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListPage
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingListParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingQueryhelpResponse
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingUpdateParams
import java.util.function.Consumer

interface SensorStatingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorStatingService

    /**
     * Service operation to take a single SensorStaging record as a POST body and ingest into the
     * staging database. This API allows users to create, manage, and review SensorStaging records
     * in a staging environment before their incorporation into the production UDL. It supports
     * workflows involving validation, review, and approval of sensor data to ensure consistency,
     * compliance, and data quality. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun create(params: SensorStatingCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SensorStatingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single SensorStaging record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SensorStatingUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SensorStatingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SensorStatingUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorStatingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SensorStatingListPage = list(SensorStatingListParams.none())

    /** @see list */
    fun list(
        params: SensorStatingListParams = SensorStatingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorStatingListPage

    /** @see list */
    fun list(
        params: SensorStatingListParams = SensorStatingListParams.none()
    ): SensorStatingListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SensorStatingListPage =
        list(SensorStatingListParams.none(), requestOptions)

    /**
     * Service operation to delete a SensorStaging record specified by the passed ID path parameter.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun delete(id: String) = delete(id, SensorStatingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SensorStatingDeleteParams = SensorStatingDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SensorStatingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SensorStatingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SensorStatingDeleteParams.none(), requestOptions)

    /**
     * Service operation to take multiple SensorStaging records as a POST body and ingest into the
     * staging database. This API allows users to create, manage, and review SensorStaging records
     * in a staging environment before their incorporation into the production UDL. It supports
     * workflows involving validation, review, and approval of sensor data to ensure consistency,
     * compliance, and data quality. A specific role is required to perform this service operation.
     * Please contact the UDL team for assistance.
     */
    fun createBulk(params: SensorStatingCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SensorStatingCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single SensorStaging record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SensorStatingGetResponse = get(id, SensorStatingGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SensorStatingGetParams = SensorStatingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorStatingGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SensorStatingGetParams = SensorStatingGetParams.none(),
    ): SensorStatingGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SensorStatingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorStatingGetResponse

    /** @see get */
    fun get(params: SensorStatingGetParams): SensorStatingGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SensorStatingGetResponse =
        get(id, SensorStatingGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SensorStatingQueryhelpResponse = queryhelp(SensorStatingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorStatingQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none()
    ): SensorStatingQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SensorStatingQueryhelpResponse =
        queryhelp(SensorStatingQueryhelpParams.none(), requestOptions)

    /**
     * A view of [SensorStatingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorStatingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sensorstaging`, but is otherwise the same as
         * [SensorStatingService.create].
         */
        @MustBeClosed
        fun create(params: SensorStatingCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SensorStatingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/sensorstaging/{id}`, but is otherwise the same
         * as [SensorStatingService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SensorStatingUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SensorStatingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SensorStatingUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SensorStatingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging`, but is otherwise the same as
         * [SensorStatingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SensorStatingListPage> = list(SensorStatingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorStatingListParams = SensorStatingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorStatingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SensorStatingListParams = SensorStatingListParams.none()
        ): HttpResponseFor<SensorStatingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SensorStatingListPage> =
            list(SensorStatingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sensorstaging/{id}`, but is otherwise the
         * same as [SensorStatingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SensorStatingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SensorStatingDeleteParams = SensorStatingDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SensorStatingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SensorStatingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SensorStatingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/sensorstaging/createBulk`, but is otherwise
         * the same as [SensorStatingService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: SensorStatingCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: SensorStatingCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging/{id}`, but is otherwise the same
         * as [SensorStatingService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SensorStatingGetResponse> =
            get(id, SensorStatingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorStatingGetParams = SensorStatingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorStatingGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SensorStatingGetParams = SensorStatingGetParams.none(),
        ): HttpResponseFor<SensorStatingGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SensorStatingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorStatingGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SensorStatingGetParams): HttpResponseFor<SensorStatingGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorStatingGetResponse> =
            get(id, SensorStatingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sensorstaging/queryhelp`, but is otherwise the
         * same as [SensorStatingService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SensorStatingQueryhelpResponse> =
            queryhelp(SensorStatingQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorStatingQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SensorStatingQueryhelpParams = SensorStatingQueryhelpParams.none()
        ): HttpResponseFor<SensorStatingQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SensorStatingQueryhelpResponse> =
            queryhelp(SensorStatingQueryhelpParams.none(), requestOptions)
    }
}
