// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailsAbridged
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaDetailsAbridgedTest {

    @Test
    fun create() {
      val antennaDetailsAbridged = AntennaDetailsAbridged.builder()
          .classificationMarking("U")
          .dataMode(AntennaDetailsAbridged.DataMode.TEST)
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
          .mode(AntennaDetailsAbridged.Mode.TX)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .polarization(45.1)
          .position("Top")
          .addSize(0.03)
          .addSize(0.05)
          .startFrequency(2.1)
          .steerable(false)
          .type("Reflector")
          .build()

      assertThat(antennaDetailsAbridged.classificationMarking()).isEqualTo("U")
      assertThat(antennaDetailsAbridged.dataMode()).isEqualTo(AntennaDetailsAbridged.DataMode.TEST)
      assertThat(antennaDetailsAbridged.idAntenna()).isEqualTo("ANTENNA-ID")
      assertThat(antennaDetailsAbridged.source()).isEqualTo("Bluestaq")
      assertThat(antennaDetailsAbridged.id()).contains("ANTENNADETAILS-ID")
      assertThat(antennaDetailsAbridged.beamForming()).contains(false)
      assertThat(antennaDetailsAbridged.beamwidth()).contains(14.1)
      assertThat(antennaDetailsAbridged.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(antennaDetailsAbridged.createdBy()).contains("some.user")
      assertThat(antennaDetailsAbridged.description()).contains("Description of antenna A")
      assertThat(antennaDetailsAbridged.diameter()).contains(0.01)
      assertThat(antennaDetailsAbridged.endFrequency()).contains(3.3)
      assertThat(antennaDetailsAbridged.gain()).contains(20.1)
      assertThat(antennaDetailsAbridged.gainTolerance()).contains(5.1)
      assertThat(antennaDetailsAbridged.manufacturerOrgId()).contains("MANUFACTUREORG-ID")
      assertThat(antennaDetailsAbridged.mode()).contains(AntennaDetailsAbridged.Mode.TX)
      assertThat(antennaDetailsAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(antennaDetailsAbridged.origNetwork()).contains("ORIG")
      assertThat(antennaDetailsAbridged.polarization()).contains(45.1)
      assertThat(antennaDetailsAbridged.position()).contains("Top")
      assertThat(antennaDetailsAbridged.size().getOrNull()).containsExactly(0.03, 0.05)
      assertThat(antennaDetailsAbridged.startFrequency()).contains(2.1)
      assertThat(antennaDetailsAbridged.steerable()).contains(false)
      assertThat(antennaDetailsAbridged.type()).contains("Reflector")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val antennaDetailsAbridged = AntennaDetailsAbridged.builder()
          .classificationMarking("U")
          .dataMode(AntennaDetailsAbridged.DataMode.TEST)
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
          .mode(AntennaDetailsAbridged.Mode.TX)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .polarization(45.1)
          .position("Top")
          .addSize(0.03)
          .addSize(0.05)
          .startFrequency(2.1)
          .steerable(false)
          .type("Reflector")
          .build()

      val roundtrippedAntennaDetailsAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(antennaDetailsAbridged), jacksonTypeRef<AntennaDetailsAbridged>())

      assertThat(roundtrippedAntennaDetailsAbridged).isEqualTo(antennaDetailsAbridged)
    }
}
