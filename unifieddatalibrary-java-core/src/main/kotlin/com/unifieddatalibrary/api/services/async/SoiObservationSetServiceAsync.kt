// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCountParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateBulkParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetCreateParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetGetParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListPageAsync
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetListParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpResponse
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetTupleParams
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.soiobservationset.history.SoiObservationSetFull
import com.unifieddatalibrary.api.services.async.soiobservationset.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SoiObservationSetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SoiObservationSetServiceAsync

    fun history(): HistoryServiceAsync

    /**
     * Service operation to take a single SOIObservationSet record as a POST body and ingest into
     * the database. A specific role is required to perform this service operation. Please contact
     * the UDL team for assistance.
     */
    fun create(params: SoiObservationSetCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SoiObservationSetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters. The query will
     * return the SOI Observation Sets and not the associated SOI Observations. See the queryhelp
     * operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query
     * parameter information.
     */
    fun list(
        params: SoiObservationSetListParams
    ): CompletableFuture<SoiObservationSetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SoiObservationSetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SoiObservationSetListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: SoiObservationSetCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: SoiObservationSetCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation intended for initial integration only, to take a list of SOIObservationSet
     * records as a POST body and ingest into the database. This operation is not intended to be
     * used for automated feeds into UDL. Data providers should contact the UDL team for specific
     * role assignments and for instructions on setting up a permanent feed through an alternate
     * mechanism.
     */
    fun createBulk(params: SoiObservationSetCreateBulkParams): CompletableFuture<Void?> =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: SoiObservationSetCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to get a single SOIObservationSet by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): CompletableFuture<SoiObservationSetFull> =
        get(id, SoiObservationSetGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SoiObservationSetFull> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(),
    ): CompletableFuture<SoiObservationSetFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SoiObservationSetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SoiObservationSetFull>

    /** @see get */
    fun get(params: SoiObservationSetGetParams): CompletableFuture<SoiObservationSetFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<SoiObservationSetFull> =
        get(id, SoiObservationSetGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<SoiObservationSetQueryhelpResponse> =
        queryhelp(SoiObservationSetQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SoiObservationSetQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none()
    ): CompletableFuture<SoiObservationSetQueryhelpResponse> =
        queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<SoiObservationSetQueryhelpResponse> =
        queryhelp(SoiObservationSetQueryhelpParams.none(), requestOptions)

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
        params: SoiObservationSetTupleParams
    ): CompletableFuture<List<SoiObservationSetFull>> = tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: SoiObservationSetTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SoiObservationSetFull>>

    /**
     * Service operation to take multiple SOIObservationSet records as a POST body and ingest into
     * the database. This operation is intended to be used for automated feeds into UDL. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unvalidatedPublish(
        params: SoiObservationSetUnvalidatedPublishParams
    ): CompletableFuture<Void?> = unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: SoiObservationSetUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SoiObservationSetServiceAsync] that provides access to raw HTTP responses for each
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
        ): SoiObservationSetServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/soiobservationset`, but is otherwise the same
         * as [SoiObservationSetServiceAsync.create].
         */
        fun create(params: SoiObservationSetCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SoiObservationSetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/soiobservationset`, but is otherwise the same
         * as [SoiObservationSetServiceAsync.list].
         */
        fun list(
            params: SoiObservationSetListParams
        ): CompletableFuture<HttpResponseFor<SoiObservationSetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SoiObservationSetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SoiObservationSetListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/soiobservationset/count`, but is otherwise the
         * same as [SoiObservationSetServiceAsync.count].
         */
        fun count(
            params: SoiObservationSetCountParams
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: SoiObservationSetCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /udl/soiobservationset/createBulk`, but is
         * otherwise the same as [SoiObservationSetServiceAsync.createBulk].
         */
        fun createBulk(params: SoiObservationSetCreateBulkParams): CompletableFuture<HttpResponse> =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        fun createBulk(
            params: SoiObservationSetCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/soiobservationset/{id}`, but is otherwise the
         * same as [SoiObservationSetServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<SoiObservationSetFull>> =
            get(id, SoiObservationSetGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SoiObservationSetFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: SoiObservationSetGetParams = SoiObservationSetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SoiObservationSetFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SoiObservationSetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SoiObservationSetFull>>

        /** @see get */
        fun get(
            params: SoiObservationSetGetParams
        ): CompletableFuture<HttpResponseFor<SoiObservationSetFull>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SoiObservationSetFull>> =
            get(id, SoiObservationSetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/soiobservationset/queryhelp`, but is otherwise
         * the same as [SoiObservationSetServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<SoiObservationSetQueryhelpResponse>> =
            queryhelp(SoiObservationSetQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SoiObservationSetQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: SoiObservationSetQueryhelpParams = SoiObservationSetQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<SoiObservationSetQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SoiObservationSetQueryhelpResponse>> =
            queryhelp(SoiObservationSetQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/soiobservationset/tuple`, but is otherwise the
         * same as [SoiObservationSetServiceAsync.tuple].
         */
        fun tuple(
            params: SoiObservationSetTupleParams
        ): CompletableFuture<HttpResponseFor<List<SoiObservationSetFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: SoiObservationSetTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SoiObservationSetFull>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-soiobservationset`, but is otherwise
         * the same as [SoiObservationSetServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: SoiObservationSetUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: SoiObservationSetUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
