// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteDetailCreateParamsTest {

    @Test
    fun create() {
        LaunchSiteDetailCreateParams.builder()
            .classificationMarking("U")
            .dataMode(LaunchSiteDetailCreateParams.DataMode.TEST)
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
                LocationIngest.builder()
                    .classificationMarking("U")
                    .dataMode(LocationIngest.DataMode.TEST)
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
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            LaunchSiteDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailCreateParams.DataMode.TEST)
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
                    LocationIngest.builder()
                        .classificationMarking("U")
                        .dataMode(LocationIngest.DataMode.TEST)
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
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchSiteDetailCreateParams.DataMode.TEST)
        assertThat(body.idLaunchSite()).isEqualTo("LAUNCHSITE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("LAUNCHSITEDETAILS-ID")
        assertThat(body.availableInclinations().getOrNull())
            .containsExactly(10.23, 10.23, 12.23, 14.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("Example notes")
        assertThat(body.idLocation()).contains("LOCATION-ID")
        assertThat(body.launchGroup()).contains("Example-group-name")
        assertThat(body.location())
            .contains(
                LocationIngest.builder()
                    .classificationMarking("U")
                    .dataMode(LocationIngest.DataMode.TEST)
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
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LaunchSiteDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailCreateParams.DataMode.TEST)
                .idLaunchSite("LAUNCHSITE-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchSiteDetailCreateParams.DataMode.TEST)
        assertThat(body.idLaunchSite()).isEqualTo("LAUNCHSITE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
