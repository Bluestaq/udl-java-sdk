// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter.staging

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingCreateParamsTest {

    @Test
    fun create() {
        StagingCreateParams.builder()
            .classificationMarking("U")
            .laserName("LASER_NAME")
            .source("Bluestaq")
            .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
            .altitude(1.57543)
            .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
            .createdBy("some.user")
            .laserType("PULSED")
            .lat(48.6732)
            .locationCountry("US")
            .lon(22.8455)
            .ownerCountry("US")
            .build()
    }

    @Test
    fun body() {
        val params =
            StagingCreateParams.builder()
                .classificationMarking("U")
                .laserName("LASER_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(1.57543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .laserType("PULSED")
                .lat(48.6732)
                .locationCountry("US")
                .lon(22.8455)
                .ownerCountry("US")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.laserName()).isEqualTo("LASER_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(body.altitude()).contains(1.57543)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.laserType()).contains("PULSED")
        assertThat(body.lat()).contains(48.6732)
        assertThat(body.locationCountry()).contains("US")
        assertThat(body.lon()).contains(22.8455)
        assertThat(body.ownerCountry()).contains("US")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StagingCreateParams.builder()
                .classificationMarking("U")
                .laserName("LASER_NAME")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.laserName()).isEqualTo("LASER_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
