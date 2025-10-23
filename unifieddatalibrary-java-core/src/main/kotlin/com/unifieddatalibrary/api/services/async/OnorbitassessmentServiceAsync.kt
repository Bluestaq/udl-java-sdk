// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCountParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListPageAsync
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleResponse
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.onorbitassessment.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnorbitassessmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitassessmentServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single OnorbitAssessment as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: OnorbitassessmentCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitassessmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(
        params: OnorbitassessmentListParams
    ): CompletableFuture<OnorbitassessmentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: OnorbitassessmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitassessmentListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: OnorbitassessmentCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: OnorbitassessmentCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of OnorbitAssessment
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: OnorbitassessmentCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OnorbitassessmentCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single OnorbitAssessment record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<OnorbitassessmentGetResponse> =
        get(id, OnorbitassessmentGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitassessmentGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
    ): CompletableFuture<OnorbitassessmentGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitassessmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitassessmentGetResponse>

    /** @see get */
    fun get(params: OnorbitassessmentGetParams): CompletableFuture<OnorbitassessmentGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OnorbitassessmentGetResponse> =
        get(id, OnorbitassessmentGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OnorbitassessmentQueryhelpResponse> =
        queryhelp(OnorbitassessmentQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnorbitassessmentQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none()
    ): CompletableFuture<OnorbitassessmentQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OnorbitassessmentQueryhelpResponse> =
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
    fun tuple(
        params: OnorbitassessmentTupleParams
    ): CompletableFuture<List<OnorbitassessmentTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitassessmentTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OnorbitassessmentTupleResponse>>

    /**
     * Service operation to take multiple OnorbitAssessment records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: OnorbitassessmentUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OnorbitassessmentUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [OnorbitassessmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnorbitassessmentServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitassessment`, but is otherwise the same
         * as [OnorbitassessmentServiceAsync.create].
         */
        fun create(params: OnorbitassessmentCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OnorbitassessmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment`, but is otherwise the same
         * as [OnorbitassessmentServiceAsync.list].
         */
        fun list(
            params: OnorbitassessmentListParams
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: OnorbitassessmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/count`, but is otherwise the
         * same as [OnorbitassessmentServiceAsync.count].
         */
        fun count(
            params: OnorbitassessmentCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: OnorbitassessmentCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/onorbitassessment/createBulk`, but is
         * otherwise the same as [OnorbitassessmentServiceAsync.createBulk].
         */
        fun createBulk(params: OnorbitassessmentCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: OnorbitassessmentCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/{id}`, but is otherwise the
         * same as [OnorbitassessmentServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>> =
            get(id, OnorbitassessmentGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OnorbitassessmentGetParams = OnorbitassessmentGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OnorbitassessmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>>

        /** @see get */
        fun get(
            params: OnorbitassessmentGetParams
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentGetResponse>> =
            get(id, OnorbitassessmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/queryhelp`, but is otherwise
         * the same as [OnorbitassessmentServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OnorbitassessmentQueryhelpResponse>> =
            queryhelp(OnorbitassessmentQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OnorbitassessmentQueryhelpParams = OnorbitassessmentQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnorbitassessmentQueryhelpResponse>> =
            queryhelp(OnorbitassessmentQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitassessment/tuple`, but is otherwise the
         * same as [OnorbitassessmentServiceAsync.tuple].
         */
        fun tuple(
            params: OnorbitassessmentTupleParams
        ): CompletableFuture<HttpResponseFor<List<OnorbitassessmentTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OnorbitassessmentTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OnorbitassessmentTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-onorbitassessment`, but is otherwise
         * the same as [OnorbitassessmentServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: OnorbitassessmentUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: OnorbitassessmentUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
