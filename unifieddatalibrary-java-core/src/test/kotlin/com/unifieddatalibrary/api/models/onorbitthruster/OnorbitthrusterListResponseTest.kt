// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthruster

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.engines.EngineAbridged
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterListResponseTest {

    @Test
    fun create() {
        val onorbitthrusterListResponse =
            OnorbitthrusterListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterListResponse.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITTHRUSTER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .engine(
                    EngineAbridged.builder()
                        .classificationMarking("U")
                        .dataMode(EngineAbridged.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .id("ENGINE-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .quantity(10)
                .type("Hydrazine REA")
                .build()

        assertThat(onorbitthrusterListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitthrusterListResponse.dataMode())
            .isEqualTo(OnorbitthrusterListResponse.DataMode.TEST)
        assertThat(onorbitthrusterListResponse.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(onorbitthrusterListResponse.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(onorbitthrusterListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitthrusterListResponse.id()).contains("ONORBITTHRUSTER-ID")
        assertThat(onorbitthrusterListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitthrusterListResponse.createdBy()).contains("some.user")
        assertThat(onorbitthrusterListResponse.engine())
            .contains(
                EngineAbridged.builder()
                    .classificationMarking("U")
                    .dataMode(EngineAbridged.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
        assertThat(onorbitthrusterListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitthrusterListResponse.origNetwork()).contains("OPS1")
        assertThat(onorbitthrusterListResponse.quantity()).contains(10)
        assertThat(onorbitthrusterListResponse.type()).contains("Hydrazine REA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitthrusterListResponse =
            OnorbitthrusterListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterListResponse.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITTHRUSTER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .engine(
                    EngineAbridged.builder()
                        .classificationMarking("U")
                        .dataMode(EngineAbridged.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .id("ENGINE-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .quantity(10)
                .type("Hydrazine REA")
                .build()

        val roundtrippedOnorbitthrusterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitthrusterListResponse),
                jacksonTypeRef<OnorbitthrusterListResponse>(),
            )

        assertThat(roundtrippedOnorbitthrusterListResponse).isEqualTo(onorbitthrusterListResponse)
    }
}
