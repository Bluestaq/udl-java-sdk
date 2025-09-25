// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter.staging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingListResponseTest {

    @Test
    fun create() {
        val stagingListResponse =
            StagingListResponse.builder()
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

        assertThat(stagingListResponse.classificationMarking()).isEqualTo("U")
        assertThat(stagingListResponse.laserName()).isEqualTo("LASER_NAME")
        assertThat(stagingListResponse.source()).isEqualTo("Bluestaq")
        assertThat(stagingListResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(stagingListResponse.altitude()).contains(1.57543)
        assertThat(stagingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(stagingListResponse.createdBy()).contains("some.user")
        assertThat(stagingListResponse.laserType()).contains("PULSED")
        assertThat(stagingListResponse.lat()).contains(48.6732)
        assertThat(stagingListResponse.locationCountry()).contains("US")
        assertThat(stagingListResponse.lon()).contains(22.8455)
        assertThat(stagingListResponse.ownerCountry()).contains("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stagingListResponse =
            StagingListResponse.builder()
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

        val roundtrippedStagingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stagingListResponse),
                jacksonTypeRef<StagingListResponse>(),
            )

        assertThat(roundtrippedStagingListResponse).isEqualTo(stagingListResponse)
    }
}
