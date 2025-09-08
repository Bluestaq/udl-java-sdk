// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineIngestTest {

    @Test
    fun create() {
        val engineIngest =
            EngineIngest.builder()
                .classificationMarking("U")
                .dataMode(EngineIngest.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .id("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(engineIngest.classificationMarking()).isEqualTo("U")
        assertThat(engineIngest.dataMode()).isEqualTo(EngineIngest.DataMode.TEST)
        assertThat(engineIngest.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(engineIngest.source()).isEqualTo("Bluestaq")
        assertThat(engineIngest.id()).contains("ENGINE-ID")
        assertThat(engineIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(engineIngest.createdBy()).contains("some.user")
        assertThat(engineIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(engineIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineIngest =
            EngineIngest.builder()
                .classificationMarking("U")
                .dataMode(EngineIngest.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .id("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedEngineIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineIngest),
                jacksonTypeRef<EngineIngest>(),
            )

        assertThat(roundtrippedEngineIngest).isEqualTo(engineIngest)
    }
}
