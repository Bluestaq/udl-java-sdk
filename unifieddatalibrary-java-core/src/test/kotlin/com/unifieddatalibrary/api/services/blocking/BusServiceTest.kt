// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.buses.BusCountParams
import com.unifieddatalibrary.api.models.buses.BusCreateParams
import com.unifieddatalibrary.api.models.buses.BusRetrieveParams
import com.unifieddatalibrary.api.models.buses.BusTupleParams
import com.unifieddatalibrary.api.models.buses.BusUpdateParams
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val busService = client.buses()

        busService.create(
            BusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(BusCreateParams.DataMode.TEST)
                .name("Example name")
                .source("Bluestaq")
                .id("BUS-ID")
                .aocsNotes("Example notes")
                .avgDryMass(2879.1)
                .avgPayloadMass(10.1)
                .avgPayloadPower(10.1)
                .avgSpacecraftPower(10.1)
                .avgWetMass(5246.1)
                .bodyDimensionX(10.1)
                .bodyDimensionY(10.1)
                .bodyDimensionZ(10.1)
                .busKitDesignerOrgId("BUSKITDESIGNERORG-ID")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Dedicated small spacecraft bus.")
                .entity(
                    EntityIngest.builder()
                        .classificationMarking("U")
                        .dataMode(EntityIngest.DataMode.TEST)
                        .name("Example name")
                        .source("Bluestaq")
                        .type(EntityIngest.Type.ONORBIT)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idEntity("ENTITY-ID")
                        .idLocation("LOCATION-ID")
                        .idOnOrbit("ONORBIT-ID")
                        .idOperatingUnit("OPERATINGUNIT-ID")
                        .location(
                            LocationIngest.builder()
                                .classificationMarking("U")
                                .dataMode(LocationIngest.DataMode.TEST)
                                .name("Example location")
                                .source("Bluestaq")
                                .altitude(10.23)
                                .countryCode("US")
                                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .createdBy("some.user")
                                .idLocation("LOCATION-ID")
                                .lat(45.23)
                                .lon(179.1)
                                .origin("THIRD_PARTY_DATASOURCE")
                                .origNetwork("OPS1")
                                .build()
                        )
                        .onOrbit(
                            EntityIngest.OnOrbit.builder()
                                .classificationMarking("U")
                                .dataMode(EntityIngest.OnOrbit.DataMode.TEST)
                                .satNo(1)
                                .source("Bluestaq")
                                .altName("Alternate Name")
                                .category(EntityIngest.OnOrbit.Category.LUNAR)
                                .commonName("Example common name")
                                .constellation("Big Dipper")
                                .countryCode("US")
                                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .createdBy("some.user")
                                .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .idOnOrbit("ONORBIT-ID")
                                .intlDes("2021123ABC")
                                .launchDate(LocalDate.parse("2018-01-01"))
                                .launchSiteId("LAUNCHSITE-ID")
                                .lifetimeYears(10)
                                .missionNumber("Expedition 1")
                                .objectType(EntityIngest.OnOrbit.ObjectType.PAYLOAD)
                                .origin("THIRD_PARTY_DATASOURCE")
                                .origNetwork("OPS1")
                                .build()
                        )
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ownerType(EntityIngest.OwnerType.COMMERCIAL)
                        .taskable(false)
                        .addUrl("URL1")
                        .addUrl("URL2")
                        .build()
                )
                .generic(false)
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .launchEnvelopeDimensionX(10.1)
                .launchEnvelopeDimensionY(10.1)
                .launchEnvelopeDimensionZ(10.1)
                .mainComputerManufacturerOrgId("MAINCOMPUTERMANUFACTURERORG-ID")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .massCategory("Nanosatellite")
                .maxBolPowerLower(10.1)
                .maxBolPowerUpper(10.1)
                .maxBolStationMass(10.1)
                .maxDryMass(2900.1)
                .maxEolPowerLower(10.1)
                .maxEolPowerUpper(10.1)
                .maxLaunchMassLower(10.1)
                .maxLaunchMassUpper(10.1)
                .maxPayloadMass(10.1)
                .maxPayloadPower(10.1)
                .maxSpacecraftPower(10.1)
                .maxWetMass(5300.0)
                .medianDryMass(2950.1)
                .medianWetMass(5260.1)
                .minDryMass(2858.1)
                .minWetMass(5192.1)
                .numOrbitType(3)
                .oapPayloadPower(10.1)
                .oapSpacecraftPower(10.1)
                .orbitTypes(listOf("LEO", "HEO", "GEO"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .payloadDimensionX(1.1)
                .payloadDimensionY(1.1)
                .payloadDimensionZ(1.1)
                .payloadVolume(1.1)
                .powerCategory("low power")
                .telemetryTrackingManufacturerOrgId("TELEMETRYTRACKINGMANUFACTURERORG-ID")
                .type("Example type")
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val busService = client.buses()

        val busFull =
            busService.retrieve(
                BusRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        busFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val busService = client.buses()

        busService.update(
            BusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(BusUpdateParams.DataMode.TEST)
                .name("Example name")
                .source("Bluestaq")
                .bodyId("BUS-ID")
                .aocsNotes("Example notes")
                .avgDryMass(2879.1)
                .avgPayloadMass(10.1)
                .avgPayloadPower(10.1)
                .avgSpacecraftPower(10.1)
                .avgWetMass(5246.1)
                .bodyDimensionX(10.1)
                .bodyDimensionY(10.1)
                .bodyDimensionZ(10.1)
                .busKitDesignerOrgId("BUSKITDESIGNERORG-ID")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Dedicated small spacecraft bus.")
                .entity(
                    EntityIngest.builder()
                        .classificationMarking("U")
                        .dataMode(EntityIngest.DataMode.TEST)
                        .name("Example name")
                        .source("Bluestaq")
                        .type(EntityIngest.Type.ONORBIT)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idEntity("ENTITY-ID")
                        .idLocation("LOCATION-ID")
                        .idOnOrbit("ONORBIT-ID")
                        .idOperatingUnit("OPERATINGUNIT-ID")
                        .location(
                            LocationIngest.builder()
                                .classificationMarking("U")
                                .dataMode(LocationIngest.DataMode.TEST)
                                .name("Example location")
                                .source("Bluestaq")
                                .altitude(10.23)
                                .countryCode("US")
                                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .createdBy("some.user")
                                .idLocation("LOCATION-ID")
                                .lat(45.23)
                                .lon(179.1)
                                .origin("THIRD_PARTY_DATASOURCE")
                                .origNetwork("OPS1")
                                .build()
                        )
                        .onOrbit(
                            EntityIngest.OnOrbit.builder()
                                .classificationMarking("U")
                                .dataMode(EntityIngest.OnOrbit.DataMode.TEST)
                                .satNo(1)
                                .source("Bluestaq")
                                .altName("Alternate Name")
                                .category(EntityIngest.OnOrbit.Category.LUNAR)
                                .commonName("Example common name")
                                .constellation("Big Dipper")
                                .countryCode("US")
                                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .createdBy("some.user")
                                .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                .idOnOrbit("ONORBIT-ID")
                                .intlDes("2021123ABC")
                                .launchDate(LocalDate.parse("2018-01-01"))
                                .launchSiteId("LAUNCHSITE-ID")
                                .lifetimeYears(10)
                                .missionNumber("Expedition 1")
                                .objectType(EntityIngest.OnOrbit.ObjectType.PAYLOAD)
                                .origin("THIRD_PARTY_DATASOURCE")
                                .origNetwork("OPS1")
                                .build()
                        )
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ownerType(EntityIngest.OwnerType.COMMERCIAL)
                        .taskable(false)
                        .addUrl("URL1")
                        .addUrl("URL2")
                        .build()
                )
                .generic(false)
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .launchEnvelopeDimensionX(10.1)
                .launchEnvelopeDimensionY(10.1)
                .launchEnvelopeDimensionZ(10.1)
                .mainComputerManufacturerOrgId("MAINCOMPUTERMANUFACTURERORG-ID")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .massCategory("Nanosatellite")
                .maxBolPowerLower(10.1)
                .maxBolPowerUpper(10.1)
                .maxBolStationMass(10.1)
                .maxDryMass(2900.1)
                .maxEolPowerLower(10.1)
                .maxEolPowerUpper(10.1)
                .maxLaunchMassLower(10.1)
                .maxLaunchMassUpper(10.1)
                .maxPayloadMass(10.1)
                .maxPayloadPower(10.1)
                .maxSpacecraftPower(10.1)
                .maxWetMass(5300.0)
                .medianDryMass(2950.1)
                .medianWetMass(5260.1)
                .minDryMass(2858.1)
                .minWetMass(5192.1)
                .numOrbitType(3)
                .oapPayloadPower(10.1)
                .oapSpacecraftPower(10.1)
                .orbitTypes(listOf("LEO", "HEO", "GEO"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .payloadDimensionX(1.1)
                .payloadDimensionY(1.1)
                .payloadDimensionZ(1.1)
                .payloadVolume(1.1)
                .powerCategory("low power")
                .telemetryTrackingManufacturerOrgId("TELEMETRYTRACKINGMANUFACTURERORG-ID")
                .type("Example type")
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
        val busService = client.buses()

        val page = busService.list()

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
        val busService = client.buses()

        busService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val busService = client.buses()

        busService.count(BusCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val busService = client.buses()

        val response = busService.queryHelp()

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
        val busService = client.buses()

        val busFulls =
            busService.tuple(
                BusTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        busFulls.forEach { it.validate() }
    }
}
