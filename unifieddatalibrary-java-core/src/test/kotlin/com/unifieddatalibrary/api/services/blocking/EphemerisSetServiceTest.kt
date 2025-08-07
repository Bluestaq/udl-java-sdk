// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCountParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetCreateParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetFileRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetRetrieveParams
import com.unifieddatalibrary.api.models.ephemerissets.EphemerisSetTupleParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class EphemerisSetServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        ephemerisSetService.create(
            EphemerisSetCreateParams.builder()
                .category("ANALYST")
                .classificationMarking("U")
                .dataMode(EphemerisSetCreateParams.DataMode.TEST)
                .numPoints(1)
                .pointEndTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .pointStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .source("Bluestaq")
                .type("LAUNCH")
                .id("EPHEMERISSET-ID")
                .bDot(1.1)
                .centBody("Earth")
                .comments("Example notes")
                .covReferenceFrame(EphemerisSetCreateParams.CovReferenceFrame.J2000)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .descriptor("Example descriptor")
                .dragModel("JAC70")
                .edr(1.1)
                .addEphemerisList(
                    EphemerisSetCreateParams.EphemerisList.builder()
                        .classificationMarking("U")
                        .dataMode(EphemerisSetCreateParams.EphemerisList.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                        .xpos(1.1)
                        .xvel(1.1)
                        .ypos(1.1)
                        .yvel(1.1)
                        .zpos(1.1)
                        .zvel(1.1)
                        .id("EPHEMERIS-ID")
                        .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .esId("ES-ID")
                        .idOnOrbit("ONORBIT-ID")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origObjectId("ORIGOBJECT-ID")
                        .xaccel(1.1)
                        .yaccel(1.1)
                        .zaccel(1.1)
                        .build()
                )
                .filename("Example file name")
                .geopotentialModel("GEM-T3")
                .hasAccel(false)
                .hasCov(false)
                .hasMnvr(false)
                .addIdManeuver("EXAMPLE_ID1")
                .addIdManeuver("EXAMPLE_ID2")
                .idOnOrbit("ONORBIT-ID")
                .idStateVector("STATEVECTOR-ID")
                .integrator("COWELL")
                .interpolation("LINEAR")
                .interpolationDegree(5)
                .lunarSolar(false)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .pedigree("PROPAGATED")
                .referenceFrame(EphemerisSetCreateParams.ReferenceFrame.J2000)
                .satNo(2)
                .solidEarthTides(false)
                .stepSize(1L)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("TRANSACTION-ID")
                .usableEndTime(OffsetDateTime.parse("2018-01-01T20:50:00.123456Z"))
                .usableStartTime(OffsetDateTime.parse("2018-01-01T16:10:00.123456Z"))
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        val ephemerisSet =
            ephemerisSetService.retrieve(
                EphemerisSetRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        ephemerisSet.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        val page = ephemerisSetService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        ephemerisSetService.count(
            EphemerisSetCountParams.builder()
                .firstResult(0L)
                .maxResults(0L)
                .pointEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pointStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Test
    fun fileRetrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            ephemerisSetService.fileRetrieve(
                EphemerisSetFileRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        val response = ephemerisSetService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ephemerisSetService = client.ephemerisSets()

        val ephemerisSets =
            ephemerisSetService.tuple(
                EphemerisSetTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .pointEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pointStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        ephemerisSets.forEach { it.validate() }
    }
}
