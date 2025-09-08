// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchDetectionTupleResponseTest {

    @Test
    fun create() {
        val launchDetectionTupleResponse =
            LaunchDetectionTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionTupleResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .raan(1.23)
                .stereoFlag(false)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(launchDetectionTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchDetectionTupleResponse.dataMode())
            .isEqualTo(LaunchDetectionTupleResponse.DataMode.TEST)
        assertThat(launchDetectionTupleResponse.messageType()).isEqualTo("Example-Msg-Type")
        assertThat(launchDetectionTupleResponse.observationLatitude()).isEqualTo(45.23)
        assertThat(launchDetectionTupleResponse.observationLongitude()).isEqualTo(1.23)
        assertThat(launchDetectionTupleResponse.observationTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionTupleResponse.sequenceNumber()).isEqualTo(5)
        assertThat(launchDetectionTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchDetectionTupleResponse.id()).contains("LAUNCHDETECTION-ID")
        assertThat(launchDetectionTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionTupleResponse.createdBy()).contains("some.user")
        assertThat(launchDetectionTupleResponse.descriptor()).contains("Example descriptor")
        assertThat(launchDetectionTupleResponse.eventId()).contains("EVENT-ID")
        assertThat(launchDetectionTupleResponse.highZenithAzimuth()).contains(false)
        assertThat(launchDetectionTupleResponse.inclination()).contains(1.23)
        assertThat(launchDetectionTupleResponse.launchAzimuth()).contains(1.23)
        assertThat(launchDetectionTupleResponse.launchLatitude()).contains(1.23)
        assertThat(launchDetectionTupleResponse.launchLongitude()).contains(1.23)
        assertThat(launchDetectionTupleResponse.launchTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionTupleResponse.observationAltitude()).contains(1.23)
        assertThat(launchDetectionTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchDetectionTupleResponse.origNetwork()).contains("OPS1")
        assertThat(launchDetectionTupleResponse.raan()).contains(1.23)
        assertThat(launchDetectionTupleResponse.stereoFlag()).contains(false)
        assertThat(launchDetectionTupleResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(launchDetectionTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchDetectionTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchDetectionTupleResponse =
            LaunchDetectionTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionTupleResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .raan(1.23)
                .stereoFlag(false)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedLaunchDetectionTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchDetectionTupleResponse),
                jacksonTypeRef<LaunchDetectionTupleResponse>(),
            )

        assertThat(roundtrippedLaunchDetectionTupleResponse).isEqualTo(launchDetectionTupleResponse)
    }
}
