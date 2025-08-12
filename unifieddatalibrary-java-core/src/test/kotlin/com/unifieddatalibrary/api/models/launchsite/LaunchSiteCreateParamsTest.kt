// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteCreateParamsTest {

    @Test
    fun create() {
      LaunchSiteCreateParams.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
      val params = LaunchSiteCreateParams.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteCreateParams.DataMode.TEST)
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

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.code()).isEqualTo("SAN MARCO")
      assertThat(body.dataMode()).isEqualTo(LaunchSiteCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("Example launch site name")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("LAUNCHSITE-ID")
      assertThat(body.altCode()).contains("35")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
      assertThat(body.shortCode()).contains("SNMLP")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = LaunchSiteCreateParams.builder()
          .classificationMarking("U")
          .code("SAN MARCO")
          .dataMode(LaunchSiteCreateParams.DataMode.TEST)
          .name("Example launch site name")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.code()).isEqualTo("SAN MARCO")
      assertThat(body.dataMode()).isEqualTo(LaunchSiteCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("Example launch site name")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
