// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicle

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchVehicleListResponseTest {

    @Test
    fun create() {
        val launchVehicleListResponse =
            LaunchVehicleListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchVehicleListResponse.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .id("LAUNCHVEHICLE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .type("Example-vehicle-type")
                .build()

        assertThat(launchVehicleListResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchVehicleListResponse.dataMode())
            .isEqualTo(LaunchVehicleListResponse.DataMode.TEST)
        assertThat(launchVehicleListResponse.name()).isEqualTo("Example-name")
        assertThat(launchVehicleListResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchVehicleListResponse.id()).contains("LAUNCHVEHICLE-ID")
        assertThat(launchVehicleListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchVehicleListResponse.createdBy()).contains("some.user")
        assertThat(launchVehicleListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchVehicleListResponse.origNetwork()).contains("OPS1")
        assertThat(launchVehicleListResponse.type()).contains("Example-vehicle-type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchVehicleListResponse =
            LaunchVehicleListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchVehicleListResponse.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .id("LAUNCHVEHICLE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .type("Example-vehicle-type")
                .build()

        val roundtrippedLaunchVehicleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchVehicleListResponse),
                jacksonTypeRef<LaunchVehicleListResponse>(),
            )

        assertThat(roundtrippedLaunchVehicleListResponse).isEqualTo(launchVehicleListResponse)
    }
}
