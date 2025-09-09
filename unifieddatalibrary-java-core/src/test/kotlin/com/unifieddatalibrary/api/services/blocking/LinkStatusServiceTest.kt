// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCountParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusCreateParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusGetParams
import com.unifieddatalibrary.api.models.linkstatus.LinkStatusTupleParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LinkStatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkStatusService = client.linkStatus()

        linkStatusService.create(
            LinkStatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusCreateParams.DataMode.TEST)
                .endPoint1Lat(45.23)
                .endPoint1Lon(80.23)
                .endPoint1Name("Example endpoint")
                .endPoint2Lat(45.23)
                .endPoint2Lon(80.23)
                .endPoint2Name("Example description")
                .linkName("Example description")
                .linkStartTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .linkStopTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .id("LINKSTATUS-ID")
                .band("MIL-KA")
                .constellation("Fornax")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataRate1To2(10.23)
                .dataRate2To1(10.23)
                .idBeam1("REF-BEAM1-ID")
                .idBeam2("REF-BEAM2-ID")
                .idOnOrbit1("REF-ONORBIT1-ID")
                .idOnOrbit2("REF-ONORBIT2-ID")
                .linkState("DEGRADED-WEATHER")
                .linkType("Example link")
                .opsCap("Example status")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .satNo1(1)
                .satNo2(2)
                .snr(10.1)
                .sysCap("Example status")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkStatusService = client.linkStatus()

        val page = linkStatusService.list()

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
        val linkStatusService = client.linkStatus()

        linkStatusService.count(
            LinkStatusCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkStatusService = client.linkStatus()

        val linkStatus =
            linkStatusService.get(
                LinkStatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        linkStatus.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkStatusService = client.linkStatus()

        val response = linkStatusService.queryhelp()

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
        val linkStatusService = client.linkStatus()

        val response =
            linkStatusService.tuple(
                LinkStatusTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
