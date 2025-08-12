// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsync
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsync
import com.unifieddatalibrary.api.services.async.supportingdata.DataownerServiceAsyncImpl
import java.util.function.Consumer

class SupportingDataServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SupportingDataServiceAsync {

    private val withRawResponse: SupportingDataServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val dataTypes: DataTypeServiceAsync by lazy { DataTypeServiceAsyncImpl(clientOptions) }

    private val dataowner: DataownerServiceAsync by lazy { DataownerServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SupportingDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataServiceAsync = SupportingDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun dataTypes(): DataTypeServiceAsync = dataTypes

    override fun dataowner(): DataownerServiceAsync = dataowner

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SupportingDataServiceAsync.WithRawResponse {

        private val dataTypes: DataTypeServiceAsync.WithRawResponse by lazy { DataTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val dataowner: DataownerServiceAsync.WithRawResponse by lazy { DataownerServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDataServiceAsync.WithRawResponse = SupportingDataServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun dataTypes(): DataTypeServiceAsync.WithRawResponse = dataTypes

        override fun dataowner(): DataownerServiceAsync.WithRawResponse = dataowner
    }
}
