// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.reportandactivities

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.reportandactivities.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivities.PoiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.reportandactivities.poi.HistoryServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivities.poi.HistoryServiceAsyncImpl
import java.util.function.Consumer

class PoiServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PoiServiceAsync {

    private val withRawResponse: PoiServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PoiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiServiceAsync = PoiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PoiServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy { HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiServiceAsync.WithRawResponse = PoiServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}
