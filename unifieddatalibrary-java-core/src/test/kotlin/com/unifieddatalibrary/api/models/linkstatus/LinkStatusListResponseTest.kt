// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkStatusListResponseTest {

    @Test
    fun create() {
        val linkStatusListResponse =
            LinkStatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusListResponse.DataMode.TEST)
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

        assertThat(linkStatusListResponse.classificationMarking()).isEqualTo("U")
        assertThat(linkStatusListResponse.dataMode())
            .isEqualTo(LinkStatusListResponse.DataMode.TEST)
        assertThat(linkStatusListResponse.endPoint1Lat()).isEqualTo(45.23)
        assertThat(linkStatusListResponse.endPoint1Lon()).isEqualTo(80.23)
        assertThat(linkStatusListResponse.endPoint1Name()).isEqualTo("Example endpoint")
        assertThat(linkStatusListResponse.endPoint2Lat()).isEqualTo(45.23)
        assertThat(linkStatusListResponse.endPoint2Lon()).isEqualTo(80.23)
        assertThat(linkStatusListResponse.endPoint2Name()).isEqualTo("Example description")
        assertThat(linkStatusListResponse.linkName()).isEqualTo("Example description")
        assertThat(linkStatusListResponse.linkStartTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusListResponse.linkStopTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusListResponse.source()).isEqualTo("Bluestaq")
        assertThat(linkStatusListResponse.id()).contains("LINKSTATUS-ID")
        assertThat(linkStatusListResponse.band()).contains("MIL-KA")
        assertThat(linkStatusListResponse.constellation()).contains("Fornax")
        assertThat(linkStatusListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(linkStatusListResponse.createdBy()).contains("some.user")
        assertThat(linkStatusListResponse.dataRate1To2()).contains(10.23)
        assertThat(linkStatusListResponse.dataRate2To1()).contains(10.23)
        assertThat(linkStatusListResponse.idBeam1()).contains("REF-BEAM1-ID")
        assertThat(linkStatusListResponse.idBeam2()).contains("REF-BEAM2-ID")
        assertThat(linkStatusListResponse.idOnOrbit1()).contains("REF-ONORBIT1-ID")
        assertThat(linkStatusListResponse.idOnOrbit2()).contains("REF-ONORBIT2-ID")
        assertThat(linkStatusListResponse.linkState()).contains("DEGRADED-WEATHER")
        assertThat(linkStatusListResponse.linkType()).contains("Example link")
        assertThat(linkStatusListResponse.opsCap()).contains("Example status")
        assertThat(linkStatusListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(linkStatusListResponse.origNetwork()).contains("OPS1")
        assertThat(linkStatusListResponse.satNo1()).contains(1)
        assertThat(linkStatusListResponse.satNo2()).contains(2)
        assertThat(linkStatusListResponse.sysCap()).contains("Example status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkStatusListResponse =
            LinkStatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusListResponse.DataMode.TEST)
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

        val roundtrippedLinkStatusListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkStatusListResponse),
                jacksonTypeRef<LinkStatusListResponse>(),
            )

        assertThat(roundtrippedLinkStatusListResponse).isEqualTo(linkStatusListResponse)
    }
}
