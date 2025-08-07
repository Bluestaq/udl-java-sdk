// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineCreateParamsTest {

    @Test
    fun create() {
        EngineCreateParams.builder()
            .classificationMarking("U")
            .dataMode(EngineCreateParams.DataMode.TEST)
            .name("ENGINE_VARIANT1")
            .source("Bluestaq")
            .id("ENGINE-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            EngineCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EngineCreateParams.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .id("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ENGINE-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EngineCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EngineCreateParams.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
