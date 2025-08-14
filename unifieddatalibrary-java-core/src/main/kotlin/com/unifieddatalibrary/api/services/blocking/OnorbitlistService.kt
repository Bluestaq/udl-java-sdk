// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCountParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCreateParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistDeleteParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListPage
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistListParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleResponse
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistUpdateParams
import java.util.function.Consumer

interface OnorbitlistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitlistService

    /**
     * Service operation to take a single OnorbitList as a POST body and ingest into the database.
     * An OnorbitList is just a generic named list of on-orbit IDs. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun create(params: OnorbitlistCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitlistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single OnorbitList. An OnorbitList is just a generic named list
     * of on-orbit IDs. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OnorbitlistUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OnorbitlistUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OnorbitlistUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnorbitlistUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OnorbitlistListPage = list(OnorbitlistListParams.none())

    /** @see list */
    fun list(
        params: OnorbitlistListParams = OnorbitlistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitlistListPage

    /** @see list */
    fun list(params: OnorbitlistListParams = OnorbitlistListParams.none()): OnorbitlistListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitlistListPage =
        list(OnorbitlistListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitList object specified by the passed ID path parameter.
     * An OnorbitList is just a generic named list of on-orbit IDs. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, OnorbitlistDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitlistDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OnorbitlistDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OnorbitlistDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(OnorbitlistCountParams.none())

    /** @see count */
    fun count(
        params: OnorbitlistCountParams = OnorbitlistCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: OnorbitlistCountParams = OnorbitlistCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(OnorbitlistCountParams.none(), requestOptions)

    /**
     * Service operation to get a single OnorbitList record by its unique ID passed as a path
     * parameter. An OnorbitList is just a generic named list of on-orbit IDs.
     */
    fun get(id: String): OnorbitlistGetResponse = get(id, OnorbitlistGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitlistGetParams = OnorbitlistGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitlistGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitlistGetParams = OnorbitlistGetParams.none(),
    ): OnorbitlistGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitlistGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitlistGetResponse

    /** @see get */
    fun get(params: OnorbitlistGetParams): OnorbitlistGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitlistGetResponse =
        get(id, OnorbitlistGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OnorbitlistQueryhelpResponse = queryhelp(OnorbitlistQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitlistQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none()
    ): OnorbitlistQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnorbitlistQueryhelpResponse =
        queryhelp(OnorbitlistQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbitlistTupleParams): List<OnorbitlistTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitlistTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OnorbitlistTupleResponse>

    /**
     * A view of [OnorbitlistService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbitlistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitlist`, but is otherwise the same as
         * [OnorbitlistService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitlistCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitlistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/onorbitlist/{id}`, but is otherwise the same as
         * [OnorbitlistService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: OnorbitlistUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: OnorbitlistUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OnorbitlistUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnorbitlistUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitlist`, but is otherwise the same as
         * [OnorbitlistService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitlistListPage> = list(OnorbitlistListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitlistListParams = OnorbitlistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitlistListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitlistListParams = OnorbitlistListParams.none()
        ): HttpResponseFor<OnorbitlistListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitlistListPage> =
            list(OnorbitlistListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitlist/{id}`, but is otherwise the same
         * as [OnorbitlistService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OnorbitlistDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitlistDeleteParams = OnorbitlistDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnorbitlistDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitlistDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OnorbitlistDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitlist/count`, but is otherwise the same
         * as [OnorbitlistService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(OnorbitlistCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitlistCountParams = OnorbitlistCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitlistCountParams = OnorbitlistCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(OnorbitlistCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitlist/{id}`, but is otherwise the same as
         * [OnorbitlistService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitlistGetResponse> =
            get(id, OnorbitlistGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitlistGetParams = OnorbitlistGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitlistGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitlistGetParams = OnorbitlistGetParams.none(),
        ): HttpResponseFor<OnorbitlistGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitlistGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitlistGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitlistGetParams): HttpResponseFor<OnorbitlistGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitlistGetResponse> =
            get(id, OnorbitlistGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitlist/queryhelp`, but is otherwise the
         * same as [OnorbitlistService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnorbitlistQueryhelpResponse> =
            queryhelp(OnorbitlistQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitlistQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitlistQueryhelpParams = OnorbitlistQueryhelpParams.none()
        ): HttpResponseFor<OnorbitlistQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<OnorbitlistQueryhelpResponse> =
            queryhelp(OnorbitlistQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitlist/tuple`, but is otherwise the same
         * as [OnorbitlistService.tuple].
         */
        @MustBeClosed
        fun tuple(params: OnorbitlistTupleParams): HttpResponseFor<List<OnorbitlistTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OnorbitlistTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OnorbitlistTupleResponse>>
    }
}
