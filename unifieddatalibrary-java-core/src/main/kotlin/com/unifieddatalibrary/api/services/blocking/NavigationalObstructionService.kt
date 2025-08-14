// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCountParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateBulkParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionGetParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionGetResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionListPage
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionListParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionQueryhelpParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionQueryhelpResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionTupleParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionTupleResponse
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionUpdateParams
import java.util.function.Consumer

interface NavigationalObstructionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationalObstructionService

    /**
     * Service operation to take a single navigational obstruction record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: NavigationalObstructionCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NavigationalObstructionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single navigational obstruction record. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: NavigationalObstructionUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NavigationalObstructionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NavigationalObstructionUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NavigationalObstructionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): NavigationalObstructionListPage = list(NavigationalObstructionListParams.none())

    /** @see list */
    fun list(
        params: NavigationalObstructionListParams = NavigationalObstructionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationalObstructionListPage

    /** @see list */
    fun list(
        params: NavigationalObstructionListParams = NavigationalObstructionListParams.none()
    ): NavigationalObstructionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NavigationalObstructionListPage =
        list(NavigationalObstructionListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(NavigationalObstructionCountParams.none())

    /** @see count */
    fun count(
        params: NavigationalObstructionCountParams = NavigationalObstructionCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: NavigationalObstructionCountParams = NavigationalObstructionCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(NavigationalObstructionCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of navigational
     * obstruction records as a POST body and ingest into the database. This operation is not
     * intended to be used for automated feeds into UDL. Data providers should contact the UDL team
     * for specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: NavigationalObstructionCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: NavigationalObstructionCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single navigational obstruction record by its unique ID passed as
     * a path parameter.
     */
    fun get(id: String): NavigationalObstructionGetResponse =
        get(id, NavigationalObstructionGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: NavigationalObstructionGetParams = NavigationalObstructionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationalObstructionGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: NavigationalObstructionGetParams = NavigationalObstructionGetParams.none(),
    ): NavigationalObstructionGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: NavigationalObstructionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationalObstructionGetResponse

    /** @see get */
    fun get(params: NavigationalObstructionGetParams): NavigationalObstructionGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): NavigationalObstructionGetResponse =
        get(id, NavigationalObstructionGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): NavigationalObstructionQueryhelpResponse =
        queryhelp(NavigationalObstructionQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: NavigationalObstructionQueryhelpParams =
            NavigationalObstructionQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationalObstructionQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: NavigationalObstructionQueryhelpParams =
            NavigationalObstructionQueryhelpParams.none()
    ): NavigationalObstructionQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): NavigationalObstructionQueryhelpResponse =
        queryhelp(NavigationalObstructionQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(
        params: NavigationalObstructionTupleParams
    ): List<NavigationalObstructionTupleResponse> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: NavigationalObstructionTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<NavigationalObstructionTupleResponse>

    /**
     * A view of [NavigationalObstructionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationalObstructionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/navigationalobstruction`, but is otherwise the
         * same as [NavigationalObstructionService.create].
         */
        @MustBeClosed
        fun create(params: NavigationalObstructionCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NavigationalObstructionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/navigationalobstruction/{id}`, but is otherwise
         * the same as [NavigationalObstructionService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: NavigationalObstructionUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NavigationalObstructionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: NavigationalObstructionUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NavigationalObstructionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/navigationalobstruction`, but is otherwise the
         * same as [NavigationalObstructionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NavigationalObstructionListPage> =
            list(NavigationalObstructionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NavigationalObstructionListParams = NavigationalObstructionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationalObstructionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NavigationalObstructionListParams = NavigationalObstructionListParams.none()
        ): HttpResponseFor<NavigationalObstructionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NavigationalObstructionListPage> =
            list(NavigationalObstructionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigationalobstruction/count`, but is
         * otherwise the same as [NavigationalObstructionService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(NavigationalObstructionCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: NavigationalObstructionCountParams = NavigationalObstructionCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: NavigationalObstructionCountParams = NavigationalObstructionCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(NavigationalObstructionCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/navigationalobstruction/createBulk`, but is
         * otherwise the same as [NavigationalObstructionService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: NavigationalObstructionCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: NavigationalObstructionCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/navigationalobstruction/{id}`, but is otherwise
         * the same as [NavigationalObstructionService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<NavigationalObstructionGetResponse> =
            get(id, NavigationalObstructionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: NavigationalObstructionGetParams = NavigationalObstructionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationalObstructionGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: NavigationalObstructionGetParams = NavigationalObstructionGetParams.none(),
        ): HttpResponseFor<NavigationalObstructionGetResponse> =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: NavigationalObstructionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationalObstructionGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: NavigationalObstructionGetParams
        ): HttpResponseFor<NavigationalObstructionGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationalObstructionGetResponse> =
            get(id, NavigationalObstructionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigationalobstruction/queryhelp`, but is
         * otherwise the same as [NavigationalObstructionService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<NavigationalObstructionQueryhelpResponse> =
            queryhelp(NavigationalObstructionQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: NavigationalObstructionQueryhelpParams =
                NavigationalObstructionQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationalObstructionQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: NavigationalObstructionQueryhelpParams =
                NavigationalObstructionQueryhelpParams.none()
        ): HttpResponseFor<NavigationalObstructionQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<NavigationalObstructionQueryhelpResponse> =
            queryhelp(NavigationalObstructionQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/navigationalobstruction/tuple`, but is
         * otherwise the same as [NavigationalObstructionService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: NavigationalObstructionTupleParams
        ): HttpResponseFor<List<NavigationalObstructionTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: NavigationalObstructionTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<NavigationalObstructionTupleResponse>>
    }
}
