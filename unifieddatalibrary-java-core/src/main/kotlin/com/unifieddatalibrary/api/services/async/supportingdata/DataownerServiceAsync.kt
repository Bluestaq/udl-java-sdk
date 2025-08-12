// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

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
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataownerServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerServiceAsync

    fun retrieve(): CompletableFuture<List<DataownerAbridged>> = retrieve(DataownerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(params: DataownerRetrieveParams = DataownerRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<DataownerAbridged>>

    /** @see retrieve */
    fun retrieve(params: DataownerRetrieveParams = DataownerRetrieveParams.none()): CompletableFuture<List<DataownerAbridged>> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<DataownerAbridged>> =
        retrieve(
          DataownerRetrieveParams.none(), requestOptions
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(DataownerCountParams.none())

    /** @see count */
    fun count(params: DataownerCountParams = DataownerCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: DataownerCountParams = DataownerCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          DataownerCountParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<DataownerQueryHelpResponse> = queryHelp(DataownerQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: DataownerQueryHelpParams = DataownerQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DataownerQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: DataownerQueryHelpParams = DataownerQueryHelpParams.none()): CompletableFuture<DataownerQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<DataownerQueryHelpResponse> =
        queryHelp(
          DataownerQueryHelpParams.none(), requestOptions
        )

    /** Retrieves all distinct data owner types. */
    fun retrieveDataOwnerTypes(): CompletableFuture<List<String>> = retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none())

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams = DataownerRetrieveDataOwnerTypesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<String>>

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams = DataownerRetrieveDataOwnerTypesParams.none()): CompletableFuture<List<String>> =
        retrieveDataOwnerTypes(
          params, RequestOptions.none()
        )

    /** @see retrieveDataOwnerTypes */
    fun retrieveDataOwnerTypes(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        retrieveDataOwnerTypes(
          DataownerRetrieveDataOwnerTypesParams.none(), requestOptions
        )

    fun retrieveProviderMetadata(): CompletableFuture<List<DataownerAbridged>> = retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none())

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams = DataownerRetrieveProviderMetadataParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<DataownerAbridged>>

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams = DataownerRetrieveProviderMetadataParams.none()): CompletableFuture<List<DataownerAbridged>> =
        retrieveProviderMetadata(
          params, RequestOptions.none()
        )

    /** @see retrieveProviderMetadata */
    fun retrieveProviderMetadata(requestOptions: RequestOptions): CompletableFuture<List<DataownerAbridged>> =
        retrieveProviderMetadata(
          DataownerRetrieveProviderMetadataParams.none(), requestOptions
        )

    /** A view of [DataownerServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataownerServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/dataowner`, but is otherwise the same as [DataownerServiceAsync.retrieve]. */
        fun retrieve(): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> = retrieve(DataownerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(params: DataownerRetrieveParams = DataownerRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>>

        /** @see retrieve */
        fun retrieve(params: DataownerRetrieveParams = DataownerRetrieveParams.none()): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(
              DataownerRetrieveParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/dataowner/count`, but is otherwise the same as [DataownerServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(DataownerCountParams.none())

        /** @see count */
        fun count(params: DataownerCountParams = DataownerCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: DataownerCountParams = DataownerCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              DataownerCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/dataowner/queryhelp`, but is otherwise the same as [DataownerServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<DataownerQueryHelpResponse>> = queryHelp(DataownerQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: DataownerQueryHelpParams = DataownerQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DataownerQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: DataownerQueryHelpParams = DataownerQueryHelpParams.none()): CompletableFuture<HttpResponseFor<DataownerQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DataownerQueryHelpResponse>> =
            queryHelp(
              DataownerQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/dataowner/getDataOwnerTypes`, but is otherwise the same as [DataownerServiceAsync.retrieveDataOwnerTypes]. */
        fun retrieveDataOwnerTypes(): CompletableFuture<HttpResponseFor<List<String>>> = retrieveDataOwnerTypes(DataownerRetrieveDataOwnerTypesParams.none())

        /** @see retrieveDataOwnerTypes */
        fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams = DataownerRetrieveDataOwnerTypesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see retrieveDataOwnerTypes */
        fun retrieveDataOwnerTypes(params: DataownerRetrieveDataOwnerTypesParams = DataownerRetrieveDataOwnerTypesParams.none()): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieveDataOwnerTypes(
              params, RequestOptions.none()
            )

        /** @see retrieveDataOwnerTypes */
        fun retrieveDataOwnerTypes(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<String>>> =
            retrieveDataOwnerTypes(
              DataownerRetrieveDataOwnerTypesParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/dataowner/providerMetadata`, but is otherwise the same as [DataownerServiceAsync.retrieveProviderMetadata]. */
        fun retrieveProviderMetadata(): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> = retrieveProviderMetadata(DataownerRetrieveProviderMetadataParams.none())

        /** @see retrieveProviderMetadata */
        fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams = DataownerRetrieveProviderMetadataParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>>

        /** @see retrieveProviderMetadata */
        fun retrieveProviderMetadata(params: DataownerRetrieveProviderMetadataParams = DataownerRetrieveProviderMetadataParams.none()): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieveProviderMetadata(
              params, RequestOptions.none()
            )

        /** @see retrieveProviderMetadata */
        fun retrieveProviderMetadata(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieveProviderMetadata(
              DataownerRetrieveProviderMetadataParams.none(), requestOptions
            )
    }
}
