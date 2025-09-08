// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class SubstatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val substatusServiceAsync = client.substatus()

        val future =
            substatusServiceAsync.create(
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
                            .origNetwork("OPS1")
                            .build()
                    )
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
        val substatusServiceAsync = client.substatus()

        val future =
            substatusServiceAsync.update(
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
                            .origNetwork("OPS1")
                            .build()
                    )
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
        val substatusServiceAsync = client.substatus()

        val pageFuture = substatusServiceAsync.list()

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
        val substatusServiceAsync = client.substatus()

        val future = substatusServiceAsync.delete("id")

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
        val substatusServiceAsync = client.substatus()

        val responseFuture =
            substatusServiceAsync.count(
                SubstatusCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val substatusServiceAsync = client.substatus()

        val subStatusFullFuture =
            substatusServiceAsync.get(
                SubstatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val subStatusFull = subStatusFullFuture.get()
        subStatusFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val substatusServiceAsync = client.substatus()

        val responseFuture = substatusServiceAsync.queryhelp()

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
        val substatusServiceAsync = client.substatus()

        val subStatusFullsFuture =
            substatusServiceAsync.tuple(
                SubstatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val subStatusFulls = subStatusFullsFuture.get()
        subStatusFulls.forEach { it.validate() }
    }
}
