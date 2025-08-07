// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.LocationFull
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteDetailGetResponseTest {

    @Test
    fun create() {
        val launchSiteDetailGetResponse =
            LaunchSiteDetailGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailGetResponse.DataMode.TEST)
                .idLaunchSite("LAUNCHSITE-ID")
                .source("Bluestaq")
                .id("LAUNCHSITEDETAILS-ID")
                .availableInclinations(listOf(10.23, 10.23, 12.23, 14.23))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .idLocation("LOCATION-ID")
                .launchGroup("Example-group-name")
                .location(
                    LocationFull.builder()
                        .classificationMarking("U")
                        .dataMode(LocationFull.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .altitude(10.23)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idLocation("LOCATION-ID")
                        .lat(45.23)
                        .lon(179.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(launchSiteDetailGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchSiteDetailGetResponse.dataMode())
            .isEqualTo(LaunchSiteDetailGetResponse.DataMode.TEST)
        assertThat(launchSiteDetailGetResponse.idLaunchSite()).isEqualTo("LAUNCHSITE-ID")
        assertThat(launchSiteDetailGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchSiteDetailGetResponse.id()).contains("LAUNCHSITEDETAILS-ID")
        assertThat(launchSiteDetailGetResponse.availableInclinations().getOrNull())
            .containsExactly(10.23, 10.23, 12.23, 14.23)
        assertThat(launchSiteDetailGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchSiteDetailGetResponse.createdBy()).contains("some.user")
        assertThat(launchSiteDetailGetResponse.description()).contains("Example notes")
        assertThat(launchSiteDetailGetResponse.idLocation()).contains("LOCATION-ID")
        assertThat(launchSiteDetailGetResponse.launchGroup()).contains("Example-group-name")
        assertThat(launchSiteDetailGetResponse.location())
            .contains(
                LocationFull.builder()
                    .classificationMarking("U")
                    .dataMode(LocationFull.DataMode.TEST)
                    .name("Example location")
                    .source("Bluestaq")
                    .altitude(10.23)
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .idLocation("LOCATION-ID")
                    .lat(45.23)
                    .lon(179.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
        assertThat(launchSiteDetailGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchSiteDetailGetResponse.origNetwork()).contains("ORIG")
        assertThat(launchSiteDetailGetResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(launchSiteDetailGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchSiteDetailGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchSiteDetailGetResponse =
            LaunchSiteDetailGetResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailGetResponse.DataMode.TEST)
                .idLaunchSite("LAUNCHSITE-ID")
                .source("Bluestaq")
                .id("LAUNCHSITEDETAILS-ID")
                .availableInclinations(listOf(10.23, 10.23, 12.23, 14.23))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .idLocation("LOCATION-ID")
                .launchGroup("Example-group-name")
                .location(
                    LocationFull.builder()
                        .classificationMarking("U")
                        .dataMode(LocationFull.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .altitude(10.23)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idLocation("LOCATION-ID")
                        .lat(45.23)
                        .lon(179.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedLaunchSiteDetailGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchSiteDetailGetResponse),
                jacksonTypeRef<LaunchSiteDetailGetResponse>(),
            )

        assertThat(roundtrippedLaunchSiteDetailGetResponse).isEqualTo(launchSiteDetailGetResponse)
    }
}
