// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.routestats.RouteStatCountParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateBulkParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateParams
import com.unifieddatalibrary.api.models.routestats.RouteStatDeleteParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryHelpResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveParams
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleParams
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleResponse
import com.unifieddatalibrary.api.models.routestats.RouteStatUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.routestats.RouteStatUpdateParams
import java.util.function.Consumer

interface RouteStatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteStatService

    /**
     * Service operation to take a single routeStats record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: RouteStatCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RouteStatCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single routeStats record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): RouteStatRetrieveResponse =
        retrieve(id, RouteStatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteStatRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(),
    ): RouteStatRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RouteStatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteStatRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RouteStatRetrieveParams): RouteStatRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RouteStatRetrieveResponse =
        retrieve(id, RouteStatRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single RouteStats. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: RouteStatUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: RouteStatUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: RouteStatUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RouteStatUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to delete a routeStats record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, RouteStatDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RouteStatDeleteParams = RouteStatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: RouteStatDeleteParams = RouteStatDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RouteStatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RouteStatDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RouteStatDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(RouteStatCountParams.none())

    /** @see count */
    fun count(
        params: RouteStatCountParams = RouteStatCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: RouteStatCountParams = RouteStatCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(RouteStatCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of RouteStats as a
     * POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: RouteStatCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: RouteStatCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun query(): List<RouteStatQueryResponse> = query(RouteStatQueryParams.none())

    /** @see query */
    fun query(
        params: RouteStatQueryParams = RouteStatQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RouteStatQueryResponse>

    /** @see query */
    fun query(
        params: RouteStatQueryParams = RouteStatQueryParams.none()
    ): List<RouteStatQueryResponse> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): List<RouteStatQueryResponse> =
        query(RouteStatQueryParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): RouteStatQueryHelpResponse = queryHelp(RouteStatQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteStatQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none()
    ): RouteStatQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): RouteStatQueryHelpResponse =
        queryHelp(RouteStatQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: RouteStatTupleParams): List<RouteStatTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: RouteStatTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RouteStatTupleResponse>

    /**
     * Service operation to take multiple routestats records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: RouteStatUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [RouteStatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteStatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/routestats`, but is otherwise the same as
         * [RouteStatService.create].
         */
        @MustBeClosed
        fun create(params: RouteStatCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RouteStatCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/routestats/{id}`, but is otherwise the same as
         * [RouteStatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RouteStatRetrieveResponse> =
            retrieve(id, RouteStatRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteStatRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RouteStatRetrieveParams = RouteStatRetrieveParams.none(),
        ): HttpResponseFor<RouteStatRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RouteStatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteStatRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RouteStatRetrieveParams): HttpResponseFor<RouteStatRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteStatRetrieveResponse> =
            retrieve(id, RouteStatRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/routestats/{id}`, but is otherwise the same as
         * [RouteStatService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: RouteStatUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: RouteStatUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RouteStatUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RouteStatUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /udl/routestats/{id}`, but is otherwise the same
         * as [RouteStatService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, RouteStatDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RouteStatDeleteParams = RouteStatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RouteStatDeleteParams = RouteStatDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RouteStatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RouteStatDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RouteStatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/routestats/count`, but is otherwise the same as
         * [RouteStatService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(RouteStatCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: RouteStatCountParams = RouteStatCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: RouteStatCountParams = RouteStatCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(RouteStatCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/routestats/createBulk`, but is otherwise the
         * same as [RouteStatService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: RouteStatCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: RouteStatCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/routestats`, but is otherwise the same as
         * [RouteStatService.query].
         */
        @MustBeClosed
        fun query(): HttpResponseFor<List<RouteStatQueryResponse>> =
            query(RouteStatQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RouteStatQueryParams = RouteStatQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RouteStatQueryResponse>>

        /** @see query */
        @MustBeClosed
        fun query(
            params: RouteStatQueryParams = RouteStatQueryParams.none()
        ): HttpResponseFor<List<RouteStatQueryResponse>> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<List<RouteStatQueryResponse>> =
            query(RouteStatQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/routestats/queryhelp`, but is otherwise the
         * same as [RouteStatService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<RouteStatQueryHelpResponse> =
            queryHelp(RouteStatQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteStatQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: RouteStatQueryHelpParams = RouteStatQueryHelpParams.none()
        ): HttpResponseFor<RouteStatQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<RouteStatQueryHelpResponse> =
            queryHelp(RouteStatQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/routestats/tuple`, but is otherwise the same as
         * [RouteStatService.tuple].
         */
        @MustBeClosed
        fun tuple(params: RouteStatTupleParams): HttpResponseFor<List<RouteStatTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: RouteStatTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RouteStatTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-routestats`, but is otherwise the
         * same as [RouteStatService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: RouteStatUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: RouteStatUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
