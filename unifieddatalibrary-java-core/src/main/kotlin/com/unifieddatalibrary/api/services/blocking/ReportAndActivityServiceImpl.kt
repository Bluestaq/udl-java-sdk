// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.reportandactivity.PoiService
import com.unifieddatalibrary.api.services.blocking.reportandactivity.PoiServiceImpl
import com.unifieddatalibrary.api.services.blocking.reportandactivity.UdlH3geoService
import com.unifieddatalibrary.api.services.blocking.reportandactivity.UdlH3geoServiceImpl
import com.unifieddatalibrary.api.services.blocking.reportandactivity.UdlSigactService
import com.unifieddatalibrary.api.services.blocking.reportandactivity.UdlSigactServiceImpl
import java.util.function.Consumer

class ReportAndActivityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportAndActivityService {

    private val withRawResponse: ReportAndActivityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val poi: PoiService by lazy { PoiServiceImpl(clientOptions) }

    private val udlH3geo: UdlH3geoService by lazy { UdlH3geoServiceImpl(clientOptions) }

    private val udlSigact: UdlSigactService by lazy { UdlSigactServiceImpl(clientOptions) }

    override fun withRawResponse(): ReportAndActivityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportAndActivityService =
        ReportAndActivityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun poi(): PoiService = poi

    override fun udlH3geo(): UdlH3geoService = udlH3geo

    override fun udlSigact(): UdlSigactService = udlSigact

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportAndActivityService.WithRawResponse {

        private val poi: PoiService.WithRawResponse by lazy {
            PoiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val udlH3geo: UdlH3geoService.WithRawResponse by lazy {
            UdlH3geoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val udlSigact: UdlSigactService.WithRawResponse by lazy {
            UdlSigactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportAndActivityService.WithRawResponse =
            ReportAndActivityServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun poi(): PoiService.WithRawResponse = poi

        override fun udlH3geo(): UdlH3geoService.WithRawResponse = udlH3geo

        override fun udlSigact(): UdlSigactService.WithRawResponse = udlSigact
    }
}
