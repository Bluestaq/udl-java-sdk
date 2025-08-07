// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.scsviews.ScsViewRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ScsViewServiceAsyncTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val scsViewServiceAsync = client.scsViews()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val scsViewFuture =
            scsViewServiceAsync.retrieve(
                ScsViewRetrieveParams.builder()
                    .id("/Documentation/project.pdf")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val scsView = scsViewFuture.get()
        assertThat(scsView.body()).hasContent("abc")
    }
}
