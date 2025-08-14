// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCountParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateBulkParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportCreateParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportGetResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListPage
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportListParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportQueryhelpResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportUpdateParams
import com.unifieddatalibrary.api.services.blocking.logisticssupport.HistoryService
import java.util.function.Consumer

interface LogisticsSupportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogisticsSupportService

    fun history(): HistoryService

    /**
     * Service operation to take a single LogisticsSupport record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: LogisticsSupportCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LogisticsSupportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single LogisticsSupport record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LogisticsSupportUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LogisticsSupportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LogisticsSupportUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LogisticsSupportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LogisticsSupportListPage = list(LogisticsSupportListParams.none())

    /** @see list */
    fun list(
        params: LogisticsSupportListParams = LogisticsSupportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogisticsSupportListPage

    /** @see list */
    fun list(
        params: LogisticsSupportListParams = LogisticsSupportListParams.none()
    ): LogisticsSupportListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LogisticsSupportListPage =
        list(LogisticsSupportListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(LogisticsSupportCountParams.none())

    /** @see count */
    fun count(
        params: LogisticsSupportCountParams = LogisticsSupportCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: LogisticsSupportCountParams = LogisticsSupportCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(LogisticsSupportCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of LogisticsSupport
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: LogisticsSupportCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: LogisticsSupportCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single LogisticsSupport record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): LogisticsSupportGetResponse = get(id, LogisticsSupportGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogisticsSupportGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(),
    ): LogisticsSupportGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LogisticsSupportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogisticsSupportGetResponse

    /** @see get */
    fun get(params: LogisticsSupportGetParams): LogisticsSupportGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LogisticsSupportGetResponse =
        get(id, LogisticsSupportGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LogisticsSupportQueryhelpResponse =
        queryhelp(LogisticsSupportQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogisticsSupportQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none()
    ): LogisticsSupportQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LogisticsSupportQueryhelpResponse =
        queryhelp(LogisticsSupportQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LogisticsSupportTupleParams): List<LogisticsSupportTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LogisticsSupportTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LogisticsSupportTupleResponse>

    /**
     * Service operation to take multiple logisticssupport records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: LogisticsSupportUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LogisticsSupportService] that provides access to raw HTTP responses for each
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
        ): LogisticsSupportService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/logisticssupport`, but is otherwise the same
         * as [LogisticsSupportService.create].
         */
        @MustBeClosed
        fun create(params: LogisticsSupportCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LogisticsSupportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/logisticssupport/{id}`, but is otherwise the
         * same as [LogisticsSupportService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LogisticsSupportUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LogisticsSupportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LogisticsSupportUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LogisticsSupportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport`, but is otherwise the same as
         * [LogisticsSupportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LogisticsSupportListPage> =
            list(LogisticsSupportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogisticsSupportListParams = LogisticsSupportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogisticsSupportListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogisticsSupportListParams = LogisticsSupportListParams.none()
        ): HttpResponseFor<LogisticsSupportListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LogisticsSupportListPage> =
            list(LogisticsSupportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/count`, but is otherwise the
         * same as [LogisticsSupportService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(LogisticsSupportCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LogisticsSupportCountParams = LogisticsSupportCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: LogisticsSupportCountParams = LogisticsSupportCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(LogisticsSupportCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/logisticssupport/createBulk`, but is otherwise
         * the same as [LogisticsSupportService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: LogisticsSupportCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: LogisticsSupportCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/{id}`, but is otherwise the
         * same as [LogisticsSupportService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LogisticsSupportGetResponse> =
            get(id, LogisticsSupportGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogisticsSupportGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LogisticsSupportGetParams = LogisticsSupportGetParams.none(),
        ): HttpResponseFor<LogisticsSupportGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LogisticsSupportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogisticsSupportGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LogisticsSupportGetParams): HttpResponseFor<LogisticsSupportGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogisticsSupportGetResponse> =
            get(id, LogisticsSupportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/queryhelp`, but is otherwise
         * the same as [LogisticsSupportService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LogisticsSupportQueryhelpResponse> =
            queryhelp(LogisticsSupportQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogisticsSupportQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LogisticsSupportQueryhelpParams = LogisticsSupportQueryhelpParams.none()
        ): HttpResponseFor<LogisticsSupportQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<LogisticsSupportQueryhelpResponse> =
            queryhelp(LogisticsSupportQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/logisticssupport/tuple`, but is otherwise the
         * same as [LogisticsSupportService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: LogisticsSupportTupleParams
        ): HttpResponseFor<List<LogisticsSupportTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LogisticsSupportTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LogisticsSupportTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-logisticssupport`, but is otherwise
         * the same as [LogisticsSupportService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: LogisticsSupportUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: LogisticsSupportUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
