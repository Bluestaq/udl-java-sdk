// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.location.LocationIngest
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCountParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterCreateParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterGetParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterTupleParams
import com.unifieddatalibrary.api.models.rfemitter.RfEmitterUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfEmitterServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterService = client.rfEmitter()

        rfEmitterService.create(
            RfEmitterCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterCreateParams.DataMode.TEST)
                .name("RF_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
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
                .extSysId("EXTSYS-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .subtype("BLOCK_1")
                .type("TYPE_OF_EMITTER")
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
        val rfEmitterService = client.rfEmitter()

        rfEmitterService.update(
            RfEmitterUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfEmitterUpdateParams.DataMode.TEST)
                .name("RF_NAME")
                .source("Bluestaq")
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
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
                .extSysId("EXTSYS-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .subtype("BLOCK_1")
                .type("TYPE_OF_EMITTER")
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
        val rfEmitterService = client.rfEmitter()

        val page = rfEmitterService.list()

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
        val rfEmitterService = client.rfEmitter()

        rfEmitterService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterService = client.rfEmitter()

        rfEmitterService.count(
            RfEmitterCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val rfEmitterService = client.rfEmitter()

        val rfEmitter =
            rfEmitterService.get(
                RfEmitterGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        rfEmitter.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterService = client.rfEmitter()

        val response = rfEmitterService.queryhelp()

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
        val rfEmitterService = client.rfEmitter()

        val response =
            rfEmitterService.tuple(
                RfEmitterTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
