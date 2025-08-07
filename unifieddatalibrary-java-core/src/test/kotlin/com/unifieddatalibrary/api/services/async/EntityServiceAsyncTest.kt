// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.entities.EntityCountParams
import com.unifieddatalibrary.api.models.entities.EntityCreateParams
import com.unifieddatalibrary.api.models.entities.EntityGetAllTypesParams
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.entities.EntityRetrieveParams
import com.unifieddatalibrary.api.models.entities.EntityTupleParams
import com.unifieddatalibrary.api.models.entities.EntityUpdateParams
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val future =
            entityServiceAsync.create(
                EntityCreateParams.builder()
                    .entityIngest(
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
        val entityServiceAsync = client.entities()

        val entityFullFuture =
            entityServiceAsync.retrieve(
                EntityRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val entityFull = entityFullFuture.get()
        entityFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val future =
            entityServiceAsync.update(
                EntityUpdateParams.builder()
                    .id("id")
                    .entityIngest(
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
        val entityServiceAsync = client.entities()

        val pageFuture = entityServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val future = entityServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val responseFuture =
            entityServiceAsync.count(
                EntityCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun getAllTypes() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val responseFuture =
            entityServiceAsync.getAllTypes(
                EntityGetAllTypesParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val entityServiceAsync = client.entities()

        val responseFuture = entityServiceAsync.queryHelp()

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
        val entityServiceAsync = client.entities()

        val entityFullsFuture =
            entityServiceAsync.tuple(
                EntityTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val entityFulls = entityFullsFuture.get()
        entityFulls.forEach { it.validate() }
    }
}
