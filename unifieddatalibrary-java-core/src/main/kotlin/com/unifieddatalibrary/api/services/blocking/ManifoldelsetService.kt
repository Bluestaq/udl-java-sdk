// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCountParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateBulkParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetDeleteParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListPage
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetQueryhelpResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleResponse
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetUpdateParams
import java.util.function.Consumer

interface ManifoldelsetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManifoldelsetService

    /**
     * Service operation to take a single ManifoldElset as a POST body and ingest into the database.
     * A ManifoldElset represents theoretical Keplarian orbital elements belonging to an object of
     * interest's manifold describing a possible/theoretical orbit for an object of interest for
     * tasking purposes. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: ManifoldelsetCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ManifoldelsetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to update a single ManifoldElset. A ManifoldElset represents theoretical
     * Keplarian orbital elements belonging to an object of interest's manifold describing a
     * possible/theoretical orbit for an object of interest for tasking purposes. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: ManifoldelsetUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: ManifoldelsetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: ManifoldelsetUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ManifoldelsetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ManifoldelsetListParams): ManifoldelsetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ManifoldelsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManifoldelsetListPage

    /**
     * Service operation to delete a ManifoldElset object specified by the passed ID path parameter.
     * A ManifoldElset represents theoretical Keplarian orbital elements belonging to an object of
     * interest's manifold describing a possible/theoretical orbit for an object of interest for
     * tasking purposes. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun delete(id: String) = delete(id, ManifoldelsetDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ManifoldelsetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ManifoldelsetDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ManifoldelsetDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ManifoldelsetCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ManifoldelsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to take multiple ManifoldElsets as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun createBulk(params: ManifoldelsetCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ManifoldelsetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single ManifoldElset record by its unique ID passed as a path
     * parameter. A ManifoldElset represents theoretical Keplarian orbital elements belonging to an
     * object of interest's manifold describing a possible/theoretical orbit for an object of
     * interest for tasking purposes.
     */
    fun get(id: String): ManifoldelsetGetResponse = get(id, ManifoldelsetGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManifoldelsetGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
    ): ManifoldelsetGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ManifoldelsetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManifoldelsetGetResponse

    /** @see get */
    fun get(params: ManifoldelsetGetParams): ManifoldelsetGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ManifoldelsetGetResponse =
        get(id, ManifoldelsetGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): ManifoldelsetQueryhelpResponse = queryhelp(ManifoldelsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManifoldelsetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none()
    ): ManifoldelsetQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ManifoldelsetQueryhelpResponse =
        queryhelp(ManifoldelsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ManifoldelsetTupleParams): List<ManifoldelsetTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ManifoldelsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ManifoldelsetTupleResponse>

    /**
     * A view of [ManifoldelsetService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManifoldelsetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/manifoldelset`, but is otherwise the same as
         * [ManifoldelsetService.create].
         */
        @MustBeClosed
        fun create(params: ManifoldelsetCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ManifoldelsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /udl/manifoldelset/{id}`, but is otherwise the same
         * as [ManifoldelsetService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: ManifoldelsetUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: ManifoldelsetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ManifoldelsetUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ManifoldelsetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset`, but is otherwise the same as
         * [ManifoldelsetService.list].
         */
        @MustBeClosed
        fun list(params: ManifoldelsetListParams): HttpResponseFor<ManifoldelsetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ManifoldelsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManifoldelsetListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/manifoldelset/{id}`, but is otherwise the
         * same as [ManifoldelsetService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, ManifoldelsetDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ManifoldelsetDeleteParams = ManifoldelsetDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ManifoldelsetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ManifoldelsetDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ManifoldelsetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/count`, but is otherwise the same
         * as [ManifoldelsetService.count].
         */
        @MustBeClosed
        fun count(params: ManifoldelsetCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: ManifoldelsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/manifoldelset/createBulk`, but is otherwise
         * the same as [ManifoldelsetService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: ManifoldelsetCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: ManifoldelsetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/{id}`, but is otherwise the same
         * as [ManifoldelsetService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ManifoldelsetGetResponse> =
            get(id, ManifoldelsetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManifoldelsetGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ManifoldelsetGetParams = ManifoldelsetGetParams.none(),
        ): HttpResponseFor<ManifoldelsetGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ManifoldelsetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManifoldelsetGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ManifoldelsetGetParams): HttpResponseFor<ManifoldelsetGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManifoldelsetGetResponse> =
            get(id, ManifoldelsetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/queryhelp`, but is otherwise the
         * same as [ManifoldelsetService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ManifoldelsetQueryhelpResponse> =
            queryhelp(ManifoldelsetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManifoldelsetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ManifoldelsetQueryhelpParams = ManifoldelsetQueryhelpParams.none()
        ): HttpResponseFor<ManifoldelsetQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<ManifoldelsetQueryhelpResponse> =
            queryhelp(ManifoldelsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/manifoldelset/tuple`, but is otherwise the same
         * as [ManifoldelsetService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: ManifoldelsetTupleParams
        ): HttpResponseFor<List<ManifoldelsetTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: ManifoldelsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ManifoldelsetTupleResponse>>
    }
}
