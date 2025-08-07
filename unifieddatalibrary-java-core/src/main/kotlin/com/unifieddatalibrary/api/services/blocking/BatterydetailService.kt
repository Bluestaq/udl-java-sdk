// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BatterydetailsFull
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailCreateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailDeleteParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListPage
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailListParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailRetrieveParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailUpdateParams
import java.util.function.Consumer

interface BatterydetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatterydetailService

    /**
     * Service operation to take a single BatteryDetails as a POST body and ingest into the
     * database. A Battery record may have multiple details records from several sources. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BatterydetailCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatterydetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single BatteryDetails record by its unique ID passed as a path
     * parameter. A Battery record may have multiple details records from several sources.
     */
    fun retrieve(id: String): BatterydetailsFull = retrieve(id, BatterydetailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatterydetailsFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
    ): BatterydetailsFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatterydetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatterydetailsFull

    /** @see retrieve */
    fun retrieve(params: BatterydetailRetrieveParams): BatterydetailsFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BatterydetailsFull =
        retrieve(id, BatterydetailRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single BatteryDetails. A Battery record may have multiple
     * details records from several sources. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BatterydetailUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BatterydetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BatterydetailUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatterydetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): BatterydetailListPage = list(BatterydetailListParams.none())

    /** @see list */
    fun list(
        params: BatterydetailListParams = BatterydetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatterydetailListPage

    /** @see list */
    fun list(
        params: BatterydetailListParams = BatterydetailListParams.none()
    ): BatterydetailListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BatterydetailListPage =
        list(BatterydetailListParams.none(), requestOptions)

    /**
     * Service operation to delete a BatteryDetails object specified by the passed ID path
     * parameter. A Battery record may have multiple details records from several sources. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, BatterydetailDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: BatterydetailDeleteParams = BatterydetailDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatterydetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: BatterydetailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BatterydetailDeleteParams.none(), requestOptions)

    /**
     * A view of [BatterydetailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatterydetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/batterydetails`, but is otherwise the same as
         * [BatterydetailService.create].
         */
        @MustBeClosed
        fun create(params: BatterydetailCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatterydetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/batterydetails/{id}`, but is otherwise the same
         * as [BatterydetailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BatterydetailsFull> =
            retrieve(id, BatterydetailRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatterydetailsFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BatterydetailRetrieveParams = BatterydetailRetrieveParams.none(),
        ): HttpResponseFor<BatterydetailsFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BatterydetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatterydetailsFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BatterydetailRetrieveParams): HttpResponseFor<BatterydetailsFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatterydetailsFull> =
            retrieve(id, BatterydetailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/batterydetails/{id}`, but is otherwise the same
         * as [BatterydetailService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: BatterydetailUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: BatterydetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BatterydetailUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatterydetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/batterydetails`, but is otherwise the same as
         * [BatterydetailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BatterydetailListPage> = list(BatterydetailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatterydetailListParams = BatterydetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatterydetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatterydetailListParams = BatterydetailListParams.none()
        ): HttpResponseFor<BatterydetailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BatterydetailListPage> =
            list(BatterydetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/batterydetails/{id}`, but is otherwise the
         * same as [BatterydetailService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, BatterydetailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BatterydetailDeleteParams = BatterydetailDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatterydetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BatterydetailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BatterydetailDeleteParams.none(), requestOptions)
    }
}
