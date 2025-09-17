// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSigintPayloadTupleResponseTest {

    @Test
    fun create() {
        val seradataSigintPayloadTupleResponse =
            SeradataSigintPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATASIGINTPAYLOAD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyCoverage("1.1 to 3.3")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
                .interceptParameters("interceptParameters")
                .manufacturerOrgId("manufacturerOrgId")
                .name("Sensor Name")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seradataSigintPayloadTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataSigintPayloadTupleResponse.dataMode())
            .isEqualTo(SeradataSigintPayloadTupleResponse.DataMode.TEST)
        assertThat(seradataSigintPayloadTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataSigintPayloadTupleResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataSigintPayloadTupleResponse.id()).contains("SERADATASIGINTPAYLOAD-ID")
        assertThat(seradataSigintPayloadTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataSigintPayloadTupleResponse.createdBy()).contains("some.user")
        assertThat(seradataSigintPayloadTupleResponse.frequencyCoverage()).contains("1.1 to 3.3")
        assertThat(seradataSigintPayloadTupleResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataSigintPayloadTupleResponse.groundStations()).contains("groundStations")
        assertThat(seradataSigintPayloadTupleResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataSigintPayloadTupleResponse.idSensor())
            .contains("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
        assertThat(seradataSigintPayloadTupleResponse.interceptParameters())
            .contains("interceptParameters")
        assertThat(seradataSigintPayloadTupleResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataSigintPayloadTupleResponse.name()).contains("Sensor Name")
        assertThat(seradataSigintPayloadTupleResponse.notes()).contains("Sample Notes")
        assertThat(seradataSigintPayloadTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataSigintPayloadTupleResponse.origNetwork()).contains("OPS1")
        assertThat(seradataSigintPayloadTupleResponse.positionalAccuracy())
            .contains("positionalAccuracy")
        assertThat(seradataSigintPayloadTupleResponse.swathWidth()).contains(1.23)
        assertThat(seradataSigintPayloadTupleResponse.type()).contains("Comint")
        assertThat(seradataSigintPayloadTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataSigintPayloadTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataSigintPayloadTupleResponse =
            SeradataSigintPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATASIGINTPAYLOAD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyCoverage("1.1 to 3.3")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
                .interceptParameters("interceptParameters")
                .manufacturerOrgId("manufacturerOrgId")
                .name("Sensor Name")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeradataSigintPayloadTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataSigintPayloadTupleResponse),
                jacksonTypeRef<SeradataSigintPayloadTupleResponse>(),
            )

        assertThat(roundtrippedSeradataSigintPayloadTupleResponse)
            .isEqualTo(seradataSigintPayloadTupleResponse)
    }
}
