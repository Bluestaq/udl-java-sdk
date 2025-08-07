// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class ManifoldServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        manifoldService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        manifoldService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        val page = manifoldService.list()

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
        val manifoldService = client.manifold()

        manifoldService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        manifoldService.count(ManifoldCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        manifoldService.createBulk(
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
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        val manifold =
            manifoldService.get(
                ManifoldGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        manifold.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val manifoldService = client.manifold()

        val response = manifoldService.queryhelp()

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
        val manifoldService = client.manifold()

        val response =
            manifoldService.tuple(
                ManifoldTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
