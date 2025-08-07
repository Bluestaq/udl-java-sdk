// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.routestats.RouteStatCountParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateBulkParams
import com.unifieddatalibrary.api.models.routestats.RouteStatCreateParams
import com.unifieddatalibrary.api.models.routestats.RouteStatQueryParams
import com.unifieddatalibrary.api.models.routestats.RouteStatRetrieveParams
import com.unifieddatalibrary.api.models.routestats.RouteStatTupleParams
import com.unifieddatalibrary.api.models.routestats.RouteStatUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.routestats.RouteStatUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RouteStatServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.create(
            RouteStatCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RouteStatCreateParams.DataMode.TEST)
                .locationEnd("KCOS")
                .locationStart("KDEN")
                .source("Bluestaq")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .avgDuration(47.1)
                .avgSpeed(450.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataPtsUsed(6)
                .distance(63.1)
                .distUnit("Nautical miles")
                .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .idealDesc("Block speed using great circle path")
                .idealDuration(45.1)
                .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                .locationType("ICAO")
                .maxDuration(52.1)
                .maxSpeed(470.1)
                .minDuration(42.1)
                .minSpeed(420.1)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partialDesc("Performance speed using great circle path")
                .partialDuration(38.1)
                .sourceDl("AXE")
                .speedUnit("knots")
                .timePeriod("Q1")
                .vehicleCategory("AIRCRAFT")
                .vehicleType("C-17")
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
        val routeStatService = client.routeStats()

        val routeStat =
            routeStatService.retrieve(
                RouteStatRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        routeStat.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.update(
            RouteStatUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RouteStatUpdateParams.DataMode.TEST)
                .locationEnd("KCOS")
                .locationStart("KDEN")
                .source("Bluestaq")
                .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .avgDuration(47.1)
                .avgSpeed(450.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataPtsUsed(6)
                .distance(63.1)
                .distUnit("Nautical miles")
                .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .idealDesc("Block speed using great circle path")
                .idealDuration(45.1)
                .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                .locationType("ICAO")
                .maxDuration(52.1)
                .maxSpeed(470.1)
                .minDuration(42.1)
                .minSpeed(420.1)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partialDesc("Performance speed using great circle path")
                .partialDuration(38.1)
                .sourceDl("AXE")
                .speedUnit("knots")
                .timePeriod("Q1")
                .vehicleCategory("AIRCRAFT")
                .vehicleType("C-17")
                .build()
        )
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.count(
            RouteStatCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.createBulk(
            RouteStatCreateBulkParams.builder()
                .addBody(
                    RouteStatCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                        .locationEnd("KCOS")
                        .locationStart("KDEN")
                        .source("Bluestaq")
                        .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                        .avgDuration(47.1)
                        .avgSpeed(450.1)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dataPtsUsed(6)
                        .distance(63.1)
                        .distUnit("Nautical miles")
                        .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .idealDesc("Block speed using great circle path")
                        .idealDuration(45.1)
                        .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                        .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                        .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                        .locationType("ICAO")
                        .maxDuration(52.1)
                        .maxSpeed(470.1)
                        .minDuration(42.1)
                        .minSpeed(420.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .partialDesc("Performance speed using great circle path")
                        .partialDuration(38.1)
                        .sourceDl("AXE")
                        .speedUnit("knots")
                        .timePeriod("Q1")
                        .vehicleCategory("AIRCRAFT")
                        .vehicleType("C-17")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun query() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        val response =
            routeStatService.query(
                RouteStatQueryParams.builder().firstResult(0L).maxResults(0L).build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        val response = routeStatService.queryHelp()

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
        val routeStatService = client.routeStats()

        val response =
            routeStatService.tuple(
                RouteStatTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val routeStatService = client.routeStats()

        routeStatService.unvalidatedPublish(
            RouteStatUnvalidatedPublishParams.builder()
                .addBody(
                    RouteStatUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(RouteStatUnvalidatedPublishParams.Body.DataMode.TEST)
                        .locationEnd("KCOS")
                        .locationStart("KDEN")
                        .source("Bluestaq")
                        .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                        .avgDuration(47.1)
                        .avgSpeed(450.1)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dataPtsUsed(6)
                        .distance(63.1)
                        .distUnit("Nautical miles")
                        .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .idealDesc("Block speed using great circle path")
                        .idealDuration(45.1)
                        .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                        .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                        .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                        .locationType("ICAO")
                        .maxDuration(52.1)
                        .maxSpeed(470.1)
                        .minDuration(42.1)
                        .minSpeed(420.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .partialDesc("Performance speed using great circle path")
                        .partialDuration(38.1)
                        .sourceDl("AXE")
                        .speedUnit("knots")
                        .timePeriod("Q1")
                        .vehicleCategory("AIRCRAFT")
                        .vehicleType("C-17")
                        .build()
                )
                .build()
        )
    }
}
