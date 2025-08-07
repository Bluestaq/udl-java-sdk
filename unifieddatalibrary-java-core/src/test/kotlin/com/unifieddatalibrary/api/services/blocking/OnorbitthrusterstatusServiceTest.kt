// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCountParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusGetParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitthrusterstatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        onorbitthrusterstatusService.create(
            OnorbitthrusterstatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterstatusCreateParams.DataMode.TEST)
                .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
                .source("Bluestaq")
                .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .id("af103c-1f917dc-002c1bd")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .estDeltaV(10.1)
                .fuelMass(100.1)
                .fuelMassUnc(10.1)
                .isp(300.1)
                .maxDeltaV(100.1)
                .minDeltaV(0.1)
                .name("REA1")
                .operational(true)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .propMassAvg(907.6)
                .propMassMax(2333.3)
                .propMassMedian(200.1)
                .propMassMin(0.1)
                .thrustMax(22.1)
                .totalDeltaV(100.1)
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
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        val page = onorbitthrusterstatusService.list()

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
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        onorbitthrusterstatusService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        onorbitthrusterstatusService.count(
            OnorbitthrusterstatusCountParams.builder()
                .firstResult(0L)
                .idOnorbitThruster("idOnorbitThruster")
                .maxResults(0L)
                .statusTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        onorbitthrusterstatusService.createBulk(
            OnorbitthrusterstatusCreateBulkParams.builder()
                .addBody(
                    OnorbitthrusterstatusCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
                        .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
                        .source("Bluestaq")
                        .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .id("af103c-1f917dc-002c1bd")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .estDeltaV(10.1)
                        .fuelMass(100.1)
                        .fuelMassUnc(10.1)
                        .isp(300.1)
                        .maxDeltaV(100.1)
                        .minDeltaV(0.1)
                        .name("REA1")
                        .operational(true)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .propMassAvg(907.6)
                        .propMassMax(2333.3)
                        .propMassMedian(200.1)
                        .propMassMin(0.1)
                        .thrustMax(22.1)
                        .totalDeltaV(100.1)
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
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        val onorbitthrusterstatusFull =
            onorbitthrusterstatusService.get(
                OnorbitthrusterstatusGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        onorbitthrusterstatusFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        val response = onorbitthrusterstatusService.queryhelp()

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
        val onorbitthrusterstatusService = client.onorbitthrusterstatus()

        val onorbitthrusterstatusFulls =
            onorbitthrusterstatusService.tuple(
                OnorbitthrusterstatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .idOnorbitThruster("idOnorbitThruster")
                    .maxResults(0L)
                    .statusTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        onorbitthrusterstatusFulls.forEach { it.validate() }
    }
}
