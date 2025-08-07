// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineAbridgedTest {

    @Test
    fun create() {
        val engineAbridged =
            EngineAbridged.builder()
                .classificationMarking("U")
                .dataMode(EngineAbridged.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .id("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        assertThat(engineAbridged.classificationMarking()).isEqualTo("U")
        assertThat(engineAbridged.dataMode()).isEqualTo(EngineAbridged.DataMode.TEST)
        assertThat(engineAbridged.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(engineAbridged.source()).isEqualTo("Bluestaq")
        assertThat(engineAbridged.id()).contains("ENGINE-ID")
        assertThat(engineAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(engineAbridged.createdBy()).contains("some.user")
        assertThat(engineAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(engineAbridged.origNetwork()).contains("ORIG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineAbridged =
            EngineAbridged.builder()
                .classificationMarking("U")
                .dataMode(EngineAbridged.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .id("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val roundtrippedEngineAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineAbridged),
                jacksonTypeRef<EngineAbridged>(),
            )

        assertThat(roundtrippedEngineAbridged).isEqualTo(engineAbridged)
    }
}
