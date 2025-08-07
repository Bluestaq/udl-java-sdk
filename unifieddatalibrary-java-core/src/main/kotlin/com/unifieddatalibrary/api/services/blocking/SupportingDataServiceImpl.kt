// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerTypeService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.ProviderMetadataService
import com.unifieddatalibrary.api.services.blocking.supportingdata.ProviderMetadataServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.QueryHelpService
import com.unifieddatalibrary.api.services.blocking.supportingdata.QueryHelpServiceImpl
import java.util.function.Consumer

class SupportingDataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SupportingDataService {

    private val withRawResponse: SupportingDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dataTypes: DataTypeService by lazy { DataTypeServiceImpl(clientOptions) }

    private val dataowner: DataownerService by lazy { DataownerServiceImpl(clientOptions) }

    private val dataownerTypes: DataownerTypeService by lazy {
        DataownerTypeServiceImpl(clientOptions)
    }

    private val providerMetadata: ProviderMetadataService by lazy {
        ProviderMetadataServiceImpl(clientOptions)
    }

    private val queryHelp: QueryHelpService by lazy { QueryHelpServiceImpl(clientOptions) }

    override fun withRawResponse(): SupportingDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataService =
        SupportingDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun dataTypes(): DataTypeService = dataTypes

    override fun dataowner(): DataownerService = dataowner

    override fun dataownerTypes(): DataownerTypeService = dataownerTypes

    override fun providerMetadata(): ProviderMetadataService = providerMetadata

    override fun queryHelp(): QueryHelpService = queryHelp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupportingDataService.WithRawResponse {

        private val dataTypes: DataTypeService.WithRawResponse by lazy {
            DataTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataowner: DataownerService.WithRawResponse by lazy {
            DataownerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataownerTypes: DataownerTypeService.WithRawResponse by lazy {
            DataownerTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val providerMetadata: ProviderMetadataService.WithRawResponse by lazy {
            ProviderMetadataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val queryHelp: QueryHelpService.WithRawResponse by lazy {
            QueryHelpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupportingDataService.WithRawResponse =
            SupportingDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun dataTypes(): DataTypeService.WithRawResponse = dataTypes

        override fun dataowner(): DataownerService.WithRawResponse = dataowner

        override fun dataownerTypes(): DataownerTypeService.WithRawResponse = dataownerTypes

        override fun providerMetadata(): ProviderMetadataService.WithRawResponse = providerMetadata

        override fun queryHelp(): QueryHelpService.WithRawResponse = queryHelp
    }
}
