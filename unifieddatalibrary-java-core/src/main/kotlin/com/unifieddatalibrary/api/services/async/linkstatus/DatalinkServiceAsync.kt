// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.linkstatus

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCountParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkCreateParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkIngest
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListPageAsync
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkListParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleParams
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkTupleResponse
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkUnvalidatedPublishParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DatalinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatalinkServiceAsync

    /**
     * Service operation to take a single DataLink record as a POST body and ingest into the
     * database. A specific role is required to perform this service operation. Please contact the
     * UDL team for assistance.
     */
    fun create(params: DatalinkCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DatalinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        datalinkIngest: DatalinkIngest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(
            DatalinkCreateParams.builder().datalinkIngest(datalinkIngest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(datalinkIngest: DatalinkIngest): CompletableFuture<Void?> =
        create(datalinkIngest, RequestOptions.none())

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: DatalinkListParams): CompletableFuture<DatalinkListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DatalinkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatalinkListPageAsync>

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: DatalinkCountParams): CompletableFuture<String> =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: DatalinkCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<DatalinkQueryhelpResponse> =
        queryhelp(DatalinkQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatalinkQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none()
    ): CompletableFuture<DatalinkQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<DatalinkQueryhelpResponse> =
        queryhelp(DatalinkQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: DatalinkTupleParams): CompletableFuture<List<DatalinkTupleResponse>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: DatalinkTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatalinkTupleResponse>>

    /**
     * Service operation to take multiple datalink records as a POST body and ingest into the
     * database. This operation is intended to be used for automated feeds into UDL. A specific role
     * is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: DatalinkUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(params, RequestOptions.none())

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(
        params: DatalinkUnvalidatedPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DatalinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatalinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/datalink`, but is otherwise the same as
         * [DatalinkServiceAsync.create].
         */
        fun create(params: DatalinkCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DatalinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            datalinkIngest: DatalinkIngest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                DatalinkCreateParams.builder().datalinkIngest(datalinkIngest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(datalinkIngest: DatalinkIngest): CompletableFuture<HttpResponse> =
            create(datalinkIngest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /udl/datalink`, but is otherwise the same as
         * [DatalinkServiceAsync.list].
         */
        fun list(
            params: DatalinkListParams
        ): CompletableFuture<HttpResponseFor<DatalinkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DatalinkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatalinkListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /udl/datalink/count`, but is otherwise the same as
         * [DatalinkServiceAsync.count].
         */
        fun count(params: DatalinkCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(params, RequestOptions.none())

        /** @see count */
        fun count(
            params: DatalinkCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /udl/datalink/queryhelp`, but is otherwise the same
         * as [DatalinkServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<DatalinkQueryhelpResponse>> =
            queryhelp(DatalinkQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatalinkQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: DatalinkQueryhelpParams = DatalinkQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<DatalinkQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DatalinkQueryhelpResponse>> =
            queryhelp(DatalinkQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/datalink/tuple`, but is otherwise the same as
         * [DatalinkServiceAsync.tuple].
         */
        fun tuple(
            params: DatalinkTupleParams
        ): CompletableFuture<HttpResponseFor<List<DatalinkTupleResponse>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: DatalinkTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatalinkTupleResponse>>>

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-datalink`, but is otherwise the same
         * as [DatalinkServiceAsync.unvalidatedPublish].
         */
        fun unvalidatedPublish(
            params: DatalinkUnvalidatedPublishParams
        ): CompletableFuture<HttpResponse> = unvalidatedPublish(params, RequestOptions.none())

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(
            params: DatalinkUnvalidatedPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
