// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.location.LocationIngest
import com.unifieddatalibrary.api.models.scientific.ScientificCountParams
import com.unifieddatalibrary.api.models.scientific.ScientificCreateParams
import com.unifieddatalibrary.api.models.scientific.ScientificGetParams
import com.unifieddatalibrary.api.models.scientific.ScientificTupleParams
import com.unifieddatalibrary.api.models.scientific.ScientificUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScientificServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scientificService = client.scientific()

        scientificService.create(
            ScientificCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ScientificCreateParams.DataMode.TEST)
                .name("SEM/MAG")
                .source("Bluestaq")
                .spacecraftId("REF-SPACECRAFT-ID")
                .id("SCIENTIFIC-ID")
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
                .frequencyBand("Gamma")
                .hostedForCompanyOrgId("REF-HOSTEDFORCOMPANYORG-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .manufacturerOrgId("REF-MANUFACTURERORG-ID")
                .notes("NOTES")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .payloadCategory("Sensor")
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
        val scientificService = client.scientific()

        scientificService.update(
            ScientificUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ScientificUpdateParams.DataMode.TEST)
                .name("SEM/MAG")
                .source("Bluestaq")
                .spacecraftId("REF-SPACECRAFT-ID")
                .bodyId("SCIENTIFIC-ID")
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
                .frequencyBand("Gamma")
                .hostedForCompanyOrgId("REF-HOSTEDFORCOMPANYORG-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .manufacturerOrgId("REF-MANUFACTURERORG-ID")
                .notes("NOTES")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .payloadCategory("Sensor")
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
        val scientificService = client.scientific()

        val page = scientificService.list()

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
        val scientificService = client.scientific()

        scientificService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scientificService = client.scientific()

        scientificService.count(
            ScientificCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val scientificService = client.scientific()

        val scientific =
            scientificService.get(
                ScientificGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        scientific.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scientificService = client.scientific()

        val response = scientificService.queryhelp()

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
        val scientificService = client.scientific()

        val response =
            scientificService.tuple(
                ScientificTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
