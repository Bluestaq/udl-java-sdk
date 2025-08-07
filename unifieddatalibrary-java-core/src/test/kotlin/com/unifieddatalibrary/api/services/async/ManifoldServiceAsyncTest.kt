// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.manifold.ManifoldCountParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateBulkParams
import com.unifieddatalibrary.api.models.manifold.ManifoldCreateParams
import com.unifieddatalibrary.api.models.manifold.ManifoldGetParams
import com.unifieddatalibrary.api.models.manifold.ManifoldTupleParams
import com.unifieddatalibrary.api.models.manifold.ManifoldUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManifoldServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldServiceAsync = client.manifold()

        val future =
            manifoldServiceAsync.create(
                ManifoldCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(ManifoldCreateParams.DataMode.TEST)
                    .idObjectOfInterest("OBJECTOFINTEREST-ID")
                    .source("Bluestaq")
                    .id("MANIFOLD-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deltaT(10.23)
                    .deltaV(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .status("PENDING")
                    .weight(0.3)
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
        val manifoldServiceAsync = client.manifold()

        val future =
            manifoldServiceAsync.update(
                ManifoldUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(ManifoldUpdateParams.DataMode.TEST)
                    .idObjectOfInterest("OBJECTOFINTEREST-ID")
                    .source("Bluestaq")
                    .bodyId("MANIFOLD-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deltaT(10.23)
                    .deltaV(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .status("PENDING")
                    .weight(0.3)
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
        val manifoldServiceAsync = client.manifold()

        val pageFuture = manifoldServiceAsync.list()

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
        val manifoldServiceAsync = client.manifold()

        val future = manifoldServiceAsync.delete("id")

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
        val manifoldServiceAsync = client.manifold()

        val responseFuture =
            manifoldServiceAsync.count(
                ManifoldCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val manifoldServiceAsync = client.manifold()

        val future =
            manifoldServiceAsync.createBulk(
                ManifoldCreateBulkParams.builder()
                    .addBody(
                        ManifoldCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                            .idObjectOfInterest("OBJECTOFINTEREST-ID")
                            .source("Bluestaq")
                            .id("MANIFOLD-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .deltaT(10.23)
                            .deltaV(10.23)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .status("PENDING")
                            .weight(0.3)
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
        val manifoldServiceAsync = client.manifold()

        val manifoldFuture =
            manifoldServiceAsync.get(
                ManifoldGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val manifold = manifoldFuture.get()
        manifold.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldServiceAsync = client.manifold()

        val responseFuture = manifoldServiceAsync.queryhelp()

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
        val manifoldServiceAsync = client.manifold()

        val responseFuture =
            manifoldServiceAsync.tuple(
                ManifoldTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
