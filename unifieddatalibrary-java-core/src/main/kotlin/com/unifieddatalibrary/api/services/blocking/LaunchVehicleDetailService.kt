// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailCreateParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailDeleteParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailGetParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailGetResponse
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailListPage
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailListParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailUpdateParams
import java.util.function.Consumer

interface LaunchVehicleDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchVehicleDetailService

    /**
     * Service operation to take a single LaunchVehicleDetails as a POST body and ingest into the
     * database. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LaunchVehicleDetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchVehicleDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single LaunchVehicleDetails. LaunchVehicleDetails represents
     * launch vehicle details and characteristics, compiled by a particular source. A vehicle may
     * have multiple details records from various sources. A specific role is required to perform
     * this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchVehicleDetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchVehicleDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchVehicleDetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchVehicleDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LaunchVehicleDetailListPage = list(LaunchVehicleDetailListParams.none())

    /** @see list */
    fun list(
        params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchVehicleDetailListPage

    /** @see list */
    fun list(
        params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none()
    ): LaunchVehicleDetailListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LaunchVehicleDetailListPage =
        list(LaunchVehicleDetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a LaunchVehicleDetails object specified by the passed ID path
     * parameter. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, LaunchVehicleDetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchVehicleDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LaunchVehicleDetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LaunchVehicleDetailDeleteParams.none(), requestOptions)

    /**
     * Service operation to get a single LaunchVehicleDetails record by its unique ID passed as a
     * path parameter. LaunchVehicleDetails represents launch vehicle details and characteristics,
     * compiled by a particular source. A vehicle may have multiple details records from various
     * sources.
     */
    fun get(id: String): LaunchVehicleDetailGetResponse =
        get(id, LaunchVehicleDetailGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchVehicleDetailGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
    ): LaunchVehicleDetailGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchVehicleDetailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchVehicleDetailGetResponse

    /** @see get */
    fun get(params: LaunchVehicleDetailGetParams): LaunchVehicleDetailGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchVehicleDetailGetResponse =
        get(id, LaunchVehicleDetailGetParams.none(), requestOptions)

    /**
     * A view of [LaunchVehicleDetailService] that provides access to raw HTTP responses for each
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
        ): LaunchVehicleDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchvehicledetails`, but is otherwise the
         * same as [LaunchVehicleDetailService.create].
         */
        @MustBeClosed
        fun create(params: LaunchVehicleDetailCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LaunchVehicleDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LaunchVehicleDetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LaunchVehicleDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchVehicleDetailUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LaunchVehicleDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicledetails`, but is otherwise the
         * same as [LaunchVehicleDetailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LaunchVehicleDetailListPage> =
            list(LaunchVehicleDetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchVehicleDetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchVehicleDetailListParams = LaunchVehicleDetailListParams.none()
        ): HttpResponseFor<LaunchVehicleDetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaunchVehicleDetailListPage> =
            list(LaunchVehicleDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LaunchVehicleDetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchVehicleDetailDeleteParams = LaunchVehicleDetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LaunchVehicleDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchVehicleDetailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LaunchVehicleDetailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchvehicledetails/{id}`, but is otherwise
         * the same as [LaunchVehicleDetailService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchVehicleDetailGetResponse> =
            get(id, LaunchVehicleDetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchVehicleDetailGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchVehicleDetailGetParams = LaunchVehicleDetailGetParams.none(),
        ): HttpResponseFor<LaunchVehicleDetailGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaunchVehicleDetailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchVehicleDetailGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaunchVehicleDetailGetParams
        ): HttpResponseFor<LaunchVehicleDetailGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchVehicleDetailGetResponse> =
            get(id, LaunchVehicleDetailGetParams.none(), requestOptions)
    }
}
