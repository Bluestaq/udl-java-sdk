// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.emireport.EmireportCountParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateBulkParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateParams
import com.unifieddatalibrary.api.models.emireport.EmireportGetParams
import com.unifieddatalibrary.api.models.emireport.EmireportGetResponse
import com.unifieddatalibrary.api.models.emireport.EmireportListPage
import com.unifieddatalibrary.api.models.emireport.EmireportListParams
import com.unifieddatalibrary.api.models.emireport.EmireportQueryhelpParams
import com.unifieddatalibrary.api.models.emireport.EmireportQueryhelpResponse
import com.unifieddatalibrary.api.models.emireport.EmireportTupleParams
import com.unifieddatalibrary.api.models.emireport.EmireportTupleResponse
import com.unifieddatalibrary.api.models.emireport.EmireportUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.emireport.HistoryService
import java.util.function.Consumer

interface EmireportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmireportService

    fun history(): HistoryService

    /**
     * Service operation to take a single EMIReport record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: EmireportCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmireportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EmireportListParams): EmireportListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EmireportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmireportListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EmireportCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EmireportCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of EMIReport records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: EmireportCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EmireportCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single EMIReport record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): EmireportGetResponse = get(id, EmireportGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: EmireportGetParams = EmireportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmireportGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: EmireportGetParams = EmireportGetParams.none(),
    ): EmireportGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EmireportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmireportGetResponse

    /** @see get */
    fun get(params: EmireportGetParams): EmireportGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): EmireportGetResponse =
        get(id, EmireportGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): EmireportQueryhelpResponse = queryhelp(EmireportQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: EmireportQueryhelpParams = EmireportQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmireportQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: EmireportQueryhelpParams = EmireportQueryhelpParams.none()
    ): EmireportQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): EmireportQueryhelpResponse =
        queryhelp(EmireportQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EmireportTupleParams): List<EmireportTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EmireportTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<EmireportTupleResponse>

    /**
     * Service operation to take multiple EMIReport records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: EmireportUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: EmireportUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [EmireportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmireportService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/emireport`, but is otherwise the same as
         * [EmireportService.create].
         */
        @MustBeClosed
        fun create(params: EmireportCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmireportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/emireport`, but is otherwise the same as
         * [EmireportService.list].
         */
        @MustBeClosed
        fun list(params: EmireportListParams): HttpResponseFor<EmireportListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmireportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmireportListPage>

        /**
         * Returns a raw HTTP response for `get /udl/emireport/count`, but is otherwise the same as
         * [EmireportService.count].
         */
        @MustBeClosed
        fun count(params: EmireportCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: EmireportCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/emireport/createBulk`, but is otherwise the
         * same as [EmireportService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: EmireportCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: EmireportCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/emireport/{id}`, but is otherwise the same as
         * [EmireportService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<EmireportGetResponse> =
            get(id, EmireportGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: EmireportGetParams = EmireportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmireportGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: EmireportGetParams = EmireportGetParams.none(),
        ): HttpResponseFor<EmireportGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EmireportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmireportGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: EmireportGetParams): HttpResponseFor<EmireportGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<EmireportGetResponse> =
            get(id, EmireportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/emireport/queryhelp`, but is otherwise the same
         * as [EmireportService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<EmireportQueryhelpResponse> =
            queryhelp(EmireportQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EmireportQueryhelpParams = EmireportQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmireportQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: EmireportQueryhelpParams = EmireportQueryhelpParams.none()
        ): HttpResponseFor<EmireportQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<EmireportQueryhelpResponse> =
            queryhelp(EmireportQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/emireport/tuple`, but is otherwise the same as
         * [EmireportService.tuple].
         */
        @MustBeClosed
        fun tuple(params: EmireportTupleParams): HttpResponseFor<List<EmireportTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: EmireportTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<EmireportTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-emireport`, but is otherwise the same
         * as [EmireportService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: EmireportUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: EmireportUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
