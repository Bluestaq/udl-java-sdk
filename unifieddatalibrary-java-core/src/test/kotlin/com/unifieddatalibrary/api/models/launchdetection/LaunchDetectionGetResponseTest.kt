// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchDetectionGetResponseTest {

    @Test
    fun create() {
        val launchDetectionGetResponse =
            LaunchDetectionGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionGetResponse.DataMode.TEST)
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
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(launchDetectionGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchDetectionGetResponse.dataMode())
            .isEqualTo(LaunchDetectionGetResponse.DataMode.TEST)
        assertThat(launchDetectionGetResponse.messageType()).isEqualTo("Example-Msg-Type")
        assertThat(launchDetectionGetResponse.observationLatitude()).isEqualTo(45.23)
        assertThat(launchDetectionGetResponse.observationLongitude()).isEqualTo(1.23)
        assertThat(launchDetectionGetResponse.observationTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionGetResponse.sequenceNumber()).isEqualTo(5)
        assertThat(launchDetectionGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchDetectionGetResponse.id()).contains("LAUNCHDETECTION-ID")
        assertThat(launchDetectionGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionGetResponse.createdBy()).contains("some.user")
        assertThat(launchDetectionGetResponse.descriptor()).contains("Example descriptor")
        assertThat(launchDetectionGetResponse.eventId()).contains("EVENT-ID")
        assertThat(launchDetectionGetResponse.highZenithAzimuth()).contains(false)
        assertThat(launchDetectionGetResponse.inclination()).contains(1.23)
        assertThat(launchDetectionGetResponse.launchAzimuth()).contains(1.23)
        assertThat(launchDetectionGetResponse.launchLatitude()).contains(1.23)
        assertThat(launchDetectionGetResponse.launchLongitude()).contains(1.23)
        assertThat(launchDetectionGetResponse.launchTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionGetResponse.observationAltitude()).contains(1.23)
        assertThat(launchDetectionGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchDetectionGetResponse.origNetwork()).contains("ORIG")
        assertThat(launchDetectionGetResponse.raan()).contains(1.23)
        assertThat(launchDetectionGetResponse.stereoFlag()).contains(false)
        assertThat(launchDetectionGetResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(launchDetectionGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchDetectionGetResponse =
            LaunchDetectionGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionGetResponse.DataMode.TEST)
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
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedLaunchDetectionGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchDetectionGetResponse),
                jacksonTypeRef<LaunchDetectionGetResponse>(),
            )

        assertThat(roundtrippedLaunchDetectionGetResponse).isEqualTo(launchDetectionGetResponse)
    }
}
