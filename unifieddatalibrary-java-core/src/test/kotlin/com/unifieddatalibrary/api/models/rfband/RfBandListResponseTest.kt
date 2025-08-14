// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandListResponseTest {

    @Test
    fun create() {
        val rfBandListResponse =
            RfBandListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfBandListResponse.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .id("RFBAND-ID")
                .band("Ku")
                .bandwidth(100.23)
                .beamwidth(45.23)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .mode(RfBandListResponse.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandListResponse.Polarization.H)
                .purpose(RfBandListResponse.Purpose.TTC)
                .build()

        assertThat(rfBandListResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfBandListResponse.dataMode()).isEqualTo(RfBandListResponse.DataMode.TEST)
        assertThat(rfBandListResponse.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(rfBandListResponse.name()).isEqualTo("BAND_NAME")
        assertThat(rfBandListResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfBandListResponse.id()).contains("RFBAND-ID")
        assertThat(rfBandListResponse.band()).contains("Ku")
        assertThat(rfBandListResponse.bandwidth()).contains(100.23)
        assertThat(rfBandListResponse.beamwidth()).contains(45.23)
        assertThat(rfBandListResponse.centerFreq()).contains(1000.23)
        assertThat(rfBandListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandListResponse.createdBy()).contains("some.user")
        assertThat(rfBandListResponse.edgeGain()).contains(100.23)
        assertThat(rfBandListResponse.eirp()).contains(2.23)
        assertThat(rfBandListResponse.erp()).contains(2.23)
        assertThat(rfBandListResponse.freqMax()).contains(2000.23)
        assertThat(rfBandListResponse.freqMin()).contains(50.23)
        assertThat(rfBandListResponse.mode()).contains(RfBandListResponse.Mode.TX)
        assertThat(rfBandListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfBandListResponse.origNetwork()).contains("OPS1")
        assertThat(rfBandListResponse.peakGain()).contains(120.23)
        assertThat(rfBandListResponse.polarization()).contains(RfBandListResponse.Polarization.H)
        assertThat(rfBandListResponse.purpose()).contains(RfBandListResponse.Purpose.TTC)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandListResponse =
            RfBandListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfBandListResponse.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .id("RFBAND-ID")
                .band("Ku")
                .bandwidth(100.23)
                .beamwidth(45.23)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .mode(RfBandListResponse.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandListResponse.Polarization.H)
                .purpose(RfBandListResponse.Purpose.TTC)
                .build()

        val roundtrippedRfBandListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandListResponse),
                jacksonTypeRef<RfBandListResponse>(),
            )

        assertThat(roundtrippedRfBandListResponse).isEqualTo(rfBandListResponse)
    }
}
