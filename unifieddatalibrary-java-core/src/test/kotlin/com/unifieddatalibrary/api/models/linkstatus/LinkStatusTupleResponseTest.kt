// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkStatusTupleResponseTest {

    @Test
    fun create() {
        val linkStatusTupleResponse =
            LinkStatusTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusTupleResponse.DataMode.TEST)
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

        assertThat(linkStatusTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(linkStatusTupleResponse.dataMode())
            .isEqualTo(LinkStatusTupleResponse.DataMode.TEST)
        assertThat(linkStatusTupleResponse.endPoint1Lat()).isEqualTo(45.23)
        assertThat(linkStatusTupleResponse.endPoint1Lon()).isEqualTo(80.23)
        assertThat(linkStatusTupleResponse.endPoint1Name()).isEqualTo("Example endpoint")
        assertThat(linkStatusTupleResponse.endPoint2Lat()).isEqualTo(45.23)
        assertThat(linkStatusTupleResponse.endPoint2Lon()).isEqualTo(80.23)
        assertThat(linkStatusTupleResponse.endPoint2Name()).isEqualTo("Example description")
        assertThat(linkStatusTupleResponse.linkName()).isEqualTo("Example description")
        assertThat(linkStatusTupleResponse.linkStartTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusTupleResponse.linkStopTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(linkStatusTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(linkStatusTupleResponse.id()).contains("LINKSTATUS-ID")
        assertThat(linkStatusTupleResponse.band()).contains("MIL-KA")
        assertThat(linkStatusTupleResponse.constellation()).contains("Fornax")
        assertThat(linkStatusTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(linkStatusTupleResponse.createdBy()).contains("some.user")
        assertThat(linkStatusTupleResponse.dataRate1To2()).contains(10.23)
        assertThat(linkStatusTupleResponse.dataRate2To1()).contains(10.23)
        assertThat(linkStatusTupleResponse.idBeam1()).contains("REF-BEAM1-ID")
        assertThat(linkStatusTupleResponse.idBeam2()).contains("REF-BEAM2-ID")
        assertThat(linkStatusTupleResponse.idOnOrbit1()).contains("REF-ONORBIT1-ID")
        assertThat(linkStatusTupleResponse.idOnOrbit2()).contains("REF-ONORBIT2-ID")
        assertThat(linkStatusTupleResponse.linkState()).contains("DEGRADED-WEATHER")
        assertThat(linkStatusTupleResponse.linkType()).contains("Example link")
        assertThat(linkStatusTupleResponse.opsCap()).contains("Example status")
        assertThat(linkStatusTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(linkStatusTupleResponse.origNetwork()).contains("OPS1")
        assertThat(linkStatusTupleResponse.satNo1()).contains(1)
        assertThat(linkStatusTupleResponse.satNo2()).contains(2)
        assertThat(linkStatusTupleResponse.snr()).contains(10.1)
        assertThat(linkStatusTupleResponse.sysCap()).contains("Example status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkStatusTupleResponse =
            LinkStatusTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(LinkStatusTupleResponse.DataMode.TEST)
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

        val roundtrippedLinkStatusTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkStatusTupleResponse),
                jacksonTypeRef<LinkStatusTupleResponse>(),
            )

        assertThat(roundtrippedLinkStatusTupleResponse).isEqualTo(linkStatusTupleResponse)
    }
}
