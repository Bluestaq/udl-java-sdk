// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCountParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCreateParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListPage
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetQueryhelpResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleResponse
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.deconflictset.HistoryService
import java.util.function.Consumer

interface DeconflictsetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeconflictsetService

    fun history(): HistoryService

    /**
     * Service operation to take a single DeconflictSet record as a POST body and ingest into the
     * database. This operation does not persist any DeconflictWindow datatypes that may be present
     * in the body of the request. This operation is not intended to be used for automated feeds
     * into UDL. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DeconflictsetCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DeconflictsetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: DeconflictsetListParams): DeconflictsetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DeconflictsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeconflictsetListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: DeconflictsetCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: DeconflictsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to get a single DeconflictSet record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): DeconflictsetGetResponse = get(id, DeconflictsetGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeconflictsetGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
    ): DeconflictsetGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DeconflictsetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeconflictsetGetResponse

    /** @see get */
    fun get(params: DeconflictsetGetParams): DeconflictsetGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): DeconflictsetGetResponse =
        get(id, DeconflictsetGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): DeconflictsetQueryhelpResponse = queryhelp(DeconflictsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeconflictsetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none()
    ): DeconflictsetQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): DeconflictsetQueryhelpResponse =
        queryhelp(DeconflictsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DeconflictsetTupleParams): List<DeconflictsetTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DeconflictsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DeconflictsetTupleResponse>

    /**
     * Service operation to take a single DeconflictSet record as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: DeconflictsetUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DeconflictsetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DeconflictsetService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeconflictsetService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/deconflictset`, but is otherwise the same as
         * [DeconflictsetService.create].
         */
        @MustBeClosed
        fun create(params: DeconflictsetCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DeconflictsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset`, but is otherwise the same as
         * [DeconflictsetService.list].
         */
        @MustBeClosed
        fun list(params: DeconflictsetListParams): HttpResponseFor<DeconflictsetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DeconflictsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeconflictsetListPage>

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/count`, but is otherwise the same
         * as [DeconflictsetService.count].
         */
        @MustBeClosed
        fun count(params: DeconflictsetCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: DeconflictsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/{id}`, but is otherwise the same
         * as [DeconflictsetService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<DeconflictsetGetResponse> =
            get(id, DeconflictsetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeconflictsetGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: DeconflictsetGetParams = DeconflictsetGetParams.none(),
        ): HttpResponseFor<DeconflictsetGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DeconflictsetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeconflictsetGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: DeconflictsetGetParams): HttpResponseFor<DeconflictsetGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeconflictsetGetResponse> =
            get(id, DeconflictsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/queryhelp`, but is otherwise the
         * same as [DeconflictsetService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<DeconflictsetQueryhelpResponse> =
            queryhelp(DeconflictsetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeconflictsetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: DeconflictsetQueryhelpParams = DeconflictsetQueryhelpParams.none()
        ): HttpResponseFor<DeconflictsetQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<DeconflictsetQueryhelpResponse> =
            queryhelp(DeconflictsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/deconflictset/tuple`, but is otherwise the same
         * as [DeconflictsetService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: DeconflictsetTupleParams
        ): HttpResponseFor<List<DeconflictsetTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: DeconflictsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DeconflictsetTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-deconflictset`, but is otherwise the
         * same as [DeconflictsetService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: DeconflictsetUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: DeconflictsetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
