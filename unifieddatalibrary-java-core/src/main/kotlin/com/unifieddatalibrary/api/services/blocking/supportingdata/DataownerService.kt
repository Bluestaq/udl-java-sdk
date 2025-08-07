// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import java.util.function.Consumer

interface DataownerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerService

    fun retrieve(): List<DataownerAbridged> = retrieve(DataownerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: DataownerRetrieveParams = DataownerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DataownerAbridged>

    /** @see retrieve */
    fun retrieve(
        params: DataownerRetrieveParams = DataownerRetrieveParams.none()
    ): List<DataownerAbridged> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): List<DataownerAbridged> =
        retrieve(DataownerRetrieveParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): String = count(DataownerCountParams.none())

    /** @see count */
    fun count(
        params: DataownerCountParams = DataownerCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see count */
    fun count(params: DataownerCountParams = DataownerCountParams.none()): String =
        count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(DataownerCountParams.none(), requestOptions)

    /** A view of [DataownerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner`, but is otherwise the same as
         * [DataownerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<List<DataownerAbridged>> =
            retrieve(DataownerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DataownerRetrieveParams = DataownerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DataownerAbridged>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DataownerRetrieveParams = DataownerRetrieveParams.none()
        ): HttpResponseFor<List<DataownerAbridged>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<List<DataownerAbridged>> =
            retrieve(DataownerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/count`, but is otherwise the same as
         * [DataownerService.count].
         */
        @MustBeClosed fun count(): HttpResponseFor<String> = count(DataownerCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: DataownerCountParams = DataownerCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(
            params: DataownerCountParams = DataownerCountParams.none()
        ): HttpResponseFor<String> = count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(DataownerCountParams.none(), requestOptions)
    }
}
