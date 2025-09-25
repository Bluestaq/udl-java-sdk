// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter.staging

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingCreateBulkParamsTest {

    @Test
    fun create() {
        StagingCreateBulkParams.builder()
            .addBody(
                StagingCreateBulkParams.Body.builder()
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            StagingCreateBulkParams.builder()
                .addBody(
                    StagingCreateBulkParams.Body.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                StagingCreateBulkParams.Body.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StagingCreateBulkParams.builder()
                .addBody(
                    StagingCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .laserName("LASER_NAME")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                StagingCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .laserName("LASER_NAME")
                    .source("Bluestaq")
                    .build()
            )
    }
}
