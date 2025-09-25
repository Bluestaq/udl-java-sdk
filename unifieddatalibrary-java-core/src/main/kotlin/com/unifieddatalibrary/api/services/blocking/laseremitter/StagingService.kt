// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.laseremitter

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateBulkParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingDeleteParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingListPage
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingListParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingQueryhelpParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingQueryhelpResponse
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingRetrieveParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingRetrieveResponse
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingUpdateParams
import java.util.function.Consumer

interface StagingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StagingService

    /**
     * Service operation to take a single LaserEmitterStaging record as a POST body and ingest into
     * the staging database. This API allows users to create, manage, and review LaserEmitterStaging
     * records in a staging environment before their incorporation into the production UDL. It
     * supports workflows involving validation, review, and approval of emitter data to ensure
     * consistency, compliance, and data quality. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun create(params: StagingCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: StagingCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single LaserEmitterStaging record by its unique ID passed as a
     * path parameter.
     */
    fun retrieve(id: String): StagingRetrieveResponse = retrieve(id, StagingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StagingRetrieveParams = StagingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StagingRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StagingRetrieveParams = StagingRetrieveParams.none(),
    ): StagingRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StagingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StagingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: StagingRetrieveParams): StagingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): StagingRetrieveResponse =
        retrieve(id, StagingRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single LaserEmitterStaging record. A specific role is required
     * to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: StagingUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: StagingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: StagingUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: StagingUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): StagingListPage = list(StagingListParams.none())

    /** @see list */
    fun list(
        params: StagingListParams = StagingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StagingListPage

    /** @see list */
    fun list(params: StagingListParams = StagingListParams.none()): StagingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): StagingListPage =
        list(StagingListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaserEmitterStaging record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, StagingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StagingDeleteParams = StagingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: StagingDeleteParams = StagingDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: StagingDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: StagingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, StagingDeleteParams.none(), requestOptions)

    /**
     * Service operation to take multiple LaserEmitterStaging records as a POST body and ingest into
     * the staging database. This API allows users to create, manage, and review LaserEmitterStaging
     * records in a staging environment before their incorporation into the production UDL. It
     * supports workflows involving validation, review, and approval of emitter data to ensure
     * consistency, compliance, and data quality. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun createBulk(params: StagingCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: StagingCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): StagingQueryhelpResponse = queryhelp(StagingQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: StagingQueryhelpParams = StagingQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StagingQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: StagingQueryhelpParams = StagingQueryhelpParams.none()
    ): StagingQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): StagingQueryhelpResponse =
        queryhelp(StagingQueryhelpParams.none(), requestOptions)

    /** A view of [StagingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StagingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/laseremitterstaging`, but is otherwise the
         * same as [StagingService.create].
         */
        @MustBeClosed
        fun create(params: StagingCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: StagingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/laseremitterstaging/{id}`, but is otherwise the
         * same as [StagingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<StagingRetrieveResponse> =
            retrieve(id, StagingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StagingRetrieveParams = StagingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StagingRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StagingRetrieveParams = StagingRetrieveParams.none(),
        ): HttpResponseFor<StagingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StagingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StagingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: StagingRetrieveParams): HttpResponseFor<StagingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StagingRetrieveResponse> =
            retrieve(id, StagingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/laseremitterstaging/{id}`, but is otherwise the
         * same as [StagingService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: StagingUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: StagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: StagingUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StagingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/laseremitterstaging`, but is otherwise the same
         * as [StagingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<StagingListPage> = list(StagingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StagingListParams = StagingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StagingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: StagingListParams = StagingListParams.none()
        ): HttpResponseFor<StagingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StagingListPage> =
            list(StagingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/laseremitterstaging/{id}`, but is otherwise
         * the same as [StagingService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, StagingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: StagingDeleteParams = StagingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: StagingDeleteParams = StagingDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StagingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: StagingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, StagingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/laseremitterstaging/createBulk`, but is
         * otherwise the same as [StagingService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: StagingCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: StagingCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/laseremitterstaging/queryhelp`, but is
         * otherwise the same as [StagingService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<StagingQueryhelpResponse> =
            queryhelp(StagingQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: StagingQueryhelpParams = StagingQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StagingQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: StagingQueryhelpParams = StagingQueryhelpParams.none()
        ): HttpResponseFor<StagingQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<StagingQueryhelpResponse> =
            queryhelp(StagingQueryhelpParams.none(), requestOptions)
    }
}
