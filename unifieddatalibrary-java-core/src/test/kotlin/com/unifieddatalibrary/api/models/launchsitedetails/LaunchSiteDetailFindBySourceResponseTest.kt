// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.LocationAbridged
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteDetailFindBySourceResponseTest {

    @Test
    fun create() {
        val launchSiteDetailFindBySourceResponse =
            LaunchSiteDetailFindBySourceResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailFindBySourceResponse.DataMode.TEST)
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

        assertThat(launchSiteDetailFindBySourceResponse.classificationMarking()).isEqualTo("U")
        assertThat(launchSiteDetailFindBySourceResponse.dataMode())
            .isEqualTo(LaunchSiteDetailFindBySourceResponse.DataMode.TEST)
        assertThat(launchSiteDetailFindBySourceResponse.idLaunchSite()).isEqualTo("LAUNCHSITE-ID")
        assertThat(launchSiteDetailFindBySourceResponse.source()).isEqualTo("Bluestaq")
        assertThat(launchSiteDetailFindBySourceResponse.id()).contains("LAUNCHSITEDETAILS-ID")
        assertThat(launchSiteDetailFindBySourceResponse.availableInclinations().getOrNull())
            .containsExactly(10.23, 10.23, 12.23, 14.23)
        assertThat(launchSiteDetailFindBySourceResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(launchSiteDetailFindBySourceResponse.createdBy()).contains("some.user")
        assertThat(launchSiteDetailFindBySourceResponse.description()).contains("Example notes")
        assertThat(launchSiteDetailFindBySourceResponse.idLocation()).contains("LOCATION-ID")
        assertThat(launchSiteDetailFindBySourceResponse.launchGroup())
            .contains("Example-group-name")
        assertThat(launchSiteDetailFindBySourceResponse.location())
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
        assertThat(launchSiteDetailFindBySourceResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(launchSiteDetailFindBySourceResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchSiteDetailFindBySourceResponse =
            LaunchSiteDetailFindBySourceResponse.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailFindBySourceResponse.DataMode.TEST)
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

        val roundtrippedLaunchSiteDetailFindBySourceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchSiteDetailFindBySourceResponse),
                jacksonTypeRef<LaunchSiteDetailFindBySourceResponse>(),
            )

        assertThat(roundtrippedLaunchSiteDetailFindBySourceResponse)
            .isEqualTo(launchSiteDetailFindBySourceResponse)
    }
}
