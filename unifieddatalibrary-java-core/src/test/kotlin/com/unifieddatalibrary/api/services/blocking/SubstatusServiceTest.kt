// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.SubStatusIngest
import com.unifieddatalibrary.api.models.substatus.SubstatusCountParams
import com.unifieddatalibrary.api.models.substatus.SubstatusCreateParams
import com.unifieddatalibrary.api.models.substatus.SubstatusGetParams
import com.unifieddatalibrary.api.models.substatus.SubstatusTupleParams
import com.unifieddatalibrary.api.models.substatus.SubstatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubstatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val substatusService = client.substatus()

        substatusService.create(
            SubstatusCreateParams.builder()
                .subStatusIngest(
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
        val substatusService = client.substatus()

        substatusService.update(
            SubstatusUpdateParams.builder()
                .pathId("id")
                .subStatusIngest(
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
        val substatusService = client.substatus()

        val page = substatusService.list()

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
        val substatusService = client.substatus()

        substatusService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val substatusService = client.substatus()

        substatusService.count(
            SubstatusCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val substatusService = client.substatus()

        val subStatusFull =
            substatusService.get(
                SubstatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        subStatusFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val substatusService = client.substatus()

        val response = substatusService.queryhelp()

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
        val substatusService = client.substatus()

        val subStatusFulls =
            substatusService.tuple(
                SubstatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        subStatusFulls.forEach { it.validate() }
    }
}
