// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.antennas.AntennaAbridged
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitantennaListResponseTest {

    @Test
    fun create() {
        val onorbitantennaListResponse =
            OnorbitantennaListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitantennaListResponse.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITANTENNA-ID")
                .antenna(
                    AntennaAbridged.builder()
                        .dataMode(AntennaAbridged.DataMode.TEST)
                        .name("IRIDIUM NEXT 121-ANTENNA-10075")
                        .source("Bluestaq")
                        .id("ANTENNA-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(onorbitantennaListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitantennaListResponse.dataMode())
            .isEqualTo(OnorbitantennaListResponse.DataMode.TEST)
        assertThat(onorbitantennaListResponse.idAntenna()).isEqualTo("ANTENNA-ID")
        assertThat(onorbitantennaListResponse.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(onorbitantennaListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitantennaListResponse.id()).contains("ONORBITANTENNA-ID")
        assertThat(onorbitantennaListResponse.antenna())
            .contains(
                AntennaAbridged.builder()
                    .dataMode(AntennaAbridged.DataMode.TEST)
                    .name("IRIDIUM NEXT 121-ANTENNA-10075")
                    .source("Bluestaq")
                    .id("ANTENNA-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
        assertThat(onorbitantennaListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitantennaListResponse.createdBy()).contains("some.user")
        assertThat(onorbitantennaListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitantennaListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitantennaListResponse =
            OnorbitantennaListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitantennaListResponse.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITANTENNA-ID")
                .antenna(
                    AntennaAbridged.builder()
                        .dataMode(AntennaAbridged.DataMode.TEST)
                        .name("IRIDIUM NEXT 121-ANTENNA-10075")
                        .source("Bluestaq")
                        .id("ANTENNA-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedOnorbitantennaListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitantennaListResponse),
                jacksonTypeRef<OnorbitantennaListResponse>(),
            )

        assertThat(roundtrippedOnorbitantennaListResponse).isEqualTo(onorbitantennaListResponse)
    }
}
