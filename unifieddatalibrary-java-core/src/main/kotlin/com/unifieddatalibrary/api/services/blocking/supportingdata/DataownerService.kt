// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerQueryHelpParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerQueryHelpResponse
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveDataOwnerTypesParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveProviderMetadataParams
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

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryHelp(): DataownerQueryHelpResponse = queryHelp(DataownerQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(
        params: DataownerQueryHelpParams = DataownerQueryHelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataownerQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(
        params: DataownerQueryHelpParams = DataownerQueryHelpParams.none()
    ): DataownerQueryHelpResponse = queryHelp(params, RequestOptions.none())

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): DataownerQueryHelpResponse =
        queryHelp(DataownerQueryHelpParams.none(), requestOptions)

    /** Retrieves all distinct data owner types. */
    fun retrieveDataOwnerTypes(): List<String> =
        retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none())

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(
        params: DataownerRetrieveDataOwnerTypesParams =
            DataownerRetrieveDataOwnerTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(
        params: DataownerRetrieveDataOwnerTypesParams = DataownerRetrieveDataOwnerTypesParams.none()
    ): List<String> = retrieveDataOwnerTypes(params, RequestOptions.none())

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(requestOptions: RequestOptions): List<String> =
        retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none(), requestOptions)

    fun retrieveProviderMetadata(): List<DataownerAbridged> =
        retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none())

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(
        params: DataownerRetrieveProviderMetadataParams =
            DataownerRetrieveProviderMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DataownerAbridged>

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(
        params: DataownerRetrieveProviderMetadataParams =
            DataownerRetrieveProviderMetadataParams.none()
    ): List<DataownerAbridged> = retrieveProviderMetadata(params, RequestOptions.none())

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(requestOptions: RequestOptions): List<DataownerAbridged> =
        retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/queryhelp`, but is otherwise the same
         * as [DataownerService.queryHelp].
         */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<DataownerQueryHelpResponse> =
            queryHelp(DataownerQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: DataownerQueryHelpParams = DataownerQueryHelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataownerQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(
            params: DataownerQueryHelpParams = DataownerQueryHelpParams.none()
        ): HttpResponseFor<DataownerQueryHelpResponse> = queryHelp(params, RequestOptions.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<DataownerQueryHelpResponse> =
            queryHelp(DataownerQueryHelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/getDataOwnerTypes`, but is otherwise
         * the same as [DataownerService.retrieveDataOwnerTypes].
         */
        @MustBeClosed
        fun retrieveDataOwnerTypes(): HttpResponseFor<List<String>> =
            retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none())

        /** @see retrieveDataOwnerTypes */
        @MustBeClosed
        fun retrieveDataOwnerTypes(
            params: DataownerRetrieveDataOwnerTypesParams =
                DataownerRetrieveDataOwnerTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see retrieveDataOwnerTypes */
        @MustBeClosed
        fun retrieveDataOwnerTypes(
            params: DataownerRetrieveDataOwnerTypesParams =
                DataownerRetrieveDataOwnerTypesParams.none()
        ): HttpResponseFor<List<String>> = retrieveDataOwnerTypes(params, RequestOptions.none())

        /** @see retrieveDataOwnerTypes */
        @MustBeClosed
        fun retrieveDataOwnerTypes(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/providerMetadata`, but is otherwise
         * the same as [DataownerService.retrieveProviderMetadata].
         */
        @MustBeClosed
        fun retrieveProviderMetadata(): HttpResponseFor<List<DataownerAbridged>> =
            retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none())

        /** @see retrieveProviderMetadata */
        @MustBeClosed
        fun retrieveProviderMetadata(
            params: DataownerRetrieveProviderMetadataParams =
                DataownerRetrieveProviderMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DataownerAbridged>>

        /** @see retrieveProviderMetadata */
        @MustBeClosed
        fun retrieveProviderMetadata(
            params: DataownerRetrieveProviderMetadataParams =
                DataownerRetrieveProviderMetadataParams.none()
        ): HttpResponseFor<List<DataownerAbridged>> =
            retrieveProviderMetadata(params, RequestOptions.none())

        /** @see retrieveProviderMetadata */
        @MustBeClosed
        fun retrieveProviderMetadata(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<DataownerAbridged>> =
            retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none(), requestOptions)
    }
}
