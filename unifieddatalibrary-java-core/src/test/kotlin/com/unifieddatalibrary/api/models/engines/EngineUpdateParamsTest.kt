// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineUpdateParamsTest {

    @Test
    fun create() {
        EngineUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(EngineUpdateParams.DataMode.TEST)
            .name("ENGINE_VARIANT1")
            .source("Bluestaq")
            .bodyId("ENGINE-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EngineUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(EngineUpdateParams.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EngineUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(EngineUpdateParams.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .bodyId("ENGINE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ENGINE-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EngineUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(EngineUpdateParams.DataMode.TEST)
                .name("ENGINE_VARIANT1")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("ENGINE_VARIANT1")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
