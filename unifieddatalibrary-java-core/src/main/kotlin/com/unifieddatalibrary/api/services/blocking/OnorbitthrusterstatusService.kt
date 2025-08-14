// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OnorbitthrusterstatusFull
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusDeleteParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusGetParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListPage
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusQueryhelpResponse
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusTupleParams
import com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus.HistoryService
import java.util.function.Consumer

interface OnorbitthrusterstatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnorbitthrusterstatusService

    fun history(): HistoryService

    /**
     * Service operation to take a single OnorbitThrusterStatus record as a POST body and ingest
     * into the database. A specific role is required to perform this service operation. Please
     * contact the UDL team for assistance.
     */
    fun create(params: OnorbitthrusterstatusCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnorbitthrusterstatusCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OnorbitthrusterstatusListPage = list(OnorbitthrusterstatusListParams.none())

    /** @see list */
    fun list(
        params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitthrusterstatusListPage

    /** @see list */
    fun list(
        params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none()
    ): OnorbitthrusterstatusListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnorbitthrusterstatusListPage =
        list(OnorbitthrusterstatusListParams.none(), requestOptions)

    /**
     * Service operation to delete a OnorbitThrusterStatus record specified by the passed ID path
     * parameter. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun delete(id: String) = delete(id, OnorbitthrusterstatusDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnorbitthrusterstatusDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OnorbitthrusterstatusDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OnorbitthrusterstatusDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(OnorbitthrusterstatusCountParams.none())

    /** @see count */
    fun count(
        params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(OnorbitthrusterstatusCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of
     * onorbitthrusterstatus records as a POST body and ingest into the database. This operation is
     * not intended to be used for automated feeds into UDL. Data providers should contact the UDL
     * team for specific role assignments and for instructions on setting up a permanent feed
     * through an alternate mechanism.
     */
    fun createBulk(params: OnorbitthrusterstatusCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OnorbitthrusterstatusCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single OnorbitThrusterStatus record by its unique ID passed as a
     * path parameter. OnorbitThrusterStatus records are information for OnorbitThruster objects.
     */
    fun get(id: String): OnorbitthrusterstatusFull = get(id, OnorbitthrusterstatusGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitthrusterstatusFull = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(),
    ): OnorbitthrusterstatusFull = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OnorbitthrusterstatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitthrusterstatusFull

    /** @see get */
    fun get(params: OnorbitthrusterstatusGetParams): OnorbitthrusterstatusFull =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OnorbitthrusterstatusFull =
        get(id, OnorbitthrusterstatusGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OnorbitthrusterstatusQueryhelpResponse =
        queryhelp(OnorbitthrusterstatusQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnorbitthrusterstatusQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OnorbitthrusterstatusQueryhelpParams = OnorbitthrusterstatusQueryhelpParams.none()
    ): OnorbitthrusterstatusQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OnorbitthrusterstatusQueryhelpResponse =
        queryhelp(OnorbitthrusterstatusQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OnorbitthrusterstatusTupleParams): List<OnorbitthrusterstatusFull> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OnorbitthrusterstatusTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OnorbitthrusterstatusFull>

    /**
     * A view of [OnorbitthrusterstatusService] that provides access to raw HTTP responses for each
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
        ): OnorbitthrusterstatusService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/onorbitthrusterstatus`, but is otherwise the
         * same as [OnorbitthrusterstatusService.create].
         */
        @MustBeClosed
        fun create(params: OnorbitthrusterstatusCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnorbitthrusterstatusCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthrusterstatus`, but is otherwise the
         * same as [OnorbitthrusterstatusService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OnorbitthrusterstatusListPage> =
            list(OnorbitthrusterstatusListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitthrusterstatusListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnorbitthrusterstatusListParams = OnorbitthrusterstatusListParams.none()
        ): HttpResponseFor<OnorbitthrusterstatusListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnorbitthrusterstatusListPage> =
            list(OnorbitthrusterstatusListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/onorbitthrusterstatus/{id}`, but is
         * otherwise the same as [OnorbitthrusterstatusService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OnorbitthrusterstatusDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OnorbitthrusterstatusDeleteParams = OnorbitthrusterstatusDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnorbitthrusterstatusDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnorbitthrusterstatusDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OnorbitthrusterstatusDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/count`, but is otherwise
         * the same as [OnorbitthrusterstatusService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OnorbitthrusterstatusCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: OnorbitthrusterstatusCountParams = OnorbitthrusterstatusCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(OnorbitthrusterstatusCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/onorbitthrusterstatus/createBulk`, but is
         * otherwise the same as [OnorbitthrusterstatusService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: OnorbitthrusterstatusCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: OnorbitthrusterstatusCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/{id}`, but is otherwise
         * the same as [OnorbitthrusterstatusService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OnorbitthrusterstatusFull> =
            get(id, OnorbitthrusterstatusGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitthrusterstatusFull> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OnorbitthrusterstatusGetParams = OnorbitthrusterstatusGetParams.none(),
        ): HttpResponseFor<OnorbitthrusterstatusFull> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitthrusterstatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitthrusterstatusFull>

        /** @see get */
        @MustBeClosed
        fun get(
            params: OnorbitthrusterstatusGetParams
        ): HttpResponseFor<OnorbitthrusterstatusFull> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnorbitthrusterstatusFull> =
            get(id, OnorbitthrusterstatusGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/queryhelp`, but is
         * otherwise the same as [OnorbitthrusterstatusService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse> =
            queryhelp(OnorbitthrusterstatusQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitthrusterstatusQueryhelpParams =
                OnorbitthrusterstatusQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OnorbitthrusterstatusQueryhelpParams =
                OnorbitthrusterstatusQueryhelpParams.none()
        ): HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<OnorbitthrusterstatusQueryhelpResponse> =
            queryhelp(OnorbitthrusterstatusQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/onorbitthrusterstatus/tuple`, but is otherwise
         * the same as [OnorbitthrusterstatusService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: OnorbitthrusterstatusTupleParams
        ): HttpResponseFor<List<OnorbitthrusterstatusFull>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OnorbitthrusterstatusTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OnorbitthrusterstatusFull>>
    }
}
