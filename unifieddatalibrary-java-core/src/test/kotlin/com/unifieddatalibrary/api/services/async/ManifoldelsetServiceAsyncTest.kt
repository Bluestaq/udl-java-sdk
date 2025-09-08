// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCountParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateBulkParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleParams
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManifoldelsetServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldelsetServiceAsync = client.manifoldelset()

        val future =
            manifoldelsetServiceAsync.create(
                ManifoldelsetCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(ManifoldelsetCreateParams.DataMode.TEST)
                    .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .idManifold("REF-MANIFOLD-ID")
                    .source("Bluestaq")
                    .tmpSatNo(10)
                    .id("MANIFOLDELSET-ID")
                    .apogee(10.23)
                    .argOfPerigee(10.23)
                    .bStar(10.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eccentricity(0.5)
                    .inclination(90.23)
                    .line1("line1")
                    .line2("line2")
                    .meanAnomaly(10.23)
                    .meanMotion(10.23)
                    .meanMotionDDot(10.23)
                    .meanMotionDot(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .perigee(10.23)
                    .period(10.23)
                    .raan(10.23)
                    .revNo(123)
                    .semiMajorAxis(10.23)
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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val future =
            manifoldelsetServiceAsync.update(
                ManifoldelsetUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(ManifoldelsetUpdateParams.DataMode.TEST)
                    .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .idManifold("REF-MANIFOLD-ID")
                    .source("Bluestaq")
                    .tmpSatNo(10)
                    .bodyId("MANIFOLDELSET-ID")
                    .apogee(10.23)
                    .argOfPerigee(10.23)
                    .bStar(10.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eccentricity(0.5)
                    .inclination(90.23)
                    .line1("line1")
                    .line2("line2")
                    .meanAnomaly(10.23)
                    .meanMotion(10.23)
                    .meanMotionDDot(10.23)
                    .meanMotionDot(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .perigee(10.23)
                    .period(10.23)
                    .raan(10.23)
                    .revNo(123)
                    .semiMajorAxis(10.23)
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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val pageFuture =
            manifoldelsetServiceAsync.list(
                ManifoldelsetListParams.builder()
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val future = manifoldelsetServiceAsync.delete("id")

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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val responseFuture =
            manifoldelsetServiceAsync.count(
                ManifoldelsetCountParams.builder()
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val future =
            manifoldelsetServiceAsync.createBulk(
                ManifoldelsetCreateBulkParams.builder()
                    .addBody(
                        ManifoldelsetCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
                            .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                            .idManifold("REF-MANIFOLD-ID")
                            .source("Bluestaq")
                            .tmpSatNo(10)
                            .id("MANIFOLDELSET-ID")
                            .apogee(10.23)
                            .argOfPerigee(10.23)
                            .bStar(10.23)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .eccentricity(0.5)
                            .inclination(90.23)
                            .line1("line1")
                            .line2("line2")
                            .meanAnomaly(10.23)
                            .meanMotion(10.23)
                            .meanMotionDDot(10.23)
                            .meanMotionDot(10.23)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .perigee(10.23)
                            .period(10.23)
                            .raan(10.23)
                            .revNo(123)
                            .semiMajorAxis(10.23)
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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val manifoldelsetFuture =
            manifoldelsetServiceAsync.get(
                ManifoldelsetGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val manifoldelset = manifoldelsetFuture.get()
        manifoldelset.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldelsetServiceAsync = client.manifoldelset()

        val responseFuture = manifoldelsetServiceAsync.queryhelp()

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
        val manifoldelsetServiceAsync = client.manifoldelset()

        val responseFuture =
            manifoldelsetServiceAsync.tuple(
                ManifoldelsetTupleParams.builder()
                    .columns("columns")
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
