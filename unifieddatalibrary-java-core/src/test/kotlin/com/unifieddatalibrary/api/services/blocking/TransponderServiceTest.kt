// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.transponder.TransponderCountParams
import com.unifieddatalibrary.api.models.transponder.TransponderCreateParams
import com.unifieddatalibrary.api.models.transponder.TransponderGetParams
import com.unifieddatalibrary.api.models.transponder.TransponderTupleParams
import com.unifieddatalibrary.api.models.transponder.TransponderUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransponderServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val transponderService = client.transponder()

        transponderService.create(
            TransponderCreateParams.builder()
                .classificationMarking("U")
                .dataMode(TransponderCreateParams.DataMode.TEST)
                .idComm("REF-COMM-ID")
                .source("Bluestaq")
                .id("TRANSPONDER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fec(0)
                .format("format")
                .modulation("Auto")
                .name("AA10")
                .nid("N-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .symbolRate(4.0)
                .system("DVB-S")
                .tid("T-ID")
                .ttf(1.53261520047876)
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
        val transponderService = client.transponder()

        transponderService.update(
            TransponderUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(TransponderUpdateParams.DataMode.TEST)
                .idComm("REF-COMM-ID")
                .source("Bluestaq")
                .bodyId("TRANSPONDER-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fec(0)
                .format("format")
                .modulation("Auto")
                .name("AA10")
                .nid("N-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .symbolRate(4.0)
                .system("DVB-S")
                .tid("T-ID")
                .ttf(1.53261520047876)
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
        val transponderService = client.transponder()

        val page = transponderService.list()

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
        val transponderService = client.transponder()

        transponderService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val transponderService = client.transponder()

        transponderService.count(
            TransponderCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val transponderService = client.transponder()

        val transponder =
            transponderService.get(
                TransponderGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        transponder.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val transponderService = client.transponder()

        val response = transponderService.queryhelp()

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
        val transponderService = client.transponder()

        val response =
            transponderService.tuple(
                TransponderTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
