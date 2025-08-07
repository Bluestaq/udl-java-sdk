// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitantennaUpdateParamsTest {

    @Test
    fun create() {
        OnorbitantennaUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
            .idAntenna("ANTENNA-ID")
            .idOnOrbit("ONORBIT-ID")
            .source("Bluestaq")
            .bodyId("ONORBITANTENNA-ID")
            .antenna(
                OnorbitantennaUpdateParams.Antenna.builder()
                    .dataMode(OnorbitantennaUpdateParams.Antenna.DataMode.TEST)
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
    }

    @Test
    fun pathParams() {
        val params =
            OnorbitantennaUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OnorbitantennaUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .bodyId("ONORBITANTENNA-ID")
                .antenna(
                    OnorbitantennaUpdateParams.Antenna.builder()
                        .dataMode(OnorbitantennaUpdateParams.Antenna.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitantennaUpdateParams.DataMode.TEST)
        assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ONORBITANTENNA-ID")
        assertThat(body.antenna())
            .contains(
                OnorbitantennaUpdateParams.Antenna.builder()
                    .dataMode(OnorbitantennaUpdateParams.Antenna.DataMode.TEST)
                    .name("IRIDIUM NEXT 121-ANTENNA-10075")
                    .source("Bluestaq")
                    .id("ANTENNA-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitantennaUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitantennaUpdateParams.DataMode.TEST)
        assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
