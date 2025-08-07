// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthruster

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterCreateParamsTest {

    @Test
    fun create() {
        OnorbitthrusterCreateParams.builder()
            .classificationMarking("U")
            .dataMode(OnorbitthrusterCreateParams.DataMode.TEST)
            .idEngine("ENGINE-ID")
            .idOnOrbit("ONORBIT-ID")
            .source("Bluestaq")
            .id("ONORBITTHRUSTER-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .engine(
                OnorbitthrusterCreateParams.Engine.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitthrusterCreateParams.Engine.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .quantity(10)
            .type("Hydrazine REA")
            .build()
    }

    @Test
    fun body() {
        val params =
            OnorbitthrusterCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterCreateParams.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITTHRUSTER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .engine(
                    OnorbitthrusterCreateParams.Engine.builder()
                        .classificationMarking("U")
                        .dataMode(OnorbitthrusterCreateParams.Engine.DataMode.TEST)
                        .name("ENGINE_VARIANT1")
                        .source("Bluestaq")
                        .id("ENGINE-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .quantity(10)
                .type("Hydrazine REA")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitthrusterCreateParams.DataMode.TEST)
        assertThat(body.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ONORBITTHRUSTER-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.engine())
            .contains(
                OnorbitthrusterCreateParams.Engine.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitthrusterCreateParams.Engine.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.quantity()).contains(10)
        assertThat(body.type()).contains("Hydrazine REA")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitthrusterCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterCreateParams.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitthrusterCreateParams.DataMode.TEST)
        assertThat(body.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
