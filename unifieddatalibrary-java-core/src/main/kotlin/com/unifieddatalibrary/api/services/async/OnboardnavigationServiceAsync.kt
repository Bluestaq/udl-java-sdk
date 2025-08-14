// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnboardnavigationFull
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCreateBulkParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListPageAsync
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpResponse
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationTupleParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.onboardnavigation.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnboardnavigationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnboardnavigationServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: OnboardnavigationListParams
    ): CompletableFuture<OnboardnavigationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: OnboardnavigationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnboardnavigationListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: OnboardnavigationCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: OnboardnavigationCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of OnboardNavigation
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: OnboardnavigationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OnboardnavigationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OnboardnavigationQueryhelpResponse> =
        queryhelp(OnboardnavigationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnboardnavigationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none()
    ): CompletableFuture<OnboardnavigationQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OnboardnavigationQueryhelpResponse> =
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
    fun tuple(
        params: OnboardnavigationTupleParams
    ): CompletableFuture<List<OnboardnavigationFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnboardnavigationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OnboardnavigationFull>>

    /**
     * Service operation to take a list of onboard navigation records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: OnboardnavigationUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OnboardnavigationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [OnboardnavigationServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnboardnavigationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation`, but is otherwise the same
         * as [OnboardnavigationServiceAsync.list].
         */
        fun list(
            params: OnboardnavigationListParams
        ): CompletableFuture<HttpResponseFor<OnboardnavigationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: OnboardnavigationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnboardnavigationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/count`, but is otherwise the
         * same as [OnboardnavigationServiceAsync.count].
         */
        fun count(
            params: OnboardnavigationCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: OnboardnavigationCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/onboardnavigation/createBulk`, but is
         * otherwise the same as [OnboardnavigationServiceAsync.createBulk].
         */
        fun createBulk(params: OnboardnavigationCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: OnboardnavigationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/queryhelp`, but is otherwise
         * the same as [OnboardnavigationServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnboardnavigationQueryhelpResponse>> =
            queryhelp(OnboardnavigationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnboardnavigationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OnboardnavigationQueryhelpParams = OnboardnavigationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OnboardnavigationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnboardnavigationQueryhelpResponse>> =
            queryhelp(OnboardnavigationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onboardnavigation/tuple`, but is otherwise the
         * same as [OnboardnavigationServiceAsync.tuple].
         */
        fun tuple(
            params: OnboardnavigationTupleParams
        ): CompletableFuture<HttpResponseFor<List<OnboardnavigationFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OnboardnavigationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OnboardnavigationFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-onboardnavigation`, but is otherwise
         * the same as [OnboardnavigationServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: OnboardnavigationUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: OnboardnavigationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
