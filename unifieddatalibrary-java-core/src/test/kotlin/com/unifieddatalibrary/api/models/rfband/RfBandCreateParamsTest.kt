// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandCreateParamsTest {

    @Test
    fun create() {
        RfBandCreateParams.builder()
            .classificationMarking("U")
            .dataMode(RfBandCreateParams.DataMode.TEST)
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
            .mode(RfBandCreateParams.Mode.TX)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .peakGain(120.23)
            .polarization(RfBandCreateParams.Polarization.H)
            .purpose(RfBandCreateParams.Purpose.TTC)
            .build()
    }

    @Test
    fun body() {
        val params =
            RfBandCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RfBandCreateParams.DataMode.TEST)
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
                .mode(RfBandCreateParams.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandCreateParams.Polarization.H)
                .purpose(RfBandCreateParams.Purpose.TTC)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandCreateParams.DataMode.TEST)
        assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(body.name()).isEqualTo("BAND_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("RFBAND-ID")
        assertThat(body.band()).contains("Ku")
        assertThat(body.bandwidth()).contains(100.23)
        assertThat(body.beamwidth()).contains(45.23)
        assertThat(body.centerFreq()).contains(1000.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.edgeGain()).contains(100.23)
        assertThat(body.eirp()).contains(2.23)
        assertThat(body.erp()).contains(2.23)
        assertThat(body.freqMax()).contains(2000.23)
        assertThat(body.freqMin()).contains(50.23)
        assertThat(body.mode()).contains(RfBandCreateParams.Mode.TX)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.peakGain()).contains(120.23)
        assertThat(body.polarization()).contains(RfBandCreateParams.Polarization.H)
        assertThat(body.purpose()).contains(RfBandCreateParams.Purpose.TTC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RfBandCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RfBandCreateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandCreateParams.DataMode.TEST)
        assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(body.name()).isEqualTo("BAND_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
