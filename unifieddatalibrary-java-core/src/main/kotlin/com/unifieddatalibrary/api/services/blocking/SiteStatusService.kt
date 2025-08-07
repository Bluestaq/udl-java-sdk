// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCountParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCreateParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusDeleteParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListPage
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusListParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusQueryhelpResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleResponse
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusUpdateParams
import com.unifieddatalibrary.api.services.blocking.sitestatus.HistoryService
import java.util.function.Consumer

interface SiteStatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteStatusService

    fun history(): HistoryService

    /**
     * Service operation to take a single SiteStatus object as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: SiteStatusCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiteStatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single SiteStatus object. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: SiteStatusUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SiteStatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SiteStatusUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SiteStatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): SiteStatusListPage = list(SiteStatusListParams.none())

    /** @see list */
    fun list(
        params: SiteStatusListParams = SiteStatusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteStatusListPage

    /** @see list */
    fun list(params: SiteStatusListParams = SiteStatusListParams.none()): SiteStatusListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SiteStatusListPage =
        list(SiteStatusListParams.none(), requestOptions)

    /**
     * Service operation to delete an SiteStatus object specified by the passed ID path parameter.
     * Note, delete operations do not remove data from historical or publish/subscribe stores. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, SiteStatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SiteStatusDeleteParams = SiteStatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: SiteStatusDeleteParams = SiteStatusDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SiteStatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SiteStatusDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, SiteStatusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(SiteStatusCountParams.none())

    /** @see count */
    fun count(
        params: SiteStatusCountParams = SiteStatusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: SiteStatusCountParams = SiteStatusCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(SiteStatusCountParams.none(), requestOptions)

    /**
     * Service operation to get a single SiteStatus record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): SiteStatusGetResponse = get(id, SiteStatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SiteStatusGetParams = SiteStatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteStatusGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SiteStatusGetParams = SiteStatusGetParams.none(),
    ): SiteStatusGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SiteStatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteStatusGetResponse

    /** @see get */
    fun get(params: SiteStatusGetParams): SiteStatusGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): SiteStatusGetResponse =
        get(id, SiteStatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): SiteStatusQueryhelpResponse = queryhelp(SiteStatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiteStatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none()
    ): SiteStatusQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): SiteStatusQueryhelpResponse =
        queryhelp(SiteStatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: SiteStatusTupleParams): List<SiteStatusTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SiteStatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SiteStatusTupleResponse>

    /** A view of [SiteStatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteStatusService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/sitestatus`, but is otherwise the same as
         * [SiteStatusService.create].
         */
        @MustBeClosed
        fun create(params: SiteStatusCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SiteStatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/sitestatus/{id}`, but is otherwise the same as
         * [SiteStatusService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: SiteStatusUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SiteStatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SiteStatusUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SiteStatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/sitestatus`, but is otherwise the same as
         * [SiteStatusService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SiteStatusListPage> = list(SiteStatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SiteStatusListParams = SiteStatusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteStatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SiteStatusListParams = SiteStatusListParams.none()
        ): HttpResponseFor<SiteStatusListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SiteStatusListPage> =
            list(SiteStatusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/sitestatus/{id}`, but is otherwise the same
         * as [SiteStatusService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, SiteStatusDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SiteStatusDeleteParams = SiteStatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SiteStatusDeleteParams = SiteStatusDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SiteStatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SiteStatusDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, SiteStatusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sitestatus/count`, but is otherwise the same as
         * [SiteStatusService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(SiteStatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: SiteStatusCountParams = SiteStatusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: SiteStatusCountParams = SiteStatusCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(SiteStatusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sitestatus/{id}`, but is otherwise the same as
         * [SiteStatusService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<SiteStatusGetResponse> =
            get(id, SiteStatusGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteStatusGetParams = SiteStatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteStatusGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: SiteStatusGetParams = SiteStatusGetParams.none(),
        ): HttpResponseFor<SiteStatusGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SiteStatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteStatusGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SiteStatusGetParams): HttpResponseFor<SiteStatusGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiteStatusGetResponse> =
            get(id, SiteStatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sitestatus/queryhelp`, but is otherwise the
         * same as [SiteStatusService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<SiteStatusQueryhelpResponse> =
            queryhelp(SiteStatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiteStatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: SiteStatusQueryhelpParams = SiteStatusQueryhelpParams.none()
        ): HttpResponseFor<SiteStatusQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<SiteStatusQueryhelpResponse> =
            queryhelp(SiteStatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/sitestatus/tuple`, but is otherwise the same as
         * [SiteStatusService.tuple].
         */
        @MustBeClosed
        fun tuple(params: SiteStatusTupleParams): HttpResponseFor<List<SiteStatusTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: SiteStatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SiteStatusTupleResponse>>
    }
}
