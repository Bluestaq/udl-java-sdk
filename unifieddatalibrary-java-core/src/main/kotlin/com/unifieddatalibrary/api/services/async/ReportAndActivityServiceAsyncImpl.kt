// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.reportandactivities.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivities.PoiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.reportandactivities.UdlH3geoServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivities.UdlH3geoServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.reportandactivities.UdlSigactServiceAsync
import com.unifieddatalibrary.api.services.async.reportandactivities.UdlSigactServiceAsyncImpl
import java.util.function.Consumer

class ReportAndActivityServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ReportAndActivityServiceAsync {

    private val withRawResponse: ReportAndActivityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val poi: PoiServiceAsync by lazy { PoiServiceAsyncImpl(clientOptions) }

    private val udlH3geo: UdlH3geoServiceAsync by lazy { UdlH3geoServiceAsyncImpl(clientOptions) }

    private val udlSigact: UdlSigactServiceAsync by lazy {
        UdlSigactServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ReportAndActivityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ReportAndActivityServiceAsync =
        ReportAndActivityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun poi(): PoiServiceAsync = poi

    override fun udlH3geo(): UdlH3geoServiceAsync = udlH3geo

    override fun udlSigact(): UdlSigactServiceAsync = udlSigact

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportAndActivityServiceAsync.WithRawResponse {

        private val poi: PoiServiceAsync.WithRawResponse by lazy {
            PoiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val udlH3geo: UdlH3geoServiceAsync.WithRawResponse by lazy {
            UdlH3geoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val udlSigact: UdlSigactServiceAsync.WithRawResponse by lazy {
            UdlSigactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportAndActivityServiceAsync.WithRawResponse =
            ReportAndActivityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun poi(): PoiServiceAsync.WithRawResponse = poi

        override fun udlH3geo(): UdlH3geoServiceAsync.WithRawResponse = udlH3geo

        override fun udlSigact(): UdlSigactServiceAsync.WithRawResponse = udlSigact
    }
}
