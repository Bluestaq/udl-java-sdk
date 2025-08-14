// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunitremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingunitremarkListResponseTest {

    @Test
    fun create() {
        val operatingunitremarkListResponse =
            OperatingunitremarkListResponse.builder()
                .classificationMarking("U")
                .dataMode(OperatingunitremarkListResponse.DataMode.TEST)
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
                .build()

        assertThat(operatingunitremarkListResponse.classificationMarking()).isEqualTo("U")
        assertThat(operatingunitremarkListResponse.dataMode())
            .isEqualTo(OperatingunitremarkListResponse.DataMode.TEST)
        assertThat(operatingunitremarkListResponse.idOperatingUnit()).isEqualTo("OperatingUnit-ID")
        assertThat(operatingunitremarkListResponse.source()).isEqualTo("some.user")
        assertThat(operatingunitremarkListResponse.text()).isEqualTo("This is a remark")
        assertThat(operatingunitremarkListResponse.id())
            .contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(operatingunitremarkListResponse.altRmkId()).contains("123456ABC")
        assertThat(operatingunitremarkListResponse.code()).contains("M")
        assertThat(operatingunitremarkListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(operatingunitremarkListResponse.createdBy()).contains("some.user")
        assertThat(operatingunitremarkListResponse.name()).contains("Remark name")
        assertThat(operatingunitremarkListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(operatingunitremarkListResponse.type()).contains("Restriction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operatingunitremarkListResponse =
            OperatingunitremarkListResponse.builder()
                .classificationMarking("U")
                .dataMode(OperatingunitremarkListResponse.DataMode.TEST)
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
                .build()

        val roundtrippedOperatingunitremarkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operatingunitremarkListResponse),
                jacksonTypeRef<OperatingunitremarkListResponse>(),
            )

        assertThat(roundtrippedOperatingunitremarkListResponse)
            .isEqualTo(operatingunitremarkListResponse)
    }
}
