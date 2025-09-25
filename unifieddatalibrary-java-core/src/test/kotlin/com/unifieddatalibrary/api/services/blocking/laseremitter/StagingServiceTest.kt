// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.laseremitter

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateBulkParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingRetrieveParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StagingServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingService = client.laseremitter().staging()

        stagingService.create(
            StagingCreateParams.builder()
                .classificationMarking("U")
                .laserName("LASER_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(1.57543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .laserType("PULSED")
                .lat(48.6732)
                .locationCountry("US")
                .lon(22.8455)
                .ownerCountry("US")
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
        val stagingService = client.laseremitter().staging()

        val staging =
            stagingService.retrieve(
                StagingRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        staging.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingService = client.laseremitter().staging()

        stagingService.update(
            StagingUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .laserName("LASER_NAME")
                .source("Bluestaq")
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(1.57543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .laserType("PULSED")
                .lat(48.6732)
                .locationCountry("US")
                .lon(22.8455)
                .ownerCountry("US")
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
        val stagingService = client.laseremitter().staging()

        val page = stagingService.list()

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
        val stagingService = client.laseremitter().staging()

        stagingService.delete("id")
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingService = client.laseremitter().staging()

        stagingService.createBulk(
            StagingCreateBulkParams.builder()
                .addBody(
                    StagingCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .laserName("LASER_NAME")
                        .source("Bluestaq")
                        .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                        .altitude(1.57543)
                        .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                        .createdBy("some.user")
                        .laserType("PULSED")
                        .lat(48.6732)
                        .locationCountry("US")
                        .lon(22.8455)
                        .ownerCountry("US")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingService = client.laseremitter().staging()

        val response = stagingService.queryhelp()

        response.validate()
    }
}
