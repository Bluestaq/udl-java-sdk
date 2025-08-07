// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.BeamFull
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamDeleteParams
import com.unifieddatalibrary.api.models.beam.BeamListPage
import com.unifieddatalibrary.api.models.beam.BeamListParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpParams
import com.unifieddatalibrary.api.models.beam.BeamQueryHelpResponse
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import java.util.function.Consumer

interface BeamService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamService

    /**
     * Service operation to take a single Beam as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: BeamCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: BeamCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to get a single Beam record by its unique ID passed as a path parameter.
     */
    fun retrieve(id: String): BeamFull = retrieve(id, BeamRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BeamRetrieveParams = BeamRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamFull = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: BeamRetrieveParams = BeamRetrieveParams.none()): BeamFull =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BeamRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamFull

    /** @see retrieve */
    fun retrieve(params: BeamRetrieveParams): BeamFull = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BeamFull =
        retrieve(id, BeamRetrieveParams.none(), requestOptions)

    /**
     * Service operation to update a single Beam. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: BeamUpdateParams) =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: BeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: BeamUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: BeamUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): BeamListPage = list(BeamListParams.none())

    /** @see list */
    fun list(
        params: BeamListParams = BeamListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamListPage

    /** @see list */
    fun list(params: BeamListParams = BeamListParams.none()): BeamListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BeamListPage =
        list(BeamListParams.none(), requestOptions)

    /**
     * Service operation to delete a Beam object specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String) = delete(id, BeamDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BeamDeleteParams = BeamDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BeamDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BeamDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BeamDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(BeamCountParams.none())

    /** @see count */
    fun count(
        params: BeamCountParams = BeamCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: BeamCountParams = BeamCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(BeamCountParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): BeamQueryHelpResponse = queryHelp(BeamQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: BeamQueryHelpParams = BeamQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeamQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: BeamQueryHelpParams = BeamQueryHelpParams.none()): BeamQueryHelpResponse =
        queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): BeamQueryHelpResponse =
        queryHelp(BeamQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: BeamTupleParams): List<BeamFull> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: BeamTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BeamFull>

    /** A view of [BeamService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeamService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/beam`, but is otherwise the same as
         * [BeamService.create].
         */
        @MustBeClosed
        fun create(params: BeamCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BeamCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/beam/{id}`, but is otherwise the same as
         * [BeamService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BeamFull> =
            retrieve(id, BeamRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BeamRetrieveParams = BeamRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamFull> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BeamRetrieveParams = BeamRetrieveParams.none(),
        ): HttpResponseFor<BeamFull> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeamRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamFull>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BeamRetrieveParams): HttpResponseFor<BeamFull> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BeamFull> =
            retrieve(id, BeamRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /udl/beam/{id}`, but is otherwise the same as
         * [BeamService.update].
         */
        @MustBeClosed
        fun update(pathId: String, params: BeamUpdateParams): HttpResponse =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: BeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BeamUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/beam`, but is otherwise the same as
         * [BeamService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BeamListPage> = list(BeamListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BeamListParams = BeamListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BeamListParams = BeamListParams.none()): HttpResponseFor<BeamListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BeamListPage> =
            list(BeamListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/beam/{id}`, but is otherwise the same as
         * [BeamService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, BeamDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BeamDeleteParams = BeamDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: BeamDeleteParams = BeamDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BeamDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BeamDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/beam/count`, but is otherwise the same as
         * [BeamService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(BeamCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: BeamCountParams = BeamCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: BeamCountParams = BeamCountParams.none()): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(BeamCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/beam/queryhelp`, but is otherwise the same as
         * [BeamService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<BeamQueryHelpResponse> =
            queryHelp(BeamQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BeamQueryHelpParams = BeamQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeamQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: BeamQueryHelpParams = BeamQueryHelpParams.none()
        ): HttpResponseFor<BeamQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<BeamQueryHelpResponse> =
            queryHelp(BeamQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/beam/tuple`, but is otherwise the same as
         * [BeamService.tuple].
         */
        @MustBeClosed
        fun tuple(params: BeamTupleParams): HttpResponseFor<List<BeamFull>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: BeamTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BeamFull>>
    }
}
