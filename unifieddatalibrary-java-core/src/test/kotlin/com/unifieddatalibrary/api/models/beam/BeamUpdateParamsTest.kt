// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamUpdateParamsTest {

    @Test
    fun create() {
        BeamUpdateParams.builder()
            .pathId("id")
            .beamName("BEAMNAME-ID")
            .classificationMarking("U")
            .dataMode(BeamUpdateParams.DataMode.TEST)
            .source("Bluestaq")
            .bodyId("BEAM-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .notes("Example notes")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BeamUpdateParams.builder()
                .pathId("id")
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BeamUpdateParams.builder()
                .pathId("id")
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .bodyId("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.beamName()).isEqualTo("BEAMNAME-ID")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("BEAM-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeamUpdateParams.builder()
                .pathId("id")
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.beamName()).isEqualTo("BEAMNAME-ID")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
