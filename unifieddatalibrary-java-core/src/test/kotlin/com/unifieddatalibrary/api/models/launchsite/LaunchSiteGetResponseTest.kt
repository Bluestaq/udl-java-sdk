// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.LocationFull
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteGetResponseTest {

    @Test
    fun create() {
      val launchSiteGetResponse = LaunchSiteGetResponse.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteGetResponse.DataMode.TEST)
          .name("Example launch site name")
          .source("Bluestaq")
          .id("LAUNCHSITE-ID")
          .altCode("35")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .addLaunchSiteDetail(LaunchSiteGetResponse.LaunchSiteDetail.builder()
              .classificationMarking("U")
              .dataMode(LaunchSiteGetResponse.LaunchSiteDetail.DataMode.TEST)
              .idLaunchSite("LAUNCHSITE-ID")
              .source("Bluestaq")
              .id("LAUNCHSITEDETAILS-ID")
              .availableInclinations(listOf(
                10.23,
                10.23,
                12.23,
                14.23,
              ))
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .description("Example notes")
              .idLocation("LOCATION-ID")
              .launchGroup("Example-group-name")
              .location(LocationFull.builder()
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
                  .build())
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .addTag("PROVIDER_TAG1")
              .addTag("PROVIDER_TAG2")
              .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .updatedBy("some.user")
              .build())
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .shortCode("SNMLP")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      assertThat(launchSiteGetResponse.classificationMarking()).isEqualTo("U")
      assertThat(launchSiteGetResponse.code()).isEqualTo("SAN MARCO")
      assertThat(launchSiteGetResponse.dataMode()).isEqualTo(LaunchSiteGetResponse.DataMode.TEST)
      assertThat(launchSiteGetResponse.name()).isEqualTo("Example launch site name")
      assertThat(launchSiteGetResponse.source()).isEqualTo("Bluestaq")
      assertThat(launchSiteGetResponse.id()).contains("LAUNCHSITE-ID")
      assertThat(launchSiteGetResponse.altCode()).contains("35")
      assertThat(launchSiteGetResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(launchSiteGetResponse.createdBy()).contains("some.user")
      assertThat(launchSiteGetResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
      assertThat(launchSiteGetResponse.launchSiteDetails().getOrNull()).containsExactly(LaunchSiteGetResponse.LaunchSiteDetail.builder()
          .classificationMarking("U")
          .dataMode(LaunchSiteGetResponse.LaunchSiteDetail.DataMode.TEST)
          .idLaunchSite("LAUNCHSITE-ID")
          .source("Bluestaq")
          .id("LAUNCHSITEDETAILS-ID")
          .availableInclinations(listOf(
            10.23,
            10.23,
            12.23,
            14.23,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .description("Example notes")
          .idLocation("LOCATION-ID")
          .launchGroup("Example-group-name")
          .location(LocationFull.builder()
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
              .build())
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .addTag("PROVIDER_TAG1")
          .addTag("PROVIDER_TAG2")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build())
      assertThat(launchSiteGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(launchSiteGetResponse.origNetwork()).contains("ORIG")
      assertThat(launchSiteGetResponse.shortCode()).contains("SNMLP")
      assertThat(launchSiteGetResponse.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(launchSiteGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val launchSiteGetResponse = LaunchSiteGetResponse.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteGetResponse.DataMode.TEST)
          .name("Example launch site name")
          .source("Bluestaq")
          .id("LAUNCHSITE-ID")
          .altCode("35")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .addLaunchSiteDetail(LaunchSiteGetResponse.LaunchSiteDetail.builder()
              .classificationMarking("U")
              .dataMode(LaunchSiteGetResponse.LaunchSiteDetail.DataMode.TEST)
              .idLaunchSite("LAUNCHSITE-ID")
              .source("Bluestaq")
              .id("LAUNCHSITEDETAILS-ID")
              .availableInclinations(listOf(
                10.23,
                10.23,
                12.23,
                14.23,
              ))
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .description("Example notes")
              .idLocation("LOCATION-ID")
              .launchGroup("Example-group-name")
              .location(LocationFull.builder()
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
                  .build())
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .addTag("PROVIDER_TAG1")
              .addTag("PROVIDER_TAG2")
              .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .updatedBy("some.user")
              .build())
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .shortCode("SNMLP")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      val roundtrippedLaunchSiteGetResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(launchSiteGetResponse), jacksonTypeRef<LaunchSiteGetResponse>())

      assertThat(roundtrippedLaunchSiteGetResponse).isEqualTo(launchSiteGetResponse)
    }
}
