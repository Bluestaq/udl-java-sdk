// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeamServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamService = client.beam()

        beamService.create(
            BeamCreateParams.builder()
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
        val beamService = client.beam()

        val beamFull =
            beamService.retrieve(
                BeamRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        beamFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamService = client.beam()

        beamService.update(
            BeamUpdateParams.builder()
                .pathId("id")
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .bodyId("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
        val beamService = client.beam()

        val page = beamService.list()

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
        val beamService = client.beam()

        beamService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamService = client.beam()

        beamService.count(BeamCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamService = client.beam()

        val response = beamService.queryHelp()

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
        val beamService = client.beam()

        val beamFulls =
            beamService.tuple(
                BeamTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        beamFulls.forEach { it.validate() }
    }
}
