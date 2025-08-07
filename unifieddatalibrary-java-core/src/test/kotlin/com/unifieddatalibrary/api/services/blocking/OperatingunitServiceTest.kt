// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCountParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCreateParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitGetParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitTupleParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OperatingunitServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        operatingunitService.create(
            OperatingunitCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OperatingunitCreateParams.DataMode.TEST)
                .name("SOME_NAME")
                .source("some.user")
                .airDefArea("AL006")
                .allegiance("OTHR")
                .altAllegiance("HL")
                .altCountryCode("IZ")
                .altOperatingUnitId("32100000000021")
                .classRating("1")
                .condition("RDY")
                .conditionAvail("A")
                .coord("340000000N0430000000E")
                .coordDatum("WGS")
                .coordDerivAcc(12.345)
                .countryCode("IQ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deployStatus("ND")
                .description("Description of unit")
                .divCat("5")
                .echelon("SHIP")
                .echelonTier("68")
                .elevMsl(123.45)
                .elevMslConfLvl(50)
                .elevMslDerivAcc(12.34)
                .eval(7)
                .flagFlown("IZ")
                .fleetId("A")
                .force("NV")
                .forceName("FORCE-NAME")
                .fpa("EOB")
                .functRole("MIL")
                .geoidalMslSep(12.34)
                .idContact("CONTACT-ID")
                .ident("FRIEND")
                .idLocation("LOCATION-ID")
                .idOperatingUnit("OPERATINGUNIT-ID")
                .idOrganization("ORGANIZATION-ID")
                .lat(45.23)
                .locName("LOCATION_NAME")
                .locReason("GR")
                .lon(179.1)
                .masterUnit(true)
                .milGrid("4QFJ12345678")
                .milGridSys("UTM")
                .msnPrimary("W6")
                .msnPrimarySpecialty("QK")
                .operStatus("OPR")
                .origin("THIRD_PARTY_DATASOURCE")
                .polSubdiv("IZ07")
                .recStatus("A")
                .referenceDoc("Provider Reference Documentation")
                .resProd("RT")
                .reviewDate(LocalDate.parse("2008-06-10"))
                .stylizedUnit(true)
                .symCode("SOGPU----------")
                .unitIdentifier("AZXAZ12345")
                .utm("19P4390691376966")
                .wac("0427")
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        operatingunitService.update(
            OperatingunitUpdateParams.builder()
                .id("id")
                .classificationMarking("U")
                .dataMode(OperatingunitUpdateParams.DataMode.TEST)
                .name("SOME_NAME")
                .source("some.user")
                .airDefArea("AL006")
                .allegiance("OTHR")
                .altAllegiance("HL")
                .altCountryCode("IZ")
                .altOperatingUnitId("32100000000021")
                .classRating("1")
                .condition("RDY")
                .conditionAvail("A")
                .coord("340000000N0430000000E")
                .coordDatum("WGS")
                .coordDerivAcc(12.345)
                .countryCode("IQ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deployStatus("ND")
                .description("Description of unit")
                .divCat("5")
                .echelon("SHIP")
                .echelonTier("68")
                .elevMsl(123.45)
                .elevMslConfLvl(50)
                .elevMslDerivAcc(12.34)
                .eval(7)
                .flagFlown("IZ")
                .fleetId("A")
                .force("NV")
                .forceName("FORCE-NAME")
                .fpa("EOB")
                .functRole("MIL")
                .geoidalMslSep(12.34)
                .idContact("CONTACT-ID")
                .ident("FRIEND")
                .idLocation("LOCATION-ID")
                .idOperatingUnit("OPERATINGUNIT-ID")
                .idOrganization("ORGANIZATION-ID")
                .lat(45.23)
                .locName("LOCATION_NAME")
                .locReason("GR")
                .lon(179.1)
                .masterUnit(true)
                .milGrid("4QFJ12345678")
                .milGridSys("UTM")
                .msnPrimary("W6")
                .msnPrimarySpecialty("QK")
                .operStatus("OPR")
                .origin("THIRD_PARTY_DATASOURCE")
                .polSubdiv("IZ07")
                .recStatus("A")
                .referenceDoc("Provider Reference Documentation")
                .resProd("RT")
                .reviewDate(LocalDate.parse("2008-06-10"))
                .stylizedUnit(true)
                .symCode("SOGPU----------")
                .unitIdentifier("AZXAZ12345")
                .utm("19P4390691376966")
                .wac("0427")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        val page = operatingunitService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        operatingunitService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        operatingunitService.count(
            OperatingunitCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        val operatingunitFull =
            operatingunitService.get(
                OperatingunitGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        operatingunitFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        val response = operatingunitService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitService = client.operatingunit()

        val operatingunitFulls =
            operatingunitService.tuple(
                OperatingunitTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        operatingunitFulls.forEach { it.validate() }
    }
}
