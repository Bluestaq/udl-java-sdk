// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
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

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.endPoint1Lat()).isEqualTo(45.23)
        assertThat(historyListResponse.endPoint1Lon()).isEqualTo(80.23)
        assertThat(historyListResponse.endPoint1Name()).isEqualTo("Example endpoint")
        assertThat(historyListResponse.endPoint2Lat()).isEqualTo(45.23)
        assertThat(historyListResponse.endPoint2Lon()).isEqualTo(80.23)
        assertThat(historyListResponse.endPoint2Name()).isEqualTo("Example description")
        assertThat(historyListResponse.linkName()).isEqualTo("Example description")
        assertThat(historyListResponse.linkStartTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(historyListResponse.linkStopTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.id()).contains("LINKSTATUS-ID")
        assertThat(historyListResponse.band()).contains("MIL-KA")
        assertThat(historyListResponse.constellation()).contains("Fornax")
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.dataRate1To2()).contains(10.23)
        assertThat(historyListResponse.dataRate2To1()).contains(10.23)
        assertThat(historyListResponse.idBeam1()).contains("REF-BEAM1-ID")
        assertThat(historyListResponse.idBeam2()).contains("REF-BEAM2-ID")
        assertThat(historyListResponse.idOnOrbit1()).contains("REF-ONORBIT1-ID")
        assertThat(historyListResponse.idOnOrbit2()).contains("REF-ONORBIT2-ID")
        assertThat(historyListResponse.linkState()).contains("DEGRADED-WEATHER")
        assertThat(historyListResponse.linkType()).contains("Example link")
        assertThat(historyListResponse.opsCap()).contains("Example status")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.satNo1()).contains(1)
        assertThat(historyListResponse.satNo2()).contains(2)
        assertThat(historyListResponse.snr()).contains(10.1)
        assertThat(historyListResponse.sysCap()).contains("Example status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
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

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
