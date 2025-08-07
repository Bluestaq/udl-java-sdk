// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class GeoStatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusServiceAsync = client.geoStatus()

        val future =
            geoStatusServiceAsync.create(
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
                    .origNetwork("ORIG")
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
        val geoStatusServiceAsync = client.geoStatus()

        val pageFuture =
            geoStatusServiceAsync.list(
                GeoStatusListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusServiceAsync = client.geoStatus()

        val responseFuture =
            geoStatusServiceAsync.count(
                GeoStatusCountParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusServiceAsync = client.geoStatus()

        val future =
            geoStatusServiceAsync.createBulk(
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
                            .origNetwork("ORIG")
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

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusServiceAsync = client.geoStatus()

        val geoStatusFullFuture =
            geoStatusServiceAsync.get(
                GeoStatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val geoStatusFull = geoStatusFullFuture.get()
        geoStatusFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val geoStatusServiceAsync = client.geoStatus()

        val responseFuture = geoStatusServiceAsync.queryhelp()

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
        val geoStatusServiceAsync = client.geoStatus()

        val geoStatusFullsFuture =
            geoStatusServiceAsync.tuple(
                GeoStatusTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val geoStatusFulls = geoStatusFullsFuture.get()
        geoStatusFulls.forEach { it.validate() }
    }
}
