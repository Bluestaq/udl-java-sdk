// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateBulkParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCreateParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkRetrieveParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EquipmentRemarkServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkService = client.equipmentRemarks()

        equipmentRemarkService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkService = client.equipmentRemarks()

        val equipmentRemarkFull =
            equipmentRemarkService.retrieve(
                EquipmentRemarkRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        equipmentRemarkFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkService = client.equipmentRemarks()

        val page = equipmentRemarkService.list()

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
        val equipmentRemarkService = client.equipmentRemarks()

        equipmentRemarkService.count(
            EquipmentRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val equipmentRemarkService = client.equipmentRemarks()

        equipmentRemarkService.createBulk(
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
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentRemarkService = client.equipmentRemarks()

        val response = equipmentRemarkService.queryHelp()

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
        val equipmentRemarkService = client.equipmentRemarks()

        val equipmentRemarkFulls =
            equipmentRemarkService.tuple(
                EquipmentRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        equipmentRemarkFulls.forEach { it.validate() }
    }
}
