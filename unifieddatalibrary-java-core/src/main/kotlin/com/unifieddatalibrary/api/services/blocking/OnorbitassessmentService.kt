// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCountParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListPage
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.onorbitassessment.HistoryService
import java.util.function.Consumer

interface OnorbitassessmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitassessmentService

    fun history(): HistoryService

    /**
     * Service operation to take a single OnorbitAssessment as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitassessmentCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitassessmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: OnorbitassessmentListParams): OnorbitassessmentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: OnorbitassessmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitassessmentListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: OnorbitassessmentCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: OnorbitassessmentCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of OnorbitAssessment
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: OnorbitassessmentCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OnorbitassessmentCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single OnorbitAssessment record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): OnorbitassessmentGetResponse = get(id, OnorbitassessmentGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitassessmentGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
    ): OnorbitassessmentGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitassessmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitassessmentGetResponse

    /** @see get */
    fun get(params: OnorbitassessmentGetParams): OnorbitassessmentGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitassessmentGetResponse =
        get(id, OnorbitassessmentGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OnorbitassessmentQueryhelpResponse =
        queryhelp(OnorbitassessmentQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitassessmentQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none()
    ): OnorbitassessmentQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnorbitassessmentQueryhelpResponse =
        queryhelp(OnorbitassessmentQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbitassessmentTupleParams): List<OnorbitassessmentTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitassessmentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OnorbitassessmentTupleResponse>

    /**
     * Service operation to take multiple OnorbitAssessment records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: OnorbitassessmentUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OnorbitassessmentUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [OnorbitassessmentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnorbitassessmentService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitassessment`, but is otherwise the same
         * as [OnorbitassessmentService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitassessmentCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitassessmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment`, but is otherwise the same
         * as [OnorbitassessmentService.list].
         */
        @MustBeClosed
        fun list(params: OnorbitassessmentListParams): HttpResponseFor<OnorbitassessmentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitassessmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitassessmentListPage>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/count`, but is otherwise the
         * same as [OnorbitassessmentService.count].
         */
        @MustBeClosed
        fun count(params: OnorbitassessmentCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitassessmentCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/onorbitassessment/createBulk`, but is
         * otherwise the same as [OnorbitassessmentService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: OnorbitassessmentCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: OnorbitassessmentCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/{id}`, but is otherwise the
         * same as [OnorbitassessmentService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitassessmentGetResponse> =
            get(id, OnorbitassessmentGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitassessmentGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
        ): HttpResponseFor<OnorbitassessmentGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitassessmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitassessmentGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: OnorbitassessmentGetParams): HttpResponseFor<OnorbitassessmentGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitassessmentGetResponse> =
            get(id, OnorbitassessmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/queryhelp`, but is otherwise
         * the same as [OnorbitassessmentService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnorbitassessmentQueryhelpResponse> =
            queryhelp(OnorbitassessmentQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitassessmentQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none()
        ): HttpResponseFor<OnorbitassessmentQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<OnorbitassessmentQueryhelpResponse> =
            queryhelp(OnorbitassessmentQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/tuple`, but is otherwise the
         * same as [OnorbitassessmentService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: OnorbitassessmentTupleParams
        ): HttpResponseFor<List<OnorbitassessmentTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OnorbitassessmentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OnorbitassessmentTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-onorbitassessment`, but is otherwise
         * the same as [OnorbitassessmentService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: OnorbitassessmentUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: OnorbitassessmentUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
