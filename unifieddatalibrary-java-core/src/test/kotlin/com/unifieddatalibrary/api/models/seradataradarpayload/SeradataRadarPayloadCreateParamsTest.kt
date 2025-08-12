// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataRadarPayloadCreateParamsTest {

    @Test
    fun create() {
      SeradataRadarPayloadCreateParams.builder()
          .classificationMarking("U")
          .dataMode(SeradataRadarPayloadCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("12345")
          .id("SERADATARADARPAYLOAD-ID")
          .bandwidth(1.23)
          .bestResolution(1.23)
          .category("SAR")
          .constellationInterferometricCapability("constellationInterferometricCapability")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dutyCycle("dutyCycle")
          .fieldOfRegard(1.23)
          .fieldOfView(1.23)
          .frequency(1.23)
          .frequencyBand("X")
          .groundStationLocations("51,42N-44,35E")
          .groundStations("groundStations")
          .hostedForCompanyOrgId("hostedForCompanyOrgId")
          .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
          .manufacturerOrgId("manufacturerOrgId")
          .name("ALT")
          .notes("Sample Notes")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .partnerSpacecraft("partnerSpacecraft")
          .pointingMethod("Spacecraft")
          .receivePolarization("Lin Dual")
          .recorderSize("256")
          .swathWidth(1.23)
          .transmitPolarization("Lin Dual")
          .waveLength(1.23)
          .build()
    }

    @Test
    fun body() {
      val params = SeradataRadarPayloadCreateParams.builder()
          .classificationMarking("U")
          .dataMode(SeradataRadarPayloadCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("12345")
          .id("SERADATARADARPAYLOAD-ID")
          .bandwidth(1.23)
          .bestResolution(1.23)
          .category("SAR")
          .constellationInterferometricCapability("constellationInterferometricCapability")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dutyCycle("dutyCycle")
          .fieldOfRegard(1.23)
          .fieldOfView(1.23)
          .frequency(1.23)
          .frequencyBand("X")
          .groundStationLocations("51,42N-44,35E")
          .groundStations("groundStations")
          .hostedForCompanyOrgId("hostedForCompanyOrgId")
          .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
          .manufacturerOrgId("manufacturerOrgId")
          .name("ALT")
          .notes("Sample Notes")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .partnerSpacecraft("partnerSpacecraft")
          .pointingMethod("Spacecraft")
          .receivePolarization("Lin Dual")
          .recorderSize("256")
          .swathWidth(1.23)
          .transmitPolarization("Lin Dual")
          .waveLength(1.23)
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(SeradataRadarPayloadCreateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.spacecraftId()).isEqualTo("12345")
      assertThat(body.id()).contains("SERADATARADARPAYLOAD-ID")
      assertThat(body.bandwidth()).contains(1.23)
      assertThat(body.bestResolution()).contains(1.23)
      assertThat(body.category()).contains("SAR")
      assertThat(body.constellationInterferometricCapability()).contains("constellationInterferometricCapability")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.dutyCycle()).contains("dutyCycle")
      assertThat(body.fieldOfRegard()).contains(1.23)
      assertThat(body.fieldOfView()).contains(1.23)
      assertThat(body.frequency()).contains(1.23)
      assertThat(body.frequencyBand()).contains("X")
      assertThat(body.groundStationLocations()).contains("51,42N-44,35E")
      assertThat(body.groundStations()).contains("groundStations")
      assertThat(body.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
      assertThat(body.idSensor()).contains("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
      assertThat(body.manufacturerOrgId()).contains("manufacturerOrgId")
      assertThat(body.name()).contains("ALT")
      assertThat(body.notes()).contains("Sample Notes")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
      assertThat(body.partnerSpacecraft()).contains("partnerSpacecraft")
      assertThat(body.pointingMethod()).contains("Spacecraft")
      assertThat(body.receivePolarization()).contains("Lin Dual")
      assertThat(body.recorderSize()).contains("256")
      assertThat(body.swathWidth()).contains(1.23)
      assertThat(body.transmitPolarization()).contains("Lin Dual")
      assertThat(body.waveLength()).contains(1.23)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = SeradataRadarPayloadCreateParams.builder()
          .classificationMarking("U")
          .dataMode(SeradataRadarPayloadCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("12345")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(SeradataRadarPayloadCreateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.spacecraftId()).isEqualTo("12345")
    }
}
