// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerTypeServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.ProviderMetadataServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.ProviderMetadataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.QueryHelpServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.QueryHelpServiceAsyncImpl
import java.util.function.Consumer

class SupportingDataServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SupportingDataServiceAsync {

    private val withRawResponse: SupportingDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dataTypes: DataTypeServiceAsync by lazy { DataTypeServiceAsyncImpl(clientOptions) }

    private val dataowner: DataownerServiceAsync by lazy {
        DataownerServiceAsyncImpl(clientOptions)
    }

    private val dataownerTypes: DataownerTypeServiceAsync by lazy {
        DataownerTypeServiceAsyncImpl(clientOptions)
    }

    private val providerMetadata: ProviderMetadataServiceAsync by lazy {
        ProviderMetadataServiceAsyncImpl(clientOptions)
    }

    private val queryHelp: QueryHelpServiceAsync by lazy {
        QueryHelpServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SupportingDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SupportingDataServiceAsync =
        SupportingDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun dataTypes(): DataTypeServiceAsync = dataTypes

    override fun dataowner(): DataownerServiceAsync = dataowner

    override fun dataownerTypes(): DataownerTypeServiceAsync = dataownerTypes

    override fun providerMetadata(): ProviderMetadataServiceAsync = providerMetadata

    override fun queryHelp(): QueryHelpServiceAsync = queryHelp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupportingDataServiceAsync.WithRawResponse {

        private val dataTypes: DataTypeServiceAsync.WithRawResponse by lazy {
            DataTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataowner: DataownerServiceAsync.WithRawResponse by lazy {
            DataownerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataownerTypes: DataownerTypeServiceAsync.WithRawResponse by lazy {
            DataownerTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val providerMetadata: ProviderMetadataServiceAsync.WithRawResponse by lazy {
            ProviderMetadataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val queryHelp: QueryHelpServiceAsync.WithRawResponse by lazy {
            QueryHelpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupportingDataServiceAsync.WithRawResponse =
            SupportingDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun dataTypes(): DataTypeServiceAsync.WithRawResponse = dataTypes

        override fun dataowner(): DataownerServiceAsync.WithRawResponse = dataowner

        override fun dataownerTypes(): DataownerTypeServiceAsync.WithRawResponse = dataownerTypes

        override fun providerMetadata(): ProviderMetadataServiceAsync.WithRawResponse =
            providerMetadata

        override fun queryHelp(): QueryHelpServiceAsync.WithRawResponse = queryHelp
    }
}
