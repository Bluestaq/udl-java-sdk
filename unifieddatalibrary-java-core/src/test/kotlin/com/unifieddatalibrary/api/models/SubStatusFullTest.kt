// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubStatusFullTest {

    @Test
    fun create() {
        val subStatusFull =
            SubStatusFull.builder()
                .classificationMarking("U")
                .dataMode(SubStatusFull.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubStatusFull.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubStatusFull.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(subStatusFull.classificationMarking()).isEqualTo("U")
        assertThat(subStatusFull.dataMode()).isEqualTo(SubStatusFull.DataMode.TEST)
        assertThat(subStatusFull.notes()).isEqualTo("Sample Notes")
        assertThat(subStatusFull.source()).isEqualTo("Bluestaq")
        assertThat(subStatusFull.status()).isEqualTo(SubStatusFull.Status.FMC)
        assertThat(subStatusFull.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(subStatusFull.type()).isEqualTo(SubStatusFull.Type.MD_CAP)
        assertThat(subStatusFull.id()).contains("SUBSTATUS-ID")
        assertThat(subStatusFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(subStatusFull.createdBy()).contains("some.user")
        assertThat(subStatusFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(subStatusFull.origNetwork()).contains("TST1")
        assertThat(subStatusFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(subStatusFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subStatusFull =
            SubStatusFull.builder()
                .classificationMarking("U")
                .dataMode(SubStatusFull.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubStatusFull.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubStatusFull.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSubStatusFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subStatusFull),
                jacksonTypeRef<SubStatusFull>(),
            )

        assertThat(roundtrippedSubStatusFull).isEqualTo(subStatusFull)
    }
}
