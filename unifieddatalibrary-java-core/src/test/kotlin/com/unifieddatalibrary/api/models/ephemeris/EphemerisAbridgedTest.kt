// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemerisAbridgedTest {

    @Test
    fun create() {
        val ephemerisAbridged =
            EphemerisAbridged.builder()
                .classificationMarking("U")
                .dataMode(EphemerisAbridged.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .xpos(1.1)
                .xvel(1.1)
                .ypos(1.1)
                .yvel(1.1)
                .zpos(1.1)
                .zvel(1.1)
                .id("EPHEMERIS-ID")
                .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .esId("ES-ID")
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origObjectId("ORIGOBJECT-ID")
                .xaccel(1.1)
                .yaccel(1.1)
                .zaccel(1.1)
                .build()

        assertThat(ephemerisAbridged.classificationMarking()).isEqualTo("U")
        assertThat(ephemerisAbridged.dataMode()).isEqualTo(EphemerisAbridged.DataMode.TEST)
        assertThat(ephemerisAbridged.source()).isEqualTo("Bluestaq")
        assertThat(ephemerisAbridged.ts())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(ephemerisAbridged.xpos()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.xvel()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.ypos()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.yvel()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.zpos()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.zvel()).isEqualTo(1.1)
        assertThat(ephemerisAbridged.id()).contains("EPHEMERIS-ID")
        assertThat(ephemerisAbridged.cov().getOrNull())
            .containsExactly(1.1, 2.4, 3.8, 4.2, 5.5, 6.0)
        assertThat(ephemerisAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(ephemerisAbridged.createdBy()).contains("some.user")
        assertThat(ephemerisAbridged.esId()).contains("ES-ID")
        assertThat(ephemerisAbridged.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(ephemerisAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(ephemerisAbridged.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(ephemerisAbridged.xaccel()).contains(1.1)
        assertThat(ephemerisAbridged.yaccel()).contains(1.1)
        assertThat(ephemerisAbridged.zaccel()).contains(1.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemerisAbridged =
            EphemerisAbridged.builder()
                .classificationMarking("U")
                .dataMode(EphemerisAbridged.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .xpos(1.1)
                .xvel(1.1)
                .ypos(1.1)
                .yvel(1.1)
                .zpos(1.1)
                .zvel(1.1)
                .id("EPHEMERIS-ID")
                .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .esId("ES-ID")
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origObjectId("ORIGOBJECT-ID")
                .xaccel(1.1)
                .yaccel(1.1)
                .zaccel(1.1)
                .build()

        val roundtrippedEphemerisAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemerisAbridged),
                jacksonTypeRef<EphemerisAbridged>(),
            )

        assertThat(roundtrippedEphemerisAbridged).isEqualTo(ephemerisAbridged)
    }
}
