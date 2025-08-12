// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfields

import com.unifieddatalibrary.api.models.airfields.AirfieldCreateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldCreateParamsTest {

    @Test
    fun create() {
      AirfieldCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldCreateParams.DataMode.TEST)
          .name("Hickam Air Force Base")
          .source("Bluestaq")
          .type("Commercial")
          .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
          .altAirfieldId("45301")
          .addAlternativeName("BELLEVILLE")
          .addAlternativeName("JONESTOWN")
          .city("Honolulu")
          .countryCode("US")
          .countryName("United States")
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dstInfo("SEE THE ENROUTE SUPP FOR INFORMATION")
          .elevFt(33.562)
          .elevM(10.29)
          .faa("FAA1")
          .geoloc("XLSX")
          .gmtOffset("-4:30")
          .hostNatCode("ZPU")
          .iata("AAA")
          .icao("KCOS")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .infoUrl("URL Link to the Airfield")
          .lat(45.23)
          .lon(179.1)
          .magDec(7.35)
          .maxRunwayLength(1000)
          .miscCodes("AMZ")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .regionalAuthority("18TH AF")
          .regionName("Hawaii")
          .runways(5)
          .secondaryIcao("PHNL")
          .sourceDl("AXE")
          .state("Hawaii")
          .stateProvinceCode("US15")
          .suitabilityCodeDescs(listOf(
            "Suitable C-32",
            "Suitable C-5",
            "Suitable C-130",
          ))
          .suitabilityCodes("ABC")
          .wacInnr("0409-00039")
          .zarId("231")
          .build()
    }

    @Test
    fun body() {
      val params = AirfieldCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldCreateParams.DataMode.TEST)
          .name("Hickam Air Force Base")
          .source("Bluestaq")
          .type("Commercial")
          .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
          .altAirfieldId("45301")
          .addAlternativeName("BELLEVILLE")
          .addAlternativeName("JONESTOWN")
          .city("Honolulu")
          .countryCode("US")
          .countryName("United States")
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dstInfo("SEE THE ENROUTE SUPP FOR INFORMATION")
          .elevFt(33.562)
          .elevM(10.29)
          .faa("FAA1")
          .geoloc("XLSX")
          .gmtOffset("-4:30")
          .hostNatCode("ZPU")
          .iata("AAA")
          .icao("KCOS")
          .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
          .infoUrl("URL Link to the Airfield")
          .lat(45.23)
          .lon(179.1)
          .magDec(7.35)
          .maxRunwayLength(1000)
          .miscCodes("AMZ")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .regionalAuthority("18TH AF")
          .regionName("Hawaii")
          .runways(5)
          .secondaryIcao("PHNL")
          .sourceDl("AXE")
          .state("Hawaii")
          .stateProvinceCode("US15")
          .suitabilityCodeDescs(listOf(
            "Suitable C-32",
            "Suitable C-5",
            "Suitable C-130",
          ))
          .suitabilityCodes("ABC")
          .wacInnr("0409-00039")
          .zarId("231")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(AirfieldCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("Hickam Air Force Base")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.type()).isEqualTo("Commercial")
      assertThat(body.id()).contains("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
      assertThat(body.altAirfieldId()).contains("45301")
      assertThat(body.alternativeNames().getOrNull()).containsExactly("BELLEVILLE", "JONESTOWN")
      assertThat(body.city()).contains("Honolulu")
      assertThat(body.countryCode()).contains("US")
      assertThat(body.countryName()).contains("United States")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.dstInfo()).contains("SEE THE ENROUTE SUPP FOR INFORMATION")
      assertThat(body.elevFt()).contains(33.562)
      assertThat(body.elevM()).contains(10.29)
      assertThat(body.faa()).contains("FAA1")
      assertThat(body.geoloc()).contains("XLSX")
      assertThat(body.gmtOffset()).contains("-4:30")
      assertThat(body.hostNatCode()).contains("ZPU")
      assertThat(body.iata()).contains("AAA")
      assertThat(body.icao()).contains("KCOS")
      assertThat(body.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
      assertThat(body.infoUrl()).contains("URL Link to the Airfield")
      assertThat(body.lat()).contains(45.23)
      assertThat(body.lon()).contains(179.1)
      assertThat(body.magDec()).contains(7.35)
      assertThat(body.maxRunwayLength()).contains(1000)
      assertThat(body.miscCodes()).contains("AMZ")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("OPS1")
      assertThat(body.regionalAuthority()).contains("18TH AF")
      assertThat(body.regionName()).contains("Hawaii")
      assertThat(body.runways()).contains(5)
      assertThat(body.secondaryIcao()).contains("PHNL")
      assertThat(body.sourceDl()).contains("AXE")
      assertThat(body.state()).contains("Hawaii")
      assertThat(body.stateProvinceCode()).contains("US15")
      assertThat(body.suitabilityCodeDescs().getOrNull()).containsExactly("Suitable C-32", "Suitable C-5", "Suitable C-130")
      assertThat(body.suitabilityCodes()).contains("ABC")
      assertThat(body.wacInnr()).contains("0409-00039")
      assertThat(body.zarId()).contains("231")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AirfieldCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldCreateParams.DataMode.TEST)
          .name("Hickam Air Force Base")
          .source("Bluestaq")
          .type("Commercial")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(AirfieldCreateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("Hickam Air Force Base")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.type()).isEqualTo("Commercial")
    }
}
