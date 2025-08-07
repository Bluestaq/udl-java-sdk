// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCountParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfBandTypeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandTypeServiceAsync = client.rfBandType()

        val future =
            rfBandTypeServiceAsync.create(
                RfBandTypeCreateParams.builder()
                    .id("Ku")
                    .classificationMarking("U")
                    .dataMode(RfBandTypeCreateParams.DataMode.TEST)
                    .description("Example description")
                    .source("Bluestaq")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endFreq(123.4)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .startFreq(123.4)
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
        val rfBandTypeServiceAsync = client.rfBandType()

        val future =
            rfBandTypeServiceAsync.update(
                RfBandTypeUpdateParams.builder()
                    .pathId("id")
                    .bodyId("Ku")
                    .classificationMarking("U")
                    .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
                    .description("Example description")
                    .source("Bluestaq")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endFreq(123.4)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .startFreq(123.4)
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
        val rfBandTypeServiceAsync = client.rfBandType()

        val pageFuture = rfBandTypeServiceAsync.list()

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
        val rfBandTypeServiceAsync = client.rfBandType()

        val future = rfBandTypeServiceAsync.delete("id")

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
        val rfBandTypeServiceAsync = client.rfBandType()

        val responseFuture =
            rfBandTypeServiceAsync.count(
                RfBandTypeCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val rfBandTypeServiceAsync = client.rfBandType()

        val rfBandTypeFuture =
            rfBandTypeServiceAsync.get(
                RfBandTypeGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val rfBandType = rfBandTypeFuture.get()
        rfBandType.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandTypeServiceAsync = client.rfBandType()

        val responseFuture = rfBandTypeServiceAsync.queryhelp()

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
        val rfBandTypeServiceAsync = client.rfBandType()

        val responseFuture =
            rfBandTypeServiceAsync.tuple(
                RfBandTypeTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
