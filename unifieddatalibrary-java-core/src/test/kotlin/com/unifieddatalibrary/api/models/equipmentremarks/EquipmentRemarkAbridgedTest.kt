// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EquipmentRemarkAbridgedTest {

    @Test
    fun create() {
        val equipmentRemarkAbridged =
            EquipmentRemarkAbridged.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkAbridged.DataMode.TEST)
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
                .build()

        assertThat(equipmentRemarkAbridged.classificationMarking()).isEqualTo("U")
        assertThat(equipmentRemarkAbridged.dataMode())
            .isEqualTo(EquipmentRemarkAbridged.DataMode.TEST)
        assertThat(equipmentRemarkAbridged.idEquipment()).isEqualTo("EQUIPMENT-ID")
        assertThat(equipmentRemarkAbridged.source()).isEqualTo("Bluestaq")
        assertThat(equipmentRemarkAbridged.text()).isEqualTo("This is a remark")
        assertThat(equipmentRemarkAbridged.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(equipmentRemarkAbridged.altRmkId()).contains("123456ABC")
        assertThat(equipmentRemarkAbridged.code()).contains("M")
        assertThat(equipmentRemarkAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(equipmentRemarkAbridged.createdBy()).contains("some.user")
        assertThat(equipmentRemarkAbridged.name()).contains("Remark name")
        assertThat(equipmentRemarkAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(equipmentRemarkAbridged.type()).contains("Restriction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val equipmentRemarkAbridged =
            EquipmentRemarkAbridged.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkAbridged.DataMode.TEST)
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
                .build()

        val roundtrippedEquipmentRemarkAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(equipmentRemarkAbridged),
                jacksonTypeRef<EquipmentRemarkAbridged>(),
            )

        assertThat(roundtrippedEquipmentRemarkAbridged).isEqualTo(equipmentRemarkAbridged)
    }
}
