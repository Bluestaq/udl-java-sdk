// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.ir.IrCountParams
import com.unifieddatalibrary.api.models.ir.IrCreateParams
import com.unifieddatalibrary.api.models.ir.IrGetParams
import com.unifieddatalibrary.api.models.ir.IrTupleParams
import com.unifieddatalibrary.api.models.ir.IrUpdateParams
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IrServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val irServiceAsync = client.ir()

        val future =
            irServiceAsync.create(
                IrCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(IrCreateParams.DataMode.TEST)
                    .name("Example name")
                    .source("Bluestaq")
                    .id("IR-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Example description")
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
                    .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val irServiceAsync = client.ir()

        val future =
            irServiceAsync.update(
                IrUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(IrUpdateParams.DataMode.TEST)
                    .name("Example name")
                    .source("Bluestaq")
                    .bodyId("IR-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Example description")
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
                    .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
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
        val irServiceAsync = client.ir()

        val pageFuture = irServiceAsync.list()

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
        val irServiceAsync = client.ir()

        val future = irServiceAsync.delete("id")

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
        val irServiceAsync = client.ir()

        val responseFuture =
            irServiceAsync.count(IrCountParams.builder().firstResult(0L).maxResults(0L).build())

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val irServiceAsync = client.ir()

        val irFuture =
            irServiceAsync.get(
                IrGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val ir = irFuture.get()
        ir.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val irServiceAsync = client.ir()

        val responseFuture = irServiceAsync.queryhelp()

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
        val irServiceAsync = client.ir()

        val responseFuture =
            irServiceAsync.tuple(
                IrTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
