// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.entities.EntityIngest
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCountParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterCreateParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterGetParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterTupleParams
import com.unifieddatalibrary.api.models.laseremitter.LaseremitterUpdateParams
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaseremitterServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laseremitterServiceAsync = client.laseremitter()

        val future =
            laseremitterServiceAsync.create(
                LaseremitterCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(LaseremitterCreateParams.DataMode.TEST)
                    .laserName("HEL")
                    .laserType("PULSED")
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .atmosphericTransmission(1.0)
                    .beamOutputPower(100.5)
                    .beamWaist(14.4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .divergence(2.5)
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
                    .isOperational(true)
                    .maxDuration(1.5)
                    .maxFocusRange(30000.5)
                    .minFocusRange(2500.5)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pulseFluence(1000005.5)
                    .pulsePeakPower(640.25)
                    .pulseRepFreq(2225.5)
                    .pulseShape("RECTANGULAR")
                    .pulseWidth(0.25)
                    .sourceDl("AXE")
                    .wavelength(0.11)
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
        val laseremitterServiceAsync = client.laseremitter()

        val future =
            laseremitterServiceAsync.update(
                LaseremitterUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(LaseremitterUpdateParams.DataMode.TEST)
                    .laserName("HEL")
                    .laserType("PULSED")
                    .source("Bluestaq")
                    .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
                    .atmosphericTransmission(1.0)
                    .beamOutputPower(100.5)
                    .beamWaist(14.4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .divergence(2.5)
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
                    .isOperational(true)
                    .maxDuration(1.5)
                    .maxFocusRange(30000.5)
                    .minFocusRange(2500.5)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pulseFluence(1000005.5)
                    .pulsePeakPower(640.25)
                    .pulseRepFreq(2225.5)
                    .pulseShape("RECTANGULAR")
                    .pulseWidth(0.25)
                    .sourceDl("AXE")
                    .wavelength(0.11)
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
        val laseremitterServiceAsync = client.laseremitter()

        val pageFuture = laseremitterServiceAsync.list()

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
        val laseremitterServiceAsync = client.laseremitter()

        val future = laseremitterServiceAsync.delete("id")

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
        val laseremitterServiceAsync = client.laseremitter()

        val responseFuture =
            laseremitterServiceAsync.count(
                LaseremitterCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

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
        val laseremitterServiceAsync = client.laseremitter()

        val laseremitterFuture =
            laseremitterServiceAsync.get(
                LaseremitterGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val laseremitter = laseremitterFuture.get()
        laseremitter.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laseremitterServiceAsync = client.laseremitter()

        val responseFuture = laseremitterServiceAsync.queryhelp()

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
        val laseremitterServiceAsync = client.laseremitter()

        val responseFuture =
            laseremitterServiceAsync.tuple(
                LaseremitterTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
