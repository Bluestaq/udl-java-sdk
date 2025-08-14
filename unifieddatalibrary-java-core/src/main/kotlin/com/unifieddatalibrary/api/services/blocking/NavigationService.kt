// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.navigation.NavigationCountParams
import com.unifieddatalibrary.api.models.navigation.NavigationCreateParams
import com.unifieddatalibrary.api.models.navigation.NavigationDeleteParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetParams
import com.unifieddatalibrary.api.models.navigation.NavigationGetResponse
import com.unifieddatalibrary.api.models.navigation.NavigationListPage
import com.unifieddatalibrary.api.models.navigation.NavigationListParams
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpParams
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.navigation.NavigationTupleParams
import com.unifieddatalibrary.api.models.navigation.NavigationTupleResponse
import com.unifieddatalibrary.api.models.navigation.NavigationUpdateParams
import java.util.function.Consumer

interface NavigationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationService

    /**
     * Service operation to take a single Navigation as a POST body and ingest into the database. A
     * Navigation is an on-orbit navigation payload. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun create(params: NavigationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NavigationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single Navigation. An Navigation is an on-orbit navigation
     * payload. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun update(pathId: String, params: NavigationUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NavigationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NavigationUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NavigationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): NavigationListPage = list(NavigationListParams.none())

    /** @see list */
    fun list(
        params: NavigationListParams = NavigationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationListPage

    /** @see list */
    fun list(params: NavigationListParams = NavigationListParams.none()): NavigationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NavigationListPage =
        list(NavigationListParams.none(), requestOptions)

    /**
     * Service operation to delete a Navigation object specified by the passed ID path parameter. An
     * Navigation is an on-orbit navigation payload. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, NavigationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NavigationDeleteParams = NavigationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: NavigationDeleteParams = NavigationDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NavigationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: NavigationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, NavigationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(NavigationCountParams.none())

    /** @see count */
    fun count(
        params: NavigationCountParams = NavigationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: NavigationCountParams = NavigationCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(NavigationCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Navigation record by its unique ID passed as a path
     * parameter. An Navigation is an on-orbit navigation payload.
     */
    fun get(id: String): NavigationGetResponse = get(id, NavigationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: NavigationGetParams = NavigationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: NavigationGetParams = NavigationGetParams.none(),
    ): NavigationGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: NavigationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationGetResponse

    /** @see get */
    fun get(params: NavigationGetParams): NavigationGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): NavigationGetResponse =
        get(id, NavigationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): NavigationQueryhelpResponse = queryhelp(NavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: NavigationQueryhelpParams = NavigationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: NavigationQueryhelpParams = NavigationQueryhelpParams.none()
    ): NavigationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): NavigationQueryhelpResponse =
        queryhelp(NavigationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: NavigationTupleParams): List<NavigationTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: NavigationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<NavigationTupleResponse>

    /** A view of [NavigationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/navigation`, but is otherwise the same as
         * [NavigationService.create].
         */
        @MustBeClosed
        fun create(params: NavigationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NavigationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/navigation/{id}`, but is otherwise the same as
         * [NavigationService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: NavigationUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NavigationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: NavigationUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NavigationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/navigation`, but is otherwise the same as
         * [NavigationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NavigationListPage> = list(NavigationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NavigationListParams = NavigationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NavigationListParams = NavigationListParams.none()
        ): HttpResponseFor<NavigationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NavigationListPage> =
            list(NavigationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/navigation/{id}`, but is otherwise the same
         * as [NavigationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, NavigationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NavigationDeleteParams = NavigationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NavigationDeleteParams = NavigationDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NavigationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NavigationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, NavigationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigation/count`, but is otherwise the same as
         * [NavigationService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(NavigationCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: NavigationCountParams = NavigationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: NavigationCountParams = NavigationCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(NavigationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigation/{id}`, but is otherwise the same as
         * [NavigationService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<NavigationGetResponse> =
            get(id, NavigationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: NavigationGetParams = NavigationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: NavigationGetParams = NavigationGetParams.none(),
        ): HttpResponseFor<NavigationGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: NavigationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: NavigationGetParams): HttpResponseFor<NavigationGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationGetResponse> =
            get(id, NavigationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigation/queryhelp`, but is otherwise the
         * same as [NavigationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<NavigationQueryhelpResponse> =
            queryhelp(NavigationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: NavigationQueryhelpParams = NavigationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: NavigationQueryhelpParams = NavigationQueryhelpParams.none()
        ): HttpResponseFor<NavigationQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<NavigationQueryhelpResponse> =
            queryhelp(NavigationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigation/tuple`, but is otherwise the same as
         * [NavigationService.tuple].
         */
        @MustBeClosed
        fun tuple(params: NavigationTupleParams): HttpResponseFor<List<NavigationTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: NavigationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<NavigationTupleResponse>>
    }
}
