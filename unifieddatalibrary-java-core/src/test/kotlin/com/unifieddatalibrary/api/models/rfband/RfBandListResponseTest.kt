// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
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
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .band("Ku")
                .bandwidth(100.23)
                .addBandwidthSetting(250.1)
                .addBandwidthSetting(500.1)
                .beamwidth(45.23)
                .addBeamwidthSetting(5.1)
                .addBeamwidthSetting(10.1)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .addDelaySetting(2.77)
                .addDelaySetting(5.64)
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .addFrequencySetting(12250.1)
                .addFrequencySetting(15000.1)
                .addGainSetting(2.77)
                .addGainSetting(5.64)
                .mode(RfBandListResponse.Mode.TX)
                .addNoiseSetting(0.00033)
                .addNoiseSetting(0.0033)
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
        assertThat(rfBandListResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(rfBandListResponse.band()).contains("Ku")
        assertThat(rfBandListResponse.bandwidth()).contains(100.23)
        assertThat(rfBandListResponse.bandwidthSettings().getOrNull()).containsExactly(250.1, 500.1)
        assertThat(rfBandListResponse.beamwidth()).contains(45.23)
        assertThat(rfBandListResponse.beamwidthSettings().getOrNull()).containsExactly(5.1, 10.1)
        assertThat(rfBandListResponse.centerFreq()).contains(1000.23)
        assertThat(rfBandListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(rfBandListResponse.createdBy()).contains("some.user")
        assertThat(rfBandListResponse.delaySettings().getOrNull()).containsExactly(2.77, 5.64)
        assertThat(rfBandListResponse.edgeGain()).contains(100.23)
        assertThat(rfBandListResponse.eirp()).contains(2.23)
        assertThat(rfBandListResponse.erp()).contains(2.23)
        assertThat(rfBandListResponse.freqMax()).contains(2000.23)
        assertThat(rfBandListResponse.freqMin()).contains(50.23)
        assertThat(rfBandListResponse.frequencySettings().getOrNull())
            .containsExactly(12250.1, 15000.1)
        assertThat(rfBandListResponse.gainSettings().getOrNull()).containsExactly(2.77, 5.64)
        assertThat(rfBandListResponse.mode()).contains(RfBandListResponse.Mode.TX)
        assertThat(rfBandListResponse.noiseSettings().getOrNull()).containsExactly(0.00033, 0.0033)
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
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .band("Ku")
                .bandwidth(100.23)
                .addBandwidthSetting(250.1)
                .addBandwidthSetting(500.1)
                .beamwidth(45.23)
                .addBeamwidthSetting(5.1)
                .addBeamwidthSetting(10.1)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .addDelaySetting(2.77)
                .addDelaySetting(5.64)
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .addFrequencySetting(12250.1)
                .addFrequencySetting(15000.1)
                .addGainSetting(2.77)
                .addGainSetting(5.64)
                .mode(RfBandListResponse.Mode.TX)
                .addNoiseSetting(0.00033)
                .addNoiseSetting(0.0033)
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
