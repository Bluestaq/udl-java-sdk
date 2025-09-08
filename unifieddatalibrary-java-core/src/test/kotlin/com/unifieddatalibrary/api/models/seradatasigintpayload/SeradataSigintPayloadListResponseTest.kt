// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSigintPayloadListResponseTest {

    @Test
    fun create() {
        val seradataSigintPayloadListResponse =
            SeradataSigintPayloadListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadListResponse.DataMode.TEST)
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
                .build()

        assertThat(seradataSigintPayloadListResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataSigintPayloadListResponse.dataMode())
            .isEqualTo(SeradataSigintPayloadListResponse.DataMode.TEST)
        assertThat(seradataSigintPayloadListResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataSigintPayloadListResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataSigintPayloadListResponse.id()).contains("SERADATASIGINTPAYLOAD-ID")
        assertThat(seradataSigintPayloadListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataSigintPayloadListResponse.createdBy()).contains("some.user")
        assertThat(seradataSigintPayloadListResponse.frequencyCoverage()).contains("1.1 to 3.3")
        assertThat(seradataSigintPayloadListResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataSigintPayloadListResponse.groundStations()).contains("groundStations")
        assertThat(seradataSigintPayloadListResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataSigintPayloadListResponse.idSensor())
            .contains("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
        assertThat(seradataSigintPayloadListResponse.interceptParameters())
            .contains("interceptParameters")
        assertThat(seradataSigintPayloadListResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataSigintPayloadListResponse.name()).contains("Sensor Name")
        assertThat(seradataSigintPayloadListResponse.notes()).contains("Sample Notes")
        assertThat(seradataSigintPayloadListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataSigintPayloadListResponse.origNetwork()).contains("OPS1")
        assertThat(seradataSigintPayloadListResponse.positionalAccuracy())
            .contains("positionalAccuracy")
        assertThat(seradataSigintPayloadListResponse.swathWidth()).contains(1.23)
        assertThat(seradataSigintPayloadListResponse.type()).contains("Comint")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataSigintPayloadListResponse =
            SeradataSigintPayloadListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadListResponse.DataMode.TEST)
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
                .build()

        val roundtrippedSeradataSigintPayloadListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataSigintPayloadListResponse),
                jacksonTypeRef<SeradataSigintPayloadListResponse>(),
            )

        assertThat(roundtrippedSeradataSigintPayloadListResponse)
            .isEqualTo(seradataSigintPayloadListResponse)
    }
}
