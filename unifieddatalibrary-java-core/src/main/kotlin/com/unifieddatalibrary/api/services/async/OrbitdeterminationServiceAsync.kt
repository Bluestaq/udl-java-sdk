// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCountParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateBulkParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListPageAsync
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.orbitdetermination.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrbitdeterminationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbitdeterminationServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single OrbitDetermination record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: OrbitdeterminationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrbitdeterminationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OrbitdeterminationListPageAsync> =
        list(OrbitdeterminationListParams.none())

    /** @see list */
    fun list(
        params: OrbitdeterminationListParams = OrbitdeterminationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrbitdeterminationListPageAsync>

    /** @see list */
    fun list(
        params: OrbitdeterminationListParams = OrbitdeterminationListParams.none()
    ): CompletableFuture<OrbitdeterminationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrbitdeterminationListPageAsync> =
        list(OrbitdeterminationListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(OrbitdeterminationCountParams.none())

    /** @see count */
    fun count(
        params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(OrbitdeterminationCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of OrbitDetermination
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into the UDL. Data providers should contact the UDL team for
     * specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: OrbitdeterminationCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OrbitdeterminationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single OrbitDetermination record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<OrbitdeterminationGetResponse> =
        get(id, OrbitdeterminationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrbitdeterminationGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
    ): CompletableFuture<OrbitdeterminationGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrbitdeterminationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrbitdeterminationGetResponse>

    /** @see get */
    fun get(params: OrbitdeterminationGetParams): CompletableFuture<OrbitdeterminationGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrbitdeterminationGetResponse> =
        get(id, OrbitdeterminationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OrbitdeterminationQueryhelpResponse> =
        queryhelp(OrbitdeterminationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrbitdeterminationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none()
    ): CompletableFuture<OrbitdeterminationQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OrbitdeterminationQueryhelpResponse> =
        queryhelp(OrbitdeterminationQueryhelpParams.none(), requestOptions)

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
        params: OrbitdeterminationTupleParams
    ): CompletableFuture<List<OrbitdeterminationTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OrbitdeterminationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrbitdeterminationTupleResponse>>

    /**
     * Service operation to take multiple OrbitDetermination records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: OrbitdeterminationUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OrbitdeterminationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [OrbitdeterminationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrbitdeterminationServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/orbitdetermination`, but is otherwise the same
         * as [OrbitdeterminationServiceAsync.create].
         */
        fun create(params: OrbitdeterminationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrbitdeterminationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination`, but is otherwise the same
         * as [OrbitdeterminationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrbitdeterminationListPageAsync>> =
            list(OrbitdeterminationListParams.none())

        /** @see list */
        fun list(
            params: OrbitdeterminationListParams = OrbitdeterminationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationListPageAsync>>

        /** @see list */
        fun list(
            params: OrbitdeterminationListParams = OrbitdeterminationListParams.none()
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationListPageAsync>> =
            list(OrbitdeterminationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/count`, but is otherwise the
         * same as [OrbitdeterminationServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(OrbitdeterminationCountParams.none())

        /** @see count */
        fun count(
            params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(OrbitdeterminationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/orbitdetermination/createBulk`, but is
         * otherwise the same as [OrbitdeterminationServiceAsync.createBulk].
         */
        fun createBulk(
            params: OrbitdeterminationCreateBulkParams
        ): CompletableFuture<HttpResponse> = createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: OrbitdeterminationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/{id}`, but is otherwise the
         * same as [OrbitdeterminationServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> =
            get(id, OrbitdeterminationGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OrbitdeterminationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>>

        /** @see get */
        fun get(
            params: OrbitdeterminationGetParams
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationGetResponse>> =
            get(id, OrbitdeterminationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/queryhelp`, but is otherwise
         * the same as [OrbitdeterminationServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OrbitdeterminationQueryhelpResponse>> =
            queryhelp(OrbitdeterminationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrbitdeterminationQueryhelpResponse>> =
            queryhelp(OrbitdeterminationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/tuple`, but is otherwise the
         * same as [OrbitdeterminationServiceAsync.tuple].
         */
        fun tuple(
            params: OrbitdeterminationTupleParams
        ): CompletableFuture<HttpResponseFor<List<OrbitdeterminationTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OrbitdeterminationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrbitdeterminationTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-orbitdetermination`, but is otherwise
         * the same as [OrbitdeterminationServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: OrbitdeterminationUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: OrbitdeterminationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
