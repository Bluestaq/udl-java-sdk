// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCountParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateBulkParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkCreateParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkGetParams
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OperatingunitremarkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val future =
            operatingunitremarkServiceAsync.create(
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
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val pageFuture = operatingunitremarkServiceAsync.list()

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
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val responseFuture =
            operatingunitremarkServiceAsync.count(
                OperatingunitremarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val future =
            operatingunitremarkServiceAsync.createBulk(
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
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val operatingUnitRemarkFullFuture =
            operatingunitremarkServiceAsync.get(
                OperatingunitremarkGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val operatingUnitRemarkFull = operatingUnitRemarkFullFuture.get()
        operatingUnitRemarkFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val responseFuture = operatingunitremarkServiceAsync.queryhelp()

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
        val operatingunitremarkServiceAsync = client.operatingunitremark()

        val operatingUnitRemarkFullsFuture =
            operatingunitremarkServiceAsync.tuple(
                OperatingunitremarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val operatingUnitRemarkFulls = operatingUnitRemarkFullsFuture.get()
        operatingUnitRemarkFulls.forEach { it.validate() }
    }
}
