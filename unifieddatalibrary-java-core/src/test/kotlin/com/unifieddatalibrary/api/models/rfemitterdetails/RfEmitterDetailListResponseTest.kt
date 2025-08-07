// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfEmitterDetailListResponseTest {

    @Test
    fun create() {
        val rfEmitterDetailListResponse =
            RfEmitterDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterDetailListResponse.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .id("RFEMITTERDETAILS-ID")
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

        assertThat(rfEmitterDetailListResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfEmitterDetailListResponse.dataMode())
            .isEqualTo(RfEmitterDetailListResponse.DataMode.TEST)
        assertThat(rfEmitterDetailListResponse.idRfEmitter()).isEqualTo("RFEMITTER-ID")
        assertThat(rfEmitterDetailListResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfEmitterDetailListResponse.id()).contains("RFEMITTERDETAILS-ID")
        assertThat(rfEmitterDetailListResponse.alternateFacilityName())
            .contains("ALTERNATE_FACILITY_NAME")
        assertThat(rfEmitterDetailListResponse.altName()).contains("ALTERNATE_NAME")
        assertThat(rfEmitterDetailListResponse.antennaDiameter()).contains(20.23)
        assertThat(rfEmitterDetailListResponse.antennaSize().getOrNull()).containsExactly(1.1, 2.2)
        assertThat(rfEmitterDetailListResponse.barrageNoiseBandwidth()).contains(5.23)
        assertThat(rfEmitterDetailListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfEmitterDetailListResponse.createdBy()).contains("some.user")
        assertThat(rfEmitterDetailListResponse.description()).contains("DESCRIPTION")
        assertThat(rfEmitterDetailListResponse.designator()).contains("DESIGNATOR")
        assertThat(rfEmitterDetailListResponse.dopplerNoise()).contains(10.23)
        assertThat(rfEmitterDetailListResponse.drfmInstantaneousBandwidth()).contains(20.23)
        assertThat(rfEmitterDetailListResponse.family()).contains("FAMILY")
        assertThat(rfEmitterDetailListResponse.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(rfEmitterDetailListResponse.notes()).contains("NOTES")
        assertThat(rfEmitterDetailListResponse.numBits()).contains(256)
        assertThat(rfEmitterDetailListResponse.numChannels()).contains(10)
        assertThat(rfEmitterDetailListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfEmitterDetailListResponse.origNetwork()).contains("ORIG")
        assertThat(rfEmitterDetailListResponse.productionFacilityLocationId())
            .contains("PRODUCTIONFACILITYLOCATION-ID")
        assertThat(rfEmitterDetailListResponse.productionFacilityName())
            .contains("PRODUCTION_FACILITY")
        assertThat(rfEmitterDetailListResponse.receiverBandwidth()).contains(15.23)
        assertThat(rfEmitterDetailListResponse.receiverSensitivity()).contains(10.23)
        assertThat(rfEmitterDetailListResponse.receiverType()).contains("RECEIVER_TYPE")
        assertThat(rfEmitterDetailListResponse.secondaryNotes()).contains("MORE_NOTES")
        assertThat(rfEmitterDetailListResponse.systemSensitivityEnd()).contains(150.23)
        assertThat(rfEmitterDetailListResponse.systemSensitivityStart()).contains(50.23)
        assertThat(rfEmitterDetailListResponse.transmitPower()).contains(100.23)
        assertThat(rfEmitterDetailListResponse.transmitterBandwidth()).contains(0.125)
        assertThat(rfEmitterDetailListResponse.transmitterFrequency()).contains(105.9)
        assertThat(rfEmitterDetailListResponse.urls().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfEmitterDetailListResponse =
            RfEmitterDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterDetailListResponse.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .id("RFEMITTERDETAILS-ID")
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

        val roundtrippedRfEmitterDetailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfEmitterDetailListResponse),
                jacksonTypeRef<RfEmitterDetailListResponse>(),
            )

        assertThat(roundtrippedRfEmitterDetailListResponse).isEqualTo(rfEmitterDetailListResponse)
    }
}
