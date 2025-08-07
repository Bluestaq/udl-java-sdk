// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCountParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateBulkParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprCreateParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprGetParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprListParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprTupleParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sortieppr.SortiePprUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SortiePprServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sortiePprServiceAsync = client.sortiePpr()

        val future =
            sortiePprServiceAsync.create(
                SortiePprCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SortiePprCreateParams.DataMode.TEST)
                    .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                    .source("Bluestaq")
                    .id("SORTIEPPR-ID")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalId("aa714f4d52a37ab1a00b21af9566e379")
                    .grantor("SMITH")
                    .number("07-21-07W")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .remarks("PPR remark")
                    .requestor("jsmith1")
                    .sourceDl("AXE")
                    .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .type(SortiePprCreateParams.Type.M)
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
        val sortiePprServiceAsync = client.sortiePpr()

        val future =
            sortiePprServiceAsync.update(
                SortiePprUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SortiePprUpdateParams.DataMode.TEST)
                    .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                    .source("Bluestaq")
                    .bodyId("SORTIEPPR-ID")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalId("aa714f4d52a37ab1a00b21af9566e379")
                    .grantor("SMITH")
                    .number("07-21-07W")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .remarks("PPR remark")
                    .requestor("jsmith1")
                    .sourceDl("AXE")
                    .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .type(SortiePprUpdateParams.Type.M)
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
        val sortiePprServiceAsync = client.sortiePpr()

        val pageFuture =
            sortiePprServiceAsync.list(SortiePprListParams.builder().idSortie("idSortie").build())

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
        val sortiePprServiceAsync = client.sortiePpr()

        val future = sortiePprServiceAsync.delete("id")

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
        val sortiePprServiceAsync = client.sortiePpr()

        val responseFuture =
            sortiePprServiceAsync.count(
                SortiePprCountParams.builder()
                    .idSortie("idSortie")
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
        val sortiePprServiceAsync = client.sortiePpr()

        val future =
            sortiePprServiceAsync.createBulk(
                SortiePprCreateBulkParams.builder()
                    .addBody(
                        SortiePprCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(SortiePprCreateBulkParams.Body.DataMode.TEST)
                            .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                            .source("Bluestaq")
                            .id("SORTIEPPR-ID")
                            .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .externalId("aa714f4d52a37ab1a00b21af9566e379")
                            .grantor("SMITH")
                            .number("07-21-07W")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .remarks("PPR remark")
                            .requestor("jsmith1")
                            .sourceDl("AXE")
                            .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .type(SortiePprCreateBulkParams.Body.Type.M)
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
        val sortiePprServiceAsync = client.sortiePpr()

        val sortiePprFullFuture =
            sortiePprServiceAsync.get(
                SortiePprGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val sortiePprFull = sortiePprFullFuture.get()
        sortiePprFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sortiePprServiceAsync = client.sortiePpr()

        val responseFuture = sortiePprServiceAsync.queryhelp()

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
        val sortiePprServiceAsync = client.sortiePpr()

        val sortiePprFullsFuture =
            sortiePprServiceAsync.tuple(
                SortiePprTupleParams.builder()
                    .columns("columns")
                    .idSortie("idSortie")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val sortiePprFulls = sortiePprFullsFuture.get()
        sortiePprFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sortiePprServiceAsync = client.sortiePpr()

        val future =
            sortiePprServiceAsync.unvalidatedPublish(
                SortiePprUnvalidatedPublishParams.builder()
                    .addBody(
                        SortiePprUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
                            .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                            .source("Bluestaq")
                            .id("SORTIEPPR-ID")
                            .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .externalId("aa714f4d52a37ab1a00b21af9566e379")
                            .grantor("SMITH")
                            .number("07-21-07W")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .remarks("PPR remark")
                            .requestor("jsmith1")
                            .sourceDl("AXE")
                            .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .type(SortiePprUnvalidatedPublishParams.Body.Type.M)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
