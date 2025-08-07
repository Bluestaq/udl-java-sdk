// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.transponder

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransponderCreateParamsTest {

    @Test
    fun create() {
        TransponderCreateParams.builder()
            .classificationMarking("U")
            .dataMode(TransponderCreateParams.DataMode.TEST)
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
            .origNetwork("ORIG")
            .symbolRate(4.0)
            .system("DVB-S")
            .tid("T-ID")
            .ttf(1.53261520047876)
            .build()
    }

    @Test
    fun body() {
        val params =
            TransponderCreateParams.builder()
                .classificationMarking("U")
                .dataMode(TransponderCreateParams.DataMode.TEST)
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
                .origNetwork("ORIG")
                .symbolRate(4.0)
                .system("DVB-S")
                .tid("T-ID")
                .ttf(1.53261520047876)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(TransponderCreateParams.DataMode.TEST)
        assertThat(body.idComm()).isEqualTo("REF-COMM-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("TRANSPONDER-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.fec()).contains(0)
        assertThat(body.format()).contains("format")
        assertThat(body.modulation()).contains("Auto")
        assertThat(body.name()).contains("AA10")
        assertThat(body.nid()).contains("N-ID")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.symbolRate()).contains(4.0)
        assertThat(body.system()).contains("DVB-S")
        assertThat(body.tid()).contains("T-ID")
        assertThat(body.ttf()).contains(1.53261520047876)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransponderCreateParams.builder()
                .classificationMarking("U")
                .dataMode(TransponderCreateParams.DataMode.TEST)
                .idComm("REF-COMM-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(TransponderCreateParams.DataMode.TEST)
        assertThat(body.idComm()).isEqualTo("REF-COMM-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
