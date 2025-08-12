// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.reportandactivities

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.reportandactivities.PoiService
import com.unifieddatalibrary.api.services.blocking.reportandactivities.PoiServiceImpl
import com.unifieddatalibrary.api.services.blocking.reportandactivities.poi.HistoryService
import com.unifieddatalibrary.api.services.blocking.reportandactivities.poi.HistoryServiceImpl
import java.util.function.Consumer

class PoiServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PoiService {

    private val withRawResponse: PoiService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): PoiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService = PoiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PoiService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy { HistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoiService.WithRawResponse = PoiServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun history(): HistoryService.WithRawResponse = history
    }
}
