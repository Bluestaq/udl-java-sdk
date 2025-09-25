// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCountParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListPage
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationQueryHelpParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationQueryHelpResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationRetrieveParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationRetrieveResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationTupleParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationTupleResponse
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.observations.obscorrelation.HistoryService
import java.util.function.Consumer

interface ObscorrelationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObscorrelationService

    fun history(): HistoryService

    /**
     * Service operation to take a single ObsCorrelation record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: ObscorrelationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ObscorrelationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single Correlation record by its unique ID passed as a path
     * parameter.
     */
    fun retrieve(id: String): ObscorrelationRetrieveResponse =
        retrieve(id, ObscorrelationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ObscorrelationRetrieveParams = ObscorrelationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObscorrelationRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ObscorrelationRetrieveParams = ObscorrelationRetrieveParams.none(),
    ): ObscorrelationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ObscorrelationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObscorrelationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ObscorrelationRetrieveParams): ObscorrelationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ObscorrelationRetrieveResponse =
        retrieve(id, ObscorrelationRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ObscorrelationListParams): ObscorrelationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ObscorrelationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObscorrelationListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ObscorrelationCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ObscorrelationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of ObsCorrelation
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: ObscorrelationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ObscorrelationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): ObscorrelationQueryHelpResponse =
        queryHelp(ObscorrelationQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: ObscorrelationQueryHelpParams = ObscorrelationQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObscorrelationQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: ObscorrelationQueryHelpParams = ObscorrelationQueryHelpParams.none()
    ): ObscorrelationQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): ObscorrelationQueryHelpResponse =
        queryHelp(ObscorrelationQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ObscorrelationTupleParams): List<ObscorrelationTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ObscorrelationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ObscorrelationTupleResponse>

    /**
     * Service operation to take multiple ObsCorrelation records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: ObscorrelationUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ObscorrelationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ObscorrelationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObscorrelationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/obscorrelation`, but is otherwise the same as
         * [ObscorrelationService.create].
         */
        @MustBeClosed
        fun create(params: ObscorrelationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ObscorrelationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/obscorrelation/{id}`, but is otherwise the same
         * as [ObscorrelationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ObscorrelationRetrieveResponse> =
            retrieve(id, ObscorrelationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ObscorrelationRetrieveParams = ObscorrelationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObscorrelationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ObscorrelationRetrieveParams = ObscorrelationRetrieveParams.none(),
        ): HttpResponseFor<ObscorrelationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ObscorrelationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObscorrelationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ObscorrelationRetrieveParams
        ): HttpResponseFor<ObscorrelationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObscorrelationRetrieveResponse> =
            retrieve(id, ObscorrelationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/obscorrelation`, but is otherwise the same as
         * [ObscorrelationService.list].
         */
        @MustBeClosed
        fun list(params: ObscorrelationListParams): HttpResponseFor<ObscorrelationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObscorrelationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObscorrelationListPage>

        /**
         * Returns a raw HTTP response for `get /udl/obscorrelation/count`, but is otherwise the
         * same as [ObscorrelationService.count].
         */
        @MustBeClosed
        fun count(params: ObscorrelationCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: ObscorrelationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/obscorrelation/createBulk`, but is otherwise
         * the same as [ObscorrelationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: ObscorrelationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: ObscorrelationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/obscorrelation/queryhelp`, but is otherwise the
         * same as [ObscorrelationService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<ObscorrelationQueryHelpResponse> =
            queryHelp(ObscorrelationQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: ObscorrelationQueryHelpParams = ObscorrelationQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObscorrelationQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: ObscorrelationQueryHelpParams = ObscorrelationQueryHelpParams.none()
        ): HttpResponseFor<ObscorrelationQueryHelpResponse> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<ObscorrelationQueryHelpResponse> =
            queryHelp(ObscorrelationQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/obscorrelation/tuple`, but is otherwise the
         * same as [ObscorrelationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: ObscorrelationTupleParams
        ): HttpResponseFor<List<ObscorrelationTupleResponse>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: ObscorrelationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ObscorrelationTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-obscorrelation`, but is otherwise the
         * same as [ObscorrelationService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: ObscorrelationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: ObscorrelationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
