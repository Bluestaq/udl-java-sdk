// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.SubStatusIngest
import com.unifieddatalibrary.api.models.status.StatusCountParams
import com.unifieddatalibrary.api.models.status.StatusCreateParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityIdParams
import com.unifieddatalibrary.api.models.status.StatusGetByEntityTypeParams
import com.unifieddatalibrary.api.models.status.StatusGetParams
import com.unifieddatalibrary.api.models.status.StatusTupleParams
import com.unifieddatalibrary.api.models.status.StatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusServiceAsync = client.status()

        val future =
            statusServiceAsync.create(
                StatusCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(StatusCreateParams.DataMode.TEST)
                    .idEntity("ENTITY-ID")
                    .source("Bluestaq")
                    .id("STATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                    .declassificationString("U")
                    .derivedFrom("SOME_SOURCE")
                    .notes("Example Notes")
                    .opsCap(StatusCreateParams.OpsCap.FMC)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("TST1")
                    .state(StatusCreateParams.State.ACTIVE)
                    .addSubStatusCollection(
                        SubStatusIngest.builder()
                            .classificationMarking("U")
                            .dataMode(SubStatusIngest.DataMode.TEST)
                            .notes("Sample Notes")
                            .source("Bluestaq")
                            .status(SubStatusIngest.Status.FMC)
                            .statusId("REF-STATUS-ID")
                            .type(SubStatusIngest.Type.MD_CAP)
                            .id("SUBSTATUS-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("TST1")
                            .build()
                    )
                    .sysCap(StatusCreateParams.SysCap.FMC)
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
        val statusServiceAsync = client.status()

        val future =
            statusServiceAsync.update(
                StatusUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(StatusUpdateParams.DataMode.TEST)
                    .idEntity("ENTITY-ID")
                    .source("Bluestaq")
                    .bodyId("STATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                    .declassificationString("U")
                    .derivedFrom("SOME_SOURCE")
                    .notes("Example Notes")
                    .opsCap(StatusUpdateParams.OpsCap.FMC)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("TST1")
                    .state(StatusUpdateParams.State.ACTIVE)
                    .addSubStatusCollection(
                        SubStatusIngest.builder()
                            .classificationMarking("U")
                            .dataMode(SubStatusIngest.DataMode.TEST)
                            .notes("Sample Notes")
                            .source("Bluestaq")
                            .status(SubStatusIngest.Status.FMC)
                            .statusId("REF-STATUS-ID")
                            .type(SubStatusIngest.Type.MD_CAP)
                            .id("SUBSTATUS-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("TST1")
                            .build()
                    )
                    .sysCap(StatusUpdateParams.SysCap.FMC)
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
        val statusServiceAsync = client.status()

        val pageFuture = statusServiceAsync.list()

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
        val statusServiceAsync = client.status()

        val future = statusServiceAsync.delete("id")

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
        val statusServiceAsync = client.status()

        val responseFuture =
            statusServiceAsync.count(
                StatusCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusServiceAsync = client.status()

        val statusFullFuture =
            statusServiceAsync.get(
                StatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val statusFull = statusFullFuture.get()
        statusFull.validate()
    }

    @Test
    fun getByEntityId() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusServiceAsync = client.status()

        val statusFullsFuture =
            statusServiceAsync.getByEntityId(
                StatusGetByEntityIdParams.builder()
                    .idEntity("idEntity")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val statusFulls = statusFullsFuture.get()
        statusFulls.forEach { it.validate() }
    }

    @Test
    fun getByEntityType() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusServiceAsync = client.status()

        val statusFullsFuture =
            statusServiceAsync.getByEntityType(
                StatusGetByEntityTypeParams.builder()
                    .entityType("entityType")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val statusFulls = statusFullsFuture.get()
        statusFulls.forEach { it.validate() }
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusServiceAsync = client.status()

        val responseFuture = statusServiceAsync.queryhelp()

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
        val statusServiceAsync = client.status()

        val statusFullsFuture =
            statusServiceAsync.tuple(
                StatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val statusFulls = statusFullsFuture.get()
        statusFulls.forEach { it.validate() }
    }
}
