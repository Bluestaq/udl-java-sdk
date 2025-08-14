// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitThrusterFull
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterCreateParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterDeleteParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterGetParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListPage
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterListParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterUpdateParams
import java.util.function.Consumer

interface OnorbitthrusterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterService

    /**
     * Service operation to take a single OnorbitThruster as a POST body and ingest into the
     * database. An OnorbitThruster is the association between an on-orbit spacecraft's engine and a
     * particular on-orbit spacecraft. An Engine type may be associated with many different on-orbit
     * spacecraft. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitthrusterCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitthrusterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single OnorbitThruster. An OnorbitThruster is the association
     * between an on-orbit spacecraft's engine and a particular on-orbit spacecraft. An Engine type
     * may be associated with many different on-orbit spacecraft. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OnorbitthrusterUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OnorbitthrusterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitthrusterUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbitthrusterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OnorbitthrusterListPage = list(OnorbitthrusterListParams.none())

    /** @see list */
    fun list(
        params: OnorbitthrusterListParams = OnorbitthrusterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitthrusterListPage

    /** @see list */
    fun list(
        params: OnorbitthrusterListParams = OnorbitthrusterListParams.none()
    ): OnorbitthrusterListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitthrusterListPage =
        list(OnorbitthrusterListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitThruster object specified by the passed ID path
     * parameter. An OnorbitThruster is the association between an on-orbit spacecraft's engine and
     * a particular on-orbit spacecraft. An Engine type may be associated with many different
     * on-orbit spacecraft. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, OnorbitthrusterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitthrusterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OnorbitthrusterDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OnorbitthrusterDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single OnorbitThruster record by its unique ID passed as a path
     * parameter. An OnorbitThruster is the association between an on-orbit spacecraft's engine and
     * a particular on-orbit spacecraft. An Engine type may be associated with many different
     * on-orbit spacecraft.
     */
    fun get(id: String): OnorbitThrusterFull = get(id, OnorbitthrusterGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitThrusterFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(),
    ): OnorbitThrusterFull = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitthrusterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitThrusterFull

    /** @see get */
    fun get(params: OnorbitthrusterGetParams): OnorbitThrusterFull =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitThrusterFull =
        get(id, OnorbitthrusterGetParams.none(), requestOptions)

    /**
     * A view of [OnorbitthrusterService] that provides access to raw HTTP responses for each
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
        ): OnorbitthrusterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitthruster`, but is otherwise the same as
         * [OnorbitthrusterService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitthrusterCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitthrusterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/onorbitthruster/{id}`, but is otherwise the
         * same as [OnorbitthrusterService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitthrusterUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: OnorbitthrusterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitthrusterUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnorbitthrusterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthruster`, but is otherwise the same as
         * [OnorbitthrusterService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitthrusterListPage> =
            list(OnorbitthrusterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitthrusterListParams = OnorbitthrusterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitthrusterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitthrusterListParams = OnorbitthrusterListParams.none()
        ): HttpResponseFor<OnorbitthrusterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitthrusterListPage> =
            list(OnorbitthrusterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitthruster/{id}`, but is otherwise the
         * same as [OnorbitthrusterService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OnorbitthrusterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitthrusterDeleteParams = OnorbitthrusterDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnorbitthrusterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitthrusterDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OnorbitthrusterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthruster/{id}`, but is otherwise the
         * same as [OnorbitthrusterService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitThrusterFull> =
            get(id, OnorbitthrusterGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitThrusterFull> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitthrusterGetParams = OnorbitthrusterGetParams.none(),
        ): HttpResponseFor<OnorbitThrusterFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitthrusterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitThrusterFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitthrusterGetParams): HttpResponseFor<OnorbitThrusterFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitThrusterFull> =
            get(id, OnorbitthrusterGetParams.none(), requestOptions)
    }
}
