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
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelGetFileParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelListParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class GlobalAtmosphericModelServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val globalAtmosphericModelFuture =
            globalAtmosphericModelServiceAsync.retrieve(
                GlobalAtmosphericModelRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val globalAtmosphericModel = globalAtmosphericModelFuture.get()
        globalAtmosphericModel.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val pageFuture =
            globalAtmosphericModelServiceAsync.list(
                GlobalAtmosphericModelListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val responseFuture =
            globalAtmosphericModelServiceAsync.count(
                GlobalAtmosphericModelCountParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun getFile(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            globalAtmosphericModelServiceAsync.getFile(
                GlobalAtmosphericModelGetFileParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val responseFuture = globalAtmosphericModelServiceAsync.queryHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val responseFuture =
            globalAtmosphericModelServiceAsync.tuple(
                GlobalAtmosphericModelTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val globalAtmosphericModelServiceAsync = client.globalAtmosphericModel()

        val future =
            globalAtmosphericModelServiceAsync.unvalidatedPublish(
                GlobalAtmosphericModelUnvalidatedPublishParams.builder()
                    .classificationMarking("U")
                    .dataMode(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
                    .source("Bluestaq")
                    .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                    .type("Global Total Electron Density")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .cadence(10)
                    .checksumValue("938c2cc0dcc05f2b68c4287040cfcf71")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endAlt(90.125)
                    .endLat(-88.75)
                    .endLon(-177.5)
                    .filename("glotec_elecden.geojson")
                    .filesize(2097152L)
                    .numAlt(35)
                    .numLat(72)
                    .numLon(72)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .reportTime(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
                    .sourceDl("AXE")
                    .startAlt(8553.163773)
                    .startLat(88.75)
                    .startLon(177.5)
                    .state("PREDICTED")
                    .stepLat(2.5)
                    .stepLon(5.5)
                    .build()
            )

        val response = future.get()
    }
}
