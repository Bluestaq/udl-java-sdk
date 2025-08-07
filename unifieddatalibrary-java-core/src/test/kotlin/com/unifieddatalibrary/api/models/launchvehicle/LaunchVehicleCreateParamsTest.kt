// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicle

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchVehicleCreateParamsTest {

    @Test
    fun create() {
        LaunchVehicleCreateParams.builder()
            .classificationMarking("U")
            .dataMode(LaunchVehicleCreateParams.DataMode.TEST)
            .name("Example-name")
            .source("Bluestaq")
            .id("LAUNCHVEHICLE-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .type("Example-vehicle-type")
            .build()
    }

    @Test
    fun body() {
        val params =
            LaunchVehicleCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchVehicleCreateParams.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .id("LAUNCHVEHICLE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .type("Example-vehicle-type")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchVehicleCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Example-name")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("LAUNCHVEHICLE-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.type()).contains("Example-vehicle-type")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LaunchVehicleCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchVehicleCreateParams.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchVehicleCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Example-name")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
