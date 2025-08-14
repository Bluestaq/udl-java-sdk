// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BeamcontourFull
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCountParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateBulkParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourDeleteParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListPage
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourQueryHelpResponse
import com.unifieddatalibrary.api.models.beamcontours.BeamContourRetrieveParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourTupleParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourUpdateParams
import java.util.function.Consumer

interface BeamContourService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamContourService

    /**
     * Service operation to take a single BeamContour as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BeamContourCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BeamContourCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single BeamContour by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): BeamcontourFull = retrieve(id, BeamContourRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamcontourFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(),
    ): BeamcontourFull = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BeamContourRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamcontourFull

    /** @see retrieve */
    fun retrieve(params: BeamContourRetrieveParams): BeamcontourFull =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BeamcontourFull =
        retrieve(id, BeamContourRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single BeamContour. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BeamContourUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BeamContourUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BeamContourUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BeamContourUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: BeamContourListParams): BeamContourListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BeamContourListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamContourListPage

    /**
     * Service operation to delete a BeamContour object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, BeamContourDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BeamContourDeleteParams = BeamContourDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: BeamContourDeleteParams = BeamContourDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BeamContourDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: BeamContourDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BeamContourDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: BeamContourCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: BeamContourCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation to take a list of BeamContours as a POST body and ingest into the database.
     * This operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: BeamContourCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: BeamContourCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): BeamContourQueryHelpResponse = queryHelp(BeamContourQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamContourQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none()
    ): BeamContourQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): BeamContourQueryHelpResponse =
        queryHelp(BeamContourQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: BeamContourTupleParams): List<BeamcontourFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: BeamContourTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BeamcontourFull>

    /**
     * A view of [BeamContourService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BeamContourService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/beamcontour`, but is otherwise the same as
         * [BeamContourService.create].
         */
        @MustBeClosed
        fun create(params: BeamContourCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BeamContourCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/beamcontour/{id}`, but is otherwise the same as
         * [BeamContourService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BeamcontourFull> =
            retrieve(id, BeamContourRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamcontourFull> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BeamContourRetrieveParams = BeamContourRetrieveParams.none(),
        ): HttpResponseFor<BeamcontourFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeamContourRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamcontourFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BeamContourRetrieveParams): HttpResponseFor<BeamcontourFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BeamcontourFull> =
            retrieve(id, BeamContourRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/beamcontour/{id}`, but is otherwise the same as
         * [BeamContourService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: BeamContourUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: BeamContourUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BeamContourUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BeamContourUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/beamcontour`, but is otherwise the same as
         * [BeamContourService.list].
         */
        @MustBeClosed
        fun list(params: BeamContourListParams): HttpResponseFor<BeamContourListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BeamContourListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamContourListPage>

        /**
         * Returns a raw HTTP response for `delete /udl/beamcontour/{id}`, but is otherwise the same
         * as [BeamContourService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, BeamContourDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BeamContourDeleteParams = BeamContourDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BeamContourDeleteParams = BeamContourDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BeamContourDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BeamContourDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BeamContourDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/beamcontour/count`, but is otherwise the same
         * as [BeamContourService.count].
         */
        @MustBeClosed
        fun count(params: BeamContourCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: BeamContourCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/beamcontour/createBulk`, but is otherwise the
         * same as [BeamContourService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: BeamContourCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: BeamContourCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/beamcontour/queryhelp`, but is otherwise the
         * same as [BeamContourService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<BeamContourQueryHelpResponse> =
            queryHelp(BeamContourQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamContourQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BeamContourQueryHelpParams = BeamContourQueryHelpParams.none()
        ): HttpResponseFor<BeamContourQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<BeamContourQueryHelpResponse> =
            queryHelp(BeamContourQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/beamcontour/tuple`, but is otherwise the same
         * as [BeamContourService.tuple].
         */
        @MustBeClosed
        fun tuple(params: BeamContourTupleParams): HttpResponseFor<List<BeamcontourFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: BeamContourTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BeamcontourFull>>
    }
}
