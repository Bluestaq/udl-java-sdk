// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitAntennaFull
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaCreateParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaDeleteParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaGetParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListPage
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaUpdateParams
import java.util.function.Consumer

interface OnorbitantennaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitantennaService

    /**
     * Service operation to take a single OnorbitAntenna as a POST body and ingest into the
     * database. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a
     * particular on-orbit spacecraft. An antenna type may be associated with many different
     * on-orbit spacecraft. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: OnorbitantennaCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitantennaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single OnorbitAntenna. An OnorbitAntenna is the association
     * between on-orbit spacecraft antennas and a particular on-orbit spacecraft. An antenna type
     * may be associated with many different on-orbit spacecraft. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OnorbitantennaUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OnorbitantennaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitantennaUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbitantennaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OnorbitantennaListPage = list(OnorbitantennaListParams.none())

    /** @see list */
    fun list(
        params: OnorbitantennaListParams = OnorbitantennaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitantennaListPage

    /** @see list */
    fun list(
        params: OnorbitantennaListParams = OnorbitantennaListParams.none()
    ): OnorbitantennaListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitantennaListPage =
        list(OnorbitantennaListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitAntenna object specified by the passed ID path
     * parameter. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a
     * particular on-orbit spacecraft. An antenna type may be associated with many different
     * on-orbit spacecraft. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, OnorbitantennaDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitantennaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OnorbitantennaDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OnorbitantennaDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single OnorbitAntenna record by its unique ID passed as a path
     * parameter. An OnorbitAntenna is the association between on-orbit spacecraft antennas and a
     * particular on-orbit spacecraft. An antenna type may be associated with many different
     * on-orbit spacecraft.
     */
    fun get(id: String): OnorbitAntennaFull = get(id, OnorbitantennaGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitAntennaFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(),
    ): OnorbitAntennaFull = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitantennaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitAntennaFull

    /** @see get */
    fun get(params: OnorbitantennaGetParams): OnorbitAntennaFull =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitAntennaFull =
        get(id, OnorbitantennaGetParams.none(), requestOptions)

    /**
     * A view of [OnorbitantennaService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbitantennaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitantenna`, but is otherwise the same as
         * [OnorbitantennaService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitantennaCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitantennaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/onorbitantenna/{id}`, but is otherwise the same
         * as [OnorbitantennaService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitantennaUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: OnorbitantennaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitantennaUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnorbitantennaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitantenna`, but is otherwise the same as
         * [OnorbitantennaService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitantennaListPage> = list(OnorbitantennaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitantennaListParams = OnorbitantennaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitantennaListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitantennaListParams = OnorbitantennaListParams.none()
        ): HttpResponseFor<OnorbitantennaListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitantennaListPage> =
            list(OnorbitantennaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitantenna/{id}`, but is otherwise the
         * same as [OnorbitantennaService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OnorbitantennaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitantennaDeleteParams = OnorbitantennaDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnorbitantennaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitantennaDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OnorbitantennaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitantenna/{id}`, but is otherwise the same
         * as [OnorbitantennaService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitAntennaFull> =
            get(id, OnorbitantennaGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitAntennaFull> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitantennaGetParams = OnorbitantennaGetParams.none(),
        ): HttpResponseFor<OnorbitAntennaFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitantennaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitAntennaFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitantennaGetParams): HttpResponseFor<OnorbitAntennaFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OnorbitAntennaFull> =
            get(id, OnorbitantennaGetParams.none(), requestOptions)
    }
}
