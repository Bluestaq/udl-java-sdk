// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkStatusGetResponseTest {

    @Test
    fun create() {
        val linkStatusGetResponse =
            LinkStatusGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusGetResponse.DataMode.TEST)
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
                .sysCap("Example status")
                .build()

        assertThat(linkStatusGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(linkStatusGetResponse.dataMode()).isEqualTo(LinkStatusGetResponse.DataMode.TEST)
        assertThat(linkStatusGetResponse.endPoint1Lat()).isEqualTo(45.23)
        assertThat(linkStatusGetResponse.endPoint1Lon()).isEqualTo(80.23)
        assertThat(linkStatusGetResponse.endPoint1Name()).isEqualTo("Example endpoint")
        assertThat(linkStatusGetResponse.endPoint2Lat()).isEqualTo(45.23)
        assertThat(linkStatusGetResponse.endPoint2Lon()).isEqualTo(80.23)
        assertThat(linkStatusGetResponse.endPoint2Name()).isEqualTo("Example description")
        assertThat(linkStatusGetResponse.linkName()).isEqualTo("Example description")
        assertThat(linkStatusGetResponse.linkStartTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusGetResponse.linkStopTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(linkStatusGetResponse.id()).contains("LINKSTATUS-ID")
        assertThat(linkStatusGetResponse.band()).contains("MIL-KA")
        assertThat(linkStatusGetResponse.constellation()).contains("Fornax")
        assertThat(linkStatusGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(linkStatusGetResponse.createdBy()).contains("some.user")
        assertThat(linkStatusGetResponse.dataRate1To2()).contains(10.23)
        assertThat(linkStatusGetResponse.dataRate2To1()).contains(10.23)
        assertThat(linkStatusGetResponse.idBeam1()).contains("REF-BEAM1-ID")
        assertThat(linkStatusGetResponse.idBeam2()).contains("REF-BEAM2-ID")
        assertThat(linkStatusGetResponse.idOnOrbit1()).contains("REF-ONORBIT1-ID")
        assertThat(linkStatusGetResponse.idOnOrbit2()).contains("REF-ONORBIT2-ID")
        assertThat(linkStatusGetResponse.linkState()).contains("DEGRADED-WEATHER")
        assertThat(linkStatusGetResponse.linkType()).contains("Example link")
        assertThat(linkStatusGetResponse.opsCap()).contains("Example status")
        assertThat(linkStatusGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(linkStatusGetResponse.origNetwork()).contains("OPS1")
        assertThat(linkStatusGetResponse.satNo1()).contains(1)
        assertThat(linkStatusGetResponse.satNo2()).contains(2)
        assertThat(linkStatusGetResponse.sysCap()).contains("Example status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkStatusGetResponse =
            LinkStatusGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusGetResponse.DataMode.TEST)
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
                .sysCap("Example status")
                .build()

        val roundtrippedLinkStatusGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkStatusGetResponse),
                jacksonTypeRef<LinkStatusGetResponse>(),
            )

        assertThat(roundtrippedLinkStatusGetResponse).isEqualTo(linkStatusGetResponse)
    }
}
