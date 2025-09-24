// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.linkstatus.LinkstatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LinkstatusServiceAsyncTest {

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkstatusServiceAsync = client.linkstatus()

        val future =
            linkstatusServiceAsync.update(
                LinkstatusUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(LinkstatusUpdateParams.DataMode.TEST)
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
                    .bodyId("LINKSTATUS-ID")
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

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val linkstatusServiceAsync = client.linkstatus()

        val future = linkstatusServiceAsync.delete("id")

        val response = future.get()
    }
}
