// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.SupportingDataService
import com.unifieddatalibrary.api.services.blocking.SupportingDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerService
import com.unifieddatalibrary.api.services.blocking.supportingdata.DataownerServiceImpl
import java.util.function.Consumer

class SupportingDataServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SupportingDataService {

    private val withRawResponse: SupportingDataService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val dataTypes: DataTypeService by lazy { DataTypeServiceImpl(clientOptions) }

    private val dataowner: DataownerService by lazy { DataownerServiceImpl(clientOptions) }

    override fun withRawResponse(): SupportingDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataService = SupportingDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun dataTypes(): DataTypeService = dataTypes

    override fun dataowner(): DataownerService = dataowner

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SupportingDataService.WithRawResponse {

        private val dataTypes: DataTypeService.WithRawResponse by lazy { DataTypeServiceImpl.WithRawResponseImpl(clientOptions) }

        private val dataowner: DataownerService.WithRawResponse by lazy { DataownerServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataService.WithRawResponse = SupportingDataServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun dataTypes(): DataTypeService.WithRawResponse = dataTypes

        override fun dataowner(): DataownerService.WithRawResponse = dataowner
    }
}
