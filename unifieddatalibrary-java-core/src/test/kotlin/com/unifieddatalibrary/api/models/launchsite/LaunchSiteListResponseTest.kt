// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteListResponseTest {

    @Test
    fun create() {
      val launchSiteListResponse = LaunchSiteListResponse.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteListResponse.DataMode.TEST)
          .name("Example launch site name")
          .source("Bluestaq")
          .id("LAUNCHSITE-ID")
          .altCode("35")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .shortCode("SNMLP")
          .build()

      assertThat(launchSiteListResponse.classificationMarking()).isEqualTo("U")
      assertThat(launchSiteListResponse.code()).isEqualTo("SAN MARCO")
      assertThat(launchSiteListResponse.dataMode()).isEqualTo(LaunchSiteListResponse.DataMode.TEST)
      assertThat(launchSiteListResponse.name()).isEqualTo("Example launch site name")
      assertThat(launchSiteListResponse.source()).isEqualTo("Bluestaq")
      assertThat(launchSiteListResponse.id()).contains("LAUNCHSITE-ID")
      assertThat(launchSiteListResponse.altCode()).contains("35")
      assertThat(launchSiteListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(launchSiteListResponse.createdBy()).contains("some.user")
      assertThat(launchSiteListResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
      assertThat(launchSiteListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(launchSiteListResponse.origNetwork()).contains("ORIG")
      assertThat(launchSiteListResponse.shortCode()).contains("SNMLP")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val launchSiteListResponse = LaunchSiteListResponse.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteListResponse.DataMode.TEST)
          .name("Example launch site name")
          .source("Bluestaq")
          .id("LAUNCHSITE-ID")
          .altCode("35")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .shortCode("SNMLP")
          .build()

      val roundtrippedLaunchSiteListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(launchSiteListResponse), jacksonTypeRef<LaunchSiteListResponse>())

      assertThat(roundtrippedLaunchSiteListResponse).isEqualTo(launchSiteListResponse)
    }
}
