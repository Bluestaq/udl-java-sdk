// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.port.PortCountParams
import com.unifieddatalibrary.api.models.port.PortCreateBulkParams
import com.unifieddatalibrary.api.models.port.PortCreateParams
import com.unifieddatalibrary.api.models.port.PortGetParams
import com.unifieddatalibrary.api.models.port.PortGetResponse
import com.unifieddatalibrary.api.models.port.PortListPage
import com.unifieddatalibrary.api.models.port.PortListParams
import com.unifieddatalibrary.api.models.port.PortQueryhelpParams
import com.unifieddatalibrary.api.models.port.PortQueryhelpResponse
import com.unifieddatalibrary.api.models.port.PortTupleParams
import com.unifieddatalibrary.api.models.port.PortTupleResponse
import com.unifieddatalibrary.api.models.port.PortUpdateParams
import java.util.function.Consumer

interface PortService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortService

    /**
     * Service operation to take a single port record as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: PortCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: PortCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single port record. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: PortUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: PortUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: PortUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: PortUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): PortListPage = list(PortListParams.none())

    /** @see list */
    fun list(
        params: PortListParams = PortListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortListPage

    /** @see list */
    fun list(params: PortListParams = PortListParams.none()): PortListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortListPage =
        list(PortListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(PortCountParams.none())

    /** @see count */
    fun count(
        params: PortCountParams = PortCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: PortCountParams = PortCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(PortCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of port records as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: PortCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: PortCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single port record by its unique ID passed as a path parameter.
     */
    fun get(id: String): PortGetResponse = get(id, PortGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: PortGetParams = PortGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: PortGetParams = PortGetParams.none()): PortGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortGetResponse

    /** @see get */
    fun get(params: PortGetParams): PortGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): PortGetResponse =
        get(id, PortGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): PortQueryhelpResponse = queryhelp(PortQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: PortQueryhelpParams = PortQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: PortQueryhelpParams = PortQueryhelpParams.none()): PortQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): PortQueryhelpResponse =
        queryhelp(PortQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: PortTupleParams): List<PortTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: PortTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PortTupleResponse>

    /** A view of [PortService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/port`, but is otherwise the same as
         * [PortService.create].
         */
        @MustBeClosed
        fun create(params: PortCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PortCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/port/{id}`, but is otherwise the same as
         * [PortService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: PortUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: PortUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PortUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PortUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/port`, but is otherwise the same as
         * [PortService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PortListPage> = list(PortListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortListParams = PortListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PortListParams = PortListParams.none()): HttpResponseFor<PortListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PortListPage> =
            list(PortListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/count`, but is otherwise the same as
         * [PortService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(PortCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: PortCountParams = PortCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: PortCountParams = PortCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(PortCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/port/createBulk`, but is otherwise the same as
         * [PortService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: PortCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: PortCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/port/{id}`, but is otherwise the same as
         * [PortService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<PortGetResponse> = get(id, PortGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PortGetParams = PortGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PortGetParams = PortGetParams.none(),
        ): HttpResponseFor<PortGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PortGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: PortGetParams): HttpResponseFor<PortGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<PortGetResponse> =
            get(id, PortGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/queryhelp`, but is otherwise the same as
         * [PortService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<PortQueryhelpResponse> =
            queryhelp(PortQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PortQueryhelpParams = PortQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PortQueryhelpParams = PortQueryhelpParams.none()
        ): HttpResponseFor<PortQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<PortQueryhelpResponse> =
            queryhelp(PortQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/port/tuple`, but is otherwise the same as
         * [PortService.tuple].
         */
        @MustBeClosed
        fun tuple(params: PortTupleParams): HttpResponseFor<List<PortTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: PortTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PortTupleResponse>>
    }
}
