// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCountParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateBulkParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusCreateParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusGetParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusListParams
import com.unifieddatalibrary.api.models.geostatus.GeoStatusTupleParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeoStatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusService = client.geoStatus()

        geoStatusService.create(
            GeoStatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GeoStatusCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("GEOSTATUS-ID")
                .confidenceLevel("Low")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("REF-ONORBIT-ID")
                .longitudeMax(1.01)
                .longitudeMin(180.1)
                .longitudeRate(1.1)
                .lostFlag(false)
                .objectStatus("Active")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .planeChangeStatus("Current")
                .rawFileUri("Example URI")
                .relativeEnergy(1.1)
                .satNo(21)
                .sc(1.1)
                .semiAnnualCorrFlag(false)
                .ss(1.1)
                .troughType("West")
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
        val geoStatusService = client.geoStatus()

        val page =
            geoStatusService.list(
                GeoStatusListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
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
        val geoStatusService = client.geoStatus()

        geoStatusService.count(
            GeoStatusCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
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
        val geoStatusService = client.geoStatus()

        geoStatusService.createBulk(
            GeoStatusCreateBulkParams.builder()
                .addBody(
                    GeoStatusCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .id("GEOSTATUS-ID")
                        .confidenceLevel("Low")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idOnOrbit("REF-ONORBIT-ID")
                        .longitudeMax(1.01)
                        .longitudeMin(180.1)
                        .longitudeRate(1.1)
                        .lostFlag(false)
                        .objectStatus("Active")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .planeChangeStatus("Current")
                        .rawFileUri("Example URI")
                        .relativeEnergy(1.1)
                        .satNo(21)
                        .sc(1.1)
                        .semiAnnualCorrFlag(false)
                        .ss(1.1)
                        .troughType("West")
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
        val geoStatusService = client.geoStatus()

        val geoStatusFull =
            geoStatusService.get(
                GeoStatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        geoStatusFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusService = client.geoStatus()

        val response = geoStatusService.queryhelp()

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
        val geoStatusService = client.geoStatus()

        val geoStatusFulls =
            geoStatusService.tuple(
                GeoStatusTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        geoStatusFulls.forEach { it.validate() }
    }
}
