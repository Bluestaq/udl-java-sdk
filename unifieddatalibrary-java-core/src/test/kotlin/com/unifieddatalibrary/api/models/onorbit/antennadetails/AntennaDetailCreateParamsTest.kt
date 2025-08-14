// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaDetailCreateParamsTest {

    @Test
    fun create() {
        AntennaDetailCreateParams.builder()
            .classificationMarking("U")
            .dataMode(AntennaDetailCreateParams.DataMode.TEST)
            .idAntenna("ANTENNA-ID")
            .source("Bluestaq")
            .id("ANTENNADETAILS-ID")
            .beamForming(false)
            .beamwidth(14.1)
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .description("Description of antenna A")
            .diameter(0.01)
            .endFrequency(3.3)
            .gain(20.1)
            .gainTolerance(5.1)
            .manufacturerOrgId("MANUFACTUREORG-ID")
            .mode(AntennaDetailCreateParams.Mode.TX)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .polarization(45.1)
            .position("Top")
            .addSize(0.03)
            .addSize(0.05)
            .startFrequency(2.1)
            .steerable(false)
            .addTag("PROVIDER_TAG1")
            .addTag("PROVIDER_TAG2")
            .type("Reflector")
            .build()
    }

    @Test
    fun body() {
        val params =
            AntennaDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AntennaDetailCreateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .source("Bluestaq")
                .id("ANTENNADETAILS-ID")
                .beamForming(false)
                .beamwidth(14.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Description of antenna A")
                .diameter(0.01)
                .endFrequency(3.3)
                .gain(20.1)
                .gainTolerance(5.1)
                .manufacturerOrgId("MANUFACTUREORG-ID")
                .mode(AntennaDetailCreateParams.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .polarization(45.1)
                .position("Top")
                .addSize(0.03)
                .addSize(0.05)
                .startFrequency(2.1)
                .steerable(false)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .type("Reflector")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AntennaDetailCreateParams.DataMode.TEST)
        assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ANTENNADETAILS-ID")
        assertThat(body.beamForming()).contains(false)
        assertThat(body.beamwidth()).contains(14.1)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("Description of antenna A")
        assertThat(body.diameter()).contains(0.01)
        assertThat(body.endFrequency()).contains(3.3)
        assertThat(body.gain()).contains(20.1)
        assertThat(body.gainTolerance()).contains(5.1)
        assertThat(body.manufacturerOrgId()).contains("MANUFACTUREORG-ID")
        assertThat(body.mode()).contains(AntennaDetailCreateParams.Mode.TX)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.polarization()).contains(45.1)
        assertThat(body.position()).contains("Top")
        assertThat(body.size().getOrNull()).containsExactly(0.03, 0.05)
        assertThat(body.startFrequency()).contains(2.1)
        assertThat(body.steerable()).contains(false)
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.type()).contains("Reflector")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AntennaDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AntennaDetailCreateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AntennaDetailCreateParams.DataMode.TEST)
        assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
