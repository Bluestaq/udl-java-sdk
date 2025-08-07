// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSigintPayloadGetResponseTest {

    @Test
    fun create() {
        val seradataSigintPayloadGetResponse =
            SeradataSigintPayloadGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadGetResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seradataSigintPayloadGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataSigintPayloadGetResponse.dataMode())
            .isEqualTo(SeradataSigintPayloadGetResponse.DataMode.TEST)
        assertThat(seradataSigintPayloadGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataSigintPayloadGetResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataSigintPayloadGetResponse.id()).contains("SERADATASIGINTPAYLOAD-ID")
        assertThat(seradataSigintPayloadGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataSigintPayloadGetResponse.createdBy()).contains("some.user")
        assertThat(seradataSigintPayloadGetResponse.frequencyCoverage()).contains("1.1 to 3.3")
        assertThat(seradataSigintPayloadGetResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataSigintPayloadGetResponse.groundStations()).contains("groundStations")
        assertThat(seradataSigintPayloadGetResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataSigintPayloadGetResponse.idSensor())
            .contains("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
        assertThat(seradataSigintPayloadGetResponse.interceptParameters())
            .contains("interceptParameters")
        assertThat(seradataSigintPayloadGetResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataSigintPayloadGetResponse.name()).contains("Sensor Name")
        assertThat(seradataSigintPayloadGetResponse.notes()).contains("Sample Notes")
        assertThat(seradataSigintPayloadGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataSigintPayloadGetResponse.origNetwork()).contains("ORIG")
        assertThat(seradataSigintPayloadGetResponse.positionalAccuracy())
            .contains("positionalAccuracy")
        assertThat(seradataSigintPayloadGetResponse.swathWidth()).contains(1.23)
        assertThat(seradataSigintPayloadGetResponse.type()).contains("Comint")
        assertThat(seradataSigintPayloadGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataSigintPayloadGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataSigintPayloadGetResponse =
            SeradataSigintPayloadGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadGetResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeradataSigintPayloadGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataSigintPayloadGetResponse),
                jacksonTypeRef<SeradataSigintPayloadGetResponse>(),
            )

        assertThat(roundtrippedSeradataSigintPayloadGetResponse)
            .isEqualTo(seradataSigintPayloadGetResponse)
    }
}
