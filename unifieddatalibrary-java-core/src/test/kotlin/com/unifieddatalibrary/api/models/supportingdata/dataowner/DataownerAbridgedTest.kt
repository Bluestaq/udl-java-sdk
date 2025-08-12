// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.dataowner

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerAbridged
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataownerAbridgedTest {

    @Test
    fun create() {
      val dataownerAbridged = DataownerAbridged.builder()
          .classificationMarking("U")
          .description("Description of this data owner.")
          .doName("Data owner name")
          .idContact("026dd511-8ba5-47d3-9909-836149f87686")
          .source("some.user")
          .comingSoon(false)
          .control("PR-ACME-ELSETS")
          .countryCode("US")
          .dataType("ELSET")
          .enabled(false)
          .ownerType("Commercial")
          .provider("ACME")
          .build()

      assertThat(dataownerAbridged.classificationMarking()).isEqualTo("U")
      assertThat(dataownerAbridged.description()).isEqualTo("Description of this data owner.")
      assertThat(dataownerAbridged.doName()).isEqualTo("Data owner name")
      assertThat(dataownerAbridged.idContact()).isEqualTo("026dd511-8ba5-47d3-9909-836149f87686")
      assertThat(dataownerAbridged.source()).isEqualTo("some.user")
      assertThat(dataownerAbridged.comingSoon()).contains(false)
      assertThat(dataownerAbridged.control()).contains("PR-ACME-ELSETS")
      assertThat(dataownerAbridged.countryCode()).contains("US")
      assertThat(dataownerAbridged.dataType()).contains("ELSET")
      assertThat(dataownerAbridged.enabled()).contains(false)
      assertThat(dataownerAbridged.ownerType()).contains("Commercial")
      assertThat(dataownerAbridged.provider()).contains("ACME")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val dataownerAbridged = DataownerAbridged.builder()
          .classificationMarking("U")
          .description("Description of this data owner.")
          .doName("Data owner name")
          .idContact("026dd511-8ba5-47d3-9909-836149f87686")
          .source("some.user")
          .comingSoon(false)
          .control("PR-ACME-ELSETS")
          .countryCode("US")
          .dataType("ELSET")
          .enabled(false)
          .ownerType("Commercial")
          .provider("ACME")
          .build()

      val roundtrippedDataownerAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(dataownerAbridged), jacksonTypeRef<DataownerAbridged>())

      assertThat(roundtrippedDataownerAbridged).isEqualTo(dataownerAbridged)
    }
}
