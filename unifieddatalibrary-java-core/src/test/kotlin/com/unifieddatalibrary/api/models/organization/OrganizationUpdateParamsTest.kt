// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationUpdateParamsTest {

    @Test
    fun create() {
      OrganizationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OrganizationUpdateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .bodyId("ORGANIZATION-ID")
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
    fun pathParams() {
      val params = OrganizationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OrganizationUpdateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = OrganizationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OrganizationUpdateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .bodyId("ORGANIZATION-ID")
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
      assertThat(body.dataMode()).isEqualTo(OrganizationUpdateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("some.user")
      assertThat(body.source()).isEqualTo("some.user")
      assertThat(body.type()).isEqualTo("GOVERNMENT")
      assertThat(body.bodyId()).contains("ORGANIZATION-ID")
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
      val params = OrganizationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OrganizationUpdateParams.DataMode.TEST)
          .name("some.user")
          .source("some.user")
          .type("GOVERNMENT")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OrganizationUpdateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("some.user")
      assertThat(body.source()).isEqualTo("some.user")
      assertThat(body.type()).isEqualTo("GOVERNMENT")
    }
}
