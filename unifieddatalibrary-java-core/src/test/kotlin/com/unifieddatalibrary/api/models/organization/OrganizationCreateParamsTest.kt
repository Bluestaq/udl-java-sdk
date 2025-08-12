// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.unifieddatalibrary.api.models.organization.OrganizationCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Test
    fun create() {
      OrganizationCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OrganizationCreateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .id("ORGANIZATION-ID")
          .active(false)
          .category("Private company")
          .countryCode("US")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .description("Example description")
          .externalId("EXTERNAL-ID")
          .nationality("US")
          .origin("some.user")
          .origNetwork("OPS1")
          .build()
    }

    @Test
    fun body() {
      val params = OrganizationCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OrganizationCreateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .id("ORGANIZATION-ID")
          .active(false)
          .category("Private company")
          .countryCode("US")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .description("Example description")
          .externalId("EXTERNAL-ID")
          .nationality("US")
          .origin("some.user")
          .origNetwork("OPS1")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OrganizationCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("some.user")
      assertThat(body.source()).isEqualTo("some.user")
      assertThat(body.type()).isEqualTo("GOVERNMENT")
      assertThat(body.id()).contains("ORGANIZATION-ID")
      assertThat(body.active()).contains(false)
      assertThat(body.category()).contains("Private company")
      assertThat(body.countryCode()).contains("US")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.description()).contains("Example description")
      assertThat(body.externalId()).contains("EXTERNAL-ID")
      assertThat(body.nationality()).contains("US")
      assertThat(body.origin()).contains("some.user")
      assertThat(body.origNetwork()).contains("OPS1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OrganizationCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OrganizationCreateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OrganizationCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("some.user")
      assertThat(body.source()).isEqualTo("some.user")
      assertThat(body.type()).isEqualTo("GOVERNMENT")
    }
}
