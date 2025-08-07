// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import com.unifieddatalibrary.api.models.supportingdata.providermetadata.ProviderMetadataRetrieveParams
import java.util.function.Consumer

interface ProviderMetadataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderMetadataService

    fun retrieve(): List<DataownerAbridged> = retrieve(ProviderMetadataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DataownerAbridged>

    /** @see retrieve */
    fun retrieve(
        params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none()
    ): List<DataownerAbridged> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): List<DataownerAbridged> =
        retrieve(ProviderMetadataRetrieveParams.none(), requestOptions)

    /**
     * A view of [ProviderMetadataService] that provides access to raw HTTP responses for each
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
        ): ProviderMetadataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /udl/dataowner/providerMetadata`, but is otherwise
         * the same as [ProviderMetadataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<List<DataownerAbridged>> =
            retrieve(ProviderMetadataRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DataownerAbridged>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProviderMetadataRetrieveParams = ProviderMetadataRetrieveParams.none()
        ): HttpResponseFor<List<DataownerAbridged>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<List<DataownerAbridged>> =
            retrieve(ProviderMetadataRetrieveParams.none(), requestOptions)
    }
}
