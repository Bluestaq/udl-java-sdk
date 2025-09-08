// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSigintPayloadCreateParamsTest {

    @Test
    fun create() {
        SeradataSigintPayloadCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SeradataSigintPayloadCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            SeradataSigintPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeradataSigintPayloadCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(body.id()).contains("SERADATASIGINTPAYLOAD-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.frequencyCoverage()).contains("1.1 to 3.3")
        assertThat(body.groundStationLocations()).contains("groundStationLocations")
        assertThat(body.groundStations()).contains("groundStations")
        assertThat(body.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
        assertThat(body.idSensor()).contains("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
        assertThat(body.interceptParameters()).contains("interceptParameters")
        assertThat(body.manufacturerOrgId()).contains("manufacturerOrgId")
        assertThat(body.name()).contains("Sensor Name")
        assertThat(body.notes()).contains("Sample Notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.positionalAccuracy()).contains("positionalAccuracy")
        assertThat(body.swathWidth()).contains(1.23)
        assertThat(body.type()).contains("Comint")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SeradataSigintPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeradataSigintPayloadCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
    }
}
