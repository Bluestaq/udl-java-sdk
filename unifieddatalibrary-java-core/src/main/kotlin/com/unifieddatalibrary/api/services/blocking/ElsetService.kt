// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.elsets.Elset
import com.unifieddatalibrary.api.models.elsets.ElsetCountParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkFromTleParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateParams
import com.unifieddatalibrary.api.models.elsets.ElsetIngest
import com.unifieddatalibrary.api.models.elsets.ElsetListPage
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryCurrentElsetHelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpParams
import com.unifieddatalibrary.api.models.elsets.ElsetQueryhelpResponse
import com.unifieddatalibrary.api.models.elsets.ElsetRetrieveParams
import com.unifieddatalibrary.api.models.elsets.ElsetTupleParams
import com.unifieddatalibrary.api.models.elsets.ElsetUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.elsets.CurrentService
import com.unifieddatalibrary.api.services.blocking.elsets.HistoryService
import java.util.function.Consumer

interface ElsetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ElsetService

    fun current(): CurrentService

    fun history(): HistoryService

    /**
     * Service operation to take a single elset as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun create(params: ElsetCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: ElsetCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see create */
    fun create(elsetIngest: ElsetIngest, requestOptions: RequestOptions = RequestOptions.none()) =
        create(ElsetCreateParams.builder().elsetIngest(elsetIngest).build(), requestOptions)

    /** @see create */
    fun create(elsetIngest: ElsetIngest) = create(elsetIngest, RequestOptions.none())

    /** Service operation to get a single elset by its unique ID passed as a path parameter. */
    fun retrieve(id: String): Elset = retrieve(id, ElsetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Elset = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: ElsetRetrieveParams = ElsetRetrieveParams.none()): Elset =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ElsetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Elset

    /** @see retrieve */
    fun retrieve(params: ElsetRetrieveParams): Elset = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Elset =
        retrieve(id, ElsetRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: ElsetListParams): ElsetListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ElsetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ElsetListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: ElsetCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: ElsetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of elsets as a POST
     * body and ingest into the database with or without dupe detection. Default is no dupe
     * checking. This operation is not intended to be used for automated feeds into UDL. Data
     * providers should contact the UDL team for specific role assignments and for instructions on
     * setting up a permanent feed through an alternate mechanism.
     */
    fun createBulk(params: ElsetCreateBulkParams) = createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: ElsetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to take a multiple TLEs as a POST body and ingest into the database. This
     * operation is not intended to be used for automated feeds into UDL. Data providers should
     * contact the UDL team for specific role assignments and for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulkFromTle(params: ElsetCreateBulkFromTleParams) =
        createBulkFromTle(params, RequestOptions.none())

    /** @see createBulkFromTle */
    fun createBulkFromTle(
        params: ElsetCreateBulkFromTleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryCurrentElsetHelp(): ElsetQueryCurrentElsetHelpResponse =
        queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none())

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ElsetQueryCurrentElsetHelpResponse

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(
        params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none()
    ): ElsetQueryCurrentElsetHelpResponse = queryCurrentElsetHelp(params, RequestOptions.none())

    /** @see queryCurrentElsetHelp */
    fun queryCurrentElsetHelp(requestOptions: RequestOptions): ElsetQueryCurrentElsetHelpResponse =
        queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): ElsetQueryhelpResponse = queryhelp(ElsetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: ElsetQueryhelpParams = ElsetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ElsetQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: ElsetQueryhelpParams = ElsetQueryhelpParams.none()
    ): ElsetQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): ElsetQueryhelpResponse =
        queryhelp(ElsetQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: ElsetTupleParams): List<Elset> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: ElsetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Elset>

    /**
     * Service operation to take elsets as a POST body and ingest into the database with or without
     * dupe detection. Default is no dupe checking. This operation is intended to be used for
     * automated feeds into UDL.
     */
    fun unvalidatedPublish(params: ElsetUnvalidatedPublishParams) =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: ElsetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ElsetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ElsetService.WithRawResponse

        fun current(): CurrentService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/elset`, but is otherwise the same as
         * [ElsetService.create].
         */
        @MustBeClosed
        fun create(params: ElsetCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ElsetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            elsetIngest: ElsetIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(ElsetCreateParams.builder().elsetIngest(elsetIngest).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(elsetIngest: ElsetIngest): HttpResponse =
            create(elsetIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/elset/{id}`, but is otherwise the same as
         * [ElsetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Elset> = retrieve(id, ElsetRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Elset> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ElsetRetrieveParams = ElsetRetrieveParams.none(),
        ): HttpResponseFor<Elset> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ElsetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Elset>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ElsetRetrieveParams): HttpResponseFor<Elset> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Elset> =
            retrieve(id, ElsetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset`, but is otherwise the same as
         * [ElsetService.list].
         */
        @MustBeClosed
        fun list(params: ElsetListParams): HttpResponseFor<ElsetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ElsetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ElsetListPage>

        /**
         * Returns a raw HTTP response for `get /udl/elset/count`, but is otherwise the same as
         * [ElsetService.count].
         */
        @MustBeClosed
        fun count(params: ElsetCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: ElsetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/elset/createBulk`, but is otherwise the same
         * as [ElsetService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: ElsetCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: ElsetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /udl/elset/createBulkFromTLE`, but is otherwise the
         * same as [ElsetService.createBulkFromTle].
         */
        @MustBeClosed
        fun createBulkFromTle(params: ElsetCreateBulkFromTleParams): HttpResponse =
            createBulkFromTle(params, RequestOptions.none())

        /** @see createBulkFromTle */
        @MustBeClosed
        fun createBulkFromTle(
            params: ElsetCreateBulkFromTleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/currentelset/queryhelp`, but is otherwise the
         * same as [ElsetService.queryCurrentElsetHelp].
         */
        @MustBeClosed
        fun queryCurrentElsetHelp(): HttpResponseFor<ElsetQueryCurrentElsetHelpResponse> =
            queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none())

        /** @see queryCurrentElsetHelp */
        @MustBeClosed
        fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ElsetQueryCurrentElsetHelpResponse>

        /** @see queryCurrentElsetHelp */
        @MustBeClosed
        fun queryCurrentElsetHelp(
            params: ElsetQueryCurrentElsetHelpParams = ElsetQueryCurrentElsetHelpParams.none()
        ): HttpResponseFor<ElsetQueryCurrentElsetHelpResponse> =
            queryCurrentElsetHelp(params, RequestOptions.none())

        /** @see queryCurrentElsetHelp */
        @MustBeClosed
        fun queryCurrentElsetHelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<ElsetQueryCurrentElsetHelpResponse> =
            queryCurrentElsetHelp(ElsetQueryCurrentElsetHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset/queryhelp`, but is otherwise the same as
         * [ElsetService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<ElsetQueryhelpResponse> =
            queryhelp(ElsetQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ElsetQueryhelpParams = ElsetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ElsetQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: ElsetQueryhelpParams = ElsetQueryhelpParams.none()
        ): HttpResponseFor<ElsetQueryhelpResponse> = queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<ElsetQueryhelpResponse> =
            queryhelp(ElsetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/elset/tuple`, but is otherwise the same as
         * [ElsetService.tuple].
         */
        @MustBeClosed
        fun tuple(params: ElsetTupleParams): HttpResponseFor<List<Elset>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: ElsetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Elset>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-elset`, but is otherwise the same as
         * [ElsetService.unvalidatedPublish].
         */
        @MustBeClosed
        fun unvalidatedPublish(params: ElsetUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(
            params: ElsetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
