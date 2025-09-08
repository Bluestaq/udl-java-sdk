// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.transponder

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransponderListResponseTest {

    @Test
    fun create() {
        val transponderListResponse =
            TransponderListResponse.builder()
                .classificationMarking("U")
                .dataMode(TransponderListResponse.DataMode.TEST)
                .idComm("REF-COMM-ID")
                .source("Bluestaq")
                .id("TRANSPONDER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fec(0)
                .format("format")
                .modulation("Auto")
                .name("AA10")
                .nid("N-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .symbolRate(4.0)
                .system("DVB-S")
                .tid("T-ID")
                .ttf(1.53261520047876)
                .build()

        assertThat(transponderListResponse.classificationMarking()).isEqualTo("U")
        assertThat(transponderListResponse.dataMode())
            .isEqualTo(TransponderListResponse.DataMode.TEST)
        assertThat(transponderListResponse.idComm()).isEqualTo("REF-COMM-ID")
        assertThat(transponderListResponse.source()).isEqualTo("Bluestaq")
        assertThat(transponderListResponse.id()).contains("TRANSPONDER-ID")
        assertThat(transponderListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(transponderListResponse.createdBy()).contains("some.user")
        assertThat(transponderListResponse.fec()).contains(0)
        assertThat(transponderListResponse.format()).contains("format")
        assertThat(transponderListResponse.modulation()).contains("Auto")
        assertThat(transponderListResponse.name()).contains("AA10")
        assertThat(transponderListResponse.nid()).contains("N-ID")
        assertThat(transponderListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(transponderListResponse.origNetwork()).contains("OPS1")
        assertThat(transponderListResponse.symbolRate()).contains(4.0)
        assertThat(transponderListResponse.system()).contains("DVB-S")
        assertThat(transponderListResponse.tid()).contains("T-ID")
        assertThat(transponderListResponse.ttf()).contains(1.53261520047876)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transponderListResponse =
            TransponderListResponse.builder()
                .classificationMarking("U")
                .dataMode(TransponderListResponse.DataMode.TEST)
                .idComm("REF-COMM-ID")
                .source("Bluestaq")
                .id("TRANSPONDER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fec(0)
                .format("format")
                .modulation("Auto")
                .name("AA10")
                .nid("N-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .symbolRate(4.0)
                .system("DVB-S")
                .tid("T-ID")
                .ttf(1.53261520047876)
                .build()

        val roundtrippedTransponderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transponderListResponse),
                jacksonTypeRef<TransponderListResponse>(),
            )

        assertThat(roundtrippedTransponderListResponse).isEqualTo(transponderListResponse)
    }
}
