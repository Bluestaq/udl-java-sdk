// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnboardnavigationFull
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCreateBulkParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListPage
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationTupleParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.onboardnavigation.HistoryService
import java.util.function.Consumer

interface OnboardnavigationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardnavigationService

    fun history(): HistoryService

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: OnboardnavigationListParams): OnboardnavigationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: OnboardnavigationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnboardnavigationListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: OnboardnavigationCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: OnboardnavigationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of OnboardNavigation
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: OnboardnavigationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OnboardnavigationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OnboardnavigationQueryhelpResponse =
        queryhelp(OnboardnavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnboardnavigationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none()
    ): OnboardnavigationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnboardnavigationQueryhelpResponse =
        queryhelp(OnboardnavigationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnboardnavigationTupleParams): List<OnboardnavigationFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnboardnavigationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OnboardnavigationFull>

    /**
     * Service operation to take a list of onboard navigation records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: OnboardnavigationUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OnboardnavigationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [OnboardnavigationService] that provides access to raw HTTP responses for each
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
        ): OnboardnavigationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation`, but is otherwise the same
         * as [OnboardnavigationService.list].
         */
        @MustBeClosed
        fun list(params: OnboardnavigationListParams): HttpResponseFor<OnboardnavigationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnboardnavigationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnboardnavigationListPage>

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/count`, but is otherwise the
         * same as [OnboardnavigationService.count].
         */
        @MustBeClosed
        fun count(params: OnboardnavigationCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnboardnavigationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/onboardnavigation/createBulk`, but is
         * otherwise the same as [OnboardnavigationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: OnboardnavigationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: OnboardnavigationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/queryhelp`, but is otherwise
         * the same as [OnboardnavigationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnboardnavigationQueryhelpResponse> =
            queryhelp(OnboardnavigationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnboardnavigationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none()
        ): HttpResponseFor<OnboardnavigationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<OnboardnavigationQueryhelpResponse> =
            queryhelp(OnboardnavigationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/tuple`, but is otherwise the
         * same as [OnboardnavigationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: OnboardnavigationTupleParams
        ): HttpResponseFor<List<OnboardnavigationFull>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OnboardnavigationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OnboardnavigationFull>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-onboardnavigation`, but is otherwise
         * the same as [OnboardnavigationService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: OnboardnavigationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: OnboardnavigationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
