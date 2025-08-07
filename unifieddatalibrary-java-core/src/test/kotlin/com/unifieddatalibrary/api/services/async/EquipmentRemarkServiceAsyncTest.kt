// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateBulkParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkRetrieveParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EquipmentRemarkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val future =
            equipmentRemarkServiceAsync.create(
                EquipmentRemarkCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EquipmentRemarkCreateParams.DataMode.TEST)
                    .idEquipment("EQUIPMENT-ID")
                    .source("Bluestaq")
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
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val equipmentRemarkFullFuture =
            equipmentRemarkServiceAsync.retrieve(
                EquipmentRemarkRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val equipmentRemarkFull = equipmentRemarkFullFuture.get()
        equipmentRemarkFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val pageFuture = equipmentRemarkServiceAsync.list()

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
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val responseFuture =
            equipmentRemarkServiceAsync.count(
                EquipmentRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val future =
            equipmentRemarkServiceAsync.createBulk(
                EquipmentRemarkCreateBulkParams.builder()
                    .addBody(
                        EquipmentRemarkCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EquipmentRemarkCreateBulkParams.Body.DataMode.TEST)
                            .idEquipment("EQUIPMENT-ID")
                            .source("Bluestaq")
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
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val responseFuture = equipmentRemarkServiceAsync.queryHelp()

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
        val equipmentRemarkServiceAsync = client.equipmentRemarks()

        val equipmentRemarkFullsFuture =
            equipmentRemarkServiceAsync.tuple(
                EquipmentRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val equipmentRemarkFulls = equipmentRemarkFullsFuture.get()
        equipmentRemarkFulls.forEach { it.validate() }
    }
}
