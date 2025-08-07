// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamCreateParamsTest {

    @Test
    fun create() {
        BeamCreateParams.builder()
            .beamName("BEAMNAME-ID")
            .classificationMarking("U")
            .dataMode(BeamCreateParams.DataMode.TEST)
            .source("Bluestaq")
            .id("BEAM-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .notes("Example notes")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            BeamCreateParams.builder()
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.beamName()).isEqualTo("BEAMNAME-ID")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("BEAM-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeamCreateParams.builder()
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.beamName()).isEqualTo("BEAMNAME-ID")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
