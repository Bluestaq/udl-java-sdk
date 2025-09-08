// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandUpdateParamsTest {

    @Test
    fun create() {
        RfBandUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(RfBandUpdateParams.DataMode.TEST)
            .idEntity("ENTITY-ID")
            .name("BAND_NAME")
            .source("Bluestaq")
            .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
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
            .mode(RfBandUpdateParams.Mode.TX)
            .addNoiseSetting(0.00033)
            .addNoiseSetting(0.0033)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .peakGain(120.23)
            .polarization(RfBandUpdateParams.Polarization.H)
            .purpose(RfBandUpdateParams.Purpose.TTC)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RfBandUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfBandUpdateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RfBandUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfBandUpdateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
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
                .mode(RfBandUpdateParams.Mode.TX)
                .addNoiseSetting(0.00033)
                .addNoiseSetting(0.0033)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandUpdateParams.Polarization.H)
                .purpose(RfBandUpdateParams.Purpose.TTC)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandUpdateParams.DataMode.TEST)
        assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(body.name()).isEqualTo("BAND_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(body.band()).contains("Ku")
        assertThat(body.bandwidth()).contains(100.23)
        assertThat(body.bandwidthSettings().getOrNull()).containsExactly(250.1, 500.1)
        assertThat(body.beamwidth()).contains(45.23)
        assertThat(body.beamwidthSettings().getOrNull()).containsExactly(5.1, 10.1)
        assertThat(body.centerFreq()).contains(1000.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.delaySettings().getOrNull()).containsExactly(2.77, 5.64)
        assertThat(body.edgeGain()).contains(100.23)
        assertThat(body.eirp()).contains(2.23)
        assertThat(body.erp()).contains(2.23)
        assertThat(body.freqMax()).contains(2000.23)
        assertThat(body.freqMin()).contains(50.23)
        assertThat(body.frequencySettings().getOrNull()).containsExactly(12250.1, 15000.1)
        assertThat(body.gainSettings().getOrNull()).containsExactly(2.77, 5.64)
        assertThat(body.mode()).contains(RfBandUpdateParams.Mode.TX)
        assertThat(body.noiseSettings().getOrNull()).containsExactly(0.00033, 0.0033)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.peakGain()).contains(120.23)
        assertThat(body.polarization()).contains(RfBandUpdateParams.Polarization.H)
        assertThat(body.purpose()).contains(RfBandUpdateParams.Purpose.TTC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RfBandUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfBandUpdateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandUpdateParams.DataMode.TEST)
        assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(body.name()).isEqualTo("BAND_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
