// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.channels.ChannelCountParams
import com.unifieddatalibrary.api.models.channels.ChannelCreateParams
import com.unifieddatalibrary.api.models.channels.ChannelRetrieveParams
import com.unifieddatalibrary.api.models.channels.ChannelTupleParams
import com.unifieddatalibrary.api.models.channels.ChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelServiceAsync = client.channels()

        val future =
            channelServiceAsync.create(
                ChannelCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(ChannelCreateParams.DataMode.TEST)
                    .idTransponder("REF-TRANSPONDER-ID")
                    .name("Example name")
                    .source("system.source")
                    .id("CHANNEL-ID")
                    .apid("AP-ID")
                    .beamName("B8VD")
                    .compression("Example compression")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .encryption("Example encryption")
                    .idBeam("REF-BEAM-ID")
                    .idRfBand("REF-RFBAND-ID")
                    .origin("example_origin")
                    .origNetwork("OPS1")
                    .owner("example_owner")
                    .pkg("Example pkg")
                    .res("Example res")
                    .sid("S-ID")
                    .type("Example type")
                    .vpid("VP-ID")
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
        val channelServiceAsync = client.channels()

        val channelFullFuture =
            channelServiceAsync.retrieve(
                ChannelRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val channelFull = channelFullFuture.get()
        channelFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelServiceAsync = client.channels()

        val future =
            channelServiceAsync.update(
                ChannelUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(ChannelUpdateParams.DataMode.TEST)
                    .idTransponder("REF-TRANSPONDER-ID")
                    .name("Example name")
                    .source("system.source")
                    .bodyId("CHANNEL-ID")
                    .apid("AP-ID")
                    .beamName("B8VD")
                    .compression("Example compression")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .encryption("Example encryption")
                    .idBeam("REF-BEAM-ID")
                    .idRfBand("REF-RFBAND-ID")
                    .origin("example_origin")
                    .origNetwork("OPS1")
                    .owner("example_owner")
                    .pkg("Example pkg")
                    .res("Example res")
                    .sid("S-ID")
                    .type("Example type")
                    .vpid("VP-ID")
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
        val channelServiceAsync = client.channels()

        val pageFuture = channelServiceAsync.list()

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
        val channelServiceAsync = client.channels()

        val future = channelServiceAsync.delete("id")

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
        val channelServiceAsync = client.channels()

        val responseFuture =
            channelServiceAsync.count(
                ChannelCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelServiceAsync = client.channels()

        val responseFuture = channelServiceAsync.queryhelp()

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
        val channelServiceAsync = client.channels()

        val channelFullsFuture =
            channelServiceAsync.tuple(
                ChannelTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val channelFulls = channelFullsFuture.get()
        channelFulls.forEach { it.validate() }
    }
}
