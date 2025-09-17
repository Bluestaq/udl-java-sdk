// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.beam.BeamCountParams
import com.unifieddatalibrary.api.models.beam.BeamCreateParams
import com.unifieddatalibrary.api.models.beam.BeamRetrieveParams
import com.unifieddatalibrary.api.models.beam.BeamTupleParams
import com.unifieddatalibrary.api.models.beam.BeamUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeamServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamServiceAsync = client.beam()

        val future =
            beamServiceAsync.create(
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
        val beamServiceAsync = client.beam()

        val beamFullFuture =
            beamServiceAsync.retrieve(
                BeamRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val beamFull = beamFullFuture.get()
        beamFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamServiceAsync = client.beam()

        val future =
            beamServiceAsync.update(
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
        val beamServiceAsync = client.beam()

        val pageFuture = beamServiceAsync.list()

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
        val beamServiceAsync = client.beam()

        val future = beamServiceAsync.delete("id")

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
        val beamServiceAsync = client.beam()

        val responseFuture =
            beamServiceAsync.count(BeamCountParams.builder().firstResult(0L).maxResults(0L).build())

        val response = responseFuture.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamServiceAsync = client.beam()

        val responseFuture = beamServiceAsync.queryHelp()

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
        val beamServiceAsync = client.beam()

        val beamFullsFuture =
            beamServiceAsync.tuple(
                BeamTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        val beamFulls = beamFullsFuture.get()
        beamFulls.forEach { it.validate() }
    }
}
