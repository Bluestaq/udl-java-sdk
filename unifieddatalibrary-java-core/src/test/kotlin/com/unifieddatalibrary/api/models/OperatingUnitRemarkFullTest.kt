// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingUnitRemarkFullTest {

    @Test
    fun create() {
        val operatingUnitRemarkFull =
            OperatingUnitRemarkFull.builder()
                .classificationMarking("U")
                .dataMode(OperatingUnitRemarkFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(operatingUnitRemarkFull.classificationMarking()).isEqualTo("U")
        assertThat(operatingUnitRemarkFull.dataMode())
            .isEqualTo(OperatingUnitRemarkFull.DataMode.TEST)
        assertThat(operatingUnitRemarkFull.idOperatingUnit()).isEqualTo("OperatingUnit-ID")
        assertThat(operatingUnitRemarkFull.source()).isEqualTo("some.user")
        assertThat(operatingUnitRemarkFull.text()).isEqualTo("This is a remark")
        assertThat(operatingUnitRemarkFull.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(operatingUnitRemarkFull.altRmkId()).contains("123456ABC")
        assertThat(operatingUnitRemarkFull.code()).contains("M")
        assertThat(operatingUnitRemarkFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(operatingUnitRemarkFull.createdBy()).contains("some.user")
        assertThat(operatingUnitRemarkFull.name()).contains("Remark name")
        assertThat(operatingUnitRemarkFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(operatingUnitRemarkFull.type()).contains("Restriction")
        assertThat(operatingUnitRemarkFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(operatingUnitRemarkFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operatingUnitRemarkFull =
            OperatingUnitRemarkFull.builder()
                .classificationMarking("U")
                .dataMode(OperatingUnitRemarkFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedOperatingUnitRemarkFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operatingUnitRemarkFull),
                jacksonTypeRef<OperatingUnitRemarkFull>(),
            )

        assertThat(roundtrippedOperatingUnitRemarkFull).isEqualTo(operatingUnitRemarkFull)
    }
}
