// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCountParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateBulkParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListPage
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationListParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationQueryhelpResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleResponse
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.orbitdetermination.HistoryService
import java.util.function.Consumer

interface OrbitdeterminationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrbitdeterminationService

    fun history(): HistoryService

    /**
     * Service operation to take a single OrbitDetermination record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: OrbitdeterminationCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrbitdeterminationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): OrbitdeterminationListPage = list(OrbitdeterminationListParams.none())

    /** @see list */
    fun list(
        params: OrbitdeterminationListParams = OrbitdeterminationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrbitdeterminationListPage

    /** @see list */
    fun list(
        params: OrbitdeterminationListParams = OrbitdeterminationListParams.none()
    ): OrbitdeterminationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrbitdeterminationListPage =
        list(OrbitdeterminationListParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(OrbitdeterminationCountParams.none())

    /** @see count */
    fun count(
        params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(
        params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none()
    ): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(OrbitdeterminationCountParams.none(), requestOptions)

    /**
     * Service operation intended for initial integration only, to take a list of OrbitDetermination
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into the UDL. Data providers should contact the UDL team for
     * specific role assignments and for instructions on setting up a permanent feed through an
     * alternate mechanism.
     */
    fun createBulk(params: OrbitdeterminationCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: OrbitdeterminationCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single OrbitDetermination record by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): OrbitdeterminationGetResponse = get(id, OrbitdeterminationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrbitdeterminationGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
    ): OrbitdeterminationGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrbitdeterminationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrbitdeterminationGetResponse

    /** @see get */
    fun get(params: OrbitdeterminationGetParams): OrbitdeterminationGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OrbitdeterminationGetResponse =
        get(id, OrbitdeterminationGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): OrbitdeterminationQueryhelpResponse =
        queryhelp(OrbitdeterminationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrbitdeterminationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none()
    ): OrbitdeterminationQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OrbitdeterminationQueryhelpResponse =
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
    fun tuple(params: OrbitdeterminationTupleParams): List<OrbitdeterminationTupleResponse> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OrbitdeterminationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrbitdeterminationTupleResponse>

    /**
     * Service operation to take multiple OrbitDetermination records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(params: OrbitdeterminationUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: OrbitdeterminationUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [OrbitdeterminationService] that provides access to raw HTTP responses for each
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
        ): OrbitdeterminationService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/orbitdetermination`, but is otherwise the same
         * as [OrbitdeterminationService.create].
         */
        @MustBeClosed
        fun create(params: OrbitdeterminationCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrbitdeterminationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination`, but is otherwise the same
         * as [OrbitdeterminationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OrbitdeterminationListPage> =
            list(OrbitdeterminationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrbitdeterminationListParams = OrbitdeterminationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrbitdeterminationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrbitdeterminationListParams = OrbitdeterminationListParams.none()
        ): HttpResponseFor<OrbitdeterminationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrbitdeterminationListPage> =
            list(OrbitdeterminationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/count`, but is otherwise the
         * same as [OrbitdeterminationService.count].
         */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OrbitdeterminationCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: OrbitdeterminationCountParams = OrbitdeterminationCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(OrbitdeterminationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /udl/orbitdetermination/createBulk`, but is
         * otherwise the same as [OrbitdeterminationService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: OrbitdeterminationCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: OrbitdeterminationCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/{id}`, but is otherwise the
         * same as [OrbitdeterminationService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OrbitdeterminationGetResponse> =
            get(id, OrbitdeterminationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrbitdeterminationGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: OrbitdeterminationGetParams = OrbitdeterminationGetParams.none(),
        ): HttpResponseFor<OrbitdeterminationGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OrbitdeterminationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrbitdeterminationGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: OrbitdeterminationGetParams
        ): HttpResponseFor<OrbitdeterminationGetResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrbitdeterminationGetResponse> =
            get(id, OrbitdeterminationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/queryhelp`, but is otherwise
         * the same as [OrbitdeterminationService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OrbitdeterminationQueryhelpResponse> =
            queryhelp(OrbitdeterminationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrbitdeterminationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: OrbitdeterminationQueryhelpParams = OrbitdeterminationQueryhelpParams.none()
        ): HttpResponseFor<OrbitdeterminationQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<OrbitdeterminationQueryhelpResponse> =
            queryhelp(OrbitdeterminationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/orbitdetermination/tuple`, but is otherwise the
         * same as [OrbitdeterminationService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: OrbitdeterminationTupleParams
        ): HttpResponseFor<List<OrbitdeterminationTupleResponse>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: OrbitdeterminationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrbitdeterminationTupleResponse>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-orbitdetermination`, but is otherwise
         * the same as [OrbitdeterminationService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: OrbitdeterminationUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: OrbitdeterminationUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
