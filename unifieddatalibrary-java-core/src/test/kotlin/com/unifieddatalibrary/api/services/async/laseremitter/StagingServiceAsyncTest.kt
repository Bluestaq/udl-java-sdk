// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.laseremitter

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateBulkParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingCreateParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingRetrieveParams
import com.unifieddatalibrary.api.models.laseremitter.staging.StagingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StagingServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingServiceAsync = client.laseremitter().staging()

        val future =
            stagingServiceAsync.create(
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
        val stagingServiceAsync = client.laseremitter().staging()

        val stagingFuture =
            stagingServiceAsync.retrieve(
                StagingRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val staging = stagingFuture.get()
        staging.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingServiceAsync = client.laseremitter().staging()

        val future =
            stagingServiceAsync.update(
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
        val stagingServiceAsync = client.laseremitter().staging()

        val pageFuture = stagingServiceAsync.list()

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
        val stagingServiceAsync = client.laseremitter().staging()

        val future = stagingServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingServiceAsync = client.laseremitter().staging()

        val future =
            stagingServiceAsync.createBulk(
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

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stagingServiceAsync = client.laseremitter().staging()

        val responseFuture = stagingServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }
}
