// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EquipmentRemarkCreateParamsTest {

    @Test
    fun create() {
        EquipmentRemarkCreateParams.builder()
            .classificationMarking("U")
            .dataMode(EquipmentRemarkCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            EquipmentRemarkCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EquipmentRemarkCreateParams.DataMode.TEST)
        assertThat(body.idEquipment()).isEqualTo("EQUIPMENT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("This is a remark")
        assertThat(body.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(body.altRmkId()).contains("123456ABC")
        assertThat(body.code()).contains("M")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.name()).contains("Remark name")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.type()).contains("Restriction")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EquipmentRemarkCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EquipmentRemarkCreateParams.DataMode.TEST)
                .idEquipment("EQUIPMENT-ID")
                .source("Bluestaq")
                .text("This is a remark")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EquipmentRemarkCreateParams.DataMode.TEST)
        assertThat(body.idEquipment()).isEqualTo("EQUIPMENT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("This is a remark")
    }
}
