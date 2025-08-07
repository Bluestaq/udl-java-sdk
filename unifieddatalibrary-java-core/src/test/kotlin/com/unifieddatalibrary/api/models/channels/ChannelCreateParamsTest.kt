// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.channels

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelCreateParamsTest {

    @Test
    fun create() {
        ChannelCreateParams.builder()
            .classificationMarking("U")
            .dataMode(ChannelCreateParams.DataMode.TEST)
            .idTransponder("REF-TRANSPONDER-ID")
            .name("Example name")
            .source("system.source")
            .id("CHANNEL-ID")
            .apid("AP-ID")
            .beamName("B8VD")
            .compression("Example compression")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .encryption("Example encryption")
            .idBeam("REF-BEAM-ID")
            .idRfBand("REF-RFBAND-ID")
            .origin("example_origin")
            .origNetwork("ORIG")
            .owner("example_owner")
            .pkg("Example pkg")
            .res("Example res")
            .sid("S-ID")
            .type("Example type")
            .vpid("VP-ID")
            .build()
    }

    @Test
    fun body() {
        val params =
            ChannelCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ChannelCreateParams.DataMode.TEST)
                .idTransponder("REF-TRANSPONDER-ID")
                .name("Example name")
                .source("system.source")
                .id("CHANNEL-ID")
                .apid("AP-ID")
                .beamName("B8VD")
                .compression("Example compression")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .encryption("Example encryption")
                .idBeam("REF-BEAM-ID")
                .idRfBand("REF-RFBAND-ID")
                .origin("example_origin")
                .origNetwork("ORIG")
                .owner("example_owner")
                .pkg("Example pkg")
                .res("Example res")
                .sid("S-ID")
                .type("Example type")
                .vpid("VP-ID")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ChannelCreateParams.DataMode.TEST)
        assertThat(body.idTransponder()).isEqualTo("REF-TRANSPONDER-ID")
        assertThat(body.name()).isEqualTo("Example name")
        assertThat(body.source()).isEqualTo("system.source")
        assertThat(body.id()).contains("CHANNEL-ID")
        assertThat(body.apid()).contains("AP-ID")
        assertThat(body.beamName()).contains("B8VD")
        assertThat(body.compression()).contains("Example compression")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.encryption()).contains("Example encryption")
        assertThat(body.idBeam()).contains("REF-BEAM-ID")
        assertThat(body.idRfBand()).contains("REF-RFBAND-ID")
        assertThat(body.origin()).contains("example_origin")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.owner()).contains("example_owner")
        assertThat(body.pkg()).contains("Example pkg")
        assertThat(body.res()).contains("Example res")
        assertThat(body.sid()).contains("S-ID")
        assertThat(body.type()).contains("Example type")
        assertThat(body.vpid()).contains("VP-ID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ChannelCreateParams.DataMode.TEST)
                .idTransponder("REF-TRANSPONDER-ID")
                .name("Example name")
                .source("system.source")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ChannelCreateParams.DataMode.TEST)
        assertThat(body.idTransponder()).isEqualTo("REF-TRANSPONDER-ID")
        assertThat(body.name()).isEqualTo("Example name")
        assertThat(body.source()).isEqualTo("system.source")
    }
}
