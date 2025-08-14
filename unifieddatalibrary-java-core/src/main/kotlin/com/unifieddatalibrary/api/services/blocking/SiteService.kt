// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.site.SiteCountParams
import com.unifieddatalibrary.api.models.site.SiteCreateParams
import com.unifieddatalibrary.api.models.site.SiteGetParams
import com.unifieddatalibrary.api.models.site.SiteGetResponse
import com.unifieddatalibrary.api.models.site.SiteListPage
import com.unifieddatalibrary.api.models.site.SiteListParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpParams
import com.unifieddatalibrary.api.models.site.SiteQueryhelpResponse
import com.unifieddatalibrary.api.models.site.SiteTupleParams
import com.unifieddatalibrary.api.models.site.SiteTupleResponse
import com.unifieddatalibrary.api.models.site.SiteUpdateParams
import com.unifieddatalibrary.api.services.blocking.site.OperationService
import java.util.function.Consumer

interface SiteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteService

    fun operations(): OperationService

    /**
     * Service operation to take a single Site as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: SiteCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: SiteCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to update a single Site. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SiteUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SiteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SiteUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: SiteUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SiteListPage = list(SiteListParams.none())

    /** @see list */
    fun list(
        params: SiteListParams = SiteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteListPage

    /** @see list */
    fun list(params: SiteListParams = SiteListParams.none()): SiteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SiteListPage =
        list(SiteListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SiteCountParams.none())

    /** @see count */
    fun count(
        params: SiteCountParams = SiteCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SiteCountParams = SiteCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SiteCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Site record by its unique ID passed as a path parameter.
     */
    fun get(id: String): SiteGetResponse = get(id, SiteGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SiteGetParams = SiteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: SiteGetParams = SiteGetParams.none()): SiteGetResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SiteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteGetResponse

    /** @see get */
    fun get(params: SiteGetParams): SiteGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SiteGetResponse =
        get(id, SiteGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SiteQueryhelpResponse = queryhelp(SiteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SiteQueryhelpParams = SiteQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: SiteQueryhelpParams = SiteQueryhelpParams.none()): SiteQueryhelpResponse =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SiteQueryhelpResponse =
        queryhelp(SiteQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SiteTupleParams): List<SiteTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SiteTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SiteTupleResponse>

    /** A view of [SiteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteService.WithRawResponse

        fun operations(): OperationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/site`, but is otherwise the same as
         * [SiteService.create].
         */
        @MustBeClosed
        fun create(params: SiteCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SiteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/site/{id}`, but is otherwise the same as
         * [SiteService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SiteUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SiteUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/site`, but is otherwise the same as
         * [SiteService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SiteListPage> = list(SiteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SiteListParams = SiteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SiteListParams = SiteListParams.none()): HttpResponseFor<SiteListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SiteListPage> =
            list(SiteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/site/count`, but is otherwise the same as
         * [SiteService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(SiteCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SiteCountParams = SiteCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: SiteCountParams = SiteCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SiteCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/site/{id}`, but is otherwise the same as
         * [SiteService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SiteGetResponse> = get(id, SiteGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteGetParams = SiteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteGetParams = SiteGetParams.none(),
        ): HttpResponseFor<SiteGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SiteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SiteGetParams): HttpResponseFor<SiteGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<SiteGetResponse> =
            get(id, SiteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/site/queryhelp`, but is otherwise the same as
         * [SiteService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SiteQueryhelpResponse> =
            queryhelp(SiteQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteQueryhelpParams = SiteQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteQueryhelpParams = SiteQueryhelpParams.none()
        ): HttpResponseFor<SiteQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<SiteQueryhelpResponse> =
            queryhelp(SiteQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/site/tuple`, but is otherwise the same as
         * [SiteService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SiteTupleParams): HttpResponseFor<List<SiteTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SiteTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SiteTupleResponse>>
    }
}
