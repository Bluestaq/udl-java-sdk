// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCountParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailCreateParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailGetParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailTupleParams
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataSpacecraftDetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        seradataSpacecraftDetailService.create(
            SeradataSpacecraftDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataSpacecraftDetailCreateParams.DataMode.TEST)
                .name("name")
                .source("Bluestaq")
                .id("SERADATASPACECRAFTDETAILS-ID")
                .additionalMissionsGroups("additionalMissionsGroups")
                .altitude(36036.6330576414)
                .annualInsuredDepreciationFactor(1.23)
                .annualInsuredDepreciationFactorEstimated(true)
                .apogee(1.23)
                .busId("BUS-ID")
                .capabilityLost(1.23)
                .capacityLost(1.23)
                .catalogNumber(1)
                .collisionRiskCm(1.43)
                .collisionRiskMm(1.33)
                .combinedCostEstimated(true)
                .combinedNewCost(1.23)
                .commercialLaunch(true)
                .constellation("GPS")
                .costEstimated(true)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cubesatDispenserType("cubesatDispenserType")
                .currentAge(5.898630136986301)
                .dateOfObservation(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .description("description")
                .designLife(231)
                .dryMass(1.23)
                .expectedLife(231)
                .geoPosition(-8.23)
                .idOnOrbit("503")
                .inclination(1.23)
                .insuranceLossesTotal(0.393)
                .insuranceNotes("Sample Notes")
                .insurancePremiumAtLaunch(1.23)
                .insurancePremiumAtLaunchEstimated(true)
                .insuredAtLaunch(true)
                .insuredValueAtLaunch(1.23)
                .insuredValueLaunchEstimated(true)
                .intlNumber("number")
                .lat(1.23)
                .launchArranger("launchArranger")
                .launchArrangerCountry("USA")
                .launchCharacteristic("Expendable")
                .launchCost(1.23)
                .launchCostEstimated(true)
                .launchCountry("USA")
                .launchDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .launchDateRemarks("launchDateRemarks")
                .launchId("11573")
                .launchMass(1.23)
                .launchNotes("Sample Notes")
                .launchNumber("FN040")
                .launchProvider("launchProvider")
                .launchProviderCountry("USA")
                .launchProviderFlightNumber("launchProviderFlightNumber")
                .launchSiteId("28")
                .launchSiteName("launchSiteName")
                .launchType("Future")
                .launchVehicleId("123")
                .leased(true)
                .lifeLost(1.23)
                .lon(1.23)
                .massCategory("2500 - 3500kg  - Large Satellite")
                .nameAtLaunch("nameAtLaunch")
                .newCost(1.23)
                .notes("Sample Notes")
                .numHumans(1)
                .operator("operator")
                .operatorCountry("USA")
                .orbitCategory("GEO")
                .orbitSubCategory("Geostationary")
                .orderDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .owner("owner")
                .ownerCountry("USA")
                .perigee(1.23)
                .period(1.23)
                .primaryMissionGroup("primaryMissionGroup")
                .primeManufacturerOrgId("05c43360-382e-4aa2-b875-ed28945ff2e5")
                .programName("programName")
                .quantity(1)
                .reusableFlights("reusableFlights")
                .reusedHullName("reusedHullName")
                .sector("Commercial")
                .serialNumber("serialNumber")
                .stabilizer("3-Axis")
                .status("Inactive - Retired")
                .totalClaims(1)
                .totalFatalities(1)
                .totalInjuries(1)
                .totalPayloadPower(1.23)
                .youtubeLaunchLink("youtubeLaunchLink")
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
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        seradataSpacecraftDetailService.update(
            SeradataSpacecraftDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeradataSpacecraftDetailUpdateParams.DataMode.TEST)
                .name("name")
                .source("Bluestaq")
                .bodyId("SERADATASPACECRAFTDETAILS-ID")
                .additionalMissionsGroups("additionalMissionsGroups")
                .altitude(36036.6330576414)
                .annualInsuredDepreciationFactor(1.23)
                .annualInsuredDepreciationFactorEstimated(true)
                .apogee(1.23)
                .busId("BUS-ID")
                .capabilityLost(1.23)
                .capacityLost(1.23)
                .catalogNumber(1)
                .collisionRiskCm(1.43)
                .collisionRiskMm(1.33)
                .combinedCostEstimated(true)
                .combinedNewCost(1.23)
                .commercialLaunch(true)
                .constellation("GPS")
                .costEstimated(true)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cubesatDispenserType("cubesatDispenserType")
                .currentAge(5.898630136986301)
                .dateOfObservation(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .description("description")
                .designLife(231)
                .dryMass(1.23)
                .expectedLife(231)
                .geoPosition(-8.23)
                .idOnOrbit("503")
                .inclination(1.23)
                .insuranceLossesTotal(0.393)
                .insuranceNotes("Sample Notes")
                .insurancePremiumAtLaunch(1.23)
                .insurancePremiumAtLaunchEstimated(true)
                .insuredAtLaunch(true)
                .insuredValueAtLaunch(1.23)
                .insuredValueLaunchEstimated(true)
                .intlNumber("number")
                .lat(1.23)
                .launchArranger("launchArranger")
                .launchArrangerCountry("USA")
                .launchCharacteristic("Expendable")
                .launchCost(1.23)
                .launchCostEstimated(true)
                .launchCountry("USA")
                .launchDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .launchDateRemarks("launchDateRemarks")
                .launchId("11573")
                .launchMass(1.23)
                .launchNotes("Sample Notes")
                .launchNumber("FN040")
                .launchProvider("launchProvider")
                .launchProviderCountry("USA")
                .launchProviderFlightNumber("launchProviderFlightNumber")
                .launchSiteId("28")
                .launchSiteName("launchSiteName")
                .launchType("Future")
                .launchVehicleId("123")
                .leased(true)
                .lifeLost(1.23)
                .lon(1.23)
                .massCategory("2500 - 3500kg  - Large Satellite")
                .nameAtLaunch("nameAtLaunch")
                .newCost(1.23)
                .notes("Sample Notes")
                .numHumans(1)
                .operator("operator")
                .operatorCountry("USA")
                .orbitCategory("GEO")
                .orbitSubCategory("Geostationary")
                .orderDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .owner("owner")
                .ownerCountry("USA")
                .perigee(1.23)
                .period(1.23)
                .primaryMissionGroup("primaryMissionGroup")
                .primeManufacturerOrgId("05c43360-382e-4aa2-b875-ed28945ff2e5")
                .programName("programName")
                .quantity(1)
                .reusableFlights("reusableFlights")
                .reusedHullName("reusedHullName")
                .sector("Commercial")
                .serialNumber("serialNumber")
                .stabilizer("3-Axis")
                .status("Inactive - Retired")
                .totalClaims(1)
                .totalFatalities(1)
                .totalInjuries(1)
                .totalPayloadPower(1.23)
                .youtubeLaunchLink("youtubeLaunchLink")
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
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        val page = seradataSpacecraftDetailService.list()

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
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        seradataSpacecraftDetailService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        seradataSpacecraftDetailService.count(
            SeradataSpacecraftDetailCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        val seradataSpacecraftDetail =
            seradataSpacecraftDetailService.get(
                SeradataSpacecraftDetailGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        seradataSpacecraftDetail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        val response = seradataSpacecraftDetailService.queryhelp()

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
        val seradataSpacecraftDetailService = client.seradataSpacecraftDetails()

        val response =
            seradataSpacecraftDetailService.tuple(
                SeradataSpacecraftDetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
