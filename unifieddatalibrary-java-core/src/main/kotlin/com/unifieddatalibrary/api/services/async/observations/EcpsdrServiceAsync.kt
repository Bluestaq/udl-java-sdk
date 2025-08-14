// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.observations.ecpsdr.Ecpsdr
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCountParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateBulkParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListPageAsync
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrQueryHelpParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrQueryHelpResponse
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrRetrieveParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrTupleParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EcpsdrServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EcpsdrServiceAsync

    /**
     * Service operation to take a single ECPSDR as a POST body and ingest into the database. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun create(params: EcpsdrCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EcpsdrCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Service operation to get a single ECPSDR by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<Ecpsdr> = retrieve(id, EcpsdrRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EcpsdrRetrieveParams = EcpsdrRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ecpsdr> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EcpsdrRetrieveParams = EcpsdrRetrieveParams.none(),
    ): CompletableFuture<Ecpsdr> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EcpsdrRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ecpsdr>

    /** @see retrieve */
    fun retrieve(params: EcpsdrRetrieveParams): CompletableFuture<Ecpsdr> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Ecpsdr> =
        retrieve(id, EcpsdrRetrieveParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: EcpsdrListParams): CompletableFuture<EcpsdrListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EcpsdrListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EcpsdrListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: EcpsdrCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: EcpsdrCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of ECPSDR as a POST
     * body and ingest into the database. This operation is not intended to be used for automated
     * feeds into UDL. Data providers should contact the UDL team for specific role assignments and
     * for instructions on setting up a permanent feed through an alternate mechanism.
     */
    fun createBulk(params: EcpsdrCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: EcpsdrCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): CompletableFuture<EcpsdrQueryHelpResponse> =
        queryHelp(EcpsdrQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: EcpsdrQueryHelpParams = EcpsdrQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EcpsdrQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(
        params: EcpsdrQueryHelpParams = EcpsdrQueryHelpParams.none()
    ): CompletableFuture<EcpsdrQueryHelpResponse> = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<EcpsdrQueryHelpResponse> =
        queryHelp(EcpsdrQueryHelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: EcpsdrTupleParams): CompletableFuture<List<Ecpsdr>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: EcpsdrTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Ecpsdr>>

    /**
     * A view of [EcpsdrServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EcpsdrServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/ecpsdr`, but is otherwise the same as
         * [EcpsdrServiceAsync.create].
         */
        fun create(params: EcpsdrCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EcpsdrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ecpsdr/{id}`, but is otherwise the same as
         * [EcpsdrServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Ecpsdr>> =
            retrieve(id, EcpsdrRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EcpsdrRetrieveParams = EcpsdrRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ecpsdr>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EcpsdrRetrieveParams = EcpsdrRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Ecpsdr>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EcpsdrRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ecpsdr>>

        /** @see retrieve */
        fun retrieve(params: EcpsdrRetrieveParams): CompletableFuture<HttpResponseFor<Ecpsdr>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Ecpsdr>> =
            retrieve(id, EcpsdrRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ecpsdr`, but is otherwise the same as
         * [EcpsdrServiceAsync.list].
         */
        fun list(
            params: EcpsdrListParams
        ): CompletableFuture<HttpResponseFor<EcpsdrListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EcpsdrListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EcpsdrListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/ecpsdr/count`, but is otherwise the same as
         * [EcpsdrServiceAsync.count].
         */
        fun count(params: EcpsdrCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: EcpsdrCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/ecpsdr/createBulk`, but is otherwise the same
         * as [EcpsdrServiceAsync.createBulk].
         */
        fun createBulk(params: EcpsdrCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: EcpsdrCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/ecpsdr/queryhelp`, but is otherwise the same as
         * [EcpsdrServiceAsync.queryHelp].
         */
        fun queryHelp(): CompletableFuture<HttpResponseFor<EcpsdrQueryHelpResponse>> =
            queryHelp(EcpsdrQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(
            params: EcpsdrQueryHelpParams = EcpsdrQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EcpsdrQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(
            params: EcpsdrQueryHelpParams = EcpsdrQueryHelpParams.none()
        ): CompletableFuture<HttpResponseFor<EcpsdrQueryHelpResponse>> =
            queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        fun queryHelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EcpsdrQueryHelpResponse>> =
            queryHelp(EcpsdrQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/ecpsdr/tuple`, but is otherwise the same as
         * [EcpsdrServiceAsync.tuple].
         */
        fun tuple(params: EcpsdrTupleParams): CompletableFuture<HttpResponseFor<List<Ecpsdr>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: EcpsdrTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Ecpsdr>>>
    }
}
