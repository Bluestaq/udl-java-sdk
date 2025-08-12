// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunitremark

import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingunitremarkCreateBulkParamsTest {

    @Test
    fun create() {
      OperatingunitremarkCreateBulkParams.builder()
          .addBody(OperatingunitremarkCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
              .idOperatingUnit("OperatingUnit-ID")
              .source("some.user")
              .text("This is a remark")
              .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
              .altRmkId("123456ABC")
              .code("M")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .name("Remark name")
              .origin("THIRD_PARTY_DATASOURCE")
              .type("Restriction")
              .build())
          .build()
    }

    @Test
    fun body() {
      val params = OperatingunitremarkCreateBulkParams.builder()
          .addBody(OperatingunitremarkCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
              .idOperatingUnit("OperatingUnit-ID")
              .source("some.user")
              .text("This is a remark")
              .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
              .altRmkId("123456ABC")
              .code("M")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .name("Remark name")
              .origin("THIRD_PARTY_DATASOURCE")
              .type("Restriction")
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(OperatingunitremarkCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
          .idOperatingUnit("OperatingUnit-ID")
          .source("some.user")
          .text("This is a remark")
          .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
          .altRmkId("123456ABC")
          .code("M")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .name("Remark name")
          .origin("THIRD_PARTY_DATASOURCE")
          .type("Restriction")
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OperatingunitremarkCreateBulkParams.builder()
          .addBody(OperatingunitremarkCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
              .idOperatingUnit("OperatingUnit-ID")
              .source("some.user")
              .text("This is a remark")
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(OperatingunitremarkCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
          .idOperatingUnit("OperatingUnit-ID")
          .source("some.user")
          .text("This is a remark")
          .build())
    }
}
