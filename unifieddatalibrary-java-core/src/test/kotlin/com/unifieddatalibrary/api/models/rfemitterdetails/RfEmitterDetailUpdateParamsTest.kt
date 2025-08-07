// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfEmitterDetailUpdateParamsTest {

    @Test
    fun create() {
        RfEmitterDetailUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
            .idRfEmitter("RFEMITTER-ID")
            .source("Bluestaq")
            .bodyId("RFEMITTERDETAILS-ID")
            .alternateFacilityName("ALTERNATE_FACILITY_NAME")
            .altName("ALTERNATE_NAME")
            .antennaDiameter(20.23)
            .addAntennaSize(1.1)
            .addAntennaSize(2.2)
            .barrageNoiseBandwidth(5.23)
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .description("DESCRIPTION")
            .designator("DESIGNATOR")
            .dopplerNoise(10.23)
            .drfmInstantaneousBandwidth(20.23)
            .family("FAMILY")
            .manufacturerOrgId("MANUFACTURERORG-ID")
            .notes("NOTES")
            .numBits(256)
            .numChannels(10)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
            .productionFacilityName("PRODUCTION_FACILITY")
            .receiverBandwidth(15.23)
            .receiverSensitivity(10.23)
            .receiverType("RECEIVER_TYPE")
            .secondaryNotes("MORE_NOTES")
            .systemSensitivityEnd(150.23)
            .systemSensitivityStart(50.23)
            .transmitPower(100.23)
            .transmitterBandwidth(0.125)
            .transmitterFrequency(105.9)
            .addUrl("TAG1")
            .addUrl("TAG2")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RfEmitterDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RfEmitterDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .bodyId("RFEMITTERDETAILS-ID")
                .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                .altName("ALTERNATE_NAME")
                .antennaDiameter(20.23)
                .addAntennaSize(1.1)
                .addAntennaSize(2.2)
                .barrageNoiseBandwidth(5.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION")
                .designator("DESIGNATOR")
                .dopplerNoise(10.23)
                .drfmInstantaneousBandwidth(20.23)
                .family("FAMILY")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .notes("NOTES")
                .numBits(256)
                .numChannels(10)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
                .productionFacilityName("PRODUCTION_FACILITY")
                .receiverBandwidth(15.23)
                .receiverSensitivity(10.23)
                .receiverType("RECEIVER_TYPE")
                .secondaryNotes("MORE_NOTES")
                .systemSensitivityEnd(150.23)
                .systemSensitivityStart(50.23)
                .transmitPower(100.23)
                .transmitterBandwidth(0.125)
                .transmitterFrequency(105.9)
                .addUrl("TAG1")
                .addUrl("TAG2")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfEmitterDetailUpdateParams.DataMode.TEST)
        assertThat(body.idRfEmitter()).isEqualTo("RFEMITTER-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("RFEMITTERDETAILS-ID")
        assertThat(body.alternateFacilityName()).contains("ALTERNATE_FACILITY_NAME")
        assertThat(body.altName()).contains("ALTERNATE_NAME")
        assertThat(body.antennaDiameter()).contains(20.23)
        assertThat(body.antennaSize().getOrNull()).containsExactly(1.1, 2.2)
        assertThat(body.barrageNoiseBandwidth()).contains(5.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("DESCRIPTION")
        assertThat(body.designator()).contains("DESIGNATOR")
        assertThat(body.dopplerNoise()).contains(10.23)
        assertThat(body.drfmInstantaneousBandwidth()).contains(20.23)
        assertThat(body.family()).contains("FAMILY")
        assertThat(body.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(body.notes()).contains("NOTES")
        assertThat(body.numBits()).contains(256)
        assertThat(body.numChannels()).contains(10)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.productionFacilityLocationId()).contains("PRODUCTIONFACILITYLOCATION-ID")
        assertThat(body.productionFacilityName()).contains("PRODUCTION_FACILITY")
        assertThat(body.receiverBandwidth()).contains(15.23)
        assertThat(body.receiverSensitivity()).contains(10.23)
        assertThat(body.receiverType()).contains("RECEIVER_TYPE")
        assertThat(body.secondaryNotes()).contains("MORE_NOTES")
        assertThat(body.systemSensitivityEnd()).contains(150.23)
        assertThat(body.systemSensitivityStart()).contains(50.23)
        assertThat(body.transmitPower()).contains(100.23)
        assertThat(body.transmitterBandwidth()).contains(0.125)
        assertThat(body.transmitterFrequency()).contains(105.9)
        assertThat(body.urls().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RfEmitterDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfEmitterDetailUpdateParams.DataMode.TEST)
        assertThat(body.idRfEmitter()).isEqualTo("RFEMITTER-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
