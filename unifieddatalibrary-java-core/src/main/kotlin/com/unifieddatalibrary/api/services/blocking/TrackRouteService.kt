// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCountParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateBulkParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteDeleteParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteGetParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteIngest
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListPage
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteQueryhelpResponse
import com.unifieddatalibrary.api.models.trackroute.TrackRouteTupleParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUpdateParams
import com.unifieddatalibrary.api.models.trackroute.history.TrackRouteFull
import com.unifieddatalibrary.api.services.blocking.trackroute.HistoryService
import java.util.function.Consumer

interface TrackRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackRouteService

    fun history(): HistoryService

    /**
     * Service operation to take a single trackroute record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: TrackRouteCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TrackRouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(
        trackRouteIngest: TrackRouteIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        create(
            TrackRouteCreateParams.builder().trackRouteIngest(trackRouteIngest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(trackRouteIngest: TrackRouteIngest) = create(trackRouteIngest, RequestOptions.none())

    /**
     * Service operation to update a single trackroute record. A specific role is required to
     * perform this service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: TrackRouteUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: TrackRouteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: TrackRouteUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TrackRouteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: TrackRouteListParams): TrackRouteListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TrackRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRouteListPage

    /**
     * Service operation to delete a trackroute record specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, TrackRouteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: TrackRouteDeleteParams = TrackRouteDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TrackRouteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: TrackRouteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TrackRouteDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: TrackRouteCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: TrackRouteCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of trackroute records
     * as a POST body and ingest into the database. This operation is not intended to be used for
     * automated feeds into UDL. Data providers should contact the UDL team for specific role
     * assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: TrackRouteCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: TrackRouteCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single trackroute record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): TrackRouteFull = get(id, TrackRouteGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: TrackRouteGetParams = TrackRouteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRouteFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: TrackRouteGetParams = TrackRouteGetParams.none()): TrackRouteFull =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TrackRouteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRouteFull

    /** @see get */
    fun get(params: TrackRouteGetParams): TrackRouteFull = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): TrackRouteFull =
        get(id, TrackRouteGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): TrackRouteQueryhelpResponse = queryhelp(TrackRouteQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRouteQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none()
    ): TrackRouteQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): TrackRouteQueryhelpResponse =
        queryhelp(TrackRouteQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: TrackRouteTupleParams): List<TrackRouteFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: TrackRouteTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TrackRouteFull>

    /**
     * Service operation to take multiple trackroute records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: TrackRouteUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: TrackRouteUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        trackRouteIngest: TrackRouteIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        unvalidatedPublish(
            TrackRouteUnvalidatedPublishParams.builder().trackRouteIngest(trackRouteIngest).build(),
            requestOptions,
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(trackRouteIngest: TrackRouteIngest) =
        unvalidatedPublish(trackRouteIngest, RequestOptions.none())

    /** A view of [TrackRouteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TrackRouteService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/trackroute`, but is otherwise the same as
         * [TrackRouteService.create].
         */
        @MustBeClosed
        fun create(params: TrackRouteCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TrackRouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            trackRouteIngest: TrackRouteIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                TrackRouteCreateParams.builder().trackRouteIngest(trackRouteIngest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(trackRouteIngest: TrackRouteIngest): HttpResponse =
            create(trackRouteIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /udl/trackroute/{id}`, but is otherwise the same as
         * [TrackRouteService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: TrackRouteUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: TrackRouteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TrackRouteUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TrackRouteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/trackroute`, but is otherwise the same as
         * [TrackRouteService.list].
         */
        @MustBeClosed
        fun list(params: TrackRouteListParams): HttpResponseFor<TrackRouteListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TrackRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRouteListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/trackroute/{id}`, but is otherwise the same
         * as [TrackRouteService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, TrackRouteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TrackRouteDeleteParams = TrackRouteDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TrackRouteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TrackRouteDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TrackRouteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/count`, but is otherwise the same as
         * [TrackRouteService.count].
         */
        @MustBeClosed
        fun count(params: TrackRouteCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: TrackRouteCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/trackroute/createBulk`, but is otherwise the
         * same as [TrackRouteService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: TrackRouteCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: TrackRouteCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/{id}`, but is otherwise the same as
         * [TrackRouteService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<TrackRouteFull> = get(id, TrackRouteGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: TrackRouteGetParams = TrackRouteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRouteFull> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: TrackRouteGetParams = TrackRouteGetParams.none(),
        ): HttpResponseFor<TrackRouteFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TrackRouteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRouteFull>

        /** @see get */
        @MustBeClosed
        fun get(params: TrackRouteGetParams): HttpResponseFor<TrackRouteFull> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<TrackRouteFull> =
            get(id, TrackRouteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/queryhelp`, but is otherwise the
         * same as [TrackRouteService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<TrackRouteQueryhelpResponse> =
            queryhelp(TrackRouteQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRouteQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: TrackRouteQueryhelpParams = TrackRouteQueryhelpParams.none()
        ): HttpResponseFor<TrackRouteQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<TrackRouteQueryhelpResponse> =
            queryhelp(TrackRouteQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/trackroute/tuple`, but is otherwise the same as
         * [TrackRouteService.tuple].
         */
        @MustBeClosed
        fun tuple(params: TrackRouteTupleParams): HttpResponseFor<List<TrackRouteFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: TrackRouteTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TrackRouteFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-trackroute`, but is otherwise the
         * same as [TrackRouteService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: TrackRouteUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: TrackRouteUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            trackRouteIngest: TrackRouteIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unvalidatedPublish(
                TrackRouteUnvalidatedPublishParams.builder()
                    .trackRouteIngest(trackRouteIngest)
                    .build(),
                requestOptions,
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(trackRouteIngest: TrackRouteIngest): HttpResponse =
            unvalidatedPublish(trackRouteIngest, RequestOptions.none())
    }
}
