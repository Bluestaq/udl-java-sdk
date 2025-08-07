// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandFullTest {

    @Test
    fun create() {
        val rfBandFull =
            RfBandFull.builder()
                .classificationMarking("U")
                .dataMode(RfBandFull.DataMode.TEST)
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
                .mode(RfBandFull.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandFull.Polarization.H)
                .purpose(RfBandFull.Purpose.TTC)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(rfBandFull.classificationMarking()).isEqualTo("U")
        assertThat(rfBandFull.dataMode()).isEqualTo(RfBandFull.DataMode.TEST)
        assertThat(rfBandFull.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(rfBandFull.name()).isEqualTo("BAND_NAME")
        assertThat(rfBandFull.source()).isEqualTo("Bluestaq")
        assertThat(rfBandFull.id()).contains("RFBAND-ID")
        assertThat(rfBandFull.band()).contains("Ku")
        assertThat(rfBandFull.bandwidth()).contains(100.23)
        assertThat(rfBandFull.beamwidth()).contains(45.23)
        assertThat(rfBandFull.centerFreq()).contains(1000.23)
        assertThat(rfBandFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandFull.createdBy()).contains("some.user")
        assertThat(rfBandFull.edgeGain()).contains(100.23)
        assertThat(rfBandFull.eirp()).contains(2.23)
        assertThat(rfBandFull.erp()).contains(2.23)
        assertThat(rfBandFull.freqMax()).contains(2000.23)
        assertThat(rfBandFull.freqMin()).contains(50.23)
        assertThat(rfBandFull.mode()).contains(RfBandFull.Mode.TX)
        assertThat(rfBandFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfBandFull.origNetwork()).contains("OPS1")
        assertThat(rfBandFull.peakGain()).contains(120.23)
        assertThat(rfBandFull.polarization()).contains(RfBandFull.Polarization.H)
        assertThat(rfBandFull.purpose()).contains(RfBandFull.Purpose.TTC)
        assertThat(rfBandFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandFull =
            RfBandFull.builder()
                .classificationMarking("U")
                .dataMode(RfBandFull.DataMode.TEST)
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
                .mode(RfBandFull.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandFull.Polarization.H)
                .purpose(RfBandFull.Purpose.TTC)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedRfBandFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandFull),
                jacksonTypeRef<RfBandFull>(),
            )

        assertThat(roundtrippedRfBandFull).isEqualTo(rfBandFull)
    }
}
