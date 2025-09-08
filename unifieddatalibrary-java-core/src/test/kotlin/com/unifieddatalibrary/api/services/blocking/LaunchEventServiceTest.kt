// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCountParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateBulkParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchEventServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventService = client.launchEvent()

        launchEventService.create(
            LaunchEventCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchEventCreateParams.DataMode.TEST)
                .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                .source("Bluestaq")
                .id("LAUNCHEVENT-ID")
                .beNumber("ENC-123")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("Example Declassification")
                .derivedFrom("Example source")
                .idOnOrbit("REF-ONORBIT-ID")
                .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                .launchFacilityName("Example launch facility name")
                .launchFailureCode("Example failure code")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .oSuffix("oSuffix")
                .satNo(12)
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
        val launchEventService = client.launchEvent()

        val page =
            launchEventService.list(
                LaunchEventListParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val launchEventService = client.launchEvent()

        launchEventService.count(
            LaunchEventCountParams.builder()
                .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
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
        val launchEventService = client.launchEvent()

        launchEventService.createBulk(
            LaunchEventCreateBulkParams.builder()
                .addBody(
                    LaunchEventCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                        .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .source("Bluestaq")
                        .id("LAUNCHEVENT-ID")
                        .beNumber("ENC-123")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                        .declassificationString("Example Declassification")
                        .derivedFrom("Example source")
                        .idOnOrbit("REF-ONORBIT-ID")
                        .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .launchFacilityName("Example launch facility name")
                        .launchFailureCode("Example failure code")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .oSuffix("oSuffix")
                        .satNo(12)
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
        val launchEventService = client.launchEvent()

        val launchEvent =
            launchEventService.get(
                LaunchEventGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        launchEvent.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventService = client.launchEvent()

        val response = launchEventService.queryhelp()

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
        val launchEventService = client.launchEvent()

        val response =
            launchEventService.tuple(
                LaunchEventTupleParams.builder()
                    .columns("columns")
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val launchEventService = client.launchEvent()

        launchEventService.unvalidatedPublish(
            LaunchEventUnvalidatedPublishParams.builder()
                .addBody(
                    LaunchEventUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(LaunchEventUnvalidatedPublishParams.Body.DataMode.TEST)
                        .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .source("Bluestaq")
                        .id("LAUNCHEVENT-ID")
                        .beNumber("ENC-123")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                        .declassificationString("Example Declassification")
                        .derivedFrom("Example source")
                        .idOnOrbit("REF-ONORBIT-ID")
                        .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .launchFacilityName("Example launch facility name")
                        .launchFailureCode("Example failure code")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .oSuffix("oSuffix")
                        .satNo(12)
                        .build()
                )
                .build()
        )
    }
}
