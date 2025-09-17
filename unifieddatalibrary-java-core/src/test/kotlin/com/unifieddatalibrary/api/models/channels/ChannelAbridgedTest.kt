// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.channels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAbridgedTest {

    @Test
    fun create() {
        val channelAbridged =
            ChannelAbridged.builder()
                .classificationMarking("U")
                .dataMode(ChannelAbridged.DataMode.TEST)
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
                .origNetwork("OPS1")
                .owner("example_owner")
                .pkg("Example pkg")
                .res("Example res")
                .sid("S-ID")
                .type("Example type")
                .vpid("VP-ID")
                .build()

        assertThat(channelAbridged.classificationMarking()).isEqualTo("U")
        assertThat(channelAbridged.dataMode()).isEqualTo(ChannelAbridged.DataMode.TEST)
        assertThat(channelAbridged.idTransponder()).isEqualTo("REF-TRANSPONDER-ID")
        assertThat(channelAbridged.name()).isEqualTo("Example name")
        assertThat(channelAbridged.source()).isEqualTo("system.source")
        assertThat(channelAbridged.id()).contains("CHANNEL-ID")
        assertThat(channelAbridged.apid()).contains("AP-ID")
        assertThat(channelAbridged.beamName()).contains("B8VD")
        assertThat(channelAbridged.compression()).contains("Example compression")
        assertThat(channelAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(channelAbridged.createdBy()).contains("some.user")
        assertThat(channelAbridged.encryption()).contains("Example encryption")
        assertThat(channelAbridged.idBeam()).contains("REF-BEAM-ID")
        assertThat(channelAbridged.idRfBand()).contains("REF-RFBAND-ID")
        assertThat(channelAbridged.origin()).contains("example_origin")
        assertThat(channelAbridged.origNetwork()).contains("OPS1")
        assertThat(channelAbridged.owner()).contains("example_owner")
        assertThat(channelAbridged.pkg()).contains("Example pkg")
        assertThat(channelAbridged.res()).contains("Example res")
        assertThat(channelAbridged.sid()).contains("S-ID")
        assertThat(channelAbridged.type()).contains("Example type")
        assertThat(channelAbridged.vpid()).contains("VP-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelAbridged =
            ChannelAbridged.builder()
                .classificationMarking("U")
                .dataMode(ChannelAbridged.DataMode.TEST)
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
                .origNetwork("OPS1")
                .owner("example_owner")
                .pkg("Example pkg")
                .res("Example res")
                .sid("S-ID")
                .type("Example type")
                .vpid("VP-ID")
                .build()

        val roundtrippedChannelAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelAbridged),
                jacksonTypeRef<ChannelAbridged>(),
            )

        assertThat(roundtrippedChannelAbridged).isEqualTo(channelAbridged)
    }
}
