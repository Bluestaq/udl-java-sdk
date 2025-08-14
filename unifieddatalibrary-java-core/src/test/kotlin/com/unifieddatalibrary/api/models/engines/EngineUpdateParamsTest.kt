// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.unifieddatalibrary.api.models.EngineIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineUpdateParamsTest {

    @Test
    fun create() {
        EngineUpdateParams.builder()
            .pathId("id")
            .engineIngest(
                EngineIngest.builder()
                    .classificationMarking("U")
                    .dataMode(EngineIngest.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EngineUpdateParams.builder()
                .pathId("id")
                .engineIngest(
                    EngineIngest.builder()
                        .classificationMarking("U")
                        .dataMode(EngineIngest.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .build()
                )
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
                .engineIngest(
                    EngineIngest.builder()
                        .classificationMarking("U")
                        .dataMode(EngineIngest.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .id("ENGINE-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EngineIngest.builder()
                    .classificationMarking("U")
                    .dataMode(EngineIngest.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EngineUpdateParams.builder()
                .pathId("id")
                .engineIngest(
                    EngineIngest.builder()
                        .classificationMarking("U")
                        .dataMode(EngineIngest.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EngineIngest.builder()
                    .classificationMarking("U")
                    .dataMode(EngineIngest.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .build()
            )
    }
}
