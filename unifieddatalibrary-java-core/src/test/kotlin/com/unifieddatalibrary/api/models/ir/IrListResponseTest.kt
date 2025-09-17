// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IrListResponseTest {

    @Test
    fun create() {
        val irListResponse =
            IrListResponse.builder()
                .classificationMarking("U")
                .dataMode(IrListResponse.DataMode.TEST)
                .name("Example name")
                .source("Bluestaq")
                .id("IR-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example description")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(irListResponse.classificationMarking()).isEqualTo("U")
        assertThat(irListResponse.dataMode()).isEqualTo(IrListResponse.DataMode.TEST)
        assertThat(irListResponse.name()).isEqualTo("Example name")
        assertThat(irListResponse.source()).isEqualTo("Bluestaq")
        assertThat(irListResponse.id()).contains("IR-ID")
        assertThat(irListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(irListResponse.createdBy()).contains("some.user")
        assertThat(irListResponse.description()).contains("Example description")
        assertThat(irListResponse.idEntity()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(irListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(irListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val irListResponse =
            IrListResponse.builder()
                .classificationMarking("U")
                .dataMode(IrListResponse.DataMode.TEST)
                .name("Example name")
                .source("Bluestaq")
                .id("IR-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example description")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedIrListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(irListResponse),
                jacksonTypeRef<IrListResponse>(),
            )

        assertThat(roundtrippedIrListResponse).isEqualTo(irListResponse)
    }
}
