// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airfields.AirfieldCountParams
import com.unifieddatalibrary.api.models.airfields.AirfieldCreateParams
import com.unifieddatalibrary.api.models.airfields.AirfieldRetrieveParams
import com.unifieddatalibrary.api.models.airfields.AirfieldTupleParams
import com.unifieddatalibrary.api.models.airfields.AirfieldUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirfieldServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val future =
            airfieldServiceAsync.create(
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
                    .suitabilityCodeDescs(listOf("Suitable C-32", "Suitable C-5", "Suitable C-130"))
                    .suitabilityCodes("ABC")
                    .wacInnr("0409-00039")
                    .zarId("231")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val airfieldFullFuture =
            airfieldServiceAsync.retrieve(
                AirfieldRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val airfieldFull = airfieldFullFuture.get()
        airfieldFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val future =
            airfieldServiceAsync.update(
                AirfieldUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AirfieldUpdateParams.DataMode.TEST)
                    .name("Hickam Air Force Base")
                    .source("Bluestaq")
                    .type("Commercial")
                    .bodyId("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
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
                    .suitabilityCodeDescs(listOf("Suitable C-32", "Suitable C-5", "Suitable C-130"))
                    .suitabilityCodes("ABC")
                    .wacInnr("0409-00039")
                    .zarId("231")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val pageFuture = airfieldServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val responseFuture =
            airfieldServiceAsync.count(
                AirfieldCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val responseFuture = airfieldServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldServiceAsync = client.airfields()

        val airfieldFullsFuture =
            airfieldServiceAsync.tuple(
                AirfieldTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airfieldFulls = airfieldFullsFuture.get()
        airfieldFulls.forEach { it.validate() }
    }
}
