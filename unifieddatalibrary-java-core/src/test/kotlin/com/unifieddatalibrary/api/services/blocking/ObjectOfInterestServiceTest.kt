// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCountParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestCreateParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestGetParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestTupleParams
import com.unifieddatalibrary.api.models.objectofinterest.ObjectOfInterestUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ObjectOfInterestServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val objectOfInterestService = client.objectOfInterest()

        objectOfInterestService.create(
            ObjectOfInterestCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ObjectOfInterestCreateParams.DataMode.TEST)
                .idOnOrbit("REF-ONORBIT-ID")
                .sensorTaskingStartTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .source("Bluestaq")
                .statusDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .id("OBJECTOFINTEREST-ID")
                .addAffectedObject("AFFECTEDOBJECT1-ID")
                .addAffectedObject("AFFECTEDOBJECT2-ID")
                .apogee(123.4)
                .argOfPerigee(123.4)
                .bStar(123.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaTs(listOf(1.1, 2.2, 3.3))
                .deltaVs(listOf(1.1, 2.2, 3.3))
                .description("Example description")
                .eccentricity(123.4)
                .elsetEpoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .inclination(123.4)
                .lastObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .meanAnomaly(123.4)
                .meanMotion(123.4)
                .meanMotionDDot(123.4)
                .meanMotionDot(123.4)
                .missedObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .name("Example_name")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .perigee(123.4)
                .period(123.4)
                .priority(7)
                .raan(123.4)
                .revNo(123)
                .satNo(12)
                .semiMajorAxis(123.4)
                .sensorTaskingStopTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .status("OPEN")
                .svEpoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .x(123.4)
                .xvel(123.4)
                .y(123.4)
                .yvel(123.4)
                .z(123.4)
                .zvel(123.4)
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
        val objectOfInterestService = client.objectOfInterest()

        objectOfInterestService.update(
            ObjectOfInterestUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ObjectOfInterestUpdateParams.DataMode.TEST)
                .idOnOrbit("REF-ONORBIT-ID")
                .sensorTaskingStartTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .source("Bluestaq")
                .statusDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .bodyId("OBJECTOFINTEREST-ID")
                .addAffectedObject("AFFECTEDOBJECT1-ID")
                .addAffectedObject("AFFECTEDOBJECT2-ID")
                .apogee(123.4)
                .argOfPerigee(123.4)
                .bStar(123.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaTs(listOf(1.1, 2.2, 3.3))
                .deltaVs(listOf(1.1, 2.2, 3.3))
                .description("Example description")
                .eccentricity(123.4)
                .elsetEpoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .inclination(123.4)
                .lastObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .meanAnomaly(123.4)
                .meanMotion(123.4)
                .meanMotionDDot(123.4)
                .meanMotionDot(123.4)
                .missedObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .name("Example_name")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .perigee(123.4)
                .period(123.4)
                .priority(7)
                .raan(123.4)
                .revNo(123)
                .satNo(12)
                .semiMajorAxis(123.4)
                .sensorTaskingStopTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .status("OPEN")
                .svEpoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .x(123.4)
                .xvel(123.4)
                .y(123.4)
                .yvel(123.4)
                .z(123.4)
                .zvel(123.4)
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
        val objectOfInterestService = client.objectOfInterest()

        val page = objectOfInterestService.list()

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
        val objectOfInterestService = client.objectOfInterest()

        objectOfInterestService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val objectOfInterestService = client.objectOfInterest()

        objectOfInterestService.count(
            ObjectOfInterestCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val objectOfInterestService = client.objectOfInterest()

        val objectOfInterest =
            objectOfInterestService.get(
                ObjectOfInterestGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        objectOfInterest.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val objectOfInterestService = client.objectOfInterest()

        val response = objectOfInterestService.queryhelp()

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
        val objectOfInterestService = client.objectOfInterest()

        val response =
            objectOfInterestService.tuple(
                ObjectOfInterestTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
