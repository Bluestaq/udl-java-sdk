// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.location.LocationIngest
import com.unifieddatalibrary.api.models.vessel.VesselCountParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateBulkParams
import com.unifieddatalibrary.api.models.vessel.VesselCreateParams
import com.unifieddatalibrary.api.models.vessel.VesselGetParams
import com.unifieddatalibrary.api.models.vessel.VesselTupleParams
import com.unifieddatalibrary.api.models.vessel.VesselUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VesselServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val vesselService = client.vessel()

        vesselService.create(
            VesselCreateParams.builder()
                .classificationMarking("U")
                .dataMode(VesselCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altVesselId("590b5194fc32e75dd00682ba")
                .callsign("V2OZ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
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
                .firstSeen(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .hullNum("A30081")
                .idEntity("ENTITY-ID")
                .idOrganization("0147f777-w09a-835f-85aa-0a07a730fgg0")
                .imon(9566356)
                .length(511.1)
                .maxDraught(21.1)
                .maxSpeed(32.5)
                .mmsi("416450000")
                .numBlades(4)
                .numShafts(3)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .propType("Diesel")
                .sconum("B45524")
                .status("In Service/Commission")
                .sternType("Cruiser")
                .vesselBuilder("Samsung Heavy Inds - Geoje")
                .vesselClass("Nimitz")
                .vesselDescription("Search and Rescue Vessel")
                .vesselFlag("United States")
                .vesselName("DORNUM")
                .vesselType("Passenger")
                .vslWt(3423.76)
                .width(24.1)
                .yearBuilt("2014")
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
        val vesselService = client.vessel()

        vesselService.update(
            VesselUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(VesselUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altVesselId("590b5194fc32e75dd00682ba")
                .callsign("V2OZ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
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
                .firstSeen(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .hullNum("A30081")
                .idEntity("ENTITY-ID")
                .idOrganization("0147f777-w09a-835f-85aa-0a07a730fgg0")
                .imon(9566356)
                .length(511.1)
                .maxDraught(21.1)
                .maxSpeed(32.5)
                .mmsi("416450000")
                .numBlades(4)
                .numShafts(3)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .propType("Diesel")
                .sconum("B45524")
                .status("In Service/Commission")
                .sternType("Cruiser")
                .vesselBuilder("Samsung Heavy Inds - Geoje")
                .vesselClass("Nimitz")
                .vesselDescription("Search and Rescue Vessel")
                .vesselFlag("United States")
                .vesselName("DORNUM")
                .vesselType("Passenger")
                .vslWt(3423.76)
                .width(24.1)
                .yearBuilt("2014")
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
        val vesselService = client.vessel()

        val page = vesselService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val vesselService = client.vessel()

        vesselService.count(VesselCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val vesselService = client.vessel()

        vesselService.createBulk(
            VesselCreateBulkParams.builder()
                .addBody(
                    VesselCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(VesselCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                        .altVesselId("590b5194fc32e75dd00682ba")
                        .callsign("V2OZ")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
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
                        .firstSeen(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .hullNum("A30081")
                        .idEntity("ENTITY-ID")
                        .idOrganization("0147f777-w09a-835f-85aa-0a07a730fgg0")
                        .imon(9566356)
                        .length(511.1)
                        .maxDraught(21.1)
                        .maxSpeed(32.5)
                        .mmsi("416450000")
                        .numBlades(4)
                        .numShafts(3)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .propType("Diesel")
                        .sconum("B45524")
                        .status("In Service/Commission")
                        .sternType("Cruiser")
                        .vesselBuilder("Samsung Heavy Inds - Geoje")
                        .vesselClass("Nimitz")
                        .vesselDescription("Search and Rescue Vessel")
                        .vesselFlag("United States")
                        .vesselName("DORNUM")
                        .vesselType("Passenger")
                        .vslWt(3423.76)
                        .width(24.1)
                        .yearBuilt("2014")
                        .build()
                )
                .build()
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
        val vesselService = client.vessel()

        val vessel =
            vesselService.get(
                VesselGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        vessel.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val vesselService = client.vessel()

        val response = vesselService.queryhelp()

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
        val vesselService = client.vessel()

        val response =
            vesselService.tuple(
                VesselTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
