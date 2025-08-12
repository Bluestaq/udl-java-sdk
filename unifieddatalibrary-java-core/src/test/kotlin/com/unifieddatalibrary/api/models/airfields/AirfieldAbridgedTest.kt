// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfields

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.airfields.AirfieldAbridged
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldAbridgedTest {

    @Test
    fun create() {
      val airfieldAbridged = AirfieldAbridged.builder()
          .classificationMarking("U")
          .dataMode(AirfieldAbridged.DataMode.TEST)
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

      assertThat(airfieldAbridged.classificationMarking()).isEqualTo("U")
      assertThat(airfieldAbridged.dataMode()).isEqualTo(AirfieldAbridged.DataMode.TEST)
      assertThat(airfieldAbridged.name()).isEqualTo("Hickam Air Force Base")
      assertThat(airfieldAbridged.source()).isEqualTo("Bluestaq")
      assertThat(airfieldAbridged.type()).isEqualTo("Commercial")
      assertThat(airfieldAbridged.id()).contains("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
      assertThat(airfieldAbridged.altAirfieldId()).contains("45301")
      assertThat(airfieldAbridged.alternativeNames().getOrNull()).containsExactly("BELLEVILLE", "JONESTOWN")
      assertThat(airfieldAbridged.city()).contains("Honolulu")
      assertThat(airfieldAbridged.countryCode()).contains("US")
      assertThat(airfieldAbridged.countryName()).contains("United States")
      assertThat(airfieldAbridged.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(airfieldAbridged.createdBy()).contains("some.user")
      assertThat(airfieldAbridged.dstInfo()).contains("SEE THE ENROUTE SUPP FOR INFORMATION")
      assertThat(airfieldAbridged.elevFt()).contains(33.562)
      assertThat(airfieldAbridged.elevM()).contains(10.29)
      assertThat(airfieldAbridged.faa()).contains("FAA1")
      assertThat(airfieldAbridged.geoloc()).contains("XLSX")
      assertThat(airfieldAbridged.gmtOffset()).contains("-4:30")
      assertThat(airfieldAbridged.hostNatCode()).contains("ZPU")
      assertThat(airfieldAbridged.iata()).contains("AAA")
      assertThat(airfieldAbridged.icao()).contains("KCOS")
      assertThat(airfieldAbridged.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
      assertThat(airfieldAbridged.infoUrl()).contains("URL Link to the Airfield")
      assertThat(airfieldAbridged.lat()).contains(45.23)
      assertThat(airfieldAbridged.lon()).contains(179.1)
      assertThat(airfieldAbridged.magDec()).contains(7.35)
      assertThat(airfieldAbridged.maxRunwayLength()).contains(1000)
      assertThat(airfieldAbridged.miscCodes()).contains("AMZ")
      assertThat(airfieldAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(airfieldAbridged.origNetwork()).contains("OPS1")
      assertThat(airfieldAbridged.regionalAuthority()).contains("18TH AF")
      assertThat(airfieldAbridged.regionName()).contains("Hawaii")
      assertThat(airfieldAbridged.runways()).contains(5)
      assertThat(airfieldAbridged.secondaryIcao()).contains("PHNL")
      assertThat(airfieldAbridged.sourceDl()).contains("AXE")
      assertThat(airfieldAbridged.state()).contains("Hawaii")
      assertThat(airfieldAbridged.stateProvinceCode()).contains("US15")
      assertThat(airfieldAbridged.suitabilityCodeDescs().getOrNull()).containsExactly("Suitable C-32", "Suitable C-5", "Suitable C-130")
      assertThat(airfieldAbridged.suitabilityCodes()).contains("ABC")
      assertThat(airfieldAbridged.wacInnr()).contains("0409-00039")
      assertThat(airfieldAbridged.zarId()).contains("231")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val airfieldAbridged = AirfieldAbridged.builder()
          .classificationMarking("U")
          .dataMode(AirfieldAbridged.DataMode.TEST)
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

      val roundtrippedAirfieldAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(airfieldAbridged), jacksonTypeRef<AirfieldAbridged>())

      assertThat(roundtrippedAirfieldAbridged).isEqualTo(airfieldAbridged)
    }
}
