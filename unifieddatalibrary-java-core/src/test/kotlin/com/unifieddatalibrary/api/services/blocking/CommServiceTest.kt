// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.comm.CommAbridged
import com.unifieddatalibrary.api.models.comm.CommCountParams
import com.unifieddatalibrary.api.models.comm.CommCreateParams
import com.unifieddatalibrary.api.models.comm.CommRetrieveParams
import com.unifieddatalibrary.api.models.comm.CommTupleParams
import com.unifieddatalibrary.api.models.comm.CommUpdateParams
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val commService = client.comm()

        commService.create(
            CommCreateParams.builder()
                .classificationMarking("U")
                .dataMode(CommCreateParams.DataMode.TEST)
                .name("DSCS II C-7-COMM Payload")
                .source("Bluestaq")
                .id("COMM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Description for comm A")
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
                .idEntity("ENTITY-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
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
        val commService = client.comm()

        val commFull =
            commService.retrieve(
                CommRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        commFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val commService = client.comm()

        commService.update(
            CommUpdateParams.builder()
                .pathId("id")
                .commAbridged(
                    CommAbridged.builder()
                        .classificationMarking("U")
                        .dataMode(CommAbridged.DataMode.TEST)
                        .name("DSCS II C-7-COMM Payload")
                        .source("Bluestaq")
                        .id("COMM-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .description("Description for comm A")
                        .idEntity("ENTITY-ID")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
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
        val commService = client.comm()

        val page = commService.list()

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
        val commService = client.comm()

        commService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val commService = client.comm()

        commService.count(CommCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val commService = client.comm()

        val response = commService.queryhelp()

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
        val commService = client.comm()

        val commFulls =
            commService.tuple(
                CommTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        commFulls.forEach { it.validate() }
    }
}
