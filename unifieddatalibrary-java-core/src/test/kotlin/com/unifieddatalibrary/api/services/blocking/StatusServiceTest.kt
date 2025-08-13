// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class StatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        statusService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        statusService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        val page = statusService.list()

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
        val statusService = client.status()

        statusService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        statusService.count(StatusCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        val statusFull =
            statusService.get(
                StatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        statusFull.validate()
    }

    @Test
    fun getByEntityId() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        val statusFulls =
            statusService.getByEntityId(
                StatusGetByEntityIdParams.builder()
                    .idEntity("idEntity")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        statusFulls.forEach { it.validate() }
    }

    @Test
    fun getByEntityType() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        val statusFulls =
            statusService.getByEntityType(
                StatusGetByEntityTypeParams.builder()
                    .entityType("entityType")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        statusFulls.forEach { it.validate() }
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val statusService = client.status()

        val response = statusService.queryhelp()

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
        val statusService = client.status()

        val statusFulls =
            statusService.tuple(
                StatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        statusFulls.forEach { it.validate() }
    }
}
