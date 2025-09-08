// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubStatusIngestTest {

    @Test
    fun create() {
        val subStatusIngest =
            SubStatusIngest.builder()
                .classificationMarking("U")
                .dataMode(SubStatusIngest.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubStatusIngest.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubStatusIngest.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(subStatusIngest.classificationMarking()).isEqualTo("U")
        assertThat(subStatusIngest.dataMode()).isEqualTo(SubStatusIngest.DataMode.TEST)
        assertThat(subStatusIngest.notes()).isEqualTo("Sample Notes")
        assertThat(subStatusIngest.source()).isEqualTo("Bluestaq")
        assertThat(subStatusIngest.status()).isEqualTo(SubStatusIngest.Status.FMC)
        assertThat(subStatusIngest.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(subStatusIngest.type()).isEqualTo(SubStatusIngest.Type.MD_CAP)
        assertThat(subStatusIngest.id()).contains("SUBSTATUS-ID")
        assertThat(subStatusIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(subStatusIngest.createdBy()).contains("some.user")
        assertThat(subStatusIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(subStatusIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subStatusIngest =
            SubStatusIngest.builder()
                .classificationMarking("U")
                .dataMode(SubStatusIngest.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubStatusIngest.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubStatusIngest.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedSubStatusIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subStatusIngest),
                jacksonTypeRef<SubStatusIngest>(),
            )

        assertThat(roundtrippedSubStatusIngest).isEqualTo(subStatusIngest)
    }
}
