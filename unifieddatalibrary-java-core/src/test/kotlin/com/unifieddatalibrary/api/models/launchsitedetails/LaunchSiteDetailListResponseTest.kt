// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.LocationAbridged
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteDetailListResponseTest {

    @Test
    fun create() {
        val launchSiteDetailListResponse =
            LaunchSiteDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailListResponse.DataMode.TEST)
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
                    LocationAbridged.builder()
                        .classificationMarking("U")
                        .dataMode(LocationAbridged.DataMode.TEST)
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
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(launchSiteDetailListResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchSiteDetailListResponse.dataMode())
            .isEqualTo(LaunchSiteDetailListResponse.DataMode.TEST)
        assertThat(launchSiteDetailListResponse.idLaunchSite()).isEqualTo("LAUNCHSITE-ID")
        assertThat(launchSiteDetailListResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchSiteDetailListResponse.id()).contains("LAUNCHSITEDETAILS-ID")
        assertThat(launchSiteDetailListResponse.availableInclinations().getOrNull())
            .containsExactly(10.23, 10.23, 12.23, 14.23)
        assertThat(launchSiteDetailListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchSiteDetailListResponse.createdBy()).contains("some.user")
        assertThat(launchSiteDetailListResponse.description()).contains("Example notes")
        assertThat(launchSiteDetailListResponse.idLocation()).contains("LOCATION-ID")
        assertThat(launchSiteDetailListResponse.launchGroup()).contains("Example-group-name")
        assertThat(launchSiteDetailListResponse.location())
            .contains(
                LocationAbridged.builder()
                    .classificationMarking("U")
                    .dataMode(LocationAbridged.DataMode.TEST)
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
                    .build()
            )
        assertThat(launchSiteDetailListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchSiteDetailListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchSiteDetailListResponse =
            LaunchSiteDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailListResponse.DataMode.TEST)
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
                    LocationAbridged.builder()
                        .classificationMarking("U")
                        .dataMode(LocationAbridged.DataMode.TEST)
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
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedLaunchSiteDetailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchSiteDetailListResponse),
                jacksonTypeRef<LaunchSiteDetailListResponse>(),
            )

        assertThat(roundtrippedLaunchSiteDetailListResponse).isEqualTo(launchSiteDetailListResponse)
    }
}
