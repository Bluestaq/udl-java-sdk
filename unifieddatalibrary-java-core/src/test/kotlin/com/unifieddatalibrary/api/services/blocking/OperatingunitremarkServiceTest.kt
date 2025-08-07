// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OperatingunitremarkServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitremarkService = client.operatingunitremark()

        operatingunitremarkService.create(
            OperatingunitremarkCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OperatingunitremarkCreateParams.DataMode.TEST)
                .idOperatingUnit("OperatingUnit-ID")
                .source("some.user")
                .text("This is a remark")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altRmkId("123456ABC")
                .code("M")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .name("Remark name")
                .origin("THIRD_PARTY_DATASOURCE")
                .type("Restriction")
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
        val operatingunitremarkService = client.operatingunitremark()

        val page = operatingunitremarkService.list()

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
        val operatingunitremarkService = client.operatingunitremark()

        operatingunitremarkService.count(
            OperatingunitremarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val operatingunitremarkService = client.operatingunitremark()

        operatingunitremarkService.createBulk(
            OperatingunitremarkCreateBulkParams.builder()
                .addBody(
                    OperatingunitremarkCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OperatingunitremarkCreateBulkParams.Body.DataMode.TEST)
                        .idOperatingUnit("OperatingUnit-ID")
                        .source("some.user")
                        .text("This is a remark")
                        .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                        .altRmkId("123456ABC")
                        .code("M")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .name("Remark name")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .type("Restriction")
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
        val operatingunitremarkService = client.operatingunitremark()

        val operatingUnitRemarkFull =
            operatingunitremarkService.get(
                OperatingunitremarkGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        operatingUnitRemarkFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitremarkService = client.operatingunitremark()

        val response = operatingunitremarkService.queryhelp()

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
        val operatingunitremarkService = client.operatingunitremark()

        val operatingUnitRemarkFulls =
            operatingunitremarkService.tuple(
                OperatingunitremarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        operatingUnitRemarkFulls.forEach { it.validate() }
    }
}
