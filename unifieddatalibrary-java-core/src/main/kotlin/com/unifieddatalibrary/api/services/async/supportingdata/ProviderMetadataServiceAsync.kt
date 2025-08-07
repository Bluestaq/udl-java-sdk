// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.providermetadata.ProviderMetadataRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProviderMetadataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderMetadataServiceAsync

    fun retrieve(): CompletableFuture<List<DataownerAbridged>> =
        retrieve(ProviderMetadataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DataownerAbridged>>

    /** @see retrieve */
    fun retrieve(
        params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none()
    ): CompletableFuture<List<DataownerAbridged>> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<DataownerAbridged>> =
        retrieve(ProviderMetadataRetrieveParams.none(), requestOptions)

    /**
     * A view of [ProviderMetadataServiceAsync] that provides access to raw HTTP responses for each
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
        ): ProviderMetadataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/providerMetadata`, but is otherwise
         * the same as [ProviderMetadataServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(ProviderMetadataRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>>

        /** @see retrieve */
        fun retrieve(
            params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DataownerAbridged>>> =
            retrieve(ProviderMetadataRetrieveParams.none(), requestOptions)
    }
}
