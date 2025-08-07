// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataownerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerServiceAsync

    fun retrieve(): CompletableFuture<List<DataownerAbridged>> =
        retrieve(DataownerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: DataownerRetrieveParams = DataownerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DataownerAbridged>>

    /** @see retrieve */
    fun retrieve(
        params: DataownerRetrieveParams = DataownerRetrieveParams.none()
    ): CompletableFuture<List<DataownerAbridged>> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<DataownerAbridged>> =
        retrieve(DataownerRetrieveParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(DataownerCountParams.none())

    /** @see count */
    fun count(
        params: DataownerCountParams = DataownerCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: DataownerCountParams = DataownerCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(DataownerCountParams.none(), requestOptions)

    /**
     * A view of [DataownerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataownerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner`, but is otherwise the same as
         * [DataownerServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(DataownerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: DataownerRetrieveParams = DataownerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>>

        /** @see retrieve */
        fun retrieve(
            params: DataownerRetrieveParams = DataownerRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(DataownerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/count`, but is otherwise the same as
         * [DataownerServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(DataownerCountParams.none())

        /** @see count */
        fun count(
            params: DataownerCountParams = DataownerCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: DataownerCountParams = DataownerCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(DataownerCountParams.none(), requestOptions)
    }
}
