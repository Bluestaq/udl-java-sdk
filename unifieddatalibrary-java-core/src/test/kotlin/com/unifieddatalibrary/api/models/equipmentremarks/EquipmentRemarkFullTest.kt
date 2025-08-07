// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EquipmentRemarkFullTest {

    @Test
    fun create() {
        val equipmentRemarkFull =
            EquipmentRemarkFull.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkFull.DataMode.TEST)
                .idEquipment("EQUIPMENT-ID")
                .source("Bluestaq")
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

        assertThat(equipmentRemarkFull.classificationMarking()).isEqualTo("U")
        assertThat(equipmentRemarkFull.dataMode()).isEqualTo(EquipmentRemarkFull.DataMode.TEST)
        assertThat(equipmentRemarkFull.idEquipment()).isEqualTo("EQUIPMENT-ID")
        assertThat(equipmentRemarkFull.source()).isEqualTo("Bluestaq")
        assertThat(equipmentRemarkFull.text()).isEqualTo("This is a remark")
        assertThat(equipmentRemarkFull.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(equipmentRemarkFull.altRmkId()).contains("123456ABC")
        assertThat(equipmentRemarkFull.code()).contains("M")
        assertThat(equipmentRemarkFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(equipmentRemarkFull.createdBy()).contains("some.user")
        assertThat(equipmentRemarkFull.name()).contains("Remark name")
        assertThat(equipmentRemarkFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(equipmentRemarkFull.type()).contains("Restriction")
        assertThat(equipmentRemarkFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(equipmentRemarkFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val equipmentRemarkFull =
            EquipmentRemarkFull.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkFull.DataMode.TEST)
                .idEquipment("EQUIPMENT-ID")
                .source("Bluestaq")
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

        val roundtrippedEquipmentRemarkFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(equipmentRemarkFull),
                jacksonTypeRef<EquipmentRemarkFull>(),
            )

        assertThat(roundtrippedEquipmentRemarkFull).isEqualTo(equipmentRemarkFull)
    }
}
