// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelFullTest {

    @Test
    fun create() {
        val channelFull =
            ChannelFull.builder()
                .classificationMarking("U")
                .dataMode(ChannelFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .vpid("VP-ID")
                .build()

        assertThat(channelFull.classificationMarking()).isEqualTo("U")
        assertThat(channelFull.dataMode()).isEqualTo(ChannelFull.DataMode.TEST)
        assertThat(channelFull.idTransponder()).isEqualTo("REF-TRANSPONDER-ID")
        assertThat(channelFull.name()).isEqualTo("Example name")
        assertThat(channelFull.source()).isEqualTo("system.source")
        assertThat(channelFull.id()).contains("CHANNEL-ID")
        assertThat(channelFull.apid()).contains("AP-ID")
        assertThat(channelFull.beamName()).contains("B8VD")
        assertThat(channelFull.compression()).contains("Example compression")
        assertThat(channelFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(channelFull.createdBy()).contains("some.user")
        assertThat(channelFull.encryption()).contains("Example encryption")
        assertThat(channelFull.idBeam()).contains("REF-BEAM-ID")
        assertThat(channelFull.idRfBand()).contains("REF-RFBAND-ID")
        assertThat(channelFull.origin()).contains("example_origin")
        assertThat(channelFull.origNetwork()).contains("ORIG")
        assertThat(channelFull.owner()).contains("example_owner")
        assertThat(channelFull.pkg()).contains("Example pkg")
        assertThat(channelFull.res()).contains("Example res")
        assertThat(channelFull.sid()).contains("S-ID")
        assertThat(channelFull.type()).contains("Example type")
        assertThat(channelFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(channelFull.updatedBy()).contains("some.user")
        assertThat(channelFull.vpid()).contains("VP-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelFull =
            ChannelFull.builder()
                .classificationMarking("U")
                .dataMode(ChannelFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .vpid("VP-ID")
                .build()

        val roundtrippedChannelFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelFull),
                jacksonTypeRef<ChannelFull>(),
            )

        assertThat(roundtrippedChannelFull).isEqualTo(channelFull)
    }
}
