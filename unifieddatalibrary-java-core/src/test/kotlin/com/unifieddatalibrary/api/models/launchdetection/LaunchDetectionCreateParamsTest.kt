// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchDetectionCreateParamsTest {

    @Test
    fun create() {
        LaunchDetectionCreateParams.builder()
            .classificationMarking("U")
            .dataMode(LaunchDetectionCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            LaunchDetectionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchDetectionCreateParams.DataMode.TEST)
        assertThat(body.messageType()).isEqualTo("Example-Msg-Type")
        assertThat(body.observationLatitude()).isEqualTo(45.23)
        assertThat(body.observationLongitude()).isEqualTo(1.23)
        assertThat(body.observationTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.sequenceNumber()).isEqualTo(5)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("LAUNCHDETECTION-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.descriptor()).contains("Example descriptor")
        assertThat(body.eventId()).contains("EVENT-ID")
        assertThat(body.highZenithAzimuth()).contains(false)
        assertThat(body.inclination()).contains(1.23)
        assertThat(body.launchAzimuth()).contains(1.23)
        assertThat(body.launchLatitude()).contains(1.23)
        assertThat(body.launchLongitude()).contains(1.23)
        assertThat(body.launchTime()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.observationAltitude()).contains(1.23)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.raan()).contains(1.23)
        assertThat(body.stereoFlag()).contains(false)
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.updatedBy()).contains("some.user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LaunchDetectionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchDetectionCreateParams.DataMode.TEST)
                .messageType("Example-Msg-Type")
                .observationLatitude(45.23)
                .observationLongitude(1.23)
                .observationTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .sequenceNumber(5)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchDetectionCreateParams.DataMode.TEST)
        assertThat(body.messageType()).isEqualTo("Example-Msg-Type")
        assertThat(body.observationLatitude()).isEqualTo(45.23)
        assertThat(body.observationLongitude()).isEqualTo(1.23)
        assertThat(body.observationTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.sequenceNumber()).isEqualTo(5)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
