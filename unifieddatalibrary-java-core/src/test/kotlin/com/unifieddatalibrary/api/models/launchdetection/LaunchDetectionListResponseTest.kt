// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchDetectionListResponseTest {

    @Test
    fun create() {
        val launchDetectionListResponse =
            LaunchDetectionListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionListResponse.DataMode.TEST)
                .messageType("Example-Msg-Type")
                .observationLatitude(45.23)
                .observationLongitude(1.23)
                .observationTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .sequenceNumber(5)
                .source("Bluestaq")
                .id("LAUNCHDETECTION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .descriptor("Example descriptor")
                .eventId("EVENT-ID")
                .highZenithAzimuth(false)
                .inclination(1.23)
                .launchAzimuth(1.23)
                .launchLatitude(1.23)
                .launchLongitude(1.23)
                .launchTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .observationAltitude(1.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .raan(1.23)
                .stereoFlag(false)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(launchDetectionListResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchDetectionListResponse.dataMode())
            .isEqualTo(LaunchDetectionListResponse.DataMode.TEST)
        assertThat(launchDetectionListResponse.messageType()).isEqualTo("Example-Msg-Type")
        assertThat(launchDetectionListResponse.observationLatitude()).isEqualTo(45.23)
        assertThat(launchDetectionListResponse.observationLongitude()).isEqualTo(1.23)
        assertThat(launchDetectionListResponse.observationTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionListResponse.sequenceNumber()).isEqualTo(5)
        assertThat(launchDetectionListResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchDetectionListResponse.id()).contains("LAUNCHDETECTION-ID")
        assertThat(launchDetectionListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionListResponse.createdBy()).contains("some.user")
        assertThat(launchDetectionListResponse.descriptor()).contains("Example descriptor")
        assertThat(launchDetectionListResponse.eventId()).contains("EVENT-ID")
        assertThat(launchDetectionListResponse.highZenithAzimuth()).contains(false)
        assertThat(launchDetectionListResponse.inclination()).contains(1.23)
        assertThat(launchDetectionListResponse.launchAzimuth()).contains(1.23)
        assertThat(launchDetectionListResponse.launchLatitude()).contains(1.23)
        assertThat(launchDetectionListResponse.launchLongitude()).contains(1.23)
        assertThat(launchDetectionListResponse.launchTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionListResponse.observationAltitude()).contains(1.23)
        assertThat(launchDetectionListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchDetectionListResponse.origNetwork()).contains("ORIG")
        assertThat(launchDetectionListResponse.raan()).contains(1.23)
        assertThat(launchDetectionListResponse.stereoFlag()).contains(false)
        assertThat(launchDetectionListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionListResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchDetectionListResponse =
            LaunchDetectionListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionListResponse.DataMode.TEST)
                .messageType("Example-Msg-Type")
                .observationLatitude(45.23)
                .observationLongitude(1.23)
                .observationTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .sequenceNumber(5)
                .source("Bluestaq")
                .id("LAUNCHDETECTION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .descriptor("Example descriptor")
                .eventId("EVENT-ID")
                .highZenithAzimuth(false)
                .inclination(1.23)
                .launchAzimuth(1.23)
                .launchLatitude(1.23)
                .launchLongitude(1.23)
                .launchTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .observationAltitude(1.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .raan(1.23)
                .stereoFlag(false)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedLaunchDetectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchDetectionListResponse),
                jacksonTypeRef<LaunchDetectionListResponse>(),
            )

        assertThat(roundtrippedLaunchDetectionListResponse).isEqualTo(launchDetectionListResponse)
    }
}
