// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteDeleteParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListPage
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleResponse
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import java.util.function.Consumer

interface LaunchSiteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LaunchSiteService

    /**
     * Service operation to take a single launch site as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: LaunchSiteCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LaunchSiteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a launch. A specific role is required to perform this service
     * operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: LaunchSiteUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: LaunchSiteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: LaunchSiteUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LaunchSiteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): LaunchSiteListPage = list(LaunchSiteListParams.none())

    /** @see list */
    fun list(
        params: LaunchSiteListParams = LaunchSiteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchSiteListPage

    /** @see list */
    fun list(params: LaunchSiteListParams = LaunchSiteListParams.none()): LaunchSiteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LaunchSiteListPage =
        list(LaunchSiteListParams.none(), requestOptions)

    /**
     * Service operation to delete a launch site specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, LaunchSiteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LaunchSiteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LaunchSiteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LaunchSiteDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(LaunchSiteCountParams.none())

    /** @see count */
    fun count(
        params: LaunchSiteCountParams = LaunchSiteCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: LaunchSiteCountParams = LaunchSiteCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(LaunchSiteCountParams.none(), requestOptions)

    /**
     * Service operation to get a single launch site by its unique ID passed as a path parameter.
     */
    fun get(id: String): LaunchSiteGetResponse = get(id, LaunchSiteGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchSiteGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
    ): LaunchSiteGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LaunchSiteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchSiteGetResponse

    /** @see get */
    fun get(params: LaunchSiteGetParams): LaunchSiteGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): LaunchSiteGetResponse =
        get(id, LaunchSiteGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): LaunchSiteQueryhelpResponse = queryhelp(LaunchSiteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LaunchSiteQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none()
    ): LaunchSiteQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): LaunchSiteQueryhelpResponse =
        queryhelp(LaunchSiteQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: LaunchSiteTupleParams): List<LaunchSiteTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: LaunchSiteTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<LaunchSiteTupleResponse>

    /** A view of [LaunchSiteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LaunchSiteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/launchsite`, but is otherwise the same as
         * [LaunchSiteService.create].
         */
        @MustBeClosed
        fun create(params: LaunchSiteCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LaunchSiteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/launchsite/{id}`, but is otherwise the same as
         * [LaunchSiteService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: LaunchSiteUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: LaunchSiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LaunchSiteUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LaunchSiteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/launchsite`, but is otherwise the same as
         * [LaunchSiteService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LaunchSiteListPage> = list(LaunchSiteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchSiteListParams = LaunchSiteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchSiteListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LaunchSiteListParams = LaunchSiteListParams.none()
        ): HttpResponseFor<LaunchSiteListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LaunchSiteListPage> =
            list(LaunchSiteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/launchsite/{id}`, but is otherwise the same
         * as [LaunchSiteService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LaunchSiteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LaunchSiteDeleteParams = LaunchSiteDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LaunchSiteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LaunchSiteDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LaunchSiteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/count`, but is otherwise the same as
         * [LaunchSiteService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(LaunchSiteCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaunchSiteCountParams = LaunchSiteCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: LaunchSiteCountParams = LaunchSiteCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(LaunchSiteCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/{id}`, but is otherwise the same as
         * [LaunchSiteService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<LaunchSiteGetResponse> =
            get(id, LaunchSiteGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchSiteGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: LaunchSiteGetParams = LaunchSiteGetParams.none(),
        ): HttpResponseFor<LaunchSiteGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LaunchSiteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchSiteGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: LaunchSiteGetParams): HttpResponseFor<LaunchSiteGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LaunchSiteGetResponse> =
            get(id, LaunchSiteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/queryhelp`, but is otherwise the
         * same as [LaunchSiteService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<LaunchSiteQueryhelpResponse> =
            queryhelp(LaunchSiteQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LaunchSiteQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: LaunchSiteQueryhelpParams = LaunchSiteQueryhelpParams.none()
        ): HttpResponseFor<LaunchSiteQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<LaunchSiteQueryhelpResponse> =
            queryhelp(LaunchSiteQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/launchsite/tuple`, but is otherwise the same as
         * [LaunchSiteService.tuple].
         */
        @MustBeClosed
        fun tuple(params: LaunchSiteTupleParams): HttpResponseFor<List<LaunchSiteTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: LaunchSiteTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<LaunchSiteTupleResponse>>
    }
}
